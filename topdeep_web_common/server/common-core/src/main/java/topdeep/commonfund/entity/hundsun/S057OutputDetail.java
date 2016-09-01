package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 追加投资查询(S057)功能输出明细参数
 */
public class S057OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
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
