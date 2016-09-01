package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询基金账号(数据中心)(C067)
 */
public class C067Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 邮箱,手机号码和邮箱两者必输一个
	 */
	private String email = "";
	
	/**
	 * 手机号码,手机号码和邮箱两者必输一个
	 */
	private String mobile = "";
	
	/**
	 * 初始化参数
	 */
	public C067Input() {
		this.setFunction("C067");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 邮箱,手机号码和邮箱两者必输一个
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * 邮箱,手机号码和邮箱两者必输一个
	 */
	public void setEmail(String value)
	 {
		this.email = value;
	}
	
	/**
	 * 手机号码,手机号码和邮箱两者必输一个
	 */
	public String getMobile() {
		return this.mobile;
	}
	
	/**
	 * 手机号码,手机号码和邮箱两者必输一个
	 */
	public void setMobile(String value)
	 {
		this.mobile = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("email", this.email);
		inputMap.put("mobile", this.mobile);
	}
}
