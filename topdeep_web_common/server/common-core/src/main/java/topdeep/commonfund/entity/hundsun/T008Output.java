package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可撤单交易列表(T008)
 */
public class T008Output extends HundsunBaseOutput implements Serializable {
	
	private List<T008OutputDetail> detail = new ArrayList<T008OutputDetail>();
	
	public List<T008OutputDetail> getDetail() {
		return this.detail;
	}
	
}
