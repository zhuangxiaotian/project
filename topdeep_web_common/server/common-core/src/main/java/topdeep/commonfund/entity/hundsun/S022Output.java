package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易限制查询(S022)
 */
public class S022Output extends HundsunBaseOutput implements Serializable {
	
	private List<S022OutputDetail> detail = new ArrayList<S022OutputDetail>();
	
	public List<S022OutputDetail> getDetail() {
		return this.detail;
	}
	
}
