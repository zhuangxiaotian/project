package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投协议列表查询(I005)
 */
public class I005Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	private Integer applyrecordno;
	
	/**
	 * 业务大类,01:现金宝业务，095：信用卡还款
	 */
	private String busintype = "";
	
	/**
	 * 业务辅助代码,16:趋势定投；传空返回全部；15:余额理财；09货币基金转其他基金 ; 72：快速还贷
	 */
	private String fixflag = "";
	
	/**
	 * 查询类型,0:单笔，1:组合
	 */
	private String querytype = "";
	
	/**
	 * 协议状态，等于,"A":启用,"P":暂停,"H":终止,"ALL":所有
	 */
	private String state = "";
	
	/**
	 * 协议状态，不等于,默认不等于"H",终止状态
	 */
	private String state2 = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 协议号,区分定投协议唯一条件，可做单笔查询
	 */
	private String xyh = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 不包含的投资类型,
	 */
	private String sxptypene = "";
	
	/**
	 * 投资类型,14:信用卡还款
	 */
	private String exptype = "";
	
	/**
	 * 业务代码,"090":定投申购,"982":定投转换,"091":定投赎回,空则查询所有"095":信用卡还款 ;"979":快速还贷协议新增;"980":快速还贷协议修改;"981":快速还贷协议取消;
	 */
	private String ywdm = "";
	
	/**
	 * 初始化参数
	 */
	public I005Input() {
		this.setFunction("I005");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,默认单笔查询最大值,即参数SYS_MAXCOUNT
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 业务大类,01:现金宝业务，095：信用卡还款
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,01:现金宝业务，095：信用卡还款
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 业务辅助代码,16:趋势定投；传空返回全部；15:余额理财；09货币基金转其他基金 ; 72：快速还贷
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,16:趋势定投；传空返回全部；15:余额理财；09货币基金转其他基金 ; 72：快速还贷
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
	}
	
	/**
	 * 查询类型,0:单笔，1:组合
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,0:单笔，1:组合
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 协议状态，等于,"A":启用,"P":暂停,"H":终止,"ALL":所有
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态，等于,"A":启用,"P":暂停,"H":终止,"ALL":所有
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 协议状态，不等于,默认不等于"H",终止状态
	 */
	public String getState2() {
		return this.state2;
	}
	
	/**
	 * 协议状态，不等于,默认不等于"H",终止状态
	 */
	public void setState2(String value)
	 {
		this.state2 = value;
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
	 * 协议号,区分定投协议唯一条件，可做单笔查询
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,区分定投协议唯一条件，可做单笔查询
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
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
	 * 不包含的投资类型,
	 */
	public String getSxptypene() {
		return this.sxptypene;
	}
	
	/**
	 * 不包含的投资类型,
	 */
	public void setSxptypene(String value)
	 {
		this.sxptypene = value;
	}
	
	/**
	 * 投资类型,14:信用卡还款
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 投资类型,14:信用卡还款
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 业务代码,"090":定投申购,"982":定投转换,"091":定投赎回,空则查询所有"095":信用卡还款 ;"979":快速还贷协议新增;"980":快速还贷协议修改;"981":快速还贷协议取消;
	 */
	public String getYwdm() {
		return this.ywdm;
	}
	
	/**
	 * 业务代码,"090":定投申购,"982":定投转换,"091":定投赎回,空则查询所有"095":信用卡还款 ;"979":快速还贷协议新增;"980":快速还贷协议修改;"981":快速还贷协议取消;
	 */
	public void setYwdm(String value)
	 {
		this.ywdm = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("busintype", this.busintype);
		inputMap.put("fixflag", this.fixflag);
		inputMap.put("querytype", this.querytype);
		inputMap.put("state", this.state);
		inputMap.put("state2", this.state2);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("xyh", this.xyh);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("sxptypene", this.sxptypene);
		inputMap.put("exptype", this.exptype);
		inputMap.put("ywdm", this.ywdm);
	}
}
