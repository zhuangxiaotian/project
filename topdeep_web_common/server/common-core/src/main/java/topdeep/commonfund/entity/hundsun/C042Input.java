package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 删除微信绑定(C042)
 */
public class C042Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 绑定ID,
	 */
	private String systemid = "";
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	private String systemtype = "";
	
	/**
	 * 初始化参数
	 */
	public C042Input() {
		this.setFunction("C042");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 绑定ID,
	 */
	public String getSystemid() {
		return this.systemid;
	}
	
	/**
	 * 绑定ID,
	 */
	public void setSystemid(String value)
	 {
		this.systemid = value;
	}
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	public String getSystemtype() {
		return this.systemtype;
	}
	
	/**
	 * 绑定系统类型：weixin/ios/adndroid/winphone,weixin/ios/adndroid/winphone
	 */
	public void setSystemtype(String value)
	 {
		this.systemtype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("systemid", this.systemid);
		inputMap.put("systemtype", this.systemtype);
	}
}
