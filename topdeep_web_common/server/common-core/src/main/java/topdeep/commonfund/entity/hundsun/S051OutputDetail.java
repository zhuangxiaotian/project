package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 第三方预约交易申请查询(S051)功能输出明细参数
 */
public class S051OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请金额,
	 */
	private String applysum = "";
	
	/**
	 * 申请时间,
	 */
	private String applytime = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 扣款状态,
	 */
	private String kkstat = "";
	
	/**
	 * 预约单号,外部预约单号
	 */
	private String outsideorderno;
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 申请时间,
	 */
	public String getApplytime() {
		return this.applytime;
	}
	
	/**
	 * 申请时间,
	 */
	public void setApplytime(String value)
	 {
		this.applytime = value;
	}
	
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
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 扣款状态,
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 扣款状态,
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
	}
	
	/**
	 * 预约单号,外部预约单号
	 */
	public String getOutsideorderno() {
		return this.outsideorderno;
	}
	
	/**
	 * 预约单号,外部预约单号
	 */
	public void setOutsideorderno(String value)
	 {
		this.outsideorderno = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
}
