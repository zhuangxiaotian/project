package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 用户超级现金宝信息查询(S052)
 */
public class S052Output extends HundsunBaseOutput implements Serializable {
	
	private List<S052OutputDetail> detail = new ArrayList<S052OutputDetail>();
	
	public List<S052OutputDetail> getDetail() {
		return this.detail;
	}
	
}
