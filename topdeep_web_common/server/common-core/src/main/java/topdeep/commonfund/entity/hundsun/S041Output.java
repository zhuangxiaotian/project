package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS分类查询(S041)
 */
public class S041Output extends HundsunBaseOutput implements Serializable {
	
	private List<S041OutputDetail> detail = new ArrayList<S041OutputDetail>();
	
	public List<S041OutputDetail> getDetail() {
		return this.detail;
	}
	
}
