package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投协议新增(I022)
 */
public class I022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金来源,0:来源为银行卡， 2:来源为汇款支付渠道
	 */
	private String capsource = "";
	
	/**
	 * 交易周期单位,
	 */
	private String cycleunit;
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	private String investflag = "";
	
	/**
	 * 投资总额,investflag为1时为applysum的总额 如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	private String investsum = "";
	
	/**
	 * 交易日期,
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 首次交易月份,
	 */
	private String scjyrq = "";
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 终止日期,
	 */
	private String zzrq = "";
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成； 数米组合理财必填。
	 */
	private String combcode = "";
	
	/**
	 * 外部组合编号,组合理财产品申购业务必传
	 */
	private String extcombcode = "";
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	private String investcontent = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 自定义组合编号,
	 */
	private String selfcombcode = "";
	
	/**
	 * 初始化参数
	 */
	public I022Input() {
		this.setFunction("I022");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金来源,0:来源为银行卡， 2:来源为汇款支付渠道
	 */
	public String getCapsource() {
		return this.capsource;
	}
	
	/**
	 * 资金来源,0:来源为银行卡， 2:来源为汇款支付渠道
	 */
	public void setCapsource(String value)
	 {
		this.capsource = value;
	}
	
	/**
	 * 交易周期单位,
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 交易周期单位,
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	public String getInvestflag() {
		return this.investflag;
	}
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	public void setInvestflag(String value)
	 {
		this.investflag = value;
	}
	
	/**
	 * 投资总额,investflag为1时为applysum的总额 如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	public String getInvestsum() {
		return this.investsum;
	}
	
	/**
	 * 投资总额,investflag为1时为applysum的总额 如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	public void setInvestsum(String value)
	 {
		this.investsum = value;
	}
	
	/**
	 * 交易日期,
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易周期,
	 */
	public String getJyzq() {
		return this.jyzq;
	}
	
	/**
	 * 交易周期,
	 */
	public void setJyzq(String value)
	 {
		this.jyzq = value;
	}
	
	/**
	 * 首次交易月份,
	 */
	public String getScjyrq() {
		return this.scjyrq;
	}
	
	/**
	 * 首次交易月份,
	 */
	public void setScjyrq(String value)
	 {
		this.scjyrq = value;
	}
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 终止日期,
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成； 数米组合理财必填。
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成； 数米组合理财必填。
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 外部组合编号,组合理财产品申购业务必传
	 */
	public String getExtcombcode() {
		return this.extcombcode;
	}
	
	/**
	 * 外部组合编号,组合理财产品申购业务必传
	 */
	public void setExtcombcode(String value)
	 {
		this.extcombcode = value;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 自定义组合编号,
	 */
	public String getSelfcombcode() {
		return this.selfcombcode;
	}
	
	/**
	 * 自定义组合编号,
	 */
	public void setSelfcombcode(String value)
	 {
		this.selfcombcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capsource", this.capsource);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("investflag", this.investflag);
		inputMap.put("investsum", this.investsum);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("scjyrq", this.scjyrq);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("combcode", this.combcode);
		inputMap.put("extcombcode", this.extcombcode);
		inputMap.put("investcontent", this.investcontent);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("selfcombcode", this.selfcombcode);
	}
}
