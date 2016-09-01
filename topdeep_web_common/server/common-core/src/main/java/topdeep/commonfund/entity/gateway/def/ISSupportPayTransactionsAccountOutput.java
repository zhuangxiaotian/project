package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询开通支付转让协议的交易账户功能输出参数
 */
public class ISSupportPayTransactionsAccountOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISSupportPayTransactionsAccountOutputDetail> detail = new ArrayList<ISSupportPayTransactionsAccountOutputDetail>();
	
	public ISSupportPayTransactionsAccountOutput() {
		this.setZ_funcCode("m0m");
	}
	
	public List<ISSupportPayTransactionsAccountOutputDetail> getDetail() {
		return this.detail;
	}
	
}
