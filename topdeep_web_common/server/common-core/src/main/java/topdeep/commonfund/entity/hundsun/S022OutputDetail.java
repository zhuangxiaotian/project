package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易限制查询(S022)功能输出明细参数
 */
public class S022OutputDetail extends Object implements Serializable {
	
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
	 * 客户类型,1:个人 0：机构
	 */
	private String custtype = "";
	
	/**
	 * 审核标志,0-如果超出则不能交易;1-如果超出需要主管
	 */
	private String flag = "";
	
	/**
	 * 业务禁止标志,该标志目前只对基金转换类业务（036|982|983|984|985|986）开放，如果选择“禁止”，则最小值、最大值、追加最低值必需为0
	 */
	private String forbidflag = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 最大值,
	 */
	private String maxvalue = "";
	
	/**
	 * 最小值,
	 */
	private String minvalue = "";
	
	/**
	 * 对方基金,
	 */
	private String otherfundcode = "";
	
	/**
	 * 优先级标志,
	 */
	private String priflag = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 追加投资最小值,
	 */
	private String sndminvalue = "";
	
	/**
	 * 委托方式,
	 */
	private String trust = "";
	
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
	
	/**
	 * 审核标志,0-如果超出则不能交易;1-如果超出需要主管
	 */
	public String getFlag() {
		return this.flag;
	}
	
	/**
	 * 审核标志,0-如果超出则不能交易;1-如果超出需要主管
	 */
	public void setFlag(String value)
	 {
		this.flag = value;
	}
	
	/**
	 * 业务禁止标志,该标志目前只对基金转换类业务（036|982|983|984|985|986）开放，如果选择“禁止”，则最小值、最大值、追加最低值必需为0
	 */
	public String getForbidflag() {
		return this.forbidflag;
	}
	
	/**
	 * 业务禁止标志,该标志目前只对基金转换类业务（036|982|983|984|985|986）开放，如果选择“禁止”，则最小值、最大值、追加最低值必需为0
	 */
	public void setForbidflag(String value)
	 {
		this.forbidflag = value;
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
	 * 最大值,
	 */
	public String getMaxvalue() {
		return this.maxvalue;
	}
	
	/**
	 * 最大值,
	 */
	public void setMaxvalue(String value)
	 {
		this.maxvalue = value;
	}
	
	/**
	 * 最小值,
	 */
	public String getMinvalue() {
		return this.minvalue;
	}
	
	/**
	 * 最小值,
	 */
	public void setMinvalue(String value)
	 {
		this.minvalue = value;
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
	 * 优先级标志,
	 */
	public String getPriflag() {
		return this.priflag;
	}
	
	/**
	 * 优先级标志,
	 */
	public void setPriflag(String value)
	 {
		this.priflag = value;
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
	 * 追加投资最小值,
	 */
	public String getSndminvalue() {
		return this.sndminvalue;
	}
	
	/**
	 * 追加投资最小值,
	 */
	public void setSndminvalue(String value)
	 {
		this.sndminvalue = value;
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
}
