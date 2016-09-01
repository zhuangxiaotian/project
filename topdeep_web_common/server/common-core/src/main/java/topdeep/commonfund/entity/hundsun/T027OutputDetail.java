package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转换来源基金列表(T027)功能输出明细参数
 */
public class T027OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务代码,020:转认购;022:转申购;036:转换
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,可转换到目标基金的来源基金代码
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 收费方式,暂不支持
	 */
	private String sharetype = "";
	
	/**
	 * 业务代码,020:转认购;022:转申购;036:转换
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:转认购;022:转申购;036:转换
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,可转换到目标基金的来源基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,可转换到目标基金的来源基金代码
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
	 * 收费方式,暂不支持
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,暂不支持
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
}
