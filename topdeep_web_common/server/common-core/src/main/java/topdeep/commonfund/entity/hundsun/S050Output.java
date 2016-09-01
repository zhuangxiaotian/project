package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 开户申请审批状态查询(S050)
 */
public class S050Output extends HundsunBaseOutput implements Serializable {
	
	private List<S050OutputDetail> detail = new ArrayList<S050OutputDetail>();
	
	public List<S050OutputDetail> getDetail() {
		return this.detail;
	}
	
}
