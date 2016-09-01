package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 份额流水查询(S058)
 */
public class S058Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 数据来源,
	 */
	private String datasource = "";
	
	/**
	 * 查询日期,格式“yyyy-MM-dd” 如2012-12-12
	 */
	private String enddate = "";
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,不登录时必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,不登录时必传
	 */
	private String identitytype = "";
	
	/**
	 * 基金分类,1-公募 2-专户 3-全部 默认全部
	 */
	private String raisetype = "";
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 是否过滤无效数据,1：默认值过滤，0：不过滤
	 */
	private String invalidfilter = "";
	
	/**
	 * 销售商代码,
	 */
	private Double agencyno;
	
	/**
	 * 申请条数,每页记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 初始化参数
	 */
	public S058Input() {
		this.setFunction("S058");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 数据来源,
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 查询日期,格式“yyyy-MM-dd” 如2012-12-12
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 查询日期,格式“yyyy-MM-dd” 如2012-12-12
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	 * 证件号码,不登录时必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,不登录时必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,不登录时必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,不登录时必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 基金分类,1-公募 2-专户 3-全部 默认全部
	 */
	public String getRaisetype() {
		return this.raisetype;
	}
	
	/**
	 * 基金分类,1-公募 2-专户 3-全部 默认全部
	 */
	public void setRaisetype(String value)
	 {
		this.raisetype = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 是否过滤无效数据,1：默认值过滤，0：不过滤
	 */
	public String getInvalidfilter() {
		return this.invalidfilter;
	}
	
	/**
	 * 是否过滤无效数据,1：默认值过滤，0：不过滤
	 */
	public void setInvalidfilter(String value)
	 {
		this.invalidfilter = value;
	}
	
	/**
	 * 销售商代码,
	 */
	public Double getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(Double value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("datasource", this.datasource);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("raisetype", this.raisetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("invalidfilter", this.invalidfilter);
		inputMap.put("agencyno", this.agencyno.toString());
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("pageno", this.formatInteger(this.pageno));
	}
}
