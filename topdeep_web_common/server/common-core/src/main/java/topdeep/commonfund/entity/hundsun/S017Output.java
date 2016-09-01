package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 基金收益率查询(S017)
 */
public class S017Output extends HundsunBaseOutput implements Serializable {
	
	/**
	 * 起始日期,
	 */
	private String begindate = "";
	
	/**
	 * 3年增长率,
	 */
	private String threeyearinc = "";
	
	/**
	 * 2年增长率,
	 */
	private String twoyearinc = "";
	
	/**
	 * 年增长率,
	 */
	private String yearinc = "";
	
	private List<S017OutputDetail> detail = new ArrayList<S017OutputDetail>();
	
	/**
	 * 起始日期,
	 */
	public String getBegindate() {
		return this.begindate;
	}
	
	/**
	 * 起始日期,
	 */
	public void setBegindate(String value)
	 {
		this.begindate = value;
	}
	
	/**
	 * 3年增长率,
	 */
	public String getThreeyearinc() {
		return this.threeyearinc;
	}
	
	/**
	 * 3年增长率,
	 */
	public void setThreeyearinc(String value)
	 {
		this.threeyearinc = value;
	}
	
	/**
	 * 2年增长率,
	 */
	public String getTwoyearinc() {
		return this.twoyearinc;
	}
	
	/**
	 * 2年增长率,
	 */
	public void setTwoyearinc(String value)
	 {
		this.twoyearinc = value;
	}
	
	/**
	 * 年增长率,
	 */
	public String getYearinc() {
		return this.yearinc;
	}
	
	/**
	 * 年增长率,
	 */
	public void setYearinc(String value)
	 {
		this.yearinc = value;
	}
	
	public List<S017OutputDetail> getDetail() {
		return this.detail;
	}
	
}
