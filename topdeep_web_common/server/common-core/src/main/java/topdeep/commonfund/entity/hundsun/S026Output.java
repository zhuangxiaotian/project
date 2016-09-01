package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 净值收益率排行榜查询(S026)
 */
public class S026Output extends HundsunBaseOutput implements Serializable {
	
	private List<S026OutputDetail> detail = new ArrayList<S026OutputDetail>();
	
	public List<S026OutputDetail> getDetail() {
		return this.detail;
	}
	
}
