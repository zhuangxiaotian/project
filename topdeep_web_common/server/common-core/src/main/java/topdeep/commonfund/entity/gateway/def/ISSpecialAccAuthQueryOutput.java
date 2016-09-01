package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 获取专户用户授权信息功能输出参数
 */
public class ISSpecialAccAuthQueryOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 专网网上交易约定书,0:未签署;1:已签署
	 */
	private String authorizeflag;
	
	/**
	 * 专户资质有效期,99991231:无限期
	 */
	private String qualificationenddate;
	
	/**
	 * 专户资质确认标志,0:未确认;1:已确认
	 */
	private String qualificationflag;
	
	public ISSpecialAccAuthQueryOutput() {
		this.setZ_funcCode("u0x");
	}
	
	/**
	 * 专网网上交易约定书,0:未签署;1:已签署
	 */
	public String getAuthorizeflag() {
		return this.authorizeflag;
	}
	
	/**
	 * 专网网上交易约定书,0:未签署;1:已签署
	 */
	public void setAuthorizeflag(String value)
	 {
		this.authorizeflag = value;
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
}
