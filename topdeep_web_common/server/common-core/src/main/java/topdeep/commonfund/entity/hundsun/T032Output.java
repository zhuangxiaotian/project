package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可撤单列表接口(T032)
 */
public class T032Output extends HundsunBaseOutput implements Serializable {
	
	private List<T032OutputDetail> detail = new ArrayList<T032OutputDetail>();
	
	public List<T032OutputDetail> getDetail() {
		return this.detail;
	}
	
}
