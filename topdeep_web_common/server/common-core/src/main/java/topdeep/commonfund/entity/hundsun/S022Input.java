package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易限制查询(S022)
 */
public class S022Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String bankno = "";
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 客户分类,
	 */
	private String custkind = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 对方基金,
	 */
	private String otherfundcode = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
	/**
	 * 客户类型,1:个人 0：机构
	 */
	private String custtype = "";
	
	/**
	 * 初始化参数
	 */
	public S022Input() {
		this.setFunction("S022");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 银行编号,
	 */
	public String getBankno() {
		return this.bankno;
	}
	
	/**
	 * 银行编号,
	 */
	public void setBankno(String value)
	 {
		this.bankno = value;
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 客户分类,
	 */
	public String getCustkind() {
		return this.custkind;
	}
	
	/**
	 * 客户分类,
	 */
	public void setCustkind(String value)
	 {
		this.custkind = value;
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
	 * 对方基金,
	 */
	public String getOtherfundcode() {
		return this.otherfundcode;
	}
	
	/**
	 * 对方基金,
	 */
	public void setOtherfundcode(String value)
	 {
		this.otherfundcode = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 委托方式,
	 */
	public String getTrust() {
		return this.trust;
	}
	
	/**
	 * 委托方式,
	 */
	public void setTrust(String value)
	 {
		this.trust = value;
	}
	
	/**
	 * 客户类型,1:个人 0：机构
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,1:个人 0：机构
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("bankno", this.bankno);
		inputMap.put("businflag", this.businflag);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("custkind", this.custkind);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("otherfundcode", this.otherfundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("trust", this.trust);
		inputMap.put("custtype", this.custtype);
	}
}
