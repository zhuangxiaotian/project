package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 当日交易申请查询功能输出明细参数
 */
public class DsTodayApplicationQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 交易日期,
	 */
	private String transactionDate;
	
	/**
	 * 接单时间,
	 */
	private String acceptTime;
	
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
	 * 转入基金,
	 */
	private String fundCode2;
	
	/**
	 * 份额类别,
	 */
	private String shareType;
	
	/**
	 * 转入份额类别,
	 */
	private String shareType2;
	
	/**
	 * 赎回交易账号,
	 */
	private String transactionsAccount2;
	
	/**
	 * 销售点代码,
	 */
	private String agencyNo;
	
	/**
	 * 销售点名称,
	 */
	private String agencyName;
	
	/**
	 * 业务代码,
	 */
	private String businessCode;
	
	/**
	 * 业务名称,
	 */
	private String businessName;
	
	/**
	 * 申请金额,
	 */
	private String applyAmount;
	
	/**
	 * 撤单标志０不可撤单１可撤单,
	 */
	private String canCancel;
	
	/**
	 * 银行编号,
	 */
	private String bankNo;
	
	/**
	 * 银行名称,
	 */
	private String bankName;
	
	/**
	 * 资金方式,
	 */
	private String capticalMode;
	
	/**
	 * 申请fene,
	 */
	private String applyShare;
	
	/**
	 * 交易日期,
	 */
	public String getTransactionDate() {
		return this.transactionDate;
	}
	
	/**
	 * 交易日期,
	 */
	public void setTransactionDate(String value)
	 {
		this.transactionDate = value;
	}
	
	/**
	 * 接单时间,
	 */
	public String getAcceptTime() {
		return this.acceptTime;
	}
	
	/**
	 * 接单时间,
	 */
	public void setAcceptTime(String value)
	 {
		this.acceptTime = value;
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
	 * 销售点代码,
	 */
	public String getAgencyNo() {
		return this.agencyNo;
	}
	
	/**
	 * 销售点代码,
	 */
	public void setAgencyNo(String value)
	 {
		this.agencyNo = value;
	}
	
	/**
	 * 销售点名称,
	 */
	public String getAgencyName() {
		return this.agencyName;
	}
	
	/**
	 * 销售点名称,
	 */
	public void setAgencyName(String value)
	 {
		this.agencyName = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getBusinessCode() {
		return this.businessCode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinessCode(String value)
	 {
		this.businessCode = value;
	}
	
	/**
	 * 业务名称,
	 */
	public String getBusinessName() {
		return this.businessName;
	}
	
	/**
	 * 业务名称,
	 */
	public void setBusinessName(String value)
	 {
		this.businessName = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getApplyAmount() {
		return this.applyAmount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplyAmount(String value)
	 {
		this.applyAmount = value;
	}
	
	/**
	 * 撤单标志０不可撤单１可撤单,
	 */
	public String getCanCancel() {
		return this.canCancel;
	}
	
	/**
	 * 撤单标志０不可撤单１可撤单,
	 */
	public void setCanCancel(String value)
	 {
		this.canCancel = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankNo() {
		return this.bankNo;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankNo(String value)
	 {
		this.bankNo = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankName() {
		return this.bankName;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankName(String value)
	 {
		this.bankName = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapticalMode() {
		return this.capticalMode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapticalMode(String value)
	 {
		this.capticalMode = value;
	}
	
	/**
	 * 申请fene,
	 */
	public String getApplyShare() {
		return this.applyShare;
	}
	
	/**
	 * 申请fene,
	 */
	public void setApplyShare(String value)
	 {
		this.applyShare = value;
	}
}
