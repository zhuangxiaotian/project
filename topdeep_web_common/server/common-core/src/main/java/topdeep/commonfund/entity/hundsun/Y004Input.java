package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约卖出支付方式列表(Y004)
 */
public class Y004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,025:预约赎回;986:预约转换
	 */
	private String businflag = "";
	
	/**
	 * 卖出基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 目标交易账号,赎回到的交易账号
	 */
	private String targettradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public Y004Input() {
		this.setFunction("Y004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,025:预约赎回;986:预约转换
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,025:预约赎回;986:预约转换
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 卖出基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 卖出基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
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
	 * 目标交易账号,赎回到的交易账号
	 */
	public String getTargettradeacco() {
		return this.targettradeacco;
	}
	
	/**
	 * 目标交易账号,赎回到的交易账号
	 */
	public void setTargettradeacco(String value)
	 {
		this.targettradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("targettradeacco", this.targettradeacco);
	}
}
