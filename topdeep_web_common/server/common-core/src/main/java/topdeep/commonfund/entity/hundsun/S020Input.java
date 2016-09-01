package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 短期理财明细查询(S020)
 */
public class S020Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 查询方式,DS：直销接口查询，其他数据中心查询
	 */
	private String querytype = "";
	
	/**
	 * 申请记录数,仅当数据来源传DS时有效
	 */
	private String applyrecordno = "";
	
	/**
	 * 当前页码,仅当数据来源传DS时有效
	 */
	private String pageno = "";
	
	/**
	 * 初始化参数
	 */
	public S020Input() {
		this.setFunction("S020");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 查询方式,DS：直销接口查询，其他数据中心查询
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询方式,DS：直销接口查询，其他数据中心查询
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 申请记录数,仅当数据来源传DS时有效
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请记录数,仅当数据来源传DS时有效
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 当前页码,仅当数据来源传DS时有效
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,仅当数据来源传DS时有效
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("querytype", this.querytype);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("pageno", this.pageno);
	}
}
