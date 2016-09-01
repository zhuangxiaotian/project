package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * T043 功能输出转接器
 */
public class T043OutputAdapta extends HundsunOutputAdapta {
	
	/**
	 * 实际输出对象
	 */
	private T043Output results;
	
	/**
	 * 实际输出对象
	 */
	public T043Output getResults() {
		return this.results;
	}
	
	/**
	 * 实际输出对象
	 */
	public void setResults(T043Output value)
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
