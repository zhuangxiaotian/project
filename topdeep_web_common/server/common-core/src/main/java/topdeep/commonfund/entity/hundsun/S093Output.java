package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收支明细查询(S093)
 */
public class S093Output extends HundsunBaseOutput implements Serializable {
	
	private List<S093OutputDetail> detail = new ArrayList<S093OutputDetail>();
	
	public List<S093OutputDetail> getDetail() {
		return this.detail;
	}
	
}
