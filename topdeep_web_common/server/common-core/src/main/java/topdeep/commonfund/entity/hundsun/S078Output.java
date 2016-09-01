package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 专户基金信息披露(S078)
 */
public class S078Output extends HundsunBaseOutput implements Serializable {
	
	private List<S078OutputDetail> detail = new ArrayList<S078OutputDetail>();
	
	public List<S078OutputDetail> getDetail() {
		return this.detail;
	}
	
}
