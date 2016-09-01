package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询电子合同信息(E001)功能输出明细参数
 */
public class E001OutputDetail extends Object implements Serializable {
	
	/**
	 * 合同类型,电子合同时有值
	 */
	private String contracttype = "";
	
	/**
	 * 文件编号,文件编号若是电子合同，就是合同编号，若是风险揭示书，就是揭示书编号
	 */
	private String fileserial = "";
	
	/**
	 * 申请编号,电子合同时有值
	 */
	private String applyserial = "";
	
	/**
	 * 投资人名称,电子合同时有值
	 */
	private String custname = "";
	
	/**
	 * 客户类别,电子合同时有值
	 */
	private String custtype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,电子合同时有值
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,电子合同时有值
	 */
	private String identitytype = "";
	
	/**
	 * 签署日期,
	 */
	private String signdate = "";
	
	/**
	 * 签署时间,
	 */
	private String signtime = "";
	
	/**
	 * 最新标志,电子合同时有值
	 */
	private String currentflag = "";
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	private String filetype = "";
	
	/**
	 * 核对状态,0 待核对 、1 核对通过 、2 核对需补正(电子合同时有值)
	 */
	private String verifystatus = "";
	
	/**
	 * 托管人核对状态,电子合同时有值
	 */
	private String confirmstatuscustod = "";
	
	/**
	 * 管理人核对状态,电子合同时有值
	 */
	private String confirmstatusmanage = "";
	
	/**
	 * 合同类型,电子合同时有值
	 */
	public String getContracttype() {
		return this.contracttype;
	}
	
	/**
	 * 合同类型,电子合同时有值
	 */
	public void setContracttype(String value)
	 {
		this.contracttype = value;
	}
	
	/**
	 * 文件编号,文件编号若是电子合同，就是合同编号，若是风险揭示书，就是揭示书编号
	 */
	public String getFileserial() {
		return this.fileserial;
	}
	
	/**
	 * 文件编号,文件编号若是电子合同，就是合同编号，若是风险揭示书，就是揭示书编号
	 */
	public void setFileserial(String value)
	 {
		this.fileserial = value;
	}
	
	/**
	 * 申请编号,电子合同时有值
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,电子合同时有值
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 投资人名称,电子合同时有值
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 投资人名称,电子合同时有值
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 客户类别,电子合同时有值
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类别,电子合同时有值
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
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
	 * 证件号码,电子合同时有值
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,电子合同时有值
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,电子合同时有值
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,电子合同时有值
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
	 * 最新标志,电子合同时有值
	 */
	public String getCurrentflag() {
		return this.currentflag;
	}
	
	/**
	 * 最新标志,电子合同时有值
	 */
	public void setCurrentflag(String value)
	 {
		this.currentflag = value;
	}
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	public String getFiletype() {
		return this.filetype;
	}
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	public void setFiletype(String value)
	 {
		this.filetype = value;
	}
	
	/**
	 * 核对状态,0 待核对 、1 核对通过 、2 核对需补正(电子合同时有值)
	 */
	public String getVerifystatus() {
		return this.verifystatus;
	}
	
	/**
	 * 核对状态,0 待核对 、1 核对通过 、2 核对需补正(电子合同时有值)
	 */
	public void setVerifystatus(String value)
	 {
		this.verifystatus = value;
	}
	
	/**
	 * 托管人核对状态,电子合同时有值
	 */
	public String getConfirmstatuscustod() {
		return this.confirmstatuscustod;
	}
	
	/**
	 * 托管人核对状态,电子合同时有值
	 */
	public void setConfirmstatuscustod(String value)
	 {
		this.confirmstatuscustod = value;
	}
	
	/**
	 * 管理人核对状态,电子合同时有值
	 */
	public String getConfirmstatusmanage() {
		return this.confirmstatusmanage;
	}
	
	/**
	 * 管理人核对状态,电子合同时有值
	 */
	public void setConfirmstatusmanage(String value)
	 {
		this.confirmstatusmanage = value;
	}
}
