package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 净值收益率排行榜查询(S026)功能输出明细参数
 */
public class S026OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 结束日单位净值,
	 */
	private String netvalue = "";
	
	/**
	 * 净值收益率,返回4位小数。即收益率为“1.22%”，则返回0.0122
	 */
	private String ratio = "";
	
	/**
	 * 基金类型,
	 */
	private String fundtype = "";
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 基金名称,
	 */
	public String getFundname() {
		return this.fundname;
	}
	
	/**
	 * 基金名称,
	 */
	public void setFundname(String value)
	 {
		this.fundname = value;
	}
	
	/**
	 * 结束日单位净值,
	 */
	public String getNetvalue() {
		return this.netvalue;
	}
	
	/**
	 * 结束日单位净值,
	 */
	public void setNetvalue(String value)
	 {
		this.netvalue = value;
	}
	
	/**
	 * 净值收益率,返回4位小数。即收益率为“1.22%”，则返回0.0122
	 */
	public String getRatio() {
		return this.ratio;
	}
	
	/**
	 * 净值收益率,返回4位小数。即收益率为“1.22%”，则返回0.0122
	 */
	public void setRatio(String value)
	 {
		this.ratio = value;
	}
	
	/**
	 * 基金类型,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
}
