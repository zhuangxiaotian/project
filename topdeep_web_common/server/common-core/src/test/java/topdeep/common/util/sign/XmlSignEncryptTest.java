package topdeep.common.util.sign;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.Test;
import org.w3c.dom.Document;

import topdeep.common.test.BaseTests;
import topdeep.common.util.AESUtil;
import topdeep.common.util.EncryptionUtil;

public class XmlSignEncryptTest extends BaseTests {

	@Value("#{application['xmlBasePath']?:''}")
	private String xmlBasePath;

	@Value("#{application['aesKey']?:''}")
	private String aesKey;

	@Test(enabled = true)
	public void buildXmlDoc() throws Exception {
		XmlBuildUtil.createXml(xmlBasePath + "config_test.xml");
	}

	@Test(enabled = true)
	public void sign() throws Exception {
		// String path = (new XmlSignTest()).getClass().getResource("config_test.xml").getFile();
		String path = xmlBasePath + "config_test.xml";
		System.out.println(path);
		Document doc = DocumentUtil.getDocFromFile(new File(path));
		PrivateKey priKey = KeyUtil.getMOCKPriKey();
		String resultXml = SignUtil.sign(doc, priKey, "Configs");
		System.out.println("签名后的结果是:" + resultXml);
		XmlBuildUtil.createXml(xmlBasePath + "config_test_sign.xml", doc);
	}

	@Test(enabled = true)
	public void verifySign() throws Exception {
		// String path = (new XmlSignTest()).getClass().getResource(xmlBasePath + "config_test_sign.xml").getFile();
		String path = xmlBasePath + "config_test_sign.xml";
		System.out.println(path);
		Document doc = DocumentUtil.getDocFromFile(new File(path));
		PublicKey pubKey = KeyUtil.getMOCKPubKey();
		System.out.println(doc.getTextContent());
		boolean isChecked = SignUtil.check(doc, pubKey);
		System.out.println("对xml签名后的结果进行验证签名是:" + isChecked);
	}

	@Test(enabled = true)
	public void encrypt() throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign.xml";
		String destFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		// PrivateKey priKey = KeyUtil.getMOCKPriKey();
		// System.out.println("key:" + new String(Base64Util.encode(priKey.getEncoded())));
		// String key = AESUtil.getSecretKey();
		// System.out.println("key:" + key);// VJ2/SxkNZuHT50hNx8HMXQ==
		AESUtil.encryptFile(aesKey, sourceFilePath, destFilePath);
	}

	@Test(enabled = true)
	public void decrypt() throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		String destFilePath = xmlBasePath + "config_test_sign_encrypt_decrypt.xml";
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		AESUtil.decryptFile(aesKey, sourceFilePath, destFilePath);
	}

	@Test(enabled = true)
	public void decryptAndVerifySign() throws Exception {
		String sourceFilePath = xmlBasePath + "config_test_sign_encrypt.xml";
		// String destFilePath = xmlBasePath + "config_test_sign_encrypt_decrypt.xml";
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		// AESUtil.decryptFile(key, sourceFilePath, destFilePath);
		byte[] bt = AESUtil.toByteArray(sourceFilePath);
		byte[] decryptBt = EncryptionUtil.Decrypt(bt, aesKey);
		System.out.println("*********************");
		ByteArrayInputStream bi = new ByteArrayInputStream(decryptBt);
		// ObjectInputStream oi = new ObjectInputStream(bi);
		// OutputStream output = new FileOutputStream((File)oi.readObject());
		// BufferedOutputStream bufferedOutput = new BufferedOutputStream(output);
		// bufferedOutput.write(decryptBt);

		Document doc = DocumentUtil.getDocFromInputStream(bi);
		PublicKey pubKey = KeyUtil.getMOCKPubKey();
		System.out.println(doc.getTextContent());
		boolean isChecked = SignUtil.check(doc, pubKey);
		System.out.println("对xml签名后的结果进行验证签名是:" + isChecked);
	}

	@Test(enabled = true)
	public void signAndEncrypt() throws Exception {
		String path = xmlBasePath + "config_test.xml";
		String path1 = xmlBasePath + "config_test_sign_encrypt.xml";
		System.out.println(path);
		Document doc = DocumentUtil.getDocFromFile(new File(path));
		PrivateKey priKey = KeyUtil.getMOCKPriKey();
		String resultXml = SignUtil.sign(doc, priKey, "Configs");
		System.out.println("签名后的结果是:" + resultXml);
		byte[] xml = resultXml.getBytes("UTF8");
		// String key = "VJ2/SxkNZuHT50hNx8HMXQ==";
		byte[] en = EncryptionUtil.Encrypt(xml, aesKey);

		BufferedOutputStream bos = null;
		FileOutputStream fos = null;
		File file = new File(path1);
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		file.createNewFile();
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		bos.write(en);
		bos.close();
		fos.close();
		// XmlBuildUtil.createXml(xmlBasePath + "config_test_sign_encrypt.xml", doc);
	}
}
