package topdeep.commonfund.biz.gateway.impl;
import topdeep.commonfund.entity.gateway.*;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
import common.util.StringUtils;
/**
 * 基金网关方法接口代理
 */
public class FundBizReExecuteProxy extends FundBizBaseProxy {
	
	/**
	 * 根据类别名称查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListByCategoryNameQueryOutput newsListByCategoryNameQuery(ISNewsListByCategoryNameQueryInput inputParam) {
		ISNewsListByCategoryNameQueryOutput outputParam = super.newsListByCategoryNameQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.newsListByCategoryNameQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 相关工作日查询 
	 * @return 结果
	 */
	public ISWorkDayQueryOutput workDayQuery(ISWorkDayQueryInput inputParam) {
		ISWorkDayQueryOutput outputParam = super.workDayQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.workDayQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询风险测试题库 
	 * @return 结果
	 */
	public ISRiskEvaluationExamQueryOutput riskEvaluationExamQuery(ISRiskEvaluationExamQueryInput inputParam) {
		ISRiskEvaluationExamQueryOutput outputParam = super.riskEvaluationExamQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.riskEvaluationExamQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 风险测评 
	 * @return 结果
	 */
	public ISRiskEvaluationOutput riskEvaluation(ISRiskEvaluationInput inputParam) {
		ISRiskEvaluationOutput outputParam = super.riskEvaluation(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.riskEvaluation(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 * @return 结果
	 */
	public ISFastOpenAccountOutput fastOpenAccount(ISFastOpenAccountInput inputParam) {
		ISFastOpenAccountOutput outputParam = super.fastOpenAccount(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fastOpenAccount(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 快速开户功能判断查询 
	 * @return 结果
	 */
	public ISFastOpenAccountConditionQueryOutput fastOpenAccountConditionQuery(ISFastOpenAccountConditionQueryInput inputParam) {
		ISFastOpenAccountConditionQueryOutput outputParam = super.fastOpenAccountConditionQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fastOpenAccountConditionQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 * @return 结果
	 */
	public ISTransactionsProcessDayQueryOutput transactionsProcessDayQuery(ISTransactionsProcessDayQueryInput inputParam) {
		ISTransactionsProcessDayQueryOutput outputParam = super.transactionsProcessDayQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionsProcessDayQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询支持开户的银行列表 
	 * @return 结果
	 */
	public ISSupportOpenAccountBankListQueryOutput supportOpenAccountBankListQuery(ISSupportOpenAccountBankListQueryInput inputParam) {
		ISSupportOpenAccountBankListQueryOutput outputParam = super.supportOpenAccountBankListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.supportOpenAccountBankListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 发送验证信息接口 
	 * @return 结果
	 */
	public ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam) {
		ISValidInfoSendOutput outputParam = super.validInfoSend(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.validInfoSend(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 历史确认查询 
	 * @return 结果
	 */
	public ISHistoryConfirmQueryOutput historyConfirmQuery(ISHistoryConfirmQueryInput inputParam) {
		ISHistoryConfirmQueryOutput outputParam = super.historyConfirmQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.historyConfirmQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 个人客户信息查询 
	 * @return 结果
	 */
	public ISCustomerInfoQueryOutput customerInfoQuery(ISCustomerInfoQueryInput inputParam) {
		ISCustomerInfoQueryOutput outputParam = super.customerInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.customerInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 个人客户信息修改 
	 * @return 结果
	 */
	public ISCustomerInfoModifyOutput customerInfoModify(ISCustomerInfoModifyInput inputParam) {
		ISCustomerInfoModifyOutput outputParam = super.customerInfoModify(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.customerInfoModify(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 预约申购 
	 * @return 结果
	 */
	public ISAppointmentPurchaseOutput appointmentPurchase(ISAppointmentPurchaseInput inputParam) {
		ISAppointmentPurchaseOutput outputParam = super.appointmentPurchase(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.appointmentPurchase(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 预约赎回 
	 * @return 结果
	 */
	public ISAppointmentRedeemOutput appointmentRedeem(ISAppointmentRedeemInput inputParam) {
		ISAppointmentRedeemOutput outputParam = super.appointmentRedeem(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.appointmentRedeem(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 定期定额查询 
	 * @return 结果
	 */
	public ISFixedInvestmentQueryOutput fixedInvestmentQuery(ISFixedInvestmentQueryInput inputParam) {
		ISFixedInvestmentQueryOutput outputParam = super.fixedInvestmentQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fixedInvestmentQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 定期定额申购 
	 * @return 结果
	 */
	public ISFixedInvestmentPurchaseOutput fixedInvestmentPurchase(ISFixedInvestmentPurchaseInput inputParam) {
		ISFixedInvestmentPurchaseOutput outputParam = super.fixedInvestmentPurchase(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fixedInvestmentPurchase(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 历史交易申请查询 
	 * @return 结果
	 */
	public ISHistoryTransactionsApplicationListQueryOutput historyTransactionsApplicationListQuery(ISHistoryTransactionsApplicationListQueryInput inputParam) {
		ISHistoryTransactionsApplicationListQueryOutput outputParam = super.historyTransactionsApplicationListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.historyTransactionsApplicationListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 当日交易申请查询 当日委托
	 * @return 结果
	 */
	public ISTodayTransactionsApplicationListQueryOutput todayTransactionsApplicationListQuery(ISTodayTransactionsApplicationListQueryInput inputParam) {
		ISTodayTransactionsApplicationListQueryOutput outputParam = super.todayTransactionsApplicationListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.todayTransactionsApplicationListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 明细查询 
	 * @return 结果
	 */
	public ISTransactionRecordDetailQueryOutput transactionRecordDetailQuery(ISTransactionRecordDetailQueryInput inputParam) {
		ISTransactionRecordDetailQueryOutput outputParam = super.transactionRecordDetailQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionRecordDetailQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 更新Session中的用户 
	 * @return 结果
	 */
	public ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam) {
		ISSessionUserUpdateOutput outputParam = super.sessionUserUpdate(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.sessionUserUpdate(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询专户剩余额度 E006
	 * @return 结果
	 */
	public ISSpecialAccBalanceQueryOutput specialAccBalanceQuery(ISSpecialAccBalanceQueryInput inputParam) {
		ISSpecialAccBalanceQueryOutput outputParam = super.specialAccBalanceQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.specialAccBalanceQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询电子合同信息 E001
	 * @return 结果
	 */
	public ISEletricContractQueryOutput eletricContractQuery(ISEletricContractQueryInput inputParam) {
		ISEletricContractQueryOutput outputParam = super.eletricContractQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.eletricContractQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 签署电子合同或风险揭示书 
	 * @return 结果
	 */
	public ISSpeciElectronicContractSignOutput speciElectronicContractSign(ISSpeciElectronicContractSignInput inputParam) {
		ISSpeciElectronicContractSignOutput outputParam = super.speciElectronicContractSign(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.speciElectronicContractSign(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 历史分红查询 S005
	 * @return 结果
	 */
	public ISHisBonusListQueryOutput hisBonusListQuery(ISHisBonusListQueryInput inputParam) {
		ISHisBonusListQueryOutput outputParam = super.hisBonusListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.hisBonusListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 盈亏查询 S013
	 * @return 结果
	 */
	public ISProfitQueryOutput profitQuery(ISProfitQueryInput inputParam) {
		ISProfitQueryOutput outputParam = super.profitQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.profitQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 可定制信息查询 V007
	 * @return 结果
	 */
	public ISServeQueryOutput serveQuery(ISServeQueryInput inputParam) {
		ISServeQueryOutput outputParam = super.serveQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.serveQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 定制信息 V008
	 * @return 结果
	 */
	public ISServeCustomizeOutput serveCustomize(ISServeCustomizeInput inputParam) {
		ISServeCustomizeOutput outputParam = super.serveCustomize(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.serveCustomize(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 重置交易密码 C029
	 * @return 结果
	 */
	public ISPasswordResetOutput passwordReset(ISPasswordResetInput inputParam) {
		ISPasswordResetOutput outputParam = super.passwordReset(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.passwordReset(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 检查版本 
	 * @return 结果
	 */
	public ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam) {
		ISVersionCheckOutput outputParam = super.versionCheck(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.versionCheck(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 登录 
	 * @return 结果
	 */
	public ISLoginOutput login(ISLoginInput inputParam) {
		ISLoginOutput outputParam = super.login(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.login(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 登出 
	 * @return 结果
	 */
	public ISLogoutOutput logout(ISLogoutInput inputParam) {
		ISLogoutOutput outputParam = super.logout(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.logout(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 字典查询 
	 * @return 结果
	 */
	public ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam) {
		ISBaseInfoQueryOutput outputParam = super.baseInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.baseInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 密码修改 
	 * @return 结果
	 */
	public ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam) {
		ISPasswordModifyOutput outputParam = super.passwordModify(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.passwordModify(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询交易账号列表 
	 * @return 结果
	 */
	public ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam) {
		ISTransactionsAccountListQueryOutput outputParam = super.transactionsAccountListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionsAccountListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金份额查询 
	 * @return 结果
	 */
	public ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam) {
		ISFundShareListQueryOutput outputParam = super.fundShareListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundShareListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 收益变动曲线 
	 * @return 结果
	 */
	public ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam) {
		ISIncomeChangeListQueryOutput outputParam = super.incomeChangeListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.incomeChangeListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金购买信息 
	 * @return 结果
	 */
	public ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam) {
		ISFundBuyInfoQueryOutput outputParam = super.fundBuyInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundBuyInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金交易费率查询 
	 * @return 结果
	 */
	public ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam) {
		ISFundTransactionsFeeQueryOutput outputParam = super.fundTransactionsFeeQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundTransactionsFeeQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 购买基金 
	 * @return 结果
	 */
	public ISFundBuyOutput fundBuy(ISFundBuyInput inputParam) {
		ISFundBuyOutput outputParam = super.fundBuy(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundBuy(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 * @return 结果
	 */
	public ISFundSmartInvestmentStateUpdateOutput fundSmartInvestmentStateUpdate(ISFundSmartInvestmentStateUpdateInput inputParam) {
		ISFundSmartInvestmentStateUpdateOutput outputParam = super.fundSmartInvestmentStateUpdate(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundSmartInvestmentStateUpdate(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金赎回 
	 * @return 结果
	 */
	public ISFundRedemptionOutput fundRedemption(ISFundRedemptionInput inputParam) {
		ISFundRedemptionOutput outputParam = super.fundRedemption(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundRedemption(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金转换 
	 * @return 结果
	 */
	public ISFundTransferOutput fundTransfer(ISFundTransferInput inputParam) {
		ISFundTransferOutput outputParam = super.fundTransfer(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundTransfer(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 撤单 
	 * @return 结果
	 */
	public ISTransactionCancelOutput transactionCancel(ISTransactionCancelInput inputParam) {
		ISTransactionCancelOutput outputParam = super.transactionCancel(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionCancel(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	public ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam) {
		ISSpecialFundListQueryOutput outputParam = super.specialFundListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.specialFundListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询资讯分类 
	 * @return 结果
	 */
	public ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam) {
		ISNewsCategoryListQueryOutput outputParam = super.newsCategoryListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.newsCategoryListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam) {
		ISNewsListQueryOutput outputParam = super.newsListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.newsListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询资讯内容 
	 * @return 结果
	 */
	public ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam) {
		ISNewsQueryOutput outputParam = super.newsQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.newsQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询资源 
	 * @return 结果
	 */
	public ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam) {
		ISResourceQueryOutput outputParam = super.resourceQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.resourceQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金列表 
	 * @return 结果
	 */
	public ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam) {
		ISFundListQueryOutput outputParam = super.fundListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金净值 
	 * @return 结果
	 */
	public ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam) {
		ISNetValueQueryOutput outputParam = super.netValueQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.netValueQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金历史净值 
	 * @return 结果
	 */
	public ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam) {
		ISHisNetValueQueryOutput outputParam = super.hisNetValueQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.hisNetValueQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金费用 
	 * @return 结果
	 */
	public ISFundFeeQueryOutput fundFeeQuery(ISFundFeeQueryInput inputParam) {
		ISFundFeeQueryOutput outputParam = super.fundFeeQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundFeeQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundInfoQueryOutput fundInfoQuery(ISFundInfoQueryInput inputParam) {
		ISFundInfoQueryOutput outputParam = super.fundInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundCombineInvestmentAssetsListQueryOutput fundCombineInvestmentAssetsListQuery(ISFundCombineInvestmentAssetsListQueryInput inputParam) {
		ISFundCombineInvestmentAssetsListQueryOutput outputParam = super.fundCombineInvestmentAssetsListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundCombineInvestmentAssetsListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询交易帮助信息 
	 * @return 结果
	 */
	public ISTransactionsHelpQueryOutput transactionsHelpQuery(ISTransactionsHelpQueryInput inputParam) {
		ISTransactionsHelpQueryOutput outputParam = super.transactionsHelpQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionsHelpQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询基金显示列表 
	 * @return 结果
	 */
	public ISFundShowListQueryOutput fundShowListQuery(ISFundShowListQueryInput inputParam) {
		ISFundShowListQueryOutput outputParam = super.fundShowListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundShowListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询可撤单列表 
	 * @return 结果
	 */
	public ISQueryCanCancelTransactionListOutput queryCanCancelTransactionList(ISQueryCanCancelTransactionListInput inputParam) {
		ISQueryCanCancelTransactionListOutput outputParam = super.queryCanCancelTransactionList(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.queryCanCancelTransactionList(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 获取专户用户授权信息 E002
	 * @return 结果
	 */
	public ISSpecialAccAuthQueryOutput specialAccAuthQuery(ISSpecialAccAuthQueryInput inputParam) {
		ISSpecialAccAuthQueryOutput outputParam = super.specialAccAuthQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.specialAccAuthQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 新增专户用户授权 E003
	 * @return 结果
	 */
	public ISSpecialAccAuthAddOutput specialAccAuthAdd(ISSpecialAccAuthAddInput inputParam) {
		ISSpecialAccAuthAddOutput outputParam = super.specialAccAuthAdd(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.specialAccAuthAdd(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询专户人数限制 
	 * @return 结果
	 */
	public ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam) {
		ISSpeciBuyLimitQueryOutput outputParam = super.speciBuyLimitQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.speciBuyLimitQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 专户基金详细信息查询 S060
	 * @return 结果
	 */
	public ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam) {
		ISSpeciFundInfoQueryOutput outputParam = super.speciFundInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.speciFundInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 销交易账号 C028
	 * @return 结果
	 */
	public ISTradeAccCancelOutput tradeAccCancel(ISTradeAccCancelInput inputParam) {
		ISTradeAccCancelOutput outputParam = super.tradeAccCancel(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.tradeAccCancel(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金收益率查询 S037
	 * @return 结果
	 */
	public ISFundIncomeRateQueryOutput fundIncomeRateQuery(ISFundIncomeRateQueryInput inputParam) {
		ISFundIncomeRateQueryOutput outputParam = super.fundIncomeRateQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundIncomeRateQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 定期定额转换 I008
	 * @return 结果
	 */
	public ISFixedInvestmentTransferOutput fixedInvestmentTransfer(ISFixedInvestmentTransferInput inputParam) {
		ISFixedInvestmentTransferOutput outputParam = super.fixedInvestmentTransfer(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fixedInvestmentTransfer(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 短期理财到期日查询 S035
	 * @return 结果
	 */
	public ISShortDateQueryOutput shortDateQuery(ISShortDateQueryInput inputParam) {
		ISShortDateQueryOutput outputParam = super.shortDateQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.shortDateQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 短期理财明细查询 S020
	 * @return 结果
	 */
	public ISShortMoneyDetailQueryOutput shortMoneyDetailQuery(ISShortMoneyDetailQueryInput inputParam) {
		ISShortMoneyDetailQueryOutput outputParam = super.shortMoneyDetailQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.shortMoneyDetailQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 数据中心客户信息查询 C025
	 * @return 结果
	 */
	public ISDataCenterCustomerInfoQueryOutput dataCenterCustomerInfoQuery(ISDataCenterCustomerInfoQueryInput inputParam) {
		ISDataCenterCustomerInfoQueryOutput outputParam = super.dataCenterCustomerInfoQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.dataCenterCustomerInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 份额流水查询 S058
	 * @return 结果
	 */
	public ISShareWaterQueryOutput shareWaterQuery(ISShareWaterQueryInput inputParam) {
		ISShareWaterQueryOutput outputParam = super.shareWaterQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.shareWaterQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 对账单定制查询 V005
	 * @return 结果
	 */
	public ISCheckSheetQueryOutput checkSheetQuery(ISCheckSheetQueryInput inputParam) {
		ISCheckSheetQueryOutput outputParam = super.checkSheetQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.checkSheetQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 对账单定制 V006
	 * @return 结果
	 */
	public ISCheckSheetCustomizeOutput checkSheetCustomize(ISCheckSheetCustomizeInput inputParam) {
		ISCheckSheetCustomizeOutput outputParam = super.checkSheetCustomize(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.checkSheetCustomize(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 客户角色查询 C053
	 * @return 结果
	 */
	public ISUserRoleQueryOutput userRoleQuery(ISUserRoleQueryInput inputParam) {
		ISUserRoleQueryOutput outputParam = super.userRoleQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.userRoleQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 银联通开户签名生成 B026
	 * @return 结果
	 */
	public ISChinaPayMobileOpenAccoOrderOutput chinaPayMobileOpenAccoOrder(ISChinaPayMobileOpenAccoOrderInput inputParam) {
		ISChinaPayMobileOpenAccoOrderOutput outputParam = super.chinaPayMobileOpenAccoOrder(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.chinaPayMobileOpenAccoOrder(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 银联通开户返回信息验证 B027
	 * @return 结果
	 */
	public ISChinapaymobilebackverifyOutput chinapaymobilebackverify(ISChinapaymobilebackverifyInput inputParam) {
		ISChinapaymobilebackverifyOutput outputParam = super.chinapaymobilebackverify(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.chinapaymobilebackverify(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 交易日期查询 
	 * @return 结果
	 */
	public ISFundTradeDatequeryOutput fundTradeDatequery(ISFundTradeDatequeryInput inputParam) {
		ISFundTradeDatequeryOutput outputParam = super.fundTradeDatequery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundTradeDatequery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 变更银行卡 B016
	 * @return 结果
	 */
	public ISBankCardChangeOutput bankCardChange(ISBankCardChangeInput inputParam) {
		ISBankCardChangeOutput outputParam = super.bankCardChange(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.bankCardChange(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 * @return 结果
	 */
	public ISPayOrPayeeAddOutput payOrPayeeAdd(ISPayOrPayeeAddInput inputParam) {
		ISPayOrPayeeAddOutput outputParam = super.payOrPayeeAdd(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payOrPayeeAdd(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 收款或付款 
	 * @return 结果
	 */
	public ISPayOrPayeeOutput payOrPayee(ISPayOrPayeeInput inputParam) {
		ISPayOrPayeeOutput outputParam = super.payOrPayee(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payOrPayee(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 支付查询 
	 * @return 结果
	 */
	public ISPayOrPayeeQueryOutput payOrPayeeQuery(ISPayOrPayeeQueryInput inputParam) {
		ISPayOrPayeeQueryOutput outputParam = super.payOrPayeeQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payOrPayeeQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 取消收付款 
	 * @return 结果
	 */
	public ISPayOrPayeeCancelOutput payOrPayeeCancel(ISPayOrPayeeCancelInput inputParam) {
		ISPayOrPayeeCancelOutput outputParam = super.payOrPayeeCancel(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payOrPayeeCancel(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询收付款交易记录 
	 * @return 结果
	 */
	public ISPayListQueryOutput payListQuery(ISPayListQueryInput inputParam) {
		ISPayListQueryOutput outputParam = super.payListQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询客户联系人 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsQueryOutput customerFrequentContactsQuery(ISCustomerFrequentContactsQueryInput inputParam) {
		ISCustomerFrequentContactsQueryOutput outputParam = super.customerFrequentContactsQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.customerFrequentContactsQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 修改客户联系人备注和标记 
	 * @return 结果
	 */
	public ISFrequentContactsUpdateOutput frequentContactsUpdate(ISFrequentContactsUpdateInput inputParam) {
		ISFrequentContactsUpdateOutput outputParam = super.frequentContactsUpdate(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.frequentContactsUpdate(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 收付款交易记录首页 
	 * @return 结果
	 */
	public ISPayHomeQueryOutput payHomeQuery(ISPayHomeQueryInput inputParam) {
		ISPayHomeQueryOutput outputParam = super.payHomeQuery(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payHomeQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 收付款交易记录详情 
	 * @return 结果
	 */
	public ISPayInfoOutput payInfo(ISPayInfoInput inputParam) {
		ISPayInfoOutput outputParam = super.payInfo(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payInfo(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 联系人详情 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsInfoOutput customerFrequentContactsInfo(ISCustomerFrequentContactsInfoInput inputParam) {
		ISCustomerFrequentContactsInfoOutput outputParam = super.customerFrequentContactsInfo(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.customerFrequentContactsInfo(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 消息列表 
	 * @return 结果
	 */
	public ISInformationListOutput informationList(ISInformationListInput inputParam) {
		ISInformationListOutput outputParam = super.informationList(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.informationList(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 消息内容 
	 * @return 结果
	 */
	public ISInfomationContentOutput infomationContent(ISInfomationContentInput inputParam) {
		ISInfomationContentOutput outputParam = super.infomationContent(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.infomationContent(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 删除银行卡 
	 * @return 结果
	 */
	public ISCardNoDelOutput cardNoDel(ISCardNoDelInput inputParam) {
		ISCardNoDelOutput outputParam = super.cardNoDel(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.cardNoDel(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 银行卡列表 
	 * @return 结果
	 */
	public ISCardNoListOutput cardNoList(ISCardNoListInput inputParam) {
		ISCardNoListOutput outputParam = super.cardNoList(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.cardNoList(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 保存银行卡 
	 * @return 结果
	 */
	public ISCardNoSaveOutput cardNoSave(ISCardNoSaveInput inputParam) {
		ISCardNoSaveOutput outputParam = super.cardNoSave(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.cardNoSave(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 我的红包 
	 * @return 结果
	 */
	public ISMyGiftOutput myGift(ISMyGiftInput inputParam) {
		ISMyGiftOutput outputParam = super.myGift(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.myGift(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 验证码验证 
	 * @return 结果
	 */
	public ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam) {
		ISValidInfoValidOutput outputParam = super.validInfoValid(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.validInfoValid(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 同步用户账户数据 
	 * @return 结果
	 */
	public ISSyncUserAccountOutput syncUserAccount(ISSyncUserAccountInput inputParam) {
		ISSyncUserAccountOutput outputParam = super.syncUserAccount(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.syncUserAccount(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 判断当前用户的收付款开通情况 
	 * @return 结果
	 */
	public ISPayOrPayeeJudgeOutput payOrPayeeJudge(ISPayOrPayeeJudgeInput inputParam) {
		ISPayOrPayeeJudgeOutput outputParam = super.payOrPayeeJudge(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.payOrPayeeJudge(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 * @return 结果
	 */
	public ISSupportPayTransactionsAccountOutput supportPayTransactionsAccount(ISSupportPayTransactionsAccountInput inputParam) {
		ISSupportPayTransactionsAccountOutput outputParam = super.supportPayTransactionsAccount(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.supportPayTransactionsAccount(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询现金宝资产 
	 * @return 结果
	 */
	public ISQueryMoneyAssetsOutput queryMoneyAssets(ISQueryMoneyAssetsInput inputParam) {
		ISQueryMoneyAssetsOutput outputParam = super.queryMoneyAssets(inputParam);
		if ((FundErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.queryMoneyAssets(inputParam);
		}
		else {
			return outputParam;
		}
	}
}
