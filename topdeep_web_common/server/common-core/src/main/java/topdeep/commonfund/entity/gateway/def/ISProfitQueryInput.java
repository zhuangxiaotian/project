package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 盈亏查询功能输入参数
 */
public class ISProfitQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	private String begindate;
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	private String enddate;
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	private String factor;
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	private String filtervenue;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	private String querytype;
	
	/**
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	private String supportcloseacco;
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	private String agencyno;
	
	public ISProfitQueryInput() {
		this.setZ_funcCode("u1h");
	}
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 起始日期,日期格式：yyyyMMdd
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,日期格式：yyyyMMdd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	public String getFactor() {
		return this.factor;
	}
	
	/**
	 * 查询要素,1：为基金帐号；2：基金帐号+基金代码（默认）；3：基金帐号+基金代码+份额类别；4：基金帐号+基金代码+份额类别+销售商
	 */
	public void setFactor(String value)
	 {
		this.factor = value;
	}
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	public String getFiltervenue() {
		return this.filtervenue;
	}
	
	/**
	 * 是否查明细,0：检查 1：不检查（默认）
	 */
	public void setFiltervenue(String value)
	 {
		this.filtervenue = value;
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
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询条件,1：普通；3：上投专用；空：南方专用
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	public String getSupportcloseacco() {
		return this.supportcloseacco;
	}
	
	/**
	 * 是否支持销户用户,0：不支持（默认）1：支持
	 */
	public void setSupportcloseacco(String value)
	 {
		this.supportcloseacco = value;
	}
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,仅当querytype=1时有效
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
}
