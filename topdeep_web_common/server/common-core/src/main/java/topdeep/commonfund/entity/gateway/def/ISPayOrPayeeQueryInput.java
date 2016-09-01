package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 支付查询功能输入参数
 */
public class ISPayOrPayeeQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 支付协议号,
	 */
	private String payId;
	
	/**
	 * 查询token扫码的时候传,
	 */
	private String token;
	
	public ISPayOrPayeeQueryInput() {
		this.setZ_funcCode("m0c");
	}
	
	/**
	 * 支付协议号,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 支付协议号,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
	
	/**
	 * 查询token扫码的时候传,
	 */
	public String getToken() {
		return this.token;
	}
	
	/**
	 * 查询token扫码的时候传,
	 */
	public void setToken(String value)
	 {
		this.token = value;
	}
}
