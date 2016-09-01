package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金收益率查询(S037)
 */
public class S037Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	private String enddate = "";
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	private String startdate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S037Input() {
		this.setFunction("S037");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("fundcode", this.fundcode);
	}
}
