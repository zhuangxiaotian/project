package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝份额查询(数据中心版)(S069)
 */
public class S069Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 页码,
	 */
	private String page = "";
	
	/**
	 * 证件号码,
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,
	 */
	private String identitytype;
	
	/**
	 * 每页记录数,
	 */
	private String recordperpage = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S069Input() {
		this.setFunction("S069");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 页码,
	 */
	public String getPage() {
		return this.page;
	}
	
	/**
	 * 页码,
	 */
	public void setPage(String value)
	 {
		this.page = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 每页记录数,
	 */
	public String getRecordperpage() {
		return this.recordperpage;
	}
	
	/**
	 * 每页记录数,
	 */
	public void setRecordperpage(String value)
	 {
		this.recordperpage = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("page", this.page);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype.toString());
		inputMap.put("recordperpage", this.recordperpage);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
