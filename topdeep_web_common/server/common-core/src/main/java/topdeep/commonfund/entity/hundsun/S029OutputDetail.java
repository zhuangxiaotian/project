package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易时间限制查询(S029)功能输出明细参数
 */
public class S029OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 限制开始日期,
	 */
	private String limitBeginDate = "";
	
	/**
	 * 限制开始时间,
	 */
	private String limitBeginTime = "";
	
	/**
	 * 限制截至日期,
	 */
	private String limitEndDate = "";
	
	/**
	 * 限制截至时间,
	 */
	private String limitEndTime = "";
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	 * 限制开始日期,
	 */
	public String getLimitBeginDate() {
		return this.limitBeginDate;
	}
	
	/**
	 * 限制开始日期,
	 */
	public void setLimitBeginDate(String value)
	 {
		this.limitBeginDate = value;
	}
	
	/**
	 * 限制开始时间,
	 */
	public String getLimitBeginTime() {
		return this.limitBeginTime;
	}
	
	/**
	 * 限制开始时间,
	 */
	public void setLimitBeginTime(String value)
	 {
		this.limitBeginTime = value;
	}
	
	/**
	 * 限制截至日期,
	 */
	public String getLimitEndDate() {
		return this.limitEndDate;
	}
	
	/**
	 * 限制截至日期,
	 */
	public void setLimitEndDate(String value)
	 {
		this.limitEndDate = value;
	}
	
	/**
	 * 限制截至时间,
	 */
	public String getLimitEndTime() {
		return this.limitEndTime;
	}
	
	/**
	 * 限制截至时间,
	 */
	public void setLimitEndTime(String value)
	 {
		this.limitEndTime = value;
	}
}
