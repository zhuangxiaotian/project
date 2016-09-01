package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行卡快捷鉴权验证码验证(B041)
 */
public class B041Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行返回报文密文,交行资金方式支付验证时会返回
	 */
	private String bankreturnpacket = "";
	
	/**
	 * 请求序列号,
	 */
	private String accoreqserial = "";
	
	/**
	 * 签约协议号,部分渠道快捷鉴权时会返回此字段，开户时需要
	 */
	private String yinliancdcard = "";
	
	/**
	 * 银行返回报文密文,交行资金方式支付验证时会返回
	 */
	public String getBankreturnpacket() {
		return this.bankreturnpacket;
	}
	
	/**
	 * 银行返回报文密文,交行资金方式支付验证时会返回
	 */
	public void setBankreturnpacket(String value)
	 {
		this.bankreturnpacket = value;
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
	 * 签约协议号,部分渠道快捷鉴权时会返回此字段，开户时需要
	 */
	public String getYinliancdcard() {
		return this.yinliancdcard;
	}
	
	/**
	 * 签约协议号,部分渠道快捷鉴权时会返回此字段，开户时需要
	 */
	public void setYinliancdcard(String value)
	 {
		this.yinliancdcard = value;
	}
}
