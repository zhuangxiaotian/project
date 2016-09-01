package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝基金行情查询(S059)
 */
public class S059Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 结束日期(<=),如20101231,默认当前日期
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,默认为超级现金宝基金代码(即 取参数ETS_SUPERMONEYFUND配置基金代码)
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,默认为：1
	 */
	private Integer pageNo;
	
	/**
	 * 申请记录数,默认取自SYS_COUNTPERPAGE配置的值
	 */
	private Integer recordNo;
	
	/**
	 * 起始日期(>=),如20101231,默认上一自然日
	 */
	private String startdate = "";
	
	/**
	 * 收益率是否乘100,1：返回的收益率字段需要X100; 0：原值返回；默认为0
	 */
	private String ispercentof = "";
	
	/**
	 * 初始化参数
	 */
	public S059Input() {
		this.setFunction("S059");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 结束日期(<=),如20101231,默认当前日期
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期(<=),如20101231,默认当前日期
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金代码,默认为超级现金宝基金代码(即 取参数ETS_SUPERMONEYFUND配置基金代码)
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,默认为超级现金宝基金代码(即 取参数ETS_SUPERMONEYFUND配置基金代码)
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 当前页码,默认为：1
	 */
	public Integer getPageNo() {
		return this.pageNo;
	}
	
	/**
	 * 当前页码,默认为：1
	 */
	public void setPageNo(Integer value)
	 {
		this.pageNo = value;
	}
	
	/**
	 * 申请记录数,默认取自SYS_COUNTPERPAGE配置的值
	 */
	public Integer getRecordNo() {
		return this.recordNo;
	}
	
	/**
	 * 申请记录数,默认取自SYS_COUNTPERPAGE配置的值
	 */
	public void setRecordNo(Integer value)
	 {
		this.recordNo = value;
	}
	
	/**
	 * 起始日期(>=),如20101231,默认上一自然日
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期(>=),如20101231,默认上一自然日
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 收益率是否乘100,1：返回的收益率字段需要X100; 0：原值返回；默认为0
	 */
	public String getIspercentof() {
		return this.ispercentof;
	}
	
	/**
	 * 收益率是否乘100,1：返回的收益率字段需要X100; 0：原值返回；默认为0
	 */
	public void setIspercentof(String value)
	 {
		this.ispercentof = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageNo", this.formatInteger(this.pageNo));
		inputMap.put("recordNo", this.formatInteger(this.recordNo));
		inputMap.put("startdate", this.startdate);
		inputMap.put("ispercentof", this.ispercentof);
	}
}
