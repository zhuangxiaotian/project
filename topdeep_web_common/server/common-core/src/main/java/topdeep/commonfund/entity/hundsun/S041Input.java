package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * CMS分类查询(S041)
 */
public class S041Input extends HundsunBaseInput implements Serializable {
	
	/**
	 * 分类id,
	 */
	private String categoryid = "";
	
	/**
	 * 分类名,0：向后（默认）；1：向前
	 */
	private String name = "";
	
	/**
	 * 站点id,
	 */
	private String siteid = "";
	
	/**
	 * 初始化参数
	 */
	public S041Input() {
		this.setFunction("S041");
		this.setChannel("1");
		this.setUsertype("p");
		this.setSignmode("md5");
		this.setVersion("v1.0");
		this.setFormat("json");
	}
	
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
	 * 分类名,0：向后（默认）；1：向前
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 分类名,0：向后（默认）；1：向前
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 站点id,
	 */
	public String getSiteid() {
		return this.siteid;
	}
	
	/**
	 * 站点id,
	 */
	public void setSiteid(String value)
	 {
		this.siteid = value;
	}
	
	public void serializeToMap(Map<String, String> inputMap) {
		super.serializeToMap(inputMap);
		inputMap.put("categoryid", this.categoryid);
		inputMap.put("name", this.name);
		inputMap.put("siteid", this.siteid);
	}
}
