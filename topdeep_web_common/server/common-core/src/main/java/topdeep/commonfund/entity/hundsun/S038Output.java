package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T+0划款流水查询(S038)
 */
public class S038Output extends HundsunBaseOutput implements Serializable {
	
	private List<S038OutputDetail> detail = new ArrayList<S038OutputDetail>();
	
	public List<S038OutputDetail> getDetail() {
		return this.detail;
	}
	
}
