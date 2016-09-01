package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转换来源基金列表(T027)
 */
public class T027Output extends HundsunBaseOutput implements Serializable {
	
	private List<T027OutputDetail> detail = new ArrayList<T027OutputDetail>();
	
	public List<T027OutputDetail> getDetail() {
		return this.detail;
	}
	
}
