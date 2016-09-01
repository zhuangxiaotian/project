package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 服务定制查询(V001)功能输出明细参数
 */
public class V001OutputDetail extends Object implements Serializable {
	
	/**
	 * 编号,
	 */
	private String code = "";
	
	/**
	 * 名称,
	 */
	private String name = "";
	
	/**
	 * 类别,固定字符串"sms"
	 */
	private String type = "";
	
	/**
	 * 编号,
	 */
	public String getCode() {
		return this.code;
	}
	
	/**
	 * 编号,
	 */
	public void setCode(String value)
	 {
		this.code = value;
	}
	
	/**
	 * 名称,
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 名称,
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 类别,固定字符串"sms"
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 类别,固定字符串"sms"
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
}
