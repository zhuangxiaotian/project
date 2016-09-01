package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史确认查询功能输出明细参数
 */
public class ISHistoryConfirmQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 确认日期,TA确认日期
	 */
	private java.util.Date transactionConfirmDate;
	
	/**
	 * ta确认编号,TA确认编号
	 */
	private String taSerialNo;
	
	/**
	 * 业务代码,业务代码，参见附录 1。点击查看说明
	 */
	private String businessCode;
	
	/**
	 * 客户号,客户号
	 */
	private String customerNo;
	
	/**
	 * 基金账号,投资人基金账号
	 */
	private String fundAccount;
	
	/**
	 * 基金代码,基金代码
	 */
	private String fundCode;
	
	/**
	 * 份额类型,份额类型
	 */
	private String shareType;
	
	/**
	 * 申请日期,交易申请日期
	 */
	private java.util.Date applicationDate;
	
	/**
	 * 申请编号,申请单编号
	 */
	private String applicationNo;
	
	/**
	 * 销售商代码,销售人代码
	 */
	private String agencyNo;
	
	/**
	 * 托管网点号码,托管网点号码，指份额的二级托管机构
	 */
	private String netNo;
	
	/**
	 * 交易网点代码,交易网点号码，指实际的营业网点
	 */
	private String channelId;
	
	/**
	 * 结算币种,结算币种，人民币为156
	 */
	private String currency;
	
	/**
	 * 确认份额,交易确认份额
	 */
	private Double confirmVol;
	
	/**
	 * 确认金额,交易确认金额，对于认购申购，指向投资者扣划的金额，含费用；对于赎回、发行不成功退款、基金终止等业务，指须划入投资者资金账户的金额，已扣除费用
	 */
	private Double confirmAmount;
	
	/**
	 * 交易费,交易费
	 */
	private Double tradeFee;
	
	/**
	 * 过户费,过户费
	 */
	private Double taFee;
	
	/**
	 * 印花税,印花税
	 */
	private Double stampTax;
	
	/**
	 * 后收费用,后收费用，基金转换补差费
	 */
	private Double backFee;
	
	/**
	 * 其他费用,其他费用
	 */
	private Double otherFee;
	
	/**
	 * 目标基金代码,目标基金代码，用于基金转换用
	 */
	private String targetFundCode;
	
	/**
	 * 目标份额类型,目标份额类型
	 */
	private String targetShareType;
	
	/**
	 * 对方基金账号,对方TA基金账号，用于非交易过户
	 */
	private String targetFundAccount;
	
	/**
	 * 对方销售商代码,对方销售人代码，用于转托管用
	 */
	private String targetAgencyNo;
	
	/**
	 * 对方托管网点代码,对方托管网点号码，用于转托管、非交易过户
	 */
	private String targetNetNo;
	
	/**
	 * 交易处理返回代码,交易处理返回代码
	 */
	private String retCode;
	
	/**
	 * 原确认流水号,TA的原确认流水号，无用，填空
	 */
	private String originalConfirmNo;
	
	/**
	 * 分红方式,分红方式，0:红利再投资;1:现金分红
	 */
	private String bonusType;
	
	/**
	 * 冻结原因,冻结原因，0:司法冻结;1:主动冻结;2:质押冻结
	 */
	private String freezeCause;
	
	/**
	 * 冻结截止日期,冻结截止日期，（冻结/解冻时用）
	 */
	private String freezeEndDate;
	
	/**
	 * 原申请编号,原申请单编号，解冻时指定的原冻结申请单号取消协议时指定的原协议设定申请单号（代销机构可能填的是无效值）
	 */
	private String originalApplicationNo;
	
	/**
	 * 交易账号,交易账号
	 */
	private String transactionsAccount;
	
	/**
	 * 成交价,成交价，4位小数。就是单位净值
	 */
	private Double netValue;
	
	/**
	 * 份额余额,份额余额
	 */
	private Double lastShare;
	
	/**
	 * 交易处理返回信息,交易处理返回信息，1:成功;2:失败
	 */
	private String retMsg;
	
	/**
	 * 兑付的未付收益,兑付的未付收益，2位小数。用于交易确认时，需要兑付未付收益
	 */
	private Double chinCome;
	
	/**
	 * 兑付的份额,兑付的份额，兑付的未付收益折算的份额
	 */
	private Double chShare;
	
	/**
	 * 未付收益,未付收益，2位小数。用于非交易过户、转托管时，连带未付收益一起过户或转托管
	 */
	private Double confirmIncome;
	
	/**
	 * 投资收益,投资收益，针对赎回、转换出
	 */
	private String gainBalance;
	
	/**
	 * 份额级别,份额级别
	 */
	private String shareClass;
	
	/**
	 * 确认日期,TA确认日期
	 */
	public java.util.Date getTransactionConfirmDate() {
		return this.transactionConfirmDate;
	}
	
	/**
	 * 确认日期,TA确认日期
	 */
	public void setTransactionConfirmDate(java.util.Date value)
	 {
		this.transactionConfirmDate = value;
	}
	
	/**
	 * ta确认编号,TA确认编号
	 */
	public String getTaSerialNo() {
		return this.taSerialNo;
	}
	
	/**
	 * ta确认编号,TA确认编号
	 */
	public void setTaSerialNo(String value)
	 {
		this.taSerialNo = value;
	}
	
	/**
	 * 业务代码,业务代码，参见附录 1。点击查看说明
	 */
	public String getBusinessCode() {
		return this.businessCode;
	}
	
	/**
	 * 业务代码,业务代码，参见附录 1。点击查看说明
	 */
	public void setBusinessCode(String value)
	 {
		this.businessCode = value;
	}
	
	/**
	 * 客户号,客户号
	 */
	public String getCustomerNo() {
		return this.customerNo;
	}
	
	/**
	 * 客户号,客户号
	 */
	public void setCustomerNo(String value)
	 {
		this.customerNo = value;
	}
	
	/**
	 * 基金账号,投资人基金账号
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 基金账号,投资人基金账号
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
	
	/**
	 * 基金代码,基金代码
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,基金代码
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 份额类型,份额类型
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额类型,份额类型
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 申请日期,交易申请日期
	 */
	public java.util.Date getApplicationDate() {
		return this.applicationDate;
	}
	
	/**
	 * 申请日期,交易申请日期
	 */
	public void setApplicationDate(java.util.Date value)
	 {
		this.applicationDate = value;
	}
	
	/**
	 * 申请编号,申请单编号
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,申请单编号
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
	}
	
	/**
	 * 销售商代码,销售人代码
	 */
	public String getAgencyNo() {
		return this.agencyNo;
	}
	
	/**
	 * 销售商代码,销售人代码
	 */
	public void setAgencyNo(String value)
	 {
		this.agencyNo = value;
	}
	
	/**
	 * 托管网点号码,托管网点号码，指份额的二级托管机构
	 */
	public String getNetNo() {
		return this.netNo;
	}
	
	/**
	 * 托管网点号码,托管网点号码，指份额的二级托管机构
	 */
	public void setNetNo(String value)
	 {
		this.netNo = value;
	}
	
	/**
	 * 交易网点代码,交易网点号码，指实际的营业网点
	 */
	public String getChannelId() {
		return this.channelId;
	}
	
	/**
	 * 交易网点代码,交易网点号码，指实际的营业网点
	 */
	public void setChannelId(String value)
	 {
		this.channelId = value;
	}
	
	/**
	 * 结算币种,结算币种，人民币为156
	 */
	public String getCurrency() {
		return this.currency;
	}
	
	/**
	 * 结算币种,结算币种，人民币为156
	 */
	public void setCurrency(String value)
	 {
		this.currency = value;
	}
	
	/**
	 * 确认份额,交易确认份额
	 */
	public Double getConfirmVol() {
		return this.confirmVol;
	}
	
	/**
	 * 确认份额,交易确认份额
	 */
	public void setConfirmVol(Double value)
	 {
		this.confirmVol = value;
	}
	
	/**
	 * 确认金额,交易确认金额，对于认购申购，指向投资者扣划的金额，含费用；对于赎回、发行不成功退款、基金终止等业务，指须划入投资者资金账户的金额，已扣除费用
	 */
	public Double getConfirmAmount() {
		return this.confirmAmount;
	}
	
	/**
	 * 确认金额,交易确认金额，对于认购申购，指向投资者扣划的金额，含费用；对于赎回、发行不成功退款、基金终止等业务，指须划入投资者资金账户的金额，已扣除费用
	 */
	public void setConfirmAmount(Double value)
	 {
		this.confirmAmount = value;
	}
	
	/**
	 * 交易费,交易费
	 */
	public Double getTradeFee() {
		return this.tradeFee;
	}
	
	/**
	 * 交易费,交易费
	 */
	public void setTradeFee(Double value)
	 {
		this.tradeFee = value;
	}
	
	/**
	 * 过户费,过户费
	 */
	public Double getTaFee() {
		return this.taFee;
	}
	
	/**
	 * 过户费,过户费
	 */
	public void setTaFee(Double value)
	 {
		this.taFee = value;
	}
	
	/**
	 * 印花税,印花税
	 */
	public Double getStampTax() {
		return this.stampTax;
	}
	
	/**
	 * 印花税,印花税
	 */
	public void setStampTax(Double value)
	 {
		this.stampTax = value;
	}
	
	/**
	 * 后收费用,后收费用，基金转换补差费
	 */
	public Double getBackFee() {
		return this.backFee;
	}
	
	/**
	 * 后收费用,后收费用，基金转换补差费
	 */
	public void setBackFee(Double value)
	 {
		this.backFee = value;
	}
	
	/**
	 * 其他费用,其他费用
	 */
	public Double getOtherFee() {
		return this.otherFee;
	}
	
	/**
	 * 其他费用,其他费用
	 */
	public void setOtherFee(Double value)
	 {
		this.otherFee = value;
	}
	
	/**
	 * 目标基金代码,目标基金代码，用于基金转换用
	 */
	public String getTargetFundCode() {
		return this.targetFundCode;
	}
	
	/**
	 * 目标基金代码,目标基金代码，用于基金转换用
	 */
	public void setTargetFundCode(String value)
	 {
		this.targetFundCode = value;
	}
	
	/**
	 * 目标份额类型,目标份额类型
	 */
	public String getTargetShareType() {
		return this.targetShareType;
	}
	
	/**
	 * 目标份额类型,目标份额类型
	 */
	public void setTargetShareType(String value)
	 {
		this.targetShareType = value;
	}
	
	/**
	 * 对方基金账号,对方TA基金账号，用于非交易过户
	 */
	public String getTargetFundAccount() {
		return this.targetFundAccount;
	}
	
	/**
	 * 对方基金账号,对方TA基金账号，用于非交易过户
	 */
	public void setTargetFundAccount(String value)
	 {
		this.targetFundAccount = value;
	}
	
	/**
	 * 对方销售商代码,对方销售人代码，用于转托管用
	 */
	public String getTargetAgencyNo() {
		return this.targetAgencyNo;
	}
	
	/**
	 * 对方销售商代码,对方销售人代码，用于转托管用
	 */
	public void setTargetAgencyNo(String value)
	 {
		this.targetAgencyNo = value;
	}
	
	/**
	 * 对方托管网点代码,对方托管网点号码，用于转托管、非交易过户
	 */
	public String getTargetNetNo() {
		return this.targetNetNo;
	}
	
	/**
	 * 对方托管网点代码,对方托管网点号码，用于转托管、非交易过户
	 */
	public void setTargetNetNo(String value)
	 {
		this.targetNetNo = value;
	}
	
	/**
	 * 交易处理返回代码,交易处理返回代码
	 */
	public String getRetCode() {
		return this.retCode;
	}
	
	/**
	 * 交易处理返回代码,交易处理返回代码
	 */
	public void setRetCode(String value)
	 {
		this.retCode = value;
	}
	
	/**
	 * 原确认流水号,TA的原确认流水号，无用，填空
	 */
	public String getOriginalConfirmNo() {
		return this.originalConfirmNo;
	}
	
	/**
	 * 原确认流水号,TA的原确认流水号，无用，填空
	 */
	public void setOriginalConfirmNo(String value)
	 {
		this.originalConfirmNo = value;
	}
	
	/**
	 * 分红方式,分红方式，0:红利再投资;1:现金分红
	 */
	public String getBonusType() {
		return this.bonusType;
	}
	
	/**
	 * 分红方式,分红方式，0:红利再投资;1:现金分红
	 */
	public void setBonusType(String value)
	 {
		this.bonusType = value;
	}
	
	/**
	 * 冻结原因,冻结原因，0:司法冻结;1:主动冻结;2:质押冻结
	 */
	public String getFreezeCause() {
		return this.freezeCause;
	}
	
	/**
	 * 冻结原因,冻结原因，0:司法冻结;1:主动冻结;2:质押冻结
	 */
	public void setFreezeCause(String value)
	 {
		this.freezeCause = value;
	}
	
	/**
	 * 冻结截止日期,冻结截止日期，（冻结/解冻时用）
	 */
	public String getFreezeEndDate() {
		return this.freezeEndDate;
	}
	
	/**
	 * 冻结截止日期,冻结截止日期，（冻结/解冻时用）
	 */
	public void setFreezeEndDate(String value)
	 {
		this.freezeEndDate = value;
	}
	
	/**
	 * 原申请编号,原申请单编号，解冻时指定的原冻结申请单号取消协议时指定的原协议设定申请单号（代销机构可能填的是无效值）
	 */
	public String getOriginalApplicationNo() {
		return this.originalApplicationNo;
	}
	
	/**
	 * 原申请编号,原申请单编号，解冻时指定的原冻结申请单号取消协议时指定的原协议设定申请单号（代销机构可能填的是无效值）
	 */
	public void setOriginalApplicationNo(String value)
	 {
		this.originalApplicationNo = value;
	}
	
	/**
	 * 交易账号,交易账号
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,交易账号
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 成交价,成交价，4位小数。就是单位净值
	 */
	public Double getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 成交价,成交价，4位小数。就是单位净值
	 */
	public void setNetValue(Double value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 份额余额,份额余额
	 */
	public Double getLastShare() {
		return this.lastShare;
	}
	
	/**
	 * 份额余额,份额余额
	 */
	public void setLastShare(Double value)
	 {
		this.lastShare = value;
	}
	
	/**
	 * 交易处理返回信息,交易处理返回信息，1:成功;2:失败
	 */
	public String getRetMsg() {
		return this.retMsg;
	}
	
	/**
	 * 交易处理返回信息,交易处理返回信息，1:成功;2:失败
	 */
	public void setRetMsg(String value)
	 {
		this.retMsg = value;
	}
	
	/**
	 * 兑付的未付收益,兑付的未付收益，2位小数。用于交易确认时，需要兑付未付收益
	 */
	public Double getChinCome() {
		return this.chinCome;
	}
	
	/**
	 * 兑付的未付收益,兑付的未付收益，2位小数。用于交易确认时，需要兑付未付收益
	 */
	public void setChinCome(Double value)
	 {
		this.chinCome = value;
	}
	
	/**
	 * 兑付的份额,兑付的份额，兑付的未付收益折算的份额
	 */
	public Double getChShare() {
		return this.chShare;
	}
	
	/**
	 * 兑付的份额,兑付的份额，兑付的未付收益折算的份额
	 */
	public void setChShare(Double value)
	 {
		this.chShare = value;
	}
	
	/**
	 * 未付收益,未付收益，2位小数。用于非交易过户、转托管时，连带未付收益一起过户或转托管
	 */
	public Double getConfirmIncome() {
		return this.confirmIncome;
	}
	
	/**
	 * 未付收益,未付收益，2位小数。用于非交易过户、转托管时，连带未付收益一起过户或转托管
	 */
	public void setConfirmIncome(Double value)
	 {
		this.confirmIncome = value;
	}
	
	/**
	 * 投资收益,投资收益，针对赎回、转换出
	 */
	public String getGainBalance() {
		return this.gainBalance;
	}
	
	/**
	 * 投资收益,投资收益，针对赎回、转换出
	 */
	public void setGainBalance(String value)
	 {
		this.gainBalance = value;
	}
	
	/**
	 * 份额级别,份额级别
	 */
	public String getShareClass() {
		return this.shareClass;
	}
	
	/**
	 * 份额级别,份额级别
	 */
	public void setShareClass(String value)
	 {
		this.shareClass = value;
	}
}
