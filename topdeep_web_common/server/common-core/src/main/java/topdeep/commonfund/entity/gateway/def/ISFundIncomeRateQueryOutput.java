package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金收益率查询功能输出参数
 */
public class ISFundIncomeRateQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundIncomeRateQueryOutputDetail> detail = new ArrayList<ISFundIncomeRateQueryOutputDetail>();
	
	public ISFundIncomeRateQueryOutput() {
		this.setZ_funcCode("n1a");
	}
	
	public List<ISFundIncomeRateQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
