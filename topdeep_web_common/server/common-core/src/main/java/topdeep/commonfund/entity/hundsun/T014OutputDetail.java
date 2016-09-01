package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可组合投资支付方式列表(T014)功能输出明细参数
 */
public class T014OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,
	 */
	private String capicalmode = "";
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	private String detailcapitalmode_new = "";
	
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
	 * 资金方式,
	 */
	public String getCapicalmode() {
		return this.capicalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapicalmode(String value)
	 {
		this.capicalmode = value;
	}
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
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
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public String getDetailcapitalmode_new() {
		return this.detailcapitalmode_new;
	}
	
	/**
	 * 支持支付方式,00:直接网银支付;01:商户代扣;02:汇款支付;03：快捷支付
	 */
	public void setDetailcapitalmode_new(String value)
	 {
		this.detailcapitalmode_new = value;
	}
}
