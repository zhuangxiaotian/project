package topdeep.common.entity.manage.def;

import java.io.Serializable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 调用公共包功能输出参数
 */
public class MSBaseOutput extends MSBaseInOut implements Serializable {

	/**
	 * 成功标志,0000-成功；首位：1-系统级错误；2-应用级错误；3-业务逻辑错误（下同）
	 */
	private String code;

	/**
	 * 错误原因,
	 */
	private String msg;

	public MSBaseOutput() {
		this.setZ_funcCode("b00");
	}

	public void serializeToXml(Document doc, Element parent) {
		super.serializeToXml(doc, parent);
		serializeXmlAttribute(doc, parent, "code", this.code);
		serializeXmlAttribute(doc, parent, "msg", this.msg);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sinvo.fund.entity.btb.def.BSBaseInOut#parseDocument(org.w3c.dom.Document, org.w3c.dom.Element)
	 */
	@Override
	public void parseDocument(Document doc, Element parent) {
		super.parseDocument(doc, parent);
		this.code = MSBaseInOut.parseAttribute(parent, "code");
		this.msg = MSBaseInOut.parseAttribute(parent, "msg");
	}

	public boolean isSuccess() {
		return "0000".equals(code);
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
