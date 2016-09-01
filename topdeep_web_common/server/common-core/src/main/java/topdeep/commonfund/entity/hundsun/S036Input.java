package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 错误日志事件查询(S036)
 */
public class S036Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 结束时间,格式为yyyyMMddHHmmss
	 */
	private String enddate = "";
	
	/**
	 * 错误分类,如果查询多个，以逗号隔开
	 */
	private String errorKind = "";
	
	/**
	 * 错误级别,如果查询多个，以逗号隔开，值可以为DEBUG，INFO，WARN，ERROR，FATAL
	 */
	private String errorLevel = "";
	
	/**
	 * 错误类型,如果查询多个，以逗号隔开
	 */
	private String errorType = "";
	
	/**
	 * 序号,查询多个序号已，号分隔
	 */
	private String logSeq = "";
	
	/**
	 * 模块名称,如果查询多个，以逗号隔开
	 */
	private String module = "";
	
	/**
	 * 操作类型,
	 */
	private String opType = "";
	
	/**
	 * 发生错误的关联系统,如果查询多个，以逗号隔开，值可以为DS,DC,WEBSITE,ABC,CHINAPNR,YEEPAY,ALLINPAY,PUBLIC
	 */
	private String otherSys = "";
	
	/**
	 * 当前页,
	 */
	private String pageno = "";
	
	/**
	 * 每页显示记录数,
	 */
	private String pagesize = "";
	
	/**
	 * 起始时间,格式为yyyyMMddHHmmss
	 */
	private String startDate = "";
	
	/**
	 * 错误发生的系统,如果查询多个，以逗号隔开，值可以为PUBLIC，WEB，ORG，WAP，MOBILE，TRUST,COMM,SCAN等
	 */
	private String sys = "";
	
	/**
	 * 初始化参数
	 */
	public S036Input() {
		this.setFunction("S036");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 结束时间,格式为yyyyMMddHHmmss
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束时间,格式为yyyyMMddHHmmss
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 错误分类,如果查询多个，以逗号隔开
	 */
	public String getErrorKind() {
		return this.errorKind;
	}
	
	/**
	 * 错误分类,如果查询多个，以逗号隔开
	 */
	public void setErrorKind(String value)
	 {
		this.errorKind = value;
	}
	
	/**
	 * 错误级别,如果查询多个，以逗号隔开，值可以为DEBUG，INFO，WARN，ERROR，FATAL
	 */
	public String getErrorLevel() {
		return this.errorLevel;
	}
	
	/**
	 * 错误级别,如果查询多个，以逗号隔开，值可以为DEBUG，INFO，WARN，ERROR，FATAL
	 */
	public void setErrorLevel(String value)
	 {
		this.errorLevel = value;
	}
	
	/**
	 * 错误类型,如果查询多个，以逗号隔开
	 */
	public String getErrorType() {
		return this.errorType;
	}
	
	/**
	 * 错误类型,如果查询多个，以逗号隔开
	 */
	public void setErrorType(String value)
	 {
		this.errorType = value;
	}
	
	/**
	 * 序号,查询多个序号已，号分隔
	 */
	public String getLogSeq() {
		return this.logSeq;
	}
	
	/**
	 * 序号,查询多个序号已，号分隔
	 */
	public void setLogSeq(String value)
	 {
		this.logSeq = value;
	}
	
	/**
	 * 模块名称,如果查询多个，以逗号隔开
	 */
	public String getModule() {
		return this.module;
	}
	
	/**
	 * 模块名称,如果查询多个，以逗号隔开
	 */
	public void setModule(String value)
	 {
		this.module = value;
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
	 * 发生错误的关联系统,如果查询多个，以逗号隔开，值可以为DS,DC,WEBSITE,ABC,CHINAPNR,YEEPAY,ALLINPAY,PUBLIC
	 */
	public String getOtherSys() {
		return this.otherSys;
	}
	
	/**
	 * 发生错误的关联系统,如果查询多个，以逗号隔开，值可以为DS,DC,WEBSITE,ABC,CHINAPNR,YEEPAY,ALLINPAY,PUBLIC
	 */
	public void setOtherSys(String value)
	 {
		this.otherSys = value;
	}
	
	/**
	 * 当前页,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 每页显示记录数,
	 */
	public String getPagesize() {
		return this.pagesize;
	}
	
	/**
	 * 每页显示记录数,
	 */
	public void setPagesize(String value)
	 {
		this.pagesize = value;
	}
	
	/**
	 * 起始时间,格式为yyyyMMddHHmmss
	 */
	public String getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 起始时间,格式为yyyyMMddHHmmss
	 */
	public void setStartDate(String value)
	 {
		this.startDate = value;
	}
	
	/**
	 * 错误发生的系统,如果查询多个，以逗号隔开，值可以为PUBLIC，WEB，ORG，WAP，MOBILE，TRUST,COMM,SCAN等
	 */
	public String getSys() {
		return this.sys;
	}
	
	/**
	 * 错误发生的系统,如果查询多个，以逗号隔开，值可以为PUBLIC，WEB，ORG，WAP，MOBILE，TRUST,COMM,SCAN等
	 */
	public void setSys(String value)
	 {
		this.sys = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddate", this.enddate);
		inputMap.put("errorKind", this.errorKind);
		inputMap.put("errorLevel", this.errorLevel);
		inputMap.put("errorType", this.errorType);
		inputMap.put("logSeq", this.logSeq);
		inputMap.put("module", this.module);
		inputMap.put("opType", this.opType);
		inputMap.put("otherSys", this.otherSys);
		inputMap.put("pageno", this.pageno);
		inputMap.put("pagesize", this.pagesize);
		inputMap.put("startDate", this.startDate);
		inputMap.put("sys", this.sys);
	}
}
