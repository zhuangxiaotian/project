package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 个人客户信息查询功能输出参数
 */
public class ISCustomerInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISCustomerInfoQueryOutputDetail> detail = new ArrayList<ISCustomerInfoQueryOutputDetail>();
	
	public ISCustomerInfoQueryOutput() {
		this.setZ_funcCode("u0l");
	}
	
	public List<ISCustomerInfoQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
