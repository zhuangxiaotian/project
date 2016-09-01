package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额转换功能输入参数
 */
public class ISFixedInvestmentTransferInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 转换份额,
	 */
	private String applysum;
	
	/**
	 * 均线类型,
	 */
	private String avgexptype;
	
	/**
	 * 业务大类,
	 */
	private String busintype;
	
	/**
	 * 交易周期单位,
	 */
	private String cycleunit;
	
	/**
	 * 级差,
	 */
	private String diffscale;
	
	/**
	 * 指数代码,
	 */
	private String exponentcode;
	
	/**
	 * 指数类型,
	 */
	private String exptype;
	
	/**
	 * 转出基金代码,
	 */
	private String fundcode;
	
	/**
	 * 交易日期,
	 */
	private String jyrq;
	
	/**
	 * 交易周期,
	 */
	private String jyzq;
	
	/**
	 * 最大累计成功次数,
	 */
	private String maxsuccessnum;
	
	/**
	 * 最大累计成功金额,
	 */
	private String maxvalue;
	
	/**
	 * 转入基金代码,
	 */
	private String otherfundcode;
	
	/**
	 * 转入收费方式,
	 */
	private String othersharetype;
	
	/**
	 * 首次交易月份,
	 */
	private String scjyrq;
	
	/**
	 * 转出收费方式,
	 */
	private String sharetype;
	
	/**
	 * 交易密码,
	 */
	private String tradepassword;
	
	/**
	 * 协议别名,
	 */
	private String xybm;
	
	/**
	 * 终止日期,
	 */
	private String zzrq;
	
	/**
	 * 交易账号,
	 */
	private String tradeAcc;
	
	public ISFixedInvestmentTransferInput() {
		this.setZ_funcCode("u1e");
	}
	
	/**
	 * 转换份额,
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 转换份额,
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	/**
	 * 均线类型,
	 */
	public String getAvgexptype() {
		return this.avgexptype;
	}
	
	/**
	 * 均线类型,
	 */
	public void setAvgexptype(String value)
	 {
		this.avgexptype = value;
	}
	
	/**
	 * 业务大类,
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 交易周期单位,
	 */
	public String getCycleunit() {
		return this.cycleunit;
	}
	
	/**
	 * 交易周期单位,
	 */
	public void setCycleunit(String value)
	 {
		this.cycleunit = value;
	}
	
	/**
	 * 级差,
	 */
	public String getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,
	 */
	public void setDiffscale(String value)
	 {
		this.diffscale = value;
	}
	
	/**
	 * 指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 指数类型,
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 指数类型,
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
	}
	
	/**
	 * 转出基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 转出基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 交易日期,
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,
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
	 * 最大累计成功次数,
	 */
	public String getMaxsuccessnum() {
		return this.maxsuccessnum;
	}
	
	/**
	 * 最大累计成功次数,
	 */
	public void setMaxsuccessnum(String value)
	 {
		this.maxsuccessnum = value;
	}
	
	/**
	 * 最大累计成功金额,
	 */
	public String getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大累计成功金额,
	 */
	public void setMaxvalue(String value)
	 {
		this.maxvalue = value;
	}
	
	/**
	 * 转入基金代码,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 转入基金代码,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 转入收费方式,
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 转入收费方式,
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
	}
	
	/**
	 * 首次交易月份,
	 */
	public String getScjyrq() {
		return this.scjyrq;
	}
	
	/**
	 * 首次交易月份,
	 */
	public void setScjyrq(String value)
	 {
		this.scjyrq = value;
	}
	
	/**
	 * 转出收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 转出收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
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
	 * 终止日期,
	 */
	public String getZzrq() {
		return this.zzrq;
	}
	
	/**
	 * 终止日期,
	 */
	public void setZzrq(String value)
	 {
		this.zzrq = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeAcc() {
		return this.tradeAcc;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeAcc(String value)
	 {
		this.tradeAcc = value;
	}
}
