package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金开放日期查询(S085)功能输出明细参数
 */
public class S085OutputDetail extends Object implements Serializable {
	
	/**
	 * 开始时间,
	 */
	private String begindate = "";
	
	/**
	 * 周期类型,
	 */
	private String cycletype = "";
	
	/**
	 * 结束时间,
	 */
	private String enddate = "";
	
	/**
	 * 基金号码,
	 */
	private String fundcode = "";
	
	/**
	 * 备忘录,
	 */
	private String memo = "";
	
	/**
	 * 基金状态,
	 */
	private String status = "";
	
	/**
	 * 基金TA号码,
	 */
	private String tano = "";
	
	/**
	 * 开始时间,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 开始时间,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 周期类型,
	 */
	public String getCycletype() {
		return this.cycletype;
	}
	
	/**
	 * 周期类型,
	 */
	public void setCycletype(String value)
	 {
		this.cycletype = value;
	}
	
	/**
	 * 结束时间,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束时间,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金号码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金号码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 备忘录,
	 */
	public String getMemo() {
		return this.memo;
	}
	
	/**
	 * 备忘录,
	 */
	public void setMemo(String value)
	 {
		this.memo = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * 基金状态,
	 */
	public void setStatus(String value)
	 {
		this.status = value;
	}
	
	/**
	 * 基金TA号码,
	 */
	public String getTano() {
		return this.tano;
	}
	
	/**
	 * 基金TA号码,
	 */
	public void setTano(String value)
	 {
		this.tano = value;
	}
}
