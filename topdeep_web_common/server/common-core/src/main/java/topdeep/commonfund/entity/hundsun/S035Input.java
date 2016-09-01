package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 短期理财到期日查询(S035)
 */
public class S035Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 申请日期,当数据源为直销时不需填写
	 */
	private String applydate = "";
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	private String datasource = "";
	
	/**
	 * 初始化参数
	 */
	public S035Input() {
		this.setFunction("S035");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 申请日期,当数据源为直销时不需填写
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,当数据源为直销时不需填写
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("applydate", this.applydate);
		inputMap.put("datasource", this.datasource);
	}
}
