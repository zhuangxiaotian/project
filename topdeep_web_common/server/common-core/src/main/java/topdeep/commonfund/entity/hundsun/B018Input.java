package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道账户明细查询(B018)
 */
public class B018Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 结束日期,
	 */
	private String enddate = "格式为yyyyMMdd,不传，默认为当日";
	
	/**
	 * 起始日期,
	 */
	private String startdate = "格式为yyyyMMdd,不传，默认为当日";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "如果传了，则必须登录";
	
	/**
	 * 初始化参数
	 */
	public B018Input() {
		this.setFunction("B018");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 结束日期,
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,
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
		inputMap.put("enddate", this.enddate);
		inputMap.put("startdate", this.startdate);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
