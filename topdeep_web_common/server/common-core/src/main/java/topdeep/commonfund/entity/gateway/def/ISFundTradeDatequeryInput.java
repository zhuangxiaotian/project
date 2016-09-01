package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 交易日期查询功能输入参数
 */
public class ISFundTradeDatequeryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * TA代码,
	 */
	private String taNo;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 交易方式,
	 */
	private String acceptMethod;
	
	public ISFundTradeDatequeryInput() {
		this.setZ_funcCode("n1e");
	}
	
	/**
	 * TA代码,
	 */
	public String getTaNo() {
		return this.taNo;
	}
	
	/**
	 * TA代码,
	 */
	public void setTaNo(String value)
	 {
		this.taNo = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
	}
	
	/**
	 * 交易方式,
	 */
	public String getAcceptMethod() {
		return this.acceptMethod;
	}
	
	/**
	 * 交易方式,
	 */
	public void setAcceptMethod(String value)
	 {
		this.acceptMethod = value;
	}
}
