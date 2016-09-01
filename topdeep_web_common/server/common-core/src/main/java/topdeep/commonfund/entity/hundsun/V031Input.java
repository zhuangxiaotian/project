package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户积分兑换(V031)
 */
public class V031Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号或理财账号,登入用户可以不传，默认取sessionkey中的对应数据中心custno(注：custno为空无法正常兑换)
	 */
	private String custno = "";
	
	/**
	 * 邮寄地址,
	 */
	private String address = "";
	
	/**
	 * 是否按区间兑换,
	 */
	private String exchangearea = "";
	
	/**
	 * 提醒方式,
	 */
	private String notifytype = "";
	
	/**
	 * 联系电话,
	 */
	private String phone = "";
	
	/**
	 * 礼品编号,
	 */
	private String presentno = "";
	
	/**
	 * 兑换数量,
	 */
	private String presentnum = "";
	
	/**
	 * 收件人,
	 */
	private String receiver = "";
	
	/**
	 * 邮编,
	 */
	private String zipcode = "";
	
	/**
	 * 初始化参数
	 */
	public V031Input() {
		this.setFunction("V031");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号或理财账号,登入用户可以不传，默认取sessionkey中的对应数据中心custno(注：custno为空无法正常兑换)
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号或理财账号,登入用户可以不传，默认取sessionkey中的对应数据中心custno(注：custno为空无法正常兑换)
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 邮寄地址,
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * 邮寄地址,
	 */
	public void setAddress(String value)
	 {
		this.address = value;
	}
	
	/**
	 * 是否按区间兑换,
	 */
	public String getExchangearea() {
		return this.exchangearea;
	}
	
	/**
	 * 是否按区间兑换,
	 */
	public void setExchangearea(String value)
	 {
		this.exchangearea = value;
	}
	
	/**
	 * 提醒方式,
	 */
	public String getNotifytype() {
		return this.notifytype;
	}
	
	/**
	 * 提醒方式,
	 */
	public void setNotifytype(String value)
	 {
		this.notifytype = value;
	}
	
	/**
	 * 联系电话,
	 */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * 联系电话,
	 */
	public void setPhone(String value)
	 {
		this.phone = value;
	}
	
	/**
	 * 礼品编号,
	 */
	public String getPresentno() {
		return this.presentno;
	}
	
	/**
	 * 礼品编号,
	 */
	public void setPresentno(String value)
	 {
		this.presentno = value;
	}
	
	/**
	 * 兑换数量,
	 */
	public String getPresentnum() {
		return this.presentnum;
	}
	
	/**
	 * 兑换数量,
	 */
	public void setPresentnum(String value)
	 {
		this.presentnum = value;
	}
	
	/**
	 * 收件人,
	 */
	public String getReceiver() {
		return this.receiver;
	}
	
	/**
	 * 收件人,
	 */
	public void setReceiver(String value)
	 {
		this.receiver = value;
	}
	
	/**
	 * 邮编,
	 */
	public String getZipcode() {
		return this.zipcode;
	}
	
	/**
	 * 邮编,
	 */
	public void setZipcode(String value)
	 {
		this.zipcode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("address", this.address);
		inputMap.put("exchangearea", this.exchangearea);
		inputMap.put("notifytype", this.notifytype);
		inputMap.put("phone", this.phone);
		inputMap.put("presentno", this.presentno);
		inputMap.put("presentnum", this.presentnum);
		inputMap.put("receiver", this.receiver);
		inputMap.put("zipcode", this.zipcode);
	}
}
