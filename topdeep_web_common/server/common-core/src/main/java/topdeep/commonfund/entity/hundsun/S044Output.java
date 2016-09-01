package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 还款流水查询(S044)
 */
public class S044Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	/**
	 * 交易帐号资金方式,
	 */
	private String tradeaccocapitalmode = "";
	
	private List<S044OutputDetail> detail = new ArrayList<S044OutputDetail>();
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public Double getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(Double value)
	 {
		this.totalrecords = value;
	}
	
	/**
	 * 交易帐号资金方式,
	 */
	public String getTradeaccocapitalmode() {
		return this.tradeaccocapitalmode;
	}
	
	/**
	 * 交易帐号资金方式,
	 */
	public void setTradeaccocapitalmode(String value)
	 {
		this.tradeaccocapitalmode = value;
	}
	
	public List<S044OutputDetail> getDetail() {
		return this.detail;
	}
	
}
