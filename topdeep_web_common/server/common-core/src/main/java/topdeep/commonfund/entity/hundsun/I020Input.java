package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投首次交易日期查询(I020)
 */
public class I020Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	private String cycleunit;
	
	/**
	 * 转出基金代码,调用I017返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五)
	 */
	private String jyrq = "";
	
	/**
	 * 交易账号,调用I016返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法)
	 */
	private String exptype = "";
	
	/**
	 * 协议号,
	 */
	private String xyh = "";
	
	/**
	 * 初始化参数
	 */
	public I020Input() {
		this.setFunction("I020");
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
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五)
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五)
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易账号,调用I016返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用I016返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法)
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法)
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("exptype", this.exptype);
		inputMap.put("xyh", this.xyh);
	}
}
