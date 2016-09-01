package topdeep.commonfund.biz.gateway.impl;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
import topdeep.commonfund.biz.gateway.*;
/**
 * 基金网关方法接口代理
 */
public class FundBizBaseProxy extends FundBizProxyBase implements FundBiz_n0k, FundBiz_u0a, FundBiz_n0u, FundBiz_u0k, FundBiz_u0u, FundBiz_b00, FundBiz_u1a, FundBiz_u1k, FundBiz_u00, FundBiz_n1a, FundBiz_n00, FundBiz_n0a, FundBiz_m0a, FundBiz_m0k, FundBiz_u1E {
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_n0k n0k_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u0a u0a_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_n0u n0u_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u0k u0k_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u0u u0u_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_b00 b00_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u1a u1a_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u1k u1k_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u00 u00_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_n1a n1a_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_n00 n00_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_n0a n0a_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_m0a m0a_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_m0k m0k_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.gateway.FundBiz_u1E u1E_impl;
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_n0k getN0k_impl() {
		return this.n0k_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN0k_impl(topdeep.commonfund.biz.gateway.FundBiz_n0k value)
	 {
		this.n0k_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u0a getU0a_impl() {
		return this.u0a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU0a_impl(topdeep.commonfund.biz.gateway.FundBiz_u0a value)
	 {
		this.u0a_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_n0u getN0u_impl() {
		return this.n0u_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN0u_impl(topdeep.commonfund.biz.gateway.FundBiz_n0u value)
	 {
		this.n0u_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u0k getU0k_impl() {
		return this.u0k_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU0k_impl(topdeep.commonfund.biz.gateway.FundBiz_u0k value)
	 {
		this.u0k_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u0u getU0u_impl() {
		return this.u0u_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU0u_impl(topdeep.commonfund.biz.gateway.FundBiz_u0u value)
	 {
		this.u0u_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_b00 getB00_impl() {
		return this.b00_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setB00_impl(topdeep.commonfund.biz.gateway.FundBiz_b00 value)
	 {
		this.b00_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u1a getU1a_impl() {
		return this.u1a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU1a_impl(topdeep.commonfund.biz.gateway.FundBiz_u1a value)
	 {
		this.u1a_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u1k getU1k_impl() {
		return this.u1k_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU1k_impl(topdeep.commonfund.biz.gateway.FundBiz_u1k value)
	 {
		this.u1k_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u00 getU00_impl() {
		return this.u00_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU00_impl(topdeep.commonfund.biz.gateway.FundBiz_u00 value)
	 {
		this.u00_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_n1a getN1a_impl() {
		return this.n1a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN1a_impl(topdeep.commonfund.biz.gateway.FundBiz_n1a value)
	 {
		this.n1a_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_n00 getN00_impl() {
		return this.n00_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN00_impl(topdeep.commonfund.biz.gateway.FundBiz_n00 value)
	 {
		this.n00_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_n0a getN0a_impl() {
		return this.n0a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN0a_impl(topdeep.commonfund.biz.gateway.FundBiz_n0a value)
	 {
		this.n0a_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_m0a getM0a_impl() {
		return this.m0a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setM0a_impl(topdeep.commonfund.biz.gateway.FundBiz_m0a value)
	 {
		this.m0a_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_m0k getM0k_impl() {
		return this.m0k_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setM0k_impl(topdeep.commonfund.biz.gateway.FundBiz_m0k value)
	 {
		this.m0k_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.gateway.FundBiz_u1E getU1E_impl() {
		return this.u1E_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU1E_impl(topdeep.commonfund.biz.gateway.FundBiz_u1E value)
	 {
		this.u1E_impl = value;
	}
	
	/**
	 * 根据类别名称查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListByCategoryNameQueryOutput newsListByCategoryNameQuery(ISNewsListByCategoryNameQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsListByCategoryNameQueryOutput outputParam = this.n0k_impl.newsListByCategoryNameQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 相关工作日查询 
	 * @return 结果
	 */
	public ISWorkDayQueryOutput workDayQuery(ISWorkDayQueryInput inputParam) {
		this.dealInput(inputParam);
		ISWorkDayQueryOutput outputParam = this.n0k_impl.workDayQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询风险测试题库 
	 * @return 结果
	 */
	public ISRiskEvaluationExamQueryOutput riskEvaluationExamQuery(ISRiskEvaluationExamQueryInput inputParam) {
		this.dealInput(inputParam);
		ISRiskEvaluationExamQueryOutput outputParam = this.u0a_impl.riskEvaluationExamQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 风险测评 
	 * @return 结果
	 */
	public ISRiskEvaluationOutput riskEvaluation(ISRiskEvaluationInput inputParam) {
		this.dealInput(inputParam);
		ISRiskEvaluationOutput outputParam = this.u0a_impl.riskEvaluation(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 * @return 结果
	 */
	public ISFastOpenAccountOutput fastOpenAccount(ISFastOpenAccountInput inputParam) {
		this.dealInput(inputParam);
		ISFastOpenAccountOutput outputParam = this.n0k_impl.fastOpenAccount(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速开户功能判断查询 
	 * @return 结果
	 */
	public ISFastOpenAccountConditionQueryOutput fastOpenAccountConditionQuery(ISFastOpenAccountConditionQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFastOpenAccountConditionQueryOutput outputParam = this.n0k_impl.fastOpenAccountConditionQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 * @return 结果
	 */
	public ISTransactionsProcessDayQueryOutput transactionsProcessDayQuery(ISTransactionsProcessDayQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsProcessDayQueryOutput outputParam = this.n0k_impl.transactionsProcessDayQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询支持开户的银行列表 
	 * @return 结果
	 */
	public ISSupportOpenAccountBankListQueryOutput supportOpenAccountBankListQuery(ISSupportOpenAccountBankListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSupportOpenAccountBankListQueryOutput outputParam = this.n0k_impl.supportOpenAccountBankListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 发送验证信息接口 
	 * @return 结果
	 */
	public ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam) {
		this.dealInput(inputParam);
		ISValidInfoSendOutput outputParam = this.n0u_impl.validInfoSend(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史确认查询 
	 * @return 结果
	 */
	public ISHistoryConfirmQueryOutput historyConfirmQuery(ISHistoryConfirmQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHistoryConfirmQueryOutput outputParam = this.u0a_impl.historyConfirmQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 个人客户信息查询 
	 * @return 结果
	 */
	public ISCustomerInfoQueryOutput customerInfoQuery(ISCustomerInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerInfoQueryOutput outputParam = this.u0k_impl.customerInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 个人客户信息修改 
	 * @return 结果
	 */
	public ISCustomerInfoModifyOutput customerInfoModify(ISCustomerInfoModifyInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerInfoModifyOutput outputParam = this.u0k_impl.customerInfoModify(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 预约申购 
	 * @return 结果
	 */
	public ISAppointmentPurchaseOutput appointmentPurchase(ISAppointmentPurchaseInput inputParam) {
		this.dealInput(inputParam);
		ISAppointmentPurchaseOutput outputParam = this.u0k_impl.appointmentPurchase(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 预约赎回 
	 * @return 结果
	 */
	public ISAppointmentRedeemOutput appointmentRedeem(ISAppointmentRedeemInput inputParam) {
		this.dealInput(inputParam);
		ISAppointmentRedeemOutput outputParam = this.u0k_impl.appointmentRedeem(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额查询 
	 * @return 结果
	 */
	public ISFixedInvestmentQueryOutput fixedInvestmentQuery(ISFixedInvestmentQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentQueryOutput outputParam = this.u0k_impl.fixedInvestmentQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额申购 
	 * @return 结果
	 */
	public ISFixedInvestmentPurchaseOutput fixedInvestmentPurchase(ISFixedInvestmentPurchaseInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentPurchaseOutput outputParam = this.u0k_impl.fixedInvestmentPurchase(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史交易申请查询 
	 * @return 结果
	 */
	public ISHistoryTransactionsApplicationListQueryOutput historyTransactionsApplicationListQuery(ISHistoryTransactionsApplicationListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHistoryTransactionsApplicationListQueryOutput outputParam = this.u0k_impl.historyTransactionsApplicationListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 当日交易申请查询 当日委托
	 * @return 结果
	 */
	public ISTodayTransactionsApplicationListQueryOutput todayTransactionsApplicationListQuery(ISTodayTransactionsApplicationListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTodayTransactionsApplicationListQueryOutput outputParam = this.u0u_impl.todayTransactionsApplicationListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 明细查询 
	 * @return 结果
	 */
	public ISTransactionRecordDetailQueryOutput transactionRecordDetailQuery(ISTransactionRecordDetailQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionRecordDetailQueryOutput outputParam = this.u0u_impl.transactionRecordDetailQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 更新Session中的用户 
	 * @return 结果
	 */
	public ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISSessionUserUpdateOutput outputParam = this.b00_impl.sessionUserUpdate(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询专户剩余额度 E006
	 * @return 结果
	 */
	public ISSpecialAccBalanceQueryOutput specialAccBalanceQuery(ISSpecialAccBalanceQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccBalanceQueryOutput outputParam = this.u0u_impl.specialAccBalanceQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询电子合同信息 E001
	 * @return 结果
	 */
	public ISEletricContractQueryOutput eletricContractQuery(ISEletricContractQueryInput inputParam) {
		this.dealInput(inputParam);
		ISEletricContractQueryOutput outputParam = this.u1a_impl.eletricContractQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 签署电子合同或风险揭示书 
	 * @return 结果
	 */
	public ISSpeciElectronicContractSignOutput speciElectronicContractSign(ISSpeciElectronicContractSignInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciElectronicContractSignOutput outputParam = this.u1a_impl.speciElectronicContractSign(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 历史分红查询 S005
	 * @return 结果
	 */
	public ISHisBonusListQueryOutput hisBonusListQuery(ISHisBonusListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHisBonusListQueryOutput outputParam = this.u1a_impl.hisBonusListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 盈亏查询 S013
	 * @return 结果
	 */
	public ISProfitQueryOutput profitQuery(ISProfitQueryInput inputParam) {
		this.dealInput(inputParam);
		ISProfitQueryOutput outputParam = this.u1a_impl.profitQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 可定制信息查询 V007
	 * @return 结果
	 */
	public ISServeQueryOutput serveQuery(ISServeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISServeQueryOutput outputParam = this.u1k_impl.serveQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定制信息 V008
	 * @return 结果
	 */
	public ISServeCustomizeOutput serveCustomize(ISServeCustomizeInput inputParam) {
		this.dealInput(inputParam);
		ISServeCustomizeOutput outputParam = this.u1k_impl.serveCustomize(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 重置交易密码 C029
	 * @return 结果
	 */
	public ISPasswordResetOutput passwordReset(ISPasswordResetInput inputParam) {
		this.dealInput(inputParam);
		ISPasswordResetOutput outputParam = this.u1k_impl.passwordReset(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 检查版本 
	 * @return 结果
	 */
	public ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam) {
		this.dealInput(inputParam);
		ISVersionCheckOutput outputParam = this.b00_impl.versionCheck(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 登录 
	 * @return 结果
	 */
	public ISLoginOutput login(ISLoginInput inputParam) {
		this.dealInput(inputParam);
		ISLoginOutput outputParam = this.b00_impl.login(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 登出 
	 * @return 结果
	 */
	public ISLogoutOutput logout(ISLogoutInput inputParam) {
		this.dealInput(inputParam);
		ISLogoutOutput outputParam = this.b00_impl.logout(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 字典查询 
	 * @return 结果
	 */
	public ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISBaseInfoQueryOutput outputParam = this.b00_impl.baseInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 密码修改 
	 * @return 结果
	 */
	public ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam) {
		this.dealInput(inputParam);
		ISPasswordModifyOutput outputParam = this.u00_impl.passwordModify(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询交易账号列表 
	 * @return 结果
	 */
	public ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsAccountListQueryOutput outputParam = this.u00_impl.transactionsAccountListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金份额查询 
	 * @return 结果
	 */
	public ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundShareListQueryOutput outputParam = this.u00_impl.fundShareListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收益变动曲线 
	 * @return 结果
	 */
	public ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISIncomeChangeListQueryOutput outputParam = this.u00_impl.incomeChangeListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金购买信息 
	 * @return 结果
	 */
	public ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundBuyInfoQueryOutput outputParam = this.u00_impl.fundBuyInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金交易费率查询 
	 * @return 结果
	 */
	public ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundTransactionsFeeQueryOutput outputParam = this.u00_impl.fundTransactionsFeeQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 购买基金 
	 * @return 结果
	 */
	public ISFundBuyOutput fundBuy(ISFundBuyInput inputParam) {
		this.dealInput(inputParam);
		ISFundBuyOutput outputParam = this.u0a_impl.fundBuy(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 * @return 结果
	 */
	public ISFundSmartInvestmentStateUpdateOutput fundSmartInvestmentStateUpdate(ISFundSmartInvestmentStateUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISFundSmartInvestmentStateUpdateOutput outputParam = this.u0k_impl.fundSmartInvestmentStateUpdate(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回 
	 * @return 结果
	 */
	public ISFundRedemptionOutput fundRedemption(ISFundRedemptionInput inputParam) {
		this.dealInput(inputParam);
		ISFundRedemptionOutput outputParam = this.u0a_impl.fundRedemption(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金转换 
	 * @return 结果
	 */
	public ISFundTransferOutput fundTransfer(ISFundTransferInput inputParam) {
		this.dealInput(inputParam);
		ISFundTransferOutput outputParam = this.u0a_impl.fundTransfer(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 撤单 
	 * @return 结果
	 */
	public ISTransactionCancelOutput transactionCancel(ISTransactionCancelInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionCancelOutput outputParam = this.u0a_impl.transactionCancel(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	public ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialFundListQueryOutput outputParam = this.n1a_impl.specialFundListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯分类 
	 * @return 结果
	 */
	public ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsCategoryListQueryOutput outputParam = this.n00_impl.newsCategoryListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsListQueryOutput outputParam = this.n00_impl.newsListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资讯内容 
	 * @return 结果
	 */
	public ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNewsQueryOutput outputParam = this.n00_impl.newsQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询资源 
	 * @return 结果
	 */
	public ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam) {
		this.dealInput(inputParam);
		ISResourceQueryOutput outputParam = this.n00_impl.resourceQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金列表 
	 * @return 结果
	 */
	public ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundListQueryOutput outputParam = this.n00_impl.fundListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金净值 
	 * @return 结果
	 */
	public ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam) {
		this.dealInput(inputParam);
		ISNetValueQueryOutput outputParam = this.n00_impl.netValueQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金历史净值 
	 * @return 结果
	 */
	public ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam) {
		this.dealInput(inputParam);
		ISHisNetValueQueryOutput outputParam = this.n00_impl.hisNetValueQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金费用 
	 * @return 结果
	 */
	public ISFundFeeQueryOutput fundFeeQuery(ISFundFeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundFeeQueryOutput outputParam = this.n0a_impl.fundFeeQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundInfoQueryOutput fundInfoQuery(ISFundInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundInfoQueryOutput outputParam = this.n0a_impl.fundInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundCombineInvestmentAssetsListQueryOutput fundCombineInvestmentAssetsListQuery(ISFundCombineInvestmentAssetsListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundCombineInvestmentAssetsListQueryOutput outputParam = this.n0a_impl.fundCombineInvestmentAssetsListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询交易帮助信息 
	 * @return 结果
	 */
	public ISTransactionsHelpQueryOutput transactionsHelpQuery(ISTransactionsHelpQueryInput inputParam) {
		this.dealInput(inputParam);
		ISTransactionsHelpQueryOutput outputParam = this.n0k_impl.transactionsHelpQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询基金显示列表 
	 * @return 结果
	 */
	public ISFundShowListQueryOutput fundShowListQuery(ISFundShowListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundShowListQueryOutput outputParam = this.n0k_impl.fundShowListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询可撤单列表 
	 * @return 结果
	 */
	public ISQueryCanCancelTransactionListOutput queryCanCancelTransactionList(ISQueryCanCancelTransactionListInput inputParam) {
		this.dealInput(inputParam);
		ISQueryCanCancelTransactionListOutput outputParam = this.u0u_impl.queryCanCancelTransactionList(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 获取专户用户授权信息 E002
	 * @return 结果
	 */
	public ISSpecialAccAuthQueryOutput specialAccAuthQuery(ISSpecialAccAuthQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccAuthQueryOutput outputParam = this.u0u_impl.specialAccAuthQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 新增专户用户授权 E003
	 * @return 结果
	 */
	public ISSpecialAccAuthAddOutput specialAccAuthAdd(ISSpecialAccAuthAddInput inputParam) {
		this.dealInput(inputParam);
		ISSpecialAccAuthAddOutput outputParam = this.u0u_impl.specialAccAuthAdd(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询专户人数限制 
	 * @return 结果
	 */
	public ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciBuyLimitQueryOutput outputParam = this.n0u_impl.speciBuyLimitQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 专户基金详细信息查询 S060
	 * @return 结果
	 */
	public ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISSpeciFundInfoQueryOutput outputParam = this.n0u_impl.speciFundInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 销交易账号 C028
	 * @return 结果
	 */
	public ISTradeAccCancelOutput tradeAccCancel(ISTradeAccCancelInput inputParam) {
		this.dealInput(inputParam);
		ISTradeAccCancelOutput outputParam = this.u1a_impl.tradeAccCancel(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金收益率查询 S037
	 * @return 结果
	 */
	public ISFundIncomeRateQueryOutput fundIncomeRateQuery(ISFundIncomeRateQueryInput inputParam) {
		this.dealInput(inputParam);
		ISFundIncomeRateQueryOutput outputParam = this.n1a_impl.fundIncomeRateQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 定期定额转换 I008
	 * @return 结果
	 */
	public ISFixedInvestmentTransferOutput fixedInvestmentTransfer(ISFixedInvestmentTransferInput inputParam) {
		this.dealInput(inputParam);
		ISFixedInvestmentTransferOutput outputParam = this.u1a_impl.fixedInvestmentTransfer(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 短期理财到期日查询 S035
	 * @return 结果
	 */
	public ISShortDateQueryOutput shortDateQuery(ISShortDateQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShortDateQueryOutput outputParam = this.u1a_impl.shortDateQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 短期理财明细查询 S020
	 * @return 结果
	 */
	public ISShortMoneyDetailQueryOutput shortMoneyDetailQuery(ISShortMoneyDetailQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShortMoneyDetailQueryOutput outputParam = this.u1a_impl.shortMoneyDetailQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 数据中心客户信息查询 C025
	 * @return 结果
	 */
	public ISDataCenterCustomerInfoQueryOutput dataCenterCustomerInfoQuery(ISDataCenterCustomerInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		ISDataCenterCustomerInfoQueryOutput outputParam = this.u1a_impl.dataCenterCustomerInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 份额流水查询 S058
	 * @return 结果
	 */
	public ISShareWaterQueryOutput shareWaterQuery(ISShareWaterQueryInput inputParam) {
		this.dealInput(inputParam);
		ISShareWaterQueryOutput outputParam = this.u1a_impl.shareWaterQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 对账单定制查询 V005
	 * @return 结果
	 */
	public ISCheckSheetQueryOutput checkSheetQuery(ISCheckSheetQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCheckSheetQueryOutput outputParam = this.u1k_impl.checkSheetQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 对账单定制 V006
	 * @return 结果
	 */
	public ISCheckSheetCustomizeOutput checkSheetCustomize(ISCheckSheetCustomizeInput inputParam) {
		this.dealInput(inputParam);
		ISCheckSheetCustomizeOutput outputParam = this.u1k_impl.checkSheetCustomize(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 客户角色查询 C053
	 * @return 结果
	 */
	public ISUserRoleQueryOutput userRoleQuery(ISUserRoleQueryInput inputParam) {
		this.dealInput(inputParam);
		ISUserRoleQueryOutput outputParam = this.u1k_impl.userRoleQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银联通开户签名生成 B026
	 * @return 结果
	 */
	public ISChinaPayMobileOpenAccoOrderOutput chinaPayMobileOpenAccoOrder(ISChinaPayMobileOpenAccoOrderInput inputParam) {
		this.dealInput(inputParam);
		ISChinaPayMobileOpenAccoOrderOutput outputParam = this.n1a_impl.chinaPayMobileOpenAccoOrder(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银联通开户返回信息验证 B027
	 * @return 结果
	 */
	public ISChinapaymobilebackverifyOutput chinapaymobilebackverify(ISChinapaymobilebackverifyInput inputParam) {
		this.dealInput(inputParam);
		ISChinapaymobilebackverifyOutput outputParam = this.n1a_impl.chinapaymobilebackverify(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 交易日期查询 
	 * @return 结果
	 */
	public ISFundTradeDatequeryOutput fundTradeDatequery(ISFundTradeDatequeryInput inputParam) {
		this.dealInput(inputParam);
		ISFundTradeDatequeryOutput outputParam = this.n1a_impl.fundTradeDatequery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 变更银行卡 B016
	 * @return 结果
	 */
	public ISBankCardChangeOutput bankCardChange(ISBankCardChangeInput inputParam) {
		this.dealInput(inputParam);
		ISBankCardChangeOutput outputParam = this.n1a_impl.bankCardChange(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 * @return 结果
	 */
	public ISPayOrPayeeAddOutput payOrPayeeAdd(ISPayOrPayeeAddInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeAddOutput outputParam = this.m0a_impl.payOrPayeeAdd(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收款或付款 
	 * @return 结果
	 */
	public ISPayOrPayeeOutput payOrPayee(ISPayOrPayeeInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeOutput outputParam = this.m0a_impl.payOrPayee(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 支付查询 
	 * @return 结果
	 */
	public ISPayOrPayeeQueryOutput payOrPayeeQuery(ISPayOrPayeeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeQueryOutput outputParam = this.m0a_impl.payOrPayeeQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 取消收付款 
	 * @return 结果
	 */
	public ISPayOrPayeeCancelOutput payOrPayeeCancel(ISPayOrPayeeCancelInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeCancelOutput outputParam = this.m0a_impl.payOrPayeeCancel(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询收付款交易记录 
	 * @return 结果
	 */
	public ISPayListQueryOutput payListQuery(ISPayListQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayListQueryOutput outputParam = this.m0a_impl.payListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询客户联系人 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsQueryOutput customerFrequentContactsQuery(ISCustomerFrequentContactsQueryInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerFrequentContactsQueryOutput outputParam = this.m0a_impl.customerFrequentContactsQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 修改客户联系人备注和标记 
	 * @return 结果
	 */
	public ISFrequentContactsUpdateOutput frequentContactsUpdate(ISFrequentContactsUpdateInput inputParam) {
		this.dealInput(inputParam);
		ISFrequentContactsUpdateOutput outputParam = this.m0a_impl.frequentContactsUpdate(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收付款交易记录首页 
	 * @return 结果
	 */
	public ISPayHomeQueryOutput payHomeQuery(ISPayHomeQueryInput inputParam) {
		this.dealInput(inputParam);
		ISPayHomeQueryOutput outputParam = this.m0a_impl.payHomeQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 收付款交易记录详情 
	 * @return 结果
	 */
	public ISPayInfoOutput payInfo(ISPayInfoInput inputParam) {
		this.dealInput(inputParam);
		ISPayInfoOutput outputParam = this.m0a_impl.payInfo(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 联系人详情 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsInfoOutput customerFrequentContactsInfo(ISCustomerFrequentContactsInfoInput inputParam) {
		this.dealInput(inputParam);
		ISCustomerFrequentContactsInfoOutput outputParam = this.m0k_impl.customerFrequentContactsInfo(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 消息列表 
	 * @return 结果
	 */
	public ISInformationListOutput informationList(ISInformationListInput inputParam) {
		this.dealInput(inputParam);
		ISInformationListOutput outputParam = this.u1E_impl.informationList(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 消息内容 
	 * @return 结果
	 */
	public ISInfomationContentOutput infomationContent(ISInfomationContentInput inputParam) {
		this.dealInput(inputParam);
		ISInfomationContentOutput outputParam = this.u1E_impl.infomationContent(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 删除银行卡 
	 * @return 结果
	 */
	public ISCardNoDelOutput cardNoDel(ISCardNoDelInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoDelOutput outputParam = this.u1E_impl.cardNoDel(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 银行卡列表 
	 * @return 结果
	 */
	public ISCardNoListOutput cardNoList(ISCardNoListInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoListOutput outputParam = this.u1E_impl.cardNoList(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 保存银行卡 
	 * @return 结果
	 */
	public ISCardNoSaveOutput cardNoSave(ISCardNoSaveInput inputParam) {
		this.dealInput(inputParam);
		ISCardNoSaveOutput outputParam = this.u1E_impl.cardNoSave(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 我的红包 
	 * @return 结果
	 */
	public ISMyGiftOutput myGift(ISMyGiftInput inputParam) {
		this.dealInput(inputParam);
		ISMyGiftOutput outputParam = this.u1E_impl.myGift(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 验证码验证 
	 * @return 结果
	 */
	public ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam) {
		this.dealInput(inputParam);
		ISValidInfoValidOutput outputParam = this.n0u_impl.validInfoValid(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 同步用户账户数据 
	 * @return 结果
	 */
	public ISSyncUserAccountOutput syncUserAccount(ISSyncUserAccountInput inputParam) {
		this.dealInput(inputParam);
		ISSyncUserAccountOutput outputParam = this.m0a_impl.syncUserAccount(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 判断当前用户的收付款开通情况 
	 * @return 结果
	 */
	public ISPayOrPayeeJudgeOutput payOrPayeeJudge(ISPayOrPayeeJudgeInput inputParam) {
		this.dealInput(inputParam);
		ISPayOrPayeeJudgeOutput outputParam = this.m0k_impl.payOrPayeeJudge(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 * @return 结果
	 */
	public ISSupportPayTransactionsAccountOutput supportPayTransactionsAccount(ISSupportPayTransactionsAccountInput inputParam) {
		this.dealInput(inputParam);
		ISSupportPayTransactionsAccountOutput outputParam = this.m0k_impl.supportPayTransactionsAccount(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询现金宝资产 
	 * @return 结果
	 */
	public ISQueryMoneyAssetsOutput queryMoneyAssets(ISQueryMoneyAssetsInput inputParam) {
		this.dealInput(inputParam);
		ISQueryMoneyAssetsOutput outputParam = this.m0k_impl.queryMoneyAssets(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
}
