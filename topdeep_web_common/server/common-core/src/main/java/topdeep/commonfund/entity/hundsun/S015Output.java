package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 避险明细查询(S015)
 */
public class S015Output extends HundsunBaseOutput implements Serializable {
	
	private List<S015OutputDetail> detail = new ArrayList<S015OutputDetail>();
	
	public List<S015OutputDetail> getDetail() {
		return this.detail;
	}
	
}
