package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 公共事业缴费查询(S048)
 */
public class S048Output extends HundsunBaseOutput implements Serializable {
	
	private List<S048OutputDetail> detail = new ArrayList<S048OutputDetail>();
	
	public List<S048OutputDetail> getDetail() {
		return this.detail;
	}
	
}
