package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 短期理财明细查询功能输出明细参数
 */
public class ISShortMoneyDetailQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 销售机构,
	 */
	private String agencyname;
	
	/**
	 * 分红方式,1-违约,0-不违约,2-支持违约赎回；直销接口查询包含此字段
	 */
	private String bonustype;
	
	/**
	 * 违约赎回标志,
	 */
	private String breakredeemflag;
	
	/**
	 * 到期日期,
	 */
	private String enddate;
	
	/**
	 * 交易冻结份额,
	 */
	private String freezeremainshare;
	
	/**
	 * 基金账号,
	 */
	private String fundacco;
	
	/**
	 * 短期理财代码,
	 */
	private String fundcode;
	
	/**
	 * 短期理财名称,
	 */
	private String fundname;
	
	/**
	 * 注册日期,
	 */
	private String registdate;
	
	/**
	 * 份额余额,
	 */
	private String remainshares;
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 总份额,
	 */
	private String totalshare;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco;
	
	/**
	 * 未付收益,
	 */
	private String unpayprofit;
	
	/**
	 * 销售机构,
	 */
	public String getAgencyname() {
		return this.agencyname;
	}
	
	/**
	 * 销售机构,
	 */
	public void setAgencyname(String value)
	 {
		this.agencyname = value;
	}
	
	/**
	 * 分红方式,1-违约,0-不违约,2-支持违约赎回；直销接口查询包含此字段
	 */
	public String getBonustype() {
		return this.bonustype;
	}
	
	/**
	 * 分红方式,1-违约,0-不违约,2-支持违约赎回；直销接口查询包含此字段
	 */
	public void setBonustype(String value)
	 {
		this.bonustype = value;
	}
	
	/**
	 * 违约赎回标志,
	 */
	public String getBreakredeemflag() {
		return this.breakredeemflag;
	}
	
	/**
	 * 违约赎回标志,
	 */
	public void setBreakredeemflag(String value)
	 {
		this.breakredeemflag = value;
	}
	
	/**
	 * 到期日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 到期日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 交易冻结份额,
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
	 * 短期理财代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 短期理财代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 短期理财名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 短期理财名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 注册日期,
	 */
	public String getRegistdate() {
		return this.registdate;
	}
	
	/**
	 * 注册日期,
	 */
	public void setRegistdate(String value)
	 {
		this.registdate = value;
	}
	
	/**
	 * 份额余额,
	 */
	public String getRemainshares() {
		return this.remainshares;
	}
	
	/**
	 * 份额余额,
	 */
	public void setRemainshares(String value)
	 {
		this.remainshares = value;
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
	 * 总份额,
	 */
	public String getTotalshare() {
		return this.totalshare;
	}
	
	/**
	 * 总份额,
	 */
	public void setTotalshare(String value)
	 {
		this.totalshare = value;
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
	public String getUnpayprofit() {
		return this.unpayprofit;
	}
	
	/**
	 * 未付收益,
	 */
	public void setUnpayprofit(String value)
	 {
		this.unpayprofit = value;
	}
}
