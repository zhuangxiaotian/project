package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定制服务(V008)
 */
public class V008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 定制的taskcode列表,格式，南方项目多个,号分隔：${taskcode1},${taskcode2},${taskcode3}。其它项目示例:1:1021|1:1022|1:1023|2:3022|2:3033|2:3034(即信息形式:编码为一组,每组以竖线间隔,注意此处的值应该为V007接口返回值的子集)
	 */
	private String orders = "";
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	private String type = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 初始化参数
	 */
	public V008Input() {
		this.setFunction("V008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 定制的taskcode列表,格式，南方项目多个,号分隔：${taskcode1},${taskcode2},${taskcode3}。其它项目示例:1:1021|1:1022|1:1023|2:3022|2:3033|2:3034(即信息形式:编码为一组,每组以竖线间隔,注意此处的值应该为V007接口返回值的子集)
	 */
	public String getOrders() {
		return this.orders;
	}
	
	/**
	 * 定制的taskcode列表,格式，南方项目多个,号分隔：${taskcode1},${taskcode2},${taskcode3}。其它项目示例:1:1021|1:1022|1:1023|2:3022|2:3033|2:3034(即信息形式:编码为一组,每组以竖线间隔,注意此处的值应该为V007接口返回值的子集)
	 */
	public void setOrders(String value)
	 {
		this.orders = value;
	}
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("orders", this.orders);
		inputMap.put("type", this.type);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
	}
}
