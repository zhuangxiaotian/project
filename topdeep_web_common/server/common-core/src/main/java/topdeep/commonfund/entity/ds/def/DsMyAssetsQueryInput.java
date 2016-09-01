package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 资产查询功能输入参数
 */
public class DsMyAssetsQueryInput extends topdeep.commonfund.entity.ds.def.DsBaseInput {
	
	/**
	 * 客户编号或者sessionKey,
	 */
	private String customerId;
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	private String queryType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	public DsMyAssetsQueryInput() {
		this.setZ_funcCode("u0c");
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public String getCustomerId() {
		return this.customerId;
	}
	
	/**
	 * 客户编号或者sessionKey,
	 */
	public void setCustomerId(String value)
	 {
		this.customerId = value;
	}
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public String getQueryType() {
		return this.queryType;
	}
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public void setQueryType(String value)
	 {
		this.queryType = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
}
