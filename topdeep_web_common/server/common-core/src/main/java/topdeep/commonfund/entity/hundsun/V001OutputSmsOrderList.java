package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 服务定制查询(V001)功能输出明细参数
 */
public class V001OutputSmsOrderList extends Object implements Serializable {
	
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
	@PropertyAttribute(Name="编号", Type="S", Length=10, DecimalLength=0, NotNull=false)
	public String getCode() {
		return this.code;
	}
	
	/**
	 * 编号,
	 */
	@PropertyAttribute(Name="编号", Type="S", Length=10, DecimalLength=0, NotNull=false)
	public void setCode(String value)
	 {
		this.code = value;
	}
	
	/**
	 * 名称,
	 */
	@PropertyAttribute(Name="名称", Type="S", Length=60, DecimalLength=0, NotNull=false)
	public String getName() {
		return this.name;
	}
	
	/**
	 * 名称,
	 */
	@PropertyAttribute(Name="名称", Type="S", Length=60, DecimalLength=0, NotNull=false)
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 类别,固定字符串"sms"
	 */
	@PropertyAttribute(Name="类别", Type="S", Length=3, DecimalLength=0, NotNull=false)
	public String getType() {
		return this.type;
	}
	
	/**
	 * 类别,固定字符串"sms"
	 */
	@PropertyAttribute(Name="类别", Type="S", Length=3, DecimalLength=0, NotNull=false)
	public void setType(String value)
	 {
		this.type = value;
	}
}
