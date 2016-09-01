package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询密保问题(C017)
 */
public class C017Output extends HundsunBaseOutput implements Serializable {
	
	private List<C017OutputDetail> detail = new ArrayList<C017OutputDetail>();
	
	private List<C017OutputDetail1> detail1 = new ArrayList<C017OutputDetail1>();
	
	public List<C017OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<C017OutputDetail1> getDetail1() {
		return this.detail1;
	}
	
}
