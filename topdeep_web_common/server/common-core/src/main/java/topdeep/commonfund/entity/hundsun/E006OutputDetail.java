package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询专户剩余额度(E006)功能输出明细参数
 */
public class E006OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 剩余额度,
	 */
	private Double remaintotalshare;
	
	/**
	 * 总额度,
	 */
	private Double totaldegree;
	
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
	 * 剩余额度,
	 */
	public Double getRemaintotalshare() {
		return this.remaintotalshare;
	}
	
	/**
	 * 剩余额度,
	 */
	public void setRemaintotalshare(Double value)
	 {
		this.remaintotalshare = value;
	}
	
	/**
	 * 总额度,
	 */
	public Double getTotaldegree() {
		return this.totaldegree;
	}
	
	/**
	 * 总额度,
	 */
	public void setTotaldegree(Double value)
	 {
		this.totaldegree = value;
	}
}
