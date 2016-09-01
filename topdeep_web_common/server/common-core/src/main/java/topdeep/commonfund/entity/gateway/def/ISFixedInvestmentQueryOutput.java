package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期定额查询功能输出参数
 */
public class ISFixedInvestmentQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISFixedInvestmentQueryOutputDetail> detail = new ArrayList<ISFixedInvestmentQueryOutputDetail>();
	
	private List<ISFixedInvestmentQueryOutputRedeemDetail> redeemDetail = new ArrayList<ISFixedInvestmentQueryOutputRedeemDetail>();
	
	private List<ISFixedInvestmentQueryOutputTransferDetail> transferDetail = new ArrayList<ISFixedInvestmentQueryOutputTransferDetail>();
	
	private List<ISFundTransactionsAccountDetail> transactionsAccountDetail = new ArrayList<ISFundTransactionsAccountDetail>();
	
	public ISFixedInvestmentQueryOutput() {
		this.setZ_funcCode("u0p");
	}
	
	public List<ISFixedInvestmentQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<ISFixedInvestmentQueryOutputRedeemDetail> getRedeemDetail() {
		return this.redeemDetail;
	}
	
	
	public List<ISFixedInvestmentQueryOutputTransferDetail> getTransferDetail() {
		return this.transferDetail;
	}
	
	
	public List<ISFundTransactionsAccountDetail> getTransactionsAccountDetail() {
		return this.transactionsAccountDetail;
	}
	
}
