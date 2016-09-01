package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 签署电子合同或风险揭示书功能输入参数
 */
public class ISSpeciElectronicContractSignInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 合同类型,电子合同签署业务必填
	 */
	private String contracttype;
	
	/**
	 * 客户名称,电子合同签署业务必填
	 */
	private String custname;
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno;
	
	/**
	 * 客户类别,电子合同签署业务必填
	 */
	private String custtype;
	
	/**
	 * 业务辅助代码,01-电子合同签署;02-风险揭示书签署;03-约定书签署;04-约定书取消
	 */
	private String fixflag;
	
	/**
	 * 基金帐号,
	 */
	private String fundacco;
	
	/**
	 * 基金代码,电子合同签署业务必填
	 */
	private String fundcode;
	
	/**
	 * 合同签署,电子合同签署业务必填
	 */
	private String machine;
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco;
	
	/**
	 * 交易密码,
	 */
	private String tradepassword;
	
	public ISSpeciElectronicContractSignInput() {
		this.setZ_funcCode("u1b");
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
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
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
}
