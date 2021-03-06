package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 份额解冻(T026)
 */
public class T026Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 原申请编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 业务大类,现金宝：01；超级现金宝02
	 */
	private String busintype = "";
	
	/**
	 * 银商流水号,
	 */
	private String chinapayserialno = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixbusinflag = "";
	
	/**
	 * 申请份额,
	 */
	private String requestshare = "";
	
	/**
	 * 初始化参数
	 */
	public T026Input() {
		this.setFunction("T026");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 原申请编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	
	/**
	 * 业务大类,现金宝：01；超级现金宝02
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝：01；超级现金宝02
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 银商流水号,
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 银商流水号,
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("originalapplyserial", this.originalapplyserial);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("busintype", this.busintype);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("requestshare", this.requestshare);
	}
}
