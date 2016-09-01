package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可定投赎回的基金列表(I014)
 */
public class I014Output extends HundsunBaseOutput implements Serializable {
	
	private List<I014OutputDetail> detail = new ArrayList<I014OutputDetail>();
	
	public List<I014OutputDetail> getDetail() {
		return this.detail;
	}
	
}
