package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 历史份额查询(S080)
 */
public class S080Output extends HundsunBaseOutput implements Serializable {
	
	private List<S080OutputDetail> detail = new ArrayList<S080OutputDetail>();
	
	public List<S080OutputDetail> getDetail() {
		return this.detail;
	}
	
}
