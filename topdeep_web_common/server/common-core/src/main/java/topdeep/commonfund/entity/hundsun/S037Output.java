package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金收益率查询(S037)
 */
public class S037Output extends HundsunBaseOutput implements Serializable {
	
	private List<S037OutputDetail> detail = new ArrayList<S037OutputDetail>();
	
	public List<S037OutputDetail> getDetail() {
		return this.detail;
	}
	
}
