package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金信息查询(S010)功能输出明细参数
 */
public class S010OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 成立以来涨跌,
	 */
	private String setupinc = "";
	
	/**
	 * 今年以来涨跌,
	 */
	private String thisyearinc = "";
	
	/**
	 * 收益率,须直销34号升级到0F才有此字段
	 */
	private String preyield = "";
	
	/**
	 * 申购状态,“1”可申购
	 */
	private String declarestate = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	private String fundrisklevel = "";
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	private String fundstate = "";
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 份额类别,多个英文逗号分隔，取字典“份额类别”
	 */
	private String sharetype = "";
	
	/**
	 * 认购状态,“1”可认购
	 */
	private String subscribestate = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * 趋势定投状态,“1”可趋势定投
	 */
	private String trendstate = "";
	
	/**
	 * 定投状态,“1”可定投
	 */
	private String valuagrstate = "";
	
	/**
	 * 赎回状态,“1”可赎回（此字段表示赎回状态而非撤单状态）
	 */
	private String withdrawstate = "";
	
	/**
	 * 日涨跌,该字段为数据中心数据，非必须字段
	 */
	private String dayinc = "";
	
	/**
	 * 万份收益率,
	 */
	private String hfincomeratio = "";
	
	/**
	 * 七日年化收益率,
	 */
	private String incomeratio = "";
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”
	 */
	private String managercode = "";
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	private String navdate = "";
	
	/**
	 * 基金净值,
	 */
	private String pernetvalue = "";
	
	/**
	 * 累计净值,
	 */
	private String totalnetvalue = "";
	
	/**
	 * 基金最小持有份额,
	 */
	private String minshare = "";
	
	/**
	 * 预约申购状态,“1”可预约申购
	 */
	private String hopedeclarestate = "";
	
	/**
	 * 预期申购截至日,
	 */
	private String declareendday = "";
	
	/**
	 * 基金子类型,
	 */
	private String fundsubtype = "";
	
	/**
	 * 是否禁止现金宝赎回转购,1：禁止；0或空：不禁止
	 */
	private String isforbidbuybyredeem = "";
	
	/**
	 * 产品开放日,
	 */
	private String openday = "";
	
	/**
	 * 预期赎回截至日,
	 */
	private String redeemendday = "";
	
	/**
	 * 是否可转出,
	 */
	private String transflag = "";
	
	/**
	 * 到期日,须直销升级34号到0F才有此字段
	 */
	private String expiredate = "";
	
	/**
	 * 冻结额度,须直销升级34号到0F才有此字段
	 */
	private Double frozenlimit;
	
	/**
	 * 剩余额度,须直销升级34号到0F才有此字段
	 */
	private Double remainlimit;
	
	/**
	 * 起息日,须直销升级34号到0F才有此字段
	 */
	private String valuedate = "";
	
	/**
	 * 周涨跌,只有数据源传DC才有返回
	 */
	private String weekinc = "";
	
	/**
	 * 是否支持根据交易控制基金规模,须直销34号升级到0F才有此字段
	 */
	private String checktradelimit;
	
	/**
	 * 预期年化收益率,(专户使用)需直销升级34号到3C才有此字段
	 */
	private String expectyrr = "";
	
	/**
	 * 基金发行日,须直销34号升级到0F才有此字段
	 */
	private String issuedate = "";
	
	/**
	 * 产品期限,须直销34号升级到0F才有此字段
	 */
	private String productduetime = "";
	
	/**
	 * 月涨跌,只有数据源传DC才有返回
	 */
	private String monthinc = "";
	
	/**
	 * 季涨跌,只有数据源传DC才有返回
	 */
	private String seasonhinc = "";
	
	/**
	 * 年涨跌,只有数据源传DC才有返回
	 */
	private String yearinc = "";
	
	/**
	 * 产品识别码,需要升级HS_QUERY_34到HS_QUERY_0F才有返回值
	 */
	private String identifiedcode = "";
	
	/**
	 * 基金管理人名称,DS才会有返回值，并且需要升级直销HS_QUERY_34到HS_QUERY_0F
	 */
	private String manager = "";
	
	/**
	 * 级差,
	 */
	private Double deltabala;
	
	/**
	 * 费用扣除方式,0－价内法，1－价外法
	 */
	private String minustype;
	
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
	 * 成立以来涨跌,
	 */
	public String getSetupinc() {
		return this.setupinc;
	}
	
	/**
	 * 成立以来涨跌,
	 */
	public void setSetupinc(String value)
	 {
		this.setupinc = value;
	}
	
	/**
	 * 今年以来涨跌,
	 */
	public String getThisyearinc() {
		return this.thisyearinc;
	}
	
	/**
	 * 今年以来涨跌,
	 */
	public void setThisyearinc(String value)
	 {
		this.thisyearinc = value;
	}
	
	/**
	 * 收益率,须直销34号升级到0F才有此字段
	 */
	public String getPreyield() {
		return this.preyield;
	}
	
	/**
	 * 收益率,须直销34号升级到0F才有此字段
	 */
	public void setPreyield(String value)
	 {
		this.preyield = value;
	}
	
	/**
	 * 申购状态,“1”可申购
	 */
	public String getDeclarestate() {
		return this.declarestate;
	}
	
	/**
	 * 申购状态,“1”可申购
	 */
	public void setDeclarestate(String value)
	 {
		this.declarestate = value;
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
	 * 风险等级,取字典“基金风险等级”
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 风险等级,取字典“基金风险等级”
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,取字典“基金状态”
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 份额类别,多个英文逗号分隔，取字典“份额类别”
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,多个英文逗号分隔，取字典“份额类别”
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 认购状态,“1”可认购
	 */
	public String getSubscribestate() {
		return this.subscribestate;
	}
	
	/**
	 * 认购状态,“1”可认购
	 */
	public void setSubscribestate(String value)
	 {
		this.subscribestate = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * 趋势定投状态,“1”可趋势定投
	 */
	public String getTrendstate() {
		return this.trendstate;
	}
	
	/**
	 * 趋势定投状态,“1”可趋势定投
	 */
	public void setTrendstate(String value)
	 {
		this.trendstate = value;
	}
	
	/**
	 * 定投状态,“1”可定投
	 */
	public String getValuagrstate() {
		return this.valuagrstate;
	}
	
	/**
	 * 定投状态,“1”可定投
	 */
	public void setValuagrstate(String value)
	 {
		this.valuagrstate = value;
	}
	
	/**
	 * 赎回状态,“1”可赎回（此字段表示赎回状态而非撤单状态）
	 */
	public String getWithdrawstate() {
		return this.withdrawstate;
	}
	
	/**
	 * 赎回状态,“1”可赎回（此字段表示赎回状态而非撤单状态）
	 */
	public void setWithdrawstate(String value)
	 {
		this.withdrawstate = value;
	}
	
	/**
	 * 日涨跌,该字段为数据中心数据，非必须字段
	 */
	public String getDayinc() {
		return this.dayinc;
	}
	
	/**
	 * 日涨跌,该字段为数据中心数据，非必须字段
	 */
	public void setDayinc(String value)
	 {
		this.dayinc = value;
	}
	
	/**
	 * 万份收益率,
	 */
	public String getHfincomeratio() {
		return this.hfincomeratio;
	}
	
	/**
	 * 万份收益率,
	 */
	public void setHfincomeratio(String value)
	 {
		this.hfincomeratio = value;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public String getIncomeratio() {
		return this.incomeratio;
	}
	
	/**
	 * 七日年化收益率,
	 */
	public void setIncomeratio(String value)
	 {
		this.incomeratio = value;
	}
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码,取字典“基金管理人名称”
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	public String getNavdate() {
		return this.navdate;
	}
	
	/**
	 * 净值日期,yyyymmdd格式
	 */
	public void setNavdate(String value)
	 {
		this.navdate = value;
	}
	
	/**
	 * 基金净值,
	 */
	public String getPernetvalue() {
		return this.pernetvalue;
	}
	
	/**
	 * 基金净值,
	 */
	public void setPernetvalue(String value)
	 {
		this.pernetvalue = value;
	}
	
	/**
	 * 累计净值,
	 */
	public String getTotalnetvalue() {
		return this.totalnetvalue;
	}
	
	/**
	 * 累计净值,
	 */
	public void setTotalnetvalue(String value)
	 {
		this.totalnetvalue = value;
	}
	
	/**
	 * 基金最小持有份额,
	 */
	public String getMinshare() {
		return this.minshare;
	}
	
	/**
	 * 基金最小持有份额,
	 */
	public void setMinshare(String value)
	 {
		this.minshare = value;
	}
	
	/**
	 * 预约申购状态,“1”可预约申购
	 */
	public String getHopedeclarestate() {
		return this.hopedeclarestate;
	}
	
	/**
	 * 预约申购状态,“1”可预约申购
	 */
	public void setHopedeclarestate(String value)
	 {
		this.hopedeclarestate = value;
	}
	
	/**
	 * 预期申购截至日,
	 */
	public String getDeclareendday() {
		return this.declareendday;
	}
	
	/**
	 * 预期申购截至日,
	 */
	public void setDeclareendday(String value)
	 {
		this.declareendday = value;
	}
	
	/**
	 * 基金子类型,
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 是否禁止现金宝赎回转购,1：禁止；0或空：不禁止
	 */
	public String getIsforbidbuybyredeem() {
		return this.isforbidbuybyredeem;
	}
	
	/**
	 * 是否禁止现金宝赎回转购,1：禁止；0或空：不禁止
	 */
	public void setIsforbidbuybyredeem(String value)
	 {
		this.isforbidbuybyredeem = value;
	}
	
	/**
	 * 产品开放日,
	 */
	public String getOpenday() {
		return this.openday;
	}
	
	/**
	 * 产品开放日,
	 */
	public void setOpenday(String value)
	 {
		this.openday = value;
	}
	
	/**
	 * 预期赎回截至日,
	 */
	public String getRedeemendday() {
		return this.redeemendday;
	}
	
	/**
	 * 预期赎回截至日,
	 */
	public void setRedeemendday(String value)
	 {
		this.redeemendday = value;
	}
	
	/**
	 * 是否可转出,
	 */
	public String getTransflag() {
		return this.transflag;
	}
	
	/**
	 * 是否可转出,
	 */
	public void setTransflag(String value)
	 {
		this.transflag = value;
	}
	
	/**
	 * 到期日,须直销升级34号到0F才有此字段
	 */
	public String getExpiredate() {
		return this.expiredate;
	}
	
	/**
	 * 到期日,须直销升级34号到0F才有此字段
	 */
	public void setExpiredate(String value)
	 {
		this.expiredate = value;
	}
	
	/**
	 * 冻结额度,须直销升级34号到0F才有此字段
	 */
	public Double getFrozenlimit() {
		return this.frozenlimit;
	}
	
	/**
	 * 冻结额度,须直销升级34号到0F才有此字段
	 */
	public void setFrozenlimit(Double value)
	 {
		this.frozenlimit = value;
	}
	
	/**
	 * 剩余额度,须直销升级34号到0F才有此字段
	 */
	public Double getRemainlimit() {
		return this.remainlimit;
	}
	
	/**
	 * 剩余额度,须直销升级34号到0F才有此字段
	 */
	public void setRemainlimit(Double value)
	 {
		this.remainlimit = value;
	}
	
	/**
	 * 起息日,须直销升级34号到0F才有此字段
	 */
	public String getValuedate() {
		return this.valuedate;
	}
	
	/**
	 * 起息日,须直销升级34号到0F才有此字段
	 */
	public void setValuedate(String value)
	 {
		this.valuedate = value;
	}
	
	/**
	 * 周涨跌,只有数据源传DC才有返回
	 */
	public String getWeekinc() {
		return this.weekinc;
	}
	
	/**
	 * 周涨跌,只有数据源传DC才有返回
	 */
	public void setWeekinc(String value)
	 {
		this.weekinc = value;
	}
	
	/**
	 * 是否支持根据交易控制基金规模,须直销34号升级到0F才有此字段
	 */
	public String getChecktradelimit() {
		return this.checktradelimit;
	}
	
	/**
	 * 是否支持根据交易控制基金规模,须直销34号升级到0F才有此字段
	 */
	public void setChecktradelimit(String value)
	 {
		this.checktradelimit = value;
	}
	
	/**
	 * 预期年化收益率,(专户使用)需直销升级34号到3C才有此字段
	 */
	public String getExpectyrr() {
		return this.expectyrr;
	}
	
	/**
	 * 预期年化收益率,(专户使用)需直销升级34号到3C才有此字段
	 */
	public void setExpectyrr(String value)
	 {
		this.expectyrr = value;
	}
	
	/**
	 * 基金发行日,须直销34号升级到0F才有此字段
	 */
	public String getIssuedate() {
		return this.issuedate;
	}
	
	/**
	 * 基金发行日,须直销34号升级到0F才有此字段
	 */
	public void setIssuedate(String value)
	 {
		this.issuedate = value;
	}
	
	/**
	 * 产品期限,须直销34号升级到0F才有此字段
	 */
	public String getProductduetime() {
		return this.productduetime;
	}
	
	/**
	 * 产品期限,须直销34号升级到0F才有此字段
	 */
	public void setProductduetime(String value)
	 {
		this.productduetime = value;
	}
	
	/**
	 * 月涨跌,只有数据源传DC才有返回
	 */
	public String getMonthinc() {
		return this.monthinc;
	}
	
	/**
	 * 月涨跌,只有数据源传DC才有返回
	 */
	public void setMonthinc(String value)
	 {
		this.monthinc = value;
	}
	
	/**
	 * 季涨跌,只有数据源传DC才有返回
	 */
	public String getSeasonhinc() {
		return this.seasonhinc;
	}
	
	/**
	 * 季涨跌,只有数据源传DC才有返回
	 */
	public void setSeasonhinc(String value)
	 {
		this.seasonhinc = value;
	}
	
	/**
	 * 年涨跌,只有数据源传DC才有返回
	 */
	public String getYearinc() {
		return this.yearinc;
	}
	
	/**
	 * 年涨跌,只有数据源传DC才有返回
	 */
	public void setYearinc(String value)
	 {
		this.yearinc = value;
	}
	
	/**
	 * 产品识别码,需要升级HS_QUERY_34到HS_QUERY_0F才有返回值
	 */
	public String getIdentifiedcode() {
		return this.identifiedcode;
	}
	
	/**
	 * 产品识别码,需要升级HS_QUERY_34到HS_QUERY_0F才有返回值
	 */
	public void setIdentifiedcode(String value)
	 {
		this.identifiedcode = value;
	}
	
	/**
	 * 基金管理人名称,DS才会有返回值，并且需要升级直销HS_QUERY_34到HS_QUERY_0F
	 */
	public String getManager() {
		return this.manager;
	}
	
	/**
	 * 基金管理人名称,DS才会有返回值，并且需要升级直销HS_QUERY_34到HS_QUERY_0F
	 */
	public void setManager(String value)
	 {
		this.manager = value;
	}
	
	/**
	 * 级差,
	 */
	public Double getDeltabala() {
		return this.deltabala;
	}
	
	/**
	 * 级差,
	 */
	public void setDeltabala(Double value)
	 {
		this.deltabala = value;
	}
	
	/**
	 * 费用扣除方式,0－价内法，1－价外法
	 */
	public String getMinustype() {
		return this.minustype;
	}
	
	/**
	 * 费用扣除方式,0－价内法，1－价外法
	 */
	public void setMinustype(String value)
	 {
		this.minustype = value;
	}
}
