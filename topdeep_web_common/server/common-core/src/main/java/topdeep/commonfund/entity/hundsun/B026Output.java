package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银联通SDK开户签名生成(B026)
 */
public class B026Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 开户特征码,
	 */
	private String charactercode = "";
	
	/**
	 * 商户号,
	 */
	private String merId = "";
	
	/**
	 * 商户订单号,
	 */
	private String merOrderId = "";
	
	/**
	 * 商户订单时间,
	 */
	private String merOrderTime = "";
	
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
	 * 商户号,
	 */
	public String getMerId() {
		return this.merId;
	}
	
	/**
	 * 商户号,
	 */
	public void setMerId(String value)
	 {
		this.merId = value;
	}
	
	/**
	 * 商户订单号,
	 */
	public String getMerOrderId() {
		return this.merOrderId;
	}
	
	/**
	 * 商户订单号,
	 */
	public void setMerOrderId(String value)
	 {
		this.merOrderId = value;
	}
	
	/**
	 * 商户订单时间,
	 */
	public String getMerOrderTime() {
		return this.merOrderTime;
	}
	
	/**
	 * 商户订单时间,
	 */
	public void setMerOrderTime(String value)
	 {
		this.merOrderTime = value;
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
