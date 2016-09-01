package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * Chinapay手机支付下单(B046)
 */
public class B046Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 开户特征码,
	 */
	private String charactercode = "";
	
	/**
	 * 商户ID,
	 */
	private String merid = "";
	
	/**
	 * 商户订单号,
	 */
	private String merorderid = "";
	
	/**
	 * 商户订单时间,
	 */
	private String merordertime = "";
	
	/**
	 * 签名,
	 */
	private String sign = "";
	
	/**
	 * 开户特征码,
	 */
	public String getCharactercode() {
		return this.charactercode;
	}
	
	/**
	 * 开户特征码,
	 */
	public void setCharactercode(String value)
	 {
		this.charactercode = value;
	}
	
	/**
	 * 商户ID,
	 */
	public String getMerid() {
		return this.merid;
	}
	
	/**
	 * 商户ID,
	 */
	public void setMerid(String value)
	 {
		this.merid = value;
	}
	
	/**
	 * 商户订单号,
	 */
	public String getMerorderid() {
		return this.merorderid;
	}
	
	/**
	 * 商户订单号,
	 */
	public void setMerorderid(String value)
	 {
		this.merorderid = value;
	}
	
	/**
	 * 商户订单时间,
	 */
	public String getMerordertime() {
		return this.merordertime;
	}
	
	/**
	 * 商户订单时间,
	 */
	public void setMerordertime(String value)
	 {
		this.merordertime = value;
	}
	
	/**
	 * 签名,
	 */
	public String getSign() {
		return this.sign;
	}
	
	/**
	 * 签名,
	 */
	public void setSign(String value)
	 {
		this.sign = value;
	}
}
