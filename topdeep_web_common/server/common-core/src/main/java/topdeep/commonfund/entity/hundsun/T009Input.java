package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 撤单(T009)
 */
public class T009Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 原申请编号,仅限普通撤单，暂不考虑组合
	 */
	private String applyserial = "";
	
	/**
	 * 交易账号,调用T008返回的applyserial
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 撤单类型,0为普通撤单（默认），1为组合撤单，不传则为0
	 */
	private String withdrawtype = "";
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	private String precheckflag = "";
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	private String transfermoney = "";
	
	/**
	 * 业务大类,传入超级现金宝交易来源，且业务大类=02的时候，根据申请编号做超级现金宝交易的撤单
	 */
	private String busintype = "";
	
	/**
	 * 退款标志,始用于诺亚
	 */
	private String returnflag = "";
	
	/**
	 * 初始化参数
	 */
	public T009Input() {
		this.setFunction("T009");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 原申请编号,仅限普通撤单，暂不考虑组合
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 原申请编号,仅限普通撤单，暂不考虑组合
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 交易账号,调用T008返回的applyserial
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用T008返回的applyserial
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
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
	 * 交易来源,
	 */
	public String getTradesource() {
		return this.tradesource;
	}
	
	/**
	 * 交易来源,
	 */
	public void setTradesource(String value)
	 {
		this.tradesource = value;
	}
	
	/**
	 * 撤单类型,0为普通撤单（默认），1为组合撤单，不传则为0
	 */
	public String getWithdrawtype() {
		return this.withdrawtype;
	}
	
	/**
	 * 撤单类型,0为普通撤单（默认），1为组合撤单，不传则为0
	 */
	public void setWithdrawtype(String value)
	 {
		this.withdrawtype = value;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public String getPrecheckflag() {
		return this.precheckflag;
	}
	
	/**
	 * 预检查标识,1:预检查 0或空:非预检查
	 */
	public void setPrecheckflag(String value)
	 {
		this.precheckflag = value;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public String getTransfermoney() {
		return this.transfermoney;
	}
	
	/**
	 * 支持是否需要支付或划款开关,1或空:需要;0:不需要
	 */
	public void setTransfermoney(String value)
	 {
		this.transfermoney = value;
	}
	
	/**
	 * 业务大类,传入超级现金宝交易来源，且业务大类=02的时候，根据申请编号做超级现金宝交易的撤单
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,传入超级现金宝交易来源，且业务大类=02的时候，根据申请编号做超级现金宝交易的撤单
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 退款标志,始用于诺亚
	 */
	public String getReturnflag() {
		return this.returnflag;
	}
	
	/**
	 * 退款标志,始用于诺亚
	 */
	public void setReturnflag(String value)
	 {
		this.returnflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("withdrawtype", this.withdrawtype);
		inputMap.put("precheckflag", this.precheckflag);
		inputMap.put("transfermoney", this.transfermoney);
		inputMap.put("busintype", this.busintype);
		inputMap.put("returnflag", this.returnflag);
	}
}
