package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取可用的银行渠道(C001)
 */
public class C001Output extends HundsunBaseOutput implements Serializable {
	
	private List<C001OutputDetail> detail = new ArrayList<C001OutputDetail>();
	
	public List<C001OutputDetail> getDetail() {
		return this.detail;
	}
	
}
