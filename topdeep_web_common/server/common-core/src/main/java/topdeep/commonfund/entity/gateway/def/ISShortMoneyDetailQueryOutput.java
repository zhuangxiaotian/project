package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 短期理财明细查询功能输出参数
 */
public class ISShortMoneyDetailQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISShortMoneyDetailQueryOutputDetail> detail = new ArrayList<ISShortMoneyDetailQueryOutputDetail>();
	
	public ISShortMoneyDetailQueryOutput() {
		this.setZ_funcCode("u1g");
	}
	
	public List<ISShortMoneyDetailQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
