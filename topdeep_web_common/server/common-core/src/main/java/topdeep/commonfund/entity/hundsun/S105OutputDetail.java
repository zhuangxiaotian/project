package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 过户入申请查询(S105)功能输出明细参数
 */
public class S105OutputDetail extends Object implements Serializable {
	
	/**
	 * 确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	private String confirmflag = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 申请金额,
	 */
	private String requestbala = "";
	
	/**
	 * 申请工作日,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 申请份额,
	 */
	private String requestshare = "";
	
	/**
	 * 申请时间,
	 */
	private String requesttime = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	private String state = "";
	
	/**
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	private String status = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
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
	 * 对方交易账号,
	 */
	public String getOthertradeacco() {
		return this.othertradeacco;
	}
	
	/**
	 * 对方交易账号,
	 */
	public void setOthertradeacco(String value)
	 {
		this.othertradeacco = value;
	}
	
	/**
	 * 申请金额,
	 */
	public String getRequestbala() {
		return this.requestbala;
	}
	
	/**
	 * 申请金额,
	 */
	public void setRequestbala(String value)
	 {
		this.requestbala = value;
	}
	
	/**
	 * 申请工作日,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请工作日,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	/**
	 * 申请时间,
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 申请时间,
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
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
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * 划款状态,资金是否已经扣除或冻结等。0-未校验、1-无效、2－有效 做了份额冻结或资金冻结后有效；校验有效的交易才能发送到TA 最普通的申购后立即冻结资金，冻结资金后该字段为有效
	 */
	public void setStatus(String value)
	 {
		this.status = value;
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
}
