package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询现金宝资产功能输出参数
 */
public class ISQueryMoneyAssetsOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISQueryMoneyAssetsOutputDetail> detail = new ArrayList<ISQueryMoneyAssetsOutputDetail>();
	
	public ISQueryMoneyAssetsOutput() {
		this.setZ_funcCode("m0n");
	}
	
	public List<ISQueryMoneyAssetsOutputDetail> getDetail() {
		return this.detail;
	}
	
}
