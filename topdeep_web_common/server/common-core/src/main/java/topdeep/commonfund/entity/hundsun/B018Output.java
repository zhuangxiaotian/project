package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 汇付渠道账户明细查询(B018)
 */
public class B018Output extends HundsunBaseOutput implements Serializable {
	
	private List<B018OutputDetail> detail = new ArrayList<B018OutputDetail>();
	
	public List<B018OutputDetail> getDetail() {
		return this.detail;
	}
	
}
