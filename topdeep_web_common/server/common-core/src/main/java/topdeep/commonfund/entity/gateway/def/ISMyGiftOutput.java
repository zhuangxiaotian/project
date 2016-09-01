package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 我的红包功能输出参数
 */
public class ISMyGiftOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 红包总金额,
	 */
	private String totalAmount;
	
	private List<ISMyGiftOutputDetail> detail = new ArrayList<ISMyGiftOutputDetail>();
	
	public ISMyGiftOutput() {
		this.setZ_funcCode("u1L");
	}
	
	/**
	 * 红包总金额,
	 */
	public String getTotalAmount() {
		return this.totalAmount;
	}
	
	/**
	 * 红包总金额,
	 */
	public void setTotalAmount(String value)
	 {
		this.totalAmount = value;
	}
	
	public List<ISMyGiftOutputDetail> getDetail() {
		return this.detail;
	}
	
}
