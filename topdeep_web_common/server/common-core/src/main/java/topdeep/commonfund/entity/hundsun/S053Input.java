package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易信息查询(S053)
 */
public class S053Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 业务代码,
	 */
	private String businflag = "";
	
	/**
	 * 业务大类,正值表示查该业务大类，负值表示排除该业务大类。例：01：只查现金宝；-01：排除现金宝
	 */
	private String busintype = "";
	
	/**
	 * 确认编号,
	 */
	private String confirmno = "";
	
	/**
	 * 客户编号,客户编号
	 */
	private String custno = "";
	
	/**
	 * 申请日期结束,
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 当前页码,
	 */
	private String pageno = "1";
	
	/**
	 * 份额类别,
	 */
	private String sharetype = "";
	
	/**
	 * 申请日期开始,
	 */
	private String startdate = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * 初始化参数
	 */
	public S053Input() {
		this.setFunction("S053");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 业务代码,
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 业务大类,正值表示查该业务大类，负值表示排除该业务大类。例：01：只查现金宝；-01：排除现金宝
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,正值表示查该业务大类，负值表示排除该业务大类。例：01：只查现金宝；-01：排除现金宝
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 确认编号,
	 */
	public String getConfirmno() {
		return this.confirmno;
	}
	
	/**
	 * 确认编号,
	 */
	public void setConfirmno(String value)
	 {
		this.confirmno = value;
	}
	
	/**
	 * 客户编号,客户编号
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,客户编号
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 申请日期结束,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 申请日期结束,
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	
	/**
	 * 申请日期开始,
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 申请日期开始,
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("applyserial", this.applyserial);
		inputMap.put("businflag", this.businflag);
		inputMap.put("busintype", this.busintype);
		inputMap.put("confirmno", this.confirmno);
		inputMap.put("custno", this.custno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("pageno", this.pageno);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("startdate", this.startdate);
		inputMap.put("tacode", this.tacode);
	}
}
