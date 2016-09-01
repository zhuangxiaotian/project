package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 注册信息查询(S098)
 */
public class S098Output extends HundsunBaseOutput implements Serializable {
	
	private List<S098OutputDetail> detail = new ArrayList<S098OutputDetail>();
	
	public List<S098OutputDetail> getDetail() {
		return this.detail;
	}
	
}
