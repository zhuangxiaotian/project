package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 第三方账号绑定状态查询(V015)
 */
public class V015Output extends HundsunBaseOutput implements Serializable {
	
	private List<V015OutputDetail> detail = new ArrayList<V015OutputDetail>();
	
	public List<V015OutputDetail> getDetail() {
		return this.detail;
	}
	
}
