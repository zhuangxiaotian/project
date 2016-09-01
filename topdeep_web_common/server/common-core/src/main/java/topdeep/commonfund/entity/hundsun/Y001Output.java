package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 未处理预约申请列表(Y001)
 */
public class Y001Output extends HundsunBaseOutput implements Serializable {
	
	private List<Y001OutputDetail> detail = new ArrayList<Y001OutputDetail>();
	
	public List<Y001OutputDetail> getDetail() {
		return this.detail;
	}
	
}
