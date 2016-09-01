package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收付款交易记录首页功能输出明细参数
 */
public class ISPayHomeQueryOutputPayList extends Object implements Serializable {
	
	/**
	 * 交易金额,
	 */
	private String payAmount;
	
	/**
	 * 交易时间,
	 */
	private String payTime;
	
	/**
	 * 交易记录标识,
	 */
	private String payId;
	
	/**
	 * 支付结果（1、失败；2、成功；3、撤销；4、过期）,
	 */
	private String payResult;
	
	/**
	 * 银行名称,
	 */
	private String bank;
	
	/**
	 * 银行卡号,
	 */
	private String cardNo;
	
	/**
	 * 交易金额,
	 */
	public String getPayAmount() {
		return this.payAmount;
	}
	
	/**
	 * 交易金额,
	 */
	public void setPayAmount(String value)
	 {
		this.payAmount = value;
	}
	
	/**
	 * 交易时间,
	 */
	public String getPayTime() {
		return this.payTime;
	}
	
	/**
	 * 交易时间,
	 */
	public void setPayTime(String value)
	 {
		this.payTime = value;
	}
	
	/**
	 * 交易记录标识,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 交易记录标识,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
	
	/**
	 * 支付结果（1、失败；2、成功；3、撤销；4、过期）,
	 */
	public String getPayResult() {
		return this.payResult;
	}
	
	/**
	 * 支付结果（1、失败；2、成功；3、撤销；4、过期）,
	 */
	public void setPayResult(String value)
	 {
		this.payResult = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBank() {
		return this.bank;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBank(String value)
	 {
		this.bank = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getCardNo() {
		return this.cardNo;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setCardNo(String value)
	 {
		this.cardNo = value;
	}
}
