package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投协议查询(I025)
 */
public class I025Output extends HundsunBaseOutput implements Serializable {
	
	private List<I025OutputDetail> detail = new ArrayList<I025OutputDetail>();
	
	public List<I025OutputDetail> getDetail() {
		return this.detail;
	}
	
}
