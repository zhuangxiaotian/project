package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道后台充值(B019)
 */
public class B019Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 基金公司流水号,
	 */
	private String fundSeqId = "";
	
	/**
	 * 汇付发起交易的系统日期,
	 */
	private String pnrDate = "";
	
	/**
	 * 汇付流水号,
	 */
	private String pnrSeqId = "";
	
	/**
	 * 汇付发起交易的系统时间,
	 */
	private String pnrTime = "";
	
	/**
	 * 汇付响应码,
	 */
	private String respCode = "";
	
	/**
	 * 汇付响应描述,
	 */
	private String respDesc = "";
	
	/**
	 * 交易金额,
	 */
	private String transAmt = "单位为元";
	
	/**
	 * 银联CD号,
	 */
	private String usrId = "";
	
	/**
	 * 基金公司流水号,
	 */
	public String getFundSeqId() {
		return this.fundSeqId;
	}
	
	/**
	 * 基金公司流水号,
	 */
	public void setFundSeqId(String value)
	 {
		this.fundSeqId = value;
	}
	
	/**
	 * 汇付发起交易的系统日期,
	 */
	public String getPnrDate() {
		return this.pnrDate;
	}
	
	/**
	 * 汇付发起交易的系统日期,
	 */
	public void setPnrDate(String value)
	 {
		this.pnrDate = value;
	}
	
	/**
	 * 汇付流水号,
	 */
	public String getPnrSeqId() {
		return this.pnrSeqId;
	}
	
	/**
	 * 汇付流水号,
	 */
	public void setPnrSeqId(String value)
	 {
		this.pnrSeqId = value;
	}
	
	/**
	 * 汇付发起交易的系统时间,
	 */
	public String getPnrTime() {
		return this.pnrTime;
	}
	
	/**
	 * 汇付发起交易的系统时间,
	 */
	public void setPnrTime(String value)
	 {
		this.pnrTime = value;
	}
	
	/**
	 * 汇付响应码,
	 */
	public String getRespCode() {
		return this.respCode;
	}
	
	/**
	 * 汇付响应码,
	 */
	public void setRespCode(String value)
	 {
		this.respCode = value;
	}
	
	/**
	 * 汇付响应描述,
	 */
	public String getRespDesc() {
		return this.respDesc;
	}
	
	/**
	 * 汇付响应描述,
	 */
	public void setRespDesc(String value)
	 {
		this.respDesc = value;
	}
	
	/**
	 * 交易金额,
	 */
	public String getTransAmt() {
		return this.transAmt;
	}
	
	/**
	 * 交易金额,
	 */
	public void setTransAmt(String value)
	 {
		this.transAmt = value;
	}
	
	/**
	 * 银联CD号,
	 */
	public String getUsrId() {
		return this.usrId;
	}
	
	/**
	 * 银联CD号,
	 */
	public void setUsrId(String value)
	 {
		this.usrId = value;
	}
}
