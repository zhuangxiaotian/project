package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投申购协议变更(I007)
 */
public class I007Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	private String cycleunit;
	
	/**
	 * 交易日期,日期的后两位
	 */
	private String jyrq = "";
	
	/**
	 * 交易周期,
	 */
	private String jyzq = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	private String xyh = "";
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	private String zzrq = "99991231";
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	private String state = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 投资区间方案编号,exptype=07或08时必填
	 */
	private String sectionschemano = "";
	
	/**
	 * 申购金额,
	 */
	private String applysum = "";
	
	/**
	 * 申购金额高,exptype为"02"必填
	 */
	private String applysum1 = "";
	
	/**
	 * 申购金额中,exptype为"02"必填
	 */
	private String applysum2 = "";
	
	/**
	 * 申购金额低,exptype为"02"必填
	 */
	private String applysum3 = "";
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"或"30"必填
	 */
	private String avgexptype = "";
	
	/**
	 * 系统组合代码,系统组合定投必填
	 */
	private String combcode = "";
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	private String diffscale = "";
	
	/**
	 * 低偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	private String doorscale1 = "";
	
	/**
	 * 高偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	private String doorscale2 = "";
	
	/**
	 * 低偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	private String doorvalue1 = "";
	
	/**
	 * 高偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	private String doorvalue2 = "";
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"、"12"、"30"必填
	 */
	private String exponentcode = "";
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法);"11":余额理财类型,"15":固定指数代码为GEYR, "07":指数与样本均线, "08":基金月度收益率的处理;
	 */
	private String exptype = "";
	
	/**
	 * 自定义组合定投内容,自定义组合定投必填
	 */
	private String investcontent = "";
	
	/**
	 * 组合定投模式,组合定投必填,0:系统配置型,1:自定义型
	 */
	private String investflag;
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	private String maxsuccessnum = "";
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	private String maxvalue = "";
	
	/**
	 * 协议别名,
	 */
	private String xybm = "";
	
	/**
	 * 避险基金代码,exptype为"12"时必填
	 */
	private String hedgefundcode = "";
	
	/**
	 * 避险基金收费方式,exptype为"12"时必填
	 */
	private String hedgesharetype = "";
	
	/**
	 * 长期均线,exptype为"12"时必填，取字典"趋势定投长期均线类型"
	 */
	private String longavgexponenttype = "";
	
	/**
	 * 中期均线,exptype为"12"时必填，取字典"趋势定投中期均线类型"
	 */
	private String mediumavgexponenttype = "";
	
	/**
	 * 短期均线,exptype为"12"时必填，取字典"趋势定投短期均线类型"
	 */
	private String shortavgexponenttype = "";
	
	/**
	 * 允许顺延天数,exptype为"11"时必填
	 */
	private String delayday = "";
	
	/**
	 * 最大单笔扣款,exptype为"11"时必填
	 */
	private String maxcharge = "";
	
	/**
	 * 最低留存余额,exptype为"11"时必填
	 */
	private String minbalance = "";
	
	/**
	 * 推荐人,
	 */
	private String recommender = "";
	
	/**
	 * 初始化参数
	 */
	public I007Input() {
		this.setFunction("I007");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 交易周期单位,"0":月,"1":周,"2":日
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 交易日期,日期的后两位
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,日期的后两位
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 交易周期,
	 */
	public String getJyzq() {
		return this.jyzq;
	}
	
	/**
	 * 交易周期,
	 */
	public void setJyzq(String value)
	 {
		this.jyzq = value;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	public String getXyh() {
		return this.xyh;
	}
	
	/**
	 * 协议号,调用I005返回的xyh
	 */
	public void setXyh(String value)
	 {
		this.xyh = value;
	}
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,"99991231"代表无限期
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	public String getState() {
		return this.state;
	}
	
	/**
	 * 协议状态,"A":启用,"P":暂停,"H":终止
	 */
	public void setState(String value)
	 {
		this.state = value;
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
	 * 投资区间方案编号,exptype=07或08时必填
	 */
	public String getSectionschemano() {
		return this.sectionschemano;
	}
	
	/**
	 * 投资区间方案编号,exptype=07或08时必填
	 */
	public void setSectionschemano(String value)
	 {
		this.sectionschemano = value;
	}
	
	/**
	 * 申购金额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申购金额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 申购金额高,exptype为"02"必填
	 */
	public String getApplysum1() {
		return this.applysum1;
	}
	
	/**
	 * 申购金额高,exptype为"02"必填
	 */
	public void setApplysum1(String value)
	 {
		this.applysum1 = value;
	}
	
	/**
	 * 申购金额中,exptype为"02"必填
	 */
	public String getApplysum2() {
		return this.applysum2;
	}
	
	/**
	 * 申购金额中,exptype为"02"必填
	 */
	public void setApplysum2(String value)
	 {
		this.applysum2 = value;
	}
	
	/**
	 * 申购金额低,exptype为"02"必填
	 */
	public String getApplysum3() {
		return this.applysum3;
	}
	
	/**
	 * 申购金额低,exptype为"02"必填
	 */
	public void setApplysum3(String value)
	 {
		this.applysum3 = value;
	}
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"或"30"必填
	 */
	public String getAvgexptype() {
		return this.avgexptype;
	}
	
	/**
	 * 均线类型,取字典“均线类型”，exptype为"03"或"30"必填
	 */
	public void setAvgexptype(String value)
	 {
		this.avgexptype = value;
	}
	
	/**
	 * 系统组合代码,系统组合定投必填
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 系统组合代码,系统组合定投必填
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	public String getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,取字典“定投级差”，exptype为"03"必填
	 */
	public void setDiffscale(String value)
	 {
		this.diffscale = value;
	}
	
	/**
	 * 低偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	public String getDoorscale1() {
		return this.doorscale1;
	}
	
	/**
	 * 低偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	public void setDoorscale1(String value)
	 {
		this.doorscale1 = value;
	}
	
	/**
	 * 高偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	public String getDoorscale2() {
		return this.doorscale2;
	}
	
	/**
	 * 高偏离阈值,偏离阈值不定额，exptype为"30"必填
	 */
	public void setDoorscale2(String value)
	 {
		this.doorscale2 = value;
	}
	
	/**
	 * 低偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	public String getDoorvalue1() {
		return this.doorvalue1;
	}
	
	/**
	 * 低偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	public void setDoorvalue1(String value)
	 {
		this.doorvalue1 = value;
	}
	
	/**
	 * 高偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	public String getDoorvalue2() {
		return this.doorvalue2;
	}
	
	/**
	 * 高偏离净值,偏离净值不定额，exptype为"04"必填
	 */
	public void setDoorvalue2(String value)
	 {
		this.doorvalue2 = value;
	}
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"、"12"、"30"必填
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,取字典“指数代码”，exptype为"03"、"12"、"30"必填
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法);"11":余额理财类型,"15":固定指数代码为GEYR, "07":指数与样本均线, "08":基金月度收益率的处理;
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,默认：定期定额,"02":指定金额不定额,"03":指数均线不定额,"30":偏离阈值不定额,"04":偏离净值不定额,"12":趋势定投(时点指标法);"11":余额理财类型,"15":固定指数代码为GEYR, "07":指数与样本均线, "08":基金月度收益率的处理;
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 自定义组合定投内容,自定义组合定投必填
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 自定义组合定投内容,自定义组合定投必填
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
	}
	
	/**
	 * 组合定投模式,组合定投必填,0:系统配置型,1:自定义型
	 */
	public String getInvestflag() {
		return this.investflag;
	}
	
	/**
	 * 组合定投模式,组合定投必填,0:系统配置型,1:自定义型
	 */
	public void setInvestflag(String value)
	 {
		this.investflag = value;
	}
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	public String getMaxsuccessnum() {
		return this.maxsuccessnum;
	}
	
	/**
	 * 最大累计成功次数,定投成功扣款达到配置次数后，将终止该协议
	 */
	public void setMaxsuccessnum(String value)
	 {
		this.maxsuccessnum = value;
	}
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	public String getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大累计成功金额,定投成功扣款达到累计金额后，将终止该协议
	 */
	public void setMaxvalue(String value)
	 {
		this.maxvalue = value;
	}
	
	/**
	 * 协议别名,
	 */
	public String getXybm() {
		return this.xybm;
	}
	
	/**
	 * 协议别名,
	 */
	public void setXybm(String value)
	 {
		this.xybm = value;
	}
	
	/**
	 * 避险基金代码,exptype为"12"时必填
	 */
	public String getHedgefundcode() {
		return this.hedgefundcode;
	}
	
	/**
	 * 避险基金代码,exptype为"12"时必填
	 */
	public void setHedgefundcode(String value)
	 {
		this.hedgefundcode = value;
	}
	
	/**
	 * 避险基金收费方式,exptype为"12"时必填
	 */
	public String getHedgesharetype() {
		return this.hedgesharetype;
	}
	
	/**
	 * 避险基金收费方式,exptype为"12"时必填
	 */
	public void setHedgesharetype(String value)
	 {
		this.hedgesharetype = value;
	}
	
	/**
	 * 长期均线,exptype为"12"时必填，取字典"趋势定投长期均线类型"
	 */
	public String getLongavgexponenttype() {
		return this.longavgexponenttype;
	}
	
	/**
	 * 长期均线,exptype为"12"时必填，取字典"趋势定投长期均线类型"
	 */
	public void setLongavgexponenttype(String value)
	 {
		this.longavgexponenttype = value;
	}
	
	/**
	 * 中期均线,exptype为"12"时必填，取字典"趋势定投中期均线类型"
	 */
	public String getMediumavgexponenttype() {
		return this.mediumavgexponenttype;
	}
	
	/**
	 * 中期均线,exptype为"12"时必填，取字典"趋势定投中期均线类型"
	 */
	public void setMediumavgexponenttype(String value)
	 {
		this.mediumavgexponenttype = value;
	}
	
	/**
	 * 短期均线,exptype为"12"时必填，取字典"趋势定投短期均线类型"
	 */
	public String getShortavgexponenttype() {
		return this.shortavgexponenttype;
	}
	
	/**
	 * 短期均线,exptype为"12"时必填，取字典"趋势定投短期均线类型"
	 */
	public void setShortavgexponenttype(String value)
	 {
		this.shortavgexponenttype = value;
	}
	
	/**
	 * 允许顺延天数,exptype为"11"时必填
	 */
	public String getDelayday() {
		return this.delayday;
	}
	
	/**
	 * 允许顺延天数,exptype为"11"时必填
	 */
	public void setDelayday(String value)
	 {
		this.delayday = value;
	}
	
	/**
	 * 最大单笔扣款,exptype为"11"时必填
	 */
	public String getMaxcharge() {
		return this.maxcharge;
	}
	
	/**
	 * 最大单笔扣款,exptype为"11"时必填
	 */
	public void setMaxcharge(String value)
	 {
		this.maxcharge = value;
	}
	
	/**
	 * 最低留存余额,exptype为"11"时必填
	 */
	public String getMinbalance() {
		return this.minbalance;
	}
	
	/**
	 * 最低留存余额,exptype为"11"时必填
	 */
	public void setMinbalance(String value)
	 {
		this.minbalance = value;
	}
	
	/**
	 * 推荐人,
	 */
	public String getRecommender() {
		return this.recommender;
	}
	
	/**
	 * 推荐人,
	 */
	public void setRecommender(String value)
	 {
		this.recommender = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("cycleunit", this.cycleunit.toString());
		inputMap.put("jyrq", this.jyrq);
		inputMap.put("jyzq", this.jyzq);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("xyh", this.xyh);
		inputMap.put("zzrq", this.zzrq);
		inputMap.put("state", this.state);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("sectionschemano", this.sectionschemano);
		inputMap.put("applysum", this.applysum);
		inputMap.put("applysum1", this.applysum1);
		inputMap.put("applysum2", this.applysum2);
		inputMap.put("applysum3", this.applysum3);
		inputMap.put("avgexptype", this.avgexptype);
		inputMap.put("combcode", this.combcode);
		inputMap.put("diffscale", this.diffscale);
		inputMap.put("doorscale1", this.doorscale1);
		inputMap.put("doorscale2", this.doorscale2);
		inputMap.put("doorvalue1", this.doorvalue1);
		inputMap.put("doorvalue2", this.doorvalue2);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("exptype", this.exptype);
		inputMap.put("investcontent", this.investcontent);
		inputMap.put("investflag", this.investflag.toString());
		inputMap.put("maxsuccessnum", this.maxsuccessnum);
		inputMap.put("maxvalue", this.maxvalue);
		inputMap.put("xybm", this.xybm);
		inputMap.put("hedgefundcode", this.hedgefundcode);
		inputMap.put("hedgesharetype", this.hedgesharetype);
		inputMap.put("longavgexponenttype", this.longavgexponenttype);
		inputMap.put("mediumavgexponenttype", this.mediumavgexponenttype);
		inputMap.put("shortavgexponenttype", this.shortavgexponenttype);
		inputMap.put("delayday", this.delayday);
		inputMap.put("maxcharge", this.maxcharge);
		inputMap.put("minbalance", this.minbalance);
		inputMap.put("recommender", this.recommender);
	}
}
