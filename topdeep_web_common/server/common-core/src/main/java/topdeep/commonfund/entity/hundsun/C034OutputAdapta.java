package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * C034 功能输出转接器
 */
public class C034OutputAdapta extends HundsunOutputAdapta {
	
	/**
	 * 实际输出对象
	 */
	private C034Output results;
	
	/**
	 * 实际输出对象
	 */
	public C034Output getResults() {
		return this.results;
	}
	
	/**
	 * 实际输出对象
	 */
	public void setResults(C034Output value)
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
