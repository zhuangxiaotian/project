package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 对账单定制功能输入参数
 */
public class ISCheckSheetCustomizeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 类型,传“c”
	 */
	private String type;
	
	/**
	 * 信息形式,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	private String orders;
	
	public ISCheckSheetCustomizeInput() {
		this.setZ_funcCode("u1l");
	}
	
	/**
	 * 类型,传“c”
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 类型,传“c”
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 信息形式,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public String getOrders() {
		return this.orders;
	}
	
	/**
	 * 信息形式,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public void setOrders(String value)
	 {
		this.orders = value;
	}
}
