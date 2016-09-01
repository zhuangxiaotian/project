/**
 * 
 */
package topdeep.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.w3c.dom.Document;

import topdeep.common.util.sign.DocumentUtil;


/**
 * @author niexin
 *
 */
public class CommonUtils {
	/**
	 * 压缩字符串为 byte[] 保存为字符串
	 * 
	 * @param str 压缩前的文本
	 * @return
	 */
	public static final byte[] compress(String str) {
		if (str == null)
			return null;

		byte[] compressed;
		ByteArrayOutputStream out = null;
		OutputStream zout = null;

		try {
			out = new ByteArrayOutputStream();
			zout = new GZIPOutputStream(out);
			zout.write(str.getBytes("utf-8"));
			zout.close();
			compressed = out.toByteArray();
		} catch (IOException e) {
			compressed = null;
		} finally {
			if (zout != null) {
				try {
					zout.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}

		return compressed;
	}

	/**
	 * 将压缩后的 byte[] 数据解压缩
	 * 
	 * @param compressed 压缩后的 byte[] 数据
	 * @return 解压后的字符串
	 */
	public static final String decompress(byte[] compressed) {
		if (compressed == null)
			return null;

		ByteArrayOutputStream out = null;
		ByteArrayInputStream in = null;
		GZIPInputStream zin = null;
		String decompressed;
		try {
			out = new ByteArrayOutputStream();
			in = new ByteArrayInputStream(compressed);
			zin = new GZIPInputStream(in);
			// ZipEntry entry = zin.getNextEntry();
			byte[] buffer = new byte[1024];
			int offset = -1;
			while ((offset = zin.read(buffer)) != -1) {
				out.write(buffer, 0, offset);
			}
			decompressed = out.toString("utf-8");
		} catch (IOException e) {
			decompressed = null;
		} finally {
			if (zin != null) {
				try {
					zin.close();
				} catch (IOException e) {
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}

		return decompressed;
	}

	public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
		if (key == null) {
			throw new Exception("加密Key为空");
		}
		SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");// "算法/模式/补码方式"
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(src);
		return encrypted;
	}

	public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
		// 判断Key是否正确
		if (key == null) {
			throw new Exception("加密Key为空");
		}
		SecretKeySpec skeySpec = new SecretKeySpec(key, "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		byte[] original = cipher.doFinal(src);
		return original;
	}

	public static Document inputToDocument(byte[] inputData, byte[] key) throws Exception {
		byte[] data1 = CommonUtils.decrypt(inputData, key);
		String data2 = CommonUtils.decompress(data1);
		return DocumentUtil.getDocFromString(data2);
	}

	public static byte[] documentToOutput(String inputData, byte[] key) throws Exception {
		byte[] data1 = CommonUtils.compress(inputData);
		byte[] data2 = CommonUtils.encrypt(data1, key);
		return data2;
	}

	public static Document getDocument(Document doc) throws Exception {
		String docStr = DocumentUtil.docToString(doc);
		return DocumentUtil.getDocFromString(docStr);
	}

	/**
	 * 根据密钥加密字符串
	 * 
	 * @param keybyte
	 * @param src
	 * @return
	 */
	public static byte[] encryptDes(byte[] keybyte, byte[] src) {
		try { // 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, "DES"); // 加密
			Cipher c1 = Cipher.getInstance("DES");
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	/**
	 * 根据密钥解密字符串
	 * 
	 * @param keybyte
	 * @param src
	 * @return
	 */
	public static byte[] decryptDes(byte[] keybyte, byte[] src) {
		try { // 生成密钥
			SecretKey deskey = new SecretKeySpec(keybyte, "DES"); // 解密
			Cipher c1 = Cipher.getInstance("DES");
			c1.init(Cipher.DECRYPT_MODE, deskey);
			return c1.doFinal(src);
		} catch (java.security.NoSuchAlgorithmException e1) {
			e1.printStackTrace();
		} catch (javax.crypto.NoSuchPaddingException e2) {
			e2.printStackTrace();
		} catch (java.lang.Exception e3) {
			e3.printStackTrace();
		}
		return null;
	}

	public static char hexDigits[] = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
	};

	/**
	 * 
	 * @param s
	 * @return
	 */
	public final static String enMD5(String s) {

		try {
			byte[] btInput = s.getBytes("UTF-8");
			// 获得MD5摘要算法的 MessageDigest 对象
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			// 使用指定的字节更新摘要
			mdInst.update(btInput);
			// 获得密文
			byte[] md = mdInst.digest();
			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 对byte类型的数组进行MD5加密
	 * 
	 * @throws NoSuchAlgorithmException
	 */
	public static String getMD5String(byte[] bytes) throws NoSuchAlgorithmException {
		MessageDigest mdInst = MessageDigest.getInstance("MD5");
		mdInst.update(bytes);
		return bufferToHex(mdInst.digest());
	}

	private static String bufferToHex(byte bytes[]) {
		return bufferToHex(bytes, 0, bytes.length);
	}

	private static String bufferToHex(byte bytes[], int m, int n) {
		StringBuffer stringbuffer = new StringBuffer(2 * n);
		int k = m + n;
		for (int l = m; l < k; l++) {
			char c0 = hexDigits[(bytes[l] & 0xf0) >> 4];
			char c1 = hexDigits[bytes[l] & 0xf];
			stringbuffer.append(c0);
			stringbuffer.append(c1);
		}
		return stringbuffer.toString();
	}

	/**
	 * 
	 *
	 * @Description: 校验身份证合法性
	 * @param @param idNo 身份证号
	 * @param @return true:合法，false:非法
	 * @throws
	 */
	public static boolean checkIdCardValid(String idNo) {
		if (idNo.length() != 15 && idNo.length() != 18) { // 长度校验
			return false;
		}
		String reg = "^\\d{15}|\\d{17}([0-9]|X|x)$"; // 身份证合法性校验正则表达式
		if (!idNo.matches(reg)) { // 身份证合法性校验
			return false;
		}
		// 出生年月日
		String birthday = "";
		String year = "";
		String month = "";
		String day = "";
		if (15 == idNo.length()) { // 15位身份证校验
			birthday = idNo.substring(6, 12);
			year = idNo.substring(6, 8);
			month = idNo.substring(8, 10);
			day = idNo.substring(10, 12);
			return checkIdCardBirth(birthday, year, month, day);
		}

		birthday = idNo.substring(6, 14);
		year = idNo.substring(6, 10);
		month = idNo.substring(10, 12);
		day = idNo.substring(12, 14);

		return checkIdCardBirth(birthday, year, month, day) && check18CardValid(idNo);
	}

	/**
	 * 
	 *
	 * @Description: 校验生日
	 * @param @param birthday 生日
	 * @param @param year 年份
	 * @param @param month 月份
	 * @param @param day 日期
	 * @param @return
	 * @throws
	 */
	private static boolean checkIdCardBirth(String birthday, String year, String month, String day) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = format.parse(birthday);
		} catch (ParseException e) {
			return false; // 日期不合法
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int monthOfYear = calendar.get(Calendar.MONTH) + 1; // calendar月份是从0开始，故需要+1
		int birthYear = calendar.get(Calendar.YEAR);

		return birthYear == Integer.parseInt(year) && monthOfYear == Integer.parseInt(month) && dayOfMonth == Integer.parseInt(day);
	}

	/**
	 * 
	 *
	 * @Description: 18位身份证准确性校验
	 * @param @param idNo 身份证号
	 * @param @return true:校验成功,false:校验失败
	 * @throws
	 */
	private static boolean check18CardValid(String idNo) {

		int[] Wi = {
				7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1
		};// 加权因子
		int[] ValideCode = {
				1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2
		};// 身份证验证位值.10代表X
		int sum = 0; // 声明加权求和变量
		String lastChar = idNo.substring(17, 18);
		if (lastChar.toLowerCase().equals("x")) {
			lastChar = "10";// 将最后位为x的验证码替换为10方便后续操作
		}
		for (int i = 0; i < 17; i++) {
			sum += Wi[i] * Integer.parseInt(idNo.charAt(i) + "");
		}
		int valCodePosition = sum % 11;// 得到验证码所位置
		return Integer.parseInt(lastChar) == ValideCode[valCodePosition];
	}

	public static void main(String[] args) throws Exception {
		String string = "是打算打算";
		String a = new String(compress(string));
		System.out.println(compress(string));

		System.out.println(decompress(compress(string)));

		System.out.println(enMD5("050037"));
	}

}
