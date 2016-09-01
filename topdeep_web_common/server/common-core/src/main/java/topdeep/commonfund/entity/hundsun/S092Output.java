package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金费率查询(S092)
 */
public class S092Output extends HundsunBaseOutput implements Serializable {
	
	private List<S092OutputDetail> detail = new ArrayList<S092OutputDetail>();
	
	public List<S092OutputDetail> getDetail() {
		return this.detail;
	}
	
}
