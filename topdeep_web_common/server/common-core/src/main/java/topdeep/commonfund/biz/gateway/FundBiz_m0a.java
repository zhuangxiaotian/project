package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_m0a {
	
	/**
	 * 添加收款人或付款人信息入待支付表 
	 * @return 结果
	 */
	ISPayOrPayeeAddOutput payOrPayeeAdd(ISPayOrPayeeAddInput inputParam);
	
	/**
	 * 收款或付款 
	 * @return 结果
	 */
	ISPayOrPayeeOutput payOrPayee(ISPayOrPayeeInput inputParam);
	
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
	
	/**
	 * 同步用户账户数据 
	 * @return 结果
	 */
	ISSyncUserAccountOutput syncUserAccount(ISSyncUserAccountInput inputParam);
}
