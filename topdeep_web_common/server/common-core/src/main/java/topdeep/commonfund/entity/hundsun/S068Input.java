package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易查询(S068)
 */
public class S068Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 销售商编号,
	 */
	private String agencyno = "";
	
	/**
	 * 每页显示条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 客户编号,
	 */
	private String custno = "";
	
	/**
	 * 当前页码,
	 */
	private String pageno = "";
	
	/**
	 * 开始时间,
	 */
	private String reqbegin = "";
	
	/**
	 * 结束时间,
	 */
	private String reqend = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 下单起始日期,
	 */
	private String acceptdate = "";
	
	/**
	 * 下单终止日期,
	 */
	private String acceptdatebig = "";
	
	/**
	 * 业务代码不等于,
	 */
	private String callingcodenoteq = "";
	
	/**
	 * 业务代码(or),
	 */
	private String orcallingcode = "";
	
	/**
	 * 基金代码(or),
	 */
	private String orfundcode = "";
	
	/**
	 * 原申请编号,
	 */
	private String originalapplyserial = "";
	
	/**
	 * 目标基金代码(or),
	 */
	private String orotherfundcode = "";
	
	/**
	 * 业务大类(or)(<>),
	 */
	private String orunequalbusintype = "";
	
	/**
	 * 初始化参数
	 */
	public S068Input() {
		this.setFunction("S068");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 销售商编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	/**
	 * 每页显示条数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 每页显示条数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
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
	 * 开始时间,
	 */
	public String getReqbegin() {
		return this.reqbegin;
	}
	
	/**
	 * 开始时间,
	 */
	public void setReqbegin(String value)
	 {
		this.reqbegin = value;
	}
	
	/**
	 * 结束时间,
	 */
	public String getReqend() {
		return this.reqend;
	}
	
	/**
	 * 结束时间,
	 */
	public void setReqend(String value)
	 {
		this.reqend = value;
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
	 * 下单起始日期,
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 下单起始日期,
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	/**
	 * 下单终止日期,
	 */
	public String getAcceptdatebig() {
		return this.acceptdatebig;
	}
	
	/**
	 * 下单终止日期,
	 */
	public void setAcceptdatebig(String value)
	 {
		this.acceptdatebig = value;
	}
	
	/**
	 * 业务代码不等于,
	 */
	public String getCallingcodenoteq() {
		return this.callingcodenoteq;
	}
	
	/**
	 * 业务代码不等于,
	 */
	public void setCallingcodenoteq(String value)
	 {
		this.callingcodenoteq = value;
	}
	
	/**
	 * 业务代码(or),
	 */
	public String getOrcallingcode() {
		return this.orcallingcode;
	}
	
	/**
	 * 业务代码(or),
	 */
	public void setOrcallingcode(String value)
	 {
		this.orcallingcode = value;
	}
	
	/**
	 * 基金代码(or),
	 */
	public String getOrfundcode() {
		return this.orfundcode;
	}
	
	/**
	 * 基金代码(or),
	 */
	public void setOrfundcode(String value)
	 {
		this.orfundcode = value;
	}
	
	/**
	 * 原申请编号,
	 */
	public String getOriginalapplyserial() {
		return this.originalapplyserial;
	}
	
	/**
	 * 原申请编号,
	 */
	public void setOriginalapplyserial(String value)
	 {
		this.originalapplyserial = value;
	}
	
	/**
	 * 目标基金代码(or),
	 */
	public String getOrotherfundcode() {
		return this.orotherfundcode;
	}
	
	/**
	 * 目标基金代码(or),
	 */
	public void setOrotherfundcode(String value)
	 {
		this.orotherfundcode = value;
	}
	
	/**
	 * 业务大类(or)(<>),
	 */
	public String getOrunequalbusintype() {
		return this.orunequalbusintype;
	}
	
	/**
	 * 业务大类(or)(<>),
	 */
	public void setOrunequalbusintype(String value)
	 {
		this.orunequalbusintype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("agencyno", this.agencyno);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("custno", this.custno);
		inputMap.put("pageno", this.pageno);
		inputMap.put("reqbegin", this.reqbegin);
		inputMap.put("reqend", this.reqend);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("tradeacco", this.tradeacco);
		inputMap.put("acceptdate", this.acceptdate);
		inputMap.put("acceptdatebig", this.acceptdatebig);
		inputMap.put("callingcodenoteq", this.callingcodenoteq);
		inputMap.put("orcallingcode", this.orcallingcode);
		inputMap.put("orfundcode", this.orfundcode);
		inputMap.put("originalapplyserial", this.originalapplyserial);
		inputMap.put("orotherfundcode", this.orotherfundcode);
		inputMap.put("orunequalbusintype", this.orunequalbusintype);
	}
}
