package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 超级现金宝收益查询(S054)
 */
public class S054Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请记录数,
	 */
	private String applyrecordno = "";
	
	/**
	 * 收益归属日期(<=),
	 */
	private String enddate = "";
	
	/**
	 * 当前页码,
	 */
	private String pageno = "";
	
	/**
	 * 收益归属日期(>=),
	 */
	private String startdate = "";
	
	/**
	 * 超级现金宝交易账号,
	 */
	private String supermoneytradeacco = "";
	
	/**
	 * 交易来源,
	 */
	private String comefrom = "";
	
	/**
	 * 查询类型,(调用9Z号服务)0--查超级现金宝收益明细，分卡，分日期（默认） 1--查询超级现金宝每日收益，不分卡，分日期
	 */
	private String querytype;
	
	/**
	 * 初始化参数
	 */
	public S054Input() {
		this.setFunction("S054");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
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
	 * 收益归属日期(<=),
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 收益归属日期(<=),
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
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
	 * 收益归属日期(>=),
	 */
	public String getStartdate() {
		return this.startdate;
	}
	
	/**
	 * 收益归属日期(>=),
	 */
	public void setStartdate(String value)
	 {
		this.startdate = value;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public String getSupermoneytradeacco() {
		return this.supermoneytradeacco;
	}
	
	/**
	 * 超级现金宝交易账号,
	 */
	public void setSupermoneytradeacco(String value)
	 {
		this.supermoneytradeacco = value;
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
	
	/**
	 * 查询类型,(调用9Z号服务)0--查超级现金宝收益明细，分卡，分日期（默认） 1--查询超级现金宝每日收益，不分卡，分日期
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询类型,(调用9Z号服务)0--查超级现金宝收益明细，分卡，分日期（默认） 1--查询超级现金宝每日收益，不分卡，分日期
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.applyrecordno);
		inputMap.put("enddate", this.enddate);
		inputMap.put("pageno", this.pageno);
		inputMap.put("startdate", this.startdate);
		inputMap.put("supermoneytradeacco", this.supermoneytradeacco);
		inputMap.put("comefrom", this.comefrom);
		inputMap.put("querytype", this.querytype.toString());
	}
}
