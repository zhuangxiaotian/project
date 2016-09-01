package topdeep.common.entity.manage.def;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
/**
 * 重新加载缓存功能输入参数
 */
public class MSReloadCacheInput extends topdeep.common.entity.manage.def.MSBaseInput {
	
	public MSReloadCacheInput() {
		this.setZ_funcCode("c02");
	}
	
	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}
	
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
	}
	
	public String getCommand() {
		return "c02Req";
	}
}
