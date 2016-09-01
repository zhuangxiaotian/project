package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码信息查询(V022)
 */
public class V022Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 兑换面值,
	 */
	private Double amount;
	
	/**
	 * 充值码,
	 */
	private String chargecode = "";
	
	/**
	 * 允许充值次数,
	 */
	private Double chargetimes;
	
	/**
	 * 截止日期,格式：yyyymmdd
	 */
	private String enddate = "";
	
	/**
	 * 状态,1-正常，0-失效，空-不限制
	 */
	private String state = "";
	
	/**
	 * 兑换面值,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 兑换面值,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 充值码,
	 */
	public String getChargecode() {
		return this.chargecode;
	}
	
	/**
	 * 充值码,
	 */
	public void setChargecode(String value)
	 {
		this.chargecode = value;
	}
	
	/**
	 * 允许充值次数,
	 */
	public Double getChargetimes() {
		return this.chargetimes;
	}
	
	/**
	 * 允许充值次数,
	 */
	public void setChargetimes(Double value)
	 {
		this.chargetimes = value;
	}
	
	/**
	 * 截止日期,格式：yyyymmdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 截止日期,格式：yyyymmdd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 状态,1-正常，0-失效，空-不限制
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,1-正常，0-失效，空-不限制
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
}
