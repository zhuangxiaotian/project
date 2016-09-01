package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史分红查询(S005)
 */
public class S005Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 起始日期,如20101231
	 */
	private String startdate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	private String querytype = "";
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	private String datasource = "";
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	private String fundtype = "";
	
	/**
	 * 分红方式,
	 */
	private String melonmethod = "";
	
	/**
	 * 资金方式,需要升级直销服务
	 */
	private String capitalmode = "";
	
	/**
	 * 业务大类,此查询条件依赖直销DS_3.5_20140701SP12
	 */
	private String busintype = "";
	
	/**
	 * 初始化参数
	 */
	public S005Input() {
		this.setFunction("S005");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 结束日期,如20101231
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	
	/**
	 * 起始日期,如20101231
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 交易来源,DS：直销，DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,为空时显示所有基金类型的信息
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 资金方式,需要升级直销服务
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,需要升级直销服务
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 业务大类,此查询条件依赖直销DS_3.5_20140701SP12
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,此查询条件依赖直销DS_3.5_20140701SP12
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("startdate", this.startdate);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("querytype", this.querytype);
		inputMap.put("datasource", this.datasource);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("melonmethod", this.melonmethod);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("busintype", this.busintype);
	}
}
