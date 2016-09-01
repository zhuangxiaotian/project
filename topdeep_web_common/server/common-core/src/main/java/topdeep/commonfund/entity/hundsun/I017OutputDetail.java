package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投转换的转出基金列表(I017)功能输出明细参数
 */
public class I017OutputDetail extends Object implements Serializable {
	
	/**
	 * 转出基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 转出基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 收费方式名称,
	 */
	private String sharename;
	
	/**
	 * 转出收费方式,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 转出基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 转出基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 转出基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 转出基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 收费方式名称,
	 */
	public String getSharename() {
		return this.sharename;
	}
	
	/**
	 * 收费方式名称,
	 */
	public void setSharename(String value)
	 {
		this.sharename = value;
	}
	
	/**
	 * 转出收费方式,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 转出收费方式,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public String getRisklevel() {
		return this.risklevel;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public void setRisklevel(String value)
	 {
		this.risklevel = value;
	}
}
