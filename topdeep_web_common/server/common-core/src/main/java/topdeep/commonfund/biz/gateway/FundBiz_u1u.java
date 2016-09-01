package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u1u {
	
	/**
	 * 查询特殊基金列表 
	 * @return 结果
	 */
	ISSpecialFundListQueryOutput specialFundListQuery(ISSpecialFundListQueryInput inputParam);
	
	/**
	 * 支付查询 
	 * @return 结果
	 */
	ISPayOrPayeeQueryOutput payOrPayeeQuery(ISPayOrPayeeQueryInput inputParam);
	
	/**
	 * 取消收付款 
	 * @return 结果
	 */
	ISPayOrPayeeCancelOutput payOrPayeeCancel(ISPayOrPayeeCancelInput inputParam);
	
	/**
	 * 查询收付款交易记录 
	 * @return 结果
	 */
	ISPayListQueryOutput payListQuery(ISPayListQueryInput inputParam);
	
	/**
	 * 查询客户联系人 
	 * @return 结果
	 */
	ISCustomerFrequentContactsQueryOutput customerFrequentContactsQuery(ISCustomerFrequentContactsQueryInput inputParam);
	
	/**
	 * 修改客户联系人备注和标记 
	 * @return 结果
	 */
	ISFrequentContactsUpdateOutput frequentContactsUpdate(ISFrequentContactsUpdateInput inputParam);
	
	/**
	 * 收付款交易记录首页 
	 * @return 结果
	 */
	ISPayHomeQueryOutput payHomeQuery(ISPayHomeQueryInput inputParam);
	
	/**
	 * 收付款交易记录详情 
	 * @return 结果
	 */
	ISPayInfoOutput payInfo(ISPayInfoInput inputParam);
}
