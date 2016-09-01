package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询交易账号列表功能输出参数
 */
public class ISTransactionsAccountListQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFundTransactionsAccountDetail> detail = new ArrayList<ISFundTransactionsAccountDetail>();
	
	public ISTransactionsAccountListQueryOutput() {
		this.setZ_funcCode("u03");
	}
	
	public List<ISFundTransactionsAccountDetail> getDetail() {
		return this.detail;
	}
	
}
