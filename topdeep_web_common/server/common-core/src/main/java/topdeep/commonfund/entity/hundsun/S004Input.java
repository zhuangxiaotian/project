package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易确认查询(S004)
 */
public class S004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private String applyrecordno = "";
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	private String querydeclarevaluavgr = "";
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	private String queryredeemtranflag = "";
	
	/**
	 * 起始日期,如20101231
	 */
	private String startdate = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 定投协议号,
	 */
	private String xyh = "";
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	private String agencytype = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 业务代码,取字典“查询确认业务类别”信用卡还款：业务代码类型095信用卡记录查询还款只有查直销才有效
	 */
	private String callingcode = "";
	
	/**
	 * 指数类型,信用卡还款：指数类型14 信用卡记录查询还款只有查直销才有效
	 */
	private String exptype = "";
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	private String querytype = "";
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	private String datasource = "";
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段0：普通基金；1：专户基金
	 */
	private String fundsubtype = "";
	
	/**
	 * 交易来源,查话费宝时必传
	 */
	private String comefrom = "";
	
	/**
	 * 话费宝标识,查话费宝时必传
	 */
	private String protocolflag = "";
	
	/**
	 * 确认编号,该字段修正为确认编号
	 */
	private String applyserial = "";
	
	/**
	 * 申请编号,申请表的申请编号
	 */
	private String requestno = "";
	
	/**
	 * 证件号码,支持非登录调用
	 */
	private String identityno = "";
	
	/**
	 * 审核标志,0-未审核；1-审核通过；2-无密码确认有效；4-审核无效
	 */
	private String custconfirm = "";
	
	/**
	 * 子账户审核员编号,子账户审核员编号
	 */
	private String subaccoauditno = "";
	
	/**
	 * 子账户编号,子账户编号
	 */
	private String subacconoeq = "";
	
	/**
	 * 子账户编号不等于,子账户编号不等于
	 */
	private String subaccononeq = "";
	
	/**
	 * 子账户权限,子账户权限： subquery=查询，subcheck=审核，subtrade=交易
	 */
	private String subaccoright = "";
	
	/**
	 * 确认标志不等于,
	 */
	private String confirmflagneq;
	
	/**
	 * 资金方式,需升级到92号（交易确认）或以上
	 */
	private String capitalmode = "";
	
	/**
	 * 确认状态,
	 */
	private String confirmflag = "";
	
	/**
	 * 备注,数据源为DC（数据中心）时有效
	 */
	private String memo = "";
	
	/**
	 * 初始化参数
	 */
	public S004Input() {
		this.setFunction("S004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
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
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public String getQuerydeclarevaluavgr() {
		return this.querydeclarevaluavgr;
	}
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public void setQuerydeclarevaluavgr(String value)
	 {
		this.querydeclarevaluavgr = value;
	}
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public String getQueryredeemtranflag() {
		return this.queryredeemtranflag;
	}
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public void setQueryredeemtranflag(String value)
	 {
		this.queryredeemtranflag = value;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
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
	
	/**
	 * 定投协议号,
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 定投协议号,
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public String getAgencytype() {
		return this.agencytype;
	}
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	public void setAgencytype(String value)
	 {
		this.agencytype = value;
	}
	
	/**
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 组合申请编号,
	 */
	public String getCombrequestno() {
		return this.combrequestno;
	}
	
	/**
	 * 组合申请编号,
	 */
	public void setCombrequestno(String value)
	 {
		this.combrequestno = value;
	}
	
	/**
	 * 业务代码,取字典“查询确认业务类别”信用卡还款：业务代码类型095信用卡记录查询还款只有查直销才有效
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,取字典“查询确认业务类别”信用卡还款：业务代码类型095信用卡记录查询还款只有查直销才有效
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 指数类型,信用卡还款：指数类型14 信用卡记录查询还款只有查直销才有效
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,信用卡还款：指数类型14 信用卡记录查询还款只有查直销才有效
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,2:专户基金，其他:默认方式查询
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS：直销，DC：数据中心
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段0：普通基金；1：专户基金
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段0：普通基金；1：专户基金
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 交易来源,查话费宝时必传
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,查话费宝时必传
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 话费宝标识,查话费宝时必传
	 */
	public String getProtocolflag() {
		return this.protocolflag;
	}
	
	/**
	 * 话费宝标识,查话费宝时必传
	 */
	public void setProtocolflag(String value)
	 {
		this.protocolflag = value;
	}
	
	/**
	 * 确认编号,该字段修正为确认编号
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 确认编号,该字段修正为确认编号
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 申请编号,申请表的申请编号
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,申请表的申请编号
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 证件号码,支持非登录调用
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,支持非登录调用
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 审核标志,0-未审核；1-审核通过；2-无密码确认有效；4-审核无效
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 审核标志,0-未审核；1-审核通过；2-无密码确认有效；4-审核无效
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
	}
	
	/**
	 * 子账户审核员编号,子账户审核员编号
	 */
	public String getSubaccoauditno() {
		return this.subaccoauditno;
	}
	
	/**
	 * 子账户审核员编号,子账户审核员编号
	 */
	public void setSubaccoauditno(String value)
	 {
		this.subaccoauditno = value;
	}
	
	/**
	 * 子账户编号,子账户编号
	 */
	public String getSubacconoeq() {
		return this.subacconoeq;
	}
	
	/**
	 * 子账户编号,子账户编号
	 */
	public void setSubacconoeq(String value)
	 {
		this.subacconoeq = value;
	}
	
	/**
	 * 子账户编号不等于,子账户编号不等于
	 */
	public String getSubaccononeq() {
		return this.subaccononeq;
	}
	
	/**
	 * 子账户编号不等于,子账户编号不等于
	 */
	public void setSubaccononeq(String value)
	 {
		this.subaccononeq = value;
	}
	
	/**
	 * 子账户权限,子账户权限： subquery=查询，subcheck=审核，subtrade=交易
	 */
	public String getSubaccoright() {
		return this.subaccoright;
	}
	
	/**
	 * 子账户权限,子账户权限： subquery=查询，subcheck=审核，subtrade=交易
	 */
	public void setSubaccoright(String value)
	 {
		this.subaccoright = value;
	}
	
	/**
	 * 确认标志不等于,
	 */
	public String getConfirmflagneq() {
		return this.confirmflagneq;
	}
	
	/**
	 * 确认标志不等于,
	 */
	public void setConfirmflagneq(String value)
	 {
		this.confirmflagneq = value;
	}
	
	/**
	 * 资金方式,需升级到92号（交易确认）或以上
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,需升级到92号（交易确认）或以上
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 确认状态,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认状态,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 备注,数据源为DC（数据中心）时有效
	 */
	public String getMemo() {
		return this.memo;
	}
	
	/**
	 * 备注,数据源为DC（数据中心）时有效
	 */
	public void setMemo(String value)
	 {
		this.memo = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("querydeclarevaluavgr", this.querydeclarevaluavgr);
		inputMap.put("queryredeemtranflag", this.queryredeemtranflag);
		inputMap.put("startdate", this.startdate);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("xyh", this.xyh);
		inputMap.put("agencytype", this.agencytype);
		inputMap.put("busintype", this.busintype);
		inputMap.put("combrequestno", this.combrequestno);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("exptype", this.exptype);
		inputMap.put("querytype", this.querytype);
		inputMap.put("datasource", this.datasource);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("fundsubtype", this.fundsubtype);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("protocolflag", this.protocolflag);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("requestno", this.requestno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("custconfirm", this.custconfirm);
		inputMap.put("subaccoauditno", this.subaccoauditno);
		inputMap.put("subacconoeq", this.subacconoeq);
		inputMap.put("subaccononeq", this.subaccononeq);
		inputMap.put("subaccoright", this.subaccoright);
		inputMap.put("confirmflagneq", this.confirmflagneq.toString());
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("memo", this.memo);
	}
}
