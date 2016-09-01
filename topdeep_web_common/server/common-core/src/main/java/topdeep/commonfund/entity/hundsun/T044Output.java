package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 购物车信息修改(T044)
 */
public class T044Output extends HundsunBaseOutput implements Serializable {
	
	private List<T044OutputDetail> detail = new ArrayList<T044OutputDetail>();
	
	public List<T044OutputDetail> getDetail() {
		return this.detail;
	}
	
}
