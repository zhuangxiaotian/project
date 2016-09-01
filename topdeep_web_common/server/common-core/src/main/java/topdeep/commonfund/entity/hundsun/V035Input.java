package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询客户的积分变换情况(V035)
 */
public class V035Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,
	 */
	private String businflag = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "登入用户可以不传，默认取sessionkey中的对应数据中心custno(注：custno为空无法正常兑换)";
	
	/**
	 * 确认日期结束日期,
	 */
	private String endate = "格式“yyyyMMdd”";
	
	/**
	 * 页码,
	 */
	private String pageno = "";
	
	/**
	 * 每页条数,
	 */
	private String pagesize = "";
	
	/**
	 * 确认日期开始日期,
	 */
	private String strtdate = "格式“yyyyMMdd”";
	
	/**
	 * 初始化参数
	 */
	public V035Input() {
		this.setFunction("V035");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务类型,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 确认日期结束日期,
	 */
	public String getEndate() {
		return this.endate;
	}
	
	/**
	 * 确认日期结束日期,
	 */
	public void setEndate(String value)
	 {
		this.endate = value;
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
	 * 确认日期开始日期,
	 */
	public String getStrtdate() {
		return this.strtdate;
	}
	
	/**
	 * 确认日期开始日期,
	 */
	public void setStrtdate(String value)
	 {
		this.strtdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("custno", this.custno);
		inputMap.put("endate", this.endate);
		inputMap.put("pageno", this.pageno);
		inputMap.put("pagesize", this.pagesize);
		inputMap.put("strtdate", this.strtdate);
	}
}
