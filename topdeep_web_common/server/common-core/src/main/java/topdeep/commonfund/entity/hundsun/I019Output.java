package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 趋势定投避险基金列表(I019)
 */
public class I019Output extends HundsunBaseOutput implements Serializable {
	
	private List<I019OutputDetail> detail = new ArrayList<I019OutputDetail>();
	
	public List<I019OutputDetail> getDetail() {
		return this.detail;
	}
	
}
