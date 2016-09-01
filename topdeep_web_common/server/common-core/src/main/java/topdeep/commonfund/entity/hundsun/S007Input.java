package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金净值查询(S007)
 */
public class S007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金管理人代码,当datasource=DC的时候，该条件无效
	 */
	private String managercode = "";
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	private String datasource = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 是否查自然日行情,参数为1时且基金代码为超级现金宝代码时，查超级现金宝的自然日基金行情。否则查全部行情。
	 */
	private String isqrynaturalday = "";
	
	/**
	 * 初始化参数
	 */
	public S007Input() {
		this.setFunction("S007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金管理人代码,当datasource=DC的时候，该条件无效
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码,当datasource=DC的时候，该条件无效
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
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
	 * 是否查自然日行情,参数为1时且基金代码为超级现金宝代码时，查超级现金宝的自然日基金行情。否则查全部行情。
	 */
	public String getIsqrynaturalday() {
		return this.isqrynaturalday;
	}
	
	/**
	 * 是否查自然日行情,参数为1时且基金代码为超级现金宝代码时，查超级现金宝的自然日基金行情。否则查全部行情。
	 */
	public void setIsqrynaturalday(String value)
	 {
		this.isqrynaturalday = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("managercode", this.managercode);
		inputMap.put("datasource", this.datasource);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("isqrynaturalday", this.isqrynaturalday);
	}
}
