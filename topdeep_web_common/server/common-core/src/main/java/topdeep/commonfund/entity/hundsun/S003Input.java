package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易申请查询(S003)
 */
public class S003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private Integer applyrecordno;
	
	/**
	 * 理财平台流水号,宜投使用。
	 */
	private String chinapayserialno = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	private String callingcodenoeq = "";
	
	/**
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	private String callingcodenoteq = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 业务大类,现金宝业务传01
	 */
	private String busintype = "";
	
	/**
	 * 业务代码,取字典“查询业务类别”
	 */
	private String callingcode = "";
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	private String confirmflag = "";
	
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
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
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
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	private String agencyno = "";
	
	/**
	 * 渠道,D-直销；A-非直销；不传-全部
	 */
	private String agencytype = "";
	
	/**
	 * 组合申请编号,
	 */
	private String combrequestno = "";
	
	/**
	 * 源流水号,
	 */
	private String otherserialno = "";
	
	/**
	 * 定投协议号,
	 */
	private String xyh = "";
	
	/**
	 * 查询类型,
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
	 * 充值标志,万家基金使用（包含普通充值和基金公司到投资人的098）
	 */
	private String czflag = "";
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	private String fundsubtype = "";
	
	/**
	 * 在途标识,【未实现】1：在途，0：非在途，空：全部
	 */
	private String onlineflag = "";
	
	/**
	 * 下单起始日期,交易申请查询48号接口需升级为9B接口
	 */
	private String acceptdatebegin = "";
	
	/**
	 * 下单结束日期,交易申请查询48号接口需升级为9B接口
	 */
	private String acceptdateend = "";
	
	/**
	 * 业务大类不等于,交易申请查询48号接口需升级为9B接口
	 */
	private String unequalbusintype = "";
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	private String promotion = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 审核标志,0-未审核；1-审核通过；2-无密码确认有效；4-审核无效
	 */
	private String custconfirm = "";
	
	/**
	 * 审核标志不等于,
	 */
	private String custconfirmneq = "";
	
	/**
	 * 审核员编号,
	 */
	private String subaccoauditno = "";
	
	/**
	 * 下单子账户编号,下单子账户编号
	 */
	private String subacconoeq = "";
	
	/**
	 * 下单子账户编号不等于,下单子账户编号不等于
	 */
	private String subaccononeq = "";
	
	/**
	 * 子账户权限,子账户权限： subquery=查询，subcheck=审核，subtrade=交易
	 */
	private String subaccoright = "";
	
	/**
	 * 资金方式,升级到直销服务91号查询服务或以上
	 */
	private String capitalmode = "";
	
	/**
	 * 初始化参数
	 */
	public S003Input() {
		this.setFunction("S003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 理财平台流水号,宜投使用。
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,宜投使用。
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
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
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	public String getCallingcodenoeq() {
		return this.callingcodenoeq;
	}
	
	/**
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	public void setCallingcodenoeq(String value)
	 {
		this.callingcodenoeq = value;
	}
	
	/**
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	public String getCallingcodenoteq() {
		return this.callingcodenoteq;
	}
	
	/**
	 * 业务代码不等于,过滤某些业务代码的数据
	 */
	public void setCallingcodenoteq(String value)
	 {
		this.callingcodenoteq = value;
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
	 * 业务大类,现金宝业务传01
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝业务传01
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 业务代码,取字典“查询业务类别”
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,取字典“查询业务类别”
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,取字典“交易确认标志”
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
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
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商,当渠道参数agencytype为A时有效，参数值见字典《EQAgencyName》
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
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
	 * 源流水号,
	 */
	public String getOtherserialno() {
		return this.otherserialno;
	}
	
	/**
	 * 源流水号,
	 */
	public void setOtherserialno(String value)
	 {
		this.otherserialno = value;
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
	 * 查询类型,
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,
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
	 * 充值标志,万家基金使用（包含普通充值和基金公司到投资人的098）
	 */
	public String getCzflag() {
		return this.czflag;
	}
	
	/**
	 * 充值标志,万家基金使用（包含普通充值和基金公司到投资人的098）
	 */
	public void setCzflag(String value)
	 {
		this.czflag = value;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 在途标识,【未实现】1：在途，0：非在途，空：全部
	 */
	public String getOnlineflag() {
		return this.onlineflag;
	}
	
	/**
	 * 在途标识,【未实现】1：在途，0：非在途，空：全部
	 */
	public void setOnlineflag(String value)
	 {
		this.onlineflag = value;
	}
	
	/**
	 * 下单起始日期,交易申请查询48号接口需升级为9B接口
	 */
	public String getAcceptdatebegin() {
		return this.acceptdatebegin;
	}
	
	/**
	 * 下单起始日期,交易申请查询48号接口需升级为9B接口
	 */
	public void setAcceptdatebegin(String value)
	 {
		this.acceptdatebegin = value;
	}
	
	/**
	 * 下单结束日期,交易申请查询48号接口需升级为9B接口
	 */
	public String getAcceptdateend() {
		return this.acceptdateend;
	}
	
	/**
	 * 下单结束日期,交易申请查询48号接口需升级为9B接口
	 */
	public void setAcceptdateend(String value)
	 {
		this.acceptdateend = value;
	}
	
	/**
	 * 业务大类不等于,交易申请查询48号接口需升级为9B接口
	 */
	public String getUnequalbusintype() {
		return this.unequalbusintype;
	}
	
	/**
	 * 业务大类不等于,交易申请查询48号接口需升级为9B接口
	 */
	public void setUnequalbusintype(String value)
	 {
		this.unequalbusintype = value;
	}
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	public String getPromotion() {
		return this.promotion;
	}
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	public void setPromotion(String value)
	 {
		this.promotion = value;
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
	 * 审核标志不等于,
	 */
	public String getCustconfirmneq() {
		return this.custconfirmneq;
	}
	
	/**
	 * 审核标志不等于,
	 */
	public void setCustconfirmneq(String value)
	 {
		this.custconfirmneq = value;
	}
	
	/**
	 * 审核员编号,
	 */
	public String getSubaccoauditno() {
		return this.subaccoauditno;
	}
	
	/**
	 * 审核员编号,
	 */
	public void setSubaccoauditno(String value)
	 {
		this.subaccoauditno = value;
	}
	
	/**
	 * 下单子账户编号,下单子账户编号
	 */
	public String getSubacconoeq() {
		return this.subacconoeq;
	}
	
	/**
	 * 下单子账户编号,下单子账户编号
	 */
	public void setSubacconoeq(String value)
	 {
		this.subacconoeq = value;
	}
	
	/**
	 * 下单子账户编号不等于,下单子账户编号不等于
	 */
	public String getSubaccononeq() {
		return this.subaccononeq;
	}
	
	/**
	 * 下单子账户编号不等于,下单子账户编号不等于
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
	 * 资金方式,升级到直销服务91号查询服务或以上
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,升级到直销服务91号查询服务或以上
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("custno", this.custno);
		inputMap.put("callingcodenoeq", this.callingcodenoeq);
		inputMap.put("callingcodenoteq", this.callingcodenoteq);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("busintype", this.busintype);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("confirmflag", this.confirmflag);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("querydeclarevaluavgr", this.querydeclarevaluavgr);
		inputMap.put("queryredeemtranflag", this.queryredeemtranflag);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("agencytype", this.agencytype);
		inputMap.put("combrequestno", this.combrequestno);
		inputMap.put("otherserialno", this.otherserialno);
		inputMap.put("xyh", this.xyh);
		inputMap.put("querytype", this.querytype);
		inputMap.put("datasource", this.datasource);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("czflag", this.czflag);
		inputMap.put("fundsubtype", this.fundsubtype);
		inputMap.put("onlineflag", this.onlineflag);
		inputMap.put("acceptdatebegin", this.acceptdatebegin);
		inputMap.put("acceptdateend", this.acceptdateend);
		inputMap.put("unequalbusintype", this.unequalbusintype);
		inputMap.put("promotion", this.promotion);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("custconfirm", this.custconfirm);
		inputMap.put("custconfirmneq", this.custconfirmneq);
		inputMap.put("subaccoauditno", this.subaccoauditno);
		inputMap.put("subacconoeq", this.subacconoeq);
		inputMap.put("subaccononeq", this.subaccononeq);
		inputMap.put("subaccoright", this.subaccoright);
		inputMap.put("capitalmode", this.capitalmode);
	}
}
