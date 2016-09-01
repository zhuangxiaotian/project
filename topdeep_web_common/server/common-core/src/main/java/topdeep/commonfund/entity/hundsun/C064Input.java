package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取用户网上交易预留信息(C064)
 */
public class C064Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 数据来源,默认为DS
	 */
	private String dataSource = "";
	
	/**
	 * 证件号码,非登陆时必传
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,非登陆时必传
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public C064Input() {
		this.setFunction("C064");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 数据来源,默认为DS
	 */
	public String getDataSource() {
		return this.dataSource;
	}
	
	/**
	 * 数据来源,默认为DS
	 */
	public void setDataSource(String value)
	 {
		this.dataSource = value;
	}
	
	/**
	 * 证件号码,非登陆时必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,非登陆时必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,非登陆时必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,非登陆时必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("dataSource", this.dataSource);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
