package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 异步方式银行返回数据验证(B009)
 */
public class B009Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 请求序列号,请求网银时的产生的序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankaccobank = "";
	
	/**
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	private String bankname = "";
	
	/**
	 * 银行返回的实际银行编号,直销可识别的银行编号
	 */
	private String bankserial = "";
	
	/**
	 * 联行号,
	 */
	private String brachbank = "";
	
	/**
	 * 银联标志,
	 */
	private String cpflag = "";
	
	/**
	 * 银行卡实名状态,
	 */
	private String custcardstat = "";
	
	/**
	 * 银行卡户名,
	 */
	private String custnamebank = "";
	
	/**
	 * 客户实名状态,
	 */
	private String custstat = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identitynobank = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytypebank = "";
	
	/**
	 * 银行流水号,
	 */
	private String orderid = "";
	
	/**
	 * 用户类型,
	 */
	private String usrtype = "";
	
	/**
	 * 银联CD卡号,银行返回的签约协议号
	 */
	private String yinliancdcard = "";
	
	/**
	 * 请求序列号,请求网银时的产生的序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,请求网银时的产生的序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankaccobank() {
		return this.bankaccobank;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankaccobank(String value)
	 {
		this.bankaccobank = value;
	}
	
	/**
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,返回验证签名后银行返回的银行名称
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 银行返回的实际银行编号,直销可识别的银行编号
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行返回的实际银行编号,直销可识别的银行编号
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 联行号,
	 */
	public String getBrachbank() {
		return this.brachbank;
	}
	
	/**
	 * 联行号,
	 */
	public void setBrachbank(String value)
	 {
		this.brachbank = value;
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
	 * 银行卡户名,
	 */
	public String getCustnamebank() {
		return this.custnamebank;
	}
	
	/**
	 * 银行卡户名,
	 */
	public void setCustnamebank(String value)
	 {
		this.custnamebank = value;
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
	 * 银行证件号码,
	 */
	public String getIdentitynobank() {
		return this.identitynobank;
	}
	
	/**
	 * 银行证件号码,
	 */
	public void setIdentitynobank(String value)
	 {
		this.identitynobank = value;
	}
	
	/**
	 * 银行证件类型,
	 */
	public String getIdentitytypebank() {
		return this.identitytypebank;
	}
	
	/**
	 * 银行证件类型,
	 */
	public void setIdentitytypebank(String value)
	 {
		this.identitytypebank = value;
	}
	
	/**
	 * 银行流水号,
	 */
	public String getOrderid() {
		return this.orderid;
	}
	
	/**
	 * 银行流水号,
	 */
	public void setOrderid(String value)
	 {
		this.orderid = value;
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
	 * 银联CD卡号,银行返回的签约协议号
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 银联CD卡号,银行返回的签约协议号
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
}
