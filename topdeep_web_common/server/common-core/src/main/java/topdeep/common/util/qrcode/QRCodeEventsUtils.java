package topdeep.common.util.qrcode;

import java.awt.image.BufferedImage;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class QRCodeEventsUtils {

	/*
	 * @param hints 可存放如下数据
	 * 
	 * 1. 指定使用误差修正到什么程度，例如在QR码。
	 * 
	 * 类型取决于编码器。例如对QR码的类型
	 * 
	 * {@链接com.google.zxing.qrcode.decoder.errorcorrectionlevel errorcorrectionlevel }。
	 * 
	 * 阿兹特克是型{@链接整数}，代表词的最小百分比误差校正。
	 * 
	 * 注：阿兹特克符号应该至少有25% EC的话。
	 * 
	 * /
	 * 
	 * error_correction，
	 * 
	 * / * *
	 * 
	 * 2. 指定字符编码使用适用（型{@链接字符串}）
	 * 
	 * /
	 * 
	 * character_set，
	 * 
	 * / * *
	 * 
	 * 3. 指定数据矩阵的矩阵形（型{@链接网站。谷歌。ZXing。方形。编码器。symbolshapehint }）
	 * 
	 * /
	 * 
	 * data_matrix_shape，
	 * 
	 * / * *
	 * 
	 * 4. 指定一个最小码的大小（型{@链接维度}）。现在只适用于数据矩阵。
	 * 
	 * /
	 * 
	 * min_size，
	 * 
	 * / * *
	 * 
	 * 5. 指定最大大小（条码型{@链接维度}）。现在只适用于数据矩阵。
	 * 
	 * /
	 * 
	 * max_size，
	 * 
	 * / * *
	 * 
	 * 6. 指定边缘像素，使用时生成的条码。可以改变的意义
	 * 
	 * 格式；例如它控制之前和横向的条码后边缘
	 * 
	 * 大多数1D格式。（型{@链接整数}）。
	 * 
	 * /
	 * 
	 * 缘，
	 * 
	 * / * *
	 * 
	 * 7. 指定是否使用紧凑模式的PDF417（型{@链接布尔}）。
	 * 
	 * /
	 * 
	 * pdf417_compact，
	 * 
	 * / * *
	 * 
	 * 8. 指定使用什么类型的压实方式（PDF417
	 * 
	 * {@链接com.google.zxing.pdf417.encoder.compaction压实}）。
	 * 
	 * /
	 * 
	 * pdf417_compaction，
	 * 
	 * / * *
	 * 
	 * 9. 指定最小和最大的PDF417行数和列数（型
	 * 
	 * {@链接com.google.zxing.pdf417.encoder.dimensions尺寸}）。
	 * 
	 * /
	 * 
	 * pdf417_dimensions，
	 * 
	 * / * *
	 * 
	 * 10. 指定阿兹特克代码所需的层数：
	 * 
	 * 一个负数（- 1、- 2、- 3、- 4）指定了一个紧凑的阿兹特克代码
	 * 
	 * 0表示使用最小数目的层（默认）
	 * 
	 * 一个正数（1，2，..32）指定了一个正常人（非压缩）阿兹特克代码
	 * 
	 * /
	 * 
	 * aztec_layers，
	 * 
	 * 
	 */

	/*
	 * @param format 为二维码格式 一般为有: QR_CODE 二维码 , PDF_417 条码格式
	 * 
	 * Aztec 2D barcode format. AZTEC,
	 *//** CODABAR 1D format. *//*
	
	 * CODABAR,
	 *//** Code 39 1D format. *//*
	
	 * CODE_39,
	 *//** Code 93 1D format. *//*
	
	 * CODE_93,
	 *//** Code 128 1D format. *//*
	
	 * CODE_128,
	 *//** Data Matrix 2D barcode format. *//*
	
	 * DATA_MATRIX,13,
	 *//** ITF (Interleaved Two of Five) 1D format. *//*
	
	 * ITF,
	 *//** MaxiCode 2D barcode format. *//*
	
	 * MAXICODE,
	 *//** PDF417 format. *//*
	
	 * PDF_417,
	 *//** QR Code 2D barcode format. *//*
	
	 * QR_CODE,
	 *//** RSS 14 *//*
	
	 * RSS_14,
	 *//** RSS EXPANDED *//*
	
	 * RSS_EXPANDED,
	 *//** UPC-A 1D format. *//*
	
	 * UPC_A,
	 *//** UPC-E 1D format. *//*
	
	 * UPC_E,
	 *//** UPC/EAN extension format. Not a stand-alone format. */
	/*
	 * 
	 * UPC_EAN_EXTENSION
	 * 
	 * public
	 *//**
	 * EAN-8 1D format.
	 * 
	 * EAN_8,
	 *//** EAN-13 1D format. *//*
	
	 * EAN_13,
	 *//** ITF (Interleaved Two of Five) 1D format. *//*
	
	 * ITF,
	 *//** MaxiCode 2D barcode format. *//*
	
	 * MAXICODE,
	 *//** PDF417 format. *//*
	
	 * PDF_417,
	 *//** QR Code 2D barcode format. *//*
	
	 * QR_CODE,
	 *//** RSS 14 *//*
	
	 * RSS_14,
	 *//** RSS EXPANDED *//*
	
	 * RSS_EXPANDED,
	 *//** UPC-A 1D format. *//*
	
	 * UPC_A,
	 *//** UPC-E 1D format. *//*
	
	 * UPC_E,
	 *//** UPC/EAN extension format. Not a stand-alone format. *//*
	
	 * UPC_EAN_EXTENSION
	 */
	public static BufferedImage createdQRCode(String text, int width, int height, Hashtable<EncodeHintType, String> hints, BarcodeFormat format)
			throws WriterException {

		BitMatrix bitMatrix = new MultiFormatWriter().encode(text, format, width, height, hints);
		return MatrixToImageWriter.toBufferedImage(bitMatrix);
	}


}
