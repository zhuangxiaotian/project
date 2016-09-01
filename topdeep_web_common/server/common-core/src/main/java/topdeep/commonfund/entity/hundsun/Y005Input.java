package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约卖出基金下单(Y005)
 */
public class Y005Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请额度,
	 */
	private Double applysum;
	
	/**
	 * 基金代码,调用Y004返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金
	 */
	private String saleway = "";
	
	/**
	 * 收费方式,调用Y004返回的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,调用Y004返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,暂时传[ISNULL]
	 */
	private String tradepassword = "";
	
	/**
	 * 业务大类,现金宝相关的操作都传01
	 */
	private String busintype = "";
	
	/**
	 * 预约指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 预约比较条件,
	 */
	private String exponentflag = "";
	
	/**
	 * 预约点位,
	 */
	private Double exponentvalue;
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	private String exptype = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 预约日期,
	 */
	private String hopedate = "";
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	private String mintredeem = "";
	
	/**
	 * 目标基金代码,赎回到现金宝现金宝时，必须传对应的现金宝基金代码
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标收费方式,赎回到现金宝现金宝时，必须传对应的现金宝基金收费方式
	 */
	private String targetsharetype = "";
	
	/**
	 * 交易来源,
	 */
	private String tradeSource = "";
	
	/**
	 * 业务辅助代码,传69可做全部赎回（包括收益）。
	 */
	private String fixbusinflag = "";
	
	/**
	 * 初始化参数
	 */
	public Y005Input() {
		this.setFunction("Y005");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请额度,
	 */
	public Double getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请额度,
	 */
	public void setApplysum(Double value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 基金代码,调用Y004返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用Y004返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金
	 */
	public String getSaleway() {
		return this.saleway;
	}
	
	/**
	 * 卖出方式,0:赎回到银行卡;1:转到现金宝;2:转到其他基金
	 */
	public void setSaleway(String value)
	 {
		this.saleway = value;
	}
	
	/**
	 * 收费方式,调用Y004返回的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用Y004返回的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,调用Y004返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用Y004返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 交易密码,暂时传[ISNULL]
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,暂时传[ISNULL]
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 业务大类,现金宝相关的操作都传01
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝相关的操作都传01
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 预约指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 预约指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约比较条件,
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约比较条件,
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约点位,
	 */
	public Double getExponentvalue() {
		return this.exponentvalue;
	}
	
	/**
	 * 预约点位,
	 */
	public void setExponentvalue(Double value)
	 {
		this.exponentvalue = value;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
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
	 * 预约日期,
	 */
	public String getHopedate() {
		return this.hopedate;
	}
	
	/**
	 * 预约日期,
	 */
	public void setHopedate(String value)
	 {
		this.hopedate = value;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public String getMintredeem() {
		return this.mintredeem;
	}
	
	/**
	 * 巨额赎回处理标志,0:放弃超额部分;1:继续赎回
	 */
	public void setMintredeem(String value)
	 {
		this.mintredeem = value;
	}
	
	/**
	 * 目标基金代码,赎回到现金宝现金宝时，必须传对应的现金宝基金代码
	 */
	public String getTargetfundcode() {
		return this.targetfundcode;
	}
	
	/**
	 * 目标基金代码,赎回到现金宝现金宝时，必须传对应的现金宝基金代码
	 */
	public void setTargetfundcode(String value)
	 {
		this.targetfundcode = value;
	}
	
	/**
	 * 目标收费方式,赎回到现金宝现金宝时，必须传对应的现金宝基金收费方式
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标收费方式,赎回到现金宝现金宝时，必须传对应的现金宝基金收费方式
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getTradeSource() {
		return this.tradeSource;
	}
	
	/**
	 * 交易来源,
	 */
	public void setTradeSource(String value)
	 {
		this.tradeSource = value;
	}
	
	/**
	 * 业务辅助代码,传69可做全部赎回（包括收益）。
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,传69可做全部赎回（包括收益）。
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applysum", this.formatDecimal(this.applysum));
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("saleway", this.saleway);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("busintype", this.busintype);
		inputMap.put("exponentcode", this.exponentcode);
		inputMap.put("exponentflag", this.exponentflag);
		inputMap.put("exponentvalue", this.formatDecimal(this.exponentvalue));
		inputMap.put("exptype", this.exptype);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("hopedate", this.hopedate);
		inputMap.put("mintredeem", this.mintredeem);
		inputMap.put("targetfundcode", this.targetfundcode);
		inputMap.put("targetsharetype", this.targetsharetype);
		inputMap.put("tradeSource", this.tradeSource);
		inputMap.put("fixbusinflag", this.fixbusinflag);
	}
}
