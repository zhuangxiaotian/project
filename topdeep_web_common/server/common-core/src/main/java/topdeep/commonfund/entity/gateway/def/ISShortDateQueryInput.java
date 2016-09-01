package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 短期理财到期日查询功能输入参数
 */
public class ISShortDateQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 基金代码,
	 */
	private String fundcode;
	
	/**
	 * 申请日期,
	 */
	private String applydate;
	
	/**
	 * 数据来源,
	 */
	private String datasource;
	
	public ISShortDateQueryInput() {
		this.setZ_funcCode("u1f");
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
	 * 申请日期,
	 */
	public String getApplydate() {
		return this.applydate;
	}
	
	/**
	 * 申请日期,
	 */
	public void setApplydate(String value)
	 {
		this.applydate = value;
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
