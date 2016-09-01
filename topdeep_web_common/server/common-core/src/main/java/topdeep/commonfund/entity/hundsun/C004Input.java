package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 获取风险评测题目及答案(C004)
 */
public class C004Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金代码,如果是真的基金的风险问卷，需要传基金代码
	 */
	private String fundcode = "";
	
	/**
	 * 问卷大类,0:普通问卷;1:专户问卷
	 */
	private String questiontype = "";
	
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
	 * 请求序列号,使用C002中生成的请求序列号，如果已登录户查询填ISNULL
	 */
	private String accoreqserial = "";
	
	/**
	 * 初始化参数
	 */
	public C004Input() {
		this.setFunction("C004");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金代码,如果是真的基金的风险问卷，需要传基金代码
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,如果是真的基金的风险问卷，需要传基金代码
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 问卷大类,0:普通问卷;1:专户问卷
	 */
	public String getQuestiontype() {
		return this.questiontype;
	}
	
	/**
	 * 问卷大类,0:普通问卷;1:专户问卷
	 */
	public void setQuestiontype(String value)
	 {
		this.questiontype = value;
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
	 * 请求序列号,使用C002中生成的请求序列号，如果已登录户查询填ISNULL
	 */
	public String getAccoreqserial() {
		return this.accoreqserial;
	}
	
	/**
	 * 请求序列号,使用C002中生成的请求序列号，如果已登录户查询填ISNULL
	 */
	public void setAccoreqserial(String value)
	 {
		this.accoreqserial = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("questiontype", this.questiontype);
		inputMap.put("custname", this.custname);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("accoreqserial", this.accoreqserial);
	}
}
