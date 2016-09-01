package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 经纪人佣金信息查询(S027)
 */
public class S027Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 开始日期,
	 */
	private String begindate = "";
	
	/**
	 * 经纪人,
	 */
	private String brokerno = "";
	
	/**
	 * 结束日期,
	 */
	private String enddate = "";
	
	/**
	 * 申请条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,
	 */
	private String pageno = "";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 初始化参数
	 */
	public S027Input() {
		this.setFunction("S027");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 开始日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 开始日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 经纪人,
	 */
	public String getBrokerno() {
		return this.brokerno;
	}
	
	/**
	 * 经纪人,
	 */
	public void setBrokerno(String value)
	 {
		this.brokerno = value;
	}
	
	/**
	 * 结束日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 申请条数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
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
	 * 当前页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 份额类别,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("begindate", this.begindate);
		inputMap.put("brokerno", this.brokerno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.pageno);
		inputMap.put("sharetype", this.sharetype);
	}
}
