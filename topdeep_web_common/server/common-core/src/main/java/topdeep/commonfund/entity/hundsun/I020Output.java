package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投首次交易日期查询(I020)
 */
public class I020Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 交易日期,实际扣款日期（按周会转换为1-31号的一个日期）
	 */
	private String jyrq = "";
	
	/**
	 * 首次交易月份,经过计算后的首次扣款月份
	 */
	private String scjyrq = "";
	
	/**
	 * 交易日期,实际扣款日期（按周会转换为1-31号的一个日期）
	 */
	public String getJyrq() {
		return this.jyrq;
	}
	
	/**
	 * 交易日期,实际扣款日期（按周会转换为1-31号的一个日期）
	 */
	public void setJyrq(String value)
	 {
		this.jyrq = value;
	}
	
	/**
	 * 首次交易月份,经过计算后的首次扣款月份
	 */
	public String getScjyrq() {
		return this.scjyrq;
	}
	
	/**
	 * 首次交易月份,经过计算后的首次扣款月份
	 */
	public void setScjyrq(String value)
	 {
		this.scjyrq = value;
	}
}
