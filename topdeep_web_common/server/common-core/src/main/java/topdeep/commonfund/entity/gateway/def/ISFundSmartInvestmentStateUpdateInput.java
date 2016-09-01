package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定期不定额取消、暂停、恢复功能输入参数
 */
public class ISFundSmartInvestmentStateUpdateInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 客户编号,
	 */
	private String customerNo;
	
	/**
	 * 协议号,
	 */
	private String agreementNo;
	
	/**
	 * 操作类型,1开通 2取消 4暂停 5恢复
	 */
	private String operateType;
	
	public ISFundSmartInvestmentStateUpdateInput() {
		this.setZ_funcCode("u0r");
	}
	
	/**
	 * 客户编号,
	 */
	public String getCustomerNo() {
		return this.customerNo;
	}
	
	/**
	 * 客户编号,
	 */
	public void setCustomerNo(String value)
	 {
		this.customerNo = value;
	}
	
	/**
	 * 协议号,
	 */
	public String getAgreementNo() {
		return this.agreementNo;
	}
	
	/**
	 * 协议号,
	 */
	public void setAgreementNo(String value)
	 {
		this.agreementNo = value;
	}
	
	/**
	 * 操作类型,1开通 2取消 4暂停 5恢复
	 */
	public String getOperateType() {
		return this.operateType;
	}
	
	/**
	 * 操作类型,1开通 2取消 4暂停 5恢复
	 */
	public void setOperateType(String value)
	 {
		this.operateType = value;
	}
}
