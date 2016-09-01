package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T+0业务状态查询(S039)
 */
public class S039Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 代销机构编号,
	 */
	private String agencyno = "";
	
	/**
	 * 初始化参数
	 */
	public S039Input() {
		this.setFunction("S039");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 代销机构编号,
	 */
	public String getAgencyno() {
		return this.agencyno;
	}
	
	/**
	 * 代销机构编号,
	 */
	public void setAgencyno(String value)
	 {
		this.agencyno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("agencyno", this.agencyno);
	}
}
