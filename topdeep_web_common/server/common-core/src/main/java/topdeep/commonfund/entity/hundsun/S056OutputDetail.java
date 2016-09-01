package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易申请查询(S056)功能输出明细参数
 */
public class S056OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请日期,
	 */
	private Double applydate;
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请金额,
	 */
	private String applysum;
	
	/**
	 * 网点代码,
	 */
	private String branchno = "";
	
	/**
	 * 业务代码,
	 */
	private Double callingcode;
	
	/**
	 * 确认标志,
	 */
	private String confirmflag;
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 扣款状态,取字典“申请校验”
	 */
	private String kkstat = "";
	
	/**
	 * 发生后余额,当前这条交易申请发生后，该账户的余额
	 */
	private String endasset = "";
	
	/**
	 * 申请份额,
	 */
	private String enshare = "";
	
	private List<S056OutputDetail> detail = new ArrayList<S056OutputDetail>();
	
	/**
	 * 申请日期,
	 */
	public Double getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(Double value)
	 {
		this.applydate = value;
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
	 * 申请金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 网点代码,
	 */
	public String getBranchno() {
		return this.branchno;
	}
	
	/**
	 * 网点代码,
	 */
	public void setBranchno(String value)
	 {
		this.branchno = value;
	}
	
	/**
	 * 业务代码,
	 */
	public Double getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(Double value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
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
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
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
	 * 扣款状态,取字典“申请校验”
	 */
	public String getKkstat() {
		return this.kkstat;
	}
	
	/**
	 * 扣款状态,取字典“申请校验”
	 */
	public void setKkstat(String value)
	 {
		this.kkstat = value;
	}
	
	/**
	 * 发生后余额,当前这条交易申请发生后，该账户的余额
	 */
	public String getEndasset() {
		return this.endasset;
	}
	
	/**
	 * 发生后余额,当前这条交易申请发生后，该账户的余额
	 */
	public void setEndasset(String value)
	 {
		this.endasset = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getEnshare() {
		return this.enshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setEnshare(String value)
	 {
		this.enshare = value;
	}
	
	public List<S056OutputDetail> getDetail() {
		return this.detail;
	}
	
}
