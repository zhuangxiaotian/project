package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 绑定关系解除功能输出参数
 */
public class MSUnbindCustomerOutput extends topdeep.common.entity.manage.def.MSBaseOutput {
	
	public MSUnbindCustomerOutput() {
		this.setZ_funcCode("c03");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c03Resp";
	}
}
