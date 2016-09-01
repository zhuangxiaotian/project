package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 净值定制功能输出参数
 */
public class ISNetValueCustomizeOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 返回码,
	 */
	private String code;
	
	/**
	 * 返回信息,
	 */
	private String message;
	
	public ISNetValueCustomizeOutput() {
		this.setZ_funcCode("u1o");
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
