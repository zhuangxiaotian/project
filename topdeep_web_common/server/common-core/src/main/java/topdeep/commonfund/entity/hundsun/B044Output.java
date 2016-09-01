package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 建行快捷付签约查询(B044)
 */
public class B044Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 区域码,
	 */
	private String areacode = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 姓名,
	 */
	private String customname = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 签约协议号,
	 */
	private String customno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 签约状态,
	 */
	private String recordstate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 区域码,
	 */
	public String getAreacode() {
		return this.areacode;
	}
	
	/**
	 * 区域码,
	 */
	public void setAreacode(String value)
	 {
		this.areacode = value;
	}
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 姓名,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 姓名,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
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
	 * 签约协议号,
	 */
	public String getCustomno() {
		return this.customno;
	}
	
	/**
	 * 签约协议号,
	 */
	public void setCustomno(String value)
	 {
		this.customno = value;
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
	 * 签约状态,
	 */
	public String getRecordstate() {
		return this.recordstate;
	}
	
	/**
	 * 签约状态,
	 */
	public void setRecordstate(String value)
	 {
		this.recordstate = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
