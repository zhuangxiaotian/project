package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 代销T+0划款(T018)
 */
public class T018Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 划款状态,
	 */
	private String capitaloutstate = "";
	
	/**
	 * 资金流水号,
	 */
	private String capitalserial = "";
	
	/**
	 * 确认标志,
	 */
	private String confirmflag = "";
	
	/**
	 * 处理结果,直销返回的处理结果标志：0成功，其余都是失败
	 */
	private String dealresult = "";
	
	/**
	 * TA确认错误代码,
	 */
	private String taconfirmerrcode = "";
	
	/**
	 * TA确认错误信息,
	 */
	private String taconfirmerrmsg = "";
	
	/**
	 * 划款状态,
	 */
	public String getCapitaloutstate() {
		return this.capitaloutstate;
	}
	
	/**
	 * 划款状态,
	 */
	public void setCapitaloutstate(String value)
	 {
		this.capitaloutstate = value;
	}
	
	/**
	 * 资金流水号,
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水号,
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
	}
	
	/**
	 * 确认标志,
	 */
	public String getConfirmflag() {
		return this.confirmflag;
	}
	
	/**
	 * 确认标志,
	 */
	public void setConfirmflag(String value)
	 {
		this.confirmflag = value;
	}
	
	/**
	 * 处理结果,直销返回的处理结果标志：0成功，其余都是失败
	 */
	public String getDealresult() {
		return this.dealresult;
	}
	
	/**
	 * 处理结果,直销返回的处理结果标志：0成功，其余都是失败
	 */
	public void setDealresult(String value)
	 {
		this.dealresult = value;
	}
	
	/**
	 * TA确认错误代码,
	 */
	public String getTaconfirmerrcode() {
		return this.taconfirmerrcode;
	}
	
	/**
	 * TA确认错误代码,
	 */
	public void setTaconfirmerrcode(String value)
	 {
		this.taconfirmerrcode = value;
	}
	
	/**
	 * TA确认错误信息,
	 */
	public String getTaconfirmerrmsg() {
		return this.taconfirmerrmsg;
	}
	
	/**
	 * TA确认错误信息,
	 */
	public void setTaconfirmerrmsg(String value)
	 {
		this.taconfirmerrmsg = value;
	}
}
