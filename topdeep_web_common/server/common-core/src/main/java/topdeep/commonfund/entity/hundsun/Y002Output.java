package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 预约买入支付方式列表(Y002)
 */
public class Y002Output extends HundsunBaseOutput implements Serializable {
	
	private List<Y002OutputDetail> detail = new ArrayList<Y002OutputDetail>();
	
	public List<Y002OutputDetail> getDetail() {
		return this.detail;
	}
	
}
