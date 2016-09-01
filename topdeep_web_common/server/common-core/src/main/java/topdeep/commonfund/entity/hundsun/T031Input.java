package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 批量申购(后台模式)(T031)
 */
public class T031Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请数据,包含所有json格式批量交易申请数据的base64编码的字符串
	 */
	private String reqparams = "";
	
	/**
	 * 回调地址,异步通知申请结果的回调地址
	 */
	private String returnurl = "";
	
	/**
	 * 初始化参数
	 */
	public T031Input() {
		this.setFunction("T031");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请数据,包含所有json格式批量交易申请数据的base64编码的字符串
	 */
	public String getReqparams() {
		return this.reqparams;
	}
	
	/**
	 * 申请数据,包含所有json格式批量交易申请数据的base64编码的字符串
	 */
	public void setReqparams(String value)
	 {
		this.reqparams = value;
	}
	
	/**
	 * 回调地址,异步通知申请结果的回调地址
	 */
	public String getReturnurl() {
		return this.returnurl;
	}
	
	/**
	 * 回调地址,异步通知申请结果的回调地址
	 */
	public void setReturnurl(String value)
	 {
		this.returnurl = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("reqparams", this.reqparams);
		inputMap.put("returnurl", this.returnurl);
	}
}
