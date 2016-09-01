package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 份额流水查询(S058)功能输出明细参数
 */
public class S058OutputDetail extends Object implements Serializable {
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 销售机构编号,
	 */
	private String agencyno = "";
	
	/**
	 * 关联银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 关联银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 本次基金余额,
	 */
	private String currentremainshare = "";
	
	/**
	 * 冻结份额,
	 */
	private String freezeremainshare = "";
	
	/**
	 * 分红方式,
	 */
	private String melonmethod = "";
	
	/**
	 * 单位净值,
	 */
	private Double pernetvalue;
	
	/**
	 * 可用份额,
	 */
	private String usableremainshare = "";
	
	/**
	 * 发生金额,
	 */
	private String occurbalance = "";
	
	/**
	 * 确认日期,
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
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
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
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
	 * 销售机构编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售机构编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 关联银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 关联银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 关联银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 关联银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
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
	 * 本次基金余额,
	 */
	public String getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 本次基金余额,
	 */
	public void setCurrentremainshare(String value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 冻结份额,
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 冻结份额,
	 */
	public void setFreezeremainshare(String value)
	 {
		this.freezeremainshare = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 单位净值,
	 */
	public Double getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 单位净值,
	 */
	public void setPernetvalue(Double value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 可用份额,
	 */
	public String getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额,
	 */
	public void setUsableremainshare(String value)
	 {
		this.usableremainshare = value;
	}
	
	/**
	 * 发生金额,
	 */
	public String getOccurbalance() {
		return this.occurbalance;
	}
	
	/**
	 * 发生金额,
	 */
	public void setOccurbalance(String value)
	 {
		this.occurbalance = value;
	}
}
