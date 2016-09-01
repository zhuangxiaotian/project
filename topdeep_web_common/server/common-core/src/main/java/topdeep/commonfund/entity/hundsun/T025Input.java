package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 份额冻结(T025)
 */
public class T025Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 解冻份额,
	 */
	private String applyshare = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,取字典“份额类别”
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 冻结原因,
	 */
	private String cause = "";
	
	/**
	 * 业务大类,现金宝：01；超级现金宝：02
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
	 * 解冻日期,格式：yyyyMMdd
	 */
	private String unfrozendate = "";
	
	/**
	 * 初始化参数
	 */
	public T025Input() {
		this.setFunction("T025");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 解冻份额,
	 */
	public String getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 解冻份额,
	 */
	public void setApplyshare(String value)
	 {
		this.applyshare = value;
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
	 * 冻结原因,
	 */
	public String getCause() {
		return this.cause;
	}
	
	/**
	 * 冻结原因,
	 */
	public void setCause(String value)
	 {
		this.cause = value;
	}
	
	/**
	 * 业务大类,现金宝：01；超级现金宝：02
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝：01；超级现金宝：02
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
	 * 解冻日期,格式：yyyyMMdd
	 */
	public String getUnfrozendate() {
		return this.unfrozendate;
	}
	
	/**
	 * 解冻日期,格式：yyyyMMdd
	 */
	public void setUnfrozendate(String value)
	 {
		this.unfrozendate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyshare", this.applyshare);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("cause", this.cause);
		inputMap.put("busintype", this.busintype);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("unfrozendate", this.unfrozendate);
	}
}
