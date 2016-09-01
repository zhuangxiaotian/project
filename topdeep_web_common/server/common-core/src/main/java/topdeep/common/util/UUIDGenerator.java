package topdeep.common.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author shidewen
 * 
 */
@SuppressWarnings("restriction")
public class UUIDGenerator {
	public static final String PARENT_ID = "************************";
	public static final String SPECIAL_SITE_ID = "************************";

	/****
	 * 活取24位UUID
	 * 
	 * @return
	 */
	public static String getUUID24() {
		UUID uuid = UUID.randomUUID();
		String ret = Base64.encodeBase64String(asByteArray(uuid)).replace("+", "-").replace("/", "_").replace("=", ".");
		ret = ret.substring(1) + ret.substring(0, 1);
		return ret;
	}

	public static String getUUID32() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}

	public static String urlEncode(String id) {
		String result = "";
		try {
			result = URLEncoder.encode(id, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static byte[] asByteArray(UUID uuid) {

		long msb = uuid.getMostSignificantBits();
		long lsb = uuid.getLeastSignificantBits();
		byte[] buffer = new byte[16];

		for (int i = 0; i < 8; i++) {
			buffer[i] = (byte) (msb >>> 8 * (7 - i));
		}
		for (int i = 8; i < 16; i++) {
			buffer[i] = (byte) (lsb >>> 8 * (7 - i));
		}

		return buffer;

	}

}
