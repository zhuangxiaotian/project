package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 消息内容功能输出参数
 */
public class ISInfomationContentOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	/**
	 * 消息内容,
	 */
	private String informationContent;
	
	public ISInfomationContentOutput() {
		this.setZ_funcCode("u1G");
	}
	
	/**
	 * 消息内容,
	 */
	public String getInformationContent() {
		return this.informationContent;
	}
	
	/**
	 * 消息内容,
	 */
	public void setInformationContent(String value)
	 {
		this.informationContent = value;
	}
}
