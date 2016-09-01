package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户角色查询(C053)
 */
public class C053Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 客户类型,1-个人；0-机构
	 */
	private String custtype = "";
	
	/**
	 * 是否有数据中心数据,1-有；0-无
	 */
	private String dc = "";
	
	/**
	 * 是否有直销数据,1-有；0-无
	 */
	private String ds = "";
	
	/**
	 * 是否首次登陆,1-是；0-否；空-无数据中心数据
	 */
	private String firstlogin = "";
	
	/**
	 * 返回信息,
	 */
	private String message = "";
	
	/**
	 * 是否开通网上交易,1-开通；0-未开通
	 */
	private String internet = "";
	
	/**
	 * 客户类型,1-个人；0-机构
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,1-个人；0-机构
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 是否有数据中心数据,1-有；0-无
	 */
	public String getDc() {
		return this.dc;
	}
	
	/**
	 * 是否有数据中心数据,1-有；0-无
	 */
	public void setDc(String value)
	 {
		this.dc = value;
	}
	
	/**
	 * 是否有直销数据,1-有；0-无
	 */
	public String getDs() {
		return this.ds;
	}
	
	/**
	 * 是否有直销数据,1-有；0-无
	 */
	public void setDs(String value)
	 {
		this.ds = value;
	}
	
	/**
	 * 是否首次登陆,1-是；0-否；空-无数据中心数据
	 */
	public String getFirstlogin() {
		return this.firstlogin;
	}
	
	/**
	 * 是否首次登陆,1-是；0-否；空-无数据中心数据
	 */
	public void setFirstlogin(String value)
	 {
		this.firstlogin = value;
	}
	
	/**
	 * 返回信息,
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * 返回信息,
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	/**
	 * 是否开通网上交易,1-开通；0-未开通
	 */
	public String getInternet() {
		return this.internet;
	}
	
	/**
	 * 是否开通网上交易,1-开通；0-未开通
	 */
	public void setInternet(String value)
	 {
		this.internet = value;
	}
}
