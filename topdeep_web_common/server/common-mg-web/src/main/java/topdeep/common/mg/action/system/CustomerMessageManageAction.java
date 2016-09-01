package topdeep.common.mg.action.system;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.db.SystemParam;
import topdeep.common.entity.db.SystemParamKey;
import topdeep.common.entity.db.SystemVisitMessage;
import topdeep.common.entity.db.SystemVisitMessageExample;
import topdeep.common.entity.db.SystemVisitMessageExample.Criteria;
import topdeep.common.mg.action.base.BaseAction;
import topdeep.common.mg.entity.PrivilegeConfig;
import topdeep.common.mg.entity.request.CustomerMessageRequest;
import topdeep.common.mg.entity.request.ParamRequest;
import topdeep.common.mg.entity.request.SampleRequest;
import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.response.CustomerMessageResponse;
import topdeep.common.mg.entity.response.ParamResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/system")
public class CustomerMessageManageAction extends BaseAction{

	@TopdeepMethodAttribute(loginRequired = false)
	@RequestMapping(value = "customerMessageManage", method = {
		RequestMethod.GET
	})
	public String execute(SampleRequest req, Model model) throws Exception {
		BaseResponse res = new BaseResponse();
		super.execute(req, res);
		model.addAttribute("res", res);
		checkPrivilege(res, PrivilegeConfig.FUNC_CUSTOMER_MESSAGE_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		return res.getTarget("/system/customer-message-manage-success");
	}
	
	/**
	 * ajax客户留言查询
	 * @param req
	 * @param model
	 * @return
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true,loginRequired = false)
	@RequestMapping(value="/customerMessageManage!ajaxQuery")
	@ResponseBody
	public CustomerMessageResponse ajaxQuery(CustomerMessageRequest req) {
		CustomerMessageResponse res = new CustomerMessageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CUSTOMER_MESSAGE_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			SystemVisitMessageExample example=new SystemVisitMessageExample();
			Criteria criteria1 = example.or();
			Criteria criteria2 = example.or();
			Criteria criteria3 = example.or();
			Criteria criteria4 = example.or();
			Criteria criteria5 = example.or();
			Criteria criteria6 = example.or();
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				criteria1.andTitleLike("%"+req.getSearchKeyword()+"%");
				criteria2.andMessageLike("%"+req.getSearchKeyword()+"%");
				criteria3.andNicknameLike("%"+req.getSearchKeyword()+"%");
				criteria4.andCustomerNoLike("%"+req.getSearchKeyword()+"%");
				criteria5.andTelephoneLike("%"+req.getSearchKeyword()+"%");
				criteria6.andReplyerLike("%"+req.getSearchKeyword()+"%");
			}
			if (!StringUtils.isNullOrEmpty(req.getSystemVisitMessage().getReplyStatus())) {
				criteria1.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
				criteria2.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
				criteria3.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
				criteria4.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
				criteria5.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
				criteria6.andReplyStatusEqualTo(req.getSystemVisitMessage().getReplyStatus());
			}
			if (!StringUtils.isNullOrEmpty(req.getSystemVisitMessage().getAuditState())) {
				criteria1.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
				criteria2.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
				criteria3.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
				criteria4.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
				criteria5.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
				criteria6.andAuditStateEqualTo(req.getSystemVisitMessage().getAuditState());
			}
			List<SystemVisitMessage> systemVisitMessageList = null;
			try{
				example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
				systemVisitMessageList = commonMgSystemBiz.systemVisitMessageSelectObjects(example);
				int count = commonMgSystemBiz.systemVisitMessageQuerySelectObjectsCount(example);
				res.setSystemVisitMessageList(systemVisitMessageList);
				if(!systemVisitMessageList.isEmpty())
				{
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				}
				else
				{
					res.getPageData().setPageInfo(0, 0, 0);
				}
				res.setSuccess(true);
			}catch(CacheException e){
				logger.error("customerMessageManage!ajaxQuery error: " + e.getMessage(), e);
				res.setResult(false, "客户留言查询失败");
			}
			res.setTitle("客户留言查询");
		}
	    return res;
	}
	
	
	/**
	 * ajax客户留言修改
	 * @param req
	 * @param model
	 * @return
	 * @throws CacheException
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true,loginRequired = false)
	@RequestMapping(value="/customerMessageManage!ajaxSave")
	@ResponseBody
	public CustomerMessageResponse ajaxSave(CustomerMessageRequest req) {
		CustomerMessageResponse res = new CustomerMessageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CUSTOMER_MESSAGE_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			req.checkId(res);
		}
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			try {
				SystemVisitMessage svm = commonMgSystemBiz.systemVisitMessageSelectByPrimaryKey(req.getSystemVisitMessage().getId());
				if(svm!= null ){
					svm.setReplyContent(req.getSystemVisitMessage().getReplyContent());
					svm.setReplyer(req.getSystemVisitMessage().getReplyer());
					svm.setModifyTime(new Date());
					svm.setReplyTime(new Date());
					if(!req.getSystemVisitMessage().getReplyContent().equals("")){
						svm.setReplyStatus("1");
					}else{
						svm.setReplyStatus("0");
					}
					commonMgSystemBiz.systemVisitMessageUpdate(svm);
				}
			} catch (CacheException e) {
				logger.error("paramManage!ajaxSave error: " + e.getMessage(), e);
				res.setResult(false, "系统参数保存失败");
			}
			res.setTitle("客户留言修改");
		}
		return res;
	}
	
	/**
	 * ajax客户留言修改
	 * @param req
	 * @param model
	 * @return
	 * @throws CacheException
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true,loginRequired = false)
	@RequestMapping(value="/customerMessageManage!ajaxUpdateAduit")
	@ResponseBody
	public CustomerMessageResponse ajaxUpdateAduit(CustomerMessageRequest req) {
		CustomerMessageResponse res = new CustomerMessageResponse();
		checkPrivilege(res, PrivilegeConfig.FUNC_CUSTOMER_MESSAGE_MANAGE, PrivilegeOperate.Audit);
		if (res.isSuccess()) {
			req.checkId(res);
		}
		if (res.isSuccess()) {
			super.execute(req, res);
		}
		if (res.isSuccess()) {
			try {
				SystemVisitMessage svm = commonMgSystemBiz.systemVisitMessageSelectByPrimaryKey(req.getSystemVisitMessage().getId());
				if(svm!= null ){
					svm.setAuditState(req.getSystemVisitMessage().getAuditState());
					svm.setAuditTime(new Date());
					commonMgSystemBiz.systemVisitMessageUpdate(svm);
				}
			} catch (CacheException e) {
				logger.error("paramManage!ajaxSave error: " + e.getMessage(), e);
				res.setResult(false, "审核失败");
			}
			res.setTitle("客户留言修改");
		}
		return res;
	}
}
