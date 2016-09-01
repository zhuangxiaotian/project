package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金份额查询（整合模式）(S076)
 */
public class S076Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 最新数据日期,
	 */
	private String latestDate = "";
	
	/**
	 * 总市值,
	 */
	private String totalcapital = "";
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	private String unconfirmcapital = "";
	
	private List<S076OutputDetail> detail = new ArrayList<S076OutputDetail>();
	
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
	public String getTotalcapital() {
		return this.totalcapital;
	}
	
	/**
	 * 总市值,
	 */
	public void setTotalcapital(String value)
	 {
		this.totalcapital = value;
	}
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	public String getUnconfirmcapital() {
		return this.unconfirmcapital;
	}
	
	/**
	 * 未确认但扣款有效金额,暂只支持返回现金宝基金的
	 */
	public void setUnconfirmcapital(String value)
	 {
		this.unconfirmcapital = value;
	}
	
	public List<S076OutputDetail> getDetail() {
		return this.detail;
	}
	
}
