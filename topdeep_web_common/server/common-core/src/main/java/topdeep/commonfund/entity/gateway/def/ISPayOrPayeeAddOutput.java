package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 添加收款人或付款人信息入待支付表功能输出参数
 */
public class ISPayOrPayeeAddOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 二维码token，我要收款我要付款生成的二维码,
	 */
	private String token;
	
	/**
	 * 生成的协议号,
	 */
	private String payId;
	
	public ISPayOrPayeeAddOutput() {
		this.setZ_funcCode("m0a");
	}
	
	/**
	 * 二维码token，我要收款我要付款生成的二维码,
	 */
	public String getToken() {
		return this.token;
	}
	
	/**
	 * 二维码token，我要收款我要付款生成的二维码,
	 */
	public void setToken(String value)
	 {
		this.token = value;
	}
	
	/**
	 * 生成的协议号,
	 */
	public String getPayId() {
		return this.payId;
	}
	
	/**
	 * 生成的协议号,
	 */
	public void setPayId(String value)
	 {
		this.payId = value;
	}
}
