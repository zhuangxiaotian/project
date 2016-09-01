package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载参数功能输入参数
 */
public class MSReloadSystemParamsInput extends topdeep.common.entity.manage.def.MSBaseInput {
	
	public MSReloadSystemParamsInput() {
		this.setZ_funcCode("c01");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c01Req";
	}
}
