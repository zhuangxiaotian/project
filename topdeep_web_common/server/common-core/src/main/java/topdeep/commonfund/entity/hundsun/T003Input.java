package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金买入(T003)
 */
public class T003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请额度,
	 */
	private String applysum = "";
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,T001返回的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,T002返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付03：快捷支付;04:柜台支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 业务大类,现金宝充值：01；超级现金宝：02
	 */
	private String busintype = "";
	
	/**
	 * 申购基金时所用的现金宝基金代码,资金来源为现金宝时，支持的现金宝基金代码
	 */
	private String buyMoneyFundcode = "";
	
	/**
	 * 申购基金时所用的现金宝基金收费方式,资金来源为现金宝时，支持的现金宝基金收费方式
	 */
	private String buyMoneyShareType = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	private String redeemtodeclareflag = "";
	
	/**
	 * 交易来源,官网超级现金宝固定值180001
	 */
	private String tradesource = "";
	
	/**
	 * 交易经办人,
	 */
	private String tradecontact = "";
	
	/**
	 * 汇款顺延日期,
	 */
	private String delayday = "";
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	private String precheckflag = "";
	
	/**
	 * 理财平台流水号,
	 */
	private String chinapayserialno = "";
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	private String transfermoney = "";
	
	/**
	 * 推荐人,
	 */
	private String recommender = "";
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	private String outsideorderno = "";
	
	/**
	 * 否是银联通手机SDK支付,1--是 0或空不是
	 */
	private String ischinapaymobilesdkpay = "";
	
	/**
	 * 资金来源,0:银行卡;1:现金宝;3:超级现金宝
	 */
	private String capsource = "";
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]
	 */
	private String fixbusinflag = "";
	
	/**
	 * 特殊银行编号,用于超级现金宝区分不同渠道的交易申请
	 */
	private String particularbankserial = "";
	
	/**
	 * 活动代码,促销活动的代码，可用于区分参与活动的申购份额
	 */
	private String promotioncode = "";
	
	/**
	 * 专户预约码,
	 */
	private String preordercode = "";
	
	/**
	 * 备注,交易备注信息
	 */
	private String explain = "";
	
	/**
	 * 费率折扣率,取值在0~1之间，默认为“1”（后台默认以直销系统配置的值和传入值之间，较小的值为准。若要完全由前端控制折扣率，那么就不要在直销设置折扣）
	 */
	private String discountrate = "";
	
	/**
	 * 代金券,代金券
	 */
	private String vouchers = "";
	
	/**
	 * 初始化参数
	 */
	public T003Input() {
		this.setFunction("T003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请额度,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 收费方式,T001返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,T001返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,T002返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,T002返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付03：快捷支付;04:柜台支付
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付03：快捷支付;04:柜台支付
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 业务大类,现金宝充值：01；超级现金宝：02
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝充值：01；超级现金宝：02
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 申购基金时所用的现金宝基金代码,资金来源为现金宝时，支持的现金宝基金代码
	 */
	public String getBuyMoneyFundcode() {
		return this.buyMoneyFundcode;
	}
	
	/**
	 * 申购基金时所用的现金宝基金代码,资金来源为现金宝时，支持的现金宝基金代码
	 */
	public void setBuyMoneyFundcode(String value)
	 {
		this.buyMoneyFundcode = value;
	}
	
	/**
	 * 申购基金时所用的现金宝基金收费方式,资金来源为现金宝时，支持的现金宝基金收费方式
	 */
	public String getBuyMoneyShareType() {
		return this.buyMoneyShareType;
	}
	
	/**
	 * 申购基金时所用的现金宝基金收费方式,资金来源为现金宝时，支持的现金宝基金收费方式
	 */
	public void setBuyMoneyShareType(String value)
	 {
		this.buyMoneyShareType = value;
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
	 * 基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	public String getRedeemtodeclareflag() {
		return this.redeemtodeclareflag;
	}
	
	/**
	 * 基金赎回转购标识,1--货币基金赎回转购 主要用于数米跨TA转换使用
	 */
	public void setRedeemtodeclareflag(String value)
	 {
		this.redeemtodeclareflag = value;
	}
	
	/**
	 * 交易来源,官网超级现金宝固定值180001
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,官网超级现金宝固定值180001
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 交易经办人,
	 */
	public String getTradecontact() {
		return this.tradecontact;
	}
	
	/**
	 * 交易经办人,
	 */
	public void setTradecontact(String value)
	 {
		this.tradecontact = value;
	}
	
	/**
	 * 汇款顺延日期,
	 */
	public String getDelayday() {
		return this.delayday;
	}
	
	/**
	 * 汇款顺延日期,
	 */
	public void setDelayday(String value)
	 {
		this.delayday = value;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public String getTransfermoney() {
		return this.transfermoney;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public void setTransfermoney(String value)
	 {
		this.transfermoney = value;
	}
	
	/**
	 * 推荐人,
	 */
	public String getRecommender() {
		return this.recommender;
	}
	
	/**
	 * 推荐人,
	 */
	public void setRecommender(String value)
	 {
		this.recommender = value;
	}
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	public String getOutsideorderno() {
		return this.outsideorderno;
	}
	
	/**
	 * 外部订单号,第三方平台预约交易时传
	 */
	public void setOutsideorderno(String value)
	 {
		this.outsideorderno = value;
	}
	
	/**
	 * 否是银联通手机SDK支付,1--是 0或空不是
	 */
	public String getIschinapaymobilesdkpay() {
		return this.ischinapaymobilesdkpay;
	}
	
	/**
	 * 否是银联通手机SDK支付,1--是 0或空不是
	 */
	public void setIschinapaymobilesdkpay(String value)
	 {
		this.ischinapaymobilesdkpay = value;
	}
	
	/**
	 * 资金来源,0:银行卡;1:现金宝;3:超级现金宝
	 */
	public String getCapsource() {
		return this.capsource;
	}
	
	/**
	 * 资金来源,0:银行卡;1:现金宝;3:超级现金宝
	 */
	public void setCapsource(String value)
	 {
		this.capsource = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
	}
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,转换转购等业务有默认的业务辅助码，但当传入业务辅助码时，以传入的为准。要置空请传[ISNULL]
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 特殊银行编号,用于超级现金宝区分不同渠道的交易申请
	 */
	public String getParticularbankserial() {
		return this.particularbankserial;
	}
	
	/**
	 * 特殊银行编号,用于超级现金宝区分不同渠道的交易申请
	 */
	public void setParticularbankserial(String value)
	 {
		this.particularbankserial = value;
	}
	
	/**
	 * 活动代码,促销活动的代码，可用于区分参与活动的申购份额
	 */
	public String getPromotioncode() {
		return this.promotioncode;
	}
	
	/**
	 * 活动代码,促销活动的代码，可用于区分参与活动的申购份额
	 */
	public void setPromotioncode(String value)
	 {
		this.promotioncode = value;
	}
	
	/**
	 * 专户预约码,
	 */
	public String getPreordercode() {
		return this.preordercode;
	}
	
	/**
	 * 专户预约码,
	 */
	public void setPreordercode(String value)
	 {
		this.preordercode = value;
	}
	
	/**
	 * 备注,交易备注信息
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注,交易备注信息
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 费率折扣率,取值在0~1之间，默认为“1”（后台默认以直销系统配置的值和传入值之间，较小的值为准。若要完全由前端控制折扣率，那么就不要在直销设置折扣）
	 */
	public String getDiscountrate() {
		return this.discountrate;
	}
	
	/**
	 * 费率折扣率,取值在0~1之间，默认为“1”（后台默认以直销系统配置的值和传入值之间，较小的值为准。若要完全由前端控制折扣率，那么就不要在直销设置折扣）
	 */
	public void setDiscountrate(String value)
	 {
		this.discountrate = value;
	}
	
	/**
	 * 代金券,代金券
	 */
	public String getVouchers() {
		return this.vouchers;
	}
	
	/**
	 * 代金券,代金券
	 */
	public void setVouchers(String value)
	 {
		this.vouchers = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applysum", this.applysum);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("busintype", this.busintype);
		inputMap.put("buyMoneyFundcode", this.buyMoneyFundcode);
		inputMap.put("buyMoneyShareType", this.buyMoneyShareType);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("redeemtodeclareflag", this.redeemtodeclareflag);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("tradecontact", this.tradecontact);
		inputMap.put("delayday", this.delayday);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("transfermoney", this.transfermoney);
		inputMap.put("recommender", this.recommender);
		inputMap.put("outsideorderno", this.outsideorderno);
		inputMap.put("ischinapaymobilesdkpay", this.ischinapaymobilesdkpay);
		inputMap.put("capsource", this.capsource);
		inputMap.put("broker", this.broker);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("particularbankserial", this.particularbankserial);
		inputMap.put("promotioncode", this.promotioncode);
		inputMap.put("preordercode", this.preordercode);
		inputMap.put("explain", this.explain);
		inputMap.put("discountrate", this.discountrate);
		inputMap.put("vouchers", this.vouchers);
	}
}
