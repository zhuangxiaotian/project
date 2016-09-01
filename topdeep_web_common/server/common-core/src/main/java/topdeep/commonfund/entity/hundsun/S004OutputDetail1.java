package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易确认查询(S004)功能输出明细参数
 */
public class S004OutputDetail1 extends Object implements Serializable {
	
	/**
	 * 申请金额,
	 */
	private Double applyamount;
	
	/**
	 * 申请份额,
	 */
	private Double applyshare;
	
	/**
	 * 审核状态,
	 */
	private String custconfirm = "";
	
	/**
	 * 审核员名称,
	 */
	private String subaccoauditname = "";
	
	/**
	 * 审核员编号,
	 */
	private String subaccoauditno = "";
	
	/**
	 * 子账户名称,
	 */
	private String subacconame = "";
	
	/**
	 * 子账户编号,
	 */
	private String subaccono = "";
	
	/**
	 * 申请金额,
	 */
	public Double getApplyamount() {
		return this.applyamount;
	}
	
	/**
	 * 申请金额,
	 */
	public void setApplyamount(Double value)
	 {
		this.applyamount = value;
	}
	
	/**
	 * 申请份额,
	 */
	public Double getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setApplyshare(Double value)
	 {
		this.applyshare = value;
	}
	
	/**
	 * 审核状态,
	 */
	public String getCustconfirm() {
		return this.custconfirm;
	}
	
	/**
	 * 审核状态,
	 */
	public void setCustconfirm(String value)
	 {
		this.custconfirm = value;
	}
	
	/**
	 * 审核员名称,
	 */
	public String getSubaccoauditname() {
		return this.subaccoauditname;
	}
	
	/**
	 * 审核员名称,
	 */
	public void setSubaccoauditname(String value)
	 {
		this.subaccoauditname = value;
	}
	
	/**
	 * 审核员编号,
	 */
	public String getSubaccoauditno() {
		return this.subaccoauditno;
	}
	
	/**
	 * 审核员编号,
	 */
	public void setSubaccoauditno(String value)
	 {
		this.subaccoauditno = value;
	}
	
	/**
	 * 子账户名称,
	 */
	public String getSubacconame() {
		return this.subacconame;
	}
	
	/**
	 * 子账户名称,
	 */
	public void setSubacconame(String value)
	 {
		this.subacconame = value;
	}
	
	/**
	 * 子账户编号,
	 */
	public String getSubaccono() {
		return this.subaccono;
	}
	
	/**
	 * 子账户编号,
	 */
	public void setSubaccono(String value)
	 {
		this.subaccono = value;
	}
}
