package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可买入支付方式列表(T002)
 */
public class T002Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 是否支持用超级现金宝买入,
	 */
	private String issupsuppermoneyfund = "";
	
	/**
	 * 是否支持现金宝买入,0:不支持;1:支持;2:仅支持和现金宝有相同收费方式的
	 */
	private String issupmoneyfund = "";
	
	/**
	 * 现金宝买入时的实际业务代码,024:赎回转购;036:转换
	 */
	private String moneycapBusinFlag = "";
	
	/**
	 * 超级现金买入时可用的业务代码,
	 */
	private String supermoneycapBusinFlag = "";
	
	private List<T002OutputDetail> detail = new ArrayList<T002OutputDetail>();
	
	/**
	 * 是否支持用超级现金宝买入,
	 */
	public String getIssupsuppermoneyfund() {
		return this.issupsuppermoneyfund;
	}
	
	/**
	 * 是否支持用超级现金宝买入,
	 */
	public void setIssupsuppermoneyfund(String value)
	 {
		this.issupsuppermoneyfund = value;
	}
	
	/**
	 * 是否支持现金宝买入,0:不支持;1:支持;2:仅支持和现金宝有相同收费方式的
	 */
	public String getIssupmoneyfund() {
		return this.issupmoneyfund;
	}
	
	/**
	 * 是否支持现金宝买入,0:不支持;1:支持;2:仅支持和现金宝有相同收费方式的
	 */
	public void setIssupmoneyfund(String value)
	 {
		this.issupmoneyfund = value;
	}
	
	/**
	 * 现金宝买入时的实际业务代码,024:赎回转购;036:转换
	 */
	public String getMoneycapBusinFlag() {
		return this.moneycapBusinFlag;
	}
	
	/**
	 * 现金宝买入时的实际业务代码,024:赎回转购;036:转换
	 */
	public void setMoneycapBusinFlag(String value)
	 {
		this.moneycapBusinFlag = value;
	}
	
	/**
	 * 超级现金买入时可用的业务代码,
	 */
	public String getSupermoneycapBusinFlag() {
		return this.supermoneycapBusinFlag;
	}
	
	/**
	 * 超级现金买入时可用的业务代码,
	 */
	public void setSupermoneycapBusinFlag(String value)
	 {
		this.supermoneycapBusinFlag = value;
	}
	
	public List<T002OutputDetail> getDetail() {
		return this.detail;
	}
	
}
