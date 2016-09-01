package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收支明细查询(S093)功能输出明细参数
 */
public class S093OutputDetail extends Object implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 发生后资产，余额,
	 */
	private String endasset = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 发生金额,
	 */
	private String ocurrbala = "";
	
	/**
	 * 发生日期,
	 */
	private String ocurrdate = "";
	
	/**
	 * 发生时间,
	 */
	private String ocurrtime = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 申请编号,
	 */
	private String partnerrequestno = "";
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 发生后资产，余额,
	 */
	public String getEndasset() {
		return this.endasset;
	}
	
	/**
	 * 发生后资产，余额,
	 */
	public void setEndasset(String value)
	 {
		this.endasset = value;
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
	 * 发生金额,
	 */
	public String getOcurrbala() {
		return this.ocurrbala;
	}
	
	/**
	 * 发生金额,
	 */
	public void setOcurrbala(String value)
	 {
		this.ocurrbala = value;
	}
	
	/**
	 * 发生日期,
	 */
	public String getOcurrdate() {
		return this.ocurrdate;
	}
	
	/**
	 * 发生日期,
	 */
	public void setOcurrdate(String value)
	 {
		this.ocurrdate = value;
	}
	
	/**
	 * 发生时间,
	 */
	public String getOcurrtime() {
		return this.ocurrtime;
	}
	
	/**
	 * 发生时间,
	 */
	public void setOcurrtime(String value)
	 {
		this.ocurrtime = value;
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
	public String getPartnerrequestno() {
		return this.partnerrequestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setPartnerrequestno(String value)
	 {
		this.partnerrequestno = value;
	}
}
