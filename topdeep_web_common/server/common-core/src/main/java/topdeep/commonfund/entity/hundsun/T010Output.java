package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可修改分红方式列表(T010)
 */
public class T010Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总记录条数,没有记录时显示为0
	 */
	private Double totalrecords;
	
	private List<T010OutputDetail> detail = new ArrayList<T010OutputDetail>();
	
	private List<T010OutputItemsDetail> itemsDetail = new ArrayList<T010OutputItemsDetail>();
	
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
	
	public List<T010OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<T010OutputItemsDetail> getItemsDetail() {
		return this.itemsDetail;
	}
	
}
