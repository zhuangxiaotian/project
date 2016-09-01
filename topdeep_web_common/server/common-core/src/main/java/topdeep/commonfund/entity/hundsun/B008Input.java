package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道当前银行卡验证(B008)
 */
public class B008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 请求序列号,使用C002中生成的请求序列号
	 */
	private String accoreqserial = "";
	
	/**
	 * 初始化参数
	 */
	public B008Input() {
		this.setFunction("B008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 请求序列号,使用C002中生成的请求序列号
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,使用C002中生成的请求序列号
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("accoreqserial", this.accoreqserial);
	}
}
