package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 时间段内每天的收益(S077)
 */
public class S077Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 查询起始日期,
	 */
	private String begindate = "";
	
	/**
	 * 查询结束时间,
	 */
	private String enddate = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 销售机构编号,
	 */
	private String agencyno = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 对引用的基金列表是否计算的标识,说明：-1不计算；0：全部计算；1：只计算，默认为0
	 */
	private String refflag = "";
	
	/**
	 * 引用基金列表，多支基金以逗号隔开,
	 */
	private String reffunds = "";
	
	/**
	 * 是否使用全部赎回后清理算法，默认为0,
	 */
	private String resetflag = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 初始化参数
	 */
	public S077Input() {
		this.setFunction("S077");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 查询起始日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 查询起始日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 查询结束时间,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 查询结束时间,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	 * 销售机构编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售机构编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 对引用的基金列表是否计算的标识,说明：-1不计算；0：全部计算；1：只计算，默认为0
	 */
	public String getRefflag() {
		return this.refflag;
	}
	
	/**
	 * 对引用的基金列表是否计算的标识,说明：-1不计算；0：全部计算；1：只计算，默认为0
	 */
	public void setRefflag(String value)
	 {
		this.refflag = value;
	}
	
	/**
	 * 引用基金列表，多支基金以逗号隔开,
	 */
	public String getReffunds() {
		return this.reffunds;
	}
	
	/**
	 * 引用基金列表，多支基金以逗号隔开,
	 */
	public void setReffunds(String value)
	 {
		this.reffunds = value;
	}
	
	/**
	 * 是否使用全部赎回后清理算法，默认为0,
	 */
	public String getResetflag() {
		return this.resetflag;
	}
	
	/**
	 * 是否使用全部赎回后清理算法，默认为0,
	 */
	public void setResetflag(String value)
	 {
		this.resetflag = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("begindate", this.begindate);
		inputMap.put("enddate", this.enddate);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("custno", this.custno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("refflag", this.refflag);
		inputMap.put("reffunds", this.reffunds);
		inputMap.put("resetflag", this.resetflag);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("identityno", this.identityno);
	}
}
