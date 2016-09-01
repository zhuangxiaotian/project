package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可买入支付方式列表(T002)
 */
public class T002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	private String businflag = "";
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	private String fundcode = "";
	
	/**
	 * 收费方式,T001返回的sharetype,多个收费方式以","分隔：A,B
	 */
	private String sharetype = "";
	
	/**
	 * 交易来源,使用交易来源作为过滤条件
	 */
	private String comefrom = "";
	
	/**
	 * 初始化参数
	 */
	public T002Input() {
		this.setFunction("T002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,020:认购;022:申购
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,T001返回的fundcode
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 收费方式,T001返回的sharetype,多个收费方式以","分隔：A,B
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,T001返回的sharetype,多个收费方式以","分隔：A,B
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易来源,使用交易来源作为过滤条件
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,使用交易来源作为过滤条件
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("sharetype", this.sharetype);
		inputMap.put("comefrom", this.comefrom);
	}
}
