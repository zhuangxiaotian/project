package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金排行榜查询(S016)
 */
public class S016Output extends HundsunBaseOutput implements Serializable {
	
	private List<S016OutputDetail> detail = new ArrayList<S016OutputDetail>();
	
	public List<S016OutputDetail> getDetail() {
		return this.detail;
	}
	
}
