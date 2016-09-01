package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 客户积分兑换(V031)
 */
public class V031Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 礼品申请单编号,
	 */
	private String requestno = "";
	
	/**
	 * 礼品申请单编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 礼品申请单编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
}
