package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收支明细查询(S093)
 */
public class S093Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,022-申购;024-普通赎回;098-普通赎回;038-基金转换出;037-基金转换入;028-内部转托管出;027-内部转托管入;143-收益分配;053-撤单
	 */
	private String businflag = "";
	
	/**
	 * 终止日期,格式:yyyyMMdd
	 */
	private String enddate = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 起始日期,格式:yyyyMMdd
	 */
	private String startdate = "";
	
	/**
	 * 交易账号,用于撤单
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S093Input() {
		this.setFunction("S093");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务类型,022-申购;024-普通赎回;098-普通赎回;038-基金转换出;037-基金转换入;028-内部转托管出;027-内部转托管入;143-收益分配;053-撤单
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,022-申购;024-普通赎回;098-普通赎回;038-基金转换出;037-基金转换入;028-内部转托管出;027-内部转托管入;143-收益分配;053-撤单
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 终止日期,格式:yyyyMMdd
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 终止日期,格式:yyyyMMdd
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
	 * 起始日期,格式:yyyyMMdd
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 起始日期,格式:yyyyMMdd
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 交易账号,用于撤单
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,用于撤单
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("startdate", this.startdate);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
