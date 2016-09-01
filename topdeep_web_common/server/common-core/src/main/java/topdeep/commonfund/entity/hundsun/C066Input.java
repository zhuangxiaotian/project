package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 重置注册密码(C066)
 */
public class C066Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 密码,
	 */
	private String newloginpwd = "";
	
	/**
	 * 初始化参数
	 */
	public C066Input() {
		this.setFunction("C066");
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
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 密码,
	 */
	public String getNewloginpwd() {
		return this.newloginpwd;
	}
	
	/**
	 * 密码,
	 */
	public void setNewloginpwd(String value)
	 {
		this.newloginpwd = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("newloginpwd", this.newloginpwd);
	}
}
