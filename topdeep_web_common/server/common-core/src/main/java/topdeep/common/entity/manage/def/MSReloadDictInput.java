package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载数据字典功能输入参数
 */
public class MSReloadDictInput extends topdeep.common.entity.manage.def.MSBaseInput {
	
	public MSReloadDictInput() {
		this.setZ_funcCode("c04");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c04Req";
	}
}
