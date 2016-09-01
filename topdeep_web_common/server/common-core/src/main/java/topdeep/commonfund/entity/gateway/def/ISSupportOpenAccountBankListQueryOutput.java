package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询支持开户的银行列表功能输出参数
 */
public class ISSupportOpenAccountBankListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISSupportOpenAccountBankListQueryOutputDetail> detail = new ArrayList<ISSupportOpenAccountBankListQueryOutputDetail>();
	
	public ISSupportOpenAccountBankListQueryOutput() {
		this.setZ_funcCode("n0t");
	}
	
	public List<ISSupportOpenAccountBankListQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
