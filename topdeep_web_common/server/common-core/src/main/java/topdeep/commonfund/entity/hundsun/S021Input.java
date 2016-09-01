package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易费率查询(S021)
 */
public class S021Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 资金方式,1，如果未传sessionkey则必传, 2，如果传了sessionkey，同时传递了tradeacco，可以不传capitalmode。 3，不允许只传capitalmode，而不传tradeacco
	 */
	private String capitalmode = "";
	
	/**
	 * 对方基金,转换业务必传
	 */
	private String otherfundcode = "";
	
	/**
	 * 对方基金收费方式,转换业务必传
	 */
	private String othersharetype = "";
	
	/**
	 * 申请金额,认申购必传
	 */
	private String requestbala = "";
	
	/**
	 * 申请份额,赎回、转换业务必传
	 */
	private String requestshare = "";
	
	/**
	 * 交易账号,1，如果未传sessionkey则必传 2，如果传了sessionkey，但是未传交易账号，则交易账户和资金模式会取当前用户所有的交易账号和资金模式 3，如果传了sessionkey，同时又传了tradeacco，则资金模式是当前用户交易账号对应的资金模式
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S021Input() {
		this.setFunction("S021");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
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
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 资金方式,1，如果未传sessionkey则必传, 2，如果传了sessionkey，同时传递了tradeacco，可以不传capitalmode。 3，不允许只传capitalmode，而不传tradeacco
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,1，如果未传sessionkey则必传, 2，如果传了sessionkey，同时传递了tradeacco，可以不传capitalmode。 3，不允许只传capitalmode，而不传tradeacco
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 对方基金,转换业务必传
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 对方基金,转换业务必传
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 对方基金收费方式,转换业务必传
	 */
	public String getOthersharetype() {
		return this.othersharetype;
	}
	
	/**
	 * 对方基金收费方式,转换业务必传
	 */
	public void setOthersharetype(String value)
	 {
		this.othersharetype = value;
	}
	
	/**
	 * 申请金额,认申购必传
	 */
	public String getRequestbala() {
		return this.requestbala;
	}
	
	/**
	 * 申请金额,认申购必传
	 */
	public void setRequestbala(String value)
	 {
		this.requestbala = value;
	}
	
	/**
	 * 申请份额,赎回、转换业务必传
	 */
	public String getRequestshare() {
		return this.requestshare;
	}
	
	/**
	 * 申请份额,赎回、转换业务必传
	 */
	public void setRequestshare(String value)
	 {
		this.requestshare = value;
	}
	
	/**
	 * 交易账号,1，如果未传sessionkey则必传 2，如果传了sessionkey，但是未传交易账号，则交易账户和资金模式会取当前用户所有的交易账号和资金模式 3，如果传了sessionkey，同时又传了tradeacco，则资金模式是当前用户交易账号对应的资金模式
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,1，如果未传sessionkey则必传 2，如果传了sessionkey，但是未传交易账号，则交易账户和资金模式会取当前用户所有的交易账号和资金模式 3，如果传了sessionkey，同时又传了tradeacco，则资金模式是当前用户交易账号对应的资金模式
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("otherfundcode", this.otherfundcode);
		inputMap.put("othersharetype", this.othersharetype);
		inputMap.put("requestbala", this.requestbala);
		inputMap.put("requestshare", this.requestshare);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
