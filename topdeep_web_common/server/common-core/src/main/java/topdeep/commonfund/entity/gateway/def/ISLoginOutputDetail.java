package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登录功能输出明细参数
 */
public class ISLoginOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金账号,与该交易账号关联的基金账号
	 */
	private String fundAccount;
	
	/**
	 * TA代码,
	 */
	private String tacode;
	
	/**
	 * 基金账号,与该交易账号关联的基金账号
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,与该交易账号关联的基金账号
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
}
