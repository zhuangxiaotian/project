package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T+0划款流水查询(S038)
 */
public class S038Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	private String enddate = "";
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	private String startdate = "";
	
	/**
	 * 销售商代码,
	 */
	private String agencyno;
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 资金流水号,
	 */
	private String capitalserial = "";
	
	/**
	 * 资金流水状态,# 资金流水状态 2 未发起划款指令 3 已发起划款指令 4 划出成功 5 划出失败
	 */
	private String capitalStat;
	
	/**
	 * 初始化参数
	 */
	public S038Input() {
		this.setFunction("S038");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 开始日期,格式:yyyymmdd或yyyy-mm-dd
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 销售商代码,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商代码,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
	
	/**
	 * 资金流水号,
	 */
	public String getCapitalserial() {
		return this.capitalserial;
	}
	
	/**
	 * 资金流水号,
	 */
	public void setCapitalserial(String value)
	 {
		this.capitalserial = value;
	}
	
	/**
	 * 资金流水状态,# 资金流水状态 2 未发起划款指令 3 已发起划款指令 4 划出成功 5 划出失败
	 */
	public String getCapitalStat() {
		return this.capitalStat;
	}
	
	/**
	 * 资金流水状态,# 资金流水状态 2 未发起划款指令 3 已发起划款指令 4 划出成功 5 划出失败
	 */
	public void setCapitalStat(String value)
	 {
		this.capitalStat = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("agencyno", this.agencyno.toString());
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("capitalserial", this.capitalserial);
		inputMap.put("capitalStat", this.capitalStat.toString());
	}
}
