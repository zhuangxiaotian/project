package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 手机解绑(C033)
 */
public class C033Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 验证码,用户输入的验证码
	 */
	private String authcode = "";
	
	/**
	 * 初始化参数
	 */
	public C033Input() {
		this.setFunction("C033");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 验证码,用户输入的验证码
	 */
	public String getAuthcode() {
		return this.authcode;
	}
	
	/**
	 * 验证码,用户输入的验证码
	 */
	public void setAuthcode(String value)
	 {
		this.authcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("authcode", this.authcode);
	}
}
