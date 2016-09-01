package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 客户信息查询功能输出明细参数
 */
public class DsCustInfoQueryOutputFundAccountDetail extends Object implements Serializable {
	
	/**
	 * 基金账号,
	 */
	private String fundAccount;
	
	/**
	 * TA编号,
	 */
	private String taNo;
	
	/**
	 * 基金账号状态,
	 */
	private String fundAccountState;
	
	/**
	 * 基金账号,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * TA编号,
	 */
	public String getTaNo() {
		return this.taNo;
	}
	
	/**
	 * TA编号,
	 */
	public void setTaNo(String value)
	 {
		this.taNo = value;
	}
	
	/**
	 * 基金账号状态,
	 */
	public String getFundAccountState() {
		return this.fundAccountState;
	}
	
	/**
	 * 基金账号状态,
	 */
	public void setFundAccountState(String value)
	 {
		this.fundAccountState = value;
	}
}
