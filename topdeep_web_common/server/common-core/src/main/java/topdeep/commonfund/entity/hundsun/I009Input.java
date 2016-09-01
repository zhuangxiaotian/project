package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投转换协议变更(I009)
 */
public class I009Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	private String cycleunit;
	
	/**
	 * 交易日期,日期的后两位
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 交易账号,调用I005返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	private String xyh = "";
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	private String zzrq = "99991231";
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	private String state;
	
	/**
	 * 转换份额,
	 */
	private String applysum = "";
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"必填
	 */
	private String avgexptype = "";
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	private String diffscale = "";
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"必填
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
	 * 初始化参数
	 */
	public I009Input() {
		this.setFunction("I009");
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
	 * 交易账号,调用I005返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用I005返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 均线类型,取字典“均线类型”，exptype为"03"必填
	 */
	public String getAvgexptype() {
		return this.avgexptype;
	}
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"必填
	 */
	public void setAvgexptype(String value)
	 {
		this.avgexptype = value;
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
	 * 指数代码,取字典“指数代码”，exptype为"03"必填
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"必填
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("xyh", this.xyh);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("state", this.state.toString());
		inputMap.put("applysum", this.applysum);
		inputMap.put("avgexptype", this.avgexptype);
		inputMap.put("diffscale", this.diffscale);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("exptype", this.exptype);
		inputMap.put("maxsuccessnum", this.maxsuccessnum);
		inputMap.put("maxvalue", this.maxvalue);
		inputMap.put("xybm", this.xybm);
	}
}
