package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 净值收益率排行榜查询(S026)
 */
public class S026Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,即获取前applyrecordno名的记录，（新增基金默认排在最后）
	 */
	private String applyrecordno = "";
	
	/**
	 * 结束日期,如20101231
	 */
	private String enddate = "";
	
	/**
	 * 起始日期,如20101231
	 */
	private String startdate = "";
	
	/**
	 * 初始化参数
	 */
	public S026Input() {
		this.setFunction("S026");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,即获取前applyrecordno名的记录，（新增基金默认排在最后）
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,即获取前applyrecordno名的记录，（新增基金默认排在最后）
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,如20101231
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,如20101231
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
	}
}
