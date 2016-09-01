package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 投资收益查询(S014)
 */
public class S014Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 期间收益,
	 */
	private Double duringIncome;
	
	/**
	 * 期间收益率,
	 */
	private Double duringIncomeRate;
	
	/**
	 * 期间收益率年化,
	 */
	private Double duringIncomeRateAnnualized;
	
	/**
	 * 全程收益,
	 */
	private Double entireIncome;
	
	/**
	 * 全程收益率,
	 */
	private Double entireIncomeRate;
	
	/**
	 * 全程收益率年化,
	 */
	private Double entireIncomeRateAnnualized;
	
	/**
	 * 返回信息,
	 */
	private String message = "";
	
	/**
	 * 总成本,
	 */
	private Double totalCost;
	
	/**
	 * 总收入,
	 */
	private Double totalIncome;
	
	/**
	 * 期间收益,
	 */
	public Double getDuringIncome() {
		return this.duringIncome;
	}
	
	/**
	 * 期间收益,
	 */
	public void setDuringIncome(Double value)
	 {
		this.duringIncome = value;
	}
	
	/**
	 * 期间收益率,
	 */
	public Double getDuringIncomeRate() {
		return this.duringIncomeRate;
	}
	
	/**
	 * 期间收益率,
	 */
	public void setDuringIncomeRate(Double value)
	 {
		this.duringIncomeRate = value;
	}
	
	/**
	 * 期间收益率年化,
	 */
	public Double getDuringIncomeRateAnnualized() {
		return this.duringIncomeRateAnnualized;
	}
	
	/**
	 * 期间收益率年化,
	 */
	public void setDuringIncomeRateAnnualized(Double value)
	 {
		this.duringIncomeRateAnnualized = value;
	}
	
	/**
	 * 全程收益,
	 */
	public Double getEntireIncome() {
		return this.entireIncome;
	}
	
	/**
	 * 全程收益,
	 */
	public void setEntireIncome(Double value)
	 {
		this.entireIncome = value;
	}
	
	/**
	 * 全程收益率,
	 */
	public Double getEntireIncomeRate() {
		return this.entireIncomeRate;
	}
	
	/**
	 * 全程收益率,
	 */
	public void setEntireIncomeRate(Double value)
	 {
		this.entireIncomeRate = value;
	}
	
	/**
	 * 全程收益率年化,
	 */
	public Double getEntireIncomeRateAnnualized() {
		return this.entireIncomeRateAnnualized;
	}
	
	/**
	 * 全程收益率年化,
	 */
	public void setEntireIncomeRateAnnualized(Double value)
	 {
		this.entireIncomeRateAnnualized = value;
	}
	
	/**
	 * 返回信息,
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * 返回信息,
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	/**
	 * 总成本,
	 */
	public Double getTotalCost() {
		return this.totalCost;
	}
	
	/**
	 * 总成本,
	 */
	public void setTotalCost(Double value)
	 {
		this.totalCost = value;
	}
	
	/**
	 * 总收入,
	 */
	public Double getTotalIncome() {
		return this.totalIncome;
	}
	
	/**
	 * 总收入,
	 */
	public void setTotalIncome(Double value)
	 {
		this.totalIncome = value;
	}
}
