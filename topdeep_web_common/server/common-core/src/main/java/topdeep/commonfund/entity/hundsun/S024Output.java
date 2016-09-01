package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合理财份额查询(S024)
 */
public class S024Output extends HundsunBaseOutput implements Serializable {
	
	private List<S024OutputDetail> detail = new ArrayList<S024OutputDetail>();
	
	public List<S024OutputDetail> getDetail() {
		return this.detail;
	}
	
}
