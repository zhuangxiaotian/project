package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取系统参数(P008)
 */
public class P008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 参数名称,如参数名：SYS_TACODE
	 */
	private String caption = "";
	
	/**
	 * 参数类别,如直销为SALE
	 */
	private String item = "";
	
	/**
	 * 初始化参数
	 */
	public P008Input() {
		this.setFunction("P008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 参数名称,如参数名：SYS_TACODE
	 */
	public String getCaption() {
		return this.caption;
	}
	
	/**
	 * 参数名称,如参数名：SYS_TACODE
	 */
	public void setCaption(String value)
	 {
		this.caption = value;
	}
	
	/**
	 * 参数类别,如直销为SALE
	 */
	public String getItem() {
		return this.item;
	}
	
	/**
	 * 参数类别,如直销为SALE
	 */
	public void setItem(String value)
	 {
		this.item = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("caption", this.caption);
		inputMap.put("item", this.item);
	}
}
