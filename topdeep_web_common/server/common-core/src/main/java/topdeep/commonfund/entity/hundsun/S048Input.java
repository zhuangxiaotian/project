package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 公共事业缴费查询(S048)
 */
public class S048Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 缴费单号,
	 */
	private String paymentorderno = "";
	
	/**
	 * 收费单位标识号,
	 */
	private String paymentunit = "";
	
	/**
	 * 缴费单类型,1、用户号2、条形码
	 */
	private String payordertype = "";
	
	/**
	 * 初始化参数
	 */
	public S048Input() {
		this.setFunction("S048");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 缴费单号,
	 */
	public String getPaymentorderno() {
		return this.paymentorderno;
	}
	
	/**
	 * 缴费单号,
	 */
	public void setPaymentorderno(String value)
	 {
		this.paymentorderno = value;
	}
	
	/**
	 * 收费单位标识号,
	 */
	public String getPaymentunit() {
		return this.paymentunit;
	}
	
	/**
	 * 收费单位标识号,
	 */
	public void setPaymentunit(String value)
	 {
		this.paymentunit = value;
	}
	
	/**
	 * 缴费单类型,1、用户号2、条形码
	 */
	public String getPayordertype() {
		return this.payordertype;
	}
	
	/**
	 * 缴费单类型,1、用户号2、条形码
	 */
	public void setPayordertype(String value)
	 {
		this.payordertype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("paymentorderno", this.paymentorderno);
		inputMap.put("paymentunit", this.paymentunit);
		inputMap.put("payordertype", this.payordertype);
	}
}
