package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户申请审批状态查询(S050)功能输出明细参数
 */
public class S050OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请状态,
	 */
	private String checkflag;
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 外部客户编号,0未审批，1审批通过，3审批不通过
	 */
	private String extcustno = "";
	
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
	 * 申请状态,
	 */
	public String getCheckflag() {
		return this.checkflag;
	}
	
	/**
	 * 申请状态,
	 */
	public void setCheckflag(String value)
	 {
		this.checkflag = value;
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
	 * 网点代码,
	 */
	public String getNetno() {
		return this.netno;
	}
	
	/**
	 * 网点代码,
	 */
	public void setNetno(String value)
	 {
		this.netno = value;
	}
	
	/**
	 * 申请日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 外部客户编号,0未审批，1审批通过，3审批不通过
	 */
	public String getExtcustno() {
		return this.extcustno;
	}
	
	/**
	 * 外部客户编号,0未审批，1审批通过，3审批不通过
	 */
	public void setExtcustno(String value)
	 {
		this.extcustno = value;
	}
}
