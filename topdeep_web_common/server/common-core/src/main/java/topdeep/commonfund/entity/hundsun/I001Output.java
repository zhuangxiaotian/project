package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可签解约银行卡列表(I001)
 */
public class I001Output extends HundsunBaseOutput implements Serializable {
	
	private List<I001OutputDetail> detail = new ArrayList<I001OutputDetail>();
	
	public List<I001OutputDetail> getDetail() {
		return this.detail;
	}
	
}
