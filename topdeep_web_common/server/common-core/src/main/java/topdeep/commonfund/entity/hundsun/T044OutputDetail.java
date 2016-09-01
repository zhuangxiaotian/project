package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息修改(T044)功能输出明细参数
 */
public class T044OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String requestno = "";
	
	/**
	 * 申请编号,
	 */
	public String getRequestno() {
		return this.requestno;
	}
	
	/**
	 * 申请编号,
	 */
	public void setRequestno(String value)
	 {
		this.requestno = value;
	}
}
