package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 推荐人信息查询(S079)功能输出明细参数
 */
public class S079OutputDetail extends Object implements Serializable {
	
	/**
	 * 基金代码,
	 */
	private String fundcode = "";
	
	/**
	 * 推荐人,
	 */
	private String recommender = "";
	
	/**
	 * 推荐人备注,
	 */
	private String recommenderdetail = "";
	
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
	 * 推荐人,
	 */
	public String getRecommender() {
		return this.recommender;
	}
	
	/**
	 * 推荐人,
	 */
	public void setRecommender(String value)
	 {
		this.recommender = value;
	}
	
	/**
	 * 推荐人备注,
	 */
	public String getRecommenderdetail() {
		return this.recommenderdetail;
	}
	
	/**
	 * 推荐人备注,
	 */
	public void setRecommenderdetail(String value)
	 {
		this.recommenderdetail = value;
	}
}
