package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 子账户查询(S082)
 */
public class S082Output extends HundsunBaseOutput implements Serializable {
	
	private List<S082OutputDetail> detail = new ArrayList<S082OutputDetail>();
	
	public List<S082OutputDetail> getDetail() {
		return this.detail;
	}
	
}
