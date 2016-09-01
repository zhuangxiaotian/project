package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 历史交易申请查询功能输出明细参数
 */
public class ISHistoryTransactionsApplicationListQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private java.util.Date applicationDate;
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 交易账号,
	 */
	private String transactionsAccount;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 份额类别,
	 */
	private String shareType;
	
	/**
	 * 销售点代码,
	 */
	private String salePlaceCode;
	
	/**
	 * 销售点名称,
	 */
	private String salePlaceName;
	
	/**
	 * 交易类型,
	 */
	private String transactionsType;
	
	/**
	 * 交易名称,
	 */
	private String transactionsName;
	
	/**
	 * 申请金额,
	 */
	private Double applyAmount;
	
	/**
	 * 申请份额,
	 */
	private Double applyShare;
	
	/**
	 * 成交金额,
	 */
	private Double successAmount;
	
	/**
	 * 成交份额,
	 */
	private Double successShare;
	
	/**
	 * 费率,
	 */
	private Double feeRate;
	
	/**
	 * 手续费,
	 */
	private Double fee;
	
	/**
	 * 净值,
	 */
	private Double netValue;
	
	/**
	 * 接单时间,
	 */
	private java.util.Date acceptTime;
	
	/**
	 * 撤单标志,
	 */
	private String canCancel;
	
	/**
	 * 确认码,
	 */
	private String confirmCode;
	
	/**
	 * 交易账号名称,
	 */
	private String transactionsAccountName;
	
	/**
	 * 资金方式,
	 */
	private String financeType;
	
	/**
	 * 扣款状态,
	 */
	private String withholdStateName;
	
	/**
	 * 转入基金,
	 */
	private String fundCode2;
	
	/**
	 * 转入份额类别,
	 */
	private String shareType2;
	
	/**
	 * 赎回交易账号,
	 */
	private String transactionsAccount2;
	
	/**
	 * 备注,
	 */
	private String explain;
	
	/**
	 * 基金名称,
	 */
	private String fundName;
	
	/**
	 * 转入基金名称,
	 */
	private String fundName2;
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 明细资金方式,
	 */
	private String detailcapitalmode;
	
	/**
	 * 银行返回错误原因,
	 */
	private String cperrormsg;
	
	/**
	 * 确认信息,
	 */
	private String confirmInfo;
	
	/**
	 * 所属交易日,
	 */
	private java.util.Date realTransactionDate;
	
	/**
	 * 银行卡号,
	 */
	private String bankNo;
	
	/**
	 * 银行编号,
	 */
	private String bankserial;
	
	/**
	 * 基金账号,
	 */
	private String fundAcco;
	
	/**
	 * 对方基金账号,
	 */
	private String oppFundAcco;
	
	/**
	 * 销售商,
	 */
	private String agencyno;
	
	/**
	 * 银行名称,
	 */
	private String bankname;
	
	/**
	 * 划款状态,
	 */
	private String backBalaceStatu;
	
	/**
	 * 申请日期,
	 */
	public java.util.Date getApplicationDate() {
		return this.applicationDate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplicationDate(java.util.Date value)
	 {
		this.applicationDate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTransactionsAccount() {
		return this.transactionsAccount;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTransactionsAccount(String value)
	 {
		this.transactionsAccount = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getShareType() {
		return this.shareType;
	}
	
	/**
	 * 份额类别,
	 */
	public void setShareType(String value)
	 {
		this.shareType = value;
	}
	
	/**
	 * 销售点代码,
	 */
	public String getSalePlaceCode() {
		return this.salePlaceCode;
	}
	
	/**
	 * 销售点代码,
	 */
	public void setSalePlaceCode(String value)
	 {
		this.salePlaceCode = value;
	}
	
	/**
	 * 销售点名称,
	 */
	public String getSalePlaceName() {
		return this.salePlaceName;
	}
	
	/**
	 * 销售点名称,
	 */
	public void setSalePlaceName(String value)
	 {
		this.salePlaceName = value;
	}
	
	/**
	 * 交易类型,
	 */
	public String getTransactionsType() {
		return this.transactionsType;
	}
	
	/**
	 * 交易类型,
	 */
	public void setTransactionsType(String value)
	 {
		this.transactionsType = value;
	}
	
	/**
	 * 交易名称,
	 */
	public String getTransactionsName() {
		return this.transactionsName;
	}
	
	/**
	 * 交易名称,
	 */
	public void setTransactionsName(String value)
	 {
		this.transactionsName = value;
	}
	
	/**
	 * 申请金额,
	 */
	public Double getApplyAmount() {
		return this.applyAmount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplyAmount(Double value)
	 {
		this.applyAmount = value;
	}
	
	/**
	 * 申请份额,
	 */
	public Double getApplyShare() {
		return this.applyShare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyShare(Double value)
	 {
		this.applyShare = value;
	}
	
	/**
	 * 成交金额,
	 */
	public Double getSuccessAmount() {
		return this.successAmount;
	}
	
	/**
	 * 成交金额,
	 */
	public void setSuccessAmount(Double value)
	 {
		this.successAmount = value;
	}
	
	/**
	 * 成交份额,
	 */
	public Double getSuccessShare() {
		return this.successShare;
	}
	
	/**
	 * 成交份额,
	 */
	public void setSuccessShare(Double value)
	 {
		this.successShare = value;
	}
	
	/**
	 * 费率,
	 */
	public Double getFeeRate() {
		return this.feeRate;
	}
	
	/**
	 * 费率,
	 */
	public void setFeeRate(Double value)
	 {
		this.feeRate = value;
	}
	
	/**
	 * 手续费,
	 */
	public Double getFee() {
		return this.fee;
	}
	
	/**
	 * 手续费,
	 */
	public void setFee(Double value)
	 {
		this.fee = value;
	}
	
	/**
	 * 净值,
	 */
	public Double getNetValue() {
		return this.netValue;
	}
	
	/**
	 * 净值,
	 */
	public void setNetValue(Double value)
	 {
		this.netValue = value;
	}
	
	/**
	 * 接单时间,
	 */
	public java.util.Date getAcceptTime() {
		return this.acceptTime;
	}
	
	/**
	 * 接单时间,
	 */
	public void setAcceptTime(java.util.Date value)
	 {
		this.acceptTime = value;
	}
	
	/**
	 * 撤单标志,
	 */
	public String getCanCancel() {
		return this.canCancel;
	}
	
	/**
	 * 撤单标志,
	 */
	public void setCanCancel(String value)
	 {
		this.canCancel = value;
	}
	
	/**
	 * 确认码,
	 */
	public String getConfirmCode() {
		return this.confirmCode;
	}
	
	/**
	 * 确认码,
	 */
	public void setConfirmCode(String value)
	 {
		this.confirmCode = value;
	}
	
	/**
	 * 交易账号名称,
	 */
	public String getTransactionsAccountName() {
		return this.transactionsAccountName;
	}
	
	/**
	 * 交易账号名称,
	 */
	public void setTransactionsAccountName(String value)
	 {
		this.transactionsAccountName = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getFinanceType() {
		return this.financeType;
	}
	
	/**
	 * 资金方式,
	 */
	public void setFinanceType(String value)
	 {
		this.financeType = value;
	}
	
	/**
	 * 扣款状态,
	 */
	public String getWithholdStateName() {
		return this.withholdStateName;
	}
	
	/**
	 * 扣款状态,
	 */
	public void setWithholdStateName(String value)
	 {
		this.withholdStateName = value;
	}
	
	/**
	 * 转入基金,
	 */
	public String getFundCode2() {
		return this.fundCode2;
	}
	
	/**
	 * 转入基金,
	 */
	public void setFundCode2(String value)
	 {
		this.fundCode2 = value;
	}
	
	/**
	 * 转入份额类别,
	 */
	public String getShareType2() {
		return this.shareType2;
	}
	
	/**
	 * 转入份额类别,
	 */
	public void setShareType2(String value)
	 {
		this.shareType2 = value;
	}
	
	/**
	 * 赎回交易账号,
	 */
	public String getTransactionsAccount2() {
		return this.transactionsAccount2;
	}
	
	/**
	 * 赎回交易账号,
	 */
	public void setTransactionsAccount2(String value)
	 {
		this.transactionsAccount2 = value;
	}
	
	/**
	 * 备注,
	 */
	public String getExplain() {
		return this.explain;
	}
	
	/**
	 * 备注,
	 */
	public void setExplain(String value)
	 {
		this.explain = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundName() {
		return this.fundName;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundName(String value)
	 {
		this.fundName = value;
	}
	
	/**
	 * 转入基金名称,
	 */
	public String getFundName2() {
		return this.fundName2;
	}
	
	/**
	 * 转入基金名称,
	 */
	public void setFundName2(String value)
	 {
		this.fundName2 = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 明细资金方式,
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 明细资金方式,
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 银行返回错误原因,
	 */
	public String getCperrormsg() {
		return this.cperrormsg;
	}
	
	/**
	 * 银行返回错误原因,
	 */
	public void setCperrormsg(String value)
	 {
		this.cperrormsg = value;
	}
	
	/**
	 * 确认信息,
	 */
	public String getConfirmInfo() {
		return this.confirmInfo;
	}
	
	/**
	 * 确认信息,
	 */
	public void setConfirmInfo(String value)
	 {
		this.confirmInfo = value;
	}
	
	/**
	 * 所属交易日,
	 */
	public java.util.Date getRealTransactionDate() {
		return this.realTransactionDate;
	}
	
	/**
	 * 所属交易日,
	 */
	public void setRealTransactionDate(java.util.Date value)
	 {
		this.realTransactionDate = value;
	}
	
	/**
	 * 银行卡号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
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
	 * 基金账号,
	 */
	public String getFundAcco() {
		return this.fundAcco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundAcco(String value)
	 {
		this.fundAcco = value;
	}
	
	/**
	 * 对方基金账号,
	 */
	public String getOppFundAcco() {
		return this.oppFundAcco;
	}
	
	/**
	 * 对方基金账号,
	 */
	public void setOppFundAcco(String value)
	 {
		this.oppFundAcco = value;
	}
	
	/**
	 * 销售商,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 划款状态,
	 */
	public String getBackBalaceStatu() {
		return this.backBalaceStatu;
	}
	
	/**
	 * 划款状态,
	 */
	public void setBackBalaceStatu(String value)
	 {
		this.backBalaceStatu = value;
	}
}
