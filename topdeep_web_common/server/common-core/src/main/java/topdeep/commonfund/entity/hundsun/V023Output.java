package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 充值码兑换记录查询(V023)
 */
public class V023Output extends HundsunBaseOutput implements Serializable {
	
	private List<V023OutputDetail> detail = new ArrayList<V023OutputDetail>();
	
	public List<V023OutputDetail> getDetail() {
		return this.detail;
	}
	
}
