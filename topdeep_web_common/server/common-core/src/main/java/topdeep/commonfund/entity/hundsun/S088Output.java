package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 投资人预留信息查询(S088)
 */
public class S088Output extends HundsunBaseOutput implements Serializable {
	
	private List<S088OutputDetail> detail = new ArrayList<S088OutputDetail>();
	
	public List<S088OutputDetail> getDetail() {
		return this.detail;
	}
	
}
