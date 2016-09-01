package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 持仓收益查询(S081)
 */
public class S081Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金帐号,
	 */
	private String fundacco = "";
	
	/**
	 * 销售商类型,0：直销；1：代销
	 */
	private String agenctype = "";
	
	/**
	 * 销售商编号,
	 */
	private String agencyno = "";
	
	/**
	 * 初始化参数
	 */
	public S081Input() {
		this.setFunction("S081");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金帐号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金帐号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 销售商类型,0：直销；1：代销
	 */
	public String getAgenctype() {
		return this.agenctype;
	}
	
	/**
	 * 销售商类型,0：直销；1：代销
	 */
	public void setAgenctype(String value)
	 {
		this.agenctype = value;
	}
	
	/**
	 * 销售商编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 销售商编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("agenctype", this.agenctype);
		inputMap.put("agencyno", this.agencyno);
	}
}
