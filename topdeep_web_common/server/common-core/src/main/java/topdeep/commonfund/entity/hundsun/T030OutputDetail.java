package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 扣款结果通知(后台模式) (T030)功能输出明细参数
 */
public class T030OutputDetail extends Object implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applyserial = "";
	
	/**
	 * 申请编号,
	 */
	public String getApplyserial() {
		return this.applyserial;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplyserial(String value)
	 {
		this.applyserial = value;
	}
}
