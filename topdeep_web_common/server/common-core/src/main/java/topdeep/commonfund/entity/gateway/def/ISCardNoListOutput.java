package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 银行卡列表功能输出参数
 */
public class ISCardNoListOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bank;
	
	/**
	 * 银行卡号,
	 */
	private String cardNo;
	
	/**
	 * 是否开通收付款,
	 */
	private String isOpenPay;
	
	/**
	 * 银行唯一标识,
	 */
	private String id;
	
	public ISCardNoListOutput() {
		this.setZ_funcCode("u1I");
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
	 * 是否开通收付款,
	 */
	public String getIsOpenPay() {
		return this.isOpenPay;
	}
	
	/**
	 * 是否开通收付款,
	 */
	public void setIsOpenPay(String value)
	 {
		this.isOpenPay = value;
	}
	
	/**
	 * 银行唯一标识,
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * 银行唯一标识,
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
}
