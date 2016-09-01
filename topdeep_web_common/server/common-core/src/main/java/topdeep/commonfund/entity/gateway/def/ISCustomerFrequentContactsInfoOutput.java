package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 联系人详情功能输出参数
 */
public class ISCustomerFrequentContactsInfoOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 联系人姓名,
	 */
	private String contactsName;
	
	/**
	 * 联系人昵称,
	 */
	private String contactsNickName;
	
	/**
	 * 联系人手机,
	 */
	private String contactsMobile;
	
	/**
	 * 联系人状态,
	 */
	private String contactsState;
	
	/**
	 * 联系人标识,
	 */
	private String contactsId;
	
	public ISCustomerFrequentContactsInfoOutput() {
		this.setZ_funcCode("m0k");
	}
	
	/**
	 * 联系人姓名,
	 */
	public String getContactsName() {
		return this.contactsName;
	}
	
	/**
	 * 联系人姓名,
	 */
	public void setContactsName(String value)
	 {
		this.contactsName = value;
	}
	
	/**
	 * 联系人昵称,
	 */
	public String getContactsNickName() {
		return this.contactsNickName;
	}
	
	/**
	 * 联系人昵称,
	 */
	public void setContactsNickName(String value)
	 {
		this.contactsNickName = value;
	}
	
	/**
	 * 联系人手机,
	 */
	public String getContactsMobile() {
		return this.contactsMobile;
	}
	
	/**
	 * 联系人手机,
	 */
	public void setContactsMobile(String value)
	 {
		this.contactsMobile = value;
	}
	
	/**
	 * 联系人状态,
	 */
	public String getContactsState() {
		return this.contactsState;
	}
	
	/**
	 * 联系人状态,
	 */
	public void setContactsState(String value)
	 {
		this.contactsState = value;
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
