package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投转换协议新增(I008)
 */
public class I008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	private String cycleunit;
	
	/**
	 * 转出基金代码,调用I017返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 交易日期,日期的后两位
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 转入基金代码,调用I013返回的otherfundcode
	 */
	private String otherfundcode = "";
	
	/**
	 * 转入收费方式,调用I013返回的othersharetype
	 */
	private String othersharetype = "";
	
	/**
	 * 首次交易月份,yyyyMM格式，如果传值“000000”,则自动计算最近的扣款日对应的交易日期和首次交易月份，规则：交易周期为月时，交易日期传用户选择的日期后两位；交易周期为周时，交易日期传值规则为1-6（周一-周五)
	 */
	private String scjyrq = "";
	
	/**
	 * 转出收费方式,调用I017返回的sharetype
	 */
	private String sharetype;
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	private String zzrq = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 转换份额,
	 */
	private String applysum = "";
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"，“07”必填
	 */
	private String avgexptype = "";
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	private String busintype = "";
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	private String diffscale = "";
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"，“07”必填
	 */
	private String exponentcode = "";
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额
	 */
	private String exptype = "";
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	private String maxsuccessnum = "";
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	private String maxvalue = "";
	
	/**
	 * 协议别名,
	 */
	private String xybm = "";
	
	/**
	 * 投资区间方案编号,exptype为“07”，“08”时必填
	 */
	private String sectionschemano = "";
	
	/**
	 * 初始化参数
	 */
	public I008Input() {
		this.setFunction("I008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 转出基金代码,调用I017返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 转出基金代码,调用I017返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 交易日期,日期的后两位
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,日期的后两位
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
	 * 转入基金代码,调用I013返回的otherfundcode
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 转入基金代码,调用I013返回的otherfundcode
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 转入收费方式,调用I013返回的othersharetype
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 转入收费方式,调用I013返回的othersharetype
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
	}
	
	/**
	 * 首次交易月份,yyyyMM格式，如果传值“000000”,则自动计算最近的扣款日对应的交易日期和首次交易月份，规则：交易周期为月时，交易日期传用户选择的日期后两位；交易周期为周时，交易日期传值规则为1-6（周一-周五)
	 */
	public String getScjyrq() {
		return this.scjyrq;
	}
	
	/**
	 * 首次交易月份,yyyyMM格式，如果传值“000000”,则自动计算最近的扣款日对应的交易日期和首次交易月份，规则：交易周期为月时，交易日期传用户选择的日期后两位；交易周期为周时，交易日期传值规则为1-6（周一-周五)
	 */
	public void setScjyrq(String value)
	 {
		this.scjyrq = value;
	}
	
	/**
	 * 转出收费方式,调用I017返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 转出收费方式,调用I017返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
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
	 * 终止日期,"99991231"代表无限期
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
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
	 * 转换份额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 转换份额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"，“07”必填
	 */
	public String getAvgexptype() {
		return this.avgexptype;
	}
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"，“07”必填
	 */
	public void setAvgexptype(String value)
	 {
		this.avgexptype = value;
	}
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,"01":现金宝业务
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	public String getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	public void setDiffscale(String value)
	 {
		this.diffscale = value;
	}
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"，“07”必填
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"，“07”必填
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	public String getMaxsuccessnum() {
		return this.maxsuccessnum;
	}
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	public void setMaxsuccessnum(String value)
	 {
		this.maxsuccessnum = value;
	}
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	public String getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	public void setMaxvalue(String value)
	 {
		this.maxvalue = value;
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
	 * 投资区间方案编号,exptype为“07”，“08”时必填
	 */
	public String getSectionschemano() {
		return this.sectionschemano;
	}
	
	/**
	 * 投资区间方案编号,exptype为“07”，“08”时必填
	 */
	public void setSectionschemano(String value)
	 {
		this.sectionschemano = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("otherfundcode", this.otherfundcode);
		inputMap.put("othersharetype", this.othersharetype);
		inputMap.put("scjyrq", this.scjyrq);
		inputMap.put("sharetype", this.sharetype.toString());
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("applysum", this.applysum);
		inputMap.put("avgexptype", this.avgexptype);
		inputMap.put("busintype", this.busintype);
		inputMap.put("diffscale", this.diffscale);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("exptype", this.exptype);
		inputMap.put("maxsuccessnum", this.maxsuccessnum);
		inputMap.put("maxvalue", this.maxvalue);
		inputMap.put("xybm", this.xybm);
		inputMap.put("sectionschemano", this.sectionschemano);
	}
}
