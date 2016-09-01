package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金份额查询功能输入参数
 */
public class ISFundShareListQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额，8：数据中心总份额（含专户），9:中银养老保基金份额 10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	private String queryType;
	
	/**
	 * 基金代码,
	 */
	private String fundCode;
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	private String datasource;
	
	public ISFundShareListQueryInput() {
		this.setZ_funcCode("u04");
	}
	
	/**
	 * 查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额，8：数据中心总份额（含专户），9:中银养老保基金份额 10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public String getQueryType() {
		return this.queryType;
	}
	
	/**
	 * 查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额，8：数据中心总份额（含专户），9:中银养老保基金份额 10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public void setQueryType(String value)
	 {
		this.queryType = value;
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
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
}
