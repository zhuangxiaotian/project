package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询基金状态预设置(S091)
 */
public class S091Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 截止日期(>=),格式：yyyymmdd
	 */
	private String enddategt = "";
	
	/**
	 * 截止日期(<=),格式：yyyymmdd
	 */
	private String enddatelt = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 起始日期(>=),格式：yyyymmdd
	 */
	private String startdategt = "";
	
	/**
	 * 起始日期(<=),格式：yyyymmdd
	 */
	private String startdatelt = "";
	
	/**
	 * 状态,
	 */
	private String state = "";
	
	/**
	 * 基金类型,
	 */
	private String type = "";
	
	/**
	 * 初始化参数
	 */
	public S091Input() {
		this.setFunction("S091");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 截止日期(>=),格式：yyyymmdd
	 */
	public String getEnddategt() {
		return this.enddategt;
	}
	
	/**
	 * 截止日期(>=),格式：yyyymmdd
	 */
	public void setEnddategt(String value)
	 {
		this.enddategt = value;
	}
	
	/**
	 * 截止日期(<=),格式：yyyymmdd
	 */
	public String getEnddatelt() {
		return this.enddatelt;
	}
	
	/**
	 * 截止日期(<=),格式：yyyymmdd
	 */
	public void setEnddatelt(String value)
	 {
		this.enddatelt = value;
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
	 * 起始日期(>=),格式：yyyymmdd
	 */
	public String getStartdategt() {
		return this.startdategt;
	}
	
	/**
	 * 起始日期(>=),格式：yyyymmdd
	 */
	public void setStartdategt(String value)
	 {
		this.startdategt = value;
	}
	
	/**
	 * 起始日期(<=),格式：yyyymmdd
	 */
	public String getStartdatelt() {
		return this.startdatelt;
	}
	
	/**
	 * 起始日期(<=),格式：yyyymmdd
	 */
	public void setStartdatelt(String value)
	 {
		this.startdatelt = value;
	}
	
	/**
	 * 状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 基金类型,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddategt", this.enddategt);
		inputMap.put("enddatelt", this.enddatelt);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("startdategt", this.startdategt);
		inputMap.put("startdatelt", this.startdatelt);
		inputMap.put("state", this.state);
		inputMap.put("type", this.type);
	}
}
