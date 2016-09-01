package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询客户联系人功能输入参数
 */
public class ISCustomerFrequentContactsQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 联系人状态（1、普通；2、关注；3、拉黑）,
	 */
	private String contactsState;
	
	public ISCustomerFrequentContactsQueryInput() {
		this.setZ_funcCode("m0e");
	}
	
	/**
	 * 联系人状态（1、普通；2、关注；3、拉黑）,
	 */
	public String getContactsState() {
		return this.contactsState;
	}
	
	/**
	 * 联系人状态（1、普通；2、关注；3、拉黑）,
	 */
	public void setContactsState(String value)
	 {
		this.contactsState = value;
	}
}
