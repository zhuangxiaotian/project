package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS分类查询(S041)功能输出明细参数
 */
public class S041OutputDetail extends Object implements Serializable {
	
	/**
	 * 分类id,
	 */
	private String categoryid = "";
	
	/**
	 * 分类标题,
	 */
	private String titlle = "";
	
	/**
	 * 分类id,
	 */
	public String getCategoryid() {
		return this.categoryid;
	}
	
	/**
	 * 分类id,
	 */
	public void setCategoryid(String value)
	 {
		this.categoryid = value;
	}
	
	/**
	 * 分类标题,
	 */
	public String getTitlle() {
		return this.titlle;
	}
	
	/**
	 * 分类标题,
	 */
	public void setTitlle(String value)
	 {
		this.titlle = value;
	}
}
