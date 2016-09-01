package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转托管入基金列表(T011)
 */
public class T011Output extends HundsunBaseOutput implements Serializable {
	
	private List<T011OutputDetail> detail = new ArrayList<T011OutputDetail>();
	
	public List<T011OutputDetail> getDetail() {
		return this.detail;
	}
	
}
