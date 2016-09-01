package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易确认查询(S004)
 */
public class S004Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	/**
	 * 未付收益,未付收益
	 */
	private String chincome = "";
	
	/**
	 * 后手续费,
	 */
	private String afterfare = "";
	
	/**
	 * 目标基金的确认份额,数据源为DS(直销)，才有返回值
	 */
	private String otherconfirmshare = "";
	
	/**
	 * 对方净值,
	 */
	private String othernav = "";
	
	private List<S004OutputDetail> detail = new ArrayList<S004OutputDetail>();
	
	private List<S004OutputDetail1> detail1 = new ArrayList<S004OutputDetail1>();
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public Double getTotalrecords() {
		return this.totalrecords;
	}
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	public void setTotalrecords(Double value)
	 {
		this.totalrecords = value;
	}
	
	/**
	 * 未付收益,未付收益
	 */
	public String getChincome() {
		return this.chincome;
	}
	
	/**
	 * 未付收益,未付收益
	 */
	public void setChincome(String value)
	 {
		this.chincome = value;
	}
	
	/**
	 * 后手续费,
	 */
	public String getAfterfare() {
		return this.afterfare;
	}
	
	/**
	 * 后手续费,
	 */
	public void setAfterfare(String value)
	 {
		this.afterfare = value;
	}
	
	/**
	 * 目标基金的确认份额,数据源为DS(直销)，才有返回值
	 */
	public String getOtherconfirmshare() {
		return this.otherconfirmshare;
	}
	
	/**
	 * 目标基金的确认份额,数据源为DS(直销)，才有返回值
	 */
	public void setOtherconfirmshare(String value)
	 {
		this.otherconfirmshare = value;
	}
	
	/**
	 * 对方净值,
	 */
	public String getOthernav() {
		return this.othernav;
	}
	
	/**
	 * 对方净值,
	 */
	public void setOthernav(String value)
	 {
		this.othernav = value;
	}
	
	public List<S004OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<S004OutputDetail1> getDetail1() {
		return this.detail1;
	}
	
}
