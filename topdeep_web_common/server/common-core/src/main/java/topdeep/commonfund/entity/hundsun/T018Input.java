package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 代销T+0划款(T018)
 */
public class T018Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	private String agencyno = "";
	
	/**
	 * 申请日期,
	 */
	private String applydate = "";
	
	/**
	 * 申请编号,代销机构的申请编号
	 */
	private String applyserial = "";
	
	/**
	 * 申请金额,
	 */
	private String applysum = "";
	
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
	 * 银行编号,如果该银行编号为代销端编号，则依赖字典10112的配置，将代销端的银行编号转化为直销的银行编号
	 */
	private String bankno = "";
	
	/**
	 * 客户类别,
	 */
	private String customertype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 银行证件号码,
	 */
	private String identitynoinbank = "";
	
	/**
	 * 银行证件类型,
	 */
	private String identitytypeinbank = "";
	
	/**
	 * 赎回份额,
	 */
	private String redeemshare = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 理财平台流水号,第三方销售机构的流水号
	 */
	private String chinapayserialno = "";
	
	/**
	 * 开户银行城市代码,
	 */
	private String citycode = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 开户银行省份代码,
	 */
	private String provincecode = "";
	
	/**
	 * 交易账号,代销用户在直销的交易账号
	 */
	private String tradeacco = "";
	
	/**
	 * 资金流水号,代销机构的资金流水
	 */
	private String capitalserial = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public T018Input() {
		this.setFunction("T018");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
	}
	
	/**
	 * 申请编号,代销机构的申请编号
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,代销机构的申请编号
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
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
	 * 银行编号,如果该银行编号为代销端编号，则依赖字典10112的配置，将代销端的银行编号转化为直销的银行编号
	 */
	public String getBankno() {
		return this.bankno;
	}
	
	/**
	 * 银行编号,如果该银行编号为代销端编号，则依赖字典10112的配置，将代销端的银行编号转化为直销的银行编号
	 */
	public void setBankno(String value)
	 {
		this.bankno = value;
	}
	
	/**
	 * 客户类别,
	 */
	public String getCustomertype() {
		return this.customertype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCustomertype(String value)
	 {
		this.customertype = value;
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
	 * 银行证件号码,
	 */
	public String getIdentitynoinbank() {
		return this.identitynoinbank;
	}
	
	/**
	 * 银行证件号码,
	 */
	public void setIdentitynoinbank(String value)
	 {
		this.identitynoinbank = value;
	}
	
	/**
	 * 银行证件类型,
	 */
	public String getIdentitytypeinbank() {
		return this.identitytypeinbank;
	}
	
	/**
	 * 银行证件类型,
	 */
	public void setIdentitytypeinbank(String value)
	 {
		this.identitytypeinbank = value;
	}
	
	/**
	 * 赎回份额,
	 */
	public String getRedeemshare() {
		return this.redeemshare;
	}
	
	/**
	 * 赎回份额,
	 */
	public void setRedeemshare(String value)
	 {
		this.redeemshare = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 理财平台流水号,第三方销售机构的流水号
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,第三方销售机构的流水号
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public String getCitycode() {
		return this.citycode;
	}
	
	/**
	 * 开户银行城市代码,
	 */
	public void setCitycode(String value)
	 {
		this.citycode = value;
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
	 * 交易账号,代销用户在直销的交易账号
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,代销用户在直销的交易账号
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 资金流水号,代销机构的资金流水
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水号,代销机构的资金流水
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("applydate", this.applydate);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("applysum", this.applysum);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankacconame", this.bankacconame);
		inputMap.put("bankname", this.bankname);
		inputMap.put("bankno", this.bankno);
		inputMap.put("customertype", this.customertype);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identitynoinbank", this.identitynoinbank);
		inputMap.put("identitytypeinbank", this.identitytypeinbank);
		inputMap.put("redeemshare", this.redeemshare);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("citycode", this.citycode);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("provincecode", this.provincecode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("capitalserial", this.capitalserial);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
