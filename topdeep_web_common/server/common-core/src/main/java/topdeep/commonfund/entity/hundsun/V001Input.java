package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 服务定制查询(V001)
 */
public class V001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 查询类型,1:所有信息模板,2:客户订制的信息模板
	 */
	private String querytype = "";
	
	/**
	 * 证件号,证件号
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,证件类型
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public V001Input() {
		this.setFunction("V001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 查询类型,1:所有信息模板,2:客户订制的信息模板
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,1:所有信息模板,2:客户订制的信息模板
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 证件号,证件号
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,证件号
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("querytype", this.querytype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
