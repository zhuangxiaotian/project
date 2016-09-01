package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合理财份额查询(S024)功能输出明细参数
 */
public class S024OutputDetail extends Object implements Serializable {
	
	/**
	 * 组合编号,
	 */
	private String combcode = "";
	
	/**
	 * 当前份额余额,
	 */
	private Double currentremainshare;
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	private String custtype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	private String sharetype;
	
	/**
	 * 交易冻结份额,
	 */
	private Double tfreezeremainshare;
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 可用份额余额,
	 */
	private Double usableremainshare;
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 组合编号,
	 */
	public String getCombcode() {
		return this.combcode;
	}
	
	/**
	 * 组合编号,
	 */
	public void setCombcode(String value)
	 {
		this.combcode = value;
	}
	
	/**
	 * 当前份额余额,
	 */
	public Double getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 当前份额余额,
	 */
	public void setCurrentremainshare(Double value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,0：机构；1：个人
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
	}
	
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
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,取字典“份额类别”，A:前收费,B:后收费,C:水平收费
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public Double getTfreezeremainshare() {
		return this.tfreezeremainshare;
	}
	
	/**
	 * 交易冻结份额,
	 */
	public void setTfreezeremainshare(Double value)
	 {
		this.tfreezeremainshare = value;
	}
	
	/**
	 * 交易账号,
	 */
	public String getTradeacco() {
		return this.tradeacco;
	}
	
	/**
	 * 交易账号,
	 */
	public void setTradeacco(String value)
	 {
		this.tradeacco = value;
	}
	
	/**
	 * 可用份额余额,
	 */
	public Double getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额余额,
	 */
	public void setUsableremainshare(Double value)
	 {
		this.usableremainshare = value;
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
}
