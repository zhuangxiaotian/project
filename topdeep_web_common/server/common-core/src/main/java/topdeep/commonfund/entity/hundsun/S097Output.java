package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户资产查询(S097)
 */
public class S097Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 现金宝市值,基金代码=系统配置的现金宝基金代码的总市值
	 */
	private String moneyfundcapital = "";
	
	/**
	 * 普通基金市值,非专户基金总市值
	 */
	private String normalfundcapital = "";
	
	/**
	 * 专户基金市值,
	 */
	private String spfundcapital = "";
	
	/**
	 * 总市值,
	 */
	private String totalcapital = "";
	
	/**
	 * 日总收益,列表中各条记录当日收益的累加
	 */
	private String totaldayincome = "";
	
	/**
	 * 持仓总收益,列表中各条记录持仓收益的累加
	 */
	private String totalhodlingshareincome = "";
	
	/**
	 * 累计收益,列表中各条记录累计收益的累加
	 */
	private String totalincome = "";
	
	/**
	 * 日总收益率,
	 */
	private String totalincomeratio = "";
	
	private List<S097OutputDetail> detail = new ArrayList<S097OutputDetail>();
	
	/**
	 * 现金宝市值,基金代码=系统配置的现金宝基金代码的总市值
	 */
	public String getMoneyfundcapital() {
		return this.moneyfundcapital;
	}
	
	/**
	 * 现金宝市值,基金代码=系统配置的现金宝基金代码的总市值
	 */
	public void setMoneyfundcapital(String value)
	 {
		this.moneyfundcapital = value;
	}
	
	/**
	 * 普通基金市值,非专户基金总市值
	 */
	public String getNormalfundcapital() {
		return this.normalfundcapital;
	}
	
	/**
	 * 普通基金市值,非专户基金总市值
	 */
	public void setNormalfundcapital(String value)
	 {
		this.normalfundcapital = value;
	}
	
	/**
	 * 专户基金市值,
	 */
	public String getSpfundcapital() {
		return this.spfundcapital;
	}
	
	/**
	 * 专户基金市值,
	 */
	public void setSpfundcapital(String value)
	 {
		this.spfundcapital = value;
	}
	
	/**
	 * 总市值,
	 */
	public String getTotalcapital() {
		return this.totalcapital;
	}
	
	/**
	 * 总市值,
	 */
	public void setTotalcapital(String value)
	 {
		this.totalcapital = value;
	}
	
	/**
	 * 日总收益,列表中各条记录当日收益的累加
	 */
	public String getTotaldayincome() {
		return this.totaldayincome;
	}
	
	/**
	 * 日总收益,列表中各条记录当日收益的累加
	 */
	public void setTotaldayincome(String value)
	 {
		this.totaldayincome = value;
	}
	
	/**
	 * 持仓总收益,列表中各条记录持仓收益的累加
	 */
	public String getTotalhodlingshareincome() {
		return this.totalhodlingshareincome;
	}
	
	/**
	 * 持仓总收益,列表中各条记录持仓收益的累加
	 */
	public void setTotalhodlingshareincome(String value)
	 {
		this.totalhodlingshareincome = value;
	}
	
	/**
	 * 累计收益,列表中各条记录累计收益的累加
	 */
	public String getTotalincome() {
		return this.totalincome;
	}
	
	/**
	 * 累计收益,列表中各条记录累计收益的累加
	 */
	public void setTotalincome(String value)
	 {
		this.totalincome = value;
	}
	
	/**
	 * 日总收益率,
	 */
	public String getTotalincomeratio() {
		return this.totalincomeratio;
	}
	
	/**
	 * 日总收益率,
	 */
	public void setTotalincomeratio(String value)
	 {
		this.totalincomeratio = value;
	}
	
	public List<S097OutputDetail> getDetail() {
		return this.detail;
	}
	
}
