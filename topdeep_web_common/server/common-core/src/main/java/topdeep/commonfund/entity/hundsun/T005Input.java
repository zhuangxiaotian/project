package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转换目标基金列表(T005)
 */
public class T005Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,020:返回转认购目标基金列表;022:返回转申购目标基金列表;036:返回转换目标基金列表;空:返回所有可转换、转购的目标基金列表
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	private String fundacco = "";
	
	/**
	 * 证件号,证件号
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,证件类型，查看字典
	 */
	private String identitytype = "";
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户，其他不过滤
	 */
	private String isfilterspecialfund = "";
	
	/**
	 * 初始化参数
	 */
	public T005Input() {
		this.setFunction("T005");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 基金代码,调用S001查询到的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 证件号,证件号
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,证件号
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,证件类型，查看字典
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,证件类型，查看字典
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户，其他不过滤
	 */
	public String getIsfilterspecialfund() {
		return this.isfilterspecialfund;
	}
	
	/**
	 * 是否过滤专户基金,1：过滤掉专户，其他不过滤
	 */
	public void setIsfilterspecialfund(String value)
	 {
		this.isfilterspecialfund = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("isfilterspecialfund", this.isfilterspecialfund);
	}
}
