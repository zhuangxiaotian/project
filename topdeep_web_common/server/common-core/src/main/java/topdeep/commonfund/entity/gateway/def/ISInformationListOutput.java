package topdeep.commonfund.entity.gateway.def;
import java.io.Serializable;
import java.util.*;
/**
 * 消息列表功能输出参数
 */
public class ISInformationListOutput extends topdeep.commonfund.entity.gateway.def.ISBaseOutput implements Serializable {
	
	private List<ISInformationListOutputInfomationlist> infomationlist = new ArrayList<ISInformationListOutputInfomationlist>();
	
	public ISInformationListOutput() {
		this.setZ_funcCode("u1F");
	}
	
	public List<ISInformationListOutputInfomationlist> getInfomationlist() {
		return this.infomationlist;
	}
	
}
