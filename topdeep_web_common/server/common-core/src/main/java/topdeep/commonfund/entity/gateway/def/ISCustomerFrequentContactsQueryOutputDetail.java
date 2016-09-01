package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 查询客户联系人功能输出明细参数
 */
public class ISCustomerFrequentContactsQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 联系人名称,
	 */
	private String contactsName;
	
	/**
	 * 联系人手机号,
	 */
	private String contactsMobile;
	
	/**
	 * 联系人类型,
	 */
	private String contactsType;
	
	/**
	 * 联系人状态,
	 */
	private String contactsState;
	
	/**
	 * 联系人昵称,
	 */
	private String contactsNickName;
	
	/**
	 * 联系人标识,
	 */
	private String contactsId;
	
	/**
	 * 联系人名称,
	 */
	public String getContactsName() {
		return this.contactsName;
	}
	
	/**
	 * 联系人名称,
	 */
	public void setContactsName(String value)
	 {
		this.contactsName = value;
	}
	
	/**
	 * 联系人手机号,
	 */
	public String getContactsMobile() {
		return this.contactsMobile;
	}
	
	/**
	 * 联系人手机号,
	 */
	public void setContactsMobile(String value)
	 {
		this.contactsMobile = value;
	}
	
	/**
	 * 联系人类型,
	 */
	public String getContactsType() {
		return this.contactsType;
	}
	
	/**
	 * 联系人类型,
	 */
	public void setContactsType(String value)
	 {
		this.contactsType = value;
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
