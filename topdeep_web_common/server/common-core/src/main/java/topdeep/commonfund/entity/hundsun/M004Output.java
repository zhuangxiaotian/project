package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝基金列表(M004)
 */
public class M004Output extends HundsunBaseOutput implements Serializable {
	
	private List<M004OutputDetail> detail = new ArrayList<M004OutputDetail>();
	
	public List<M004OutputDetail> getDetail() {
		return this.detail;
	}
	
}
