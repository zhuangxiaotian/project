package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_n1a {
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam);
	
	/**
	 * 基金收益率查询 S037
	 * @return 结果
	 */
	ISFundIncomeRateQueryOutput fundIncomeRateQuery(ISFundIncomeRateQueryInput inputParam);
	
	/**
	 * 银联通开户签名生成 B026
	 * @return 结果
	 */
	ISChinaPayMobileOpenAccoOrderOutput chinaPayMobileOpenAccoOrder(ISChinaPayMobileOpenAccoOrderInput inputParam);
	
	/**
	 * 银联通开户返回信息验证 B027
	 * @return 结果
	 */
	ISChinapaymobilebackverifyOutput chinapaymobilebackverify(ISChinapaymobilebackverifyInput inputParam);
	
	/**
	 * 交易日期查询 
	 * @return 结果
	 */
	ISFundTradeDatequeryOutput fundTradeDatequery(ISFundTradeDatequeryInput inputParam);
	
	/**
	 * 变更银行卡 B016
	 * @return 结果
	 */
	ISBankCardChangeOutput bankCardChange(ISBankCardChangeInput inputParam);
}
