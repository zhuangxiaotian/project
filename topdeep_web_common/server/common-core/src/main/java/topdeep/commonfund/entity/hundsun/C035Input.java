package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 增开基金账号(C035)
 */
public class C035Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * TA代码,参考字典“TA代码”
	 */
	private String tacode = "";
	
	/**
	 * 账号类型,bossaccoflag表示传入的是股东账号，fundaccoflag表示绑定中登时使用基金账号，空表示普通方式（长盛使用）
	 */
	private String accoflag = "";
	
	/**
	 * 股东账号,登记中登账号时传入中登股东账号进行绑定（长盛使用）
	 */
	private String bossacco = "";
	
	/**
	 * 基金账号,登记中登账号时传入中登基金账号进行绑定（长盛使用）
	 */
	private String fundacco = "";
	
	/**
	 * 账号号码,新增基金账号的可以不传， 但是如果是将交易账号和已有基金账号进行绑定的话，如果直销不支持多托管网点，必需要传入交易账号。
	 */
	private String tradeacco = "";
	
	/**
	 * 交易密码,
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,
	 */
	private String tradesource = "";
	
	/**
	 * 处理方式,0：绑定已有的基金账号，1：增开新基金账号（此时DSMULTIBRANCHCODE和SYS_ACCOSTRUCTURE均不能为1），传空则根据直销参数DSMULTIBRANCHCODE判断
	 */
	private String treatment;
	
	/**
	 * 初始化参数
	 */
	public C035Input() {
		this.setFunction("C035");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * TA代码,参考字典“TA代码”
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,参考字典“TA代码”
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * 账号类型,bossaccoflag表示传入的是股东账号，fundaccoflag表示绑定中登时使用基金账号，空表示普通方式（长盛使用）
	 */
	public String getAccoflag() {
		return this.accoflag;
	}
	
	/**
	 * 账号类型,bossaccoflag表示传入的是股东账号，fundaccoflag表示绑定中登时使用基金账号，空表示普通方式（长盛使用）
	 */
	public void setAccoflag(String value)
	 {
		this.accoflag = value;
	}
	
	/**
	 * 股东账号,登记中登账号时传入中登股东账号进行绑定（长盛使用）
	 */
	public String getBossacco() {
		return this.bossacco;
	}
	
	/**
	 * 股东账号,登记中登账号时传入中登股东账号进行绑定（长盛使用）
	 */
	public void setBossacco(String value)
	 {
		this.bossacco = value;
	}
	
	/**
	 * 基金账号,登记中登账号时传入中登基金账号进行绑定（长盛使用）
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,登记中登账号时传入中登基金账号进行绑定（长盛使用）
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 账号号码,新增基金账号的可以不传， 但是如果是将交易账号和已有基金账号进行绑定的话，如果直销不支持多托管网点，必需要传入交易账号。
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 账号号码,新增基金账号的可以不传， 但是如果是将交易账号和已有基金账号进行绑定的话，如果直销不支持多托管网点，必需要传入交易账号。
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
	 * 处理方式,0：绑定已有的基金账号，1：增开新基金账号（此时DSMULTIBRANCHCODE和SYS_ACCOSTRUCTURE均不能为1），传空则根据直销参数DSMULTIBRANCHCODE判断
	 */
	public String getTreatment() {
		return this.treatment;
	}
	
	/**
	 * 处理方式,0：绑定已有的基金账号，1：增开新基金账号（此时DSMULTIBRANCHCODE和SYS_ACCOSTRUCTURE均不能为1），传空则根据直销参数DSMULTIBRANCHCODE判断
	 */
	public void setTreatment(String value)
	 {
		this.treatment = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("tacode", this.tacode);
		inputMap.put("accoflag", this.accoflag);
		inputMap.put("bossacco", this.bossacco);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("tradesource", this.tradesource);
		inputMap.put("treatment", this.treatment.toString());
	}
}
