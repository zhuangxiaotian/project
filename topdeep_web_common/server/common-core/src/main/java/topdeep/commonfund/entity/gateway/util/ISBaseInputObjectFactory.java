package topdeep.commonfund.entity.gateway.util;
import topdeep.commonfund.entity.gateway.def.*;
/**
 * Json对象工厂
 */
public class ISBaseInputObjectFactory extends ISBaseObjectFactory {
	
	protected Object createBaseObject() {
		return new ISBaseInput();
	}
	
	protected Object createObject(String funcCode) {
		if ("n0o".equals(funcCode)) {
			return new ISNewsListByCategoryNameQueryInput();
		}
		if ("n0p".equals(funcCode)) {
			return new ISWorkDayQueryInput();
		}
		if ("u0f".equals(funcCode)) {
			return new ISRiskEvaluationExamQueryInput();
		}
		if ("u0g".equals(funcCode)) {
			return new ISRiskEvaluationInput();
		}
		if ("n0q".equals(funcCode)) {
			return new ISFastOpenAccountInput();
		}
		if ("n0r".equals(funcCode)) {
			return new ISFastOpenAccountConditionQueryInput();
		}
		if ("n0s".equals(funcCode)) {
			return new ISTransactionsProcessDayQueryInput();
		}
		if ("n0t".equals(funcCode)) {
			return new ISSupportOpenAccountBankListQueryInput();
		}
		if ("n0v".equals(funcCode)) {
			return new ISValidInfoSendInput();
		}
		if ("u0i".equals(funcCode)) {
			return new ISHistoryConfirmQueryInput();
		}
		if ("u0l".equals(funcCode)) {
			return new ISCustomerInfoQueryInput();
		}
		if ("u0m".equals(funcCode)) {
			return new ISCustomerInfoModifyInput();
		}
		if ("u0n".equals(funcCode)) {
			return new ISAppointmentPurchaseInput();
		}
		if ("u0o".equals(funcCode)) {
			return new ISAppointmentRedeemInput();
		}
		if ("u0p".equals(funcCode)) {
			return new ISFixedInvestmentQueryInput();
		}
		if ("u0q".equals(funcCode)) {
			return new ISFixedInvestmentPurchaseInput();
		}
		if ("u0s".equals(funcCode)) {
			return new ISHistoryTransactionsApplicationListQueryInput();
		}
		if ("u0u".equals(funcCode)) {
			return new ISTodayTransactionsApplicationListQueryInput();
		}
		if ("u0v".equals(funcCode)) {
			return new ISTransactionRecordDetailQueryInput();
		}
		if ("b03".equals(funcCode)) {
			return new ISSessionUserUpdateInput();
		}
		if ("u0z".equals(funcCode)) {
			return new ISSpecialAccBalanceQueryInput();
		}
		if ("u1a".equals(funcCode)) {
			return new ISEletricContractQueryInput();
		}
		if ("u1b".equals(funcCode)) {
			return new ISSpeciElectronicContractSignInput();
		}
		if ("u1c".equals(funcCode)) {
			return new ISHisBonusListQueryInput();
		}
		if ("u1h".equals(funcCode)) {
			return new ISProfitQueryInput();
		}
		if ("u1m".equals(funcCode)) {
			return new ISServeQueryInput();
		}
		if ("u1n".equals(funcCode)) {
			return new ISServeCustomizeInput();
		}
		if ("u1r".equals(funcCode)) {
			return new ISPasswordResetInput();
		}
		if ("b02".equals(funcCode)) {
			return new ISVersionCheckInput();
		}
		if ("b04".equals(funcCode)) {
			return new ISLoginInput();
		}
		if ("b05".equals(funcCode)) {
			return new ISLogoutInput();
		}
		if ("b06".equals(funcCode)) {
			return new ISBaseInfoQueryInput();
		}
		if ("u01".equals(funcCode)) {
			return new ISPasswordModifyInput();
		}
		if ("u03".equals(funcCode)) {
			return new ISTransactionsAccountListQueryInput();
		}
		if ("u04".equals(funcCode)) {
			return new ISFundShareListQueryInput();
		}
		if ("u05".equals(funcCode)) {
			return new ISIncomeChangeListQueryInput();
		}
		if ("u06".equals(funcCode)) {
			return new ISFundBuyInfoQueryInput();
		}
		if ("u08".equals(funcCode)) {
			return new ISFundTransactionsFeeQueryInput();
		}
		if ("u0a".equals(funcCode)) {
			return new ISFundBuyInput();
		}
		if ("u0r".equals(funcCode)) {
			return new ISFundSmartInvestmentStateUpdateInput();
		}
		if ("u0b".equals(funcCode)) {
			return new ISFundRedemptionInput();
		}
		if ("u0c".equals(funcCode)) {
			return new ISFundTransferInput();
		}
		if ("u0d".equals(funcCode)) {
			return new ISTransactionCancelInput();
		}
		if ("n1g".equals(funcCode)) {
			return new ISSpecialFundListQueryInput();
		}
		if ("n00".equals(funcCode)) {
			return new ISNewsCategoryListQueryInput();
		}
		if ("n01".equals(funcCode)) {
			return new ISNewsListQueryInput();
		}
		if ("n02".equals(funcCode)) {
			return new ISNewsQueryInput();
		}
		if ("n03".equals(funcCode)) {
			return new ISResourceQueryInput();
		}
		if ("n06".equals(funcCode)) {
			return new ISFundListQueryInput();
		}
		if ("n07".equals(funcCode)) {
			return new ISNetValueQueryInput();
		}
		if ("n08".equals(funcCode)) {
			return new ISHisNetValueQueryInput();
		}
		if ("n0a".equals(funcCode)) {
			return new ISFundFeeQueryInput();
		}
		if ("n0d".equals(funcCode)) {
			return new ISFundInfoQueryInput();
		}
		if ("n0g".equals(funcCode)) {
			return new ISFundCombineInvestmentAssetsListQueryInput();
		}
		if ("n0m".equals(funcCode)) {
			return new ISTransactionsHelpQueryInput();
		}
		if ("n0n".equals(funcCode)) {
			return new ISFundShowListQueryInput();
		}
		if ("u0w".equals(funcCode)) {
			return new ISQueryCanCancelTransactionListInput();
		}
		if ("u0x".equals(funcCode)) {
			return new ISSpecialAccAuthQueryInput();
		}
		if ("u0y".equals(funcCode)) {
			return new ISSpecialAccAuthAddInput();
		}
		if ("n0y".equals(funcCode)) {
			return new ISSpeciBuyLimitQueryInput();
		}
		if ("n0z".equals(funcCode)) {
			return new ISSpeciFundInfoQueryInput();
		}
		if ("u1d".equals(funcCode)) {
			return new ISTradeAccCancelInput();
		}
		if ("n1a".equals(funcCode)) {
			return new ISFundIncomeRateQueryInput();
		}
		if ("u1e".equals(funcCode)) {
			return new ISFixedInvestmentTransferInput();
		}
		if ("u1f".equals(funcCode)) {
			return new ISShortDateQueryInput();
		}
		if ("u1g".equals(funcCode)) {
			return new ISShortMoneyDetailQueryInput();
		}
		if ("u1i".equals(funcCode)) {
			return new ISDataCenterCustomerInfoQueryInput();
		}
		if ("u1j".equals(funcCode)) {
			return new ISShareWaterQueryInput();
		}
		if ("u1k".equals(funcCode)) {
			return new ISCheckSheetQueryInput();
		}
		if ("u1l".equals(funcCode)) {
			return new ISCheckSheetCustomizeInput();
		}
		if ("u1q".equals(funcCode)) {
			return new ISUserRoleQueryInput();
		}
		if ("n1c".equals(funcCode)) {
			return new ISChinaPayMobileOpenAccoOrderInput();
		}
		if ("n1d".equals(funcCode)) {
			return new ISChinapaymobilebackverifyInput();
		}
		if ("n1e".equals(funcCode)) {
			return new ISFundTradeDatequeryInput();
		}
		if ("n1f".equals(funcCode)) {
			return new ISBankCardChangeInput();
		}
		if ("m0a".equals(funcCode)) {
			return new ISPayOrPayeeAddInput();
		}
		if ("m0b".equals(funcCode)) {
			return new ISPayOrPayeeInput();
		}
		if ("m0c".equals(funcCode)) {
			return new ISPayOrPayeeQueryInput();
		}
		if ("m0d".equals(funcCode)) {
			return new ISPayOrPayeeCancelInput();
		}
		if ("m0h".equals(funcCode)) {
			return new ISPayListQueryInput();
		}
		if ("m0e".equals(funcCode)) {
			return new ISCustomerFrequentContactsQueryInput();
		}
		if ("m0f".equals(funcCode)) {
			return new ISFrequentContactsUpdateInput();
		}
		if ("m0i".equals(funcCode)) {
			return new ISPayHomeQueryInput();
		}
		if ("m0j".equals(funcCode)) {
			return new ISPayInfoInput();
		}
		if ("m0k".equals(funcCode)) {
			return new ISCustomerFrequentContactsInfoInput();
		}
		if ("u1F".equals(funcCode)) {
			return new ISInformationListInput();
		}
		if ("u1G".equals(funcCode)) {
			return new ISInfomationContentInput();
		}
		if ("u1H".equals(funcCode)) {
			return new ISCardNoDelInput();
		}
		if ("u1I".equals(funcCode)) {
			return new ISCardNoListInput();
		}
		if ("u1J".equals(funcCode)) {
			return new ISCardNoSaveInput();
		}
		if ("u1L".equals(funcCode)) {
			return new ISMyGiftInput();
		}
		if ("n0w".equals(funcCode)) {
			return new ISValidInfoValidInput();
		}
		if ("m0g".equals(funcCode)) {
			return new ISSyncUserAccountInput();
		}
		if ("m0l".equals(funcCode)) {
			return new ISPayOrPayeeJudgeInput();
		}
		if ("m0m".equals(funcCode)) {
			return new ISSupportPayTransactionsAccountInput();
		}
		if ("m0n".equals(funcCode)) {
			return new ISQueryMoneyAssetsInput();
		}
		return this.createBaseObject();
	}
}
