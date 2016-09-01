package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询电子合同信息功能输出明细参数
 */
public class ISEletricContractQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial;
	
	/**
	 * 合同类型,
	 */
	private String constracttype;
	
	/**
	 * 投资人名称,
	 */
	private String custname;
	
	/**
	 * 客户类别,
	 */
	private String custtype;
	
	/**
	 * 文件编号,
	 */
	private String fileserial;
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 证件号码,
	 */
	private String identityno;
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 签署日期,
	 */
	private String signdate;
	
	/**
	 * 签署时间,
	 */
	private String signtime;
	
	/**
	 * 最新标志,
	 */
	private String currentflag;
	
	/**
	 * 文件类型,
	 */
	private String filetype;
	
	/**
	 * 核对状态,
	 */
	private String verifystatus;
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 合同类型,
	 */
	public String getConstracttype() {
		return this.constracttype;
	}
	
	/**
	 * 合同类型,
	 */
	public void setConstracttype(String value)
	 {
		this.constracttype = value;
	}
	
	/**
	 * 投资人名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 投资人名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户类别,
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 文件编号,
	 */
	public String getFileserial() {
		return this.fileserial;
	}
	
	/**
	 * 文件编号,
	 */
	public void setFileserial(String value)
	 {
		this.fileserial = value;
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
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 签署日期,
	 */
	public String getSigndate() {
		return this.signdate;
	}
	
	/**
	 * 签署日期,
	 */
	public void setSigndate(String value)
	 {
		this.signdate = value;
	}
	
	/**
	 * 签署时间,
	 */
	public String getSigntime() {
		return this.signtime;
	}
	
	/**
	 * 签署时间,
	 */
	public void setSigntime(String value)
	 {
		this.signtime = value;
	}
	
	/**
	 * 最新标志,
	 */
	public String getCurrentflag() {
		return this.currentflag;
	}
	
	/**
	 * 最新标志,
	 */
	public void setCurrentflag(String value)
	 {
		this.currentflag = value;
	}
	
	/**
	 * 文件类型,
	 */
	public String getFiletype() {
		return this.filetype;
	}
	
	/**
	 * 文件类型,
	 */
	public void setFiletype(String value)
	 {
		this.filetype = value;
	}
	
	/**
	 * 核对状态,
	 */
	public String getVerifystatus() {
		return this.verifystatus;
	}
	
	/**
	 * 核对状态,
	 */
	public void setVerifystatus(String value)
	 {
		this.verifystatus = value;
	}
}
