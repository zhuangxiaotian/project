package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询基金账号(数据中心)(C067)
 */
public class C067Output extends HundsunBaseOutput implements Serializable {
	
	private List<C067OutputDetail> detail = new ArrayList<C067OutputDetail>();
	
	public List<C067OutputDetail> getDetail() {
		return this.detail;
	}
	
}
