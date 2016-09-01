package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定投策略查询(I026)
 */
public class I026Output extends HundsunBaseOutput implements Serializable {
	
	private List<I026OutputDetail> detail = new ArrayList<I026OutputDetail>();
	
	public List<I026OutputDetail> getDetail() {
		return this.detail;
	}
	
}
