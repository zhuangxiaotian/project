package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 相对工作日查询(S040)
 */
public class S040Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 相对工作日,格式：yyyymmdd
	 */
	private String offsetdate = "";
	
	/**
	 * 相对工作日,格式：yyyymmdd
	 */
	public String getOffsetdate() {
		return this.offsetdate;
	}
	
	/**
	 * 相对工作日,格式：yyyymmdd
	 */
	public void setOffsetdate(String value)
	 {
		this.offsetdate = value;
	}
}
