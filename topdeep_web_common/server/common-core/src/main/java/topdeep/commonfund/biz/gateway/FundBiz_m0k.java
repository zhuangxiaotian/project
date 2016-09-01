package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_m0k {
	
	/**
	 * 联系人详情 
	 * @return 结果
	 */
	ISCustomerFrequentContactsInfoOutput customerFrequentContactsInfo(ISCustomerFrequentContactsInfoInput inputParam);
	
	/**
	 * 判断当前用户的收付款开通情况 
	 * @return 结果
	 */
	ISPayOrPayeeJudgeOutput payOrPayeeJudge(ISPayOrPayeeJudgeInput inputParam);
	
	/**
	 * 查询开通支付转让协议的交易账户 
	 * @return 结果
	 */
	ISSupportPayTransactionsAccountOutput supportPayTransactionsAccount(ISSupportPayTransactionsAccountInput inputParam);
	
	/**
	 * 查询现金宝资产 
	 * @return 结果
	 */
	ISQueryMoneyAssetsOutput queryMoneyAssets(ISQueryMoneyAssetsInput inputParam);
}
