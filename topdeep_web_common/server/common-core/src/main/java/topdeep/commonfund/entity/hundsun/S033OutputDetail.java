package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 账户成交查询(S033)功能输出明细参数
 */
public class S033OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 确认编号,
	 */
	private String confirmno = "";
	
	/**
	 * 客户类型,
	 */
	private String custtype = "";
	
	/**
	 * 冻结方式,
	 */
	private String frozencause = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 网点代码,
	 */
	private String netno = "";
	
	/**
	 * 申请日期,
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 出错信息,
	 */
	private String tradeerrorcause = "";
	
	/**
	 * 交易处理返回代码,
	 */
	private String tradeerrorcode = "";
	
	/**
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 确认日期,
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
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
	 * 客户类型,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 冻结方式,
	 */
	public String getFrozencause() {
		return this.frozencause;
	}
	
	/**
	 * 冻结方式,
	 */
	public void setFrozencause(String value)
	 {
		this.frozencause = value;
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
	 * 出错信息,
	 */
	public String getTradeerrorcause() {
		return this.tradeerrorcause;
	}
	
	/**
	 * 出错信息,
	 */
	public void setTradeerrorcause(String value)
	 {
		this.tradeerrorcause = value;
	}
	
	/**
	 * 交易处理返回代码,
	 */
	public String getTradeerrorcode() {
		return this.tradeerrorcode;
	}
	
	/**
	 * 交易处理返回代码,
	 */
	public void setTradeerrorcode(String value)
	 {
		this.tradeerrorcode = value;
	}
}
