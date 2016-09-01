package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收益查询(S054)功能输出明细参数
 */
public class S054OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 收益归属日期,
	 */
	private String belongdate = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 客户名称,
	 */
	private String customname = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 发生日期,
	 */
	private String ocurrdate = "";
	
	/**
	 * 发生收益,
	 */
	private Double ocurrincome;
	
	/**
	 * 发生时间,
	 */
	private String ocurrtime = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 累积收益,
	 */
	private Double totalincome;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 收益归属日期,
	 */
	public String getBelongdate() {
		return this.belongdate;
	}
	
	/**
	 * 收益归属日期,
	 */
	public void setBelongdate(String value)
	 {
		this.belongdate = value;
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
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 客户名称,
	 */
	public String getCustomname() {
		return this.customname;
	}
	
	/**
	 * 客户名称,
	 */
	public void setCustomname(String value)
	 {
		this.customname = value;
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
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 发生日期,
	 */
	public String getOcurrdate() {
		return this.ocurrdate;
	}
	
	/**
	 * 发生日期,
	 */
	public void setOcurrdate(String value)
	 {
		this.ocurrdate = value;
	}
	
	/**
	 * 发生收益,
	 */
	public Double getOcurrincome() {
		return this.ocurrincome;
	}
	
	/**
	 * 发生收益,
	 */
	public void setOcurrincome(Double value)
	 {
		this.ocurrincome = value;
	}
	
	/**
	 * 发生时间,
	 */
	public String getOcurrtime() {
		return this.ocurrtime;
	}
	
	/**
	 * 发生时间,
	 */
	public void setOcurrtime(String value)
	 {
		this.ocurrtime = value;
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
	 * 累积收益,
	 */
	public Double getTotalincome() {
		return this.totalincome;
	}
	
	/**
	 * 累积收益,
	 */
	public void setTotalincome(Double value)
	 {
		this.totalincome = value;
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
