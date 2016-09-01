package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 快速开户功能判断查询功能输出参数
 */
public class ISFastOpenAccountConditionQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 查询结果,0 不需要 1 需要 2 投资人三要素验证失败
	 */
	private String queryResult;
	
	public ISFastOpenAccountConditionQueryOutput() {
		this.setZ_funcCode("n0r");
	}
	
	/**
	 * 查询结果,0 不需要 1 需要 2 投资人三要素验证失败
	 */
	public String getQueryResult() {
		return this.queryResult;
	}
	
	/**
	 * 查询结果,0 不需要 1 需要 2 投资人三要素验证失败
	 */
	public void setQueryResult(String value)
	 {
		this.queryResult = value;
	}
}
