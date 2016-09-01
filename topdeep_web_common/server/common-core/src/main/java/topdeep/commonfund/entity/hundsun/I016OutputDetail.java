package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投支付方式列表(I016)功能输出明细参数
 */
public class I016OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 银行全称,
	 */
	private String bankfullname = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,取字典“资金方式”，A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	private String capitalmode;
	
	/**
	 * 开户银行城市代码,
	 */
	private String cityno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 是否开通网上交易,1:开通，0:未开通
	 */
	private String netconsign;
	
	/**
	 * 密码密文,
	 */
	private String password = "";
	
	/**
	 * 开户银行省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 交易账号状态,取字典“交易账户状态”0:正常,1:新开户,2:账号登记,5:正在销户,6:销户,等等
	 */
	private String state;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 明细资金方式,01:商户代扣;03：快捷支付 (01或者03都可以支持定投)
	 */
	private String detailcapitalmode_new = "";
	
	/**
	 * 回款账户标志,
	 */
	private String backfalg = "";
	
	/**
	 * 银行编号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行证件号码,
	 */
	private String bankidcard = "";
	
	/**
	 * 银行证件类型,
	 */
	private String bankidtype;
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 明细资金方式方式,01:已签约（可定投）；非01：需要进行签约，签约后可定投
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 是否允许网上交易修改,1:允许，0:不允许
	 */
	private String netmodifybankacco;
	
	/**
	 * 银联CD卡号,
	 */
	private String yinliancdcard = "";
	
	/**
	 * 银行户名,
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行户名,
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
	}
	
	/**
	 * 银行全称,
	 */
	public String getBankfullname() {
		return this.bankfullname;
	}
	
	/**
	 * 银行全称,
	 */
	public void setBankfullname(String value)
	 {
		this.bankfullname = value;
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
	 * 资金方式,取字典“资金方式”，A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,取字典“资金方式”，A:农行 B:建行 G:招行 J:民生 C:交行 3:银联
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public String getCityno() {
		return this.cityno;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public void setCityno(String value)
	 {
		this.cityno = value;
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
	 * 是否开通网上交易,1:开通，0:未开通
	 */
	public String getNetconsign() {
		return this.netconsign;
	}
	
	/**
	 * 是否开通网上交易,1:开通，0:未开通
	 */
	public void setNetconsign(String value)
	 {
		this.netconsign = value;
	}
	
	/**
	 * 密码密文,
	 */
	public String getPassword() {
		return this.password;
	}
	
	/**
	 * 密码密文,
	 */
	public void setPassword(String value)
	 {
		this.password = value;
	}
	
	/**
	 * 开户银行省份代码,
	 */
	public String getProvincecode() {
		return this.provincecode;
	}
	
	/**
	 * 开户银行省份代码,
	 */
	public void setProvincecode(String value)
	 {
		this.provincecode = value;
	}
	
	/**
	 * 交易账号状态,取字典“交易账户状态”0:正常,1:新开户,2:账号登记,5:正在销户,6:销户,等等
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 交易账号状态,取字典“交易账户状态”0:正常,1:新开户,2:账号登记,5:正在销户,6:销户,等等
	 */
	public void setState(String value)
	 {
		this.state = value;
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
	 * 明细资金方式,01:商户代扣;03：快捷支付 (01或者03都可以支持定投)
	 */
	public String getDetailcapitalmode_new() {
		return this.detailcapitalmode_new;
	}
	
	/**
	 * 明细资金方式,01:商户代扣;03：快捷支付 (01或者03都可以支持定投)
	 */
	public void setDetailcapitalmode_new(String value)
	 {
		this.detailcapitalmode_new = value;
	}
	
	/**
	 * 回款账户标志,
	 */
	public String getBackfalg() {
		return this.backfalg;
	}
	
	/**
	 * 回款账户标志,
	 */
	public void setBackfalg(String value)
	 {
		this.backfalg = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行证件号码,
	 */
	public String getBankidcard() {
		return this.bankidcard;
	}
	
	/**
	 * 银行证件号码,
	 */
	public void setBankidcard(String value)
	 {
		this.bankidcard = value;
	}
	
	/**
	 * 银行证件类型,
	 */
	public String getBankidtype() {
		return this.bankidtype;
	}
	
	/**
	 * 银行证件类型,
	 */
	public void setBankidtype(String value)
	 {
		this.bankidtype = value;
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
	
	/**
	 * 明细资金方式方式,01:已签约（可定投）；非01：需要进行签约，签约后可定投
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式方式,01:已签约（可定投）；非01：需要进行签约，签约后可定投
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 是否允许网上交易修改,1:允许，0:不允许
	 */
	public String getNetmodifybankacco() {
		return this.netmodifybankacco;
	}
	
	/**
	 * 是否允许网上交易修改,1:允许，0:不允许
	 */
	public void setNetmodifybankacco(String value)
	 {
		this.netmodifybankacco = value;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
}
