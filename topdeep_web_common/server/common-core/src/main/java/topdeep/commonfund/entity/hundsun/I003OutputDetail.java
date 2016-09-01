package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 银行解约签名数据生成(I003)功能输出明细参数
 */
public class I003OutputDetail extends Object implements Serializable {
	
	/**
	 * 包含所有要提交网银的参数字段,
	 */
	private String key = "";
	
	/**
	 * ,
	 */
	private String value = "";
	
	/**
	 * 包含所有要提交网银的参数字段,
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * 包含所有要提交网银的参数字段,
	 */
	public void setKey(String value)
	 {
		this.key = value;
	}
	
	/**
	 * ,
	 */
	public String getValue() {
		return this.value;
	}
	
	/**
	 * ,
	 */
	public void setValue(String value)
	 {
		this.value = value;
	}
}
