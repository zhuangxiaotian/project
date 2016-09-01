package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 服务定制查询(V001)
 */
public class V001Output extends HundsunBaseOutput implements Serializable {
	
	private List<V001OutputDetail> detail = new ArrayList<V001OutputDetail>();
	
	private List<V001OutputDetail1> detail1 = new ArrayList<V001OutputDetail1>();
	
	private List<V001OutputDetail2> detail2 = new ArrayList<V001OutputDetail2>();
	
	public List<V001OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public List<V001OutputDetail1> getDetail1() {
		return this.detail1;
	}
	
	
	public List<V001OutputDetail2> getDetail2() {
		return this.detail2;
	}
	
}
