package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 时间段内每天的收益(S077)
 */
public class S077Output extends HundsunBaseOutput implements Serializable {
	
	private List<S077OutputDetail> detail = new ArrayList<S077OutputDetail>();
	
	public List<S077OutputDetail> getDetail() {
		return this.detail;
	}
	
}
