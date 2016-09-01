package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 更新Session中的用户功能输出参数
 */
public class ISSessionUserUpdateOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 客户类型,0 非用户 1 直销用户 2代销用户
	 */
	private String customerType;
	
	public ISSessionUserUpdateOutput() {
		this.setZ_funcCode("b03");
	}
	
	/**
	 * 客户类型,0 非用户 1 直销用户 2代销用户
	 */
	public String getCustomerType() {
		return this.customerType;
	}
	
	/**
	 * 客户类型,0 非用户 1 直销用户 2代销用户
	 */
	public void setCustomerType(String value)
	 {
		this.customerType = value;
	}
}
