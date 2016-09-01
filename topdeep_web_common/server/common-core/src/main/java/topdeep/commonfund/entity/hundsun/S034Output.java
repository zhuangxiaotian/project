package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 费率折扣查询(S034)
 */
public class S034Output extends HundsunBaseOutput implements Serializable {
	
	private List<S034OutputDetail> detail = new ArrayList<S034OutputDetail>();
	
	public List<S034OutputDetail> getDetail() {
		return this.detail;
	}
	
}
