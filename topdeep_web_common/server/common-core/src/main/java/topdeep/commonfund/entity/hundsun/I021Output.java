package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 组合定投基金列表(I021)
 */
public class I021Output extends HundsunBaseOutput implements Serializable {
	
	private List<I021OutputDetail> detail = new ArrayList<I021OutputDetail>();
	
	private List<I021OutputComfundsDetail> comfundsDetail = new ArrayList<I021OutputComfundsDetail>();
	
	public List<I021OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<I021OutputComfundsDetail> getComfundsDetail() {
		return this.comfundsDetail;
	}
	
}
