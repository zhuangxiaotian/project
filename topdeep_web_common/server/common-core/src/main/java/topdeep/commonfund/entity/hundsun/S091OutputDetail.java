package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询基金状态预设置(S091)功能输出明细参数
 */
public class S091OutputDetail extends Object implements Serializable {
	
	/**
	 * 每周生效日期开始,
	 */
	private String begindayofweek = "";
	
	/**
	 * 起始日期,
	 */
	private String beginrequestdate = "";
	
	/**
	 * 每周生效日期结束,
	 */
	private String enddayofweek = "";
	
	/**
	 * 终止日期,
	 */
	private String endrequestdate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 状态,
	 */
	private String state = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
	/**
	 * 基金类型,
	 */
	private String type = "";
	
	/**
	 * 每周生效日期开始,
	 */
	public String getBegindayofweek() {
		return this.begindayofweek;
	}
	
	/**
	 * 每周生效日期开始,
	 */
	public void setBegindayofweek(String value)
	 {
		this.begindayofweek = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getBeginrequestdate() {
		return this.beginrequestdate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setBeginrequestdate(String value)
	 {
		this.beginrequestdate = value;
	}
	
	/**
	 * 每周生效日期结束,
	 */
	public String getEnddayofweek() {
		return this.enddayofweek;
	}
	
	/**
	 * 每周生效日期结束,
	 */
	public void setEnddayofweek(String value)
	 {
		this.enddayofweek = value;
	}
	
	/**
	 * 终止日期,
	 */
	public String getEndrequestdate() {
		return this.endrequestdate;
	}
	
	/**
	 * 终止日期,
	 */
	public void setEndrequestdate(String value)
	 {
		this.endrequestdate = value;
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
	 * 状态,
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 状态,
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 委托方式,
	 */
	public String getTrust() {
		return this.trust;
	}
	
	/**
	 * 委托方式,
	 */
	public void setTrust(String value)
	 {
		this.trust = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 基金类型,
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
}
