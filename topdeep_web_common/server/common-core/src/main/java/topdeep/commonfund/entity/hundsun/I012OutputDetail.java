package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投申购的基金列表(I012)功能输出明细参数
 */
public class I012OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,取字典“资金方式”
	 */
	private String capitalmode;
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
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
	 * 风险等级,取字典“基金风险等级”
	 */
	private String risklevel = "";
	
	/**
	 * 风险等级描述,
	 */
	private String riskleveldesc = "";
	
	/**
	 * 净值日期,
	 */
	private String navdate = "";
	
	/**
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 基金类型,取字典[基金类别]
	 */
	private String fundtype;
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 明细资金方式方式,
	 */
	private String detailcapitalmode = "";
	
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
	 * 风险等级描述,
	 */
	public String getRiskleveldesc() {
		return this.riskleveldesc;
	}
	
	/**
	 * 风险等级描述,
	 */
	public void setRiskleveldesc(String value)
	 {
		this.riskleveldesc = value;
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
	 * 基金类型,取字典[基金类别]
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,取字典[基金类别]
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
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
	 * 明细资金方式方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
