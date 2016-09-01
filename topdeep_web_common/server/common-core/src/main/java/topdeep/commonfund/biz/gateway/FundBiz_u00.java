package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u00 {
	
	/**
	 * 密码修改 
	 * @return 结果
	 */
	ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam);
	
	/**
	 * 查询交易账号列表 
	 * @return 结果
	 */
	ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam);
	
	/**
	 * 基金份额查询 
	 * @return 结果
	 */
	ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam);
	
	/**
	 * 收益变动曲线 
	 * @return 结果
	 */
	ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam);
	
	/**
	 * 查询基金购买信息 
	 * @return 结果
	 */
	ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam);
	
	/**
	 * 基金交易费率查询 
	 * @return 结果
	 */
	ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam);
}
