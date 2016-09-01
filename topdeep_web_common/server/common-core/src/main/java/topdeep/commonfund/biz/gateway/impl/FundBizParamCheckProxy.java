package topdeep.commonfund.biz.gateway.impl;
import topdeep.commonfund.entity.gateway.*;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
import common.util.StringUtils;
/**
 * 基金网关方法接口代理
 */
public class FundBizParamCheckProxy extends FundBizBaseProxy {
	
	/**
	 * 根据类别名称查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListByCategoryNameQueryOutput newsListByCategoryNameQuery(ISNewsListByCategoryNameQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsListByCategoryNameQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getNewsCategoryName())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数资讯分类名称;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getStatType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数统计类型;");
			}
			if (error) {
				outputParam = new ISNewsListByCategoryNameQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.newsListByCategoryNameQuery(inputParam);
			}
		}
		else {
			outputParam = new ISNewsListByCategoryNameQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 相关工作日查询 
	 * @return 结果
	 */
	public ISWorkDayQueryOutput workDayQuery(ISWorkDayQueryInput inputParam) {
		this.dealInput(inputParam);
		ISWorkDayQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISWorkDayQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.workDayQuery(inputParam);
			}
		}
		else {
			outputParam = new ISWorkDayQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询风险测试题库 
	 * @return 结果
	 */
	public ISRiskEvaluationExamQueryOutput riskEvaluationExamQuery(ISRiskEvaluationExamQueryInput inputParam) {
		this.dealInput(inputParam);
		ISRiskEvaluationExamQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISRiskEvaluationExamQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.riskEvaluationExamQuery(inputParam);
			}
		}
		else {
			outputParam = new ISRiskEvaluationExamQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 风险测评 
	 * @return 结果
	 */
	public ISRiskEvaluationOutput riskEvaluation(ISRiskEvaluationInput inputParam) {
		this.dealInput(inputParam);
		ISRiskEvaluationOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQuestionList())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数问题序号列表;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAnswerList())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数回答列表，对应问题;");
			}
			if (error) {
				outputParam = new ISRiskEvaluationOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.riskEvaluation(inputParam);
			}
		}
		else {
			outputParam = new ISRiskEvaluationOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 * @return 结果
	 */
	public ISFastOpenAccountOutput fastOpenAccount(ISFastOpenAccountInput inputParam) {
		this.dealInput(inputParam);
		ISFastOpenAccountOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPaySeatNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数支付渠道代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBankNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerName())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数投资人名称;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBankAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行卡号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getMobilePhone())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数手机号码;");
			}
			if (error) {
				outputParam = new ISFastOpenAccountOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.fastOpenAccount(inputParam);
			}
		}
		else {
			outputParam = new ISFastOpenAccountOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速开户功能判断查询 
	 * @return 结果
	 */
	public ISFastOpenAccountConditionQueryOutput fastOpenAccountConditionQuery(ISFastOpenAccountConditionQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFastOpenAccountConditionQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQueryType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPaySeatNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数支付渠道代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBankAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行卡号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getMobile())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数手机号码;");
			}
			if (error) {
				outputParam = new ISFastOpenAccountConditionQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.fastOpenAccountConditionQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFastOpenAccountConditionQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 * @return 结果
	 */
	public ISTransactionsProcessDayQueryOutput transactionsProcessDayQuery(ISTransactionsProcessDayQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsProcessDayQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易相关基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易类型代码;");
			}
			if (error) {
				outputParam = new ISTransactionsProcessDayQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.transactionsProcessDayQuery(inputParam);
			}
		}
		else {
			outputParam = new ISTransactionsProcessDayQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询支持开户的银行列表 
	 * @return 结果
	 */
	public ISSupportOpenAccountBankListQueryOutput supportOpenAccountBankListQuery(ISSupportOpenAccountBankListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSupportOpenAccountBankListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSupportOpenAccountBankListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.supportOpenAccountBankListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSupportOpenAccountBankListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 发送验证信息接口 
	 * @return 结果
	 */
	public ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam) {
		this.dealInput(inputParam);
		ISValidInfoSendOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISValidInfoSendOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0u_impl.validInfoSend(inputParam);
			}
		}
		else {
			outputParam = new ISValidInfoSendOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史确认查询 
	 * @return 结果
	 */
	public ISHistoryConfirmQueryOutput historyConfirmQuery(ISHistoryConfirmQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHistoryConfirmQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISHistoryConfirmQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.historyConfirmQuery(inputParam);
			}
		}
		else {
			outputParam = new ISHistoryConfirmQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 个人客户信息查询 
	 * @return 结果
	 */
	public ISCustomerInfoQueryOutput customerInfoQuery(ISCustomerInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQueryType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询数据来源;");
			}
			if (error) {
				outputParam = new ISCustomerInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.customerInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISCustomerInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 个人客户信息修改 
	 * @return 结果
	 */
	public ISCustomerInfoModifyOutput customerInfoModify(ISCustomerInfoModifyInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerInfoModifyOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISCustomerInfoModifyOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.customerInfoModify(inputParam);
			}
		}
		else {
			outputParam = new ISCustomerInfoModifyOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 预约申购 
	 * @return 结果
	 */
	public ISAppointmentPurchaseOutput appointmentPurchase(ISAppointmentPurchaseInput inputParam) {
		this.dealInput(inputParam);
		ISAppointmentPurchaseOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAppointmentName())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数预约名称;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数申购基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数申购份额类别;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAppointmentStyle())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数预约方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCapsource())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数资金来源;");
			}
			if (error) {
				outputParam = new ISAppointmentPurchaseOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.appointmentPurchase(inputParam);
			}
		}
		else {
			outputParam = new ISAppointmentPurchaseOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 预约赎回 
	 * @return 结果
	 */
	public ISAppointmentRedeemOutput appointmentRedeem(ISAppointmentRedeemInput inputParam) {
		this.dealInput(inputParam);
		ISAppointmentRedeemOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAppointmentName())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数预约名称;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数赎回基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数赎回份额类别;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAppointmentStyle())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数预约方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getRedeemFlag())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数赎回标志;");
			}
			if (error) {
				outputParam = new ISAppointmentRedeemOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.appointmentRedeem(inputParam);
			}
		}
		else {
			outputParam = new ISAppointmentRedeemOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额查询 
	 * @return 结果
	 */
	public ISFixedInvestmentQueryOutput fixedInvestmentQuery(ISFixedInvestmentQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号;");
			}
			if (error) {
				outputParam = new ISFixedInvestmentQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.fixedInvestmentQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFixedInvestmentQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额申购 
	 * @return 结果
	 */
	public ISFixedInvestmentPurchaseOutput fixedInvestmentPurchase(ISFixedInvestmentPurchaseInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentPurchaseOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数申购基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数申购份额类别;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCycleUnit())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数周期单位;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCycleValue())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数周期值;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsDate())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易触发日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCycleDate())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数定期日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradePwd())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISFixedInvestmentPurchaseOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.fixedInvestmentPurchase(inputParam);
			}
		}
		else {
			outputParam = new ISFixedInvestmentPurchaseOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史交易申请查询 
	 * @return 结果
	 */
	public ISHistoryTransactionsApplicationListQueryOutput historyTransactionsApplicationListQuery(ISHistoryTransactionsApplicationListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHistoryTransactionsApplicationListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getStatType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数统计类型;");
			}
			if (error) {
				outputParam = new ISHistoryTransactionsApplicationListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.historyTransactionsApplicationListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISHistoryTransactionsApplicationListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 当日交易申请查询 当日委托
	 * @return 结果
	 */
	public ISTodayTransactionsApplicationListQueryOutput todayTransactionsApplicationListQuery(ISTodayTransactionsApplicationListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTodayTransactionsApplicationListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getStatType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数统计类型;");
			}
			if (error) {
				outputParam = new ISTodayTransactionsApplicationListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.todayTransactionsApplicationListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISTodayTransactionsApplicationListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 明细查询 
	 * @return 结果
	 */
	public ISTransactionRecordDetailQueryOutput transactionRecordDetailQuery(ISTransactionRecordDetailQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionRecordDetailQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISTransactionRecordDetailQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.transactionRecordDetailQuery(inputParam);
			}
		}
		else {
			outputParam = new ISTransactionRecordDetailQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 更新Session中的用户 
	 * @return 结果
	 */
	public ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISSessionUserUpdateOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (error) {
				outputParam = new ISSessionUserUpdateOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.b00_impl.sessionUserUpdate(inputParam);
			}
		}
		else {
			outputParam = new ISSessionUserUpdateOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询专户剩余额度 E006
	 * @return 结果
	 */
	public ISSpecialAccBalanceQueryOutput specialAccBalanceQuery(ISSpecialAccBalanceQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccBalanceQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSpecialAccBalanceQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.specialAccBalanceQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSpecialAccBalanceQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询电子合同信息 E001
	 * @return 结果
	 */
	public ISEletricContractQueryOutput eletricContractQuery(ISEletricContractQueryInput inputParam) {
		this.dealInput(inputParam);
		ISEletricContractQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISEletricContractQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.eletricContractQuery(inputParam);
			}
		}
		else {
			outputParam = new ISEletricContractQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 签署电子合同或风险揭示书 
	 * @return 结果
	 */
	public ISSpeciElectronicContractSignOutput speciElectronicContractSign(ISSpeciElectronicContractSignInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciElectronicContractSignOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradeacco())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易帐号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradepassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISSpeciElectronicContractSignOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.speciElectronicContractSign(inputParam);
			}
		}
		else {
			outputParam = new ISSpeciElectronicContractSignOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史分红查询 S005
	 * @return 结果
	 */
	public ISHisBonusListQueryOutput hisBonusListQuery(ISHisBonusListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHisBonusListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISHisBonusListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.hisBonusListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISHisBonusListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 盈亏查询 S013
	 * @return 结果
	 */
	public ISProfitQueryOutput profitQuery(ISProfitQueryInput inputParam) {
		this.dealInput(inputParam);
		ISProfitQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBegindate())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数起始日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getEnddate())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数结束日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQuerytype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询条件;");
			}
			if (error) {
				outputParam = new ISProfitQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.profitQuery(inputParam);
			}
		}
		else {
			outputParam = new ISProfitQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 可定制信息查询 V007
	 * @return 结果
	 */
	public ISServeQueryOutput serveQuery(ISServeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISServeQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISServeQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.serveQuery(inputParam);
			}
		}
		else {
			outputParam = new ISServeQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定制信息 V008
	 * @return 结果
	 */
	public ISServeCustomizeOutput serveCustomize(ISServeCustomizeInput inputParam) {
		this.dealInput(inputParam);
		ISServeCustomizeOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOrders())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数定制的taskcode列表;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getMailOrders())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数定制的taskcode列表;");
			}
			if (error) {
				outputParam = new ISServeCustomizeOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.serveCustomize(inputParam);
			}
		}
		else {
			outputParam = new ISServeCustomizeOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 重置交易密码 C029
	 * @return 结果
	 */
	public ISPasswordResetOutput passwordReset(ISPasswordResetInput inputParam) {
		this.dealInput(inputParam);
		ISPasswordResetOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getWay())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数重置方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getNewpwd())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数新密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdtype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdno())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustname())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户名称;");
			}
			if (error) {
				outputParam = new ISPasswordResetOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.passwordReset(inputParam);
			}
		}
		else {
			outputParam = new ISPasswordResetOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 检查版本 
	 * @return 结果
	 */
	public ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam) {
		this.dealInput(inputParam);
		ISVersionCheckOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getClientType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户端类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getClientVersion())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户端版本;");
			}
			if (error) {
				outputParam = new ISVersionCheckOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.b00_impl.versionCheck(inputParam);
			}
		}
		else {
			outputParam = new ISVersionCheckOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 登录 
	 * @return 结果
	 */
	public ISLoginOutput login(ISLoginInput inputParam) {
		this.dealInput(inputParam);
		ISLoginOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getLoginType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数登录方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getLoginAccountType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数登录账号类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getLoginAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数登录账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数登录密码;");
			}
			if (error) {
				outputParam = new ISLoginOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.b00_impl.login(inputParam);
			}
		}
		else {
			outputParam = new ISLoginOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 登出 
	 * @return 结果
	 */
	public ISLogoutOutput logout(ISLogoutInput inputParam) {
		this.dealInput(inputParam);
		ISLogoutOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISLogoutOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.b00_impl.logout(inputParam);
			}
		}
		else {
			outputParam = new ISLogoutOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 字典查询 
	 * @return 结果
	 */
	public ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISBaseInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISBaseInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.b00_impl.baseInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISBaseInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 密码修改 
	 * @return 结果
	 */
	public ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam) {
		this.dealInput(inputParam);
		ISPasswordModifyOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTheOldPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数旧密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTheNewPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数新密码;");
			}
			if (error) {
				outputParam = new ISPasswordModifyOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.passwordModify(inputParam);
			}
		}
		else {
			outputParam = new ISPasswordModifyOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询交易账号列表 
	 * @return 结果
	 */
	public ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsAccountListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISTransactionsAccountListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.transactionsAccountListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISTransactionsAccountListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金份额查询 
	 * @return 结果
	 */
	public ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundShareListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQueryType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询类型;");
			}
			if (error) {
				outputParam = new ISFundShareListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.fundShareListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundShareListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收益变动曲线 
	 * @return 结果
	 */
	public ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISIncomeChangeListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getStatType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数统计类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getQueryUnit())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询单位;");
			}
			if (error) {
				outputParam = new ISIncomeChangeListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.incomeChangeListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISIncomeChangeListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金购买信息 
	 * @return 结果
	 */
	public ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundBuyInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易类型代码;");
			}
			if (error) {
				outputParam = new ISFundBuyInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.fundBuyInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundBuyInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金交易费率查询 
	 * @return 结果
	 */
	public ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundTransactionsFeeQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数份额类别;");
			}
			if (error) {
				outputParam = new ISFundTransactionsFeeQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.fundTransactionsFeeQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundTransactionsFeeQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 购买基金 
	 * @return 结果
	 */
	public ISFundBuyOutput fundBuy(ISFundBuyInput inputParam) {
		this.dealInput(inputParam);
		ISFundBuyOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCapsource())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数资金来源;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getDetailcapitalmode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数支付方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBusinflag())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数业务代码;");
			}
			if (error) {
				outputParam = new ISFundBuyOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundBuy(inputParam);
			}
		}
		else {
			outputParam = new ISFundBuyOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 * @return 结果
	 */
	public ISFundSmartInvestmentStateUpdateOutput fundSmartInvestmentStateUpdate(ISFundSmartInvestmentStateUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISFundSmartInvestmentStateUpdateOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getAgreementNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数协议号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOperateType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数操作类型;");
			}
			if (error) {
				outputParam = new ISFundSmartInvestmentStateUpdateOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0k_impl.fundSmartInvestmentStateUpdate(inputParam);
			}
		}
		else {
			outputParam = new ISFundSmartInvestmentStateUpdateOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回 
	 * @return 结果
	 */
	public ISFundRedemptionOutput fundRedemption(ISFundRedemptionInput inputParam) {
		this.dealInput(inputParam);
		ISFundRedemptionOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数赎回交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数份额分类;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getLargeRedemptionFlag())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数巨额赎回标志;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getSaleWay())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数卖出方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFastRedemptionFlag())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数是否快速赎回1是0否;");
			}
			if (error) {
				outputParam = new ISFundRedemptionOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundRedemption(inputParam);
			}
		}
		else {
			outputParam = new ISFundRedemptionOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金转换 
	 * @return 结果
	 */
	public ISFundTransferOutput fundTransfer(ISFundTransferInput inputParam) {
		this.dealInput(inputParam);
		ISFundTransferOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOutFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOutShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数份额类别;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOutTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getInFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转入基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getInShareType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转入份额类别;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getInTransactionsAccount())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getRedemptionFlag())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数赎回标志;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISFundTransferOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundTransfer(inputParam);
			}
		}
		else {
			outputParam = new ISFundTransferOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 撤单 
	 * @return 结果
	 */
	public ISTransactionCancelOutput transactionCancel(ISTransactionCancelInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionCancelOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOrgApplicationNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数原始申请编号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISTransactionCancelOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.transactionCancel(inputParam);
			}
		}
		else {
			outputParam = new ISTransactionCancelOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	public ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialFundListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易类型代码;");
			}
			if (error) {
				outputParam = new ISSpecialFundListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.specialFundListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSpecialFundListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯分类 
	 * @return 结果
	 */
	public ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsCategoryListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISNewsCategoryListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.newsCategoryListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISNewsCategoryListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getStatType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数统计类型;");
			}
			if (error) {
				outputParam = new ISNewsListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.newsListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISNewsListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯内容 
	 * @return 结果
	 */
	public ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISNewsQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.newsQuery(inputParam);
			}
		}
		else {
			outputParam = new ISNewsQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资源 
	 * @return 结果
	 */
	public ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam) {
		this.dealInput(inputParam);
		ISResourceQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISResourceQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.resourceQuery(inputParam);
			}
		}
		else {
			outputParam = new ISResourceQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金列表 
	 * @return 结果
	 */
	public ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数查询基金代码;");
			}
			if (error) {
				outputParam = new ISFundListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.fundListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金净值 
	 * @return 结果
	 */
	public ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNetValueQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISNetValueQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.netValueQuery(inputParam);
			}
		}
		else {
			outputParam = new ISNetValueQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金历史净值 
	 * @return 结果
	 */
	public ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHisNetValueQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundCode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (error) {
				outputParam = new ISHisNetValueQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.hisNetValueQuery(inputParam);
			}
		}
		else {
			outputParam = new ISHisNetValueQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金费用 
	 * @return 结果
	 */
	public ISFundFeeQueryOutput fundFeeQuery(ISFundFeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundFeeQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (error) {
				outputParam = new ISFundFeeQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0a_impl.fundFeeQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundFeeQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundInfoQueryOutput fundInfoQuery(ISFundInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (error) {
				outputParam = new ISFundInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0a_impl.fundInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundCombineInvestmentAssetsListQueryOutput fundCombineInvestmentAssetsListQuery(ISFundCombineInvestmentAssetsListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundCombineInvestmentAssetsListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (error) {
				outputParam = new ISFundCombineInvestmentAssetsListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0a_impl.fundCombineInvestmentAssetsListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundCombineInvestmentAssetsListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询交易帮助信息 
	 * @return 结果
	 */
	public ISTransactionsHelpQueryOutput transactionsHelpQuery(ISTransactionsHelpQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsHelpQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTransactionsType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数本地交易类型;");
			}
			if (error) {
				outputParam = new ISTransactionsHelpQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.transactionsHelpQuery(inputParam);
			}
		}
		else {
			outputParam = new ISTransactionsHelpQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金显示列表 
	 * @return 结果
	 */
	public ISFundShowListQueryOutput fundShowListQuery(ISFundShowListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundShowListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISFundShowListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0k_impl.fundShowListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundShowListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询可撤单列表 
	 * @return 结果
	 */
	public ISQueryCanCancelTransactionListOutput queryCanCancelTransactionList(ISQueryCanCancelTransactionListInput inputParam) {
		this.dealInput(inputParam);
		ISQueryCanCancelTransactionListOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISQueryCanCancelTransactionListOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.queryCanCancelTransactionList(inputParam);
			}
		}
		else {
			outputParam = new ISQueryCanCancelTransactionListOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 获取专户用户授权信息 E002
	 * @return 结果
	 */
	public ISSpecialAccAuthQueryOutput specialAccAuthQuery(ISSpecialAccAuthQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccAuthQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSpecialAccAuthQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.specialAccAuthQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSpecialAccAuthQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 新增专户用户授权 E003
	 * @return 结果
	 */
	public ISSpecialAccAuthAddOutput specialAccAuthAdd(ISSpecialAccAuthAddInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccAuthAddOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradepassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISSpecialAccAuthAddOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0u_impl.specialAccAuthAdd(inputParam);
			}
		}
		else {
			outputParam = new ISSpecialAccAuthAddOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询专户人数限制 
	 * @return 结果
	 */
	public ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciBuyLimitQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSpeciBuyLimitQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0u_impl.speciBuyLimitQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSpeciBuyLimitQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 专户基金详细信息查询 S060
	 * @return 结果
	 */
	public ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciFundInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSpeciFundInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0u_impl.speciFundInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISSpeciFundInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 销交易账号 C028
	 * @return 结果
	 */
	public ISTradeAccCancelOutput tradeAccCancel(ISTradeAccCancelInput inputParam) {
		this.dealInput(inputParam);
		ISTradeAccCancelOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradeacco())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradepassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (error) {
				outputParam = new ISTradeAccCancelOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.tradeAccCancel(inputParam);
			}
		}
		else {
			outputParam = new ISTradeAccCancelOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金收益率查询 S037
	 * @return 结果
	 */
	public ISFundIncomeRateQueryOutput fundIncomeRateQuery(ISFundIncomeRateQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundIncomeRateQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISFundIncomeRateQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.fundIncomeRateQuery(inputParam);
			}
		}
		else {
			outputParam = new ISFundIncomeRateQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额转换 I008
	 * @return 结果
	 */
	public ISFixedInvestmentTransferOutput fixedInvestmentTransfer(ISFixedInvestmentTransferInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentTransferOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getApplysum())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转换份额;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCycleunit())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易周期单位;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转出基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getJyrq())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getJyzq())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易周期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOtherfundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转入基金代码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOthersharetype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转入收费方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getScjyrq())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数首次交易月份;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getSharetype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数转出收费方式;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradepassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getZzrq())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数终止日期;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTradeAcc())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数交易账号;");
			}
			if (error) {
				outputParam = new ISFixedInvestmentTransferOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.fixedInvestmentTransfer(inputParam);
			}
		}
		else {
			outputParam = new ISFixedInvestmentTransferOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 短期理财到期日查询 S035
	 * @return 结果
	 */
	public ISShortDateQueryOutput shortDateQuery(ISShortDateQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShortDateQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getFundcode())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数基金代码;");
			}
			if (error) {
				outputParam = new ISShortDateQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.shortDateQuery(inputParam);
			}
		}
		else {
			outputParam = new ISShortDateQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 短期理财明细查询 S020
	 * @return 结果
	 */
	public ISShortMoneyDetailQueryOutput shortMoneyDetailQuery(ISShortMoneyDetailQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShortMoneyDetailQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISShortMoneyDetailQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.shortMoneyDetailQuery(inputParam);
			}
		}
		else {
			outputParam = new ISShortMoneyDetailQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 数据中心客户信息查询 C025
	 * @return 结果
	 */
	public ISDataCenterCustomerInfoQueryOutput dataCenterCustomerInfoQuery(ISDataCenterCustomerInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISDataCenterCustomerInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISDataCenterCustomerInfoQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.dataCenterCustomerInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new ISDataCenterCustomerInfoQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 份额流水查询 S058
	 * @return 结果
	 */
	public ISShareWaterQueryOutput shareWaterQuery(ISShareWaterQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShareWaterQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISShareWaterQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1a_impl.shareWaterQuery(inputParam);
			}
		}
		else {
			outputParam = new ISShareWaterQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 对账单定制查询 V005
	 * @return 结果
	 */
	public ISCheckSheetQueryOutput checkSheetQuery(ISCheckSheetQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCheckSheetQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数信息形式;");
			}
			if (error) {
				outputParam = new ISCheckSheetQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.checkSheetQuery(inputParam);
			}
		}
		else {
			outputParam = new ISCheckSheetQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 对账单定制 V006
	 * @return 结果
	 */
	public ISCheckSheetCustomizeOutput checkSheetCustomize(ISCheckSheetCustomizeInput inputParam) {
		this.dealInput(inputParam);
		ISCheckSheetCustomizeOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getOrders())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数信息形式;");
			}
			if (error) {
				outputParam = new ISCheckSheetCustomizeOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.checkSheetCustomize(inputParam);
			}
		}
		else {
			outputParam = new ISCheckSheetCustomizeOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 客户角色查询 C053
	 * @return 结果
	 */
	public ISUserRoleQueryOutput userRoleQuery(ISUserRoleQueryInput inputParam) {
		this.dealInput(inputParam);
		ISUserRoleQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdentityno())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdentitytype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (error) {
				outputParam = new ISUserRoleQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1k_impl.userRoleQuery(inputParam);
			}
		}
		else {
			outputParam = new ISUserRoleQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银联通开户签名生成 B026
	 * @return 结果
	 */
	public ISChinaPayMobileOpenAccoOrderOutput chinaPayMobileOpenAccoOrder(ISChinaPayMobileOpenAccoOrderInput inputParam) {
		this.dealInput(inputParam);
		ISChinaPayMobileOpenAccoOrderOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBankacco())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行卡号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getBankserial())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行编号;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerappellation())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数持卡人姓名;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdentityno())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdentitytype())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getSex())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数姓别(对应直销的性别字典);");
			}
			if (error) {
				outputParam = new ISChinaPayMobileOpenAccoOrderOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.chinaPayMobileOpenAccoOrder(inputParam);
			}
		}
		else {
			outputParam = new ISChinaPayMobileOpenAccoOrderOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银联通开户返回信息验证 B027
	 * @return 结果
	 */
	public ISChinapaymobilebackverifyOutput chinapaymobilebackverify(ISChinapaymobilebackverifyInput inputParam) {
		this.dealInput(inputParam);
		ISChinapaymobilebackverifyOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getReqparams())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数银行返回数据;");
			}
			if (error) {
				outputParam = new ISChinapaymobilebackverifyOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.chinapaymobilebackverify(inputParam);
			}
		}
		else {
			outputParam = new ISChinapaymobilebackverifyOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 交易日期查询 
	 * @return 结果
	 */
	public ISFundTradeDatequeryOutput fundTradeDatequery(ISFundTradeDatequeryInput inputParam) {
		this.dealInput(inputParam);
		ISFundTradeDatequeryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISFundTradeDatequeryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.fundTradeDatequery(inputParam);
			}
		}
		else {
			outputParam = new ISFundTradeDatequeryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 变更银行卡 B016
	 * @return 结果
	 */
	public ISBankCardChangeOutput bankCardChange(ISBankCardChangeInput inputParam) {
		this.dealInput(inputParam);
		ISBankCardChangeOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISBankCardChangeOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n1a_impl.bankCardChange(inputParam);
			}
		}
		else {
			outputParam = new ISBankCardChangeOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 * @return 结果
	 */
	public ISPayOrPayeeAddOutput payOrPayeeAdd(ISPayOrPayeeAddInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeAddOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayOrPayeeAddOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payOrPayeeAdd(inputParam);
			}
		}
		else {
			outputParam = new ISPayOrPayeeAddOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收款或付款 
	 * @return 结果
	 */
	public ISPayOrPayeeOutput payOrPayee(ISPayOrPayeeInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayOrPayeeOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payOrPayee(inputParam);
			}
		}
		else {
			outputParam = new ISPayOrPayeeOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 支付查询 
	 * @return 结果
	 */
	public ISPayOrPayeeQueryOutput payOrPayeeQuery(ISPayOrPayeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayOrPayeeQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payOrPayeeQuery(inputParam);
			}
		}
		else {
			outputParam = new ISPayOrPayeeQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 取消收付款 
	 * @return 结果
	 */
	public ISPayOrPayeeCancelOutput payOrPayeeCancel(ISPayOrPayeeCancelInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeCancelOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayOrPayeeCancelOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payOrPayeeCancel(inputParam);
			}
		}
		else {
			outputParam = new ISPayOrPayeeCancelOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询收付款交易记录 
	 * @return 结果
	 */
	public ISPayListQueryOutput payListQuery(ISPayListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayListQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payListQuery(inputParam);
			}
		}
		else {
			outputParam = new ISPayListQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询客户联系人 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsQueryOutput customerFrequentContactsQuery(ISCustomerFrequentContactsQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerFrequentContactsQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISCustomerFrequentContactsQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.customerFrequentContactsQuery(inputParam);
			}
		}
		else {
			outputParam = new ISCustomerFrequentContactsQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 修改客户联系人备注和标记 
	 * @return 结果
	 */
	public ISFrequentContactsUpdateOutput frequentContactsUpdate(ISFrequentContactsUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISFrequentContactsUpdateOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISFrequentContactsUpdateOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.frequentContactsUpdate(inputParam);
			}
		}
		else {
			outputParam = new ISFrequentContactsUpdateOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收付款交易记录首页 
	 * @return 结果
	 */
	public ISPayHomeQueryOutput payHomeQuery(ISPayHomeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayHomeQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayHomeQueryOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payHomeQuery(inputParam);
			}
		}
		else {
			outputParam = new ISPayHomeQueryOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收付款交易记录详情 
	 * @return 结果
	 */
	public ISPayInfoOutput payInfo(ISPayInfoInput inputParam) {
		this.dealInput(inputParam);
		ISPayInfoOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getPayId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数收付款交易记录标识;");
			}
			if (error) {
				outputParam = new ISPayInfoOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.payInfo(inputParam);
			}
		}
		else {
			outputParam = new ISPayInfoOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 联系人详情 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsInfoOutput customerFrequentContactsInfo(ISCustomerFrequentContactsInfoInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerFrequentContactsInfoOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getContactsId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数联系人标识;");
			}
			if (error) {
				outputParam = new ISCustomerFrequentContactsInfoOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0k_impl.customerFrequentContactsInfo(inputParam);
			}
		}
		else {
			outputParam = new ISCustomerFrequentContactsInfoOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 消息列表 
	 * @return 结果
	 */
	public ISInformationListOutput informationList(ISInformationListInput inputParam) {
		this.dealInput(inputParam);
		ISInformationListOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISInformationListOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.informationList(inputParam);
			}
		}
		else {
			outputParam = new ISInformationListOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 消息内容 
	 * @return 结果
	 */
	public ISInfomationContentOutput infomationContent(ISInfomationContentInput inputParam) {
		this.dealInput(inputParam);
		ISInfomationContentOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISInfomationContentOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.infomationContent(inputParam);
			}
		}
		else {
			outputParam = new ISInfomationContentOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 删除银行卡 
	 * @return 结果
	 */
	public ISCardNoDelOutput cardNoDel(ISCardNoDelInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoDelOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISCardNoDelOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.cardNoDel(inputParam);
			}
		}
		else {
			outputParam = new ISCardNoDelOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银行卡列表 
	 * @return 结果
	 */
	public ISCardNoListOutput cardNoList(ISCardNoListInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoListOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISCardNoListOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.cardNoList(inputParam);
			}
		}
		else {
			outputParam = new ISCardNoListOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 保存银行卡 
	 * @return 结果
	 */
	public ISCardNoSaveOutput cardNoSave(ISCardNoSaveInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoSaveOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISCardNoSaveOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.cardNoSave(inputParam);
			}
		}
		else {
			outputParam = new ISCardNoSaveOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 我的红包 
	 * @return 结果
	 */
	public ISMyGiftOutput myGift(ISMyGiftInput inputParam) {
		this.dealInput(inputParam);
		ISMyGiftOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISMyGiftOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u1E_impl.myGift(inputParam);
			}
		}
		else {
			outputParam = new ISMyGiftOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 验证码验证 
	 * @return 结果
	 */
	public ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam) {
		this.dealInput(inputParam);
		ISValidInfoValidOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISValidInfoValidOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n0u_impl.validInfoValid(inputParam);
			}
		}
		else {
			outputParam = new ISValidInfoValidOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 同步用户账户数据 
	 * @return 结果
	 */
	public ISSyncUserAccountOutput syncUserAccount(ISSyncUserAccountInput inputParam) {
		this.dealInput(inputParam);
		ISSyncUserAccountOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSyncUserAccountOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0a_impl.syncUserAccount(inputParam);
			}
		}
		else {
			outputParam = new ISSyncUserAccountOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 判断当前用户的收付款开通情况 
	 * @return 结果
	 */
	public ISPayOrPayeeJudgeOutput payOrPayeeJudge(ISPayOrPayeeJudgeInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeJudgeOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISPayOrPayeeJudgeOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0k_impl.payOrPayeeJudge(inputParam);
			}
		}
		else {
			outputParam = new ISPayOrPayeeJudgeOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 * @return 结果
	 */
	public ISSupportPayTransactionsAccountOutput supportPayTransactionsAccount(ISSupportPayTransactionsAccountInput inputParam) {
		this.dealInput(inputParam);
		ISSupportPayTransactionsAccountOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISSupportPayTransactionsAccountOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0k_impl.supportPayTransactionsAccount(inputParam);
			}
		}
		else {
			outputParam = new ISSupportPayTransactionsAccountOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询现金宝资产 
	 * @return 结果
	 */
	public ISQueryMoneyAssetsOutput queryMoneyAssets(ISQueryMoneyAssetsInput inputParam) {
		this.dealInput(inputParam);
		ISQueryMoneyAssetsOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new ISQueryMoneyAssetsOutput();
				outputParam.setCode(FundErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.m0k_impl.queryMoneyAssets(inputParam);
			}
		}
		else {
			outputParam = new ISQueryMoneyAssetsOutput();
			outputParam.setCode(FundErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
}
