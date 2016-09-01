package topdeep.common.entity.manage.def;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 绑定关系解除功能输入参数
 */
public class MSUnbindCustomerInput extends topdeep.common.entity.manage.def.MSBaseInput {

	/**
	 * 证件类型,
	 */
	private String idType;

	/**
	 * 证件号码,
	 */
	private String idNo;

	/**
	 * 绑定源,
	 */
	private String bindSrc;

	public MSUnbindCustomerInput() {
		this.setZ_funcCode("c03");
	}

	/**
	 * 证件类型,
	 */
	public String getIdType() {
		return this.idType;
	}

	/**
	 * 证件类型,
	 */
	public void setIdType(String value) {
		this.idType = value;
	}

	/**
	 * 证件号码,
	 */
	public String getIdNo() {
		return this.idNo;
	}

	/**
	 * 证件号码,
	 */
	public void setIdNo(String value) {
		this.idNo = value;
	}

	/**
	 * 绑定源,
	 */
	public String getBindSrc() {
		return this.bindSrc;
	}

	/**
	 * 绑定源,
	 */
	public void setBindSrc(String value) {
		this.bindSrc = value;
	}

	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
		MSBaseInOut.serializeXmlAttribute(doc, parent, "idType", this.idType);
		MSBaseInOut.serializeXmlAttribute(doc, parent, "idNo", this.idNo);
		MSBaseInOut.serializeXmlAttribute(doc, parent, "bindSrc", this.bindSrc);
	}

	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
		this.idType = MSBaseInOut.parseAttribute(parent, "idType");
		this.idNo = MSBaseInOut.parseAttribute(parent, "idNo");
		this.bindSrc = MSBaseInOut.parseAttribute(parent, "bindSrc");
	}

	public String getCommand() {
		return "c03Req";
	}
}
