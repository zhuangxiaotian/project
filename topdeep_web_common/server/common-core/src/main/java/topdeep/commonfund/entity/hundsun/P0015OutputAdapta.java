package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * P0015 功能输出转接器
 */
public class P0015OutputAdapta extends HundsunOutputAdapta {
	
	/**
	 * 实际输出对象
	 */
	private P0015Output results;
	
	/**
	 * 实际输出对象
	 */
	public P0015Output getResults() {
		return this.results;
	}
	
	/**
	 * 实际输出对象
	 */
	public void setResults(P0015Output value)
	 {
		this.results = value;
	}
	
	/**
	 * 输出返回的实际对象
	 */
	public HundsunBaseOutput getOut() {
		return this.results;
	}
}
