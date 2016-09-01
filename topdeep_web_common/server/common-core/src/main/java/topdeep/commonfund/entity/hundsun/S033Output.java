package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 账户成交查询(S033)
 */
public class S033Output extends HundsunBaseOutput implements Serializable {
	
	private List<S033OutputDetail> detail = new ArrayList<S033OutputDetail>();
	
	public List<S033OutputDetail> getDetail() {
		return this.detail;
	}
	
}
