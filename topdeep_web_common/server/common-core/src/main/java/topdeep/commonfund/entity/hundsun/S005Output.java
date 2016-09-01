package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史分红查询(S005)
 */
public class S005Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	/**
	 * 除息日,
	 */
	private String exdividenddate = "";
	
	private List<S005OutputDetail> detail = new ArrayList<S005OutputDetail>();
	
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
	 * 除息日,
	 */
	public String getExdividenddate() {
		return this.exdividenddate;
	}
	
	/**
	 * 除息日,
	 */
	public void setExdividenddate(String value)
	 {
		this.exdividenddate = value;
	}
	
	public List<S005OutputDetail> getDetail() {
		return this.detail;
	}
	
}
