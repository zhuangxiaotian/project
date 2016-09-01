package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 销交易账号功能输入参数
 */
public class ISTradeAccCancelInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 交易账号,
	 */
	private String tradeacco;
	
	/**
	 * 交易密码,
	 */
	private String tradepassword;
	
	/**
	 * 银行卡号,
	 */
	private String bankAcc;
	
	/**
	 * 银行代码,
	 */
	private String channelId;
	
	public ISTradeAccCancelInput() {
		this.setZ_funcCode("u1d");
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
	 * 银行卡号,
	 */
	public String getBankAcc() {
		return this.bankAcc;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankAcc(String value)
	 {
		this.bankAcc = value;
	}
	
	/**
	 * 银行代码,
	 */
	public String getChannelId() {
		return this.channelId;
	}
	
	/**
	 * 银行代码,
	 */
	public void setChannelId(String value)
	 {
		this.channelId = value;
	}
}
