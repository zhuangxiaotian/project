package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 当日交易申请查询(S002)
 */
public class S002Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 申请条数,每页记录数
	 */
	private Integer applyrecordno;
	
	/**
	 * 客户类型,0：机构；1：个人。如果没有传递sessionkey,必须传该值
	 */
	private String custtype = "";
	
	/**
	 * 证件号码,如360428198711172715,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identityno = "";
	
	/**
	 * 证件类型,如0--身份证,如果没有传递sessionkey,必须传递证件类型和证件号码，否则会抛异常,如果两者都传了，则查询结果以sessionkey为准
	 */
	private String identitytype = "";
	
	/**
	 * 业务大类,现金宝业务传01
	 */
	private String busintype = "";
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	private Integer pageno;
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	private String querydeclarevaluavgr = "";
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	private String queryredeemtranflag = "";
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	private String fundtype = "";
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	private String fundsubtype = "";
	
	/**
	 * 理财平台流水号,宜投使用
	 */
	private String chinapayserialno = "";
	
	/**
	 * 是否按自然日查询,1：是，0：否（默认）。交易申请查询需要升级到9B
	 */
	private String querynaturalday = "";
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	private String promotion = "";
	
	/**
	 * 初始化参数
	 */
	public S002Input() {
		this.setFunction("S002");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public Integer getApplyrecordno() {
		return this.applyrecordno;
	}
	
	/**
	 * 申请条数,每页记录数
	 */
	public void setApplyrecordno(Integer value)
	 {
		this.applyrecordno = value;
	}
	
	/**
	 * 客户类型,0：机构；1：个人。如果没有传递sessionkey,必须传该值
	 */
	public String getCusttype() {
		return this.custtype;
	}
	
	/**
	 * 客户类型,0：机构；1：个人。如果没有传递sessionkey,必须传该值
	 */
	public void setCusttype(String value)
	 {
		this.custtype = value;
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
	 * 业务大类,现金宝业务传01
	 */
	public String getBusintype() {
		return this.busintype;
	}
	
	/**
	 * 业务大类,现金宝业务传01
	 */
	public void setBusintype(String value)
	 {
		this.busintype = value;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public Integer getPageno() {
		return this.pageno;
	}
	
	/**
	 * 当前页码,默认"1",查第一页
	 */
	public void setPageno(Integer value)
	 {
		this.pageno = value;
	}
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public String getQuerydeclarevaluavgr() {
		return this.querydeclarevaluavgr;
	}
	
	/**
	 * 是否是查询申购定投申请,1--是(相当于查询业务代码是022,023,039申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public void setQuerydeclarevaluavgr(String value)
	 {
		this.querydeclarevaluavgr = value;
	}
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public String getQueryredeemtranflag() {
		return this.queryredeemtranflag;
	}
	
	/**
	 * 是否是查询赎回转购申请,1--是(相当于查询业务代码是024、025、036业务申请数据)，其他--不是，和queryredeemtranflag互斥
	 */
	public void setQueryredeemtranflag(String value)
	 {
		this.queryredeemtranflag = value;
	}
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	public String getFundtype() {
		return this.fundtype;
	}
	
	/**
	 * 基金类型,取字典“基金类别”
	 */
	public void setFundtype(String value)
	 {
		this.fundtype = value;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	public String getFundsubtype() {
		return this.fundsubtype;
	}
	
	/**
	 * 基金子类型,如果需要取QDII专户基金，需要使用该字段 0：普通基金；1：专户基金
	 */
	public void setFundsubtype(String value)
	 {
		this.fundsubtype = value;
	}
	
	/**
	 * 理财平台流水号,宜投使用
	 */
	public String getChinapayserialno() {
		return this.chinapayserialno;
	}
	
	/**
	 * 理财平台流水号,宜投使用
	 */
	public void setChinapayserialno(String value)
	 {
		this.chinapayserialno = value;
	}
	
	/**
	 * 是否按自然日查询,1：是，0：否（默认）。交易申请查询需要升级到9B
	 */
	public String getQuerynaturalday() {
		return this.querynaturalday;
	}
	
	/**
	 * 是否按自然日查询,1：是，0：否（默认）。交易申请查询需要升级到9B
	 */
	public void setQuerynaturalday(String value)
	 {
		this.querynaturalday = value;
	}
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	public String getPromotion() {
		return this.promotion;
	}
	
	/**
	 * 活动代码,若要使用该条件，直销交易申请查询服务需要升级到9A号
	 */
	public void setPromotion(String value)
	 {
		this.promotion = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("applyrecordno", this.formatInteger(this.applyrecordno));
		inputMap.put("custtype", this.custtype);
		inputMap.put("identityno", this.identityno);
		inputMap.put("identitytype", this.identitytype);
		inputMap.put("busintype", this.busintype);
		inputMap.put("pageno", this.formatInteger(this.pageno));
		inputMap.put("querydeclarevaluavgr", this.querydeclarevaluavgr);
		inputMap.put("queryredeemtranflag", this.queryredeemtranflag);
		inputMap.put("fundtype", this.fundtype);
		inputMap.put("fundsubtype", this.fundsubtype);
		inputMap.put("chinapayserialno", this.chinapayserialno);
		inputMap.put("querynaturalday", this.querynaturalday);
		inputMap.put("promotion", this.promotion);
	}
}
