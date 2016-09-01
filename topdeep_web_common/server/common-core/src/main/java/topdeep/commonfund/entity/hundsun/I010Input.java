package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投赎回协议新增(I010)
 */
public class I010Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年exptype为"14"时，固定传0
	 */
	private String cycleunit = "";
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	private String exceedflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五) exptype为"14"时，固定传空
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,exptype为"14"时，固定传1
	 */
	private String jyzq = "";
	
	/**
	 * 申请份额,不能小于等于0exptype为"14"时，固定传0
	 */
	private String requestshare = "";
	
	/**
	 * 首次交易日期,格式为yyyyMM,如果传的000000则由系统生成对应的首次交易日期和交易日期
	 */
	private String scjyrq = "";
	
	/**
	 * 收费方式,
	 */
	private String shareType = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 业务大类,01:现金宝业务（目前只有现金宝可还信用卡，故exptype为"14"时固定传01）,02.超级现金宝定赎回转购
	 */
	private String busintype = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	private String xybm = "";
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231exptype为"14"时，固定传99991231
	 */
	private String zzrq = "";
	
	/**
	 * 指数类型,14:信用卡还款 15:快速还贷
	 */
	private String exptype = "";
	
	/**
	 * 待还款银行卡编号,exptype为"14"时必填
	 */
	private String paymentaccono = "";
	
	/**
	 * 信用卡账单金额还款方式,1:最低还款;2:最优还款;3:全额还款exptype为"14"时必填
	 */
	private String paymentbalatype = "";
	
	/**
	 * 目标交易账号,赎回到的交易账号
	 */
	private String targettradeacco = "";
	
	/**
	 * 是否实时转购,1为实时转购
	 */
	private String isrealtimetransfer = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标份额类别,
	 */
	private String targetsharetype = "";
	
	/**
	 * 初始化参数
	 */
	public I010Input() {
		this.setFunction("I010");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年exptype为"14"时，固定传0
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 协议周期单位,参考系统DQDEZQ，0:月，1:周，2:日，3:年exptype为"14"时，固定传0
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	public String getExceedflag() {
		return this.exceedflag;
	}
	
	/**
	 * 巨额赎回标志,"0":"放弃超额部分"--"1":"继续赎回"
	 */
	public void setExceedflag(String value)
	 {
		this.exceedflag = value;
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
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五) exptype为"14"时，固定传空
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,日期的后两位，交易周期为周时，传2-6（周一-周五) exptype为"14"时，固定传空
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易周期,exptype为"14"时，固定传1
	 */
	public String getJyzq() {
		return this.jyzq;
	}
	
	/**
	 * 交易周期,exptype为"14"时，固定传1
	 */
	public void setJyzq(String value)
	 {
		this.jyzq = value;
	}
	
	/**
	 * 申请份额,不能小于等于0exptype为"14"时，固定传0
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,不能小于等于0exptype为"14"时，固定传0
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	/**
	 * 首次交易日期,格式为yyyyMM,如果传的000000则由系统生成对应的首次交易日期和交易日期
	 */
	public String getScjyrq() {
		return this.scjyrq;
	}
	
	/**
	 * 首次交易日期,格式为yyyyMM,如果传的000000则由系统生成对应的首次交易日期和交易日期
	 */
	public void setScjyrq(String value)
	 {
		this.scjyrq = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 收费方式,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
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
	 * 业务大类,01:现金宝业务（目前只有现金宝可还信用卡，故exptype为"14"时固定传01）,02.超级现金宝定赎回转购
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,01:现金宝业务（目前只有现金宝可还信用卡，故exptype为"14"时固定传01）,02.超级现金宝定赎回转购
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	public String getXybm() {
		return this.xybm;
	}
	
	/**
	 * 协议别名,需要打开系统参数ZDYXYBM
	 */
	public void setXybm(String value)
	 {
		this.xybm = value;
	}
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231exptype为"14"时，固定传99991231
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,格式为yyyyMMdd,不传默认为99991231exptype为"14"时，固定传99991231
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 指数类型,14:信用卡还款 15:快速还贷
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,14:信用卡还款 15:快速还贷
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 待还款银行卡编号,exptype为"14"时必填
	 */
	public String getPaymentaccono() {
		return this.paymentaccono;
	}
	
	/**
	 * 待还款银行卡编号,exptype为"14"时必填
	 */
	public void setPaymentaccono(String value)
	 {
		this.paymentaccono = value;
	}
	
	/**
	 * 信用卡账单金额还款方式,1:最低还款;2:最优还款;3:全额还款exptype为"14"时必填
	 */
	public String getPaymentbalatype() {
		return this.paymentbalatype;
	}
	
	/**
	 * 信用卡账单金额还款方式,1:最低还款;2:最优还款;3:全额还款exptype为"14"时必填
	 */
	public void setPaymentbalatype(String value)
	 {
		this.paymentbalatype = value;
	}
	
	/**
	 * 目标交易账号,赎回到的交易账号
	 */
	public String getTargettradeacco() {
		return this.targettradeacco;
	}
	
	/**
	 * 目标交易账号,赎回到的交易账号
	 */
	public void setTargettradeacco(String value)
	 {
		this.targettradeacco = value;
	}
	
	/**
	 * 是否实时转购,1为实时转购
	 */
	public String getIsrealtimetransfer() {
		return this.isrealtimetransfer;
	}
	
	/**
	 * 是否实时转购,1为实时转购
	 */
	public void setIsrealtimetransfer(String value)
	 {
		this.isrealtimetransfer = value;
	}
	
	/**
	 * 目标基金代码,
	 */
	public String getTargetfundcode() {
		return this.targetfundcode;
	}
	
	/**
	 * 目标基金代码,
	 */
	public void setTargetfundcode(String value)
	 {
		this.targetfundcode = value;
	}
	
	/**
	 * 目标份额类别,
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标份额类别,
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cycleunit", this.cycleunit);
		inputMap.put("exceedflag", this.exceedflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("requestshare", this.requestshare);
		inputMap.put("scjyrq", this.scjyrq);
		inputMap.put("shareType", this.shareType);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("busintype", this.busintype);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("xybm", this.xybm);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("exptype", this.exptype);
		inputMap.put("paymentaccono", this.paymentaccono);
		inputMap.put("paymentbalatype", this.paymentbalatype);
		inputMap.put("targettradeacco", this.targettradeacco);
		inputMap.put("isrealtimetransfer", this.isrealtimetransfer);
		inputMap.put("targetfundcode", this.targetfundcode);
		inputMap.put("targetsharetype", this.targetsharetype);
	}
}
