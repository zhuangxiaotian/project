package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 快速赎回统计信息查询(S028)
 */
public class S028Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 开始日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	private String begindate = "取当前自然日的0点时间";
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	private String custno = "";
	
	/**
	 * 结束日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	private String enddate = "取当前自然日的24点时间";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 初始化参数
	 */
	public S028Input() {
		this.setFunction("S028");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 开始日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 开始日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,如果该参数不传，则必须要登录
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 结束日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 结束日期,格式:yyyymmddhh24MMss，如果查当日，则可以不传
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
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
		inputMap.put("begindate", this.begindate);
		inputMap.put("custno", this.custno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("tradeacco", this.tradeacco);
	}
}
