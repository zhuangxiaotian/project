package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史收益查询(S049)
 */
public class S049Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 是否对收益求和,0：不求和；1：求和（不求和会返回每天的收益）
	 */
	private String dosum = "";
	
	/**
	 * 截止日期,
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,如不传基金代码，则会取现金宝的基金代码
	 */
	private String fundcode = "现金宝货币基金";
	
	/**
	 * 查询单位,0:日, 1:月（数据来源为DC）
	 */
	private String queryunit = "";
	
	/**
	 * 起始日期,
	 */
	private String startdate = "";
	
	/**
	 * 销售商代码,销售商的3位代码（数据来源为DC）
	 */
	private String agencyno = "";
	
	/**
	 * 证件号码,如360428198711172715（数据来源为DC）
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证（数据来源为DC）
	 */
	private String identitytype = "";
	
	/**
	 * 客户编号,直销暂不支持，查询某个用户传基金账号（数据来源为DS）
	 */
	private String custno = "";
	
	/**
	 * 数据来源,DS为查询直销，其他（DC）查询数据中心
	 */
	private String datasource = "";
	
	/**
	 * 基金账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	private String fundacco = "";
	
	/**
	 * 交易账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	private String tradeacco = "";
	
	/**
	 * 每页请求条数,数据来源为DS时有效，不填默认为系统参数SYS_COUNTPERPAGE取值
	 */
	private String applyrecordno = "";
	
	/**
	 * 请求页码,数据来源为DS时有效，不填默认为1
	 */
	private String pageno = "";
	
	/**
	 * 是否过滤柜台用户信息,（只支持数据源为数据中心的过滤）默认不过滤，值为1时：过滤
	 */
	private String filterCommonTradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S049Input() {
		this.setFunction("S049");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 是否对收益求和,0：不求和；1：求和（不求和会返回每天的收益）
	 */
	public String getDosum() {
		return this.dosum;
	}
	
	/**
	 * 是否对收益求和,0：不求和；1：求和（不求和会返回每天的收益）
	 */
	public void setDosum(String value)
	 {
		this.dosum = value;
	}
	
	/**
	 * 截止日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 截止日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金代码,如不传基金代码，则会取现金宝的基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,如不传基金代码，则会取现金宝的基金代码
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 查询单位,0:日, 1:月（数据来源为DC）
	 */
	public String getQueryunit() {
		return this.queryunit;
	}
	
	/**
	 * 查询单位,0:日, 1:月（数据来源为DC）
	 */
	public void setQueryunit(String value)
	 {
		this.queryunit = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 销售商代码,销售商的3位代码（数据来源为DC）
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,销售商的3位代码（数据来源为DC）
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 证件号码,如360428198711172715（数据来源为DC）
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715（数据来源为DC）
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证（数据来源为DC）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证（数据来源为DC）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 客户编号,直销暂不支持，查询某个用户传基金账号（数据来源为DS）
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,直销暂不支持，查询某个用户传基金账号（数据来源为DS）
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 数据来源,DS为查询直销，其他（DC）查询数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS为查询直销，其他（DC）查询数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 基金账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 交易账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,基金账号和 交易账号比传一个（数据来源为DS）
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 每页请求条数,数据来源为DS时有效，不填默认为系统参数SYS_COUNTPERPAGE取值
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页请求条数,数据来源为DS时有效，不填默认为系统参数SYS_COUNTPERPAGE取值
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 请求页码,数据来源为DS时有效，不填默认为1
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 请求页码,数据来源为DS时有效，不填默认为1
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 是否过滤柜台用户信息,（只支持数据源为数据中心的过滤）默认不过滤，值为1时：过滤
	 */
	public String getFilterCommonTradeacco() {
		return this.filterCommonTradeacco;
	}
	
	/**
	 * 是否过滤柜台用户信息,（只支持数据源为数据中心的过滤）默认不过滤，值为1时：过滤
	 */
	public void setFilterCommonTradeacco(String value)
	 {
		this.filterCommonTradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("dosum", this.dosum);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("queryunit", this.queryunit);
		inputMap.put("startdate", this.startdate);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("custno", this.custno);
		inputMap.put("datasource", this.datasource);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("pageno", this.pageno);
		inputMap.put("filterCommonTradeacco", this.filterCommonTradeacco);
	}
}
