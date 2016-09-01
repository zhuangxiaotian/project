package topdeep.common.biz.common;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import topdeep.common.entity.params.CommonApplicationParam;
import topdeep.common.util.EncryptionUtil;
import topdeep.common.util.sign.DocumentUtil;
import topdeep.common.util.sign.KeyUtil;
import topdeep.common.util.sign.SignUtil;

@Service
public class TopdeepConfigManage implements InitializingBean {

	private Log logger = LogFactory.getLog(TopdeepConfigManage.class);

	private Set<Integer> privilegeSet = new HashSet<Integer>();
	private Set<String> funcSet = new HashSet<String>();

	@Autowired
	private CommonApplicationParam commonApplicationParam;

	private void init() throws Exception {
		String key = commonApplicationParam.getTopdeepConfigEncryptKey();
		String pubKeyPath = commonApplicationParam.getTopdeepConfigPubKeyPath();
		String xmlConfigPath = commonApplicationParam.getTopdeepConfigPath();

		Document doc = decryptAndCheckXml(xmlConfigPath, key, pubKeyPath);
		if (doc != null) {
			doc.getDocumentElement().normalize();

			Element finance = doc.getDocumentElement();
			Element message = getFirstChildElement(finance);
			Element configs = getFirstChildElement(message);
			Element privileges = getFirstChildElement(configs, "Privileges");
			if (privileges != null && privileges.getAttribute("id").equals("Privileges")) {
				NodeList privilegeNodeList = privileges.getChildNodes();
				readElement(privilegeNodeList, 1);
			}
			Element funcs = getFirstChildElement(configs, "FuncList");
			if (funcs != null && funcs.getAttribute("id").equals("FuncList")) {
				NodeList funcNodeList = funcs.getChildNodes();
				readElement(funcNodeList, 0);
			}
		}
	}

	/**
	 * dataType 0: func 1: privilege
	 * 
	 * @param nodeList
	 * @param dataType
	 */
	private void readElement(NodeList nodeList, int dataType) {

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node item = nodeList.item(i);
			NamedNodeMap attrs = item.getAttributes();
			if (attrs == null) {
				continue;
			}
			for (int j = 0; j < attrs.getLength(); j++) {
				Node n = attrs.item(j);
				if (n.getNodeName().equalsIgnoreCase("value")) {
					String value = n.getNodeValue();
					if (dataType == 0) {
						if (!funcSet.contains(value)) {
							funcSet.add(value);
						}
					} else if (dataType == 1) {
						int intValue = Integer.parseInt(value);
						if (!privilegeSet.contains(intValue)) {
							privilegeSet.add(intValue);
						}
					}
				}
			}
		}

	}

	private Element getFirstChildElement(Element parent, String tagName) {
		NodeList childList = parent.getElementsByTagName(tagName);
		if (childList.getLength() > 0) {
			return (Element) childList.item(0);
		}
		return null;
	}

	private Element getFirstChildElement(Element parent) {
		NodeList childList = parent.getChildNodes();
		for (int i = 0; i < childList.getLength(); i++) {
			if (childList.item(i).getNodeType() == Node.ELEMENT_NODE) {
				return (Element) childList.item(i);
			}
		}
		return null;
	}

	private Document decryptAndCheckXml(String filePath, String key, String pubkeyPath) throws Exception {
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		File file = new File(filePath);
		InputStream input = new FileInputStream(file);

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		byte[] buff = new byte[1024]; // buff用于存放循环读取的临时数据
		int rc = 0;
		while ((rc = input.read(buff, 0, 1024)) > 0) {
			outStream.write(buff, 0, rc);
		}

		input.close();
		byte[] bt = outStream.toByteArray(); // in_b为转换之后的结果

		byte[] decryptBt = EncryptionUtil.Decrypt(bt, key);
		ByteArrayInputStream bi = new ByteArrayInputStream(decryptBt);

		Document doc = DocumentUtil.getDocFromInputStream(bi);
		// PublicKey pubKey = KeyUtil
		// .getMOCKPubKey("/Users/shidewen/project/topdeep_web_common/server/common-core/src/main/java/topdeep/common/util/sign/mock.cer");
		PublicKey pubKey = KeyUtil.getMOCKPubKey(pubkeyPath);
		boolean isChecked = SignUtil.check(doc, pubKey);
		// System.out.println("对xml签名后的结果进行验证签名是:" + isChecked);
		if (isChecked) {
			logger.info("init Topdeep Config Success");
			return doc;
		}
		logger.info("init Topdeep Config null");
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
		init();
	}

	public boolean hasFunc(String funcNo) {
		return funcSet.contains(funcNo);
	}

	public boolean hasPrivilege(int privilegeValue) {
		return privilegeSet.contains(privilegeValue);
	}

}