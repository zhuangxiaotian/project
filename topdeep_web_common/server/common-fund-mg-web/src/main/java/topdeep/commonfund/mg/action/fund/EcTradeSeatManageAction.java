/**
 * 
 */
package topdeep.commonfund.mg.action.fund;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.entity.db.FundEcTradeSeat;
import topdeep.commonfund.entity.db.FundEcTradeSeatExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.EcTradeSeatRequest;
import topdeep.commonfund.mg.entity.response.EcTradeSeatResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.web.annotation.TopdeepMethodAttribute;

/**
 * 完成直销交易渠道管理功能 站点管理着很多和发布相关的属性，比如生成的目标文件夹之类的属性
 * 
 * @author niexin
 *
 */
@Controller
@RequestMapping(value = {
	"/systemParam"
})
public class EcTradeSeatManageAction extends BaseAction {

	/*
	 * 直销交易渠道管理跳转页面
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/ecTradeSeatManage")
	public String execute(EcTradeSeatRequest req, Model model) {
		EcTradeSeatResponse res = new EcTradeSeatResponse();
		super.execute(req, res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CHANNEL_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		model.addAttribute("res", res);
		if (res.isSuccess()) {
			return res.getTarget("/systemParam/ecTrade-seat-success");
		}
		return "";
	}

	/*
	 * ajax直销交易渠道查询
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/ecTradeSeatManage!ajaxQuery")
	@ResponseBody
	public EcTradeSeatResponse ajaxQuery(EcTradeSeatRequest req) {
		EcTradeSeatResponse res = new EcTradeSeatResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CHANNEL_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundEcTradeSeatExample example = new FundEcTradeSeatExample();
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				example.or().andSeatNameLike("%" + req.getSearchKeyword() + "%");
				example.or().andBankNameLike("%" + req.getSearchKeyword() + "%");
				example.or().andPaySeatNameLike("%" + req.getSearchKeyword() + "%");
			}
			List<FundEcTradeSeat> ecTradeSeatList = null;
			example.setOrderByClause("ORDER_FIELD asc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {
				ecTradeSeatList = fundSystemBiz.fundEcTradeSeatSelectObjects(example);
				int count = fundSystemBiz.fundEcTradeSeatQuerySelectObjectsCount(example);
				if (!ecTradeSeatList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setEcTradeSeatList(ecTradeSeatList);
				res.setSuccess(true);
				res.setTitle("直销交易渠道查询");
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "直销交易渠道查询失败");
			}
		}
		return res;
	}

	/*
	 * ajax直销交易渠道修改
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/ecTradeSeatManage!ajaxSave")
	@ResponseBody
	public EcTradeSeatResponse ajaxSave(EcTradeSeatRequest req) {
		EcTradeSeatResponse res = new EcTradeSeatResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CHANNEL_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInputEdit(res);
		}
		if (res.isSuccess()) {
			try {
				FundEcTradeSeatExample example = new FundEcTradeSeatExample();
				example.or().andBankNoEqualTo(req.getEcTradeSeat().getBankNo()).andSeatNoEqualTo(req.getEcTradeSeat().getSeatNo())
						.andPaySeatNoEqualTo(req.getEcTradeSeat().getPaySeatNo());
				example.setPage(new PageImpl(0, 1));
				FundEcTradeSeat oldSeat = fundSystemBiz.selectSingleObject(fundSystemBiz.fundEcTradeSeatSelectObjects(example));
				FundEcTradeSeat ecTradeSeat = null;
				if (!StringUtils.isNullOrEmpty(req.getEcTradeSeat().getId())) {
					ecTradeSeat = fundSystemBiz.fundEcTradeSeatSelectByPrimaryKey(req.getEcTradeSeat().getId());
				}
				boolean newObj = ecTradeSeat == null;
				if (newObj) {
					if (oldSeat != null) {
						res.setResult(false, "直销交易渠道:银行代码,支付渠道代码,渠道代码不能重复");
					}
				} else {
					if (oldSeat != null) {
						if (!oldSeat.getId().equals(ecTradeSeat.getId())) {
							res.setResult(false, "直销交易渠道:银行代码,支付渠道代码,渠道代码不能重复");
						}
					}
				}

				if (res.isSuccess()) {
					if (newObj) {
						ecTradeSeat = new FundEcTradeSeat();
						ecTradeSeat.setRowVersion(0);
						ecTradeSeat.setId(UUIDGenerator.getUUID24());
						ecTradeSeat.setCreateTime(new Date());
						ecTradeSeat.setCreateId(webUserRuntimeBiz.getLoginUserId());
					} else {
						ecTradeSeat.setRowVersion(req.getEcTradeSeat().getRowVersion());
					}
					ecTradeSeat.setModifyTime(new Date());
					ecTradeSeat.setBankName(req.getEcTradeSeat().getBankName());
					ecTradeSeat.setBankNo(req.getEcTradeSeat().getBankNo());
					ecTradeSeat.setFinatype(req.getEcTradeSeat().getFinatype());
					ecTradeSeat.setPaySeatName(req.getEcTradeSeat().getPaySeatName());
					ecTradeSeat.setPaySeatNo(req.getEcTradeSeat().getPaySeatNo());
					ecTradeSeat.setSeatState(req.getEcTradeSeat().getSeatState());
					ecTradeSeat.setOrderField(req.getEcTradeSeat().getOrderField());
					ecTradeSeat.setSeatNo(req.getEcTradeSeat().getSeatNo());
					ecTradeSeat.setSeatName(req.getEcTradeSeat().getSeatName());
					ecTradeSeat.setFundTradeSupport(req.getEcTradeSeat().getFundTradeSupport());
					ecTradeSeat.setTransactionLimit(req.getEcTradeSeat().getTransactionLimit());
					ecTradeSeat.setDiscountInformation(req.getEcTradeSeat().getDiscountInformation());
					ecTradeSeat.setExtId(req.getEcTradeSeat().getExtId());
					ecTradeSeat.setFastPaySupport(req.getEcTradeSeat().getFastPaySupport());
					if (newObj) {
						fundSystemBiz.fundEcTradeSeatInsert(ecTradeSeat);
					} else {
						fundSystemBiz.fundEcTradeSeatUpdate(ecTradeSeat);
					}
					res.setId(ecTradeSeat.getId());
					res.setRowVersion(ecTradeSeat.getRowVersion());
				}
				res.setTitle("直销交易渠道管理");
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "直销交易渠道修改失败");
			}
		}
		return res;
	}

	/*
	 * ajax直销交易渠道删除
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/ecTradeSeatManage!ajaxDelete")
	@ResponseBody
	public EcTradeSeatResponse ajaxDelete(EcTradeSeatRequest req) {
		EcTradeSeatResponse res = new EcTradeSeatResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_CHANNEL_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInputId(res);
		}
		if (res.isSuccess()) {
			try {
				fundSystemBiz.fundEcTradeSeatDeleteByPrimaryKey(req.getEcTradeSeat().getId());
				res.setSuccess(true);
				res.setTitle("直销交易渠道删除");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "直销交易渠道删除失败");
			}
		}
		return res;
	}
}
