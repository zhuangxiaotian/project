package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金排行榜查询(S016)功能输出明细参数
 */
public class S016OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 介绍连接,
	 */
	private String introducelink = "";
	
	/**
	 * ,
	 */
	private String ratio = "";
	
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
	 * 介绍连接,
	 */
	public String getIntroducelink() {
		return this.introducelink;
	}
	
	/**
	 * 介绍连接,
	 */
	public void setIntroducelink(String value)
	 {
		this.introducelink = value;
	}
	
	/**
	 * ,
	 */
	public String getRatio() {
		return this.ratio;
	}
	
	/**
	 * ,
	 */
	public void setRatio(String value)
	 {
		this.ratio = value;
	}
}
