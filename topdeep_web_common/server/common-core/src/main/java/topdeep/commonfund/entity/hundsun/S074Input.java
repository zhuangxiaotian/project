package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 被推荐人明细查询接口(S074)
 */
public class S074Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 每页记录数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 推荐人名称,
	 */
	private String custname = "";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 推荐人客户编号,
	 */
	private String custno = "";
	
	/**
	 * 初始化参数
	 */
	public S074Input() {
		this.setFunction("S074");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 每页记录数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页记录数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 推荐人名称,
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 推荐人名称,
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
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
	 * 推荐人客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 推荐人客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("custname", this.custname);
		inputMap.put("pageno", this.pageno);
		inputMap.put("custno", this.custno);
	}
}
