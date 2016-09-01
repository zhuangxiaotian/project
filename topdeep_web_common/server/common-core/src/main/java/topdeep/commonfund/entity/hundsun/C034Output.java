package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询交易帐号(后台模式)(C034)
 */
public class C034Output extends HundsunBaseOutput implements Serializable {
	
	private List<C034OutputTradeaccolist> tradeaccolist = new ArrayList<C034OutputTradeaccolist>();
	
	public List<C034OutputTradeaccolist> getTradeaccolist() {
		return this.tradeaccolist;
	}
	
}
