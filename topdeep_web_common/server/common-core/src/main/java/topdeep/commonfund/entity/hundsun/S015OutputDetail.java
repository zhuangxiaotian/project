package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 避险明细查询(S015)功能输出明细参数
 */
public class S015OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售机构名称,
	 */
	private String agencyname = "";
	
	/**
	 * 到期警示,
	 */
	private String expirealert = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 份额余额,
	 */
	private Double lastshare;
	
	/**
	 * 登记日期,
	 */
	private java.util.Date registdate;
	
	/**
	 * 份额类型,
	 */
	private String sharetype = "";
	
	/**
	 * 销售机构名称,
	 */
	public String getAgencyname() {
		return this.agencyname;
	}
	
	/**
	 * 销售机构名称,
	 */
	public void setAgencyname(String value)
	 {
		this.agencyname = value;
	}
	
	/**
	 * 到期警示,
	 */
	public String getExpirealert() {
		return this.expirealert;
	}
	
	/**
	 * 到期警示,
	 */
	public void setExpirealert(String value)
	 {
		this.expirealert = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 份额余额,
	 */
	public Double getLastshare() {
		return this.lastshare;
	}
	
	/**
	 * 份额余额,
	 */
	public void setLastshare(Double value)
	 {
		this.lastshare = value;
	}
	
	/**
	 * 登记日期,
	 */
	public java.util.Date getRegistdate() {
		return this.registdate;
	}
	
	/**
	 * 登记日期,
	 */
	public void setRegistdate(java.util.Date value)
	 {
		this.registdate = value;
	}
	
	/**
	 * 份额类型,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类型,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
}
