package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 数据中心客户信息查询(C025)
 */
public class C025Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 返回信息,
	 */
	private String message = "";
	
	private List<C025OutputDetail> detail = new ArrayList<C025OutputDetail>();
	
	/**
	 * 返回信息,
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * 返回信息,
	 */
	public void setMessage(String value)
	 {
		this.message = value;
	}
	
	public List<C025OutputDetail> getDetail() {
		return this.detail;
	}
	
}
