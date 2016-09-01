package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 支付渠道查询(T039)
 */
public class T039Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 资金方式,
	 */
	private String capitalmode = "";
	
	/**
	 * 资金方式,
	 */
	public String getCapitalmode() {
		return this.capitalmode;
	}
	
	/**
	 * 资金方式,
	 */
	public void setCapitalmode(String value)
	 {
		this.capitalmode = value;
	}
}
