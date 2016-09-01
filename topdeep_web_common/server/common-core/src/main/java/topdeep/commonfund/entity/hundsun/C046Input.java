package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询预登记信息(C046)
 */
public class C046Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	private String identitytype = "";
	
	/**
	 * 客户姓名,
	 */
	private String customname = "";
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。 2.状态字段不是纯数字的话,则采用模糊查询,取值示例:111或者_1_。
	 */
	private String regstate = "";
	
	/**
	 * 初始化参数
	 */
	public C046Input() {
		this.setFunction("C046");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,（参考字典：网上交易个人证件类型）
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
	}
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。 2.状态字段不是纯数字的话,则采用模糊查询,取值示例:111或者_1_。
	 */
	public String getRegstate() {
		return this.regstate;
	}
	
	/**
	 * 登记状态,1.已录入/已签约/录入错误-分别用1与0表示这3个状态成功与否,如111代表已录入/已签约/录入成功。 2.状态字段不是纯数字的话,则采用模糊查询,取值示例:111或者_1_。
	 */
	public void setRegstate(String value)
	 {
		this.regstate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("customname", this.customname);
		inputMap.put("regstate", this.regstate);
	}
}
