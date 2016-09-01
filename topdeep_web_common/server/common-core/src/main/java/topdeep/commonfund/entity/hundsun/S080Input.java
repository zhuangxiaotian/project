package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史份额查询(S080)
 */
public class S080Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 份额日期,
	 */
	private String cdate = "";
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 初始化参数
	 */
	public S080Input() {
		this.setFunction("S080");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 份额日期,
	 */
	public String getCdate() {
		return this.cdate;
	}
	
	/**
	 * 份额日期,
	 */
	public void setCdate(String value)
	 {
		this.cdate = value;
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 销售商代码,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
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
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cdate", this.cdate);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
	}
}
