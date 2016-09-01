package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道当前银行卡变更(B015)
 */
public class B015Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行返回码,
	 */
	private String respcode = "";
	
	/**
	 * 银行返回信息,
	 */
	private String respdesc = "";
	
	/**
	 * 银行返回码,
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 银行返回码,
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 银行返回信息,
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 银行返回信息,
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
	}
}
