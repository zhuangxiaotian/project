package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取证件类型(C054)
 */
public class C054Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,如360428198711172715
	 */
	private String identityno = "";
	
	/**
	 * 证件类型列表,所有支持证件类型的列表，如有多个","隔开
	 */
	private String identitytypes = "";
	
	/**
	 * 初始化参数
	 */
	public C054Input() {
		this.setFunction("C054");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,如360428198711172715
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型列表,所有支持证件类型的列表，如有多个","隔开
	 */
	public String getIdentitytypes() {
		return this.identitytypes;
	}
	
	/**
	 * 证件类型列表,所有支持证件类型的列表，如有多个","隔开
	 */
	public void setIdentitytypes(String value)
	 {
		this.identitytypes = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytypes", this.identitytypes);
	}
}
