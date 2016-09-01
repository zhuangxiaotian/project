package topdeep.commonfund.entity.gateway.util;
import topdeep.commonfund.entity.gateway.def.*;
/**
 * Json对象工厂
 */
public class ISBaseOutputObjectFactory extends ISBaseObjectFactory {
	
	protected Object createBaseObject() {
		return new ISBaseOutput();
	}
	
	protected Object createObject(String funcCode) {
		if ("n0o".equals(funcCode)) {
			return new ISNewsListByCategoryNameQueryOutput();
		}
		if ("n0p".equals(funcCode)) {
			return new ISWorkDayQueryOutput();
		}
		if ("u0f".equals(funcCode)) {
			return new ISRiskEvaluationExamQueryOutput();
		}
		if ("u0g".equals(funcCode)) {
			return new ISRiskEvaluationOutput();
		}
		if ("n0q".equals(funcCode)) {
			return new ISFastOpenAccountOutput();
		}
		if ("n0r".equals(funcCode)) {
			return new ISFastOpenAccountConditionQueryOutput();
		}
		if ("n0s".equals(funcCode)) {
			return new ISTransactionsProcessDayQueryOutput();
		}
		if ("n0t".equals(funcCode)) {
			return new ISSupportOpenAccountBankListQueryOutput();
		}
		if ("n0v".equals(funcCode)) {
			return new ISValidInfoSendOutput();
		}
		if ("u0i".equals(funcCode)) {
			return new ISHistoryConfirmQueryOutput();
		}
		if ("u0l".equals(funcCode)) {
			return new ISCustomerInfoQueryOutput();
		}
		if ("u0m".equals(funcCode)) {
			return new ISCustomerInfoModifyOutput();
		}
		if ("u0n".equals(funcCode)) {
			return new ISAppointmentPurchaseOutput();
		}
		if ("u0o".equals(funcCode)) {
			return new ISAppointmentRedeemOutput();
		}
		if ("u0p".equals(funcCode)) {
			return new ISFixedInvestmentQueryOutput();
		}
		if ("u0q".equals(funcCode)) {
			return new ISFixedInvestmentPurchaseOutput();
		}
		if ("u0s".equals(funcCode)) {
			return new ISHistoryTransactionsApplicationListQueryOutput();
		}
		if ("u0u".equals(funcCode)) {
			return new ISTodayTransactionsApplicationListQueryOutput();
		}
		if ("u0v".equals(funcCode)) {
			return new ISTransactionRecordDetailQueryOutput();
		}
		if ("b03".equals(funcCode)) {
			return new ISSessionUserUpdateOutput();
		}
		if ("u0z".equals(funcCode)) {
			return new ISSpecialAccBalanceQueryOutput();
		}
		if ("u1a".equals(funcCode)) {
			return new ISEletricContractQueryOutput();
		}
		if ("u1b".equals(funcCode)) {
			return new ISSpeciElectronicContractSignOutput();
		}
		if ("u1c".equals(funcCode)) {
			return new ISHisBonusListQueryOutput();
		}
		if ("u1h".equals(funcCode)) {
			return new ISProfitQueryOutput();
		}
		if ("u1m".equals(funcCode)) {
			return new ISServeQueryOutput();
		}
		if ("u1n".equals(funcCode)) {
			return new ISServeCustomizeOutput();
		}
		if ("u1r".equals(funcCode)) {
			return new ISPasswordResetOutput();
		}
		if ("b02".equals(funcCode)) {
			return new ISVersionCheckOutput();
		}
		if ("b04".equals(funcCode)) {
			return new ISLoginOutput();
		}
		if ("b05".equals(funcCode)) {
			return new ISLogoutOutput();
		}
		if ("b06".equals(funcCode)) {
			return new ISBaseInfoQueryOutput();
		}
		if ("u01".equals(funcCode)) {
			return new ISPasswordModifyOutput();
		}
		if ("u03".equals(funcCode)) {
			return new ISTransactionsAccountListQueryOutput();
		}
		if ("u04".equals(funcCode)) {
			return new ISFundShareListQueryOutput();
		}
		if ("u05".equals(funcCode)) {
			return new ISIncomeChangeListQueryOutput();
		}
		if ("u06".equals(funcCode)) {
			return new ISFundBuyInfoQueryOutput();
		}
		if ("u08".equals(funcCode)) {
			return new ISFundTransactionsFeeQueryOutput();
		}
		if ("u0a".equals(funcCode)) {
			return new ISFundBuyOutput();
		}
		if ("u0r".equals(funcCode)) {
			return new ISFundSmartInvestmentStateUpdateOutput();
		}
		if ("u0b".equals(funcCode)) {
			return new ISFundRedemptionOutput();
		}
		if ("u0c".equals(funcCode)) {
			return new ISFundTransferOutput();
		}
		if ("u0d".equals(funcCode)) {
			return new ISTransactionCancelOutput();
		}
		if ("n1g".equals(funcCode)) {
			return new ISSpecialFundListQueryOutput();
		}
		if ("n00".equals(funcCode)) {
			return new ISNewsCategoryListQueryOutput();
		}
		if ("n01".equals(funcCode)) {
			return new ISNewsListQueryOutput();
		}
		if ("n02".equals(funcCode)) {
			return new ISNewsQueryOutput();
		}
		if ("n03".equals(funcCode)) {
			return new ISResourceQueryOutput();
		}
		if ("n06".equals(funcCode)) {
			return new ISFundListQueryOutput();
		}
		if ("n07".equals(funcCode)) {
			return new ISNetValueQueryOutput();
		}
		if ("n08".equals(funcCode)) {
			return new ISHisNetValueQueryOutput();
		}
		if ("n0a".equals(funcCode)) {
			return new ISFundFeeQueryOutput();
		}
		if ("n0d".equals(funcCode)) {
			return new ISFundInfoQueryOutput();
		}
		if ("n0g".equals(funcCode)) {
			return new ISFundCombineInvestmentAssetsListQueryOutput();
		}
		if ("n0m".equals(funcCode)) {
			return new ISTransactionsHelpQueryOutput();
		}
		if ("n0n".equals(funcCode)) {
			return new ISFundShowListQueryOutput();
		}
		if ("u0w".equals(funcCode)) {
			return new ISQueryCanCancelTransactionListOutput();
		}
		if ("u0x".equals(funcCode)) {
			return new ISSpecialAccAuthQueryOutput();
		}
		if ("u0y".equals(funcCode)) {
			return new ISSpecialAccAuthAddOutput();
		}
		if ("n0y".equals(funcCode)) {
			return new ISSpeciBuyLimitQueryOutput();
		}
		if ("n0z".equals(funcCode)) {
			return new ISSpeciFundInfoQueryOutput();
		}
		if ("u1d".equals(funcCode)) {
			return new ISTradeAccCancelOutput();
		}
		if ("n1a".equals(funcCode)) {
			return new ISFundIncomeRateQueryOutput();
		}
		if ("u1e".equals(funcCode)) {
			return new ISFixedInvestmentTransferOutput();
		}
		if ("u1f".equals(funcCode)) {
			return new ISShortDateQueryOutput();
		}
		if ("u1g".equals(funcCode)) {
			return new ISShortMoneyDetailQueryOutput();
		}
		if ("u1i".equals(funcCode)) {
			return new ISDataCenterCustomerInfoQueryOutput();
		}
		if ("u1j".equals(funcCode)) {
			return new ISShareWaterQueryOutput();
		}
		if ("u1k".equals(funcCode)) {
			return new ISCheckSheetQueryOutput();
		}
		if ("u1l".equals(funcCode)) {
			return new ISCheckSheetCustomizeOutput();
		}
		if ("u1q".equals(funcCode)) {
			return new ISUserRoleQueryOutput();
		}
		if ("n1c".equals(funcCode)) {
			return new ISChinaPayMobileOpenAccoOrderOutput();
		}
		if ("n1d".equals(funcCode)) {
			return new ISChinapaymobilebackverifyOutput();
		}
		if ("n1e".equals(funcCode)) {
			return new ISFundTradeDatequeryOutput();
		}
		if ("n1f".equals(funcCode)) {
			return new ISBankCardChangeOutput();
		}
		if ("m0a".equals(funcCode)) {
			return new ISPayOrPayeeAddOutput();
		}
		if ("m0b".equals(funcCode)) {
			return new ISPayOrPayeeOutput();
		}
		if ("m0c".equals(funcCode)) {
			return new ISPayOrPayeeQueryOutput();
		}
		if ("m0d".equals(funcCode)) {
			return new ISPayOrPayeeCancelOutput();
		}
		if ("m0h".equals(funcCode)) {
			return new ISPayListQueryOutput();
		}
		if ("m0e".equals(funcCode)) {
			return new ISCustomerFrequentContactsQueryOutput();
		}
		if ("m0f".equals(funcCode)) {
			return new ISFrequentContactsUpdateOutput();
		}
		if ("m0i".equals(funcCode)) {
			return new ISPayHomeQueryOutput();
		}
		if ("m0j".equals(funcCode)) {
			return new ISPayInfoOutput();
		}
		if ("m0k".equals(funcCode)) {
			return new ISCustomerFrequentContactsInfoOutput();
		}
		if ("u1F".equals(funcCode)) {
			return new ISInformationListOutput();
		}
		if ("u1G".equals(funcCode)) {
			return new ISInfomationContentOutput();
		}
		if ("u1H".equals(funcCode)) {
			return new ISCardNoDelOutput();
		}
		if ("u1I".equals(funcCode)) {
			return new ISCardNoListOutput();
		}
		if ("u1J".equals(funcCode)) {
			return new ISCardNoSaveOutput();
		}
		if ("u1L".equals(funcCode)) {
			return new ISMyGiftOutput();
		}
		if ("n0w".equals(funcCode)) {
			return new ISValidInfoValidOutput();
		}
		if ("m0g".equals(funcCode)) {
			return new ISSyncUserAccountOutput();
		}
		if ("m0l".equals(funcCode)) {
			return new ISPayOrPayeeJudgeOutput();
		}
		if ("m0m".equals(funcCode)) {
			return new ISSupportPayTransactionsAccountOutput();
		}
		if ("m0n".equals(funcCode)) {
			return new ISQueryMoneyAssetsOutput();
		}
		return this.createBaseObject();
	}
}
