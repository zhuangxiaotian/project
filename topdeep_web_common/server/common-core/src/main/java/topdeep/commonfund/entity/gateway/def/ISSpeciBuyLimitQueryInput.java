package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询专户人数限制功能输入参数
 */
public class ISSpeciBuyLimitQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金账号,
	 */
	private String fundacco;
	
	/**
	 * 申请金额,
	 */
	private Double requestbala;
	
	/**
	 * 份额类别,
	 */
	private String sharetype;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	public ISSpeciBuyLimitQueryInput() {
		this.setZ_funcCode("n0y");
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
	 * 申请金额,
	 */
	public Double getRequestbala() {
		return this.requestbala;
	}
	
	/**
	 * 申请金额,
	 */
	public void setRequestbala(Double value)
	 {
		this.requestbala = value;
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
}
