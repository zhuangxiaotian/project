package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 扣款结果通知(后台模式) (T030)
 */
public class T030Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 通知类型,0：首次通知扣款结果;1：修改扣款结果。不传按首次通知处理
	 */
	private String notifytype = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 扣款金额,
	 */
	private String applysum = "";
	
	/**
	 * 银行帐号,
	 */
	private String bankacco = "";
	
	/**
	 * 网银错误代码,
	 */
	private String bankerrorcode = "";
	
	/**
	 * 网银日期,
	 */
	private String banknetdate = "";
	
	/**
	 * 网银时间,
	 */
	private String banknettime = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 批次号,
	 */
	private String batchno = "";
	
	/**
	 * 资金方式前缀,
	 */
	private String capitalmodePrefix = "";
	
	/**
	 * 通讯错误原因,
	 */
	private String commerrormsg = "";
	
	/**
	 * 通讯错误码,
	 */
	private String commerrorno = "";
	
	/**
	 * 银联错误代码,
	 */
	private String cperrorcode = "";
	
	/**
	 * 银联错误原因,
	 */
	private String cperrormsg = "";
	
	/**
	 * 错误原因,
	 */
	private String cwyy = "";
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 对方流水号,
	 */
	private String otherserialno = "";
	
	/**
	 * 交易帐号,
	 */
	private String tradeacco = "";
	
	/**
	 * 转账费,
	 */
	private String transferfee = "";
	
	/**
	 * 资金方式,超级现金宝资金方式：d
	 */
	private String capitalmode = "";
	
	/**
	 * 银联错误标志,0：失败，1：成功
	 */
	private String cpflag = "";
	
	/**
	 * 资金流水号,修改确认状态必传
	 */
	private String capitalserial = "";
	
	/**
	 * 确认标志,修改确认状态必传。4成功， 5划款失败 , 1-划款成功（调帐）； 6-更新划款流水备注和通讯错误码但不更新扣款状态 3-快速赎回拆笔流水网上交易发起划款前通知中间状态 2-待划款(传2时资金流水号字段传赎回申请的申请编号，目前只对000000340001来源才支持)
	 */
	private String confirmflag = "";
	
	/**
	 * 交易来源,notifytype=0时有效，无密码通知扣款结果必传(需配置系统参数"允许无密交易的交易来源")
	 */
	private String comefrom = "";
	
	/**
	 * 划款日期,notifytype=1时有效
	 */
	private String transferdate = "";
	
	/**
	 * 交易密码,该入参已经弃用
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public T030Input() {
		this.setFunction("T030");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 通知类型,0：首次通知扣款结果;1：修改扣款结果。不传按首次通知处理
	 */
	public String getNotifytype() {
		return this.notifytype;
	}
	
	/**
	 * 通知类型,0：首次通知扣款结果;1：修改扣款结果。不传按首次通知处理
	 */
	public void setNotifytype(String value)
	 {
		this.notifytype = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 扣款金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 扣款金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 银行帐号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行帐号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 网银错误代码,
	 */
	public String getBankerrorcode() {
		return this.bankerrorcode;
	}
	
	/**
	 * 网银错误代码,
	 */
	public void setBankerrorcode(String value)
	 {
		this.bankerrorcode = value;
	}
	
	/**
	 * 网银日期,
	 */
	public String getBanknetdate() {
		return this.banknetdate;
	}
	
	/**
	 * 网银日期,
	 */
	public void setBanknetdate(String value)
	 {
		this.banknetdate = value;
	}
	
	/**
	 * 网银时间,
	 */
	public String getBanknettime() {
		return this.banknettime;
	}
	
	/**
	 * 网银时间,
	 */
	public void setBanknettime(String value)
	 {
		this.banknettime = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 批次号,
	 */
	public String getBatchno() {
		return this.batchno;
	}
	
	/**
	 * 批次号,
	 */
	public void setBatchno(String value)
	 {
		this.batchno = value;
	}
	
	/**
	 * 资金方式前缀,
	 */
	public String getCapitalmodePrefix() {
		return this.capitalmodePrefix;
	}
	
	/**
	 * 资金方式前缀,
	 */
	public void setCapitalmodePrefix(String value)
	 {
		this.capitalmodePrefix = value;
	}
	
	/**
	 * 通讯错误原因,
	 */
	public String getCommerrormsg() {
		return this.commerrormsg;
	}
	
	/**
	 * 通讯错误原因,
	 */
	public void setCommerrormsg(String value)
	 {
		this.commerrormsg = value;
	}
	
	/**
	 * 通讯错误码,
	 */
	public String getCommerrorno() {
		return this.commerrorno;
	}
	
	/**
	 * 通讯错误码,
	 */
	public void setCommerrorno(String value)
	 {
		this.commerrorno = value;
	}
	
	/**
	 * 银联错误代码,
	 */
	public String getCperrorcode() {
		return this.cperrorcode;
	}
	
	/**
	 * 银联错误代码,
	 */
	public void setCperrorcode(String value)
	 {
		this.cperrorcode = value;
	}
	
	/**
	 * 银联错误原因,
	 */
	public String getCperrormsg() {
		return this.cperrormsg;
	}
	
	/**
	 * 银联错误原因,
	 */
	public void setCperrormsg(String value)
	 {
		this.cperrormsg = value;
	}
	
	/**
	 * 错误原因,
	 */
	public String getCwyy() {
		return this.cwyy;
	}
	
	/**
	 * 错误原因,
	 */
	public void setCwyy(String value)
	 {
		this.cwyy = value;
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
	 * 对方流水号,
	 */
	public String getOtherserialno() {
		return this.otherserialno;
	}
	
	/**
	 * 对方流水号,
	 */
	public void setOtherserialno(String value)
	 {
		this.otherserialno = value;
	}
	
	/**
	 * 交易帐号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易帐号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 转账费,
	 */
	public String getTransferfee() {
		return this.transferfee;
	}
	
	/**
	 * 转账费,
	 */
	public void setTransferfee(String value)
	 {
		this.transferfee = value;
	}
	
	/**
	 * 资金方式,超级现金宝资金方式：d
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,超级现金宝资金方式：d
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银联错误标志,0：失败，1：成功
	 */
	public String getCpflag() {
		return this.cpflag;
	}
	
	/**
	 * 银联错误标志,0：失败，1：成功
	 */
	public void setCpflag(String value)
	 {
		this.cpflag = value;
	}
	
	/**
	 * 资金流水号,修改确认状态必传
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水号,修改确认状态必传
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
	}
	
	/**
	 * 确认标志,修改确认状态必传。4成功， 5划款失败 , 1-划款成功（调帐）； 6-更新划款流水备注和通讯错误码但不更新扣款状态 3-快速赎回拆笔流水网上交易发起划款前通知中间状态 2-待划款(传2时资金流水号字段传赎回申请的申请编号，目前只对000000340001来源才支持)
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,修改确认状态必传。4成功， 5划款失败 , 1-划款成功（调帐）； 6-更新划款流水备注和通讯错误码但不更新扣款状态 3-快速赎回拆笔流水网上交易发起划款前通知中间状态 2-待划款(传2时资金流水号字段传赎回申请的申请编号，目前只对000000340001来源才支持)
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 交易来源,notifytype=0时有效，无密码通知扣款结果必传(需配置系统参数"允许无密交易的交易来源")
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,notifytype=0时有效，无密码通知扣款结果必传(需配置系统参数"允许无密交易的交易来源")
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 划款日期,notifytype=1时有效
	 */
	public String getTransferdate() {
		return this.transferdate;
	}
	
	/**
	 * 划款日期,notifytype=1时有效
	 */
	public void setTransferdate(String value)
	 {
		this.transferdate = value;
	}
	
	/**
	 * 交易密码,该入参已经弃用
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,该入参已经弃用
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("notifytype", this.notifytype);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("applysum", this.applysum);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("bankerrorcode", this.bankerrorcode);
		inputMap.put("banknetdate", this.banknetdate);
		inputMap.put("banknettime", this.banknettime);
		inputMap.put("bankserial", this.bankserial);
		inputMap.put("batchno", this.batchno);
		inputMap.put("capitalmodePrefix", this.capitalmodePrefix);
		inputMap.put("commerrormsg", this.commerrormsg);
		inputMap.put("commerrorno", this.commerrorno);
		inputMap.put("cperrorcode", this.cperrorcode);
		inputMap.put("cperrormsg", this.cperrormsg);
		inputMap.put("cwyy", this.cwyy);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("otherserialno", this.otherserialno);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("transferfee", this.transferfee);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("cpflag", this.cpflag);
		inputMap.put("capitalserial", this.capitalserial);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("transferdate", this.transferdate);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
