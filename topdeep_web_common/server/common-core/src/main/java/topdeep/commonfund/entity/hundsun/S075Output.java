package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 直销系统时间查询(S075)
 */
public class S075Output extends HundsunBaseOutput implements Serializable {
	
	private List<S075OutputDetail> detail = new ArrayList<S075OutputDetail>();
	
	public List<S075OutputDetail> getDetail() {
		return this.detail;
	}
	
}
