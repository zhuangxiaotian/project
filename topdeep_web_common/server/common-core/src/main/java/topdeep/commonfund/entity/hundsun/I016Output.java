package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投支付方式列表(I016)
 */
public class I016Output extends HundsunBaseOutput implements Serializable {
	
	private List<I016OutputDetail> detail = new ArrayList<I016OutputDetail>();
	
	public List<I016OutputDetail> getDetail() {
		return this.detail;
	}
	
}
