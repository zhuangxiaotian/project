package topdeep.common.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

public class EncryptionUtilTest {

	private Log logger = LogFactory.getLog(getClass());

	@Test(enabled = false)
	public void DecryptStringString() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void DecryptStringbyte() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void DecryptbyteString() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void Decryptbytebyte() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = true)
	public void EncryptStringString() throws Exception {
		String[] srcArray = new String[] {
				"Hcdjpaq9buQ4iqhuet7M4g==", "XzXE+UP0sE5kuDpqs4SRAw==", "l6/Kyly8+dnaH1SpYevjtw=="
		};
		for (String item : srcArray) {
			String ret = EncryptionUtil.Encrypt(item, "fClifoV/w6hwa7m1wOJ7LA==");
			logger.debug(item + "=[" + ret + "]");
		}

		String value = EncryptionUtil.Decrypt("kZ1Yk0n3G7KhFbdolDUwAgTF8YGtyOskUWVdJPpEN7s=", "N2dPRntu+YxAnXl1cPInAw==");
		logger.debug("=" + value);
	}

	@Test(enabled = false)
	public void EncryptStringbyte() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void EncryptbyteString() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void Encryptbytebyte() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(enabled = false)
	public void generateAESKey() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void generateAESKeyStr() throws Exception {
		String key = EncryptionUtil.generateAESKeyStr(128);
		logger.debug("key=[" + key + "]");
		key = EncryptionUtil.generateAESKeyStr(128);
		logger.debug("key=[" + key + "]");
		key = EncryptionUtil.generateAESKeyStr(128);
		logger.debug("key=[" + key + "]");
		key = EncryptionUtil.generateAESKeyStr(128);
		logger.debug("key=[" + key + "]");
		assert (key != null) : "生成密钥失败";
	}
}
