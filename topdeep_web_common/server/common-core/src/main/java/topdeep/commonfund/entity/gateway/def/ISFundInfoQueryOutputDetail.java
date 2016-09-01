package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 基金基本信息功能输出明细参数
 */
public class ISFundInfoQueryOutputDetail extends Object implements Serializable {
	
	/**
	 * 基金经理Id,
	 */
	private String manageId;
	
	/**
	 * 基金经理名称,
	 */
	private String name;
	
	/**
	 * 个人简介,
	 */
	private String synosis;
	
	/**
	 * 照片路径,
	 */
	private String photo;
	
	/**
	 * 基金经理Id,
	 */
	public String getManageId() {
		return this.manageId;
	}
	
	/**
	 * 基金经理Id,
	 */
	public void setManageId(String value)
	 {
		this.manageId = value;
	}
	
	/**
	 * 基金经理名称,
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 基金经理名称,
	 */
	public void setName(String value)
	 {
		this.name = value;
	}
	
	/**
	 * 个人简介,
	 */
	public String getSynosis() {
		return this.synosis;
	}
	
	/**
	 * 个人简介,
	 */
	public void setSynosis(String value)
	 {
		this.synosis = value;
	}
	
	/**
	 * 照片路径,
	 */
	public String getPhoto() {
		return this.photo;
	}
	
	/**
	 * 照片路径,
	 */
	public void setPhoto(String value)
	 {
		this.photo = value;
	}
}
