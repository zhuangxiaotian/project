package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 记录操作日志(P009)
 */
public class P009Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 金额,
	 */
	private String balance = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 错误信息,
	 */
	private String exceptionmessage = "";
	
	/**
	 * 浏览器,
	 */
	private String explorer = "";
	
	/**
	 * 服务编号,
	 */
	private String functionno = "";
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金风险等级,
	 */
	private String fundrisk = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * ip地址,
	 */
	private String ipaddr = "";
	
	/**
	 * 是否出错,
	 */
	private String isexception = "";
	
	/**
	 * 物理地址,
	 */
	private String mac = "";
	
	/**
	 * 机器类型,
	 */
	private String machine = "";
	
	/**
	 * 操作日期,
	 */
	private String opdate = "";
	
	/**
	 * 操作时间,
	 */
	private String optime = "";
	
	/**
	 * 操作类型例,
	 */
	private String optype = "";
	
	/**
	 * 操作系统,
	 */
	private String os = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 户风险等级,
	 */
	private String riskability = "";
	
	/**
	 * 服务端ip,
	 */
	private String serverip = "";
	
	/**
	 * 服务名称例,
	 */
	private String servicename = "";
	
	/**
	 * 内容例,
	 */
	private String summary = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public P009Input() {
		this.setFunction("P009");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 金额,
	 */
	public String getBalance() {
		return this.balance;
	}
	
	/**
	 * 金额,
	 */
	public void setBalance(String value)
	 {
		this.balance = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 错误信息,
	 */
	public String getExceptionmessage() {
		return this.exceptionmessage;
	}
	
	/**
	 * 错误信息,
	 */
	public void setExceptionmessage(String value)
	 {
		this.exceptionmessage = value;
	}
	
	/**
	 * 浏览器,
	 */
	public String getExplorer() {
		return this.explorer;
	}
	
	/**
	 * 浏览器,
	 */
	public void setExplorer(String value)
	 {
		this.explorer = value;
	}
	
	/**
	 * 服务编号,
	 */
	public String getFunctionno() {
		return this.functionno;
	}
	
	/**
	 * 服务编号,
	 */
	public void setFunctionno(String value)
	 {
		this.functionno = value;
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金风险等级,
	 */
	public String getFundrisk() {
		return this.fundrisk;
	}
	
	/**
	 * 基金风险等级,
	 */
	public void setFundrisk(String value)
	 {
		this.fundrisk = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * ip地址,
	 */
	public String getIpaddr() {
		return this.ipaddr;
	}
	
	/**
	 * ip地址,
	 */
	public void setIpaddr(String value)
	 {
		this.ipaddr = value;
	}
	
	/**
	 * 是否出错,
	 */
	public String getIsexception() {
		return this.isexception;
	}
	
	/**
	 * 是否出错,
	 */
	public void setIsexception(String value)
	 {
		this.isexception = value;
	}
	
	/**
	 * 物理地址,
	 */
	public String getMac() {
		return this.mac;
	}
	
	/**
	 * 物理地址,
	 */
	public void setMac(String value)
	 {
		this.mac = value;
	}
	
	/**
	 * 机器类型,
	 */
	public String getMachine() {
		return this.machine;
	}
	
	/**
	 * 机器类型,
	 */
	public void setMachine(String value)
	 {
		this.machine = value;
	}
	
	/**
	 * 操作日期,
	 */
	public String getOpdate() {
		return this.opdate;
	}
	
	/**
	 * 操作日期,
	 */
	public void setOpdate(String value)
	 {
		this.opdate = value;
	}
	
	/**
	 * 操作时间,
	 */
	public String getOptime() {
		return this.optime;
	}
	
	/**
	 * 操作时间,
	 */
	public void setOptime(String value)
	 {
		this.optime = value;
	}
	
	/**
	 * 操作类型例,
	 */
	public String getOptype() {
		return this.optype;
	}
	
	/**
	 * 操作类型例,
	 */
	public void setOptype(String value)
	 {
		this.optype = value;
	}
	
	/**
	 * 操作系统,
	 */
	public String getOs() {
		return this.os;
	}
	
	/**
	 * 操作系统,
	 */
	public void setOs(String value)
	 {
		this.os = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 户风险等级,
	 */
	public String getRiskability() {
		return this.riskability;
	}
	
	/**
	 * 户风险等级,
	 */
	public void setRiskability(String value)
	 {
		this.riskability = value;
	}
	
	/**
	 * 服务端ip,
	 */
	public String getServerip() {
		return this.serverip;
	}
	
	/**
	 * 服务端ip,
	 */
	public void setServerip(String value)
	 {
		this.serverip = value;
	}
	
	/**
	 * 服务名称例,
	 */
	public String getServicename() {
		return this.servicename;
	}
	
	/**
	 * 服务名称例,
	 */
	public void setServicename(String value)
	 {
		this.servicename = value;
	}
	
	/**
	 * 内容例,
	 */
	public String getSummary() {
		return this.summary;
	}
	
	/**
	 * 内容例,
	 */
	public void setSummary(String value)
	 {
		this.summary = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("balance", this.balance);
		inputMap.put("businflag", this.businflag);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("custno", this.custno);
		inputMap.put("exceptionmessage", this.exceptionmessage);
		inputMap.put("explorer", this.explorer);
		inputMap.put("functionno", this.functionno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundrisk", this.fundrisk);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("ipaddr", this.ipaddr);
		inputMap.put("isexception", this.isexception);
		inputMap.put("mac", this.mac);
		inputMap.put("machine", this.machine);
		inputMap.put("opdate", this.opdate);
		inputMap.put("optime", this.optime);
		inputMap.put("optype", this.optype);
		inputMap.put("os", this.os);
		inputMap.put("requestno", this.requestno);
		inputMap.put("riskability", this.riskability);
		inputMap.put("serverip", this.serverip);
		inputMap.put("servicename", this.servicename);
		inputMap.put("summary", this.summary);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
