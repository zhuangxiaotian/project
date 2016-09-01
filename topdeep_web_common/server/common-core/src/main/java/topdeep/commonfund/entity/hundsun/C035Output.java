package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 增开基金账号(C035)
 */
public class C035Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 新增基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 新增基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 新增基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
}
