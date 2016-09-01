package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取开户留痕(C049)
 */
public class C049Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 证件号码,
	 */
	private String lognumber = "";
	
	/**
	 * 分行信息,
	 */
	private String branchbank = "";
	
	/**
	 * 用户姓名,
	 */
	private String custname = "";
	
	/**
	 * 微信uid,
	 */
	private String weixinuid = "";
	
	/**
	 * 开户请求流水号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 初始化参数
	 */
	public C049Input() {
		this.setFunction("C049");
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
	 * 分行信息,
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 分行信息,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
	}
	
	/**
	 * 用户姓名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 用户姓名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 微信uid,
	 */
	public String getWeixinuid() {
		return this.weixinuid;
	}
	
	/**
	 * 微信uid,
	 */
	public void setWeixinuid(String value)
	 {
		this.weixinuid = value;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 开户请求流水号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("lognumber", this.lognumber);
		inputMap.put("branchbank", this.branchbank);
		inputMap.put("custname", this.custname);
		inputMap.put("weixinuid", this.weixinuid);
		inputMap.put("accoreqserial", this.accoreqserial);
	}
}
