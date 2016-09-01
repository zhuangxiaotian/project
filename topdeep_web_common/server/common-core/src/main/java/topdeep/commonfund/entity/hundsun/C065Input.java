package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改用户网上交易预留信息(C065)
 */
public class C065Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 预留信息,
	 */
	private String reserveWords = "";
	
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
	public C065Input() {
		this.setFunction("C065");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 预留信息,
	 */
	public String getReserveWords() {
		return this.reserveWords;
	}
	
	/**
	 * 预留信息,
	 */
	public void setReserveWords(String value)
	 {
		this.reserveWords = value;
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
		inputMap.put("reserveWords", this.reserveWords);
		inputMap.put("dataSource", this.dataSource);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
