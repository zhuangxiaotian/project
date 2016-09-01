package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定制服务查询(V007)
 */
public class V007Output extends HundsunBaseOutput implements Serializable {
	
	private List<V007OutputDetail> detail = new ArrayList<V007OutputDetail>();
	
	public List<V007OutputDetail> getDetail() {
		return this.detail;
	}
	
}
