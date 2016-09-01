package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金费率查询(S092)功能输出明细参数
 */
public class S092OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 客户类别,
	 */
	private String custtype = "";
	
	/**
	 * 费用类别,
	 */
	private String faretype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 区间最大金额,
	 */
	private String maxbalance = "";
	
	/**
	 * 最高费用,
	 */
	private String maxfare = "";
	
	/**
	 * 区间最小金额,
	 */
	private String minbalance = "";
	
	/**
	 * 最低费用,
	 */
	private String minfare = "";
	
	/**
	 * 费率比例,
	 */
	private String ratio = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 客户类别,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 费用类别,
	 */
	public String getFaretype() {
		return this.faretype;
	}
	
	/**
	 * 费用类别,
	 */
	public void setFaretype(String value)
	 {
		this.faretype = value;
	}
	
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
	 * 区间最大金额,
	 */
	public String getMaxbalance() {
		return this.maxbalance;
	}
	
	/**
	 * 区间最大金额,
	 */
	public void setMaxbalance(String value)
	 {
		this.maxbalance = value;
	}
	
	/**
	 * 最高费用,
	 */
	public String getMaxfare() {
		return this.maxfare;
	}
	
	/**
	 * 最高费用,
	 */
	public void setMaxfare(String value)
	 {
		this.maxfare = value;
	}
	
	/**
	 * 区间最小金额,
	 */
	public String getMinbalance() {
		return this.minbalance;
	}
	
	/**
	 * 区间最小金额,
	 */
	public void setMinbalance(String value)
	 {
		this.minbalance = value;
	}
	
	/**
	 * 最低费用,
	 */
	public String getMinfare() {
		return this.minfare;
	}
	
	/**
	 * 最低费用,
	 */
	public void setMinfare(String value)
	 {
		this.minfare = value;
	}
	
	/**
	 * 费率比例,
	 */
	public String getRatio() {
		return this.ratio;
	}
	
	/**
	 * 费率比例,
	 */
	public void setRatio(String value)
	 {
		this.ratio = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
}
