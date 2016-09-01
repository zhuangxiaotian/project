package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 在途资产查询(S095)功能输出明细参数
 */
public class S095OutputDetail extends Object implements Serializable {
	
	/**
	 * 申购金额,
	 */
	private String allotbala = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixbusinflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 原申请编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 原申请确认标记,
	 */
	private String originalconfirmflag = "";
	
	/**
	 * 对方基金代码,
	 */
	private String otherfundcode = "";
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 认购金额,
	 */
	private String subscribebala = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 在途资金,
	 */
	private String transitasset = "";
	
	/**
	 * 申购金额,
	 */
	public String getAllotbala() {
		return this.allotbala;
	}
	
	/**
	 * 申购金额,
	 */
	public void setAllotbala(String value)
	 {
		this.allotbala = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
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
	 * 原申请编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 原申请确认标记,
	 */
	public String getOriginalconfirmflag() {
		return this.originalconfirmflag;
	}
	
	/**
	 * 原申请确认标记,
	 */
	public void setOriginalconfirmflag(String value)
	 {
		this.originalconfirmflag = value;
	}
	
	/**
	 * 对方基金代码,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 对方基金代码,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 对方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
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
	 * 认购金额,
	 */
	public String getSubscribebala() {
		return this.subscribebala;
	}
	
	/**
	 * 认购金额,
	 */
	public void setSubscribebala(String value)
	 {
		this.subscribebala = value;
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
	
	/**
	 * 在途资金,
	 */
	public String getTransitasset() {
		return this.transitasset;
	}
	
	/**
	 * 在途资金,
	 */
	public void setTransitasset(String value)
	 {
		this.transitasset = value;
	}
}
