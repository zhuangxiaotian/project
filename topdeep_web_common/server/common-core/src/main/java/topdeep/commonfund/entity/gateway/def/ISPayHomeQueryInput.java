package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 收付款交易记录首页功能输入参数
 */
public class ISPayHomeQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 最近交易显示数量,
	 */
	private String rows;
	
	public ISPayHomeQueryInput() {
		this.setZ_funcCode("m0i");
	}
	
	/**
	 * 最近交易显示数量,
	 */
	public String getRows() {
		return this.rows;
	}
	
	/**
	 * 最近交易显示数量,
	 */
	public void setRows(String value)
	 {
		this.rows = value;
	}
}
