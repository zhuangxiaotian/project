package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 实时银行账户信息同步(C056)
 */
public class C056Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 销售商代码,
	 */
	private String agencyno = "";
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行户名,
	 */
	private String bankacconame = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 基金账号,交易账号，基金账号不能同时为空
	 */
	private String fundacco = "";
	
	/**
	 * 交易账号,交易账号，基金账号不能同时为空
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public C056Input() {
		this.setFunction("C056");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 销售商代码,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
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
	 * 基金账号,交易账号，基金账号不能同时为空
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,交易账号，基金账号不能同时为空
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 交易账号,交易账号，基金账号不能同时为空
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,交易账号，基金账号不能同时为空
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankacconame", this.bankacconame);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
