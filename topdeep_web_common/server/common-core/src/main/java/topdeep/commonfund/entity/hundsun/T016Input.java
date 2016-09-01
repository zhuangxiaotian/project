package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合投资调仓(T016)
 */
public class T016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 调仓模式,0：正常模式；1：非正常模式
	 */
	private String adjustmode;
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	private String detailcapitalmode = "";
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode;
	
	/**
	 * 投资内容,投资内容填：基金代码|份额类别|金额，如果是多只基金，则重复，中间用|分隔；另外，投资内容的金额按数字格式传，如3.2，就传3.2，不再转为定长字符串
	 */
	private String investcontent = "";
	
	/**
	 * 赎回内容,格式：基金代码|份额类别，如果是多只基金，则重复，中间用|分隔
	 */
	private String redeemcontent = "";
	
	/**
	 * 初始化参数
	 */
	public T016Input() {
		this.setFunction("T016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 调仓模式,0：正常模式；1：非正常模式
	 */
	public String getAdjustmode() {
		return this.adjustmode;
	}
	
	/**
	 * 调仓模式,0：正常模式；1：非正常模式
	 */
	public void setAdjustmode(String value)
	 {
		this.adjustmode = value;
	}
	
	/**
	 * 组合编号,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	public String getDetailcapitalmode() {
		return this.detailcapitalmode;
	}
	
	/**
	 * 支付方式,00:网银支付;01:托收代扣;02:汇款支付
	 */
	public void setDetailcapitalmode(String value)
	 {
		this.detailcapitalmode = value;
	}
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,T014返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 投资内容,投资内容填：基金代码|份额类别|金额，如果是多只基金，则重复，中间用|分隔；另外，投资内容的金额按数字格式传，如3.2，就传3.2，不再转为定长字符串
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 投资内容,投资内容填：基金代码|份额类别|金额，如果是多只基金，则重复，中间用|分隔；另外，投资内容的金额按数字格式传，如3.2，就传3.2，不再转为定长字符串
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
	}
	
	/**
	 * 赎回内容,格式：基金代码|份额类别，如果是多只基金，则重复，中间用|分隔
	 */
	public String getRedeemcontent() {
		return this.redeemcontent;
	}
	
	/**
	 * 赎回内容,格式：基金代码|份额类别，如果是多只基金，则重复，中间用|分隔
	 */
	public void setRedeemcontent(String value)
	 {
		this.redeemcontent = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("adjustmode", this.adjustmode.toString());
		inputMap.put("combcode", this.combcode);
		inputMap.put("detailcapitalmode", this.detailcapitalmode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("capitalmode", this.capitalmode.toString());
		inputMap.put("investcontent", this.investcontent);
		inputMap.put("redeemcontent", this.redeemcontent);
	}
}
