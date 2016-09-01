package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款银行信息查询(B042)
 */
public class B042Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 还款卡类型,
	 */
	private String paymentcardtype = "";
	
	private List<B042OutputDetail> detail = new ArrayList<B042OutputDetail>();
	
	/**
	 * 还款卡类型,
	 */
	public String getPaymentcardtype() {
		return this.paymentcardtype;
	}
	
	/**
	 * 还款卡类型,
	 */
	public void setPaymentcardtype(String value)
	 {
		this.paymentcardtype = value;
	}
	
	public List<B042OutputDetail> getDetail() {
		return this.detail;
	}
	
}
