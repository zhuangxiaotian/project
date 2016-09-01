package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u0a {
	
	/**
	 * 查询风险测试题库 
	 * @return 结果
	 */
	ISRiskEvaluationExamQueryOutput riskEvaluationExamQuery(ISRiskEvaluationExamQueryInput inputParam);
	
	/**
	 * 风险测评 
	 * @return 结果
	 */
	ISRiskEvaluationOutput riskEvaluation(ISRiskEvaluationInput inputParam);
	
	/**
	 * 历史确认查询 
	 * @return 结果
	 */
	ISHistoryConfirmQueryOutput historyConfirmQuery(ISHistoryConfirmQueryInput inputParam);
	
	/**
	 * 购买基金 
	 * @return 结果
	 */
	ISFundBuyOutput fundBuy(ISFundBuyInput inputParam);
	
	/**
	 * 基金赎回 
	 * @return 结果
	 */
	ISFundRedemptionOutput fundRedemption(ISFundRedemptionInput inputParam);
	
	/**
	 * 基金转换 
	 * @return 结果
	 */
	ISFundTransferOutput fundTransfer(ISFundTransferInput inputParam);
	
	/**
	 * 撤单 
	 * @return 结果
	 */
	ISTransactionCancelOutput transactionCancel(ISTransactionCancelInput inputParam);
}
