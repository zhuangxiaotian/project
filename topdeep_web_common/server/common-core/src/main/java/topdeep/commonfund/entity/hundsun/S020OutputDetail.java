package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 短期理财明细查询(S020)功能输出明细参数
 */
public class S020OutputDetail extends Object implements Serializable {
	
	/**
	 * 到期日期,
	 */
	private String enddate = "";
	
	/**
	 * 短期理财代码,
	 */
	private String fundcode = "";
	
	/**
	 * 短期理财名称,
	 */
	private String fundname = "";
	
	/**
	 * 份额余额,
	 */
	private String remainshares = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 销售机构,直销接口查询不支持
	 */
	private String agencyname = "";
	
	/**
	 * 银行卡号,关联银行卡号
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,关联银行名称
	 */
	private String bankname = "";
	
	/**
	 * 分红方式,取字典“分红方式”，直销接口查询包含此字段
	 */
	private String bonustype = "";
	
	/**
	 * 违约赎回标志,1-违约,0-不违约,2-支持违约赎回,3-到期日小于交易日，不显示任何按钮；直销接口查询包含此字段
	 */
	private String breakredeemflag = "";
	
	/**
	 * 交易冻结份额,直销接口查询包含此字段
	 */
	private String freezeremainshare = "";
	
	/**
	 * 基金账号,直销接口查询包含此字段
	 */
	private String fundacco = "";
	
	/**
	 * 注册日期,直销接口查询不支持
	 */
	private String registdate = "";
	
	/**
	 * 份额类别,取字典“份额类别”，直销接口和数据中心查询都包含此字段
	 */
	private String sharetype = "";
	
	/**
	 * 总份额,直销接口查询包含此字段
	 */
	private String totalshare = "";
	
	/**
	 * 未付收益,直销和数据中心接口查询都包含此字段
	 */
	private String unpayprofit = "";
	
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
	 * 销售机构,直销接口查询不支持
	 */
	public String getAgencyname() {
		return this.agencyname;
	}
	
	/**
	 * 销售机构,直销接口查询不支持
	 */
	public void setAgencyname(String value)
	 {
		this.agencyname = value;
	}
	
	/**
	 * 银行卡号,关联银行卡号
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,关联银行卡号
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,关联银行名称
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,关联银行名称
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 分红方式,取字典“分红方式”，直销接口查询包含此字段
	 */
	public String getBonustype() {
		return this.bonustype;
	}
	
	/**
	 * 分红方式,取字典“分红方式”，直销接口查询包含此字段
	 */
	public void setBonustype(String value)
	 {
		this.bonustype = value;
	}
	
	/**
	 * 违约赎回标志,1-违约,0-不违约,2-支持违约赎回,3-到期日小于交易日，不显示任何按钮；直销接口查询包含此字段
	 */
	public String getBreakredeemflag() {
		return this.breakredeemflag;
	}
	
	/**
	 * 违约赎回标志,1-违约,0-不违约,2-支持违约赎回,3-到期日小于交易日，不显示任何按钮；直销接口查询包含此字段
	 */
	public void setBreakredeemflag(String value)
	 {
		this.breakredeemflag = value;
	}
	
	/**
	 * 交易冻结份额,直销接口查询包含此字段
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 交易冻结份额,直销接口查询包含此字段
	 */
	public void setFreezeremainshare(String value)
	 {
		this.freezeremainshare = value;
	}
	
	/**
	 * 基金账号,直销接口查询包含此字段
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,直销接口查询包含此字段
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 注册日期,直销接口查询不支持
	 */
	public String getRegistdate() {
		return this.registdate;
	}
	
	/**
	 * 注册日期,直销接口查询不支持
	 */
	public void setRegistdate(String value)
	 {
		this.registdate = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，直销接口和数据中心查询都包含此字段
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，直销接口和数据中心查询都包含此字段
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 总份额,直销接口查询包含此字段
	 */
	public String getTotalshare() {
		return this.totalshare;
	}
	
	/**
	 * 总份额,直销接口查询包含此字段
	 */
	public void setTotalshare(String value)
	 {
		this.totalshare = value;
	}
	
	/**
	 * 未付收益,直销和数据中心接口查询都包含此字段
	 */
	public String getUnpayprofit() {
		return this.unpayprofit;
	}
	
	/**
	 * 未付收益,直销和数据中心接口查询都包含此字段
	 */
	public void setUnpayprofit(String value)
	 {
		this.unpayprofit = value;
	}
}
