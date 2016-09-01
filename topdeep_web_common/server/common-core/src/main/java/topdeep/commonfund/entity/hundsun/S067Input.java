package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询客户市值(S067)
 */
public class S067Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金账号,querytype为1必传
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 查询模式,如果值是1，则表示华宝兴业个性化需求，调用华宝兴业自己开发的存储过程
	 */
	private String querytype = "";
	
	/**
	 * 客户编号,数据中心的客户编号
	 */
	private String custno = "";
	
	/**
	 * 初始化参数
	 */
	public S067Input() {
		this.setFunction("S067");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金账号,querytype为1必传
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,querytype为1必传
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
	 * 查询模式,如果值是1，则表示华宝兴业个性化需求，调用华宝兴业自己开发的存储过程
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询模式,如果值是1，则表示华宝兴业个性化需求，调用华宝兴业自己开发的存储过程
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 客户编号,数据中心的客户编号
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,数据中心的客户编号
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("querytype", this.querytype);
		inputMap.put("custno", this.custno);
	}
}
