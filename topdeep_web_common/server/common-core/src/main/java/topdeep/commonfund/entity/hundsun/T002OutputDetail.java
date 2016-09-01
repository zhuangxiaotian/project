package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可买入支付方式列表(T002)功能输出明细参数
 */
public class T002OutputDetail extends Object implements Serializable {
	
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
	 * 日限额余额,工行快捷时返回
	 */
	private String dailyremain = "";
	
	/**
	 * 月限额余额,工行快捷时返回
	 */
	private String monthlyremain = "";
	
	/**
	 * 交易来源,交易来源，只有升级0E服务到0U服务才有返回值
	 */
	private String comefrom = "";
	
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
	 * 日限额余额,工行快捷时返回
	 */
	public String getDailyremain() {
		return this.dailyremain;
	}
	
	/**
	 * 日限额余额,工行快捷时返回
	 */
	public void setDailyremain(String value)
	 {
		this.dailyremain = value;
	}
	
	/**
	 * 月限额余额,工行快捷时返回
	 */
	public String getMonthlyremain() {
		return this.monthlyremain;
	}
	
	/**
	 * 月限额余额,工行快捷时返回
	 */
	public void setMonthlyremain(String value)
	 {
		this.monthlyremain = value;
	}
	
	/**
	 * 交易来源,交易来源，只有升级0E服务到0U服务才有返回值
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,交易来源，只有升级0E服务到0U服务才有返回值
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
}
