package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询专户剩余额度功能输出明细参数
 */
public class ISSpecialAccBalanceQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 剩余额度,
	 */
	private Double remaintotalshare;
	
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
}
