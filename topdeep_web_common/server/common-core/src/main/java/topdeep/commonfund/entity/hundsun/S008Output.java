package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 当前工作日查询(S008)
 */
public class S008Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 当前工作,yyyymmdd
	 */
	private String workdate = "";
	
	/**
	 * 当前工作,yyyymmdd
	 */
	public String getWorkdate() {
		return this.workdate;
	}
	
	/**
	 * 当前工作,yyyymmdd
	 */
	public void setWorkdate(String value)
	 {
		this.workdate = value;
	}
}
