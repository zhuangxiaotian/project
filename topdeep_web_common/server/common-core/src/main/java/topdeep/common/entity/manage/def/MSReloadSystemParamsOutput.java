package topdeep.common.entity.manage.def;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载参数功能输出参数
 */
public class MSReloadSystemParamsOutput extends topdeep.common.entity.manage.def.MSBaseOutput {
	
	public MSReloadSystemParamsOutput() {
		this.setZ_funcCode("c01");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c01Resp";
	}
}
