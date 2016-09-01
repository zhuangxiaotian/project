package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 第三方预约交易申请查询(S051)
 */
public class S051Output extends HundsunBaseOutput implements Serializable {
	
	private List<S051OutputDetail> detail = new ArrayList<S051OutputDetail>();
	
	public List<S051OutputDetail> getDetail() {
		return this.detail;
	}
	
}
