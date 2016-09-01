package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝交易申请查询(S056)
 */
public class S056Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	/**
	 * 发生后余额,
	 */
	private String endasset = "";
	
	/**
	 * 申请份额,
	 */
	private String enshare = "";
	
	/**
	 * 业务辅助代码,
	 */
	private String fixflag = "";
	
	private List<S056OutputDetail> detail = new ArrayList<S056OutputDetail>();
	
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
	 * 发生后余额,
	 */
	public String getEndasset() {
		return this.endasset;
	}
	
	/**
	 * 发生后余额,
	 */
	public void setEndasset(String value)
	 {
		this.endasset = value;
	}
	
	/**
	 * 申请份额,
	 */
	public String getEnshare() {
		return this.enshare;
	}
	
	/**
	 * 申请份额,
	 */
	public void setEnshare(String value)
	 {
		this.enshare = value;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public String getFixflag() {
		return this.fixflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixflag(String value)
	 {
		this.fixflag = value;
	}
	
	public List<S056OutputDetail> getDetail() {
		return this.detail;
	}
	
}
