package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金份额查询(S001)
 */
public class S001Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	private String querytype;
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	private String datasource = "";
	
	/**
	 * 是否过滤份额为0的基金,1或者空：过滤份额为0的基金，0--不过滤份额为0的
	 */
	private String filterzerofundshare = "";
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 默认账户标识,
	 */
	private String backfiag = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 初始化参数
	 */
	public S001Input() {
		this.setFunction("S001");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 份额查询类型,1:总份额,2:直销份额,3:代销份额,4:现金宝份额,5:T+0赎回份额,6:数据中心直销份额，7:数据中心专户份额（系统参数ETS_ISQUERYCONTAINSPECIALFUND=1时才有效），8：数据中心总份额（含专户），9:中银养老保基金份额10：直销专户份额，11：直销公募份额（不含专户），12：超级现金宝份额
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DC：数据中心，DS：直销，空：自动识别
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 是否过滤份额为0的基金,1或者空：过滤份额为0的基金，0--不过滤份额为0的
	 */
	public String getFilterzerofundshare() {
		return this.filterzerofundshare;
	}
	
	/**
	 * 是否过滤份额为0的基金,1或者空：过滤份额为0的基金，0--不过滤份额为0的
	 */
	public void setFilterzerofundshare(String value)
	 {
		this.filterzerofundshare = value;
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
	 * 默认账户标识,
	 */
	public String getBackfiag() {
		return this.backfiag;
	}
	
	/**
	 * 默认账户标识,
	 */
	public void setBackfiag(String value)
	 {
		this.backfiag = value;
	}
	
	/**
	 * 交易来源,
	 */
	public String getComefrom() {
		return this.comefrom;
	}
	
	/**
	 * 交易来源,
	 */
	public void setComefrom(String value)
	 {
		this.comefrom = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("querytype", this.querytype.toString());
		inputMap.put("datasource", this.datasource);
		inputMap.put("filterzerofundshare", this.filterzerofundshare);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("backfiag", this.backfiag);
		inputMap.put("comefrom", this.comefrom);
	}
}
