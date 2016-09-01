package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息查询(S103)
 */
public class S103Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 业务代码,默认取申购022
	 */
	private String businflag = "";
	
	/**
	 * 起始页码,
	 */
	private String pageno = "";
	
	/**
	 * 初始化参数
	 */
	public S103Input() {
		this.setFunction("S103");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 业务代码,默认取申购022
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务代码,默认取申购022
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 起始页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 起始页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("businflag", this.businflag);
		inputMap.put("pageno", this.pageno);
	}
}
