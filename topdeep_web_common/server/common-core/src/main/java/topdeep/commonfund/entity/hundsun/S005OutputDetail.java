package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史分红查询(S005)功能输出明细参数
 */
public class S005OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 分红日-发放日,yyyyMMdd格式字符串
	 */
	private String meloncutting = "";
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	private String sharetype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 结算币种,"156":人民币
	 */
	private String balancecoin = "";
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 红股份额,
	 */
	private String bonusshare = "";
	
	/**
	 * 红利总金额,
	 */
	private String bonustotalsum = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 权益登记日,
	 */
	private String enrolldate = "";
	
	/**
	 * 登记份额,
	 */
	private String enrollshare = "";
	
	/**
	 * 实发红利金额,
	 */
	private String factbonussum = "";
	
	/**
	 * 冻结份数,
	 */
	private String freezeshare = "";
	
	/**
	 * 冻结金额,
	 */
	private String freezesum = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 所得税,
	 */
	private String incometax = "";
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	private String melonmethod;
	
	/**
	 * 净值,
	 */
	private String netvalue = "";
	
	/**
	 * 手续费,
	 */
	private String poundage = "";
	
	/**
	 * 每股分红金额,
	 */
	private String shareperbonus = "";
	
	/**
	 * 每股分红股数,
	 */
	private String sumperbonus = "";
	
	/**
	 * TA确认编号,
	 */
	private String taconfirmserial = "";
	
	/**
	 * 分红方式,
	 */
	private String melonmethodStr = "";
	
	/**
	 * 发生时银行卡号,
	 */
	private String occurbankacco = "";
	
	/**
	 * 发生时银行编号,
	 */
	private String occurbankno = "";
	
	/**
	 * 销售机构代码,仅EQ、ETQ模式有值
	 */
	private String agencyno = "";
	
	/**
	 * 销售机构类型,仅EQ、ETQ模式有值
	 */
	private String agencytype = "";
	
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
	 * 分红日-发放日,yyyyMMdd格式字符串
	 */
	public String getMeloncutting() {
		return this.meloncutting;
	}
	
	/**
	 * 分红日-发放日,yyyyMMdd格式字符串
	 */
	public void setMeloncutting(String value)
	 {
		this.meloncutting = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”
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
	 * 结算币种,"156":人民币
	 */
	public String getBalancecoin() {
		return this.balancecoin;
	}
	
	/**
	 * 结算币种,"156":人民币
	 */
	public void setBalancecoin(String value)
	 {
		this.balancecoin = value;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 红股份额,
	 */
	public String getBonusshare() {
		return this.bonusshare;
	}
	
	/**
	 * 红股份额,
	 */
	public void setBonusshare(String value)
	 {
		this.bonusshare = value;
	}
	
	/**
	 * 红利总金额,
	 */
	public String getBonustotalsum() {
		return this.bonustotalsum;
	}
	
	/**
	 * 红利总金额,
	 */
	public void setBonustotalsum(String value)
	 {
		this.bonustotalsum = value;
	}
	
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
	 * 权益登记日,
	 */
	public String getEnrolldate() {
		return this.enrolldate;
	}
	
	/**
	 * 权益登记日,
	 */
	public void setEnrolldate(String value)
	 {
		this.enrolldate = value;
	}
	
	/**
	 * 登记份额,
	 */
	public String getEnrollshare() {
		return this.enrollshare;
	}
	
	/**
	 * 登记份额,
	 */
	public void setEnrollshare(String value)
	 {
		this.enrollshare = value;
	}
	
	/**
	 * 实发红利金额,
	 */
	public String getFactbonussum() {
		return this.factbonussum;
	}
	
	/**
	 * 实发红利金额,
	 */
	public void setFactbonussum(String value)
	 {
		this.factbonussum = value;
	}
	
	/**
	 * 冻结份数,
	 */
	public String getFreezeshare() {
		return this.freezeshare;
	}
	
	/**
	 * 冻结份数,
	 */
	public void setFreezeshare(String value)
	 {
		this.freezeshare = value;
	}
	
	/**
	 * 冻结金额,
	 */
	public String getFreezesum() {
		return this.freezesum;
	}
	
	/**
	 * 冻结金额,
	 */
	public void setFreezesum(String value)
	 {
		this.freezesum = value;
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
	 * 所得税,
	 */
	public String getIncometax() {
		return this.incometax;
	}
	
	/**
	 * 所得税,
	 */
	public void setIncometax(String value)
	 {
		this.incometax = value;
	}
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,取字典“分红方式”
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
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
	 * 手续费,
	 */
	public String getPoundage() {
		return this.poundage;
	}
	
	/**
	 * 手续费,
	 */
	public void setPoundage(String value)
	 {
		this.poundage = value;
	}
	
	/**
	 * 每股分红金额,
	 */
	public String getShareperbonus() {
		return this.shareperbonus;
	}
	
	/**
	 * 每股分红金额,
	 */
	public void setShareperbonus(String value)
	 {
		this.shareperbonus = value;
	}
	
	/**
	 * 每股分红股数,
	 */
	public String getSumperbonus() {
		return this.sumperbonus;
	}
	
	/**
	 * 每股分红股数,
	 */
	public void setSumperbonus(String value)
	 {
		this.sumperbonus = value;
	}
	
	/**
	 * TA确认编号,
	 */
	public String getTaconfirmserial() {
		return this.taconfirmserial;
	}
	
	/**
	 * TA确认编号,
	 */
	public void setTaconfirmserial(String value)
	 {
		this.taconfirmserial = value;
	}
	
	/**
	 * 分红方式,
	 */
	public String getMelonmethodStr() {
		return this.melonmethodStr;
	}
	
	/**
	 * 分红方式,
	 */
	public void setMelonmethodStr(String value)
	 {
		this.melonmethodStr = value;
	}
	
	/**
	 * 发生时银行卡号,
	 */
	public String getOccurbankacco() {
		return this.occurbankacco;
	}
	
	/**
	 * 发生时银行卡号,
	 */
	public void setOccurbankacco(String value)
	 {
		this.occurbankacco = value;
	}
	
	/**
	 * 发生时银行编号,
	 */
	public String getOccurbankno() {
		return this.occurbankno;
	}
	
	/**
	 * 发生时银行编号,
	 */
	public void setOccurbankno(String value)
	 {
		this.occurbankno = value;
	}
	
	/**
	 * 销售机构代码,仅EQ、ETQ模式有值
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售机构代码,仅EQ、ETQ模式有值
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 销售机构类型,仅EQ、ETQ模式有值
	 */
	public String getAgencytype() {
		return this.agencytype;
	}
	
	/**
	 * 销售机构类型,仅EQ、ETQ模式有值
	 */
	public void setAgencytype(String value)
	 {
		this.agencytype = value;
	}
}
