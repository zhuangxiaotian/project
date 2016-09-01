package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * S002 功能输出转接器
 */
public class S002OutputAdapta extends HundsunOutputAdapta {
	
	/**
	 * 实际输出对象
	 */
	private S002Output results;
	
	/**
	 * 实际输出对象
	 */
	public S002Output getResults() {
		return this.results;
	}
	
	/**
	 * 实际输出对象
	 */
	public void setResults(S002Output value)
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
