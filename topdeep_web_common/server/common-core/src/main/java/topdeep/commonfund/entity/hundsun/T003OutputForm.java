package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金买入(T003)功能输出明细参数
 */
public class T003OutputForm extends Object implements Serializable {
	
	/**
	 * key,
	 */
	private String key = "";
	
	/**
	 * value,
	 */
	private String value = "";
	
	/**
	 * key,
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * key,
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * value,
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * value,
	 */
	public void setValue(String value)
	 {
		this.value = value;
	}
}
