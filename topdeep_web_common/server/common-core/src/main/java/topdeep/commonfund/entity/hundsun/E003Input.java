package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 新增专户用户授权(E003)
 */
public class E003Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 客户编号,custno获取优先级 1;传入的custno 2：如果传了sessionkey，则从sessionkey中获取custno:3，如果没传sessionkey，则根据identityno和identitytype获取custno
	 */
	private String custno = "";
	
	/**
	 * 基金账号,
	 */
	private String fundacco = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	private String qualificationenddate = "";
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	private String qualificationflag = "";
	
	/**
	 * 交易密码,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	private String tradepassword = "";
	
	/**
	 * 交易来源,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	private String comefrom = "";
	
	/**
	 * 初始化参数
	 */
	public E003Input() {
		this.setFunction("E003");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 客户编号,custno获取优先级 1;传入的custno 2：如果传了sessionkey，则从sessionkey中获取custno:3，如果没传sessionkey，则根据identityno和identitytype获取custno
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 客户编号,custno获取优先级 1;传入的custno 2：如果传了sessionkey，则从sessionkey中获取custno:3，如果没传sessionkey，则根据identityno和identitytype获取custno
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 基金账号,
	 */
	public String getFundacco() {
		return this.fundacco;
	}
	
	/**
	 * 基金账号,
	 */
	public void setFundacco(String value)
	 {
		this.fundacco = value;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentityno() {
		return this.identityno;
	}
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentityno(String value)
	 {
		this.identityno = value;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public String getIdentitytype() {
		return this.identitytype;
	}
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	public void setIdentitytype(String value)
	 {
		this.identitytype = value;
	}
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	public String getQualificationenddate() {
		return this.qualificationenddate;
	}
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	public void setQualificationenddate(String value)
	 {
		this.qualificationenddate = value;
	}
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	public String getQualificationflag() {
		return this.qualificationflag;
	}
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	public void setQualificationflag(String value)
	 {
		this.qualificationflag = value;
	}
	
	/**
	 * 交易密码,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	public String getTradepassword() {
		return this.tradepassword;
	}
	
	/**
	 * 交易密码,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	public void setTradepassword(String value)
	 {
		this.tradepassword = value;
	}
	
	/**
	 * 交易来源,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,如果系统参数ALLOW_NO_PWD_TRADE_SOURCE中包含入参comefrom，则密码可不用填
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("custno", this.custno);
		inputMap.put("fundacco", this.fundacco);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("qualificationenddate", this.qualificationenddate);
		inputMap.put("qualificationflag", this.qualificationflag);
		inputMap.put("tradepassword", this.tradepassword);
		inputMap.put("comefrom", this.comefrom);
	}
}
