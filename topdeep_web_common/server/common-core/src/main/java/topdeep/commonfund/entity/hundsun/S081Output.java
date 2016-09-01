package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 持仓收益查询(S081)
 */
public class S081Output extends HundsunBaseOutput implements Serializable {
	
	private List<S081OutputDetail> detail = new ArrayList<S081OutputDetail>();
	
	public List<S081OutputDetail> getDetail() {
		return this.detail;
	}
	
}
