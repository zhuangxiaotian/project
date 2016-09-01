package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易账号(C020)
 */
public class C020Output extends HundsunBaseOutput implements Serializable {
	
	private List<C020OutputDetail> detail = new ArrayList<C020OutputDetail>();
	
	public List<C020OutputDetail> getDetail() {
		return this.detail;
	}
	
}
