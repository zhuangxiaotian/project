package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 修改客户联系人备注和标记功能输入参数
 */
public class ISFrequentContactsUpdateInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 联系人标识,
	 */
	private String id;
	
	/**
	 * 联系人备注,
	 */
	private String contactsRemarks;
	
	/**
	 * 联系人状态（1、普通；2、关注；3、拉黑）,
	 */
	private String contactsState;
	
	public ISFrequentContactsUpdateInput() {
		this.setZ_funcCode("m0f");
	}
	
	/**
	 * 联系人标识,
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * 联系人标识,
	 */
	public void setId(String value)
	 {
		this.id = value;
	}
	
	/**
	 * 联系人备注,
	 */
	public String getContactsRemarks() {
		return this.contactsRemarks;
	}
	
	/**
	 * 联系人备注,
	 */
	public void setContactsRemarks(String value)
	 {
		this.contactsRemarks = value;
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
