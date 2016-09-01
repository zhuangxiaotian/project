package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历测评详情查询(S100)
 */
public class S100Output extends HundsunBaseOutput implements Serializable {
	
	private List<S100OutputDetail> detail = new ArrayList<S100OutputDetail>();
	
	public List<S100OutputDetail> getDetail() {
		return this.detail;
	}
	
}
