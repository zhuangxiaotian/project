package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u0u {
	
	/**
	 * 当日交易申请查询 当日委托
	 * @return 结果
	 */
	ISTodayTransactionsApplicationListQueryOutput todayTransactionsApplicationListQuery(ISTodayTransactionsApplicationListQueryInput inputParam);
	
	/**
	 * 明细查询 
	 * @return 结果
	 */
	ISTransactionRecordDetailQueryOutput transactionRecordDetailQuery(ISTransactionRecordDetailQueryInput inputParam);
	
	/**
	 * 查询专户剩余额度 E006
	 * @return 结果
	 */
	ISSpecialAccBalanceQueryOutput specialAccBalanceQuery(ISSpecialAccBalanceQueryInput inputParam);
	
	/**
	 * 查询可撤单列表 
	 * @return 结果
	 */
	ISQueryCanCancelTransactionListOutput queryCanCancelTransactionList(ISQueryCanCancelTransactionListInput inputParam);
	
	/**
	 * 获取专户用户授权信息 E002
	 * @return 结果
	 */
	ISSpecialAccAuthQueryOutput specialAccAuthQuery(ISSpecialAccAuthQueryInput inputParam);
	
	/**
	 * 新增专户用户授权 E003
	 * @return 结果
	 */
	ISSpecialAccAuthAddOutput specialAccAuthAdd(ISSpecialAccAuthAddInput inputParam);
}
