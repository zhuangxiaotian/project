package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金排行榜查询(S016)
 */
public class S016Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务类型,多个业务类型使用英文都好分割
	 */
	private String businflag = "";
	
	/**
	 * 统计单位,（0：自然日；1：工作日；2：工作周（即截至上周五））
	 */
	private String statunit = "";
	
	/**
	 * 客户类型,如果登录则从session中取
	 */
	private String custtype = "";
	
	/**
	 * 查询方式,直销接口查询 或者 直接DB查询
	 */
	private String querytype = "";
	
	/**
	 * 统计天数,
	 */
	private String statdays = "";
	
	/**
	 * 初始化参数
	 */
	public S016Input() {
		this.setFunction("S016");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务类型,多个业务类型使用英文都好分割
	 */
	public String getBusinflag() {
		return this.businflag;
	}
	
	/**
	 * 业务类型,多个业务类型使用英文都好分割
	 */
	public void setBusinflag(String value)
	 {
		this.businflag = value;
	}
	
	/**
	 * 统计单位,（0：自然日；1：工作日；2：工作周（即截至上周五））
	 */
	public String getStatunit() {
		return this.statunit;
	}
	
	/**
	 * 统计单位,（0：自然日；1：工作日；2：工作周（即截至上周五））
	 */
	public void setStatunit(String value)
	 {
		this.statunit = value;
	}
	
	/**
	 * 客户类型,如果登录则从session中取
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,如果登录则从session中取
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
	/**
	 * 查询方式,直销接口查询 或者 直接DB查询
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询方式,直销接口查询 或者 直接DB查询
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 统计天数,
	 */
	public String getStatdays() {
		return this.statdays;
	}
	
	/**
	 * 统计天数,
	 */
	public void setStatdays(String value)
	 {
		this.statdays = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("businflag", this.businflag);
		inputMap.put("statunit", this.statunit);
		inputMap.put("custtype", this.custtype);
		inputMap.put("querytype", this.querytype);
		inputMap.put("statdays", this.statdays);
	}
}
