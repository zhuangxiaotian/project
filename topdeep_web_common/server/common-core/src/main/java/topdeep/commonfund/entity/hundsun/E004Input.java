package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 签署电子合同或风险揭示书(E004)
 */
public class E004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 合同类型,电子合同签署业务必填
	 */
	private String contracttype = "";
	
	/**
	 * 客户名称,电子合同签署业务必填
	 */
	private String custname = "";
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno = "";
	
	/**
	 * 客户类别,电子合同签署业务必填
	 */
	private String custtype = "";
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	private String fixflag = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,电子合同签署业务必填
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 合同签署,电子合同签署业务必填
	 */
	private String machine = "";
	
	/**
	 * 交易来源,某些交易来源不需要传入交易密码
	 */
	private String tradesource = "";
	
	/**
	 * 初始化参数
	 */
	public E004Input() {
		this.setFunction("E004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 合同类型,电子合同签署业务必填
	 */
	public String getContracttype() {
		return this.contracttype;
	}
	
	/**
	 * 合同类型,电子合同签署业务必填
	 */
	public void setContracttype(String value)
	 {
		this.contracttype = value;
	}
	
	/**
	 * 客户名称,电子合同签署业务必填
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户名称,电子合同签署业务必填
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 客户类别,电子合同签署业务必填
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,电子合同签署业务必填
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金代码,电子合同签署业务必填
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,电子合同签署业务必填
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 合同签署,电子合同签署业务必填
	 */
	public String getMachine() {
		return this.machine;
	}
	
	/**
	 * 合同签署,电子合同签署业务必填
	 */
	public void setMachine(String value)
	 {
		this.machine = value;
	}
	
	/**
	 * 交易来源,某些交易来源不需要传入交易密码
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,某些交易来源不需要传入交易密码
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("contracttype", this.contracttype);
		inputMap.put("custname", this.custname);
		inputMap.put("custno", this.custno);
		inputMap.put("custtype", this.custtype);
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("machine", this.machine);
		inputMap.put("tradesource", this.tradesource);
	}
}
