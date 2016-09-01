package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 建行快捷付签约查询(B044)
 */
public class B044Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 签约协议号,
	 */
	private String customno = "";
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 初始化参数
	 */
	public B044Input() {
		this.setFunction("B044");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 签约协议号,
	 */
	public String getCustomno() {
		return this.customno;
	}
	
	/**
	 * 签约协议号,
	 */
	public void setCustomno(String value)
	 {
		this.customno = value;
	}
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("customno", this.customno);
		inputMap.put("capitalmode", this.capitalmode);
	}
}
