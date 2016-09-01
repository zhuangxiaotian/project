package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 转托管出(T017)
 */
public class T017Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 转托管模式,1：一步转托管（中登转场内为一步转托管）；2：两步转托管出
	 */
	private String mode = "";
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	private String sharetype = "";
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 转出份额,
	 */
	private String trusteetoshare = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	private String fundacco = "";
	
	/**
	 * 对方网点代码,取字典“席位号”
	 */
	private String oppositenet = "";
	
	/**
	 * 对方销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	private String oppositevendor = "";
	
	/**
	 * 交易密码,当使用无密码登录时（数米需求）为必传项
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public T017Input() {
		this.setFunction("T017");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,调用S001查询到的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 转托管模式,1：一步转托管（中登转场内为一步转托管）；2：两步转托管出
	 */
	public String getMode() {
		return this.mode;
	}
	
	/**
	 * 转托管模式,1：一步转托管（中登转场内为一步转托管）；2：两步转托管出
	 */
	public void setMode(String value)
	 {
		this.mode = value;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,调用S001查询到的sharetype
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,调用S001查询到的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 转出份额,
	 */
	public String getTrusteetoshare() {
		return this.trusteetoshare;
	}
	
	/**
	 * 转出份额,
	 */
	public void setTrusteetoshare(String value)
	 {
		this.trusteetoshare = value;
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
	 * 基金账号,调用S001查询到的fundacco
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,调用S001查询到的fundacco
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 对方网点代码,取字典“席位号”
	 */
	public String getOppositenet() {
		return this.oppositenet;
	}
	
	/**
	 * 对方网点代码,取字典“席位号”
	 */
	public void setOppositenet(String value)
	 {
		this.oppositenet = value;
	}
	
	/**
	 * 对方销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	public String getOppositevendor() {
		return this.oppositevendor;
	}
	
	/**
	 * 对方销售商代码,取字典“销售商”，中登TA转场内传“999”
	 */
	public void setOppositevendor(String value)
	 {
		this.oppositevendor = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("mode", this.mode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("trusteetoshare", this.trusteetoshare);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("oppositenet", this.oppositenet);
		inputMap.put("oppositevendor", this.oppositevendor);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
