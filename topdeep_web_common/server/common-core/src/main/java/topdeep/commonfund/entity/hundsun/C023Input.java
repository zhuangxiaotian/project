package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 实名认证(C023)
 */
public class C023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户姓名,
	 */
	private String custname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理
	 */
	private String busitype = "";
	
	/**
	 * 是否注册用户发起,
	 */
	private String reg = "";
	
	/**
	 * 初始化参数
	 */
	public C023Input() {
		this.setFunction("C023");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户姓名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户姓名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,根据开户还是增开等传入业务代码默认按开户处理
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 是否注册用户发起,
	 */
	public String getReg() {
		return this.reg;
	}
	
	/**
	 * 是否注册用户发起,
	 */
	public void setReg(String value)
	 {
		this.reg = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custname", this.custname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("busitype", this.busitype);
		inputMap.put("reg", this.reg);
	}
}
