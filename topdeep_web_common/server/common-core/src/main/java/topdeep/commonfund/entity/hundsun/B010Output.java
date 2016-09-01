package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 易宝渠道老客户签约(B010)
 */
public class B010Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	private String busitype = "";
	
	/**
	 * 请求序列号,请求网银时的产生的序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 银行返回码,请求网银时的产生的序列号
	 */
	private String respcode = "";
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	private String respdesc = "";
	
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
	private String branchbank = "";
	
	/**
	 * 银行卡户名,
	 */
	private String custnamebank = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identitynobank = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytypebank = "";
	
	/**
	 * 银联CD卡号,银行返回的签约协议号
	 */
	private String yinliancdcard = "";
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
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
	 * 银行返回码,请求网银时的产生的序列号
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 银行返回码,请求网银时的产生的序列号
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
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
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 联行号,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
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
