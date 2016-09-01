package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 取消收付款功能输入参数
 */
public class ISPayOrPayeeCancelInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 收付款token,
	 */
	private String token;
	
	/**
	 * 取消类型1收款 2付款3收款人主动放弃收款,
	 */
	private String cancelType;
	
	public ISPayOrPayeeCancelInput() {
		this.setZ_funcCode("m0d");
	}
	
	/**
	 * 收付款token,
	 */
	public String getToken() {
		return this.token;
	}
	
	/**
	 * 收付款token,
	 */
	public void setToken(String value)
	 {
		this.token = value;
	}
	
	/**
	 * 取消类型1收款 2付款3收款人主动放弃收款,
	 */
	public String getCancelType() {
		return this.cancelType;
	}
	
	/**
	 * 取消类型1收款 2付款3收款人主动放弃收款,
	 */
	public void setCancelType(String value)
	 {
		this.cancelType = value;
	}
}
