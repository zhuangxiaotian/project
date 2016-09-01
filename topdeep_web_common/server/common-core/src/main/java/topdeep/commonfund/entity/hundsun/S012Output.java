package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 资金流水查询(S012)
 */
public class S012Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	/**
	 * 业务辅助代码,
	 */
	private String fixbusinflag = "";
	
	private List<S012OutputDetail> detail = new ArrayList<S012OutputDetail>();
	
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
	 * 业务辅助代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 业务辅助代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	public List<S012OutputDetail> getDetail() {
		return this.detail;
	}
	
}
