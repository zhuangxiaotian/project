package topdeep.common.entity.manage.def;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 调用公共包功能输入参数
 */
public class MSBaseInput extends MSBaseInOut {

	/**
	 * 服务器调用地址
	 */
	private String serverUrl;

	public MSBaseInput() {
	}

	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
	}

	/**
	 * @return the serverUrl
	 */
	public String getServerUrl() {
		return serverUrl;
	}

	/**
	 * @param serverUrl the serverUrl to set
	 */
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

}
