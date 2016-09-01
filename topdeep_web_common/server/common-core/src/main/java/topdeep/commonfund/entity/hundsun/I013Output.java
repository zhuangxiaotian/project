package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投转换的转入基金列表(I013)
 */
public class I013Output extends HundsunBaseOutput implements Serializable {
	
	private List<I013OutputDetail> detail = new ArrayList<I013OutputDetail>();
	
	public List<I013OutputDetail> getDetail() {
		return this.detail;
	}
	
}
