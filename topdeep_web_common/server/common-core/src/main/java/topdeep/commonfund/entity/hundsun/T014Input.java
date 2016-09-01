package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可组合投资支付方式列表(T014)
 */
public class T014Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	private String investflag = "";
	
	/**
	 * 组合名称,investflag为0时必传；为1时可不填，系统自动生成
	 */
	private String combcode = "";
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	private String investcontent = "";
	
	/**
	 * 初始化参数
	 */
	public T014Input() {
		this.setFunction("T014");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	public String getInvestflag() {
		return this.investflag;
	}
	
	/**
	 * 组合类型,0:系统组合;1:自定义
	 */
	public void setInvestflag(String value)
	 {
		this.investflag = value;
	}
	
	/**
	 * 组合名称,investflag为0时必传；为1时可不填，系统自动生成
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合名称,investflag为0时必传；为1时可不填，系统自动生成
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public String getInvestcontent() {
		return this.investcontent;
	}
	
	/**
	 * 组合方案内容,investflag为1时必传 将用户配置的基金代码、收费方式、金额按"|"分隔组装， 格式示例：fundcode1|sharetype1|applysum1|fundcode2|sharetype2|applysum2
	 */
	public void setInvestcontent(String value)
	 {
		this.investcontent = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("investflag", this.investflag);
		inputMap.put("combcode", this.combcode);
		inputMap.put("investcontent", this.investcontent);
	}
}
