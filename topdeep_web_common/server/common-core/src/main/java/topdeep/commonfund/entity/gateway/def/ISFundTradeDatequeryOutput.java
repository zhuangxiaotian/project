package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 交易日期查询功能输出参数
 */
public class ISFundTradeDatequeryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundTradeDatequeryOutputDetail> detail = new ArrayList<ISFundTradeDatequeryOutputDetail>();
	
	public ISFundTradeDatequeryOutput() {
		this.setZ_funcCode("n1e");
	}
	
	public List<ISFundTradeDatequeryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
