package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询电子合同信息(E001)
 */
public class E001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	private String filetype = "";
	
	/**
	 * 初始化参数
	 */
	public E001Input() {
		this.setFunction("E001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
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
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	public String getFiletype() {
		return this.filetype;
	}
	
	/**
	 * 文件类型,0：电子合同；1：风险揭示书；2：全部（包括1、2两点）；3：电子签名约定书
	 */
	public void setFiletype(String value)
	 {
		this.filetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("filetype", this.filetype);
	}
}
