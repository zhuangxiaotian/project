package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 推荐人信息查询(S079)
 */
public class S079Output extends HundsunBaseOutput implements Serializable {
	
	private List<S079OutputDetail> detail = new ArrayList<S079OutputDetail>();
	
	public List<S079OutputDetail> getDetail() {
		return this.detail;
	}
	
}
