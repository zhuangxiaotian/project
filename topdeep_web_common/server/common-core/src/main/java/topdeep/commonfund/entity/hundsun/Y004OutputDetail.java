package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约卖出支付方式列表(Y004)功能输出明细参数
 */
public class Y004OutputDetail extends Object implements Serializable {
	
	/**
	 * 预约指数代码,
	 */
	private String exponentcode = "";
	
	/**
	 * 预约比较条件,
	 */
	private String exponentflag = "";
	
	/**
	 * 预约方式,以key:value键值对形式排列的json格式字符串，例：{"--":日期;"00":指数;"04":净值;"05":资产}
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
	 * 是否支持现金宝买入,0:不支持;1:支持
	 */
	private String issupmoneyfund = "";
	
	/**
	 * 现金宝买入时的实际业务代码,986:预约转换
	 */
	private String moneycapBusinFlag = "";
	
	/**
	 * 收费方式,
	 */
	private String sharetype = "";
	
	/**
	 * 目标业务代码,
	 */
	private String targetbusinflag = "";
	
	/**
	 * 目标基金代码,
	 */
	private String targetfundcode = "";
	
	/**
	 * 目标基金名称,
	 */
	private String targetfundname = "";
	
	/**
	 * 目标收费方式,
	 */
	private String targetsharetype = "";
	
	private List<Y004OutputDetail> detail = new ArrayList<Y004OutputDetail>();
	
	/**
	 * 预约指数代码,
	 */
	public String getExponentcode() {
		return this.exponentcode;
	}
	
	/**
	 * 预约指数代码,
	 */
	public void setExponentcode(String value)
	 {
		this.exponentcode = value;
	}
	
	/**
	 * 预约比较条件,
	 */
	public String getExponentflag() {
		return this.exponentflag;
	}
	
	/**
	 * 预约比较条件,
	 */
	public void setExponentflag(String value)
	 {
		this.exponentflag = value;
	}
	
	/**
	 * 预约方式,以key:value键值对形式排列的json格式字符串，例：{"--":日期;"00":指数;"04":净值;"05":资产}
	 */
	public String getExptype() {
		return this.exptype;
	}
	
	/**
	 * 预约方式,以key:value键值对形式排列的json格式字符串，例：{"--":日期;"00":指数;"04":净值;"05":资产}
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
	 * 是否支持现金宝买入,0:不支持;1:支持
	 */
	public String getIssupmoneyfund() {
		return this.issupmoneyfund;
	}
	
	/**
	 * 是否支持现金宝买入,0:不支持;1:支持
	 */
	public void setIssupmoneyfund(String value)
	 {
		this.issupmoneyfund = value;
	}
	
	/**
	 * 现金宝买入时的实际业务代码,986:预约转换
	 */
	public String getMoneycapBusinFlag() {
		return this.moneycapBusinFlag;
	}
	
	/**
	 * 现金宝买入时的实际业务代码,986:预约转换
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
	
	/**
	 * 目标业务代码,
	 */
	public String getTargetbusinflag() {
		return this.targetbusinflag;
	}
	
	/**
	 * 目标业务代码,
	 */
	public void setTargetbusinflag(String value)
	 {
		this.targetbusinflag = value;
	}
	
	/**
	 * 目标基金代码,
	 */
	public String getTargetfundcode() {
		return this.targetfundcode;
	}
	
	/**
	 * 目标基金代码,
	 */
	public void setTargetfundcode(String value)
	 {
		this.targetfundcode = value;
	}
	
	/**
	 * 目标基金名称,
	 */
	public String getTargetfundname() {
		return this.targetfundname;
	}
	
	/**
	 * 目标基金名称,
	 */
	public void setTargetfundname(String value)
	 {
		this.targetfundname = value;
	}
	
	/**
	 * 目标收费方式,
	 */
	public String getTargetsharetype() {
		return this.targetsharetype;
	}
	
	/**
	 * 目标收费方式,
	 */
	public void setTargetsharetype(String value)
	 {
		this.targetsharetype = value;
	}
	
	public List<Y004OutputDetail> getDetail() {
		return this.detail;
	}
	
}
