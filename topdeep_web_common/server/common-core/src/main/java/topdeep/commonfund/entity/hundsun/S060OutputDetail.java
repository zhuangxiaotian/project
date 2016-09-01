package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金详细信息查询(S060)功能输出明细参数
 */
public class S060OutputDetail extends Object implements Serializable {
	
	/**
	 * 预期截至日,
	 */
	private String contractenddate = "";
	
	/**
	 * 基金是否需要签署电子合同,
	 */
	private String contractflag = "";
	
	/**
	 * 级差,
	 */
	private String diffscale = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 风险等级,
	 */
	private String fundrisklevel = "";
	
	/**
	 * 基金状态,
	 */
	private String fundstate = "";
	
	/**
	 * 基金类型,
	 */
	private String fundtype = "";
	
	/**
	 * 起始日,
	 */
	private String issuedate = "";
	
	/**
	 * 基金管理人代码,只有当网上交易参数SYS_ISSUPPORTTHIRDPARTSALE为1时，才返回，取自表tfundmanager
	 */
	private String managercode = "";
	
	/**
	 * 最小持有份额,
	 */
	private String minshare = "";
	
	/**
	 * 产品期限,
	 */
	private String productduetime = "";
	
	/**
	 * 基金预期年化收益,
	 */
	private String profit = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * 预期截至日,
	 */
	public String getContractenddate() {
		return this.contractenddate;
	}
	
	/**
	 * 预期截至日,
	 */
	public void setContractenddate(String value)
	 {
		this.contractenddate = value;
	}
	
	/**
	 * 基金是否需要签署电子合同,
	 */
	public String getContractflag() {
		return this.contractflag;
	}
	
	/**
	 * 基金是否需要签署电子合同,
	 */
	public void setContractflag(String value)
	 {
		this.contractflag = value;
	}
	
	/**
	 * 级差,
	 */
	public String getDiffscale() {
		return this.diffscale;
	}
	
	/**
	 * 级差,
	 */
	public void setDiffscale(String value)
	 {
		this.diffscale = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 风险等级,
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 风险等级,
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 起始日,
	 */
	public String getIssuedate() {
		return this.issuedate;
	}
	
	/**
	 * 起始日,
	 */
	public void setIssuedate(String value)
	 {
		this.issuedate = value;
	}
	
	/**
	 * 基金管理人代码,只有当网上交易参数SYS_ISSUPPORTTHIRDPARTSALE为1时，才返回，取自表tfundmanager
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码,只有当网上交易参数SYS_ISSUPPORTTHIRDPARTSALE为1时，才返回，取自表tfundmanager
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 最小持有份额,
	 */
	public String getMinshare() {
		return this.minshare;
	}
	
	/**
	 * 最小持有份额,
	 */
	public void setMinshare(String value)
	 {
		this.minshare = value;
	}
	
	/**
	 * 产品期限,
	 */
	public String getProductduetime() {
		return this.productduetime;
	}
	
	/**
	 * 产品期限,
	 */
	public void setProductduetime(String value)
	 {
		this.productduetime = value;
	}
	
	/**
	 * 基金预期年化收益,
	 */
	public String getProfit() {
		return this.profit;
	}
	
	/**
	 * 基金预期年化收益,
	 */
	public void setProfit(String value)
	 {
		this.profit = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
}
