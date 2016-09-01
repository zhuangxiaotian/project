package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 联行号查询(B039)
 */
public class B039Output extends HundsunBaseOutput implements Serializable {
	
	private List<B039OutputDetail> detail = new ArrayList<B039OutputDetail>();
	
	public List<B039OutputDetail> getDetail() {
		return this.detail;
	}
	
}
