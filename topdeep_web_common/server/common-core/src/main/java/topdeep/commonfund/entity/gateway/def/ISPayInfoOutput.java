package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收付款交易记录详情功能输出参数
 */
public class ISPayInfoOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
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
	 * 交易对象姓名,
	 */
	private String payOrPayeeName;
	
	/**
	 * 创建时间,
	 */
	private String createTime;
	
	public ISPayInfoOutput() {
		this.setZ_funcCode("m0j");
	}
	
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
	
	/**
	 * 交易对象姓名,
	 */
	public String getPayOrPayeeName() {
		return this.payOrPayeeName;
	}
	
	/**
	 * 交易对象姓名,
	 */
	public void setPayOrPayeeName(String value)
	 {
		this.payOrPayeeName = value;
	}
	
	/**
	 * 创建时间,
	 */
	public String getCreateTime() {
		return this.createTime;
	}
	
	/**
	 * 创建时间,
	 */
	public void setCreateTime(String value)
	 {
		this.createTime = value;
	}
}
