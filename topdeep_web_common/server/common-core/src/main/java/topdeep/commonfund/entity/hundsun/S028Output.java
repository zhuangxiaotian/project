package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 快速赎回统计信息查询(S028)
 */
public class S028Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 查询的开始时间,格式:yyyymmddhh24MMss
	 */
	private String begindate = "";
	
	/**
	 * 查询的客户编号,
	 */
	private String custno = "";
	
	/**
	 * 查询的结束时间,格式:yyyymmddhh24MMss
	 */
	private String enddate = "";
	
	/**
	 * 总份额,
	 */
	private String enshare = "";
	
	/**
	 * 当日快速赎回笔数上限,
	 */
	private String ftsinglesumlimit = "";
	
	/**
	 * 总笔数,
	 */
	private String reccnt = "";
	
	/**
	 * 当日快速赎回金额上限,
	 */
	private String singleredeemlimit = "";
	
	/**
	 * 查询的开始时间,格式:yyyymmddhh24MMss
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 查询的开始时间,格式:yyyymmddhh24MMss
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 查询的客户编号,
	 */
	public String getCustno() {
		return this.custno;
	}
	
	/**
	 * 查询的客户编号,
	 */
	public void setCustno(String value)
	 {
		this.custno = value;
	}
	
	/**
	 * 查询的结束时间,格式:yyyymmddhh24MMss
	 */
	public String getEnddate() {
		return this.enddate;
	}
	
	/**
	 * 查询的结束时间,格式:yyyymmddhh24MMss
	 */
	public void setEnddate(String value)
	 {
		this.enddate = value;
	}
	
	/**
	 * 总份额,
	 */
	public String getEnshare() {
		return this.enshare;
	}
	
	/**
	 * 总份额,
	 */
	public void setEnshare(String value)
	 {
		this.enshare = value;
	}
	
	/**
	 * 当日快速赎回笔数上限,
	 */
	public String getFtsinglesumlimit() {
		return this.ftsinglesumlimit;
	}
	
	/**
	 * 当日快速赎回笔数上限,
	 */
	public void setFtsinglesumlimit(String value)
	 {
		this.ftsinglesumlimit = value;
	}
	
	/**
	 * 总笔数,
	 */
	public String getReccnt() {
		return this.reccnt;
	}
	
	/**
	 * 总笔数,
	 */
	public void setReccnt(String value)
	 {
		this.reccnt = value;
	}
	
	/**
	 * 当日快速赎回金额上限,
	 */
	public String getSingleredeemlimit() {
		return this.singleredeemlimit;
	}
	
	/**
	 * 当日快速赎回金额上限,
	 */
	public void setSingleredeemlimit(String value)
	 {
		this.singleredeemlimit = value;
	}
}
