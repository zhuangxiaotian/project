package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改密码(C012)
 */
public class C012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 新密码,
	 */
	private String newpwd = "空";
	
	/**
	 * 旧密码,
	 */
	private String oldpwd = "";
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	private String pwdtype = "t";
	
	/**
	 * 初始化参数
	 */
	public C012Input() {
		this.setFunction("C012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 新密码,
	 */
	public String getNewpwd() {
		return this.newpwd;
	}
	
	/**
	 * 新密码,
	 */
	public void setNewpwd(String value)
	 {
		this.newpwd = value;
	}
	
	/**
	 * 旧密码,
	 */
	public String getOldpwd() {
		return this.oldpwd;
	}
	
	/**
	 * 旧密码,
	 */
	public void setOldpwd(String value)
	 {
		this.oldpwd = value;
	}
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	public String getPwdtype() {
		return this.pwdtype;
	}
	
	/**
	 * 密码类型,t:交易密码;q:查询密码;r:注册密码
	 */
	public void setPwdtype(String value)
	 {
		this.pwdtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("newpwd", this.newpwd);
		inputMap.put("oldpwd", this.oldpwd);
		inputMap.put("pwdtype", this.pwdtype);
	}
}
