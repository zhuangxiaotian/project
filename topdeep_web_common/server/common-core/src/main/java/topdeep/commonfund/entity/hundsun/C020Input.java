package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易账号(C020)
 */
public class C020Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金账号,为空时返回所有的交易账号
	 */
	private String fundacco = "空";
	
	/**
	 * 是否所有交易账号,1：含独立核算交易账号，其他：不含独立核算交易账号
	 */
	private String all = "";
	
	/**
	 * 业务代码,返回此业务代码支持的银行卡列表（交易账号状态判断）
	 */
	private String businflag = "";
	
	/**
	 * 初始化参数
	 */
	public C020Input() {
		this.setFunction("C020");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金账号,为空时返回所有的交易账号
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,为空时返回所有的交易账号
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 是否所有交易账号,1：含独立核算交易账号，其他：不含独立核算交易账号
	 */
	public String getAll() {
		return this.all;
	}
	
	/**
	 * 是否所有交易账号,1：含独立核算交易账号，其他：不含独立核算交易账号
	 */
	public void setAll(String value)
	 {
		this.all = value;
	}
	
	/**
	 * 业务代码,返回此业务代码支持的银行卡列表（交易账号状态判断）
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,返回此业务代码支持的银行卡列表（交易账号状态判断）
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("all", this.all);
		inputMap.put("businflag", this.businflag);
	}
}
