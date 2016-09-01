package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户超级现金宝信息查询(S052)功能输出明细参数
 */
public class S052OutputDetail extends Object implements Serializable {
	
	/**
	 * 历史累积收益,
	 */
	private String accumincome = "";
	
	/**
	 * 超级现金宝银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 超级现金宝账号描述,
	 */
	private String bankdesc = "";
	
	/**
	 * 超级现金宝资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 超级现金宝基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 超级现金宝证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 超级现金宝证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 实时资产,
	 */
	private String realasset = "";
	
	/**
	 * 超级现金宝收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 超级现金宝交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 上一日新增收益,
	 */
	private String occurincome = "";
	
	/**
	 * 实时资产中的未确认份额,
	 */
	private String realunregbala = "";
	
	/**
	 * 超级现金宝中的可用余额,
	 */
	private String usablebala = "";
	
	/**
	 * 当日可赎回份额,
	 */
	private String validshare = "";
	
	/**
	 * 冻结份额,
	 */
	private String forzenbala = "";
	
	/**
	 * 普通赎回份额,
	 */
	private String realtredeemregshare = "";
	
	/**
	 * 注册份额,
	 */
	private String registshare = "";
	
	/**
	 * 总资产,
	 */
	private String totalasset = "";
	
	private List<S052OutputDetail> detail = new ArrayList<S052OutputDetail>();
	
	/**
	 * 历史累积收益,
	 */
	public String getAccumincome() {
		return this.accumincome;
	}
	
	/**
	 * 历史累积收益,
	 */
	public void setAccumincome(String value)
	 {
		this.accumincome = value;
	}
	
	/**
	 * 超级现金宝银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 超级现金宝银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 超级现金宝账号描述,
	 */
	public String getBankdesc() {
		return this.bankdesc;
	}
	
	/**
	 * 超级现金宝账号描述,
	 */
	public void setBankdesc(String value)
	 {
		this.bankdesc = value;
	}
	
	/**
	 * 超级现金宝资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 超级现金宝资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 超级现金宝基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 超级现金宝基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 超级现金宝证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 超级现金宝证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 超级现金宝证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 超级现金宝证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 实时资产,
	 */
	public String getRealasset() {
		return this.realasset;
	}
	
	/**
	 * 实时资产,
	 */
	public void setRealasset(String value)
	 {
		this.realasset = value;
	}
	
	/**
	 * 超级现金宝收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 超级现金宝收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 上一日新增收益,
	 */
	public String getOccurincome() {
		return this.occurincome;
	}
	
	/**
	 * 上一日新增收益,
	 */
	public void setOccurincome(String value)
	 {
		this.occurincome = value;
	}
	
	/**
	 * 实时资产中的未确认份额,
	 */
	public String getRealunregbala() {
		return this.realunregbala;
	}
	
	/**
	 * 实时资产中的未确认份额,
	 */
	public void setRealunregbala(String value)
	 {
		this.realunregbala = value;
	}
	
	/**
	 * 超级现金宝中的可用余额,
	 */
	public String getUsablebala() {
		return this.usablebala;
	}
	
	/**
	 * 超级现金宝中的可用余额,
	 */
	public void setUsablebala(String value)
	 {
		this.usablebala = value;
	}
	
	/**
	 * 当日可赎回份额,
	 */
	public String getValidshare() {
		return this.validshare;
	}
	
	/**
	 * 当日可赎回份额,
	 */
	public void setValidshare(String value)
	 {
		this.validshare = value;
	}
	
	/**
	 * 冻结份额,
	 */
	public String getForzenbala() {
		return this.forzenbala;
	}
	
	/**
	 * 冻结份额,
	 */
	public void setForzenbala(String value)
	 {
		this.forzenbala = value;
	}
	
	/**
	 * 普通赎回份额,
	 */
	public String getRealtredeemregshare() {
		return this.realtredeemregshare;
	}
	
	/**
	 * 普通赎回份额,
	 */
	public void setRealtredeemregshare(String value)
	 {
		this.realtredeemregshare = value;
	}
	
	/**
	 * 注册份额,
	 */
	public String getRegistshare() {
		return this.registshare;
	}
	
	/**
	 * 注册份额,
	 */
	public void setRegistshare(String value)
	 {
		this.registshare = value;
	}
	
	/**
	 * 总资产,
	 */
	public String getTotalasset() {
		return this.totalasset;
	}
	
	/**
	 * 总资产,
	 */
	public void setTotalasset(String value)
	 {
		this.totalasset = value;
	}
	
	public List<S052OutputDetail> getDetail() {
		return this.detail;
	}
	
}
