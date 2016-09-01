package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转换来源基金列表(T027)
 */
public class T027Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,转换目标基金代码
	 */
	private String fundcode = "";
	
	/**
	 * 业务代码,020:返回转认购目标基金列表;022:返回转申购目标基金列表;036:返回转换目标基金列表;空:返回所有可转换、转购的目标基金列表
	 */
	private String businflag = "";
	
	/**
	 * 基金账号,暂不支持
	 */
	private String fundacco = "";
	
	/**
	 * 收费方式,（暂不支持）转换目标基金收费方式
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,暂不支持
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public T027Input() {
		this.setFunction("T027");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,转换目标基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,转换目标基金代码
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 业务代码,020:返回转认购目标基金列表;022:返回转申购目标基金列表;036:返回转换目标基金列表;空:返回所有可转换、转购的目标基金列表
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:返回转认购目标基金列表;022:返回转申购目标基金列表;036:返回转换目标基金列表;空:返回所有可转换、转购的目标基金列表
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金账号,暂不支持
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,暂不支持
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 收费方式,（暂不支持）转换目标基金收费方式
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,（暂不支持）转换目标基金收费方式
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,暂不支持
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,暂不支持
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
