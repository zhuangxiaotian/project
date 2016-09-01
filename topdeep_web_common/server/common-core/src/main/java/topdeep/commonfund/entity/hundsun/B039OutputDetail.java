package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联行号查询(B039)功能输出明细参数
 */
public class B039OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 联行号,
	 */
	private String branchbank = "";
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 联行号,
	 */
	public String getBranchbank() {
		return this.branchbank;
	}
	
	/**
	 * 联行号,
	 */
	public void setBranchbank(String value)
	 {
		this.branchbank = value;
	}
}
