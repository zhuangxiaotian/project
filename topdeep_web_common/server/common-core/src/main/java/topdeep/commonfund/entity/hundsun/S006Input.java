package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史基金行情查询(S006)
 */
public class S006Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 起始日期,如20101231，当传入为当前日期时，为查询最新净值，此时有效参数只有fundcode。
	 */
	private String startdate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	private String datasource = "";
	
	/**
	 * 查询条件,1：专户历史净值，3：非专户历史净值（默认）
	 */
	private String querytype = "";
	
	/**
	 * 初始化参数
	 */
	public S006Input() {
		this.setFunction("S006");
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
	 * 起始日期,如20101231，当传入为当前日期时，为查询最新净值，此时有效参数只有fundcode。
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,如20101231，当传入为当前日期时，为查询最新净值，此时有效参数只有fundcode。
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
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
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 查询条件,1：专户历史净值，3：非专户历史净值（默认）
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询条件,1：专户历史净值，3：非专户历史净值（默认）
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("datasource", this.datasource);
		inputMap.put("querytype", this.querytype);
	}
}
