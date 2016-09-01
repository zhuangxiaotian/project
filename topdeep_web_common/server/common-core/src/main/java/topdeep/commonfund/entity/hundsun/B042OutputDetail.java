package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可还款银行信息查询(B042)功能输出明细参数
 */
public class B042OutputDetail extends Object implements Serializable {
	
	/**
	 * 银行编号,
	 */
	private String key = "";
	
	/**
	 * 银行名称,
	 */
	private String value = "";
	
	/**
	 * 银行编号,
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * 银行编号,
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * 银行名称,
	 */
	public void setValue(String value)
	 {
		this.value = value;
	}
}
