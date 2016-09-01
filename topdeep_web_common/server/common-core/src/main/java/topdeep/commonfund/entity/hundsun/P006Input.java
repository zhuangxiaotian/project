package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 风险评估(P006)
 */
public class P006Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,020认购 022申购 137转换
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,对转换业务为目标基金代码
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,对转换业务为目标基金收费方式
	 */
	private String sharetype = "";
	
	/**
	 * 申请份额,对转换业务此项必填
	 */
	private String applyshare = "";
	
	/**
	 * 申请金额,对认申购业务此项必填
	 */
	private String applysum = "";
	
	/**
	 * 初始化参数
	 */
	public P006Input() {
		this.setFunction("P006");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,020认购 022申购 137转换
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020认购 022申购 137转换
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,对转换业务为目标基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,对转换业务为目标基金代码
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 收费方式,对转换业务为目标基金收费方式
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,对转换业务为目标基金收费方式
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 申请份额,对转换业务此项必填
	 */
	public String getApplyshare() {
		return this.applyshare;
	}
	
	/**
	 * 申请份额,对转换业务此项必填
	 */
	public void setApplyshare(String value)
	 {
		this.applyshare = value;
	}
	
	/**
	 * 申请金额,对认申购业务此项必填
	 */
	public String getApplysum() {
		return this.applysum;
	}
	
	/**
	 * 申请金额,对认申购业务此项必填
	 */
	public void setApplysum(String value)
	 {
		this.applysum = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("applyshare", this.applyshare);
		inputMap.put("applysum", this.applysum);
	}
}
