package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 生成银行开户签名数据(C002)功能输出明细参数
 */
public class C002OutputDetail extends Object implements Serializable {
	
	/**
	 * 包含所有要提交网银的参数字段,
	 */
	private String key = "";
	
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
}
