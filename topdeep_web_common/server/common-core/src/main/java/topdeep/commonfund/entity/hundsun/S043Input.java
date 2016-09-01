package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预计还款日期查询(S043)
 */
public class S043Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 还款业务代码,快速还款为098
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 待还款银行编号,
	 */
	private String paytobankno = "";
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	private String paytocardtype = "";
	
	/**
	 * 还款到账日期,预约还款需要
	 */
	private String acceptdate = "";
	
	/**
	 * 初始化参数
	 */
	public S043Input() {
		this.setFunction("S043");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 还款业务代码,快速还款为098
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 还款业务代码,快速还款为098
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public String getPaytobankno() {
		return this.paytobankno;
	}
	
	/**
	 * 待还款银行编号,
	 */
	public void setPaytobankno(String value)
	 {
		this.paytobankno = value;
	}
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	public String getPaytocardtype() {
		return this.paytocardtype;
	}
	
	/**
	 * 待还款银行卡类型,1-借记卡 2-信用卡
	 */
	public void setPaytocardtype(String value)
	 {
		this.paytocardtype = value;
	}
	
	/**
	 * 还款到账日期,预约还款需要
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 还款到账日期,预约还款需要
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("paytobankno", this.paytobankno);
		inputMap.put("paytocardtype", this.paytocardtype);
		inputMap.put("acceptdate", this.acceptdate);
	}
}
