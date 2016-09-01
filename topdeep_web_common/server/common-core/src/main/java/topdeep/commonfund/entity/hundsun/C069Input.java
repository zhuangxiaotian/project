package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 身份证认证查询(C069)
 */
public class C069Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 资金方式,目前支持证通通讯机z1
	 */
	private String capitalmode = "";
	
	/**
	 * 申请流水号,来自于身份证正反面认证出参
	 */
	private String reqserial = "";
	
	/**
	 * 初始化参数
	 */
	public C069Input() {
		this.setFunction("C069");
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
	 * 申请流水号,来自于身份证正反面认证出参
	 */
	public String getReqserial() {
		return this.reqserial;
	}
	
	/**
	 * 申请流水号,来自于身份证正反面认证出参
	 */
	public void setReqserial(String value)
	 {
		this.reqserial = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("capitalmode", this.capitalmode);
		inputMap.put("reqserial", this.reqserial);
	}
}
