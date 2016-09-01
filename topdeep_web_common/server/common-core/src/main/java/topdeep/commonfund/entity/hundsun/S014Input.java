package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 投资收益查询(S014)
 */
public class S014Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	private String begindate = "";
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	private String enddate = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 基金代码,可以是单独的一支持基金代码或多个基金代码时以逗号间隔
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S014Input() {
		this.setFunction("S014");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 基金代码,可以是单独的一支持基金代码或多个基金代码时以逗号间隔
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,可以是单独的一支持基金代码或多个基金代码时以逗号间隔
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("begindate", this.begindate);
		inputMap.put("enddate", this.enddate);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("fundcode", this.fundcode);
	}
}
