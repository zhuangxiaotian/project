package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 趋势定投避险基金列表(I019)功能输出明细参数
 */
public class I019OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 收费方式名称,
	 */
	private String sharename;
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	private String sharetype;
	
	private List<I019OutputDetail> detail = new ArrayList<I019OutputDetail>();
	
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
	
	public List<I019OutputDetail> getDetail() {
		return this.detail;
	}
	
}
