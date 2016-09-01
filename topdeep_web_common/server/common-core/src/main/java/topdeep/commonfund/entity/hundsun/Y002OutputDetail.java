package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约买入支付方式列表(Y002)功能输出明细参数
 */
public class Y002OutputDetail extends Object implements Serializable {
	
	/**
	 * 预约指数代码,取字典“预约交易指数代码”
	 */
	private String exponentcode = "";
	
	/**
	 * 预约比较条件,取字典“预约条件”
	 */
	private String exponentflag = "";
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	private String exptype = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 基金名称,
	 */
	private String fundname = "";
	
	/**
	 * 是否支持现金宝,0:不支持;1:支持
	 */
	private String issupmoneyfund = "";
	
	/**
	 * 使用现金宝时的实际业务代码,986:预约转换
	 */
	private String moneycapBusinFlag = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	private List<Y002OutputDetail> detail = new ArrayList<Y002OutputDetail>();
	
	/**
	 * 预约指数代码,取字典“预约交易指数代码”
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 预约指数代码,取字典“预约交易指数代码”
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约比较条件,取字典“预约条件”
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约比较条件,取字典“预约条件”
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 预约方式,"--":日期;"00":指数;"04":净值;"05":资产
	 */
	public void setExptype(String value)
	 {
		this.exptype = value;
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
	 * 是否支持现金宝,0:不支持;1:支持
	 */
	public String getIssupmoneyfund() {
		return this.issupmoneyfund;
	}
	
	/**
	 * 是否支持现金宝,0:不支持;1:支持
	 */
	public void setIssupmoneyfund(String value)
	 {
		this.issupmoneyfund = value;
	}
	
	/**
	 * 使用现金宝时的实际业务代码,986:预约转换
	 */
	public String getMoneycapBusinFlag() {
		return this.moneycapBusinFlag;
	}
	
	/**
	 * 使用现金宝时的实际业务代码,986:预约转换
	 */
	public void setMoneycapBusinFlag(String value)
	 {
		this.moneycapBusinFlag = value;
	}
	
	/**
	 * 收费方式,
	 */
	public String getSharetype() {
		return this.sharetype;
	}
	
	/**
	 * 收费方式,
	 */
	public void setSharetype(String value)
	 {
		this.sharetype = value;
	}
	
	public List<Y002OutputDetail> getDetail() {
		return this.detail;
	}
	
}
