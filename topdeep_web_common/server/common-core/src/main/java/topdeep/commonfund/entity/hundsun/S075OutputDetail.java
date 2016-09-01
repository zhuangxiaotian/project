package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 直销系统时间查询(S075)功能输出明细参数
 */
public class S075OutputDetail extends Object implements Serializable {
	
	/**
	 * 直销系统日期,yyyymmdd
	 */
	private String systemDate = "";
	
	/**
	 * 直销系统时间,yymmddhhmmss
	 */
	private String systemTime = "";
	
	/**
	 * 直销系统日期,yyyymmdd
	 */
	public String getSystemDate() {
		return this.systemDate;
	}
	
	/**
	 * 直销系统日期,yyyymmdd
	 */
	public void setSystemDate(String value)
	 {
		this.systemDate = value;
	}
	
	/**
	 * 直销系统时间,yymmddhhmmss
	 */
	public String getSystemTime() {
		return this.systemTime;
	}
	
	/**
	 * 直销系统时间,yymmddhhmmss
	 */
	public void setSystemTime(String value)
	 {
		this.systemTime = value;
	}
}
