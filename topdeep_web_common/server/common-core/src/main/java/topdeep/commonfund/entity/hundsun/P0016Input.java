package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 刷新用户信息(P016)
 */
public class P0016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易密码,无密码登陆的用户需要传入交易密码
	 */
	private String password = "";
	
	/**
	 * 初始化参数
	 */
	public P0016Input() {
		this.setFunction("P0016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易密码,无密码登陆的用户需要传入交易密码
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 交易密码,无密码登陆的用户需要传入交易密码
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("password", this.password);
	}
}
