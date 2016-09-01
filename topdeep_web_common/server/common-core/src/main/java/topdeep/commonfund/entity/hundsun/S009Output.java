package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 下个工作日查询(S009)
 */
public class S009Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 下个工作日,yyyymmdd
	 */
	private String nextworkdate = "";
	
	/**
	 * 下个工作日,yyyymmdd
	 */
	public String getNextworkdate() {
		return this.nextworkdate;
	}
	
	/**
	 * 下个工作日,yyyymmdd
	 */
	public void setNextworkdate(String value)
	 {
		this.nextworkdate = value;
	}
}
