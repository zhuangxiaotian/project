package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 刷新查询接口(P014)
 */
public class P0014Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 上次刷新时间,
	 */
	private String time = "";
	
	/**
	 * 上次刷新时间,
	 */
	public String getTime() {
		return this.time;
	}
	
	/**
	 * 上次刷新时间,
	 */
	public void setTime(String value)
	 {
		this.time = value;
	}
}
