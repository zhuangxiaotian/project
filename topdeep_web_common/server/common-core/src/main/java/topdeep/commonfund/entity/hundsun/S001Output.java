package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金份额查询(S001)
 */
public class S001Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 最新数据日期,
	 */
	private String latestDate = "";
	
	/**
	 * 总市值,
	 */
	private Double totalcapital;
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	private Double unconfirmcapital;
	
	/**
	 * 是否可做赎转撤操作,0不允许，1允许
	 */
	private String canCommonTrade = "";
	
	private List<S001OutputReturnlist> returnlist = new ArrayList<S001OutputReturnlist>();
	
	/**
	 * 最新数据日期,
	 */
	public String getLatestDate() {
		return this.latestDate;
	}
	
	/**
	 * 最新数据日期,
	 */
	public void setLatestDate(String value)
	 {
		this.latestDate = value;
	}
	
	/**
	 * 总市值,
	 */
	public Double getTotalcapital() {
		return this.totalcapital;
	}
	
	/**
	 * 总市值,
	 */
	public void setTotalcapital(Double value)
	 {
		this.totalcapital = value;
	}
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	public Double getUnconfirmcapital() {
		return this.unconfirmcapital;
	}
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	public void setUnconfirmcapital(Double value)
	 {
		this.unconfirmcapital = value;
	}
	
	/**
	 * 是否可做赎转撤操作,0不允许，1允许
	 */
	public String getCanCommonTrade() {
		return this.canCommonTrade;
	}
	
	/**
	 * 是否可做赎转撤操作,0不允许，1允许
	 */
	public void setCanCommonTrade(String value)
	 {
		this.canCommonTrade = value;
	}
	
	public List<S001OutputReturnlist> getReturnlist() {
		return this.returnlist;
	}
	
}
