package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投转换的转入基金列表(I013)功能输出明细参数
 */
public class I013OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode;
	
	/**
	 * 转出基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 转出基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 转入基金代码,
	 */
	private String otherfundcode = "";
	
	/**
	 * 转入基金名称,
	 */
	private String otherfundname = "";
	
	/**
	 * 收费方式名称,
	 */
	private String othersharename;
	
	/**
	 * 转入收费方式,取字典“份额类别”
	 */
	private String othersharetype;
	
	/**
	 * 收费方式名称,
	 */
	private String sharename;
	
	/**
	 * 转出收费方式,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String otherfundtype = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String otherrisklevel = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 净值日期,
	 */
	private String navdate = "";
	
	/**
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 银行编号,取字典[银行编号]
	 */
	private String bankserial = "";
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
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
	 * 转入基金代码,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 转入基金代码,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 转入基金名称,
	 */
	public String getOtherfundname() {
		return this.otherfundname;
	}
	
	/**
	 * 转入基金名称,
	 */
	public void setOtherfundname(String value)
	 {
		this.otherfundname = value;
	}
	
	/**
	 * 收费方式名称,
	 */
	public String getOthersharename() {
		return this.othersharename;
	}
	
	/**
	 * 收费方式名称,
	 */
	public void setOthersharename(String value)
	 {
		this.othersharename = value;
	}
	
	/**
	 * 转入收费方式,取字典“份额类别”
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 转入收费方式,取字典“份额类别”
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
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
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
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
	 * 基金类别,取字典“基金类别”
	 */
	public String getOtherfundtype() {
		return this.otherfundtype;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public void setOtherfundtype(String value)
	 {
		this.otherfundtype = value;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public String getOtherrisklevel() {
		return this.otherrisklevel;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public void setOtherrisklevel(String value)
	 {
		this.otherrisklevel = value;
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
	 * 净值日期,
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 净值,
	 */
	public String getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 净值,
	 */
	public void setNetvalue(String value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 银行编号,取字典[银行编号]
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,取字典[银行编号]
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
}
