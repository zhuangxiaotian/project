package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 定制信息功能输入参数
 */
public class ISServeCustomizeInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	private String orders;
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	private String type;
	
	/**
	 * 证件类型,
	 */
	private String idType;
	
	/**
	 * 证件号码,
	 */
	private String idNo;
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	private String mailOrders;
	
	public ISServeCustomizeInput() {
		this.setZ_funcCode("u1n");
	}
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public String getOrders() {
		return this.orders;
	}
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public void setOrders(String value)
	 {
		this.orders = value;
	}
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 信息形式,1:邮件 2:短信 不传则全部查询
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdType(String value)
	 {
		this.idType = value;
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdNo(String value)
	 {
		this.idNo = value;
	}
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public String getMailOrders() {
		return this.mailOrders;
	}
	
	/**
	 * 定制的taskcode列表,格式，多个,号分隔：${taskcode1},${taskcode2},${taskcode3}
	 */
	public void setMailOrders(String value)
	 {
		this.mailOrders = value;
	}
}
