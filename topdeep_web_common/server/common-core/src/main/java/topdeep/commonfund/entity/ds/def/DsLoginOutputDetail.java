package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 登陆功能输出明细参数
 */
public class DsLoginOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金账户,
	 */
	private String fundAccount;
	
	/**
	 * 基金账户,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账户,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
}
