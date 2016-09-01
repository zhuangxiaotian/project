package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询电子合同信息(E001)
 */
public class E001Output extends HundsunBaseOutput implements Serializable {
	
	private List<E001OutputDetail> detail = new ArrayList<E001OutputDetail>();
	
	public List<E001OutputDetail> getDetail() {
		return this.detail;
	}
	
}
