package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史交易查询(S068)
 */
public class S068Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总页数,
	 */
	private String sumpage = "";
	
	/**
	 * 确认日期,
	 */
	private String confirmdate = "";
	
	/**
	 * 机器时间,
	 */
	private String machinedate = "";
	
	private List<S068OutputDetail> detail = new ArrayList<S068OutputDetail>();
	
	/**
	 * 总页数,
	 */
	public String getSumpage() {
		return this.sumpage;
	}
	
	/**
	 * 总页数,
	 */
	public void setSumpage(String value)
	 {
		this.sumpage = value;
	}
	
	/**
	 * 确认日期,
	 */
	public String getConfirmdate() {
		return this.confirmdate;
	}
	
	/**
	 * 确认日期,
	 */
	public void setConfirmdate(String value)
	 {
		this.confirmdate = value;
	}
	
	/**
	 * 机器时间,
	 */
	public String getMachinedate() {
		return this.machinedate;
	}
	
	/**
	 * 机器时间,
	 */
	public void setMachinedate(String value)
	 {
		this.machinedate = value;
	}
	
	public List<S068OutputDetail> getDetail() {
		return this.detail;
	}
	
}
