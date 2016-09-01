package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 检查版本功能输入参数
 */
public class ISCheckVersionInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户端类型,
	 */
	private String clientType;
	
	/**
	 * 客户端版本,
	 */
	private String clientVersion;
	
	/**
	 * 客户端信息,
	 */
	private String clientInfo;
	
	/**
	 * 客户端签名信息,
	 */
	private String clientSignature;
	
	public ISCheckVersionInput() {
		this.setZ_funcCode("b02");
	}
	
	/**
	 * 客户端类型,
	 */
	public String getClientType() {
		return this.clientType;
	}
	
	/**
	 * 客户端类型,
	 */
	public void setClientType(String value)
	 {
		this.clientType = value;
	}
	
	/**
	 * 客户端版本,
	 */
	public String getClientVersion() {
		return this.clientVersion;
	}
	
	/**
	 * 客户端版本,
	 */
	public void setClientVersion(String value)
	 {
		this.clientVersion = value;
	}
	
	/**
	 * 客户端信息,
	 */
	public String getClientInfo() {
		return this.clientInfo;
	}
	
	/**
	 * 客户端信息,
	 */
	public void setClientInfo(String value)
	 {
		this.clientInfo = value;
	}
	
	/**
	 * 客户端签名信息,
	 */
	public String getClientSignature() {
		return this.clientSignature;
	}
	
	/**
	 * 客户端签名信息,
	 */
	public void setClientSignature(String value)
	 {
		this.clientSignature = value;
	}
}
