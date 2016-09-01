package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 可撤单交易列表(T008)
 */
public class T008Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 业务大类,现金宝传01
	 */
	private String busintype = "";
	
	/**
	 * 业务代码,
	 */
	private String callingcode = "";
	
	/**
	 * 辅助业务代码,
	 */
	private String fixbusinflag = "";
	
	/**
	 * 查询类别,1、只查询现金宝的交易；2:查询公募基金的申请（不含专户）3：只查询专户的交易；如需查询QDII专户基金，除了querytype=3以外，请配置ETS_ISSUPFUNDSUBTYPE=1(默认0);4:只查非现金宝交易
	 */
	private String querytype = "";
	
	/**
	 * 基金子类别,始用于诺亚，当基金子类型为2时，过滤OTC产品
	 */
	private String fundsubtype = "";
	
	/**
	 * 证件号码,支持非登录调用
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,支持非登录调用
	 */
	private String identitytype;
	
	/**
	 * 业务代码不等于,需要过滤的业务代码
	 */
	private String callingcodenq = "";
	
	/**
	 * 初始化参数
	 */
	public T008Input() {
		this.setFunction("T008");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 业务大类,现金宝传01
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝传01
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 业务代码,
	 */
	public String getCallingcode() {
		return this.callingcode;
	}
	
	/**
	 * 业务代码,
	 */
	public void setCallingcode(String value)
	 {
		this.callingcode = value;
	}
	
	/**
	 * 辅助业务代码,
	 */
	public String getFixbusinflag() {
		return this.fixbusinflag;
	}
	
	/**
	 * 辅助业务代码,
	 */
	public void setFixbusinflag(String value)
	 {
		this.fixbusinflag = value;
	}
	
	/**
	 * 查询类别,1、只查询现金宝的交易；2:查询公募基金的申请（不含专户）3：只查询专户的交易；如需查询QDII专户基金，除了querytype=3以外，请配置ETS_ISSUPFUNDSUBTYPE=1(默认0);4:只查非现金宝交易
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类别,1、只查询现金宝的交易；2:查询公募基金的申请（不含专户）3：只查询专户的交易；如需查询QDII专户基金，除了querytype=3以外，请配置ETS_ISSUPFUNDSUBTYPE=1(默认0);4:只查非现金宝交易
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 基金子类别,始用于诺亚，当基金子类型为2时，过滤OTC产品
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类别,始用于诺亚，当基金子类型为2时，过滤OTC产品
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 证件号码,支持非登录调用
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,支持非登录调用
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,支持非登录调用
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,支持非登录调用
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 业务代码不等于,需要过滤的业务代码
	 */
	public String getCallingcodenq() {
		return this.callingcodenq;
	}
	
	/**
	 * 业务代码不等于,需要过滤的业务代码
	 */
	public void setCallingcodenq(String value)
	 {
		this.callingcodenq = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("busintype", this.busintype);
		inputMap.put("callingcode", this.callingcode);
		inputMap.put("fixbusinflag", this.fixbusinflag);
		inputMap.put("querytype", this.querytype);
		inputMap.put("fundsubtype", this.fundsubtype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype.toString());
		inputMap.put("callingcodenq", this.callingcodenq);
	}
}
