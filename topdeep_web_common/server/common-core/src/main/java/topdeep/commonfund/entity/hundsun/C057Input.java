package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 更新开户留痕(C057)
 */
public class C057Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 证件号码,
	 */
	private String lognumber = "";
	
	/**
	 * 请求序列号,执行更新操作时必传
	 */
	private String accoreqserial = "";
	
	/**
	 * 错误代码,
	 */
	private String errorcode = "";
	
	/**
	 * 错误描述,
	 */
	private String errormsg = "";
	
	/**
	 * 错误类型,
	 */
	private String errortype = "";
	
	/**
	 * 初始化参数
	 */
	public C057Input() {
		this.setFunction("C057");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 证件号码,
	 */
	public String getLognumber() {
		return this.lognumber;
	}
	
	/**
	 * 证件号码,
	 */
	public void setLognumber(String value)
	 {
		this.lognumber = value;
	}
	
	/**
	 * 请求序列号,执行更新操作时必传
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,执行更新操作时必传
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 错误代码,
	 */
	public String getErrorcode() {
		return this.errorcode;
	}
	
	/**
	 * 错误代码,
	 */
	public void setErrorcode(String value)
	 {
		this.errorcode = value;
	}
	
	/**
	 * 错误描述,
	 */
	public String getErrormsg() {
		return this.errormsg;
	}
	
	/**
	 * 错误描述,
	 */
	public void setErrormsg(String value)
	 {
		this.errormsg = value;
	}
	
	/**
	 * 错误类型,
	 */
	public String getErrortype() {
		return this.errortype;
	}
	
	/**
	 * 错误类型,
	 */
	public void setErrortype(String value)
	 {
		this.errortype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("errorcode", this.errorcode);
		inputMap.put("errormsg", this.errormsg);
		inputMap.put("errortype", this.errortype);
	}
}
