package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转托管入基金列表(T011)功能输出明细参数
 */
public class T011OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	private String fundstate = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	private String sharetype = "";
	
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
	 * 基金状态,取字典“基金状态”
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
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
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
}
