package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询微信绑定(C043)
 */
public class C043Output extends HundsunBaseOutput implements Serializable {
	
	private List<C043OutputDetail> detail = new ArrayList<C043OutputDetail>();
	
	public List<C043OutputDetail> getDetail() {
		return this.detail;
	}
	
}
