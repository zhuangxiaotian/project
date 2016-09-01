package topdeep.commonfund.mg.action.fund;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import topdeep.common.entity.base.PageImpl;
import topdeep.common.entity.constant.BaseInfoType;
import topdeep.common.entity.constant.NameValue;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.entity.db.FundTradeParamConvert;
import topdeep.commonfund.entity.db.FundTradeParamConvertExample;
import topdeep.commonfund.mg.action.base.BaseAction;
import topdeep.commonfund.mg.entity.FundPrivilegeConfig;
import topdeep.commonfund.mg.entity.request.TradeParamConvertRequest;
import topdeep.commonfund.mg.entity.response.TradeParamConvertResponse;

import common.cache2.CacheException;
import common.privilege.PrivilegeOperate;
import common.util.StringUtils;
import common.util.TwoTuple;
import common.web.annotation.TopdeepMethodAttribute;

@Controller
@RequestMapping(value = "/systemParam")
public class TradeParamConvertManageAction extends BaseAction {

	/*
	 * 交易参数转换管理跳转页面
	 */
	@TopdeepMethodAttribute
	@RequestMapping(value = "/tradeParamConvertManage")
	public String execute(TradeParamConvertRequest req, Model model) {
		TradeParamConvertResponse res = new TradeParamConvertResponse();
		super.execute(req, res);
		checkPrivilege(res, FundPrivilegeConfig.FUNC_TRADE_PARAM_MANAGE, PrivilegeOperate.Read);
		if (!StringUtils.isNullOrEmpty(res.getRedirectUrl())) {
			return res.getTarget(res.getRedirectUrl());
		}
		List<TwoTuple<String, String>> typeList = BaseInfoType.getTypeList();
		for (TwoTuple<String, String> item : typeList) {
			res.getTypeList().add(new NameValue(item.Second, item.First));
		}
		res.getData().put("baseTypeList", typeList);
		model.addAttribute("res", res);
		return res.getTarget("/systemParam/trade-param-convert-success");
	}

	/*
	 * ajax交易参数转换查询
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/tradeParamConvertManage!ajaxQuery")
	@ResponseBody
	public TradeParamConvertResponse ajaxQuery(TradeParamConvertRequest req) {
		TradeParamConvertResponse res = new TradeParamConvertResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_TRADE_PARAM_MANAGE, PrivilegeOperate.Read);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			FundTradeParamConvertExample example = new FundTradeParamConvertExample();
			if (!StringUtils.isNullOrEmpty(req.getSearchKeyword())) {
				example.or().andBankNoLike("%" + req.getSearchKeyword() + "%");
			}
			List<FundTradeParamConvert> tradeParamConvertList = null;
			example.setOrderByClause("PAY_SEAT_NO asc,BANK_NO asc");
			example.setPage(new PageImpl(req.getPageIndex(), req.getRowsOfPage()));
			try {
				tradeParamConvertList = fundSystemBiz.fundTradeParamConvertSelectObjects(example);
				int count = fundSystemBiz.fundTradeParamConvertQuerySelectObjectsCount(example);
				if (!tradeParamConvertList.isEmpty()) {
					res.getPageData().setPageInfo(req.getPageIndex(), req.getRowsOfPage(), count);
				} else {
					res.getPageData().setPageInfo(0, req.getRowsOfPage(), 0);
				}
				res.setTradeParamConvertList(tradeParamConvertList);
				res.setSuccess(true);
				res.setTitle("交易参数转换查询");
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "交易参数转换查询失败");
			}
		}
		return res;
	}

	/*
	 * ajax交易参数转换修改
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/tradeParamConvertManage!ajaxSave")
	@ResponseBody
	public TradeParamConvertResponse ajaxSave(TradeParamConvertRequest req) {
		TradeParamConvertResponse res = new TradeParamConvertResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_TRADE_PARAM_MANAGE, PrivilegeOperate.Write);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInputEdit(res);
		}
		if (res.isSuccess()) {
			try {
				FundTradeParamConvert tradeParamConvert = null;
				if (!StringUtils.isNullOrEmpty(req.getTradeParamConvert().getId())) {
					tradeParamConvert = fundSystemBiz.fundTradeParamConvertSelectByPrimaryKey(req.getTradeParamConvert().getId());
				}
				boolean newObj = tradeParamConvert == null;
				if (newObj) {
					tradeParamConvert = new FundTradeParamConvert();
					tradeParamConvert.setId(UUIDGenerator.getUUID24());
					tradeParamConvert.setCreateTime(new Date());
					tradeParamConvert.setCreateId(webUserRuntimeBiz.getLoginUserId());
					tradeParamConvert.setRowVersion(0);
				} else {
					tradeParamConvert.setRowVersion(req.getTradeParamConvert().getRowVersion());
				}
				tradeParamConvert.setModifyTime(new Date());
				tradeParamConvert.setBankNo(req.getTradeParamConvert().getBankNo());
				tradeParamConvert.setBankValue(req.getTradeParamConvert().getBankValue());
				tradeParamConvert.setLocalValue(req.getTradeParamConvert().getLocalValue());
				tradeParamConvert.setParamType(req.getTradeParamConvert().getParamType());
				tradeParamConvert.setPaySeatNo(req.getTradeParamConvert().getPaySeatNo());
				tradeParamConvert.setSeatNo(req.getTradeParamConvert().getSeatNo());
				if (newObj) {
					fundSystemBiz.fundTradeParamConvertInsert(tradeParamConvert);
				} else {
					fundSystemBiz.fundTradeParamConvertUpdate(tradeParamConvert);
				}
				res.setRowVersion(tradeParamConvert.getRowVersion());
				res.setSuccess(true);
				res.setTitle("交易参数转换管理");
				res.setId(tradeParamConvert.getId());
			} catch (CacheException e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "交易参数转换修改失败");
			}
		}
		return res;
	}

	/*
	 * ajax交易参数转换删除
	 */
	@TopdeepMethodAttribute(isAjaxMethod = true)
	@RequestMapping(value = "/tradeParamConvertManage!ajaxDelete")
	@ResponseBody
	public TradeParamConvertResponse ajaxDelete(TradeParamConvertRequest req) {
		TradeParamConvertResponse res = new TradeParamConvertResponse();
		checkPrivilege(res, FundPrivilegeConfig.FUNC_TRADE_PARAM_MANAGE, PrivilegeOperate.Delete);
		if (res.isSuccess()) {
			super.execute(req, res, true);
		}
		if (res.isSuccess()) {
			req.checkInputId(res);
			try {
				fundSystemBiz.fundTradeParamConvertDeleteByPrimaryKey(req.getTradeParamConvert().getId());
				res.setSuccess(true);
				res.setTitle("交易参数转换删除");
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				res.setResult(false, "交易参数转换删除失败");
			}
		}
		return res;
	}
}
