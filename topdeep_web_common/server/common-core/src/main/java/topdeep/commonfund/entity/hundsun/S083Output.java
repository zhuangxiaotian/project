package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 待审核交易查询(S083)
 */
public class S083Output extends HundsunBaseOutput implements Serializable {
	
	private List<S083OutputDetail> detail = new ArrayList<S083OutputDetail>();
	
	public List<S083OutputDetail> getDetail() {
		return this.detail;
	}
	
}
