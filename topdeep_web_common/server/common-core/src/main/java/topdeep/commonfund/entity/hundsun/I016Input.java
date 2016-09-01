package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投支付方式列表(I016)
 */
public class I016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,需要根据直销交易限制过滤银行卡列表时必传
	 */
	private String fundcode = "";
	
	/**
	 * 业务大类,039=定期定额申购（需要根据直销交易限制过滤银行卡列表时必传 ）
	 */
	private String businflag = "";
	
	/**
	 * 基金收费方式,需要根据直销交易限制过滤银行卡列表时必传
	 */
	private String sharetype = "";
	
	/**
	 * 是否包含未签约银行卡,1：包含，其他：不包含
	 */
	private String unsigned = "";
	
	/**
	 * 初始化参数
	 */
	public I016Input() {
		this.setFunction("I016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,需要根据直销交易限制过滤银行卡列表时必传
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,需要根据直销交易限制过滤银行卡列表时必传
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 业务大类,039=定期定额申购（需要根据直销交易限制过滤银行卡列表时必传 ）
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务大类,039=定期定额申购（需要根据直销交易限制过滤银行卡列表时必传 ）
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金收费方式,需要根据直销交易限制过滤银行卡列表时必传
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 基金收费方式,需要根据直销交易限制过滤银行卡列表时必传
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 是否包含未签约银行卡,1：包含，其他：不包含
	 */
	public String getUnsigned() {
		return this.unsigned;
	}
	
	/**
	 * 是否包含未签约银行卡,1：包含，其他：不包含
	 */
	public void setUnsigned(String value)
	 {
		this.unsigned = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("businflag", this.businflag);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("unsigned", this.unsigned);
	}
}
