package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道当前银行卡验证(B008)
 */
public class B008Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 银行卡号,
	 */
	private String bankacco = "";
	
	/**
	 * 银行编号,
	 */
	private String bankserial = "";
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	private String busitype = "";
	
	/**
	 * 成功标识,绑定成功：1,绑定失败：0
	 */
	private String flag = "";
	
	/**
	 * 汇付返回码,
	 */
	private String respcode = "";
	
	/**
	 * 汇付返回信息,
	 */
	private String respdesc = "";
	
	/**
	 * 银行卡号,
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankserial() {
		return this.bankserial;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankserial(String value)
	 {
		this.bankserial = value;
	}
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public String getBusitype() {
		return this.busitype;
	}
	
	/**
	 * 后续业务类别,值为openacco走开户流程值为regacco走登记流程 开户和登记调用接口为007,值为applyacco走开通流程，开通流程调用接口为008
	 */
	public void setBusitype(String value)
	 {
		this.busitype = value;
	}
	
	/**
	 * 成功标识,绑定成功：1,绑定失败：0
	 */
	public String getFlag() {
		return this.flag;
	}
	
	/**
	 * 成功标识,绑定成功：1,绑定失败：0
	 */
	public void setFlag(String value)
	 {
		this.flag = value;
	}
	
	/**
	 * 汇付返回码,
	 */
	public String getRespcode() {
		return this.respcode;
	}
	
	/**
	 * 汇付返回码,
	 */
	public void setRespcode(String value)
	 {
		this.respcode = value;
	}
	
	/**
	 * 汇付返回信息,
	 */
	public String getRespdesc() {
		return this.respdesc;
	}
	
	/**
	 * 汇付返回信息,
	 */
	public void setRespdesc(String value)
	 {
		this.respdesc = value;
	}
}
