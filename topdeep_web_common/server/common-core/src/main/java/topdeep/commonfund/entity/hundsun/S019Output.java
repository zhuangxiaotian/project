package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理汇款余额查询(S019)
 */
public class S019Output extends HundsunBaseOutput implements Serializable {
	
	private List<S019OutputDetail> detail = new ArrayList<S019OutputDetail>();
	
	public List<S019OutputDetail> getDetail() {
		return this.detail;
	}
	
}
