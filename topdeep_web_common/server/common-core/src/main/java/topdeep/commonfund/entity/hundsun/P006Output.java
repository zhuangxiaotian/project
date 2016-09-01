package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 风险评估(P006)
 */
public class P006Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 能否继续交易,判断是否能继续提交
	 */
	private String cansub = "";
	
	/**
	 * 风险标志,0000不显示riskmsg信息 40或41在riskmsg信息加风险自测链接
	 */
	private String riskflag = "";
	
	/**
	 * 风险提示信息,
	 */
	private String riskmsg = "";
	
	/**
	 * 基金风险等级,
	 */
	private String fundriskStr = "";
	
	/**
	 * 投资人风险承受能力,
	 */
	private String riskbilityStr = "";
	
	/**
	 * 能否继续交易,判断是否能继续提交
	 */
	public String getCansub() {
		return this.cansub;
	}
	
	/**
	 * 能否继续交易,判断是否能继续提交
	 */
	public void setCansub(String value)
	 {
		this.cansub = value;
	}
	
	/**
	 * 风险标志,0000不显示riskmsg信息 40或41在riskmsg信息加风险自测链接
	 */
	public String getRiskflag() {
		return this.riskflag;
	}
	
	/**
	 * 风险标志,0000不显示riskmsg信息 40或41在riskmsg信息加风险自测链接
	 */
	public void setRiskflag(String value)
	 {
		this.riskflag = value;
	}
	
	/**
	 * 风险提示信息,
	 */
	public String getRiskmsg() {
		return this.riskmsg;
	}
	
	/**
	 * 风险提示信息,
	 */
	public void setRiskmsg(String value)
	 {
		this.riskmsg = value;
	}
	
	/**
	 * 基金风险等级,
	 */
	public String getFundriskStr() {
		return this.fundriskStr;
	}
	
	/**
	 * 基金风险等级,
	 */
	public void setFundriskStr(String value)
	 {
		this.fundriskStr = value;
	}
	
	/**
	 * 投资人风险承受能力,
	 */
	public String getRiskbilityStr() {
		return this.riskbilityStr;
	}
	
	/**
	 * 投资人风险承受能力,
	 */
	public void setRiskbilityStr(String value)
	 {
		this.riskbilityStr = value;
	}
}
