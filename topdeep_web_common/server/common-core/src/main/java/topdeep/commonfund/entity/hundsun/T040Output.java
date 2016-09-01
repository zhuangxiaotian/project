package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 赎回渠道查询(T040)
 */
public class T040Output extends HundsunBaseOutput implements Serializable {
	
	private List<T040OutputDetail> detail = new ArrayList<T040OutputDetail>();
	
	public List<T040OutputDetail> getDetail() {
		return this.detail;
	}
	
}
