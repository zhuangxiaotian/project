package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合投资调仓(T016)
 */
public class T016Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 申请编号,由于直销以多笔处理，暂不返回申请编号
	 */
	private String applyserial = "";
	
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
