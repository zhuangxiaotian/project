package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 交易流程工作日查询功能输出参数
 */
public class ISTransactionsProcessDayQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 工作日1,交易委托日期（申购，提交委托和付款到华安日期，赎回，提交委托日期）
	 */
	private java.util.Date workDay1;
	
	/**
	 * 工作日2,交易成功日期
	 */
	private java.util.Date workDay2;
	
	/**
	 * 工作日3,赎回到账或者份额可用日期
	 */
	private java.util.Date workDay3;
	
	public ISTransactionsProcessDayQueryOutput() {
		this.setZ_funcCode("n0s");
	}
	
	/**
	 * 工作日1,交易委托日期（申购，提交委托和付款到华安日期，赎回，提交委托日期）
	 */
	public java.util.Date getWorkDay1() {
		return this.workDay1;
	}
	
	/**
	 * 工作日1,交易委托日期（申购，提交委托和付款到华安日期，赎回，提交委托日期）
	 */
	public void setWorkDay1(java.util.Date value)
	 {
		this.workDay1 = value;
	}
	
	/**
	 * 工作日2,交易成功日期
	 */
	public java.util.Date getWorkDay2() {
		return this.workDay2;
	}
	
	/**
	 * 工作日2,交易成功日期
	 */
	public void setWorkDay2(java.util.Date value)
	 {
		this.workDay2 = value;
	}
	
	/**
	 * 工作日3,赎回到账或者份额可用日期
	 */
	public java.util.Date getWorkDay3() {
		return this.workDay3;
	}
	
	/**
	 * 工作日3,赎回到账或者份额可用日期
	 */
	public void setWorkDay3(java.util.Date value)
	 {
		this.workDay3 = value;
	}
}
