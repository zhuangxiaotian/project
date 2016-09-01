package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人佣金信息查询(S027)功能输出明细参数
 */
public class S027OutputDetail extends Object implements Serializable {
	
	/**
	 * 经纪人,
	 */
	private String broker = "";
	
	/**
	 * 日期,
	 */
	private String date = "";
	
	/**
	 * 手续费收益,
	 */
	private String dealfare = "";
	
	/**
	 * 管理费收益,
	 */
	private String fare = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 计提日期,
	 */
	private String getdate = "";
	
	/**
	 * 基金净值,
	 */
	private String netvalue = "";
	
	/**
	 * 尾随佣金,
	 */
	private String pay = "";
	
	/**
	 * 管理费报酬率,
	 */
	private String payratio = "";
	
	/**
	 * 赎回费收益,
	 */
	private String redeemfare = "";
	
	/**
	 * 销售服务费贡献,
	 */
	private String servicefare = "";
	
	/**
	 * 销售服务费,
	 */
	private String servicepay = "";
	
	/**
	 * 销售服务费报酬率,
	 */
	private String servicepaypayratio = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 保有份额,
	 */
	private String totalshare = "";
	
	/**
	 * 保有市值,
	 */
	private String totalvalue = "";
	
	/**
	 * 经纪人,
	 */
	public String getBroker() {
		return this.broker;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBroker(String value)
	 {
		this.broker = value;
	}
	
	/**
	 * 日期,
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 日期,
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
	
	/**
	 * 手续费收益,
	 */
	public String getDealfare() {
		return this.dealfare;
	}
	
	/**
	 * 手续费收益,
	 */
	public void setDealfare(String value)
	 {
		this.dealfare = value;
	}
	
	/**
	 * 管理费收益,
	 */
	public String getFare() {
		return this.fare;
	}
	
	/**
	 * 管理费收益,
	 */
	public void setFare(String value)
	 {
		this.fare = value;
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
	 * 计提日期,
	 */
	public String getGetdate() {
		return this.getdate;
	}
	
	/**
	 * 计提日期,
	 */
	public void setGetdate(String value)
	 {
		this.getdate = value;
	}
	
	/**
	 * 基金净值,
	 */
	public String getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setNetvalue(String value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 尾随佣金,
	 */
	public String getPay() {
		return this.pay;
	}
	
	/**
	 * 尾随佣金,
	 */
	public void setPay(String value)
	 {
		this.pay = value;
	}
	
	/**
	 * 管理费报酬率,
	 */
	public String getPayratio() {
		return this.payratio;
	}
	
	/**
	 * 管理费报酬率,
	 */
	public void setPayratio(String value)
	 {
		this.payratio = value;
	}
	
	/**
	 * 赎回费收益,
	 */
	public String getRedeemfare() {
		return this.redeemfare;
	}
	
	/**
	 * 赎回费收益,
	 */
	public void setRedeemfare(String value)
	 {
		this.redeemfare = value;
	}
	
	/**
	 * 销售服务费贡献,
	 */
	public String getServicefare() {
		return this.servicefare;
	}
	
	/**
	 * 销售服务费贡献,
	 */
	public void setServicefare(String value)
	 {
		this.servicefare = value;
	}
	
	/**
	 * 销售服务费,
	 */
	public String getServicepay() {
		return this.servicepay;
	}
	
	/**
	 * 销售服务费,
	 */
	public void setServicepay(String value)
	 {
		this.servicepay = value;
	}
	
	/**
	 * 销售服务费报酬率,
	 */
	public String getServicepaypayratio() {
		return this.servicepaypayratio;
	}
	
	/**
	 * 销售服务费报酬率,
	 */
	public void setServicepaypayratio(String value)
	 {
		this.servicepaypayratio = value;
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
	 * 保有份额,
	 */
	public String getTotalshare() {
		return this.totalshare;
	}
	
	/**
	 * 保有份额,
	 */
	public void setTotalshare(String value)
	 {
		this.totalshare = value;
	}
	
	/**
	 * 保有市值,
	 */
	public String getTotalvalue() {
		return this.totalvalue;
	}
	
	/**
	 * 保有市值,
	 */
	public void setTotalvalue(String value)
	 {
		this.totalvalue = value;
	}
}
