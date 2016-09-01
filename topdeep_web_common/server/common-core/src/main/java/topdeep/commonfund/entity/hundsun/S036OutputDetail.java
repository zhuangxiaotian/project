package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 错误日志事件查询(S036)功能输出明细参数
 */
public class S036OutputDetail extends Object implements Serializable {
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 错误代码,
	 */
	private String errorcode = "";
	
	/**
	 * 错误分类,
	 */
	private String errorKind = "";
	
	/**
	 * 错误级别,
	 */
	private String errorLevel = "";
	
	/**
	 * 错误类型,
	 */
	private String errorType = "";
	
	/**
	 * 网上交易业务标志,
	 */
	private String etsBusinflag = "";
	
	/**
	 * 错误日志堆栈,
	 */
	private String exceptionMessage = "";
	
	/**
	 * 客户端浏览器,
	 */
	private String explorer = "";
	
	/**
	 * 服务编号,
	 */
	private String functionNo = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "";
	
	/**
	 * 客户端ip,
	 */
	private String ipAddr = "";
	
	/**
	 * 序号,
	 */
	private String logSeq = "";
	
	/**
	 * 客户端MAC地址,
	 */
	private String mac = "";
	
	/**
	 * 客户端机器名,
	 */
	private String machine = "";
	
	/**
	 * 模块名称,
	 */
	private String module = "";
	
	/**
	 * 错误发生的日期时间,
	 */
	private String optDate = "";
	
	/**
	 * 操作类型,
	 */
	private String opType = "";
	
	/**
	 * 客户端操作系统,
	 */
	private String os = "";
	
	/**
	 * 发生错误的关联系统,
	 */
	private String otherSys = "";
	
	/**
	 * 会话跟踪日志,
	 */
	private String pkgId = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 根日志序号,
	 */
	private String rootLogSeq = "";
	
	/**
	 * 服务端ip,
	 */
	private String serverIp = "";
	
	/**
	 * 服务名称,
	 */
	private String serviceName = "";
	
	/**
	 * 简要错误描述,
	 */
	private String summary = "";
	
	/**
	 * 错误发生的系统,
	 */
	private String sys = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
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
	 * 错误代码,
	 */
	public String getErrorcode() {
		return this.errorcode;
	}
	
	/**
	 * 错误代码,
	 */
	public void setErrorcode(String value)
	 {
		this.errorcode = value;
	}
	
	/**
	 * 错误分类,
	 */
	public String getErrorKind() {
		return this.errorKind;
	}
	
	/**
	 * 错误分类,
	 */
	public void setErrorKind(String value)
	 {
		this.errorKind = value;
	}
	
	/**
	 * 错误级别,
	 */
	public String getErrorLevel() {
		return this.errorLevel;
	}
	
	/**
	 * 错误级别,
	 */
	public void setErrorLevel(String value)
	 {
		this.errorLevel = value;
	}
	
	/**
	 * 错误类型,
	 */
	public String getErrorType() {
		return this.errorType;
	}
	
	/**
	 * 错误类型,
	 */
	public void setErrorType(String value)
	 {
		this.errorType = value;
	}
	
	/**
	 * 网上交易业务标志,
	 */
	public String getEtsBusinflag() {
		return this.etsBusinflag;
	}
	
	/**
	 * 网上交易业务标志,
	 */
	public void setEtsBusinflag(String value)
	 {
		this.etsBusinflag = value;
	}
	
	/**
	 * 错误日志堆栈,
	 */
	public String getExceptionMessage() {
		return this.exceptionMessage;
	}
	
	/**
	 * 错误日志堆栈,
	 */
	public void setExceptionMessage(String value)
	 {
		this.exceptionMessage = value;
	}
	
	/**
	 * 客户端浏览器,
	 */
	public String getExplorer() {
		return this.explorer;
	}
	
	/**
	 * 客户端浏览器,
	 */
	public void setExplorer(String value)
	 {
		this.explorer = value;
	}
	
