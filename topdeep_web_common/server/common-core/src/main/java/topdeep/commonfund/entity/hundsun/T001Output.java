package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可购买基金列表(T001)
 */
public class T001Output extends HundsunBaseOutput implements Serializable {
	
	private List<T001OutputDetail> detail = new ArrayList<T001OutputDetail>();
	
	public List<T001OutputDetail> getDetail() {
		return this.detail;
	}
	
}
