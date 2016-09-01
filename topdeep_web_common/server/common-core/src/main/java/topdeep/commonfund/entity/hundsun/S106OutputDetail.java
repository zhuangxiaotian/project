package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 过户入确认查询(S106)功能输出明细参数
 */
public class S106OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务错误原因,TA返回的确认原因
	 */
	private String busierrorcause = "";
	
	/**
	 * 业务错误码,0000表示成功
	 */
	private String busierrorcode = "";
	
	/**
	 * 确认金额,
	 */
	private String confirmbala = "";
	
	/**
	 * 确认工作日,
	 */
	private String confirmdate = "";
	
	/**
	 * 确认编号,
	 */
	private String confirmno = "";
	
	/**
	 * 确认份额,
	 */
	private String confirmshare = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 对方基金账号,
	 */
	private String otheracco = "";
	
	/**
	 * 对方交易账号,
	 */
	private String othertradeacco = "";
	
	/**
	 * 申请工作日,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 业务错误原因,TA返回的确认原因
	 */
	public String getBusierrorcause() {
		return this.busierrorcause;
	}
	
	/**
	 * 业务错误原因,TA返回的确认原因
	 */
	public void setBusierrorcause(String value)
	 {
		this.busierrorcause = value;
	}
	
	/**
	 * 业务错误码,0000表示成功
	 */
	public String getBusierrorcode() {
		return this.busierrorcode;
	}
	
	/**
	 * 业务错误码,0000表示成功
	 */
	public void setBusierrorcode(String value)
	 {
		this.busierrorcode = value;
	}
	
	/**
	 * 确认金额,
	 */
	public String getConfirmbala() {
		return this.confirmbala;
	}
	
	/**
	 * 确认金额,
	 */
	public void setConfirmbala(String value)
	 {
		this.confirmbala = value;
	}
	
	/**
	 * 确认工作日,
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认工作日,
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
	}
	
	/**
	 * 确认编号,
	 */
	public String getConfirmno() {
		return this.confirmno;
	}
	
	/**
	 * 确认编号,
	 */
	public void setConfirmno(String value)
	 {
		this.confirmno = value;
	}
	
	/**
	 * 确认份额,
	 */
	public String getConfirmshare() {
		return this.confirmshare;
	}
	
	/**
	 * 确认份额,
	 */
	public void setConfirmshare(String value)
	 {
		this.confirmshare = value;
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
	 * 对方基金账号,
	 */
	public String getOtheracco() {
		return this.otheracco;
	}
	
	/**
	 * 对方基金账号,
	 */
	public void setOtheracco(String value)
	 {
		this.otheracco = value;
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
}
