package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 撤单功能输入参数
 */
public class ISTransactionCancelInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 原始申请编号,需要撤销交易的申请编号
	 */
	private String orgApplicationNo;
	
	/**
	 * 交易密码,
	 */
	private String password;
	
	public ISTransactionCancelInput() {
		this.setZ_funcCode("u0d");
	}
	
	/**
	 * 原始申请编号,需要撤销交易的申请编号
	 */
	public String getOrgApplicationNo() {
		return this.orgApplicationNo;
	}
	
	/**
	 * 原始申请编号,需要撤销交易的申请编号
	 */
	public void setOrgApplicationNo(String value)
	 {
		this.orgApplicationNo = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 交易密码,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
}
