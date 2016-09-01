package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 小额打款(B012)
 */
public class B012Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 银行卡户名,
	 */
	private String custname = "";
	
	/**
	 * 分行支行名称,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	private String branchname = "";
	
	/**
	 * 资金方式,3:银联;为空则默认为易宝
	 */
	private String capitalmode = "";
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	private String capitalmode_prefix = "";
	
	/**
	 * 城市代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	private String citycode = "";
	
	/**
	 * 订单号,不传则会有系统自动生成
	 */
	private String orderno = "";
	
	/**
	 * 省份代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	private String provincecode = "";
	
	/**
	 * 初始化参数
	 */
	public B012Input() {
		this.setFunction("B012");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 银行卡户名,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 银行卡户名,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 分行支行名称,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public String getBranchname() {
		return this.branchname;
	}
	
	/**
	 * 分行支行名称,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public void setBranchname(String value)
	 {
		this.branchname = value;
	}
	
	/**
	 * 资金方式,3:银联;为空则默认为易宝
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,3:银联;为空则默认为易宝
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public String getCapitalmode_prefix() {
		return this.capitalmode_prefix;
	}
	
	/**
	 * 资金方式前缀,银联开户分http和socket,capitalmode 为3时可以返回空值或返回"socket"，调用C001返回的capitalmode_prefix
	 */
	public void setCapitalmode_prefix(String value)
	 {
		this.capitalmode_prefix = value;
	}
	
	/**
	 * 城市代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public String getCitycode() {
		return this.citycode;
	}
	
	/**
	 * 城市代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public void setCitycode(String value)
	 {
		this.citycode = value;
	}
	
	/**
	 * 订单号,不传则会有系统自动生成
	 */
	public String getOrderno() {
		return this.orderno;
	}
	
	/**
	 * 订单号,不传则会有系统自动生成
	 */
	public void setOrderno(String value)
	 {
		this.orderno = value;
	}
	
	/**
	 * 省份代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 省份代码,易宝支持的准实时的银行可不填，否则必填,取值请参考易宝文档
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("custname", this.custname);
		inputMap.put("branchname", this.branchname);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("capitalmode_prefix", this.capitalmode_prefix);
		inputMap.put("citycode", this.citycode);
		inputMap.put("orderno", this.orderno);
		inputMap.put("provincecode", this.provincecode);
	}
}
