package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易登录(P007)
 */
public class P007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 密码,用des进行加密传输（密钥为商户密码） fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
	 */
	private String password = "";
	
	/**
	 * 初始化参数
	 */
	public P007Input() {
		this.setFunction("P007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 密码,用des进行加密传输（密钥为商户密码） fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码,用des进行加密传输（密钥为商户密码） fundapi支持无密码登陆时（系统参数“API_LOGIN_NOPWD”为1），可以为空。不支持时，为必填。
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
