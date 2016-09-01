package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户密码修改(C060)
 */
public class C060Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 子账户新密码,子账户新密码
	 */
	private String newpwd = "";
	
	/**
	 * 子账户原密码,子账户原密码
	 */
	private String oldpwd = "";
	
	/**
	 * 初始化参数
	 */
	public C060Input() {
		this.setFunction("C060");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 子账户新密码,子账户新密码
	 */
	public String getNewpwd() {
		return this.newpwd;
	}
	
	/**
	 * 子账户新密码,子账户新密码
	 */
	public void setNewpwd(String value)
	 {
		this.newpwd = value;
	}
	
	/**
	 * 子账户原密码,子账户原密码
	 */
	public String getOldpwd() {
		return this.oldpwd;
	}
	
	/**
	 * 子账户原密码,子账户原密码
	 */
	public void setOldpwd(String value)
	 {
		this.oldpwd = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("newpwd", this.newpwd);
		inputMap.put("oldpwd", this.oldpwd);
	}
}
