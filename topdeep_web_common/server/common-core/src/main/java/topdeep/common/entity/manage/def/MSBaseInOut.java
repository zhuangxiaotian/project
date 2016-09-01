/**
 * 
 */
package topdeep.common.entity.manage.def;

import java.text.DecimalFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
public class MSBaseInOut {

	protected Log logger = LogFactory.getLog(getClass());

	/**
	 * 版本号 version varchar(10) R 目前版本号：1.0.1
	 */
	private String version;

	/**
	 * 功能代码
	 */
	private String z_funcCode;

	/**
	 * 时间戳 timestamp char(14) R yyyyMMddhhmmss当前时间
	 */
	private String timestamp;

	/**
	 * 消息标识
	 */
	private String messageId;

	public String getCommand() {
		return "";
	}

	public void serializeToXml(Document doc, Element parent) {
		serializeXmlAttributeUseAttrbute(doc, parent, "id", getCommand());
		serializeXmlAttribute(doc, parent, "version", this.getVersion());
		serializeXmlAttribute(doc, parent, "timestamp", this.getTimestamp());
	}

	public Document getDocument() throws ParserConfigurationException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		// doc.setXmlStandalone(true);
		Element finance = doc.createElement("Finance");
		doc.appendChild(finance);
		Element message = doc.createElement("Message");
		finance.appendChild(message);
		message.setAttribute("id", getMessageId());
		String command = getCommand();
		logger.debug("output command>>>>>>:" + command);
		Element root = doc.createElement(command);
		message.appendChild(root);
		this.serializeToXml(doc, root);
		return doc;
	}

	public void parseDocument(Document doc, Element parent) {
		this.setVersion(parseAttribute(parent, "version"));
		this.setTimestamp(parseAttribute(parent, "timestamp"));
	}

	public void parseDocument(Document doc) {
		// 获得Command
		Element finance = doc.getDocumentElement();
		Element message = getFirstChildElement(finance);
		this.setMessageId(parseAttribute(message, "id"));
		Element root = getFirstChildElement(message);
		this.parseDocument(doc, root);
	}

	public static void serializeXmlAttribute(Document doc, Element parent, String attributeName, String attributeValue, int decimalLength) {
		serializeXmlAttribute(doc, parent, attributeName, attributeValue);
	}

	public static void serializeXmlAttribute(Document doc, Element parent, String attributeName, Double attributeValue, int decimalLength) {
		if (attributeValue == null)
			attributeValue = 0d;
		String decimalStr = "0000000000";
		DecimalFormat df = new DecimalFormat("#." + decimalStr.substring(0, decimalLength));
		serializeXmlAttribute(doc, parent, attributeName, df.format(attributeValue));
	}

	public static void serializeXmlAttribute(Document doc, Element parent, String attributeName, String attributeValue) {
		if (StringUtils.isNullOrEmpty(attributeName)) {
			return;
		}
		if (StringUtils.isNullOrEmpty(attributeValue)) {
			attributeValue = "";
		}
		Element attribute = doc.createElement(attributeName);
		Text attributeText = doc.createTextNode(attributeValue);
		attribute.appendChild(attributeText);
		parent.appendChild(attribute);
	}

	public static void serializeXmlAttributeUseAttrbute(Document doc, Element parent, String attributeName, String attributeValue) {
		if (StringUtils.isNullOrEmpty(attributeName)) {
			return;
		}
		if (StringUtils.isNullOrEmpty(attributeValue)) {
			attributeValue = "";
		}
		parent.setAttribute(attributeName, attributeValue);
	}

	public static Element getFirstChildElement(Element parent, String tagName) {
		NodeList childList = parent.getElementsByTagName(tagName);
		if (childList.getLength() > 0) {
			return (Element) childList.item(0);
		}
		return null;
	}

	public static Element getFirstChildElement(Element parent) {
		NodeList childList = parent.getChildNodes();
		for (int i = 0; i < childList.getLength(); i++) {
			if (childList.item(i).getNodeType() == Node.ELEMENT_NODE) {
				return (Element) childList.item(i);
			}
		}
		return null;
	}

	public static String parseAttribute(Element parent, String attributeName) {
		if (!StringUtils.isNullOrEmpty(parent.getAttribute(attributeName))) {
			return parent.getAttribute(attributeName);
		} else {
			// 考虑子节点
			// NodeList childList = parent.getElementsByTagName(attributeName);
			NodeList childList1 = parent.getChildNodes();
			for (int i = 0; i < childList1.getLength(); i++) {
				if (childList1.item(i).getNodeType() == Node.ELEMENT_NODE) {
					Node node = (Node) childList1.item(i);
					if (node.getNodeName() != null && node.getNodeName().equals(attributeName)) {
						if (node.getFirstChild() != null) {
							return node.getFirstChild().getNodeValue();
						}
					}
				}
			}
			// if (childList.getLength() > 0) {
			// Element element = (Element) childList.item(0);
			// if (element.getChildNodes().getLength() > 0) {
			// Node node = element.getChildNodes().item(0);
			// return node.getNodeValue();
			// }
			// }
		}
		return "";
	}

	public static Integer parseIntegerAttribute(Element parent, String attributeName) {
		String value = parseAttribute(parent, attributeName);
		if (StringUtils.isNullOrEmpty(value)) {
			return 0;
		}
		return Integer.parseInt(value);
	}

	public static Double parseDoubleAttribute(Element parent, String attributeName) {
		String value = parseAttribute(parent, attributeName);
		if (StringUtils.isNullOrEmpty(value)) {
			return 0.0;
		}
		return Double.parseDouble(value);
	}

	/***
	 * 从请求文档中获取业务简写名称
	 * 
	 * @param doc
	 * @return
	 */
	public static String parseDocForBussinessName(Document doc) {
		Element root = doc.getDocumentElement();
		Element messageNode = MSBaseInOut.getFirstChildElement(root);
		Element firstChild = MSBaseInOut.getFirstChildElement(messageNode);
		String reqTagName = firstChild.getTagName();
		return reqTagName;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the z_funcCode
	 */
	public String getZ_funcCode() {
		return z_funcCode;
	}

	/**
	 * @param z_funcCode the z_funcCode to set
	 */
	public void setZ_funcCode(String z_funcCode) {
		this.z_funcCode = z_funcCode;
	}

	/**
	 * @return the messageId
	 */
	public String getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

}
