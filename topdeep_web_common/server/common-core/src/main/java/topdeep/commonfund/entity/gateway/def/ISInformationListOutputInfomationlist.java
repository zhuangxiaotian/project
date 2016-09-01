package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 消息列表功能输出明细参数
 */
public class ISInformationListOutputInfomationlist extends Object implements Serializable {
	
	/**
	 * 消息标识,
	 */
	private String infomationId;
	
	/**
	 * 消息标题,
	 */
	private String informationTitle;
	
	/**
	 * 消息创建时间,
	 */
	private String date;
	
	/**
	 * 消息标识,
	 */
	public String getInfomationId() {
		return this.infomationId;
	}
	
	/**
	 * 消息标识,
	 */
	public void setInfomationId(String value)
	 {
		this.infomationId = value;
	}
	
	/**
	 * 消息标题,
	 */
	public String getInformationTitle() {
		return this.informationTitle;
	}
	
	/**
	 * 消息标题,
	 */
	public void setInformationTitle(String value)
	 {
		this.informationTitle = value;
	}
	
	/**
	 * 消息创建时间,
	 */
	public String getDate() {
		return this.date;
	}
	
	/**
	 * 消息创建时间,
	 */
	public void setDate(String value)
	 {
		this.date = value;
	}
}
