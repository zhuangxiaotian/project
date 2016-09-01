package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)
 */
public class C004Output extends HundsunBaseOutput implements Serializable {
	
	private List<C004OutputRisklist> risklist = new ArrayList<C004OutputRisklist>();
	
	public List<C004OutputRisklist> getRisklist() {
		return this.risklist;
	}
	
}
