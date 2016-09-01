package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 专户基金详细信息查询功能输入参数
 */
public class ISSpeciFundInfoQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 数据来源,
	 */
	private String datasource;
	
	public ISSpeciFundInfoQueryInput() {
		this.setZ_funcCode("n0z");
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
	 * 数据来源,
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
}
