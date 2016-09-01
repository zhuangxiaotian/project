package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道账户明细查询(B018)功能输出明细参数
 */
public class B018OutputDetail extends Object implements Serializable {
	
	/**
	 * 实际金额,
	 */
	private String acctBal = "单位为元";
	
	/**
	 * 借贷标志,
	 */
	private String dcFlag = "C – 贷记，表示资金转入 D – 借记，表示资金转出";
	
	/**
	 * 基金代码,
	 */
	private String fundCode = "";
	
	/**
	 * 汇付流水号,
	 */
	private String pnrSeqId = "";
	
	/**
	 * 交易金额,
	 */
	private String transAmt = "单位为元";
	
	/**
	 * 银联cd号,
	 */
	private String usrId = "";
	
	/**
	 * 实际金额,
	 */
	public String getAcctBal() {
		return this.acctBal;
	}
	
	/**
	 * 实际金额,
	 */
	public void setAcctBal(String value)
	 {
		this.acctBal = value;
	}
	
	/**
	 * 借贷标志,
	 */
	public String getDcFlag() {
		return this.dcFlag;
	}
	
	/**
	 * 借贷标志,
	 */
	public void setDcFlag(String value)
	 {
		this.dcFlag = value;
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
	 * 汇付流水号,
	 */
	public String getPnrSeqId() {
		return this.pnrSeqId;
	}
	
	/**
	 * 汇付流水号,
	 */
	public void setPnrSeqId(String value)
	 {
		this.pnrSeqId = value;
	}
	
	/**
	 * 交易金额,
	 */
	public String getTransAmt() {
		return this.transAmt;
	}
	
	/**
	 * 交易金额,
	 */
	public void setTransAmt(String value)
	 {
		this.transAmt = value;
	}
	
	/**
	 * 银联cd号,
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * 银联cd号,
	 */
	public void setUsrId(String value)
	 {
		this.usrId = value;
	}
}
