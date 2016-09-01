package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 华宝查询未付收益变化流水明细(S089)
 */
public class S089Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 截止日期,
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 起始日期,
	 */
	private String startdate = "";
	
	/**
	 * 每页条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 页数,
	 */
	private String pageno = "";
	
	/**
	 * 初始化参数
	 */
	public S089Input() {
		this.setFunction("S089");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 每页条数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页条数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 页数,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 页数,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("startdate", this.startdate);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("pageno", this.pageno);
	}
}
