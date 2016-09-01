package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 更新开户留痕(C057)
 */
public class C057Output extends HundsunBaseOutput implements Serializable {
	
	private List<C057OutputDetail> detail = new ArrayList<C057OutputDetail>();
	
	public List<C057OutputDetail> getDetail() {
		return this.detail;
	}
	
}
