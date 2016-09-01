package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询预登记信息(C046)
 */
public class C046Output extends HundsunBaseOutput implements Serializable {
	
	private List<C046OutputDetail> detail = new ArrayList<C046OutputDetail>();
	
	public List<C046OutputDetail> getDetail() {
		return this.detail;
	}
	
}
