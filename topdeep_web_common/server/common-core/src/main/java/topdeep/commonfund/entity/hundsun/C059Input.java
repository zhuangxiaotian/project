package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户交易审核(C059)
 */
public class C059Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	private String custconfirm = "";
	
	/**
	 * 原始交易申请号,调用S083接口返回的申请编号
	 */
	private String originalapplyserial = "";
	
	/**
	 * 子账户交易账号,调用S083接口返回的tradeacco
	 */
	private String tradeacco = "";
	
	/**
	 * 子账户密码,子账户密码
	 */
	private String tradepassword = "";
	
	/**
	 * 初始化参数
	 */
	public C059Input() {
		this.setFunction("C059");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 客户确认标志,0-确认失败;1-确认成功;2-部分确认;4-已撤销交易;9-未处理;5－认购行为确认
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
	}
	
	/**
	 * 原始交易申请号,调用S083接口返回的申请编号
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原始交易申请号,调用S083接口返回的申请编号
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 子账户交易账号,调用S083接口返回的tradeacco
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 子账户交易账号,调用S083接口返回的tradeacco
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 子账户密码,子账户密码
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 子账户密码,子账户密码
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custconfirm", this.custconfirm);
		inputMap.put("originalapplyserial", this.originalapplyserial);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("tradepassword", this.tradepassword);
	}
}