	/**
	 * 服务编号,
	 */
	public String getFunctionNo() {
		return this.functionNo;
	}
	
	/**
	 * 服务编号,
	 */
	public void setFunctionNo(String value)
	 {
		this.functionNo = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 客户端ip,
	 */
	public String getIpAddr() {
		return this.ipAddr;
	}
	
	/**
	 * 客户端ip,
	 */
	public void setIpAddr(String value)
	 {
		this.ipAddr = value;
	}
	
	/**
	 * 序号,
	 */
	public String getLogSeq() {
		return this.logSeq;
	}
	
	/**
	 * 序号,
	 */
	public void setLogSeq(String value)
	 {
		this.logSeq = value;
	}
	
	/**
	 * 客户端MAC地址,
	 */
	public String getMac() {
		return this.mac;
	}
	
	/**
	 * 客户端MAC地址,
	 */
	public void setMac(String value)
	 {
		this.mac = value;
	}
	
	/**
	 * 客户端机器名,
	 */
	public String getMachine() {
		return this.machine;
	}
	
	/**
	 * 客户端机器名,
	 */
	public void setMachine(String value)
	 {
		this.machine = value;
	}
	
	/**
	 * 模块名称,
	 */
	public String getModule() {
		return this.module;
	}
	
	/**
	 * 模块名称,
	 */
	public void setModule(String value)
	 {
		this.module = value;
	}
	
	/**
	 * 错误发生的日期时间,
	 */
	public String getOptDate() {
		return this.optDate;
	}
	
	/**
	 * 错误发生的日期时间,
	 */
	public void setOptDate(String value)
	 {
		this.optDate = value;
	}
	
	/**
	 * 操作类型,
	 */
	public String getOpType() {
		return this.opType;
	}
	
	/**
	 * 操作类型,
	 */
	public void setOpType(String value)
	 {
		this.opType = value;
	}
	
	/**
	 * 客户端操作系统,
	 */
	public String getOs() {
		return this.os;
	}
	
	/**
	 * 客户端操作系统,
	 */
	public void setOs(String value)
	 {
		this.os = value;
	}
	
	/**
	 * 发生错误的关联系统,
	 */
	public String getOtherSys() {
		return this.otherSys;
	}
	
	/**
	 * 发生错误的关联系统,
	 */
	public void setOtherSys(String value)
	 {
		this.otherSys = value;
	}
	
	/**
	 * 会话跟踪日志,
	 */
	public String getPkgId() {
		return this.pkgId;
	}
	
	/**
	 * 会话跟踪日志,
	 */
	public void setPkgId(String value)
	 {
		this.pkgId = value;
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
	 * 根日志序号,
	 */
	public String getRootLogSeq() {
		return this.rootLogSeq;
	}
	
	/**
	 * 根日志序号,
	 */
	public void setRootLogSeq(String value)
	 {
		this.rootLogSeq = value;
	}
	
	/**
	 * 服务端ip,
	 */
	public String getServerIp() {
		return this.serverIp;
	}
	
	/**
	 * 服务端ip,
	 */
	public void setServerIp(String value)
	 {
		this.serverIp = value;
	}
	
	/**
	 * 服务名称,
	 */
	public String getServiceName() {
		return this.serviceName;
	}
	
	/**
	 * 服务名称,
	 */
	public void setServiceName(String value)
	 {
		this.serviceName = value;
	}
	
	/**
	 * 简要错误描述,
	 */
	public String getSummary() {
		return this.summary;
	}
	
	/**
	 * 简要错误描述,
	 */
	public void setSummary(String value)
	 {
		this.summary = value;
	}
	
	/**
	 * 错误发生的系统,
	 */
	public String getSys() {
		return this.sys;
	}
	
	/**
	 * 错误发生的系统,
	 */
	public void setSys(String value)
	 {
		this.sys = value;
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
}
