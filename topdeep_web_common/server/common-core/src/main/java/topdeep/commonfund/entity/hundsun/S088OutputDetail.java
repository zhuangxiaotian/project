package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 投资人预留信息查询(S088)功能输出明细参数
 */
public class S088OutputDetail extends Object implements Serializable {
	
	/**
	 * 预留信息,
	 */
	private String reservewords = "";
	
	/**
	 * 预留信息,
	 */
	public String getReservewords() {
		return this.reservewords;
	}
	
	/**
	 * 预留信息,
	 */
	public void setReservewords(String value)
	 {
		this.reservewords = value;
	}
}
