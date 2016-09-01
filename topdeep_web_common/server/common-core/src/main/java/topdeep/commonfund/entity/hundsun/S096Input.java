package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 业绩报酬查询接口(S096)
 */
public class S096Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业绩报酬标识（0：已提，1：预提）,
	 */
	private String budgetflag;
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 每页记录数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 起始日期,
	 */
	private String begindate = "";
	
	/**
	 * 结束日期,
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 初始化参数
	 */
	public S096Input() {
		this.setFunction("S096");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业绩报酬标识（0：已提，1：预提）,
	 */
	public String getBudgetflag() {
		return this.budgetflag;
	}
	
	/**
	 * 业绩报酬标识（0：已提，1：预提）,
	 */
	public void setBudgetflag(String value)
	 {
		this.budgetflag = value;
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
	 * 每页记录数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页记录数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 结束日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,
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
	 * 页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("budgetflag", this.budgetflag.toString());
		inputMap.put("custno", this.custno);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("begindate", this.begindate);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.pageno);
	}
}
