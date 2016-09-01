package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 扣款结果通知(后台模式) (T030)
 */
public class T030Output extends HundsunBaseOutput implements Serializable {
	
	private List<T030OutputDetail> detail = new ArrayList<T030OutputDetail>();
	
	public List<T030OutputDetail> getDetail() {
		return this.detail;
	}
	
}
