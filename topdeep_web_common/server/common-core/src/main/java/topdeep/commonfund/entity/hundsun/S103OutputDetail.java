package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息查询(S103)功能输出明细参数
 */
public class S103OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String balance = "";
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 业务大类,
	 */
	private String busintype = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * cookie名称,
	 */
	private String cookiename = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixbusinflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 订单组合编号,
	 */
	private String requestcombno = "";
	
	/**
	 * 订单生成日期,
	 */
	private String requestdate = "";
	
	/**
	 * 订单流水号,
	 */
	private String requestno = "";
	
	/**
	 * 订单生成时间,
	 */
	private String requesttime = "";
	
	/**
	 * 申请份额,
	 */
	private String share = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 订单状态,(1:无效;3:已提交;9:未处理;)
	 */
	private String state = "";
	
	/**
	 * 支付方式,
	 */
	private String subcapitalmode = "";
	
	/**
	 * 用户的唯一标识,
	 */
	private String uuid = "";
	
	/**
	 * 申请金额,
	 */
	public String getBalance() {
		return this.balance;
	}
	
	/**
	 * 申请金额,
	 */
	public void setBalance(String value)
	 {
		this.balance = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankno() {
		return this.bankno;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankno(String value)
	 {
		this.bankno = value;
	}
	
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
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
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
	 * cookie名称,
	 */
	public String getCookiename() {
		return this.cookiename;
	}
	
	/**
	 * cookie名称,
	 */
	public void setCookiename(String value)
	 {
		this.cookiename = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
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
	 * 订单组合编号,
	 */
	public String getRequestcombno() {
		return this.requestcombno;
	}
	
	/**
	 * 订单组合编号,
	 */
	public void setRequestcombno(String value)
	 {
		this.requestcombno = value;
	}
	
	/**
	 * 订单生成日期,
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 订单生成日期,
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 订单流水号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 订单流水号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
	
	/**
	 * 订单生成时间,
	 */
	public String getRequesttime() {
		return this.requesttime;
	}
	
	/**
	 * 订单生成时间,
	 */
	public void setRequesttime(String value)
	 {
		this.requesttime = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getShare() {
		return this.share;
	}
	
	/**
	 * 申请份额,
	 */
	public void setShare(String value)
	 {
		this.share = value;
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
	 * 订单状态,(1:无效;3:已提交;9:未处理;)
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 订单状态,(1:无效;3:已提交;9:未处理;)
	 */
	public void setState(String value)
	 {
		this.state = value;
	}
	
	/**
	 * 支付方式,
	 */
	public String getSubcapitalmode() {
		return this.subcapitalmode;
	}
	
	/**
	 * 支付方式,
	 */
	public void setSubcapitalmode(String value)
	 {
		this.subcapitalmode = value;
	}
	
	/**
	 * 用户的唯一标识,
	 */
	public String getUuid() {
		return this.uuid;
	}
	
	/**
	 * 用户的唯一标识,
	 */
	public void setUuid(String value)
	 {
		this.uuid = value;
	}
}
