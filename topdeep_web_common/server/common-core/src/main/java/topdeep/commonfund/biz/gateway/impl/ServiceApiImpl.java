package topdeep.commonfund.biz.gateway.impl;
import topdeep.commonfund.biz.gateway.ServiceApi;
import topdeep.commonfund.biz.gateway.impl.ServiceApiImplBase;
import topdeep.commonfund.entity.gateway.*;
import topdeep.commonfund.entity.gateway.def.*;
import common.util.*;
import flexjson.*;
import topdeep.commonfund.biz.gateway.FundBiz_n0k;
import topdeep.commonfund.biz.gateway.FundBiz_u0a;
import topdeep.commonfund.biz.gateway.FundBiz_n0u;
import topdeep.commonfund.biz.gateway.FundBiz_u0k;
import topdeep.commonfund.biz.gateway.FundBiz_u0u;
import topdeep.commonfund.biz.gateway.FundBiz_b00;
import topdeep.commonfund.biz.gateway.FundBiz_u1a;
import topdeep.commonfund.biz.gateway.FundBiz_u1k;
import topdeep.commonfund.biz.gateway.FundBiz_u00;
import topdeep.commonfund.biz.gateway.FundBiz_n1a;
import topdeep.commonfund.biz.gateway.FundBiz_n00;
import topdeep.commonfund.biz.gateway.FundBiz_n0a;
import topdeep.commonfund.biz.gateway.FundBiz_m0a;
import topdeep.commonfund.biz.gateway.FundBiz_m0k;
import topdeep.commonfund.biz.gateway.FundBiz_u1E;
/**
 * 基金网关服务接口
 */
public class ServiceApiImpl extends ServiceApiImplBase implements ServiceApi {
	
	public String execute(String inputParam) {
		return super.execute(inputParam);
	}
	
