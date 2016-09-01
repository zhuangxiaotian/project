package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户申请审批状态查询(S050)
 */
public class S050Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 截止日期,
	 */
	private String enddate = "";
	
	/**
	 * 起始日期,
	 */
	private String startdate = "";
	
	/**
	 * 审核状态,线下审批开户：固定值000000180001
	 */
	private String checkflag = "";
	
	/**
	 * 外部客户编号,
	 */
	private String extcustno = "";
	
	/**
	 * 初始化参数
	 */
	public S050Input() {
		this.setFunction("S050");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 截止日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 截止日期,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 起始日期,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 审核状态,线下审批开户：固定值000000180001
	 */
	public String getCheckflag() {
		return this.checkflag;
	}
	
	/**
	 * 审核状态,线下审批开户：固定值000000180001
	 */
	public void setCheckflag(String value)
	 {
		this.checkflag = value;
	}
	
	/**
	 * 外部客户编号,
	 */
	public String getExtcustno() {
		return this.extcustno;
	}
	
	/**
	 * 外部客户编号,
	 */
	public void setExtcustno(String value)
	 {
		this.extcustno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("checkflag", this.checkflag);
		inputMap.put("extcustno", this.extcustno);
	}
}
