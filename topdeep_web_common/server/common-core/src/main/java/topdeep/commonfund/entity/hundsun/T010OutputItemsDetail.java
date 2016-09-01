package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可修改分红方式列表(T010)功能输出明细参数
 */
public class T010OutputItemsDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 资金方式,交易账号对应的资金方式
	 */
	private String capitalmode = "";
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	private String bankacco = "";
	
	/**
	 * 银行名称,
	 */
	private String bankname = "";
	
	/**
	 * 现有分红方式,（参考字典：分红方式）
	 */
	private String bonustype = "";
	
	/**
	 * 能否修改分红方式,0：不能 1：能
	 */
	private String canchange = "";
	
	/**
	 * 当前份额余额,无份额修改时，该字段为空
	 */
	private String currentremainshare = "";
	
	/**
	 * 冻结份额余额,无份额修改时，该字段为空
	 */
	private String freezeremainshare = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 基金风险等级,（参考字典：基金风险等级）
	 */
	private String fundrisklevel = "";
	
	/**
	 * 基金状态,（参考字典：基金状态）
	 */
	private String fundstate = "";
	
	/**
	 * 基金类别,（参考字典：基金类别）
	 */
	private String fundtype = "";
	
	/**
	 * 份额类别,（参考字典：份额类别）
	 */
	private String sharetype = "";
	
	/**
	 * TA代码,
	 */
	private String tacode = "";
	
	/**
	 * 测试,
	 */
	private String test = "";
	
	/**
	 * 交易冻结份额,无份额修改时，该字段为空
	 */
	private String tfreezeremainshare = "";
	
	/**
	 * 交易账号,
	 */
	private String tradeacco = "";
	
	/**
	 * 可用份额余额,无份额修改时，该字段为空
	 */
	private String usableremainshare = "";
	
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
	 * 资金方式,交易账号对应的资金方式
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,交易账号对应的资金方式
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public String getBankacco() {
		return this.bankacco;
	}
	
	/**
	 * 银行卡号,屏蔽四位
	 */
	public void setBankacco(String value)
	 {
		this.bankacco = value;
	}
	
	/**
	 * 银行名称,
	 */
	public String getBankname() {
		return this.bankname;
	}
	
	/**
	 * 银行名称,
	 */
	public void setBankname(String value)
	 {
		this.bankname = value;
	}
	
	/**
	 * 现有分红方式,（参考字典：分红方式）
	 */
	public String getBonustype() {
		return this.bonustype;
	}
	
	/**
	 * 现有分红方式,（参考字典：分红方式）
	 */
	public void setBonustype(String value)
	 {
		this.bonustype = value;
	}
	
	/**
	 * 能否修改分红方式,0：不能 1：能
	 */
	public String getCanchange() {
		return this.canchange;
	}
	
	/**
	 * 能否修改分红方式,0：不能 1：能
	 */
	public void setCanchange(String value)
	 {
		this.canchange = value;
	}
	
	/**
	 * 当前份额余额,无份额修改时，该字段为空
	 */
	public String getCurrentremainshare() {
		return this.currentremainshare;
	}
	
	/**
	 * 当前份额余额,无份额修改时，该字段为空
	 */
	public void setCurrentremainshare(String value)
	 {
		this.currentremainshare = value;
	}
	
	/**
	 * 冻结份额余额,无份额修改时，该字段为空
	 */
	public String getFreezeremainshare() {
		return this.freezeremainshare;
	}
	
	/**
	 * 冻结份额余额,无份额修改时，该字段为空
	 */
	public void setFreezeremainshare(String value)
	 {
		this.freezeremainshare = value;
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
	 * 基金风险等级,（参考字典：基金风险等级）
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 基金风险等级,（参考字典：基金风险等级）
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 基金状态,（参考字典：基金状态）
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,（参考字典：基金状态）
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金类别,（参考字典：基金类别）
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,（参考字典：基金类别）
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 份额类别,（参考字典：份额类别）
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 份额类别,（参考字典：份额类别）
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	/**
	 * TA代码,
	 */
	public String getTacode() {
		return this.tacode;
	}
	
	/**
	 * TA代码,
	 */
	public void setTacode(String value)
	 {
		this.tacode = value;
	}
	
	/**
	 * 测试,
	 */
	public String getTest() {
		return this.test;
	}
	
	/**
	 * 测试,
	 */
	public void setTest(String value)
	 {
		this.test = value;
	}
	
	/**
	 * 交易冻结份额,无份额修改时，该字段为空
	 */
	public String getTfreezeremainshare() {
		return this.tfreezeremainshare;
	}
	
	/**
	 * 交易冻结份额,无份额修改时，该字段为空
	 */
	public void setTfreezeremainshare(String value)
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
	 * 可用份额余额,无份额修改时，该字段为空
	 */
	public String getUsableremainshare() {
		return this.usableremainshare;
	}
	
	/**
	 * 可用份额余额,无份额修改时，该字段为空
	 */
	public void setUsableremainshare(String value)
	 {
		this.usableremainshare = value;
	}
}
