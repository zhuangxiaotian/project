package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易申请查询(S056)
 */
public class S056Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 业务代码,多个业务代码之间以逗号间隔.多个业务(指的是申请的业务类别)代码之间查询为或的关系
	 */
	private String callingcodes = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 终止日期(<=),
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,默认取参数ETS_SUPPORTSUPERMONEYFUND配置的基金代码
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 申请记录数,每页记录数
	 */
	private Integer recordNo;
	
	/**
	 * 起始日期(>=),如20101231
	 */
	private String startdate = "";
	
	/**
	 * 结束自然日,
	 */
	private String acceptdateend = "";
	
	/**
	 * 开始自然日,
	 */
	private String acceptdatestart = "";
	
	/**
	 * 业务代码不等于,
	 */
	private String businflagnoteq = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 初始化参数
	 */
	public S056Input() {
		this.setFunction("S056");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 业务代码,多个业务代码之间以逗号间隔.多个业务(指的是申请的业务类别)代码之间查询为或的关系
	 */
	public String getCallingcodes() {
		return this.callingcodes;
	}
	
	/**
	 * 业务代码,多个业务代码之间以逗号间隔.多个业务(指的是申请的业务类别)代码之间查询为或的关系
	 */
	public void setCallingcodes(String value)
	 {
		this.callingcodes = value;
	}
	
	/**
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 终止日期(<=),
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 终止日期(<=),
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金代码,默认取参数ETS_SUPPORTSUPERMONEYFUND配置的基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,默认取参数ETS_SUPPORTSUPERMONEYFUND配置的基金代码
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
	 * 申请记录数,每页记录数
	 */
	public Integer getRecordNo() {
		return this.recordNo;
	}
	
	/**
	 * 申请记录数,每页记录数
	 */
	public void setRecordNo(Integer value)
	 {
		this.recordNo = value;
	}
	
	/**
	 * 起始日期(>=),如20101231
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期(>=),如20101231
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 结束自然日,
	 */
	public String getAcceptdateend() {
		return this.acceptdateend;
	}
	
	/**
	 * 结束自然日,
	 */
	public void setAcceptdateend(String value)
	 {
		this.acceptdateend = value;
	}
	
	/**
	 * 开始自然日,
	 */
	public String getAcceptdatestart() {
		return this.acceptdatestart;
	}
	
	/**
	 * 开始自然日,
	 */
	public void setAcceptdatestart(String value)
	 {
		this.acceptdatestart = value;
	}
	
	/**
	 * 业务代码不等于,
	 */
	public String getBusinflagnoteq() {
		return this.businflagnoteq;
	}
	
	/**
	 * 业务代码不等于,
	 */
	public void setBusinflagnoteq(String value)
	 {
		this.businflagnoteq = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("busintype", this.busintype);
		inputMap.put("callingcodes", this.callingcodes);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("recordNo", this.formatInteger(this.recordNo));
		inputMap.put("startdate", this.startdate);
		inputMap.put("acceptdateend", this.acceptdateend);
		inputMap.put("acceptdatestart", this.acceptdatestart);
		inputMap.put("businflagnoteq", this.businflagnoteq);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("applyserial", this.applyserial);
	}
}
