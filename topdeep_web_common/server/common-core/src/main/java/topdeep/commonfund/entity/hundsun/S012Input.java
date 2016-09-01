package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 资金流水查询(S012)
 */
public class S012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private Integer applyrecordno;
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 起始日期,如20101231
	 */
	private String startdate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 资金流水编号,
	 */
	private String capitalserial = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 在途标识,1：在途，其他：全部
	 */
	private String onlineflag = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 初始化参数
	 */
	public S012Input() {
		this.setFunction("S012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(Integer value)
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
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 资金流水编号,
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水编号,
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
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
	 * 在途标识,1：在途，其他：全部
	 */
	public String getOnlineflag() {
		return this.onlineflag;
	}
	
	/**
	 * 在途标识,1：在途，其他：全部
	 */
	public void setOnlineflag(String value)
	 {
		this.onlineflag = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("capitalserial", this.capitalserial);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("onlineflag", this.onlineflag);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype.toString());
	}
}
