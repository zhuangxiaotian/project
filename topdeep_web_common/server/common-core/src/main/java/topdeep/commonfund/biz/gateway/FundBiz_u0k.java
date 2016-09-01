package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u0k {
	
	/**
	 * 个人客户信息查询 
	 * @return 结果
	 */
	ISCustomerInfoQueryOutput customerInfoQuery(ISCustomerInfoQueryInput inputParam);
	
	/**
	 * 个人客户信息修改 
	 * @return 结果
	 */
	ISCustomerInfoModifyOutput customerInfoModify(ISCustomerInfoModifyInput inputParam);
	
	/**
	 * 预约申购 
	 * @return 结果
	 */
	ISAppointmentPurchaseOutput appointmentPurchase(ISAppointmentPurchaseInput inputParam);
	
	/**
	 * 预约赎回 
	 * @return 结果
	 */
	ISAppointmentRedeemOutput appointmentRedeem(ISAppointmentRedeemInput inputParam);
	
	/**
	 * 定期定额查询 
	 * @return 结果
	 */
	ISFixedInvestmentQueryOutput fixedInvestmentQuery(ISFixedInvestmentQueryInput inputParam);
	
	/**
	 * 定期定额申购 
	 * @return 结果
	 */
	ISFixedInvestmentPurchaseOutput fixedInvestmentPurchase(ISFixedInvestmentPurchaseInput inputParam);
	
	/**
	 * 历史交易申请查询 
	 * @return 结果
	 */
	ISHistoryTransactionsApplicationListQueryOutput historyTransactionsApplicationListQuery(ISHistoryTransactionsApplicationListQueryInput inputParam);
	
	/**
	 * 定期不定额取消、暂停、恢复 
	 * @return 结果
	 */
	ISFundSmartInvestmentStateUpdateOutput fundSmartInvestmentStateUpdate(ISFundSmartInvestmentStateUpdateInput inputParam);
}
