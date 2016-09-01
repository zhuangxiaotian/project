package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户超级现金宝信息查询(S052)
 */
public class S052Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 超级现金宝交易账号,
	 */
	private String supermoneytradeacco = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 查询类型,0--需要查询可赎回的普通交易账号,1--不需要查询可赎回的普通交易账号
	 */
	private String querytype = "";
	
	/**
	 * 初始化参数
	 */
	public S052Input() {
		this.setFunction("S052");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public String getSupermoneytradeacco() {
		return this.supermoneytradeacco;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public void setSupermoneytradeacco(String value)
	 {
		this.supermoneytradeacco = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	/**
	 * 查询类型,0--需要查询可赎回的普通交易账号,1--不需要查询可赎回的普通交易账号
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,0--需要查询可赎回的普通交易账号,1--不需要查询可赎回的普通交易账号
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("supermoneytradeacco", this.supermoneytradeacco);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("querytype", this.querytype);
	}
}
