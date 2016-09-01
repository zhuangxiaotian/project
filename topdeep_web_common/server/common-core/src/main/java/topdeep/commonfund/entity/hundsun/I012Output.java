package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投申购的基金列表(I012)
 */
public class I012Output extends HundsunBaseOutput implements Serializable {
	
	private List<I012OutputDetail> detail = new ArrayList<I012OutputDetail>();
	
	public List<I012OutputDetail> getDetail() {
		return this.detail;
	}
	
}
