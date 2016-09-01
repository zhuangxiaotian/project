package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金净值查询(S007)
 */
public class S007Output extends HundsunBaseOutput implements Serializable {
	
	private List<S007OutputDetail> detail = new ArrayList<S007OutputDetail>();
	
	public List<S007OutputDetail> getDetail() {
		return this.detail;
	}
	
}