	public ISBaseOutput execute(ISBaseInput input) {
		if ("n0o".equals(input.getZ_funcCode())) {
			return this.newsListByCategoryNameQuery(input);
		}
		if ("n0p".equals(input.getZ_funcCode())) {
			return this.workDayQuery(input);
		}
		if ("u0f".equals(input.getZ_funcCode())) {
			return this.riskEvaluationExamQuery(input);
		}
		if ("u0g".equals(input.getZ_funcCode())) {
			return this.riskEvaluation(input);
		}
		if ("n0q".equals(input.getZ_funcCode())) {
			return this.fastOpenAccount(input);
		}
		if ("n0r".equals(input.getZ_funcCode())) {
			return this.fastOpenAccountConditionQuery(input);
		}
		if ("n0s".equals(input.getZ_funcCode())) {
			return this.transactionsProcessDayQuery(input);
		}
		if ("n0t".equals(input.getZ_funcCode())) {
			return this.supportOpenAccountBankListQuery(input);
		}
		if ("n0v".equals(input.getZ_funcCode())) {
			return this.validInfoSend(input);
		}
		if ("u0i".equals(input.getZ_funcCode())) {
			return this.historyConfirmQuery(input);
		}
		if ("u0l".equals(input.getZ_funcCode())) {
			return this.customerInfoQuery(input);
		}
		if ("u0m".equals(input.getZ_funcCode())) {
			return this.customerInfoModify(input);
		}
		if ("u0n".equals(input.getZ_funcCode())) {
			return this.appointmentPurchase(input);
		}
		if ("u0o".equals(input.getZ_funcCode())) {
			return this.appointmentRedeem(input);
		}
		if ("u0p".equals(input.getZ_funcCode())) {
			return this.fixedInvestmentQuery(input);
		}
		if ("u0q".equals(input.getZ_funcCode())) {
			return this.fixedInvestmentPurchase(input);
		}
		if ("u0s".equals(input.getZ_funcCode())) {
			return this.historyTransactionsApplicationListQuery(input);
		}
		if ("u0u".equals(input.getZ_funcCode())) {
			return this.todayTransactionsApplicationListQuery(input);
		}
		if ("u0v".equals(input.getZ_funcCode())) {
			return this.transactionRecordDetailQuery(input);
		}
		if ("b03".equals(input.getZ_funcCode())) {
			return this.sessionUserUpdate(input);
		}
		if ("u0z".equals(input.getZ_funcCode())) {
			return this.specialAccBalanceQuery(input);
		}
		if ("u1a".equals(input.getZ_funcCode())) {
			return this.eletricContractQuery(input);
		}
		if ("u1b".equals(input.getZ_funcCode())) {
			return this.speciElectronicContractSign(input);
		}
		if ("u1c".equals(input.getZ_funcCode())) {
			return this.hisBonusListQuery(input);
		}
		if ("u1h".equals(input.getZ_funcCode())) {
			return this.profitQuery(input);
		}
		if ("u1m".equals(input.getZ_funcCode())) {
			return this.serveQuery(input);
		}
		if ("u1n".equals(input.getZ_funcCode())) {
			return this.serveCustomize(input);
		}
		if ("u1r".equals(input.getZ_funcCode())) {
			return this.passwordReset(input);
		}
		if ("b02".equals(input.getZ_funcCode())) {
			return this.versionCheck(input);
		}
		if ("b04".equals(input.getZ_funcCode())) {
			return this.login(input);
		}
		if ("b05".equals(input.getZ_funcCode())) {
			return this.logout(input);
		}
		if ("b06".equals(input.getZ_funcCode())) {
			return this.baseInfoQuery(input);
		}
		if ("u01".equals(input.getZ_funcCode())) {
			return this.passwordModify(input);
		}
		if ("u03".equals(input.getZ_funcCode())) {
			return this.transactionsAccountListQuery(input);
		}
		if ("u04".equals(input.getZ_funcCode())) {
			return this.fundShareListQuery(input);
		}
		if ("u05".equals(input.getZ_funcCode())) {
			return this.incomeChangeListQuery(input);
		}
		if ("u06".equals(input.getZ_funcCode())) {
			return this.fundBuyInfoQuery(input);
		}
		if ("u08".equals(input.getZ_funcCode())) {
			return this.fundTransactionsFeeQuery(input);
		}
		if ("u0a".equals(input.getZ_funcCode())) {
			return this.fundBuy(input);
		}
		if ("u0r".equals(input.getZ_funcCode())) {
			return this.fundSmartInvestmentStateUpdate(input);
		}
		if ("u0b".equals(input.getZ_funcCode())) {
			return this.fundRedemption(input);
		}
		if ("u0c".equals(input.getZ_funcCode())) {
			return this.fundTransfer(input);
		}
		if ("u0d".equals(input.getZ_funcCode())) {
			return this.transactionCancel(input);
		}
		if ("n1g".equals(input.getZ_funcCode())) {
			return this.specialFundListQuery(input);
		}
		if ("n00".equals(input.getZ_funcCode())) {
			return this.newsCategoryListQuery(input);
		}
		if ("n01".equals(input.getZ_funcCode())) {
			return this.newsListQuery(input);
		}
		if ("n02".equals(input.getZ_funcCode())) {
			return this.newsQuery(input);
		}
		if ("n03".equals(input.getZ_funcCode())) {
			return this.resourceQuery(input);
		}
		if ("n06".equals(input.getZ_funcCode())) {
			return this.fundListQuery(input);
		}
		if ("n07".equals(input.getZ_funcCode())) {
			return this.netValueQuery(input);
		}
		if ("n08".equals(input.getZ_funcCode())) {
			return this.hisNetValueQuery(input);
		}
		if ("n0a".equals(input.getZ_funcCode())) {
			return this.fundFeeQuery(input);
		}
		if ("n0d".equals(input.getZ_funcCode())) {
			return this.fundInfoQuery(input);
		}
		if ("n0g".equals(input.getZ_funcCode())) {
			return this.fundCombineInvestmentAssetsListQuery(input);
		}
		if ("n0m".equals(input.getZ_funcCode())) {
			return this.transactionsHelpQuery(input);
		}
		if ("n0n".equals(input.getZ_funcCode())) {
			return this.fundShowListQuery(input);
		}
		if ("u0w".equals(input.getZ_funcCode())) {
			return this.queryCanCancelTransactionList(input);
		}
		if ("u0x".equals(input.getZ_funcCode())) {
			return this.specialAccAuthQuery(input);
		}
		if ("u0y".equals(input.getZ_funcCode())) {
			return this.specialAccAuthAdd(input);
		}
		if ("n0y".equals(input.getZ_funcCode())) {
			return this.speciBuyLimitQuery(input);
		}
		if ("n0z".equals(input.getZ_funcCode())) {
			return this.speciFundInfoQuery(input);
		}
		if ("u1d".equals(input.getZ_funcCode())) {
			return this.tradeAccCancel(input);
		}
		if ("n1a".equals(input.getZ_funcCode())) {
			return this.fundIncomeRateQuery(input);
		}
		if ("u1e".equals(input.getZ_funcCode())) {
			return this.fixedInvestmentTransfer(input);
		}
		if ("u1f".equals(input.getZ_funcCode())) {
			return this.shortDateQuery(input);
		}
		if ("u1g".equals(input.getZ_funcCode())) {
			return this.shortMoneyDetailQuery(input);
		}
		if ("u1i".equals(input.getZ_funcCode())) {
			return this.dataCenterCustomerInfoQuery(input);
		}
		if ("u1j".equals(input.getZ_funcCode())) {
			return this.shareWaterQuery(input);
		}
		if ("u1k".equals(input.getZ_funcCode())) {
			return this.checkSheetQuery(input);
		}
		if ("u1l".equals(input.getZ_funcCode())) {
			return this.checkSheetCustomize(input);
		}
		if ("u1q".equals(input.getZ_funcCode())) {
			return this.userRoleQuery(input);
		}
		if ("n1c".equals(input.getZ_funcCode())) {
			return this.chinaPayMobileOpenAccoOrder(input);
		}
		if ("n1d".equals(input.getZ_funcCode())) {
			return this.chinapaymobilebackverify(input);
		}
		if ("n1e".equals(input.getZ_funcCode())) {
			return this.fundTradeDatequery(input);
		}
		if ("n1f".equals(input.getZ_funcCode())) {
			return this.bankCardChange(input);
		}
		if ("m0a".equals(input.getZ_funcCode())) {
			return this.payOrPayeeAdd(input);
		}
		if ("m0b".equals(input.getZ_funcCode())) {
			return this.payOrPayee(input);
		}
		if ("m0c".equals(input.getZ_funcCode())) {
			return this.payOrPayeeQuery(input);
		}
		if ("m0d".equals(input.getZ_funcCode())) {
			return this.payOrPayeeCancel(input);
		}
		if ("m0h".equals(input.getZ_funcCode())) {
			return this.payListQuery(input);
		}
		if ("m0e".equals(input.getZ_funcCode())) {
			return this.customerFrequentContactsQuery(input);
		}
		if ("m0f".equals(input.getZ_funcCode())) {
			return this.frequentContactsUpdate(input);
		}
		if ("m0i".equals(input.getZ_funcCode())) {
			return this.payHomeQuery(input);
		}
		if ("m0j".equals(input.getZ_funcCode())) {
			return this.payInfo(input);
		}
		if ("m0k".equals(input.getZ_funcCode())) {
			return this.customerFrequentContactsInfo(input);
		}
		if ("u1F".equals(input.getZ_funcCode())) {
			return this.informationList(input);
		}
		if ("u1G".equals(input.getZ_funcCode())) {
			return this.infomationContent(input);
		}
		if ("u1H".equals(input.getZ_funcCode())) {
			return this.cardNoDel(input);
		}
		if ("u1I".equals(input.getZ_funcCode())) {
			return this.cardNoList(input);
		}
		if ("u1J".equals(input.getZ_funcCode())) {
			return this.cardNoSave(input);
		}
		if ("u1L".equals(input.getZ_funcCode())) {
			return this.myGift(input);
		}
		if ("n0w".equals(input.getZ_funcCode())) {
			return this.validInfoValid(input);
		}
		if ("m0g".equals(input.getZ_funcCode())) {
			return this.syncUserAccount(input);
		}
		if ("m0l".equals(input.getZ_funcCode())) {
			return this.payOrPayeeJudge(input);
		}
		if ("m0m".equals(input.getZ_funcCode())) {
			return this.supportPayTransactionsAccount(input);
		}
		if ("m0n".equals(input.getZ_funcCode())) {
			return this.queryMoneyAssets(input);
		}
		return this.getErrorOutput(FundErrorCode.INPUT_PARAM_ERROR, "无效的功能调用");
	}
	
