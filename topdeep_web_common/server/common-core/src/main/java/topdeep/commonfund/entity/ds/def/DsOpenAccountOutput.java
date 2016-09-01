package topdeep.commonfund.entity.ds.def;
import java.io.Serializable;
import java.util.*;
/**
 * 开户功能输出参数
 */
public class DsOpenAccountOutput extends topdeep.commonfund.entity.ds.def.DsBaseOutput implements Serializable {
	
	/**
	 * 申请编号,
	 */
	private String applicationNo;
	
	/**
	 * 开户返回的基金账号，可为空,
	 */
	private String fundAccount;
	
	public DsOpenAccountOutput() {
		this.setZ_funcCode("u02");
	}
	
	/**
	 * 申请编号,
	 */
	public String getApplicationNo() {
		return this.applicationNo;
	}
	
	/**
	 * 申请编号,
	 */
	public void setApplicationNo(String value)
	 {
		this.applicationNo = value;
	}
	
	/**
	 * 开户返回的基金账号，可为空,
	 */
	public String getFundAccount() {
		return this.fundAccount;
	}
	
	/**
	 * 开户返回的基金账号，可为空,
	 */
	public void setFundAccount(String value)
	 {
		this.fundAccount = value;
	}
}
