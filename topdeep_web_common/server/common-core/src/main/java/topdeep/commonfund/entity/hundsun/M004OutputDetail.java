package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝基金列表(M004)功能输出明细参数
 */
public class M004OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 基金公司,
	 */
	private String fundcorp;
	
	/**
	 * 基金名称,
	 */
	private String fundname;
	
	/**
	 * 收费方式,
	 */
	private String sharetype;
	
	/**
	 * 最低保留份额,
	 */
	private String minshare;
	
	/**
	 * TA代码,
	 */
	private String tacode;
	
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
	 * 基金公司,
	 */
	public String getFundcorp() {
		return this.fundcorp;
	}
	
	/**
	 * 基金公司,
	 */
	public void setFundcorp(String value)
	 {
		this.fundcorp = value;
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
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 最低保留份额,
	 */
	public String getMinshare() {
		return this.minshare;
	}
	
	/**
	 * 最低保留份额,
	 */
	public void setMinshare(String value)
	 {
		this.minshare = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
}
