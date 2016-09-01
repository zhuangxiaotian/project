/**
 * 
 */
package topdeep.commonfund.mg.action.fund;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.entity.db.FundCustMessage;
import topdeep.commonfund.entity.db.FundCustMessageExample;
import topdeep.commonfund.entity.db.FundCustMessageExample.Criteria;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.Constants;
import topdeep.commonfund.mg.entity.EnumType;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.NoticeRequest;
import topdeep.commonfund.mg.entity.response.NoticeResponse;
import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 增加公告通知功能
 * 
 * @author mingrs
 *
 */
@Controller
@RequestMapping(value = {
	"/fund_notice"
})
public class NoticeManageAction extends BaseAction {

	/*
	 * 公告通知管理跳转页面
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/noticeManage")
	public String execute(NoticeRequest req, Model model) {
		NoticeResponse res = new NoticeResponse();
		super.execute(req, res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_NOTICE_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		model.addAttribute("res", res);
		if (res.isSuccess()) {
			return res.getTarget("/notice/notice-success");
		}
		return "";
	}

	/*
	 * ajax公告通知查询
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/noticeManage!ajaxQuery")
	@ResponseBody
	public NoticeResponse ajaxQuery(NoticeRequest req) {
		NoticeResponse res = new NoticeResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_NOTICE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundCustMessageExample example = new FundCustMessageExample();
			Criteria criteria = example.createCriteria();
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				criteria.andMessageTitleLike("%" + req.getSearchKeyword() + "%");
			}
			List<String> typeList = new ArrayList<String>();
			typeList.add(EnumType.FundCustMessageType.SystemMessage.getValue());
			typeList.add(EnumType.FundCustMessageType.TransactionMessage.getValue());
			criteria.andCreateIdEqualTo(this.webUserRuntimeBiz.getLoginUserId()).andMessageTypeIn(typeList);
			List<FundCustMessage> fundCustMessageList = null;
			example.setOrderByClause("modify_time desc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {

				int count = fundSystemBiz.fundCustMessageQuerySelectObjectsCount(example);
				if (count > 0) {
					fundCustMessageList = this.fundSystemBiz.fundCustMessageSelectObjects(example);
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
					res.setFundCustMessageList(fundCustMessageList);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setSuccess(true);
				res.setTitle("公告通知查询");
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "公告通知查询失败");
			}
		}
		return res;
	}

	/*
	 * ajax公告通知修改保存
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/noticeManage!ajaxSave")
	@ResponseBody
	public NoticeResponse ajaxSave(NoticeRequest req) {
		NoticeResponse res = new NoticeResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_NOTICE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInput(res, req);
		}
		if (res.isSuccess()) {
			try {
				String adminId = this.webUserRuntimeBiz.getLoginUserId();
				String adminName = this.webUserRuntimeBiz.getLoginUserName();
				Date date = new Date();
				FundCustMessage message = new FundCustMessage();
				
				message.setModifyTime(date);
				message.setIdNo("******");
				message.setIdType("*");
				message.setMessageContent(req.getContent());
				message.setMessageTitle(req.getTitle());
				message.setPublishTime(req.getDate());
				message.setRowVersion(Constants.ROW_VERSION);
				message.setMessageType(req.getType());
				message.setShowChannel(req.getChannel());
				message.setAuditState(EnumType.AuditState.NotAudited.getValue());
				if (StringUtils.isNullOrEmpty(req.getId())) {
					message.setId(UUIDGenerator.getUUID24());
					message.setCreateId(adminId);
					message.setCreateTime(date);
					message.setCreateName(adminName);
					this.fundSystemBiz.fundCustMessageInsert(message);
				}else{
					message.setId(req.getId());
					message.setModifyId(adminId);
					message.setModifyName(adminName);
					FundCustMessageExample example = new FundCustMessageExample();
					example.or().andIdEqualTo(req.getId()).andCreateIdEqualTo(adminId);
					this.fundSystemBiz.fundCustMessageUpdateSelectiveByCondition(message, example);
				}
				res.setResult(true, "公告通知修改或保存成功");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "公告通知修改或保存失败");
			}
		}
		return res;
	}

	/*
	 * ajax公告通知审核
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/noticeManage!ajaxAudit")
	@ResponseBody
	public NoticeResponse ajaxAudit(NoticeRequest req) {
		NoticeResponse res = new NoticeResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_NOTICE_MANAGE, PrivilegeOperate.Audit);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			if (req.getIdList() == null || StringUtils.isNullOrEmpty(req.getAuditState())) {
				res.setResult(false, "公告通知审核失败");
			}
		}
		if (res.isSuccess()) {
			try {
				List<String> list = new ArrayList<String>();
				String[] ids = req.getIdList().split(",");
				for (String id : ids) {
					list.add(id);
				}
				String adminId = this.webUserRuntimeBiz.getLoginUserId();
				String adminName = this.webUserRuntimeBiz.getLoginUserName();
				Date date = new Date();
				FundCustMessageExample example = new FundCustMessageExample();
				example.or().andIdIn(list);
				FundCustMessage message = new FundCustMessage();
				message.setAuditState(req.getAuditState());
				message.setAuditId(adminId);
				message.setAuditName(adminName);
				message.setAuditTime(date);
				message.setModifyId(adminId);
				message.setModifyName(adminName);
				message.setModifyTime(date);
				this.fundSystemBiz.fundCustMessageUpdateSelectiveByCondition(message, example);
				res.setResult(true, "公告通知审核成功");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "直销交易渠道删除失败");
			}
		}
		return res;
	}
}
