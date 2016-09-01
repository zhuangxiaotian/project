package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金信息查询(S010)
 */
public class S010Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 基金管理人代码,
	 */
	private String managercode = "";
	
	/**
	 * 申请记录数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 基金状态可申购标志,
	 */
	private String declareflag = "";
	
	/**
	 * 不包含基金代码,
	 */
	private String notfundcode = "";
	
	/**
	 * 当前页码,
	 */
	private String pageno = "";
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	private String datasource = "";
	
	/**
	 * 查询类型,仅当数据源为DC时有效，1：专户基金；2：普通基金；其他：所有基金
	 */
	private String querytype = "";
	
	/**
	 * 基金代码,基金代码查询
	 */
	private String fundcode = "";
	
	/**
	 * 风险等级匹配,
	 */
	private String fundrisklevel = "";
	
	/**
	 * 基金状态,
	 */
	private String fundstate = "";
	
	/**
	 * 基金子类型,始用于诺亚，子类型为2时，为OTC产品
	 */
	private String fundsubtype = "";
	
	/**
	 * 基金类别,
	 */
	private String fundtype = "";
	
	/**
	 * 是否需要推荐码,DS才会返回
	 */
	private String needrecommender = "";
	
	/**
	 * 初始化参数
	 */
	public S010Input() {
		this.setFunction("S010");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 基金管理人代码,
	 */
	public String getManagercode() {
		return this.managercode;
	}
	
	/**
	 * 基金管理人代码,
	 */
	public void setManagercode(String value)
	 {
		this.managercode = value;
	}
	
	/**
	 * 申请记录数,
	 */
	public String getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请记录数,
	 */
	public void setApplyrecordno(String value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 基金状态可申购标志,
	 */
	public String getDeclareflag() {
		return this.declareflag;
	}
	
	/**
	 * 基金状态可申购标志,
	 */
	public void setDeclareflag(String value)
	 {
		this.declareflag = value;
	}
	
	/**
	 * 不包含基金代码,
	 */
	public String getNotfundcode() {
		return this.notfundcode;
	}
	
	/**
	 * 不包含基金代码,
	 */
	public void setNotfundcode(String value)
	 {
		this.notfundcode = value;
	}
	
	/**
	 * 当前页码,
	 */
	public String getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,
	 */
	public void setPageno(String value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public String getDatasource() {
		return this.datasource;
	}
	
	/**
	 * 数据来源,DS:直销；DC：数据中心（默认直销）
	 */
	public void setDatasource(String value)
	 {
		this.datasource = value;
	}
	
	/**
	 * 查询类型,仅当数据源为DC时有效，1：专户基金；2：普通基金；其他：所有基金
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,仅当数据源为DC时有效，1：专户基金；2：普通基金；其他：所有基金
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	/**
	 * 基金代码,基金代码查询
	 */
	public String getFundcode() {
		return this.fundcode;
	}
	
	/**
	 * 基金代码,基金代码查询
	 */
	public void setFundcode(String value)
	 {
		this.fundcode = value;
	}
	
	/**
	 * 风险等级匹配,
	 */
	public String getFundrisklevel() {
		return this.fundrisklevel;
	}
	
	/**
	 * 风险等级匹配,
	 */
	public void setFundrisklevel(String value)
	 {
		this.fundrisklevel = value;
	}
	
	/**
	 * 基金状态,
	 */
	public String getFundstate() {
		return this.fundstate;
	}
	
	/**
	 * 基金状态,
	 */
	public void setFundstate(String value)
	 {
		this.fundstate = value;
	}
	
	/**
	 * 基金子类型,始用于诺亚，子类型为2时，为OTC产品
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,始用于诺亚，子类型为2时，为OTC产品
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 基金类别,
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类别,
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 是否需要推荐码,DS才会返回
	 */
	public String getNeedrecommender() {
		return this.needrecommender;
	}
	
	/**
	 * 是否需要推荐码,DS才会返回
	 */
	public void setNeedrecommender(String value)
	 {
		this.needrecommender = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("managercode", this.managercode);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("declareflag", this.declareflag);
		inputMap.put("notfundcode", this.notfundcode);
		inputMap.put("pageno", this.pageno);
		inputMap.put("datasource", this.datasource);
		inputMap.put("querytype", this.querytype);
		inputMap.put("fundcode", this.fundcode);
		inputMap.put("fundrisklevel", this.fundrisklevel);
		inputMap.put("fundstate", this.fundstate);
		inputMap.put("fundsubtype", this.fundsubtype);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("needrecommender", this.needrecommender);
	}
}
