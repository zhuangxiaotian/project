package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 相对工作日查询(S040)
 */
public class S040Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,参考字典“业务名称”
	 */
	private String callingcode = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 偏移量,
	 */
	private String offset = "";
	
	/**
	 * 查询日期日期,
	 */
	private String workdate = "";
	
	/**
	 * 偏移标志,0：向后（默认）；1：向前
	 */
	private String offsetflag = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S040Input() {
		this.setFunction("S040");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,参考字典“业务名称”
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,参考字典“业务名称”
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
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
	 * 偏移量,
	 */
	public String getOffset() {
		return this.offset;
	}
	
	/**
	 * 偏移量,
	 */
	public void setOffset(String value)
	 {
		this.offset = value;
	}
	
	/**
	 * 查询日期日期,
	 */
	public String getWorkdate() {
		return this.workdate;
	}
	
	/**
	 * 查询日期日期,
	 */
	public void setWorkdate(String value)
	 {
		this.workdate = value;
	}
	
	/**
	 * 偏移标志,0：向后（默认）；1：向前
	 */
	public String getOffsetflag() {
		return this.offsetflag;
	}
	
	/**
	 * 偏移标志,0：向后（默认）；1：向前
	 */
	public void setOffsetflag(String value)
	 {
		this.offsetflag = value;
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
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("offset", this.offset);
		inputMap.put("workdate", this.workdate);
		inputMap.put("offsetflag", this.offsetflag);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
