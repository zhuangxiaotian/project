package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合投资基金列表(T013)
 */
public class T013Output extends HundsunBaseOutput implements Serializable {
	
	private List<T013OutputDetail> detail = new ArrayList<T013OutputDetail>();
	
	public List<T013OutputDetail> getDetail() {
		return this.detail;
	}
	
}
