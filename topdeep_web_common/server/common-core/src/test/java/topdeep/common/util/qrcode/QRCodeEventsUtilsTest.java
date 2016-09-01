package topdeep.common.util.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Hashtable;

import javax.imageio.ImageIO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import topdeep.common.util.qrcode.QRCodeEventsUtils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;

public class QRCodeEventsUtilsTest {

	protected Log log = LogFactory.getLog(getClass());

	@Test
	public void createdQRCode() {
		try {
			String name = "rcode.png";
			Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
			hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
			// BarcodeFormat 为二维码类型
			BufferedImage input = QRCodeEventsUtils.createdQRCode("你好", 100, 100, hints, BarcodeFormat.QR_CODE);
			BufferedImage inputbig = new BufferedImage(256, 256, BufferedImage.TYPE_INT_BGR);
			inputbig.getGraphics().drawImage(input, 0, 0, 256, 256, null); // 画图

			ImageIO.write(inputbig, "png", new File("/home/develop/apollo/" + name));
		} catch (Exception ex) {
			log.error("生成二维码错误", ex);
		}
	}
}
