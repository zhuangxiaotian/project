package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 更新Session中的用户功能输入参数
 */
public class ISSessionUserUpdateInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 证件类型,证件类型
	 */
	private String idType;
	
	/**
	 * 证件号码,证件号码
	 */
	private String idNo;
	
	/**
	 * 验证码,
	 */
	private String validPassword;
	
	public ISSessionUserUpdateInput() {
		this.setZ_funcCode("b03");
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,证件类型
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 证件号码,证件号码
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,证件号码
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 验证码,
	 */
	public String getValidPassword() {
		return this.validPassword;
	}
	
	/**
	 * 验证码,
	 */
	public void setValidPassword(String value)
	 {
		this.validPassword = value;
	}
}
