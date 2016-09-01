package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载字典，缓存和参数功能输入参数
 */
public class MSReloadAllInput extends topdeep.common.entity.manage.def.MSBaseInput {
	
	public MSReloadAllInput() {
		this.setZ_funcCode("c05");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c05Req";
	}
}
