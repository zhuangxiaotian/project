package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 份额流水查询功能输出明细参数
 */
public class ISShareWaterQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 销售机构编号,
	 */
	private String agencyno;
	
	/**
	 * 确认日期,
	 */
	private String confirmdate;
	
	/**
	 * 本次基金余额,
	 */
	private String currentremainshare;
	
	/**
	 * 当日收益,
	 */
	private String dayincome;
	
	/**
	 * 冻结份额,
	 */
	private String freezeremainshare;
	
	/**
	 * 基金账号,
	 */
	private String fundacco;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 分红方式,
	 */
	private String melonmethod;
	
	/**
	 * 收费方式,
	 */
	private String sharetype;
	
	/**
	 * 累计收益,
	 */
	private String totalincome;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco;
	
	/**
	 * 未付收益,
	 */
	private String unpaidincome;
	
	/**
	 * 可用份额,
	 */
	private String usableremainshare;
	
	/**
	 * 销售机构编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售机构编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
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
	 * 本次基金余额,
	 */
	public String getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 本次基金余额,
	 */
	public void setCurrentremainshare(String value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 当日收益,
	 */
	public String getDayincome() {
		return this.dayincome;
	}
	
	/**
	 * 当日收益,
	 */
	public void setDayincome(String value)
	 {
		this.dayincome = value;
	}
	
	/**
	 * 冻结份额,
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 冻结份额,
	 */
	public void setFreezeremainshare(String value)
	 {
		this.freezeremainshare = value;
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
	 * 分红方式,
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 累计收益,
	 */
	public String getTotalincome() {
		return this.totalincome;
	}
	
	/**
	 * 累计收益,
	 */
	public void setTotalincome(String value)
	 {
		this.totalincome = value;
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
	 * 未付收益,
	 */
	public String getUnpaidincome() {
		return this.unpaidincome;
	}
	
	/**
	 * 未付收益,
	 */
	public void setUnpaidincome(String value)
	 {
		this.unpaidincome = value;
	}
	
	/**
	 * 可用份额,
	 */
	public String getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额,
	 */
	public void setUsableremainshare(String value)
	 {
		this.usableremainshare = value;
	}
}
