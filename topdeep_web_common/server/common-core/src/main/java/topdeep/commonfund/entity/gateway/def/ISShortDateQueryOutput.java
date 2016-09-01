package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 短期理财到期日查询功能输出参数
 */
public class ISShortDateQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 最近赎回日期,
	 */
	private String nextredeemdate;
	
	public ISShortDateQueryOutput() {
		this.setZ_funcCode("u1f");
	}
	
	/**
	 * 最近赎回日期,
	 */
	public String getNextredeemdate() {
		return this.nextredeemdate;
	}
	
	/**
	 * 最近赎回日期,
	 */
	public void setNextredeemdate(String value)
	 {
		this.nextredeemdate = value;
	}
}
