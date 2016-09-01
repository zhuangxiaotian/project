package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投协议查询(I025)
 */
public class I025Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 每页条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 证件号,
	 */
	private String identityno = "sessionkey不填时，必填";
	
	/**
	 * 证件类型,
	 */
	private String identitytype = "sessionkey不填时，必填";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "根据交易账号筛选结果";
	
	/**
	 * 初始化参数
	 */
	public I025Input() {
		this.setFunction("I025");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 每页条数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页条数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 证件号,
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号,
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
	 * 页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
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
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("pageno", this.pageno);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