	/**
	 * 根据类别名称查询资讯列表 
	 */
	protected ISBaseOutput newsListByCategoryNameQuery(ISBaseInput inputParam) {
		ISNewsListByCategoryNameQueryInput input = ((ISNewsListByCategoryNameQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").newsListByCategoryNameQuery(input);
	}
	
	/**
	 * 相关工作日查询 
	 */
	protected ISBaseOutput workDayQuery(ISBaseInput inputParam) {
		ISWorkDayQueryInput input = ((ISWorkDayQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").workDayQuery(input);
	}
	
	/**
	 * 查询风险测试题库 
	 */
	protected ISBaseOutput riskEvaluationExamQuery(ISBaseInput inputParam) {
		ISRiskEvaluationExamQueryInput input = ((ISRiskEvaluationExamQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").riskEvaluationExamQuery(input);
	}
	
	/**
	 * 风险测评 
	 */
	protected ISBaseOutput riskEvaluation(ISBaseInput inputParam) {
		ISRiskEvaluationInput input = ((ISRiskEvaluationInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").riskEvaluation(input);
	}
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 */
	protected ISBaseOutput fastOpenAccount(ISBaseInput inputParam) {
		ISFastOpenAccountInput input = ((ISFastOpenAccountInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").fastOpenAccount(input);
	}
	
	/**
	 * 快速开户功能判断查询 
	 */
	protected ISBaseOutput fastOpenAccountConditionQuery(ISBaseInput inputParam) {
		ISFastOpenAccountConditionQueryInput input = ((ISFastOpenAccountConditionQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").fastOpenAccountConditionQuery(input);
	}
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 */
	protected ISBaseOutput transactionsProcessDayQuery(ISBaseInput inputParam) {
		ISTransactionsProcessDayQueryInput input = ((ISTransactionsProcessDayQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").transactionsProcessDayQuery(input);
	}
	
	/**
	 * 查询支持开户的银行列表 
	 */
	protected ISBaseOutput supportOpenAccountBankListQuery(ISBaseInput inputParam) {
		ISSupportOpenAccountBankListQueryInput input = ((ISSupportOpenAccountBankListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").supportOpenAccountBankListQuery(input);
	}
	
	/**
	 * 发送验证信息接口 
	 */
	protected ISBaseOutput validInfoSend(ISBaseInput inputParam) {
		ISValidInfoSendInput input = ((ISValidInfoSendInput)(inputParam));
		return this.getFundBiz(FundBiz_n0u.class, inputParam, "n0u").validInfoSend(input);
	}
	
	/**
	 * 历史确认查询 
	 */
	protected ISBaseOutput historyConfirmQuery(ISBaseInput inputParam) {
		ISHistoryConfirmQueryInput input = ((ISHistoryConfirmQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").historyConfirmQuery(input);
	}
	
	/**
	 * 个人客户信息查询 
	 */
	protected ISBaseOutput customerInfoQuery(ISBaseInput inputParam) {
		ISCustomerInfoQueryInput input = ((ISCustomerInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").customerInfoQuery(input);
	}
	
	/**
	 * 个人客户信息修改 
	 */
	protected ISBaseOutput customerInfoModify(ISBaseInput inputParam) {
		ISCustomerInfoModifyInput input = ((ISCustomerInfoModifyInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").customerInfoModify(input);
	}
	
	/**
	 * 预约申购 
	 */
	protected ISBaseOutput appointmentPurchase(ISBaseInput inputParam) {
		ISAppointmentPurchaseInput input = ((ISAppointmentPurchaseInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").appointmentPurchase(input);
	}
	
	/**
	 * 预约赎回 
	 */
	protected ISBaseOutput appointmentRedeem(ISBaseInput inputParam) {
		ISAppointmentRedeemInput input = ((ISAppointmentRedeemInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").appointmentRedeem(input);
	}
	
	/**
	 * 定期定额查询 
	 */
	protected ISBaseOutput fixedInvestmentQuery(ISBaseInput inputParam) {
		ISFixedInvestmentQueryInput input = ((ISFixedInvestmentQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").fixedInvestmentQuery(input);
	}
	
	/**
	 * 定期定额申购 
	 */
	protected ISBaseOutput fixedInvestmentPurchase(ISBaseInput inputParam) {
		ISFixedInvestmentPurchaseInput input = ((ISFixedInvestmentPurchaseInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").fixedInvestmentPurchase(input);
	}
	
	/**
	 * 历史交易申请查询 
	 */
	protected ISBaseOutput historyTransactionsApplicationListQuery(ISBaseInput inputParam) {
		ISHistoryTransactionsApplicationListQueryInput input = ((ISHistoryTransactionsApplicationListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").historyTransactionsApplicationListQuery(input);
	}
	
	/**
	 * 当日交易申请查询 当日委托
	 */
	protected ISBaseOutput todayTransactionsApplicationListQuery(ISBaseInput inputParam) {
		ISTodayTransactionsApplicationListQueryInput input = ((ISTodayTransactionsApplicationListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").todayTransactionsApplicationListQuery(input);
	}
	
	/**
	 * 明细查询 
	 */
	protected ISBaseOutput transactionRecordDetailQuery(ISBaseInput inputParam) {
		ISTransactionRecordDetailQueryInput input = ((ISTransactionRecordDetailQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").transactionRecordDetailQuery(input);
	}
	
	/**
	 * 更新Session中的用户 
	 */
	protected ISBaseOutput sessionUserUpdate(ISBaseInput inputParam) {
		ISSessionUserUpdateInput input = ((ISSessionUserUpdateInput)(inputParam));
		return this.getFundBiz(FundBiz_b00.class, inputParam, "b00").sessionUserUpdate(input);
	}
	
	/**
	 * 查询专户剩余额度 E006
	 */
	protected ISBaseOutput specialAccBalanceQuery(ISBaseInput inputParam) {
		ISSpecialAccBalanceQueryInput input = ((ISSpecialAccBalanceQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").specialAccBalanceQuery(input);
	}
	
	/**
	 * 查询电子合同信息 E001
	 */
	protected ISBaseOutput eletricContractQuery(ISBaseInput inputParam) {
		ISEletricContractQueryInput input = ((ISEletricContractQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").eletricContractQuery(input);
	}
	
	/**
	 * 签署电子合同或风险揭示书 
	 */
	protected ISBaseOutput speciElectronicContractSign(ISBaseInput inputParam) {
		ISSpeciElectronicContractSignInput input = ((ISSpeciElectronicContractSignInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").speciElectronicContractSign(input);
	}
	
	/**
	 * 历史分红查询 S005
	 */
	protected ISBaseOutput hisBonusListQuery(ISBaseInput inputParam) {
		ISHisBonusListQueryInput input = ((ISHisBonusListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").hisBonusListQuery(input);
	}
	
	/**
	 * 盈亏查询 S013
	 */
	protected ISBaseOutput profitQuery(ISBaseInput inputParam) {
		ISProfitQueryInput input = ((ISProfitQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").profitQuery(input);
	}
	
	/**
	 * 可定制信息查询 V007
	 */
	protected ISBaseOutput serveQuery(ISBaseInput inputParam) {
		ISServeQueryInput input = ((ISServeQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").serveQuery(input);
	}
	
	/**
	 * 定制信息 V008
	 */
	protected ISBaseOutput serveCustomize(ISBaseInput inputParam) {
		ISServeCustomizeInput input = ((ISServeCustomizeInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").serveCustomize(input);
	}
	
	/**
	 * 重置交易密码 C029
	 */
	protected ISBaseOutput passwordReset(ISBaseInput inputParam) {
		ISPasswordResetInput input = ((ISPasswordResetInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").passwordReset(input);
	}
	
	/**
	 * 检查版本 
	 */
	protected ISBaseOutput versionCheck(ISBaseInput inputParam) {
		ISVersionCheckInput input = ((ISVersionCheckInput)(inputParam));
		return this.getFundBiz(FundBiz_b00.class, inputParam, "b00").versionCheck(input);
	}
	
	/**
	 * 登录 
	 */
	protected ISBaseOutput login(ISBaseInput inputParam) {
		ISLoginInput input = ((ISLoginInput)(inputParam));
		return this.getFundBiz(FundBiz_b00.class, inputParam, "b00").login(input);
	}
	
	/**
	 * 登出 
	 */
	protected ISBaseOutput logout(ISBaseInput inputParam) {
		ISLogoutInput input = ((ISLogoutInput)(inputParam));
		return this.getFundBiz(FundBiz_b00.class, inputParam, "b00").logout(input);
	}
	
	/**
	 * 字典查询 
	 */
	protected ISBaseOutput baseInfoQuery(ISBaseInput inputParam) {
		ISBaseInfoQueryInput input = ((ISBaseInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_b00.class, inputParam, "b00").baseInfoQuery(input);
	}
	
	/**
	 * 密码修改 
	 */
	protected ISBaseOutput passwordModify(ISBaseInput inputParam) {
		ISPasswordModifyInput input = ((ISPasswordModifyInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").passwordModify(input);
	}
	
	/**
	 * 查询交易账号列表 
	 */
	protected ISBaseOutput transactionsAccountListQuery(ISBaseInput inputParam) {
		ISTransactionsAccountListQueryInput input = ((ISTransactionsAccountListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").transactionsAccountListQuery(input);
	}
	
	/**
	 * 基金份额查询 
	 */
	protected ISBaseOutput fundShareListQuery(ISBaseInput inputParam) {
		ISFundShareListQueryInput input = ((ISFundShareListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").fundShareListQuery(input);
	}
	
	/**
	 * 收益变动曲线 
	 */
	protected ISBaseOutput incomeChangeListQuery(ISBaseInput inputParam) {
		ISIncomeChangeListQueryInput input = ((ISIncomeChangeListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").incomeChangeListQuery(input);
	}
	
	/**
	 * 查询基金购买信息 
	 */
	protected ISBaseOutput fundBuyInfoQuery(ISBaseInput inputParam) {
		ISFundBuyInfoQueryInput input = ((ISFundBuyInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").fundBuyInfoQuery(input);
	}
	
	/**
	 * 基金交易费率查询 
	 */
	protected ISBaseOutput fundTransactionsFeeQuery(ISBaseInput inputParam) {
		ISFundTransactionsFeeQueryInput input = ((ISFundTransactionsFeeQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u00.class, inputParam, "u00").fundTransactionsFeeQuery(input);
	}
	
	/**
	 * 购买基金 
	 */
	protected ISBaseOutput fundBuy(ISBaseInput inputParam) {
		ISFundBuyInput input = ((ISFundBuyInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").fundBuy(input);
	}
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 */
	protected ISBaseOutput fundSmartInvestmentStateUpdate(ISBaseInput inputParam) {
		ISFundSmartInvestmentStateUpdateInput input = ((ISFundSmartInvestmentStateUpdateInput)(inputParam));
		return this.getFundBiz(FundBiz_u0k.class, inputParam, "u0k").fundSmartInvestmentStateUpdate(input);
	}
	
	/**
	 * 基金赎回 
	 */
	protected ISBaseOutput fundRedemption(ISBaseInput inputParam) {
		ISFundRedemptionInput input = ((ISFundRedemptionInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").fundRedemption(input);
	}
	
	/**
	 * 基金转换 
	 */
	protected ISBaseOutput fundTransfer(ISBaseInput inputParam) {
		ISFundTransferInput input = ((ISFundTransferInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").fundTransfer(input);
	}
	
	/**
	 * 撤单 
	 */
	protected ISBaseOutput transactionCancel(ISBaseInput inputParam) {
		ISTransactionCancelInput input = ((ISTransactionCancelInput)(inputParam));
		return this.getFundBiz(FundBiz_u0a.class, inputParam, "u0a").transactionCancel(input);
	}
	
	/**
	 * 查询特殊基金列表 
	 */
	protected ISBaseOutput specialFundListQuery(ISBaseInput inputParam) {
		ISSpecialFundListQueryInput input = ((ISSpecialFundListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").specialFundListQuery(input);
	}
	
	/**
	 * 查询资讯分类 
	 */
	protected ISBaseOutput newsCategoryListQuery(ISBaseInput inputParam) {
		ISNewsCategoryListQueryInput input = ((ISNewsCategoryListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").newsCategoryListQuery(input);
	}
	
	/**
	 * 查询资讯列表 
	 */
	protected ISBaseOutput newsListQuery(ISBaseInput inputParam) {
		ISNewsListQueryInput input = ((ISNewsListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").newsListQuery(input);
	}
	
	/**
	 * 查询资讯内容 
	 */
	protected ISBaseOutput newsQuery(ISBaseInput inputParam) {
		ISNewsQueryInput input = ((ISNewsQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").newsQuery(input);
	}
	
	/**
	 * 查询资源 
	 */
	protected ISBaseOutput resourceQuery(ISBaseInput inputParam) {
		ISResourceQueryInput input = ((ISResourceQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").resourceQuery(input);
	}
	
	/**
	 * 查询基金列表 
	 */
	protected ISBaseOutput fundListQuery(ISBaseInput inputParam) {
		ISFundListQueryInput input = ((ISFundListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").fundListQuery(input);
	}
	
	/**
	 * 查询基金净值 
	 */
	protected ISBaseOutput netValueQuery(ISBaseInput inputParam) {
		ISNetValueQueryInput input = ((ISNetValueQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").netValueQuery(input);
	}
	
	/**
	 * 查询基金历史净值 
	 */
	protected ISBaseOutput hisNetValueQuery(ISBaseInput inputParam) {
		ISHisNetValueQueryInput input = ((ISHisNetValueQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n00.class, inputParam, "n00").hisNetValueQuery(input);
	}
	
	/**
	 * 查询基金费用 
	 */
	protected ISBaseOutput fundFeeQuery(ISBaseInput inputParam) {
		ISFundFeeQueryInput input = ((ISFundFeeQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0a.class, inputParam, "n0a").fundFeeQuery(input);
	}
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 */
	protected ISBaseOutput fundInfoQuery(ISBaseInput inputParam) {
		ISFundInfoQueryInput input = ((ISFundInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0a.class, inputParam, "n0a").fundInfoQuery(input);
	}
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 */
	protected ISBaseOutput fundCombineInvestmentAssetsListQuery(ISBaseInput inputParam) {
		ISFundCombineInvestmentAssetsListQueryInput input = ((ISFundCombineInvestmentAssetsListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0a.class, inputParam, "n0a").fundCombineInvestmentAssetsListQuery(input);
	}
	
	/**
	 * 查询交易帮助信息 
	 */
	protected ISBaseOutput transactionsHelpQuery(ISBaseInput inputParam) {
		ISTransactionsHelpQueryInput input = ((ISTransactionsHelpQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").transactionsHelpQuery(input);
	}
	
	/**
	 * 查询基金显示列表 
	 */
	protected ISBaseOutput fundShowListQuery(ISBaseInput inputParam) {
		ISFundShowListQueryInput input = ((ISFundShowListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0k.class, inputParam, "n0k").fundShowListQuery(input);
	}
	
	/**
	 * 查询可撤单列表 
	 */
	protected ISBaseOutput queryCanCancelTransactionList(ISBaseInput inputParam) {
		ISQueryCanCancelTransactionListInput input = ((ISQueryCanCancelTransactionListInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").queryCanCancelTransactionList(input);
	}
	
	/**
	 * 获取专户用户授权信息 E002
	 */
	protected ISBaseOutput specialAccAuthQuery(ISBaseInput inputParam) {
		ISSpecialAccAuthQueryInput input = ((ISSpecialAccAuthQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").specialAccAuthQuery(input);
	}
	
	/**
	 * 新增专户用户授权 E003
	 */
	protected ISBaseOutput specialAccAuthAdd(ISBaseInput inputParam) {
		ISSpecialAccAuthAddInput input = ((ISSpecialAccAuthAddInput)(inputParam));
		return this.getFundBiz(FundBiz_u0u.class, inputParam, "u0u").specialAccAuthAdd(input);
	}
	
	/**
	 * 查询专户人数限制 
	 */
	protected ISBaseOutput speciBuyLimitQuery(ISBaseInput inputParam) {
		ISSpeciBuyLimitQueryInput input = ((ISSpeciBuyLimitQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0u.class, inputParam, "n0u").speciBuyLimitQuery(input);
	}
	
	/**
	 * 专户基金详细信息查询 S060
	 */
	protected ISBaseOutput speciFundInfoQuery(ISBaseInput inputParam) {
		ISSpeciFundInfoQueryInput input = ((ISSpeciFundInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n0u.class, inputParam, "n0u").speciFundInfoQuery(input);
	}
	
	/**
	 * 销交易账号 C028
	 */
	protected ISBaseOutput tradeAccCancel(ISBaseInput inputParam) {
		ISTradeAccCancelInput input = ((ISTradeAccCancelInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").tradeAccCancel(input);
	}
	
	/**
	 * 基金收益率查询 S037
	 */
	protected ISBaseOutput fundIncomeRateQuery(ISBaseInput inputParam) {
		ISFundIncomeRateQueryInput input = ((ISFundIncomeRateQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").fundIncomeRateQuery(input);
	}
	
	/**
	 * 定期定额转换 I008
	 */
	protected ISBaseOutput fixedInvestmentTransfer(ISBaseInput inputParam) {
		ISFixedInvestmentTransferInput input = ((ISFixedInvestmentTransferInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").fixedInvestmentTransfer(input);
	}
	
	/**
	 * 短期理财到期日查询 S035
	 */
	protected ISBaseOutput shortDateQuery(ISBaseInput inputParam) {
		ISShortDateQueryInput input = ((ISShortDateQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").shortDateQuery(input);
	}
	
	/**
	 * 短期理财明细查询 S020
	 */
	protected ISBaseOutput shortMoneyDetailQuery(ISBaseInput inputParam) {
		ISShortMoneyDetailQueryInput input = ((ISShortMoneyDetailQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").shortMoneyDetailQuery(input);
	}
	
	/**
	 * 数据中心客户信息查询 C025
	 */
	protected ISBaseOutput dataCenterCustomerInfoQuery(ISBaseInput inputParam) {
		ISDataCenterCustomerInfoQueryInput input = ((ISDataCenterCustomerInfoQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").dataCenterCustomerInfoQuery(input);
	}
	
	/**
	 * 份额流水查询 S058
	 */
	protected ISBaseOutput shareWaterQuery(ISBaseInput inputParam) {
		ISShareWaterQueryInput input = ((ISShareWaterQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1a.class, inputParam, "u1a").shareWaterQuery(input);
	}
	
	/**
	 * 对账单定制查询 V005
	 */
	protected ISBaseOutput checkSheetQuery(ISBaseInput inputParam) {
		ISCheckSheetQueryInput input = ((ISCheckSheetQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").checkSheetQuery(input);
	}
	
	/**
	 * 对账单定制 V006
	 */
	protected ISBaseOutput checkSheetCustomize(ISBaseInput inputParam) {
		ISCheckSheetCustomizeInput input = ((ISCheckSheetCustomizeInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").checkSheetCustomize(input);
	}
	
	/**
	 * 客户角色查询 C053
	 */
	protected ISBaseOutput userRoleQuery(ISBaseInput inputParam) {
		ISUserRoleQueryInput input = ((ISUserRoleQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_u1k.class, inputParam, "u1k").userRoleQuery(input);
	}
	
	/**
	 * 银联通开户签名生成 B026
	 */
	protected ISBaseOutput chinaPayMobileOpenAccoOrder(ISBaseInput inputParam) {
		ISChinaPayMobileOpenAccoOrderInput input = ((ISChinaPayMobileOpenAccoOrderInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").chinaPayMobileOpenAccoOrder(input);
	}
	
	/**
	 * 银联通开户返回信息验证 B027
	 */
	protected ISBaseOutput chinapaymobilebackverify(ISBaseInput inputParam) {
		ISChinapaymobilebackverifyInput input = ((ISChinapaymobilebackverifyInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").chinapaymobilebackverify(input);
	}
	
	/**
	 * 交易日期查询 
	 */
	protected ISBaseOutput fundTradeDatequery(ISBaseInput inputParam) {
		ISFundTradeDatequeryInput input = ((ISFundTradeDatequeryInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").fundTradeDatequery(input);
	}
	
	/**
	 * 变更银行卡 B016
	 */
	protected ISBaseOutput bankCardChange(ISBaseInput inputParam) {
		ISBankCardChangeInput input = ((ISBankCardChangeInput)(inputParam));
		return this.getFundBiz(FundBiz_n1a.class, inputParam, "n1a").bankCardChange(input);
	}
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 */
	protected ISBaseOutput payOrPayeeAdd(ISBaseInput inputParam) {
		ISPayOrPayeeAddInput input = ((ISPayOrPayeeAddInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payOrPayeeAdd(input);
	}
	
	/**
	 * 收款或付款 
	 */
	protected ISBaseOutput payOrPayee(ISBaseInput inputParam) {
		ISPayOrPayeeInput input = ((ISPayOrPayeeInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payOrPayee(input);
	}
	
	/**
	 * 支付查询 
	 */
	protected ISBaseOutput payOrPayeeQuery(ISBaseInput inputParam) {
		ISPayOrPayeeQueryInput input = ((ISPayOrPayeeQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payOrPayeeQuery(input);
	}
	
	/**
	 * 取消收付款 
	 */
	protected ISBaseOutput payOrPayeeCancel(ISBaseInput inputParam) {
		ISPayOrPayeeCancelInput input = ((ISPayOrPayeeCancelInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payOrPayeeCancel(input);
	}
	
	/**
	 * 查询收付款交易记录 
	 */
	protected ISBaseOutput payListQuery(ISBaseInput inputParam) {
		ISPayListQueryInput input = ((ISPayListQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payListQuery(input);
	}
	
	/**
	 * 查询客户联系人 
	 */
	protected ISBaseOutput customerFrequentContactsQuery(ISBaseInput inputParam) {
		ISCustomerFrequentContactsQueryInput input = ((ISCustomerFrequentContactsQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").customerFrequentContactsQuery(input);
	}
	
	/**
	 * 修改客户联系人备注和标记 
	 */
	protected ISBaseOutput frequentContactsUpdate(ISBaseInput inputParam) {
		ISFrequentContactsUpdateInput input = ((ISFrequentContactsUpdateInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").frequentContactsUpdate(input);
	}
	
	/**
	 * 收付款交易记录首页 
	 */
	protected ISBaseOutput payHomeQuery(ISBaseInput inputParam) {
		ISPayHomeQueryInput input = ((ISPayHomeQueryInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payHomeQuery(input);
	}
	
	/**
	 * 收付款交易记录详情 
	 */
	protected ISBaseOutput payInfo(ISBaseInput inputParam) {
		ISPayInfoInput input = ((ISPayInfoInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").payInfo(input);
	}
	
	/**
	 * 联系人详情 
	 */
	protected ISBaseOutput customerFrequentContactsInfo(ISBaseInput inputParam) {
		ISCustomerFrequentContactsInfoInput input = ((ISCustomerFrequentContactsInfoInput)(inputParam));
		return this.getFundBiz(FundBiz_m0k.class, inputParam, "m0k").customerFrequentContactsInfo(input);
	}
	
	/**
	 * 消息列表 
	 */
	protected ISBaseOutput informationList(ISBaseInput inputParam) {
		ISInformationListInput input = ((ISInformationListInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").informationList(input);
	}
	
	/**
	 * 消息内容 
	 */
	protected ISBaseOutput infomationContent(ISBaseInput inputParam) {
		ISInfomationContentInput input = ((ISInfomationContentInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").infomationContent(input);
	}
	
	/**
	 * 删除银行卡 
	 */
	protected ISBaseOutput cardNoDel(ISBaseInput inputParam) {
		ISCardNoDelInput input = ((ISCardNoDelInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").cardNoDel(input);
	}
	
	/**
	 * 银行卡列表 
	 */
	protected ISBaseOutput cardNoList(ISBaseInput inputParam) {
		ISCardNoListInput input = ((ISCardNoListInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").cardNoList(input);
	}
	
	/**
	 * 保存银行卡 
	 */
	protected ISBaseOutput cardNoSave(ISBaseInput inputParam) {
		ISCardNoSaveInput input = ((ISCardNoSaveInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").cardNoSave(input);
	}
	
	/**
	 * 我的红包 
	 */
	protected ISBaseOutput myGift(ISBaseInput inputParam) {
		ISMyGiftInput input = ((ISMyGiftInput)(inputParam));
		return this.getFundBiz(FundBiz_u1E.class, inputParam, "u1E").myGift(input);
	}
	
	/**
	 * 验证码验证 
	 */
	protected ISBaseOutput validInfoValid(ISBaseInput inputParam) {
		ISValidInfoValidInput input = ((ISValidInfoValidInput)(inputParam));
		return this.getFundBiz(FundBiz_n0u.class, inputParam, "n0u").validInfoValid(input);
	}
	
	/**
	 * 同步用户账户数据 
	 */
	protected ISBaseOutput syncUserAccount(ISBaseInput inputParam) {
		ISSyncUserAccountInput input = ((ISSyncUserAccountInput)(inputParam));
		return this.getFundBiz(FundBiz_m0a.class, inputParam, "m0a").syncUserAccount(input);
	}
	
	/**
	 * 判断当前用户的收付款开通情况 
	 */
	protected ISBaseOutput payOrPayeeJudge(ISBaseInput inputParam) {
		ISPayOrPayeeJudgeInput input = ((ISPayOrPayeeJudgeInput)(inputParam));
		return this.getFundBiz(FundBiz_m0k.class, inputParam, "m0k").payOrPayeeJudge(input);
	}
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 */
	protected ISBaseOutput supportPayTransactionsAccount(ISBaseInput inputParam) {
		ISSupportPayTransactionsAccountInput input = ((ISSupportPayTransactionsAccountInput)(inputParam));
		return this.getFundBiz(FundBiz_m0k.class, inputParam, "m0k").supportPayTransactionsAccount(input);
	}
	
	/**
	 * 查询现金宝资产 
	 */
	protected ISBaseOutput queryMoneyAssets(ISBaseInput inputParam) {
		ISQueryMoneyAssetsInput input = ((ISQueryMoneyAssetsInput)(inputParam));
		return this.getFundBiz(FundBiz_m0k.class, inputParam, "m0k").queryMoneyAssets(input);
	}
}
