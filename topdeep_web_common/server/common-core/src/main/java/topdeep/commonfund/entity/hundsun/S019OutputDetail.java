package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理汇款余额查询(S019)功能输出明细参数
 */
public class S019OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行卡,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 可用份额,
	 */
	private String usableshare = "";
	
	/**
	 * 未处理标志,
	 */
	private String undealflag;
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行卡,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 可用份额,
	 */
	public String getUsableshare() {
		return this.usableshare;
	}
	
	/**
	 * 可用份额,
	 */
	public void setUsableshare(String value)
	 {
		this.usableshare = value;
	}
	
	/**
	 * 未处理标志,
	 */
	public String getUndealflag() {
		return this.undealflag;
	}
	
	/**
	 * 未处理标志,
	 */
	public void setUndealflag(String value)
	 {
		this.undealflag = value;
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
}
