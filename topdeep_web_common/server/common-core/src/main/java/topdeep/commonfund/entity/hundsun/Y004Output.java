package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约卖出支付方式列表(Y004)
 */
public class Y004Output extends HundsunBaseOutput implements Serializable {
	
	private List<Y004OutputDetail> detail = new ArrayList<Y004OutputDetail>();
	
	public List<Y004OutputDetail> getDetail() {
		return this.detail;
	}
	
}
