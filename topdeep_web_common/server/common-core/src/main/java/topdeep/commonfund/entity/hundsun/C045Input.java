package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 修改登录信息(C045)
 */
public class C045Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 答对问题的比率,
	 */
	private String answercorrectratio = "";
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	private String custNo = "";
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	private String lastTradeAccoNo = "";
	
	/**
	 * 开户预留信息,
	 */
	private String reservewords = "";
	
	/**
	 * 初始化参数
	 */
	public C045Input() {
		this.setFunction("C045");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 答对问题的比率,
	 */
	public String getAnswercorrectratio() {
		return this.answercorrectratio;
	}
	
	/**
	 * 答对问题的比率,
	 */
	public void setAnswercorrectratio(String value)
	 {
		this.answercorrectratio = value;
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public String getCustNo() {
		return this.custNo;
	}
	
	/**
	 * 客户编号,如果是数据中心数据，则为EQ+客户编号
	 */
	public void setCustNo(String value)
	 {
		this.custNo = value;
	}
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	public String getLastTradeAccoNo() {
		return this.lastTradeAccoNo;
	}
	
	/**
	 * 上次交易使用的交易账号,详见字典项说明（参考字典：职业）
	 */
	public void setLastTradeAccoNo(String value)
	 {
		this.lastTradeAccoNo = value;
	}
	
	/**
	 * 开户预留信息,
	 */
	public String getReservewords() {
		return this.reservewords;
	}
	
	/**
	 * 开户预留信息,
	 */
	public void setReservewords(String value)
	 {
		this.reservewords = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("answercorrectratio", this.answercorrectratio);
		inputMap.put("custNo", this.custNo);
		inputMap.put("lastTradeAccoNo", this.lastTradeAccoNo);
		inputMap.put("reservewords", this.reservewords);
	}
}
