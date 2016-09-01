package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金净值功能输入参数
 */
public class ISNetValueQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 数据来源,
	 */
	private String datasource;
	
	public ISNetValueQueryInput() {
		this.setZ_funcCode("n07");
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundCode() {
		return this.fundCode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundCode(String value)
	 {
		this.fundCode = value;
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
