package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询风险匹配基金(C024)
 */
public class C024Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private Integer applyrecordno;
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 初始化参数
	 */
	public C024Input() {
		this.setFunction("C024");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("pageno", this.formatInteger(this.pageno));
	}
}
