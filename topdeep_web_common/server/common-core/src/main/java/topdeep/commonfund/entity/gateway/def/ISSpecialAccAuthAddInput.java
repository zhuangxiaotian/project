package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 新增专户用户授权功能输入参数
 */
public class ISSpecialAccAuthAddInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno;
	
	/**
	 * 基金帐号,
	 */
	private String fundacco;
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno;
	
	/**
	 * 证件类型,如0—身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype;
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	private String qualificationenddate;
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	private String qualificationflag;
	
	/**
	 * 交易密码,
	 */
	private String tradepassword;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 客户编号,
	 */
	private String custNo;
	
	public ISSpecialAccAuthAddInput() {
		this.setZ_funcCode("u0y");
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
	 * 证件类型,如0—身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0—身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	public String getQualificationenddate() {
		return this.qualificationenddate;
	}
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	public void setQualificationenddate(String value)
	 {
		this.qualificationenddate = value;
	}
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	public String getQualificationflag() {
		return this.qualificationflag;
	}
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	public void setQualificationflag(String value)
	 {
		this.qualificationflag = value;
	}
	
	/**
	 * 交易密码,
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
}
