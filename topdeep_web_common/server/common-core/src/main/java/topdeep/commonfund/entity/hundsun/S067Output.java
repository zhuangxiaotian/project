package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 查询客户市值(S067)
 */
public class S067Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 总市值（直销+代销）,
	 */
	private String lastasset = "";
	
	/**
	 * 代销市值,
	 */
	private String lastasset_dx = "";
	
	/**
	 * 直销市值,
	 */
	private String lastasset_zx = "";
	
	/**
	 * 实时总市值,querytype为1才有值
	 */
	private String realbalance = "";
	
	/**
	 * 专户实时总市值,querytype为1才有值
	 */
	private String realbalance_zh = "";
	
	/**
	 * 实时直销市值,querytype为1才有值
	 */
	private String realbalance_zx = "";
	
	/**
	 * 总市值,querytype为1才有值
	 */
	private String totalbalance = "";
	
	/**
	 * 总代销市值,querytype为1才有值
	 */
	private String totalbalance_dx = "";
	
	/**
	 * 专户总市值,querytype为1才有值
	 */
	private String totalbalance_zh = "";
	
	/**
	 * 总直销市值,querytype为1才有值
	 */
	private String totalbalance_zx = "";
	
	/**
	 * 专户可以市值,querytype为1才有值
	 */
	private String usablebalance_zh = "";
	
	/**
	 * 可用金额,querytype为1才有值
	 */
	private String usablebalance_zx = "";
	
	/**
	 * 总市值（直销+代销）,
	 */
	public String getLastasset() {
		return this.lastasset;
	}
	
	/**
	 * 总市值（直销+代销）,
	 */
	public void setLastasset(String value)
	 {
		this.lastasset = value;
	}
	
	/**
	 * 代销市值,
	 */
	public String getLastasset_dx() {
		return this.lastasset_dx;
	}
	
	/**
	 * 代销市值,
	 */
	public void setLastasset_dx(String value)
	 {
		this.lastasset_dx = value;
	}
	
	/**
	 * 直销市值,
	 */
	public String getLastasset_zx() {
		return this.lastasset_zx;
	}
	
	/**
	 * 直销市值,
	 */
	public void setLastasset_zx(String value)
	 {
		this.lastasset_zx = value;
	}
	
	/**
	 * 实时总市值,querytype为1才有值
	 */
	public String getRealbalance() {
		return this.realbalance;
	}
	
	/**
	 * 实时总市值,querytype为1才有值
	 */
	public void setRealbalance(String value)
	 {
		this.realbalance = value;
	}
	
	/**
	 * 专户实时总市值,querytype为1才有值
	 */
	public String getRealbalance_zh() {
		return this.realbalance_zh;
	}
	
	/**
	 * 专户实时总市值,querytype为1才有值
	 */
	public void setRealbalance_zh(String value)
	 {
		this.realbalance_zh = value;
	}
	
	/**
	 * 实时直销市值,querytype为1才有值
	 */
	public String getRealbalance_zx() {
		return this.realbalance_zx;
	}
	
	/**
	 * 实时直销市值,querytype为1才有值
	 */
	public void setRealbalance_zx(String value)
	 {
		this.realbalance_zx = value;
	}
	
	/**
	 * 总市值,querytype为1才有值
	 */
	public String getTotalbalance() {
		return this.totalbalance;
	}
	
	/**
	 * 总市值,querytype为1才有值
	 */
	public void setTotalbalance(String value)
	 {
		this.totalbalance = value;
	}
	
	/**
	 * 总代销市值,querytype为1才有值
	 */
	public String getTotalbalance_dx() {
		return this.totalbalance_dx;
	}
	
	/**
	 * 总代销市值,querytype为1才有值
	 */
	public void setTotalbalance_dx(String value)
	 {
		this.totalbalance_dx = value;
	}
	
	/**
	 * 专户总市值,querytype为1才有值
	 */
	public String getTotalbalance_zh() {
		return this.totalbalance_zh;
	}
	
	/**
	 * 专户总市值,querytype为1才有值
	 */
	public void setTotalbalance_zh(String value)
	 {
		this.totalbalance_zh = value;
	}
	
	/**
	 * 总直销市值,querytype为1才有值
	 */
	public String getTotalbalance_zx() {
		return this.totalbalance_zx;
	}
	
	/**
	 * 总直销市值,querytype为1才有值
	 */
	public void setTotalbalance_zx(String value)
	 {
		this.totalbalance_zx = value;
	}
	
	/**
	 * 专户可以市值,querytype为1才有值
	 */
	public String getUsablebalance_zh() {
		return this.usablebalance_zh;
	}
	
	/**
	 * 专户可以市值,querytype为1才有值
	 */
	public void setUsablebalance_zh(String value)
	 {
		this.usablebalance_zh = value;
	}
	
	/**
	 * 可用金额,querytype为1才有值
	 */
	public String getUsablebalance_zx() {
		return this.usablebalance_zx;
	}
	
	/**
	 * 可用金额,querytype为1才有值
	 */
	public void setUsablebalance_zx(String value)
	 {
		this.usablebalance_zx = value;
	}
}
