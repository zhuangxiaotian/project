package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 联系人详情功能输入参数
 */
public class ISCustomerFrequentContactsInfoInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 联系人标识,
	 */
	private String contactsId;
	
	public ISCustomerFrequentContactsInfoInput() {
		this.setZ_funcCode("m0k");
	}
	
	/**
	 * 联系人标识,
	 */
	public String getContactsId() {
		return this.contactsId;
	}
	
	/**
	 * 联系人标识,
	 */
	public void setContactsId(String value)
	 {
		this.contactsId = value;
	}
}
