package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 现金宝过户查询(S101)
 */
public class S101Output extends HundsunBaseOutput implements Serializable {
	
	private List<S101OutputDetail> detail = new ArrayList<S101OutputDetail>();
	
	public List<S101OutputDetail> getDetail() {
		return this.detail;
	}
	
}
