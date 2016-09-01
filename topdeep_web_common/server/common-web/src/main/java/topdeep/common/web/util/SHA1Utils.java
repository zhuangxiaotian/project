package topdeep.common.web.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import common.util.StringUtils;

public class SHA1Utils {

	private static String convertToHex(byte[] data) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			int halfbyte = (data[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = data[i] & 0x0F;
			} while (two_halfs++ < 1);
		}
		return buf.toString();
	}

	public static String calcSha1(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		if (StringUtils.isNullOrEmpty(data)) {
			return "";
		}
		return calcSha1(data.getBytes("utf-8"));
	}

	public static String calcSha1(byte[] data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md;
		md = MessageDigest.getInstance("SHA-1");
		md.update(data);
		return convertToHex(md.digest());
	}
}
