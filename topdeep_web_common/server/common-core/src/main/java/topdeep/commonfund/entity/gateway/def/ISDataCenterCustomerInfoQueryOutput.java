package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 数据中心客户信息查询功能输出参数
 */
public class ISDataCenterCustomerInfoQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 数据中心客户是否存在,
	 */
	private String exist;
	
	private List<ISDataCenterCustomerInfoQueryOutputDetail> detail = new ArrayList<ISDataCenterCustomerInfoQueryOutputDetail>();
	
	public ISDataCenterCustomerInfoQueryOutput() {
		this.setZ_funcCode("u1i");
	}
	
	/**
	 * 数据中心客户是否存在,
	 */
	public String getExist() {
		return this.exist;
	}
	
	/**
	 * 数据中心客户是否存在,
	 */
	public void setExist(String value)
	 {
		this.exist = value;
	}
	
	public List<ISDataCenterCustomerInfoQueryOutputDetail> getDetail() {
		return this.detail;
	}
	
}
