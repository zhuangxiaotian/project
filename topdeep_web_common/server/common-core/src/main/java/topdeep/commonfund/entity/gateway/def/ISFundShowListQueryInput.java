package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询基金显示列表功能输入参数
 */
public class ISFundShowListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 申请记录数,
	 */
	private String applyrecordno;
	
	/**
	 * 当前页码,
	 */
	private String pageno;
	
	/**
	 * 数据来源,
	 */
	private String datasource;
	
	public ISFundShowListQueryInput() {
		this.setZ_funcCode("n0n");
	}
	
	/**
	 * 申请记录数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请记录数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 当前页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
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
