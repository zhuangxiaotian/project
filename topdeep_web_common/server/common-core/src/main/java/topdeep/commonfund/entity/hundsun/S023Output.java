package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * TA信息查询(S023)
 */
public class S023Output extends HundsunBaseOutput implements Serializable {
	
	private List<S023OutputDetail> detail = new ArrayList<S023OutputDetail>();
	
	public List<S023OutputDetail> getDetail() {
		return this.detail;
	}
	
}
