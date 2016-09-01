package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金组合投资资产组合功能输出明细参数
 */
public class ISFundCombineInvestmentAssetsListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 序号,（资产组合）
	 */
	private String sn;
	
	/**
	 * 项目,
	 */
	private String project;
	
	/**
	 * 金额（元）,
	 */
	private Double amount;
	
	/**
	 * 占比,
	 */
	private Double percent;
	
	/**
	 * 序号,（资产组合）
	 */
	public String getSn() {
		return this.sn;
	}
	
	/**
	 * 序号,（资产组合）
	 */
	public void setSn(String value)
	 {
		this.sn = value;
	}
	
	/**
	 * 项目,
	 */
	public String getProject() {
		return this.project;
	}
	
	/**
	 * 项目,
	 */
	public void setProject(String value)
	 {
		this.project = value;
	}
	
	/**
	 * 金额（元）,
	 */
	public Double getAmount() {
		return this.amount;
	}
	
	/**
	 * 金额（元）,
	 */
	public void setAmount(Double value)
	 {
		this.amount = value;
	}
	
	/**
	 * 占比,
	 */
	public Double getPercent() {
		return this.percent;
	}
	
	/**
	 * 占比,
	 */
	public void setPercent(Double value)
	 {
		this.percent = value;
	}
}
