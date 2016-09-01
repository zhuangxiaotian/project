package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 交易费率查询(S021)
 */
public class S021Output extends HundsunBaseOutput implements Serializable {
	
	private List<S021OutputDetail> detail = new ArrayList<S021OutputDetail>();
	
	public List<S021OutputDetail> getDetail() {
		return this.detail;
	}
	
}
