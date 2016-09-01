package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 对账单定制查询功能输入参数
 */
public class ISCheckSheetQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 信息形式,1:电子邮件  2:纸质  不传值则全部查询
	 */
	private String type;
	
	public ISCheckSheetQueryInput() {
		this.setZ_funcCode("u1k");
	}
	
	/**
	 * 信息形式,1:电子邮件  2:纸质  不传值则全部查询
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * 信息形式,1:电子邮件  2:纸质  不传值则全部查询
	 */
	public void setType(String value)
	 {
		this.type = value;
	}
}
