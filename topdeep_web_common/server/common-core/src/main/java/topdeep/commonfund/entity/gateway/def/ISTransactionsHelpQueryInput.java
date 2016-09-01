package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询交易帮助信息功能输入参数
 */
public class ISTransactionsHelpQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 本地交易类型,
	 */
	private String transactionsType;
	
	public ISTransactionsHelpQueryInput() {
		this.setZ_funcCode("n0m");
	}
	
	/**
	 * 本地交易类型,
	 */
	public String getTransactionsType() {
		return this.transactionsType;
	}
	
	/**
	 * 本地交易类型,
	 */
	public void setTransactionsType(String value)
	 {
		this.transactionsType = value;
	}
}
