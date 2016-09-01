package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金基本信息功能输出参数
 */
public class ISFundInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 法定名称,
	 */
	private String legalname;
	
	/**
	 * 基金托管人,
	 */
	private String fundtrustee;
	
	/**
	 * 基金管理人,
	 */
	private String fundadministrator;
	
	/**
	 * 基金简称,
	 */
	private String shortname;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 发行日期,
	 */
	private java.util.Date emitdate;
	
	/**
	 * 运作方式,
	 */
	private String fundkindpk;
	
	/**
	 * 基金类型,
	 */
	private String fundstyle;
	
	/**
	 * 投资目标,
	 */
	private String pub5;
	
	/**
	 * 投资策略,
	 */
	private String pub6;
	
	/**
	 * 投资范围,
	 */
	private String pub7;
	
	/**
	 * 比较基准,
	 */
	private String pub8;
	
	/**
	 * 收益分配,
	 */
	private String pub9;
	
	/**
	 * 币种,
	 */
	private String pub0;
	
	/**
	 * 小数位置,
	 */
	private Integer decimalLength;
	
	/**
	 * 基金打分,
	 */
	private Double score;
	
	/**
	 * 3个月回报率,
	 */
	private String fundThreeMonthReturnRate;
	
	/**
	 * 一年回报率,
	 */
	private String fundOneYearReturnRate;
	
	/**
	 * 今年回报率,
	 */
	private String fundThisYearReturnRate;
	
	/**
	 * 三年回报率,
	 */
	private String fundThreeYearReturnRate;
	
	/**
	 * 成立以来回报率,
	 */
	private String fundReturnRate;
	
	/**
	 * 晨星二年,
	 */
	private String cxstar2;
	
	/**
	 * 晨星三年,
	 */
	private String cxstar3;
	
	/**
	 * 晨星五年,
	 */
	private String cxstar5;
	
	private List<ISFundInfoQueryOutputDetail> detail = new ArrayList<ISFundInfoQueryOutputDetail>();
	
	public ISFundInfoQueryOutput() {
		this.setZ_funcCode("n0d");
	}
	
	/**
	 * 法定名称,
	 */
	public String getLegalname() {
		return this.legalname;
	}
	
	/**
	 * 法定名称,
	 */
	public void setLegalname(String value)
	 {
		this.legalname = value;
	}
	
	/**
	 * 基金托管人,
	 */
	public String getFundtrustee() {
		return this.fundtrustee;
	}
	
	/**
	 * 基金托管人,
	 */
	public void setFundtrustee(String value)
	 {
		this.fundtrustee = value;
	}
	
	/**
	 * 基金管理人,
	 */
	public String getFundadministrator() {
		return this.fundadministrator;
	}
	
	/**
	 * 基金管理人,
	 */
	public void setFundadministrator(String value)
	 {
		this.fundadministrator = value;
	}
	
	/**
	 * 基金简称,
	 */
	public String getShortname() {
		return this.shortname;
	}
	
	/**
	 * 基金简称,
	 */
	public void setShortname(String value)
	 {
		this.shortname = value;
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
	 * 发行日期,
	 */
	public java.util.Date getEmitdate() {
		return this.emitdate;
	}
	
	/**
	 * 发行日期,
	 */
	public void setEmitdate(java.util.Date value)
	 {
		this.emitdate = value;
	}
	
	/**
	 * 运作方式,
	 */
	public String getFundkindpk() {
		return this.fundkindpk;
	}
	
	/**
	 * 运作方式,
	 */
	public void setFundkindpk(String value)
	 {
		this.fundkindpk = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundstyle() {
		return this.fundstyle;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundstyle(String value)
	 {
		this.fundstyle = value;
	}
	
	/**
	 * 投资目标,
	 */
	public String getPub5() {
		return this.pub5;
	}
	
	/**
	 * 投资目标,
	 */
	public void setPub5(String value)
	 {
		this.pub5 = value;
	}
	
	/**
	 * 投资策略,
	 */
	public String getPub6() {
		return this.pub6;
	}
	
	/**
	 * 投资策略,
	 */
	public void setPub6(String value)
	 {
		this.pub6 = value;
	}
	
	/**
	 * 投资范围,
	 */
	public String getPub7() {
		return this.pub7;
	}
	
	/**
	 * 投资范围,
	 */
	public void setPub7(String value)
	 {
		this.pub7 = value;
	}
	
	/**
	 * 比较基准,
	 */
	public String getPub8() {
		return this.pub8;
	}
	
	/**
	 * 比较基准,
	 */
	public void setPub8(String value)
	 {
		this.pub8 = value;
	}
	
	/**
	 * 收益分配,
	 */
	public String getPub9() {
		return this.pub9;
	}
	
	/**
	 * 收益分配,
	 */
	public void setPub9(String value)
	 {
		this.pub9 = value;
	}
	
	/**
	 * 币种,
	 */
	public String getPub0() {
		return this.pub0;
	}
	
	/**
	 * 币种,
	 */
	public void setPub0(String value)
	 {
		this.pub0 = value;
	}
	
	/**
	 * 小数位置,
	 */
	public Integer getDecimalLength() {
		return this.decimalLength;
	}
	
	/**
	 * 小数位置,
	 */
	public void setDecimalLength(Integer value)
	 {
		this.decimalLength = value;
	}
	
	/**
	 * 基金打分,
	 */
	public Double getScore() {
		return this.score;
	}
	
	/**
	 * 基金打分,
	 */
	public void setScore(Double value)
	 {
		this.score = value;
	}
	
	/**
	 * 3个月回报率,
	 */
	public String getFundThreeMonthReturnRate() {
		return this.fundThreeMonthReturnRate;
	}
	
	/**
	 * 3个月回报率,
	 */
	public void setFundThreeMonthReturnRate(String value)
	 {
		this.fundThreeMonthReturnRate = value;
	}
	
	/**
	 * 一年回报率,
	 */
	public String getFundOneYearReturnRate() {
		return this.fundOneYearReturnRate;
	}
	
	/**
	 * 一年回报率,
	 */
	public void setFundOneYearReturnRate(String value)
	 {
		this.fundOneYearReturnRate = value;
	}
	
	/**
	 * 今年回报率,
	 */
	public String getFundThisYearReturnRate() {
		return this.fundThisYearReturnRate;
	}
	
	/**
	 * 今年回报率,
	 */
	public void setFundThisYearReturnRate(String value)
	 {
		this.fundThisYearReturnRate = value;
	}
	
	/**
	 * 三年回报率,
	 */
	public String getFundThreeYearReturnRate() {
		return this.fundThreeYearReturnRate;
	}
	
	/**
	 * 三年回报率,
	 */
	public void setFundThreeYearReturnRate(String value)
	 {
		this.fundThreeYearReturnRate = value;
	}
	
	/**
	 * 成立以来回报率,
	 */
	public String getFundReturnRate() {
		return this.fundReturnRate;
	}
	
	/**
	 * 成立以来回报率,
	 */
	public void setFundReturnRate(String value)
	 {
		this.fundReturnRate = value;
	}
	
	/**
	 * 晨星二年,
	 */
	public String getCxstar2() {
		return this.cxstar2;
	}
	
	/**
	 * 晨星二年,
	 */
	public void setCxstar2(String value)
	 {
		this.cxstar2 = value;
	}
	
	/**
	 * 晨星三年,
	 */
	public String getCxstar3() {
		return this.cxstar3;
	}
	
	/**
	 * 晨星三年,
	 */
	public void setCxstar3(String value)
	 {
		this.cxstar3 = value;
	}
	
	/**
	 * 晨星五年,
	 */
	public String getCxstar5() {
		return this.cxstar5;
	}
	
	/**
	 * 晨星五年,
	 */
	public void setCxstar5(String value)
	 {
		this.cxstar5 = value;
	}
	
	public List<ISFundInfoQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
