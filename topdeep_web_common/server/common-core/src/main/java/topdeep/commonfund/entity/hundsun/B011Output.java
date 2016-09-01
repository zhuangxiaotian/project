package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 易宝渠道无密验卡(B011)
 */
public class B011Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行返回码,请求网银时的产生的序列号
	 */
	private String respcode = "";
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	private String respdesc = "";
	
	/**
	 * 银行返回码,请求网银时的产生的序列号
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 银行返回码,请求网银时的产生的序列号
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 银行返回信息,银行返回的签约协议号
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
	}
}
