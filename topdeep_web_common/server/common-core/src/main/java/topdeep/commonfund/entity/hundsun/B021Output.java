package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道单笔余额查询(B021)
 */
public class B021Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 实际余额,
	 */
	private String balance = "单位为元";
	
	/**
	 * 汇付响应码,
	 */
	private String respCode = "";
	
	/**
	 * 汇付响应描述,
	 */
	private String respDesc = "";
	
	/**
	 * 实际余额,
	 */
	public String getBalance() {
		return this.balance;
	}
	
	/**
	 * 实际余额,
	 */
	public void setBalance(String value)
	 {
		this.balance = value;
	}
	
	/**
	 * 汇付响应码,
	 */
	public String getRespCode() {
		return this.respCode;
	}
	
	/**
	 * 汇付响应码,
	 */
	public void setRespCode(String value)
	 {
		this.respCode = value;
	}
	
	/**
	 * 汇付响应描述,
	 */
	public String getRespDesc() {
		return this.respDesc;
	}
	
	/**
	 * 汇付响应描述,
	 */
	public void setRespDesc(String value)
	 {
		this.respDesc = value;
	}
}
