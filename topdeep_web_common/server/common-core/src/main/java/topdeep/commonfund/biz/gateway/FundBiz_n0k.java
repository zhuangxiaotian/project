package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_n0k {
	
	/**
	 * 根据类别名称查询资讯列表 
	 * @return 结果
	 */
	ISNewsListByCategoryNameQueryOutput newsListByCategoryNameQuery(ISNewsListByCategoryNameQueryInput inputParam);
	
	/**
	 * 相关工作日查询 
	 * @return 结果
	 */
	ISWorkDayQueryOutput workDayQuery(ISWorkDayQueryInput inputParam);
	
	/**
	 * 快速开户功能 快速开户和下发验证码全是调用此接口
	 * @return 结果
	 */
	ISFastOpenAccountOutput fastOpenAccount(ISFastOpenAccountInput inputParam);
	
	/**
	 * 快速开户功能判断查询 
	 * @return 结果
	 */
	ISFastOpenAccountConditionQueryOutput fastOpenAccountConditionQuery(ISFastOpenAccountConditionQueryInput inputParam);
	
	/**
	 * 交易流程工作日查询 目前只支持查询申购和赎回
	 * @return 结果
	 */
	ISTransactionsProcessDayQueryOutput transactionsProcessDayQuery(ISTransactionsProcessDayQueryInput inputParam);
	
	/**
	 * 查询支持开户的银行列表 
	 * @return 结果
	 */
	ISSupportOpenAccountBankListQueryOutput supportOpenAccountBankListQuery(ISSupportOpenAccountBankListQueryInput inputParam);
	
	/**
	 * 查询交易帮助信息 
	 * @return 结果
	 */
	ISTransactionsHelpQueryOutput transactionsHelpQuery(ISTransactionsHelpQueryInput inputParam);
	
	/**
	 * 查询基金显示列表 
	 * @return 结果
	 */
	ISFundShowListQueryOutput fundShowListQuery(ISFundShowListQueryInput inputParam);
}
