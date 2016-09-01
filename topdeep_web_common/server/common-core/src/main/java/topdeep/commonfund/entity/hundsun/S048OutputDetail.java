package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 公共事业缴费查询(S048)功能输出明细参数
 */
public class S048OutputDetail extends Object implements Serializable {
	
	/**
	 * 地址信息,
	 */
	private String addntxninf = "";
	
	/**
	 * 机构流水号,
	 */
	private String origssn = "";
	
	/**
	 * 金额,
	 */
	private String txnamt = "";
	
	/**
	 * 地址信息,
	 */
	public String getAddntxninf() {
		return this.addntxninf;
	}
	
	/**
	 * 地址信息,
	 */
	public void setAddntxninf(String value)
	 {
		this.addntxninf = value;
	}
	
	/**
	 * 机构流水号,
	 */
	public String getOrigssn() {
		return this.origssn;
	}
	
	/**
	 * 机构流水号,
	 */
	public void setOrigssn(String value)
	 {
		this.origssn = value;
	}
	
	/**
	 * 金额,
	 */
	public String getTxnamt() {
		return this.txnamt;
	}
	
	/**
	 * 金额,
	 */
	public void setTxnamt(String value)
	 {
		this.txnamt = value;
	}
}
