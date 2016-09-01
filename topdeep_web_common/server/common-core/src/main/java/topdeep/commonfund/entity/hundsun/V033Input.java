package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 积分兑换列表(V033)
 */
public class V033Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,登入用户可不传，则取sessionkey中的对应数据中心custno（注：该值为空查不到结果）
	 */
	private String custno = "";
	
	/**
	 * 结束时间,格式“yyyyMMdd”
	 */
	private String endDate = "";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 每页条数,
	 */
	private String pagesize = "";
	
	/**
	 * 开始时间,格式“yyyyMMdd”
	 */
	private String startDate = "";
	
	/**
	 * 初始化参数
	 */
	public V033Input() {
		this.setFunction("V033");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,登入用户可不传，则取sessionkey中的对应数据中心custno（注：该值为空查不到结果）
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,登入用户可不传，则取sessionkey中的对应数据中心custno（注：该值为空查不到结果）
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 结束时间,格式“yyyyMMdd”
	 */
	public String getEndDate() {
		return this.endDate;
	}
	
	/**
	 * 结束时间,格式“yyyyMMdd”
	 */
	public void setEndDate(String value)
	 {
		this.endDate = value;
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
	 * 每页条数,
	 */
	public String getPagesize() {
		return this.pagesize;
	}
	
	/**
	 * 每页条数,
	 */
	public void setPagesize(String value)
	 {
		this.pagesize = value;
	}
	
	/**
	 * 开始时间,格式“yyyyMMdd”
	 */
	public String getStartDate() {
		return this.startDate;
	}
	
	/**
	 * 开始时间,格式“yyyyMMdd”
	 */
	public void setStartDate(String value)
	 {
		this.startDate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("endDate", this.endDate);
		inputMap.put("pageno", this.pageno);
		inputMap.put("pagesize", this.pagesize);
		inputMap.put("startDate", this.startDate);
	}
}
