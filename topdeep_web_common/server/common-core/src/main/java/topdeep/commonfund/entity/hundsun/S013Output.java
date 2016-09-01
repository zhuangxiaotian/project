package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 浮动盈亏查询(S013)
 */
public class S013Output extends HundsunBaseOutput implements Serializable {
	
	private List<S013OutputDetail> detail = new ArrayList<S013OutputDetail>();
	
	public List<S013OutputDetail> getDetail() {
		return this.detail;
	}
	
}
