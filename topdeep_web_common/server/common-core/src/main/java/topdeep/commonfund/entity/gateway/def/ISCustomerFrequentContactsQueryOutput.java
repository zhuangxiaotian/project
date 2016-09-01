package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询客户联系人功能输出参数
 */
public class ISCustomerFrequentContactsQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISCustomerFrequentContactsQueryOutputDetail> detail = new ArrayList<ISCustomerFrequentContactsQueryOutputDetail>();
	
	public ISCustomerFrequentContactsQueryOutput() {
		this.setZ_funcCode("m0e");
	}
	
	public List<ISCustomerFrequentContactsQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
