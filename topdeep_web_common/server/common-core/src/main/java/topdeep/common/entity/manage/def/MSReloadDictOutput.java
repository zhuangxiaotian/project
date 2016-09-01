package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载数据字典功能输出参数
 */
public class MSReloadDictOutput extends topdeep.common.entity.manage.def.MSBaseOutput {
	
	public MSReloadDictOutput() {
		this.setZ_funcCode("c04");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c04Resp";
	}
}
