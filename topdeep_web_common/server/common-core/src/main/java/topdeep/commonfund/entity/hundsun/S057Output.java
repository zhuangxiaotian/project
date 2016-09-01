package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 追加投资查询(S057)
 */
public class S057Output extends HundsunBaseOutput implements Serializable {
	
	private List<S057OutputDetail> detail = new ArrayList<S057OutputDetail>();
	
	public List<S057OutputDetail> getDetail() {
		return this.detail;
	}
	
}
