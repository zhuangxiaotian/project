package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金份额查询（整合模式）(S076)功能输出明细参数
 */
public class S076OutputDetail extends Object implements Serializable {
	
	/**
	 * 销售类型,0:直销, 1:代销
	 */
	private String agencytype = "";
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”datasource=DS, ets非eq模式下有效
	 */
	private String bankcustomname = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 当前份额余额,
	 */
	private String currentremainshare = "";
	
	/**
	 * 冻结份额余额,
	 */
	private String freezeremainshare = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 分红方式,取字典“分红方式”，"0":红利再投资,"1":现金红利
	 */
	private String melonmethod = "";
	
	/**
	 * 单位净值,
	 */
	private String pernetvalue = "";
	
	/**
	 * 超级现金宝可赎回份额,超级现金宝可用于赎回业务操作的份额
	 */
	private String redeemableshare = "";
	
	/**
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	private String sharetype = "";
	
	/**
	 * 交易冻结份额,
	 */
	private String tfreezeremainshare = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 超级现金宝可转换份额,超级现金宝可用于转换业务操作的份额（用于适应超级现金宝业务）
	 */
	private String transableshare = "";
	
	/**
	 * 可用份额余额,
	 */
	private String usableremainshare = "";
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	private String agencyno = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 当日收益,
	 */
	private String dayincome = "";
	
	/**
	 * 到期可用余额,超短期理财产品赎回、赎回转购时的可赎回余额
	 */
	private String expireshares = "";
	
	/**
	 * 快速赎回可用份额,如果快速赎回没有比例限制则返回值与可用份额余额相同
	 */
	private String ftmaxsharelimit = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金状态,
	 */
	private String fundstate = "";
	
	/**
	 * 份额基金类别,
	 */
	private String fundtype = "";
	
	/**
	 * 基金市值,
	 */
	private String marketvalue = "";
	
	/**
	 * 净值日期,yyyy-MM-dd格式字符串
	 */
	private String navdate = "";
	
	/**
	 * 份额分类,静态份额的分类，普通份额返回空，组合理财份额返回‘0’
	 */
	private String sharekind = "";
	
	/**
	 * 累计收益,
	 */
	private String totalincome = "";
	
	/**
	 * 未付收益,
	 */
	private String unpaidincome = "";
	
	/**
	 * 销售类型,0:直销, 1:代销
	 */
	public String getAgencytype() {
		return this.agencytype;
	}
	
	/**
	 * 销售类型,0:直销, 1:代销
	 */
	public void setAgencytype(String value)
	 {
		this.agencytype = value;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”datasource=DS, ets非eq模式下有效
	 */
	public String getBankcustomname() {
		return this.bankcustomname;
	}
	
	/**
	 * 个性化银行名称,取字典“FUNDAPI银行名称”datasource=DS, ets非eq模式下有效
	 */
	public void setBankcustomname(String value)
	 {
		this.bankcustomname = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 当前份额余额,
	 */
	public String getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 当前份额余额,
	 */
	public void setCurrentremainshare(String value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 冻结份额余额,
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 冻结份额余额,
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
	 * 分红方式,取字典“分红方式”，"0":红利再投资,"1":现金红利
	 */
	public String getMelonmethod() {
		return this.melonmethod;
	}
	
	/**
	 * 分红方式,取字典“分红方式”，"0":红利再投资,"1":现金红利
	 */
	public void setMelonmethod(String value)
	 {
		this.melonmethod = value;
	}
	
	/**
	 * 单位净值,
	 */
	public String getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 单位净值,
	 */
	public void setPernetvalue(String value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 超级现金宝可赎回份额,超级现金宝可用于赎回业务操作的份额
	 */
	public String getRedeemableshare() {
		return this.redeemableshare;
	}
	
	/**
	 * 超级现金宝可赎回份额,超级现金宝可用于赎回业务操作的份额
	 */
	public void setRedeemableshare(String value)
	 {
		this.redeemableshare = value;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public String getTfreezeremainshare() {
		return this.tfreezeremainshare;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public void setTfreezeremainshare(String value)
	 {
		this.tfreezeremainshare = value;
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
	 * 超级现金宝可转换份额,超级现金宝可用于转换业务操作的份额（用于适应超级现金宝业务）
	 */
	public String getTransableshare() {
		return this.transableshare;
	}
	
	/**
	 * 超级现金宝可转换份额,超级现金宝可用于转换业务操作的份额（用于适应超级现金宝业务）
	 */
	public void setTransableshare(String value)
	 {
		this.transableshare = value;
	}
	
	/**
	 * 可用份额余额,
	 */
	public String getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额余额,
	 */
	public void setUsableremainshare(String value)
	 {
		this.usableremainshare = value;
	}
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,销售商名称取字典“EQAgencyName”
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
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
	 * 到期可用余额,超短期理财产品赎回、赎回转购时的可赎回余额
	 */
	public String getExpireshares() {
		return this.expireshares;
	}
	
	/**
	 * 到期可用余额,超短期理财产品赎回、赎回转购时的可赎回余额
	 */
	public void setExpireshares(String value)
	 {
		this.expireshares = value;
	}
	
	/**
	 * 快速赎回可用份额,如果快速赎回没有比例限制则返回值与可用份额余额相同
	 */
	public String getFtmaxsharelimit() {
		return this.ftmaxsharelimit;
	}
	
	/**
	 * 快速赎回可用份额,如果快速赎回没有比例限制则返回值与可用份额余额相同
	 */
	public void setFtmaxsharelimit(String value)
	 {
		this.ftmaxsharelimit = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 份额基金类别,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 份额基金类别,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 基金市值,
	 */
	public String getMarketvalue() {
		return this.marketvalue;
	}
	
	/**
	 * 基金市值,
	 */
	public void setMarketvalue(String value)
	 {
		this.marketvalue = value;
	}
	
	/**
	 * 净值日期,yyyy-MM-dd格式字符串
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,yyyy-MM-dd格式字符串
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 份额分类,静态份额的分类，普通份额返回空，组合理财份额返回‘0’
	 */
	public String getSharekind() {
		return this.sharekind;
	}
	
	/**
	 * 份额分类,静态份额的分类，普通份额返回空，组合理财份额返回‘0’
	 */
	public void setSharekind(String value)
	 {
		this.sharekind = value;
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
}
