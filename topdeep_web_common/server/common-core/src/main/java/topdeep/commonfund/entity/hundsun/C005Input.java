package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)
 */
public class C005Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号，如果已登录户查询填ISNULL
	 */
	private String accoreqserial = "";
	
	/**
	 * 客户姓名,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	private String custname = "";
	
	/**
	 * 证件号码,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	private String identitytype = "";
	
	/**
	 * 自选风险承受能力,选项编号和答案列表或者自选风险承受能力， 二者选一，如果都填以选项编号和答案列表为准（参考字典：投资人风险承受能力）
	 */
	private String riskability = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	private List<C005OutputDetail> detail = new ArrayList<C005OutputDetail>();
	
	/**
	 * 初始化参数
	 */
	public C005Input() {
		this.setFunction("C005");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号，如果已登录户查询填ISNULL
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,使用C002接口中返回的请求序列号，如果已登录户查询填ISNULL
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	/**
	 * 客户姓名,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public String getCustname() {
		return this.custname;
	}
	
	/**
	 * 客户姓名,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public void setCustname(String value)
	 {
		this.custname = value;
	}
	
	/**
	 * 证件号码,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如果传了accoreqserial，则以accoreqserial为准，否则如果同时传了证件类型和证件号码则以传的为准，否则以custinfo中的为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 自选风险承受能力,选项编号和答案列表或者自选风险承受能力， 二者选一，如果都填以选项编号和答案列表为准（参考字典：投资人风险承受能力）
	 */
	public String getRiskability() {
		return this.riskability;
	}
	
	/**
	 * 自选风险承受能力,选项编号和答案列表或者自选风险承受能力， 二者选一，如果都填以选项编号和答案列表为准（参考字典：投资人风险承受能力）
	 */
	public void setRiskability(String value)
	 {
		this.riskability = value;
	}
	
	/**
	 * 基金代码,
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	public List<C005OutputDetail> getDetail() {
		return this.detail;
	}
	
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("accoreqserial", this.accoreqserial);
		inputMap.put("custname", this.custname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("riskability", this.riskability);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("detail", this.detail.toString());
	}
}
