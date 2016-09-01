package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定制信息功能输出参数
 */
public class ISServeCustomizeOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 返回码,
	 */
	private String code;
	
	/**
	 * 返回信息,
	 */
	private String message;
	
	public ISServeCustomizeOutput() {
		this.setZ_funcCode("u1n");
	}
	
	/**
	 * 返回码,
	 */
	public String getCode() {
		return this.code;
	}
	
	/**
	 * 返回码,
	 */
	public void setCode(String value)
	 {
		this.code = value;
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
}
