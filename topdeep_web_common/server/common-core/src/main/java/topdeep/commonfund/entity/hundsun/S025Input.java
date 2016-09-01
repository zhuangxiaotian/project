package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易申请查询(S025)
 */
public class S025Input extends HundsunBaseInput implements Serializable {
	
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
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	private String agencyno = "";
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	private String agencytype = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 业务代码,取字典“查询业务类别”
	 */
	private String callingcode = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	private String confirmflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 初始化参数
	 */
	public S025Input() {
		this.setFunction("S025");
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
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public String getAgencytype() {
		return this.agencytype;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public void setAgencytype(String value)
	 {
		this.agencytype = value;
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
	 * 业务代码,取字典“查询业务类别”
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,取字典“查询业务类别”
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 组合申请编号,
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合申请编号,
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
	}
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 基金类型,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("agencytype", this.agencytype);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("combrequestno", this.combrequestno);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("fundtype", this.fundtype);
	}
}
