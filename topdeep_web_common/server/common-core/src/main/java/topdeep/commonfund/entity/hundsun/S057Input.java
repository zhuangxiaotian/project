package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 追加投资查询(S057)
 */
public class S057Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,如果已登录可以通过传sessionKey而不传custno
	 */
	private String custno = "";
	
	/**
	 * 初始化参数
	 */
	public S057Input() {
		this.setFunction("S057");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,如果已登录可以通过传sessionKey而不传custno
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果已登录可以通过传sessionKey而不传custno
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
	}
}
