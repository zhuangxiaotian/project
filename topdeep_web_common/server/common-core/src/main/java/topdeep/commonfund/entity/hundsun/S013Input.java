package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 浮动盈亏查询(S013)
 */
public class S013Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	private String begindate = "";
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	private String enddate = "";
	
	/**
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	private String querytype = "";
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	private String factor = "";
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	private String filtervenue = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	private String supportcloseacco = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	private String agencyno = "";
	
	/**
	 * 初始化参数
	 */
	public S013Input() {
		this.setFunction("S013");
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
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	public String getFactor() {
		return this.factor;
	}
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	public void setFactor(String value)
	 {
		this.factor = value;
	}
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	public String getFiltervenue() {
		return this.filtervenue;
	}
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	public void setFiltervenue(String value)
	 {
		this.filtervenue = value;
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
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	public String getSupportcloseacco() {
		return this.supportcloseacco;
	}
	
	/**
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	public void setSupportcloseacco(String value)
	 {
		this.supportcloseacco = value;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("begindate", this.begindate);
		inputMap.put("enddate", this.enddate);
		inputMap.put("querytype", this.querytype);
		inputMap.put("factor", this.factor);
		inputMap.put("filtervenue", this.filtervenue);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("supportcloseacco", this.supportcloseacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("agencyno", this.agencyno);
	}
}
