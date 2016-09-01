package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金卖出或转换(T006)
 */
public class T006Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 下单日期,对应下单的自然日
	 */
	private String acceptdate = "";
	
	/**
	 * 申请日期,对应该交易申请的实际工作日
	 */
	private String requestdate = "";
	
	/**
	 * 申请编号,由于直销以多笔处理，暂不返回申请编号
	 */
	private String applyserial = "";
	
	/**
	 * 下单日期,对应下单的自然日
	 */
	public String getAcceptdate() {
		return this.acceptdate;
	}
	
	/**
	 * 下单日期,对应下单的自然日
	 */
	public void setAcceptdate(String value)
	 {
		this.acceptdate = value;
	}
	
	/**
	 * 申请日期,对应该交易申请的实际工作日
	 */
	public String getRequestdate() {
		return this.requestdate;
	}
	
	/**
	 * 申请日期,对应该交易申请的实际工作日
	 */
	public void setRequestdate(String value)
	 {
		this.requestdate = value;
	}
	
	/**
	 * 申请编号,由于直销以多笔处理，暂不返回申请编号
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,由于直销以多笔处理，暂不返回申请编号
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
