package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 在途资产查询(S095)
 */
public class S095Output extends HundsunBaseOutput implements Serializable {
	
	private List<S095OutputDetail> detail = new ArrayList<S095OutputDetail>();
	
	public List<S095OutputDetail> getDetail() {
		return this.detail;
	}
	
}
