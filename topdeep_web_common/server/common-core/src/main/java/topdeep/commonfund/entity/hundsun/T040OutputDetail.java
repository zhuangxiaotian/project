package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 赎回渠道查询(T040)功能输出明细参数
 */
public class T040OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请份额,
	 */
	private String applyamount = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请份额,
	 */
	public String getApplyamount() {
		return this.applyamount;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyamount(String value)
	 {
		this.applyamount = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
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
