package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 消息内容功能输入参数
 */
public class ISInfomationContentInput extends topdeep.commonfund.entity.gateway.def.ISBaseInput {
	
	/**
	 * 消息标识,
	 */
	private String informationId;
	
	public ISInfomationContentInput() {
		this.setZ_funcCode("u1G");
	}
	
	/**
	 * 消息标识,
	 */
	public String getInformationId() {
		return this.informationId;
	}
	
	/**
	 * 消息标识,
	 */
	public void setInformationId(String value)
	 {
		this.informationId = value;
	}
}
