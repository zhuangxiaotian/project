package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可转换目标基金列表(T005)
 */
public class T005Output extends HundsunBaseOutput implements Serializable {
	
	private List<T005OutputDetail> detail = new ArrayList<T005OutputDetail>();
	
	public List<T005OutputDetail> getDetail() {
		return this.detail;
	}
	
}
