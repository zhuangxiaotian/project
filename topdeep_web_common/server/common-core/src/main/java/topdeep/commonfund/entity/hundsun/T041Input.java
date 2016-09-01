package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息新增(T041)
 */
public class T041Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private String balancestr = "";
	
	/**
	 * 业务代码,022申购；090定投
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 初始化参数
	 */
	public T041Input() {
		this.setFunction("T041");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请金额,
	 */
	public String getBalancestr() {
		return this.balancestr;
	}
	
	/**
	 * 申请金额,
	 */
	public void setBalancestr(String value)
	 {
		this.balancestr = value;
	}
	
	/**
	 * 业务代码,022申购；090定投
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,022申购；090定投
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("balancestr", this.balancestr);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
	}
}
