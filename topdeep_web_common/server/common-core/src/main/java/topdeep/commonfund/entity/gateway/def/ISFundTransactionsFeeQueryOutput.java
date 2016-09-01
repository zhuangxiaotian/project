package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金交易费率查询功能输出参数
 */
public class ISFundTransactionsFeeQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundTransactionsFeeQueryOutputDetail> detail = new ArrayList<ISFundTransactionsFeeQueryOutputDetail>();
	
	public ISFundTransactionsFeeQueryOutput() {
		this.setZ_funcCode("u08");
	}
	
	public List<ISFundTransactionsFeeQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
