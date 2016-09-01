package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投协议变更(I023)
 */
public class I023Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	private String xyh = "";
	
	/**
	 * 资金来源,0:来源为银行卡， 2:来源为汇款支付渠道
	 */
	private String capsource = "";
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
	 */
	private String combrequestno = "";
	
	/**
	 * 交易周期单位,
	 */
	private String cycleunit;
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 投资总额,investflag为1时为applysum的总额如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	private String investsum = "";
	
	/**
	 * 交易日期,长度为2位：如15
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
	 * 终止日期,格式：yyyy-MM-dd，如2015-02-02
	 */
	private String zzrq = "";
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	private String state = "";
	
	/**
	 * 协议别名,
	 */
	private String xybm = "";
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
	 */
	private String combcode = "";
	
	/**
	 * 外部组合编号,组合理财产品申购业务必传
	 */
	private String extcombcode = "";
	
	/**
	 * 组合方案内容,investflag为1时必传将用户配置的基金代码、收费方式、金额按"|"分隔组装，格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	private String investcontent = "";
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	private String investflag = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 终止条件,
	 */
	private String endcondition = "";
	
	/**
	 * 初始化参数
	 */
	public I023Input() {
		this.setFunction("I023");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
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
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
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
	 * 投资总额,investflag为1时为applysum的总额如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	public String getInvestsum() {
		return this.investsum;
	}
	
	/**
	 * 投资总额,investflag为1时为applysum的总额如果和传入的applysum之和不符，则自动调整最后一支基金以适应该总额。
	 */
	public void setInvestsum(String value)
	 {
		this.investsum = value;
	}
	
	/**
	 * 交易日期,长度为2位：如15
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,长度为2位：如15
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
	 * 终止日期,格式：yyyy-MM-dd，如2015-02-02
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,格式：yyyy-MM-dd，如2015-02-02
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 协议别名,
	 */
	public String getXybm() {
		return this.xybm;
	}
	
	/**
	 * 协议别名,
	 */
	public void setXybm(String value)
	 {
		this.xybm = value;
	}
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,investflag为0时必传；为1时可不填，系统自动生成；数米组合理财必填。
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
	 * 组合方案内容,investflag为1时必传将用户配置的基金代码、收费方式、金额按"|"分隔组装，格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传将用户配置的基金代码、收费方式、金额按"|"分隔组装，格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
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
	 * 终止条件,
	 */
	public String getEndcondition() {
		return this.endcondition;
	}
	
	/**
	 * 终止条件,
	 */
	public void setEndcondition(String value)
	 {
		this.endcondition = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("xyh", this.xyh);
		inputMap.put("capsource", this.capsource);
		inputMap.put("combrequestno", this.combrequestno);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("investsum", this.investsum);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("scjyrq", this.scjyrq);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("state", this.state);
		inputMap.put("xybm", this.xybm);
		inputMap.put("combcode", this.combcode);
		inputMap.put("extcombcode", this.extcombcode);
		inputMap.put("investcontent", this.investcontent);
		inputMap.put("investflag", this.investflag);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("endcondition", this.endcondition);
	}
}
