package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_n0a {
	
	/**
	 * 查询基金费用 
	 * @return 结果
	 */
	ISFundFeeQueryOutput fundFeeQuery(ISFundFeeQueryInput inputParam);
	
	/**
	 * 基金基本信息 {fundcode}为变量
	 * @return 结果
	 */
	ISFundInfoQueryOutput fundInfoQuery(ISFundInfoQueryInput inputParam);
	
	/**
	 * 基金组合投资资产组合 {fundcode}为变量
	 * @return 结果
	 */
	ISFundCombineInvestmentAssetsListQueryOutput fundCombineInvestmentAssetsListQuery(ISFundCombineInvestmentAssetsListQueryInput inputParam);
}
