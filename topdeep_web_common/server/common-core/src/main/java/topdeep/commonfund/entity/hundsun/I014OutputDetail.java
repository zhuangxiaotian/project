package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投赎回的基金列表(I014)功能输出明细参数
 */
public class I014OutputDetail extends Object implements Serializable {
	
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
	private String fundrisklevel = "";
	
	/**
	 * 收费方式名称,
	 */
	private String sharename;
	
	/**
	 * 收费方式,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 净值日期,
	 */
	private String navdate = "";
	
	/**
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 份额余额,
	 */
	private String remainshare = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
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
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
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
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
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
	 * 份额余额,
	 */
	public String getRemainshare() {
		return this.remainshare;
	}
	
	/**
	 * 份额余额,
	 */
	public void setRemainshare(String value)
	 {
		this.remainshare = value;
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
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
}
