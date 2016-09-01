package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 身份证正反面认证(C068)
 */
public class C068Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,目前支持证通通讯机z1
	 */
	private String capitalmode = "";
	
	/**
	 * 身份证正面照片流,
	 */
	private String cerfront = "";
	
	/**
	 * 身份证反面照片流,
	 */
	private String certnegative = "";
	
	/**
	 * 初始化参数
	 */
	public C068Input() {
		this.setFunction("C068");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 资金方式,目前支持证通通讯机z1
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,目前支持证通通讯机z1
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 身份证正面照片流,
	 */
	public String getCerfront() {
		return this.cerfront;
	}
	
	/**
	 * 身份证正面照片流,
	 */
	public void setCerfront(String value)
	 {
		this.cerfront = value;
	}
	
	/**
	 * 身份证反面照片流,
	 */
	public String getCertnegative() {
		return this.certnegative;
	}
	
	/**
	 * 身份证反面照片流,
	 */
	public void setCertnegative(String value)
	 {
		this.certnegative = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("cerfront", this.cerfront);
		inputMap.put("certnegative", this.certnegative);
	}
}
