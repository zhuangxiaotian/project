package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 短期理财明细查询功能输入参数
 */
public class ISShortMoneyDetailQueryInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 证件号码,
	 */
	private String idno;
	
	/**
	 * 证件类型,
	 */
	private String idtype;
	
	/**
	 * 查询方式,
	 */
	private String querytype;
	
	public ISShortMoneyDetailQueryInput() {
		this.setZ_funcCode("u1g");
	}
	
	/**
	 * 证件号码,
	 */
	public String getIdno() {
		return this.idno;
	}
	
	/**
	 * 证件号码,
	 */
	public void setIdno(String value)
	 {
		this.idno = value;
	}
	
	/**
	 * 证件类型,
	 */
	public String getIdtype() {
		return this.idtype;
	}
	
	/**
	 * 证件类型,
	 */
	public void setIdtype(String value)
	 {
		this.idtype = value;
	}
	
	/**
	 * 查询方式,
	 */
	public String getQuerytype() {
		return this.querytype;
	}
	
	/**
	 * 查询方式,
	 */
	public void setQuerytype(String value)
	 {
		this.querytype = value;
	}
}
