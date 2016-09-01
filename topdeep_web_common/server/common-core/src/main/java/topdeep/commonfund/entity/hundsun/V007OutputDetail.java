package topdeep.commonfund.entity.hundsun;
import java.io.Serializable;
import java.util.*;
import common.util.param.PropertyAttribute;
/**
 * 定制服务查询(V007)功能输出明细参数
 */
public class V007OutputDetail extends Object implements Serializable {
	
	/**
	 * 服务频率,
	 */
	private String frequency = "";
	
	/**
	 * 发送方式,
	 */
	private String sendtype = "";
	
	/**
	 * 编码,
	 */
	private String taskcode = "";
	
	/**
	 * 名称,
	 */
	private String taskname = "";
	
	/**
	 * 是否可定制,1:定制;0:未定制
	 */
	private String currcanorder = "";
	
	/**
	 * 服务频率,
	 */
	public String getFrequency() {
		return this.frequency;
	}
	
	/**
	 * 服务频率,
	 */
	public void setFrequency(String value)
	 {
		this.frequency = value;
	}
	
	/**
	 * 发送方式,
	 */
	public String getSendtype() {
		return this.sendtype;
	}
	
	/**
	 * 发送方式,
	 */
	public void setSendtype(String value)
	 {
		this.sendtype = value;
	}
	
	/**
	 * 编码,
	 */
	public String getTaskcode() {
		return this.taskcode;
	}
	
	/**
	 * 编码,
	 */
	public void setTaskcode(String value)
	 {
		this.taskcode = value;
	}
	
	/**
	 * 名称,
	 */
	public String getTaskname() {
		return this.taskname;
	}
	
	/**
	 * 名称,
	 */
	public void setTaskname(String value)
	 {
		this.taskname = value;
	}
	
	/**
	 * 是否可定制,1:定制;0:未定制
	 */
	public String getCurrcanorder() {
		return this.currcanorder;
	}
	
	/**
	 * 是否可定制,1:定制;0:未定制
	 */
	public void setCurrcanorder(String value)
	 {
		this.currcanorder = value;
	}
}
