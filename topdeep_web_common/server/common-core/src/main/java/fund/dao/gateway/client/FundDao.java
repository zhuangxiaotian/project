package fund.dao.gateway.client;
import topdeep.commonfund.entity.gateway.def.*;
import java.io.*;
import common.util.*;
/**
 * 网关JAVA客户端实现
 */
public class FundDao extends fund.dao.gateway.client.FundDaoBase {
	
	/**
	 * 根据类别名称查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListByCategoryNameQueryOutput newsListByCategoryNameQuery(ISNewsListByCategoryNameQueryInput inputParam) throws Exception {
		return ((ISNewsListByCategoryNameQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 相关工作日查询 
	 * @return 结果
	 */
	public ISWorkDayQueryOutput workDayQuery(ISWorkDayQueryInput inputParam) throws Exception {
		return ((ISWorkDayQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询风险测试题库 
	 * @return 结果
	 */
	public ISRiskEvaluationExamQueryOutput riskEvaluationExamQuery(ISRiskEvaluationExamQueryInput inputParam) throws Exception {
		return ((ISRiskEvaluationExamQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 风险测评 
	 * @return 结果
	 */
	public ISRiskEvaluationOutput riskEvaluation(ISRiskEvaluationInput inputParam) throws Exception {
		return ((ISRiskEvaluationOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 * @return 结果
	 */
	public ISFastOpenAccountOutput fastOpenAccount(ISFastOpenAccountInput inputParam) throws Exception {
		return ((ISFastOpenAccountOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 快速开户功能判断查询 
	 * @return 结果
	 */
	public ISFastOpenAccountConditionQueryOutput fastOpenAccountConditionQuery(ISFastOpenAccountConditionQueryInput inputParam) throws Exception {
		return ((ISFastOpenAccountConditionQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 * @return 结果
	 */
	public ISTransactionsProcessDayQueryOutput transactionsProcessDayQuery(ISTransactionsProcessDayQueryInput inputParam) throws Exception {
		return ((ISTransactionsProcessDayQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询支持开户的银行列表 
	 * @return 结果
	 */
	public ISSupportOpenAccountBankListQueryOutput supportOpenAccountBankListQuery(ISSupportOpenAccountBankListQueryInput inputParam) throws Exception {
		return ((ISSupportOpenAccountBankListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 发送验证信息接口 
	 * @return 结果
	 */
	public ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam) throws Exception {
		return ((ISValidInfoSendOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 历史确认查询 
	 * @return 结果
	 */
	public ISHistoryConfirmQueryOutput historyConfirmQuery(ISHistoryConfirmQueryInput inputParam) throws Exception {
		return ((ISHistoryConfirmQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 个人客户信息查询 
	 * @return 结果
	 */
	public ISCustomerInfoQueryOutput customerInfoQuery(ISCustomerInfoQueryInput inputParam) throws Exception {
		return ((ISCustomerInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 个人客户信息修改 
	 * @return 结果
	 */
	public ISCustomerInfoModifyOutput customerInfoModify(ISCustomerInfoModifyInput inputParam) throws Exception {
		return ((ISCustomerInfoModifyOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 预约申购 
	 * @return 结果
	 */
	public ISAppointmentPurchaseOutput appointmentPurchase(ISAppointmentPurchaseInput inputParam) throws Exception {
		return ((ISAppointmentPurchaseOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 预约赎回 
	 * @return 结果
	 */
	public ISAppointmentRedeemOutput appointmentRedeem(ISAppointmentRedeemInput inputParam) throws Exception {
		return ((ISAppointmentRedeemOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 定期定额查询 
	 * @return 结果
	 */
	public ISFixedInvestmentQueryOutput fixedInvestmentQuery(ISFixedInvestmentQueryInput inputParam) throws Exception {
		return ((ISFixedInvestmentQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 定期定额申购 
	 * @return 结果
	 */
	public ISFixedInvestmentPurchaseOutput fixedInvestmentPurchase(ISFixedInvestmentPurchaseInput inputParam) throws Exception {
		return ((ISFixedInvestmentPurchaseOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 历史交易申请查询 
	 * @return 结果
	 */
	public ISHistoryTransactionsApplicationListQueryOutput historyTransactionsApplicationListQuery(ISHistoryTransactionsApplicationListQueryInput inputParam) throws Exception {
		return ((ISHistoryTransactionsApplicationListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 当日交易申请查询 当日委托
	 * @return 结果
	 */
	public ISTodayTransactionsApplicationListQueryOutput todayTransactionsApplicationListQuery(ISTodayTransactionsApplicationListQueryInput inputParam) throws Exception {
		return ((ISTodayTransactionsApplicationListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 明细查询 
	 * @return 结果
	 */
	public ISTransactionRecordDetailQueryOutput transactionRecordDetailQuery(ISTransactionRecordDetailQueryInput inputParam) throws Exception {
		return ((ISTransactionRecordDetailQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 更新Session中的用户 
	 * @return 结果
	 */
	public ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam) throws Exception {
		return ((ISSessionUserUpdateOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询专户剩余额度 E006
	 * @return 结果
	 */
	public ISSpecialAccBalanceQueryOutput specialAccBalanceQuery(ISSpecialAccBalanceQueryInput inputParam) throws Exception {
		return ((ISSpecialAccBalanceQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询电子合同信息 E001
	 * @return 结果
	 */
	public ISEletricContractQueryOutput eletricContractQuery(ISEletricContractQueryInput inputParam) throws Exception {
		return ((ISEletricContractQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 签署电子合同或风险揭示书 
	 * @return 结果
	 */
	public ISSpeciElectronicContractSignOutput speciElectronicContractSign(ISSpeciElectronicContractSignInput inputParam) throws Exception {
		return ((ISSpeciElectronicContractSignOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 历史分红查询 S005
	 * @return 结果
	 */
	public ISHisBonusListQueryOutput hisBonusListQuery(ISHisBonusListQueryInput inputParam) throws Exception {
		return ((ISHisBonusListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 盈亏查询 S013
	 * @return 结果
	 */
	public ISProfitQueryOutput profitQuery(ISProfitQueryInput inputParam) throws Exception {
		return ((ISProfitQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 可定制信息查询 V007
	 * @return 结果
	 */
	public ISServeQueryOutput serveQuery(ISServeQueryInput inputParam) throws Exception {
		return ((ISServeQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 定制信息 V008
	 * @return 结果
	 */
	public ISServeCustomizeOutput serveCustomize(ISServeCustomizeInput inputParam) throws Exception {
		return ((ISServeCustomizeOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 重置交易密码 C029
	 * @return 结果
	 */
	public ISPasswordResetOutput passwordReset(ISPasswordResetInput inputParam) throws Exception {
		return ((ISPasswordResetOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 检查版本 
	 * @return 结果
	 */
	public ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam) throws Exception {
		return ((ISVersionCheckOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 登录 
	 * @return 结果
	 */
	public ISLoginOutput login(ISLoginInput inputParam) throws Exception {
		return ((ISLoginOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 登出 
	 * @return 结果
	 */
	public ISLogoutOutput logout(ISLogoutInput inputParam) throws Exception {
		return ((ISLogoutOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 字典查询 
	 * @return 结果
	 */
	public ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam) throws Exception {
		return ((ISBaseInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 密码修改 
	 * @return 结果
	 */
	public ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam) throws Exception {
		return ((ISPasswordModifyOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询交易账号列表 
	 * @return 结果
	 */
	public ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam) throws Exception {
		return ((ISTransactionsAccountListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金份额查询 
	 * @return 结果
	 */
	public ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam) throws Exception {
		return ((ISFundShareListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 收益变动曲线 
	 * @return 结果
	 */
	public ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam) throws Exception {
		return ((ISIncomeChangeListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金购买信息 
	 * @return 结果
	 */
	public ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam) throws Exception {
		return ((ISFundBuyInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金交易费率查询 
	 * @return 结果
	 */
	public ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam) throws Exception {
		return ((ISFundTransactionsFeeQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 购买基金 
	 * @return 结果
	 */
	public ISFundBuyOutput fundBuy(ISFundBuyInput inputParam) throws Exception {
		return ((ISFundBuyOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 * @return 结果
	 */
	public ISFundSmartInvestmentStateUpdateOutput fundSmartInvestmentStateUpdate(ISFundSmartInvestmentStateUpdateInput inputParam) throws Exception {
		return ((ISFundSmartInvestmentStateUpdateOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金赎回 
	 * @return 结果
	 */
	public ISFundRedemptionOutput fundRedemption(ISFundRedemptionInput inputParam) throws Exception {
		return ((ISFundRedemptionOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金转换 
	 * @return 结果
	 */
	public ISFundTransferOutput fundTransfer(ISFundTransferInput inputParam) throws Exception {
		return ((ISFundTransferOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 撤单 
	 * @return 结果
	 */
	public ISTransactionCancelOutput transactionCancel(ISTransactionCancelInput inputParam) throws Exception {
		return ((ISTransactionCancelOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	public ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam) throws Exception {
		return ((ISSpecialFundListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询资讯分类 
	 * @return 结果
	 */
	public ISNewsCategoryListQueryOutput newsCategoryListQuery(ISNewsCategoryListQueryInput inputParam) throws Exception {
		return ((ISNewsCategoryListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询资讯列表 
	 * @return 结果
	 */
	public ISNewsListQueryOutput newsListQuery(ISNewsListQueryInput inputParam) throws Exception {
		return ((ISNewsListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询资讯内容 
	 * @return 结果
	 */
	public ISNewsQueryOutput newsQuery(ISNewsQueryInput inputParam) throws Exception {
		return ((ISNewsQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询资源 
	 * @return 结果
	 */
	public ISResourceQueryOutput resourceQuery(ISResourceQueryInput inputParam) throws Exception {
		return ((ISResourceQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金列表 
	 * @return 结果
	 */
	public ISFundListQueryOutput fundListQuery(ISFundListQueryInput inputParam) throws Exception {
		return ((ISFundListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金净值 
	 * @return 结果
	 */
	public ISNetValueQueryOutput netValueQuery(ISNetValueQueryInput inputParam) throws Exception {
		return ((ISNetValueQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金历史净值 
	 * @return 结果
	 */
	public ISHisNetValueQueryOutput hisNetValueQuery(ISHisNetValueQueryInput inputParam) throws Exception {
		return ((ISHisNetValueQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金费用 
	 * @return 结果
	 */
	public ISFundFeeQueryOutput fundFeeQuery(ISFundFeeQueryInput inputParam) throws Exception {
		return ((ISFundFeeQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundInfoQueryOutput fundInfoQuery(ISFundInfoQueryInput inputParam) throws Exception {
		return ((ISFundInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 * @return 结果
	 */
	public ISFundCombineInvestmentAssetsListQueryOutput fundCombineInvestmentAssetsListQuery(ISFundCombineInvestmentAssetsListQueryInput inputParam) throws Exception {
		return ((ISFundCombineInvestmentAssetsListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询交易帮助信息 
	 * @return 结果
	 */
	public ISTransactionsHelpQueryOutput transactionsHelpQuery(ISTransactionsHelpQueryInput inputParam) throws Exception {
		return ((ISTransactionsHelpQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询基金显示列表 
	 * @return 结果
	 */
	public ISFundShowListQueryOutput fundShowListQuery(ISFundShowListQueryInput inputParam) throws Exception {
		return ((ISFundShowListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询可撤单列表 
	 * @return 结果
	 */
	public ISQueryCanCancelTransactionListOutput queryCanCancelTransactionList(ISQueryCanCancelTransactionListInput inputParam) throws Exception {
		return ((ISQueryCanCancelTransactionListOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 获取专户用户授权信息 E002
	 * @return 结果
	 */
	public ISSpecialAccAuthQueryOutput specialAccAuthQuery(ISSpecialAccAuthQueryInput inputParam) throws Exception {
		return ((ISSpecialAccAuthQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 新增专户用户授权 E003
	 * @return 结果
	 */
	public ISSpecialAccAuthAddOutput specialAccAuthAdd(ISSpecialAccAuthAddInput inputParam) throws Exception {
		return ((ISSpecialAccAuthAddOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询专户人数限制 
	 * @return 结果
	 */
	public ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam) throws Exception {
		return ((ISSpeciBuyLimitQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 专户基金详细信息查询 S060
	 * @return 结果
	 */
	public ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam) throws Exception {
		return ((ISSpeciFundInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 销交易账号 C028
	 * @return 结果
	 */
	public ISTradeAccCancelOutput tradeAccCancel(ISTradeAccCancelInput inputParam) throws Exception {
		return ((ISTradeAccCancelOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金收益率查询 S037
	 * @return 结果
	 */
	public ISFundIncomeRateQueryOutput fundIncomeRateQuery(ISFundIncomeRateQueryInput inputParam) throws Exception {
		return ((ISFundIncomeRateQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 定期定额转换 I008
	 * @return 结果
	 */
	public ISFixedInvestmentTransferOutput fixedInvestmentTransfer(ISFixedInvestmentTransferInput inputParam) throws Exception {
		return ((ISFixedInvestmentTransferOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 短期理财到期日查询 S035
	 * @return 结果
	 */
	public ISShortDateQueryOutput shortDateQuery(ISShortDateQueryInput inputParam) throws Exception {
		return ((ISShortDateQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 短期理财明细查询 S020
	 * @return 结果
	 */
	public ISShortMoneyDetailQueryOutput shortMoneyDetailQuery(ISShortMoneyDetailQueryInput inputParam) throws Exception {
		return ((ISShortMoneyDetailQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 数据中心客户信息查询 C025
	 * @return 结果
	 */
	public ISDataCenterCustomerInfoQueryOutput dataCenterCustomerInfoQuery(ISDataCenterCustomerInfoQueryInput inputParam) throws Exception {
		return ((ISDataCenterCustomerInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 份额流水查询 S058
	 * @return 结果
	 */
	public ISShareWaterQueryOutput shareWaterQuery(ISShareWaterQueryInput inputParam) throws Exception {
		return ((ISShareWaterQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 对账单定制查询 V005
	 * @return 结果
	 */
	public ISCheckSheetQueryOutput checkSheetQuery(ISCheckSheetQueryInput inputParam) throws Exception {
		return ((ISCheckSheetQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 对账单定制 V006
	 * @return 结果
	 */
	public ISCheckSheetCustomizeOutput checkSheetCustomize(ISCheckSheetCustomizeInput inputParam) throws Exception {
		return ((ISCheckSheetCustomizeOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 客户角色查询 C053
	 * @return 结果
	 */
	public ISUserRoleQueryOutput userRoleQuery(ISUserRoleQueryInput inputParam) throws Exception {
		return ((ISUserRoleQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 银联通开户签名生成 B026
	 * @return 结果
	 */
	public ISChinaPayMobileOpenAccoOrderOutput chinaPayMobileOpenAccoOrder(ISChinaPayMobileOpenAccoOrderInput inputParam) throws Exception {
		return ((ISChinaPayMobileOpenAccoOrderOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 银联通开户返回信息验证 B027
	 * @return 结果
	 */
	public ISChinapaymobilebackverifyOutput chinapaymobilebackverify(ISChinapaymobilebackverifyInput inputParam) throws Exception {
		return ((ISChinapaymobilebackverifyOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 交易日期查询 
	 * @return 结果
	 */
	public ISFundTradeDatequeryOutput fundTradeDatequery(ISFundTradeDatequeryInput inputParam) throws Exception {
		return ((ISFundTradeDatequeryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 变更银行卡 B016
	 * @return 结果
	 */
	public ISBankCardChangeOutput bankCardChange(ISBankCardChangeInput inputParam) throws Exception {
		return ((ISBankCardChangeOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 * @return 结果
	 */
	public ISPayOrPayeeAddOutput payOrPayeeAdd(ISPayOrPayeeAddInput inputParam) throws Exception {
		return ((ISPayOrPayeeAddOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 收款或付款 
	 * @return 结果
	 */
	public ISPayOrPayeeOutput payOrPayee(ISPayOrPayeeInput inputParam) throws Exception {
		return ((ISPayOrPayeeOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 支付查询 
	 * @return 结果
	 */
	public ISPayOrPayeeQueryOutput payOrPayeeQuery(ISPayOrPayeeQueryInput inputParam) throws Exception {
		return ((ISPayOrPayeeQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 取消收付款 
	 * @return 结果
	 */
	public ISPayOrPayeeCancelOutput payOrPayeeCancel(ISPayOrPayeeCancelInput inputParam) throws Exception {
		return ((ISPayOrPayeeCancelOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询收付款交易记录 
	 * @return 结果
	 */
	public ISPayListQueryOutput payListQuery(ISPayListQueryInput inputParam) throws Exception {
		return ((ISPayListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询客户联系人 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsQueryOutput customerFrequentContactsQuery(ISCustomerFrequentContactsQueryInput inputParam) throws Exception {
		return ((ISCustomerFrequentContactsQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 修改客户联系人备注和标记 
	 * @return 结果
	 */
	public ISFrequentContactsUpdateOutput frequentContactsUpdate(ISFrequentContactsUpdateInput inputParam) throws Exception {
		return ((ISFrequentContactsUpdateOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 收付款交易记录首页 
	 * @return 结果
	 */
	public ISPayHomeQueryOutput payHomeQuery(ISPayHomeQueryInput inputParam) throws Exception {
		return ((ISPayHomeQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 收付款交易记录详情 
	 * @return 结果
	 */
	public ISPayInfoOutput payInfo(ISPayInfoInput inputParam) throws Exception {
		return ((ISPayInfoOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 联系人详情 
	 * @return 结果
	 */
	public ISCustomerFrequentContactsInfoOutput customerFrequentContactsInfo(ISCustomerFrequentContactsInfoInput inputParam) throws Exception {
		return ((ISCustomerFrequentContactsInfoOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 消息列表 
	 * @return 结果
	 */
	public ISInformationListOutput informationList(ISInformationListInput inputParam) throws Exception {
		return ((ISInformationListOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 消息内容 
	 * @return 结果
	 */
	public ISInfomationContentOutput infomationContent(ISInfomationContentInput inputParam) throws Exception {
		return ((ISInfomationContentOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 删除银行卡 
	 * @return 结果
	 */
	public ISCardNoDelOutput cardNoDel(ISCardNoDelInput inputParam) throws Exception {
		return ((ISCardNoDelOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 银行卡列表 
	 * @return 结果
	 */
	public ISCardNoListOutput cardNoList(ISCardNoListInput inputParam) throws Exception {
		return ((ISCardNoListOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 保存银行卡 
	 * @return 结果
	 */
	public ISCardNoSaveOutput cardNoSave(ISCardNoSaveInput inputParam) throws Exception {
		return ((ISCardNoSaveOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 我的红包 
	 * @return 结果
	 */
	public ISMyGiftOutput myGift(ISMyGiftInput inputParam) throws Exception {
		return ((ISMyGiftOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 验证码验证 
	 * @return 结果
	 */
	public ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam) throws Exception {
		return ((ISValidInfoValidOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 同步用户账户数据 
	 * @return 结果
	 */
	public ISSyncUserAccountOutput syncUserAccount(ISSyncUserAccountInput inputParam) throws Exception {
		return ((ISSyncUserAccountOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 判断当前用户的收付款开通情况 
	 * @return 结果
	 */
	public ISPayOrPayeeJudgeOutput payOrPayeeJudge(ISPayOrPayeeJudgeInput inputParam) throws Exception {
		return ((ISPayOrPayeeJudgeOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 * @return 结果
	 */
	public ISSupportPayTransactionsAccountOutput supportPayTransactionsAccount(ISSupportPayTransactionsAccountInput inputParam) throws Exception {
		return ((ISSupportPayTransactionsAccountOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询现金宝资产 
	 * @return 结果
	 */
	public ISQueryMoneyAssetsOutput queryMoneyAssets(ISQueryMoneyAssetsInput inputParam) throws Exception {
		return ((ISQueryMoneyAssetsOutput)(this.callServer(inputParam)));
	}
}
