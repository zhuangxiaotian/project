package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 签约协议表更新(B045)
 */
public class B045Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行账号,
	 */
	private String bankacco = "";
	
	/**
	 * 签约协议号,
	 */
	private String customno = "";
	
	/**
	 * 状态,
	 */
	private String recordstate = "";
	
	/**
	 * 备注,
	 */
	private String reserve = "";
	
	/**
	 * 区域代码,
	 */
	private String areacode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public B045Input() {
		this.setFunction("B045");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行账号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行账号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 签约协议号,
	 */
	public String getCustomno() {
		return this.customno;
	}
	
	/**
	 * 签约协议号,
	 */
	public void setCustomno(String value)
	 {
		this.customno = value;
	}
	
	/**
	 * 状态,
	 */
	public String getRecordstate() {
		return this.recordstate;
	}
	
	/**
	 * 状态,
	 */
	public void setRecordstate(String value)
	 {
		this.recordstate = value;
	}
	
	/**
	 * 备注,
	 */
	public String getReserve() {
		return this.reserve;
	}
	
	/**
	 * 备注,
	 */
	public void setReserve(String value)
	 {
		this.reserve = value;
	}
	
	/**
	 * 区域代码,
	 */
	public String getAreacode() {
		return this.areacode;
	}
	
	/**
	 * 区域代码,
	 */
	public void setAreacode(String value)
	 {
		this.areacode = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankacco", this.bankacco);
		inputMap.put("customno", this.customno);
		inputMap.put("recordstate", this.recordstate);
		inputMap.put("reserve", this.reserve);
		inputMap.put("areacode", this.areacode);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
