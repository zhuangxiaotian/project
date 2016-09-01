package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金收益率查询(S017)
 */
public class S017Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，（得仕必须传DS）
	 */
	private String datasource = "";
	
	/**
	 * 结束日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	private String enddate = "";
	
	/**
	 * 开始日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	private String startdate = "";
	
	/**
	 * 基金代码,数据中心落地接口，使用基金代码才能查询出日、月、年的净值增长率
	 */
	private String fundcode = "";
	
	/**
	 * 初始化参数
	 */
	public S017Input() {
		this.setFunction("S017");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，（得仕必须传DS）
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，（得仕必须传DS）
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 结束日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 开始日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 开始日期,日期格式：yyyy-MM-dd / yyyyMMdd
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 基金代码,数据中心落地接口，使用基金代码才能查询出日、月、年的净值增长率
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,数据中心落地接口，使用基金代码才能查询出日、月、年的净值增长率
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("datasource", this.datasource);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("fundcode", this.fundcode);
	}
}
