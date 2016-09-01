package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可购买基金列表(T001)
 */
public class T001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,020:返回认购列表;022:返回申购列表;空:返回所有基金
	 */
	private String businflag = "";
	
	/**
	 * 过滤标志,1：过滤专户2：只返回专户基金列表；其他不过滤
	 */
	private String filterflag = "";
	
	/**
	 * 证件号,定向基金白名单表中的用户证件号，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,定向基金白名单表中的用户证件类型，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public T001Input() {
		this.setFunction("T001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,020:返回认购列表;022:返回申购列表;空:返回所有基金
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:返回认购列表;022:返回申购列表;空:返回所有基金
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 过滤标志,1：过滤专户2：只返回专户基金列表；其他不过滤
	 */
	public String getFilterflag() {
		return this.filterflag;
	}
	
	/**
	 * 过滤标志,1：过滤专户2：只返回专户基金列表；其他不过滤
	 */
	public void setFilterflag(String value)
	 {
		this.filterflag = value;
	}
	
	/**
	 * 证件号,定向基金白名单表中的用户证件号，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,定向基金白名单表中的用户证件号，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,定向基金白名单表中的用户证件类型，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,定向基金白名单表中的用户证件类型，只有在需要使用白名单过滤功能时为非空验证参数
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("filterflag", this.filterflag);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
