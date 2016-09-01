package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 第三方预约交易申请查询(S051)
 */
public class S051Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 终止日期,
	 */
	private String enddate = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 是否只查询有预约单号的申请,1：是；0或空：否；默认1
	 */
	private String hasreserveno = "";
	
	/**
	 * 起始日期,
	 */
	private String startdate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S051Input() {
		this.setFunction("S051");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	 * 终止日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 终止日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 是否只查询有预约单号的申请,1：是；0或空：否；默认1
	 */
	public String getHasreserveno() {
		return this.hasreserveno;
	}
	
	/**
	 * 是否只查询有预约单号的申请,1：是；0或空：否；默认1
	 */
	public void setHasreserveno(String value)
	 {
		this.hasreserveno = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("custno", this.custno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("hasreserveno", this.hasreserveno);
		inputMap.put("startdate", this.startdate);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
