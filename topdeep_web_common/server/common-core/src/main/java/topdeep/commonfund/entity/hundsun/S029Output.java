package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易时间限制查询(S029)
 */
public class S029Output extends HundsunBaseOutput implements Serializable {
	
	private List<S029OutputDetail> detail = new ArrayList<S029OutputDetail>();
	
	public List<S029OutputDetail> getDetail() {
		return this.detail;
	}
	
}
