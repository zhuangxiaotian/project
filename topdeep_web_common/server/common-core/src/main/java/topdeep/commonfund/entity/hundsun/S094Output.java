package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 指数均线查询(S094)
 */
public class S094Output extends HundsunBaseOutput implements Serializable {
	
	private List<S094OutputDetail> detail = new ArrayList<S094OutputDetail>();
	
	public List<S094OutputDetail> getDetail() {
		return this.detail;
	}
	
}
