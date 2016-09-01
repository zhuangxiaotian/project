package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收付款交易记录首页功能输出参数
 */
public class ISPayHomeQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISPayHomeQueryOutputPayList> payList = new ArrayList<ISPayHomeQueryOutputPayList>();
	
	/**
	 * 今日收款,
	 */
	private String todayReceivables;
	
	/**
	 * 今日付款,
	 */
	private String todayPayment;
	
	/**
	 * 待付款,
	 */
	private String pendingPayment;
	
	/**
	 * 待收款,
	 */
	private String pendingReceivables;
	
	/**
	 * 日期,
	 */
	private String date;
	
	/**
	 * 总资产,
	 */
	private String totalAssets;
	
	/**
	 * 累计收益,
	 */
	private String accumulatedIncome;
	
	public ISPayHomeQueryOutput() {
		this.setZ_funcCode("m0i");
	}
	
	public List<ISPayHomeQueryOutputPayList> getPayList() {
		return this.payList;
	}
	
	
	/**
	 * 今日收款,
	 */
	public String getTodayReceivables() {
		return this.todayReceivables;
	}
	
	/**
	 * 今日收款,
	 */
	public void setTodayReceivables(String value)
	 {
		this.todayReceivables = value;
	}
	
	/**
	 * 今日付款,
	 */
	public String getTodayPayment() {
		return this.todayPayment;
	}
	
	/**
	 * 今日付款,
	 */
	public void setTodayPayment(String value)
	 {
		this.todayPayment = value;
	}
	
	/**
	 * 待付款,
	 */
	public String getPendingPayment() {
		return this.pendingPayment;
	}
	
	/**
	 * 待付款,
	 */
	public void setPendingPayment(String value)
	 {
		this.pendingPayment = value;
	}
	
	/**
	 * 待收款,
	 */
	public String getPendingReceivables() {
		return this.pendingReceivables;
	}
	
	/**
	 * 待收款,
	 */
	public void setPendingReceivables(String value)
	 {
		this.pendingReceivables = value;
	}
	
	/**
	 * 日期,
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 日期,
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
	
	/**
	 * 总资产,
	 */
	public String getTotalAssets() {
		return this.totalAssets;
	}
	
	/**
	 * 总资产,
	 */
	public void setTotalAssets(String value)
	 {
		this.totalAssets = value;
	}
	
	/**
	 * 累计收益,
	 */
	public String getAccumulatedIncome() {
		return this.accumulatedIncome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setAccumulatedIncome(String value)
	 {
		this.accumulatedIncome = value;
	}
}
