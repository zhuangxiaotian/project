package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投转换的转出基金列表(I017)
 */
public class I017Output extends HundsunBaseOutput implements Serializable {
	
	private List<I017OutputDetail> detail = new ArrayList<I017OutputDetail>();
	
	public List<I017OutputDetail> getDetail() {
		return this.detail;
	}
	
}
