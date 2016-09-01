package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 变更银行卡功能输入参数
 */
public class ISBankCardChangeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 银联标志,
	 */
	private String cpflag;
	
	/**
	 * 银行卡实名状态,
	 */
	private String custcardstat;
	
	/**
	 * 客户实名状态,
	 */
	private String custstat;
	
	/**
	 * 用户类型,
	 */
	private String usrtype;
	
	/**
	 * 银联CD卡号,
	 */
	private String yinliancdcard;
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial;
	
	/**
	 * 分行名称,
	 */
	private String branchbankname;
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	private String bankacconame;
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
	 */
	private String bankacco;
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	private String bankname;
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	private String bankserial;
	
	/**
	 * 联行号,当请求序列号为空时必传
	 */
	private String brachbank;
	
	/**
	 * 业务类型,当请求序列号为空时必传
	 */
	private String busitype;
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	private String capitalmode;
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	private String detailcapitalmode;
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	private String identityno;
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	private String identitytype;
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	private String tradeacco;
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact;
	
	/**
	 * 交易来源,
	 */
	private String comefrom;
	
	public ISBankCardChangeInput() {
		this.setZ_funcCode("n1f");
	}
	
	/**
	 * 银联标志,
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联标志,
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public String getCustcardstat() {
		return this.custcardstat;
	}
	
	/**
	 * 银行卡实名状态,
	 */
	public void setCustcardstat(String value)
	 {
		this.custcardstat = value;
	}
	
	/**
	 * 客户实名状态,
	 */
	public String getCuststat() {
		return this.custstat;
	}
	
	/**
	 * 客户实名状态,
	 */
	public void setCuststat(String value)
	 {
		this.custstat = value;
	}
	
	/**
	 * 用户类型,
	 */
	public String getUsrtype() {
		return this.usrtype;
	}
	
	/**
	 * 用户类型,
	 */
	public void setUsrtype(String value)
	 {
		this.usrtype = value;
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
	
	/**
	 * 请求序列号,
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 分行名称,
	 */
	public String getBranchbankname() {
		return this.branchbankname;
	}
	
	/**
	 * 分行名称,
	 */
	public void setBranchbankname(String value)
	 {
		this.branchbankname = value;
	}
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	public String getBankacconame() {
		return this.bankacconame;
	}
	
	/**
	 * 银行账户名称,当请求序列号为空时必传
	 */
	public void setBankacconame(String value)
	 {
		this.bankacconame = value;
	}
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 修改后的银行卡号,当请求序列号为空时必传
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,当请求序列号为空时必传
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,当请求序列号为空时必传
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 联行号,当请求序列号为空时必传
	 */
	public String getBrachbank() {
		return this.brachbank;
	}
	
	/**
	 * 联行号,当请求序列号为空时必传
	 */
	public void setBrachbank(String value)
	 {
		this.brachbank = value;
	}
	
	/**
	 * 业务类型,当请求序列号为空时必传
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 业务类型,当请求序列号为空时必传
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,当请求序列号为空时必传
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,当请求序列号为空时必传
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,当请求序列号为空时必传
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,当请求序列号为空时必传
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,当请求序列号为空时必传
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易经办人,
	 */
	public String getTradecontact() {
		return this.tradecontact;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontact(String value)
	 {
		this.tradecontact = value;
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
}
