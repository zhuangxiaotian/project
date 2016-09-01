package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 读取用户网上交易预留信息(C064)
 */
public class C064Output extends HundsunBaseOutput implements Serializable {
	
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
