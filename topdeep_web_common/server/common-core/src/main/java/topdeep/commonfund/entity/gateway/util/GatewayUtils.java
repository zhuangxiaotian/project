/**
 * $Id$
 */
package topdeep.commonfund.entity.gateway.util;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
/**
 * @author niexin
 *
 */
public class GatewayUtils {

	private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(GatewayUtils.class);

	public static int getStringByteLen(String s) {
		if (s == null)
			s = "";
		try {
			return s.getBytes("utf-8").length;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s.length();
	}

	public static String buildString(Boolean inputValue, int len) {
		String str = "";
		if (inputValue != null) {
			if (inputValue) {
				str += "1";
			} else {
				str += "0";
			}
		}
		return buildString(str, len);
	}

	public static String buildString(java.util.Date inputDate, int len) {
		String str;
		if (len == 8) {
			str = StringUtils.dateTimeToString(inputDate, "yyyyMMdd");
		} else if (len == 14) {
			str = StringUtils.dateTimeToString(inputDate, "yyyyMMddHHmmss");
		} else {
			str = "";
		}
		return buildString(str, len);
	}

	public static String buildString(String inputStr, int len) {
		if (inputStr == null) {
			inputStr = "";
		}
		inputStr = inputStr.trim();
		if (getStringByteLen(inputStr) > len) {
			return inputStr.substring(0, len);
		} else {
			return inputStr + getSpaceString(len - getStringByteLen(inputStr));
		}
	}

	public static String buildLongString(String inputStr, int len) {
		if (inputStr == null) {
			inputStr = "";
		}
		String ret = "";
		ret += buildString(getStringByteLen(inputStr), len);
		ret += buildString(inputStr, getStringByteLen(inputStr));
		return ret;
	}

	public static void buildLongString(StringBuilder sb, String inputStr, int len) {
		if (inputStr == null) {
			inputStr = "";
		}
		int strLen = getStringByteLen(inputStr);
		int strLenLen = ("" + strLen).length();
		if (strLenLen > len) {
			log.warn("longString is too long to build for:" + inputStr);
			inputStr = "";
			strLen = 0;
		}
		sb.append(buildString(strLen, len));
		sb.append(buildString(inputStr, strLen));
	}

	public static void buildLongString(StringBuilder sb, int index, String inputStr, int len) {
		if (inputStr == null) {
			inputStr = "";
		}
		int strLen = getStringByteLen(inputStr);
		int strLenLen = ("" + strLen).length();
		if (strLenLen > len) {
			log.warn("longString is too long to build for:" + inputStr);
			inputStr = "";
			strLen = 0;
		}
		sb.insert(index, buildString(strLen, len));
		sb.insert(index + len, buildString(inputStr, strLen));
	}

	public static String buildString(int inputValue, int len) {
		String ret = "" + inputValue;
		if (ret.length() > len) {
			return ret.substring(ret.length() - len);
		}
		return getZeroString(len - ret.length()) + ret;
	}

	public static String buildString(Integer inputValue, int len) {
		if (inputValue == null) {
			return getZeroString(len);
		}
		return buildString(inputValue.intValue(), len);
	}

	/**
	 * @param inputValue
	 * @param len
	 * @param decimalLen
	 * @return
	 */
	public static String buildString(Double inputValue, int len, int decimalLen) {
		if (inputValue == null) {
			return getZeroString(len);
		}
		return buildDouble(inputValue.doubleValue(), len, decimalLen);
	}

	public static String buildDouble(double inputValue, int len, int decimalLen) {
		String ret = "" + new DecimalFormat(getZeroString(len - decimalLen) + "." + getZeroString(decimalLen)).format(inputValue);
		int k = ret.indexOf(".");
		String left = "";
		String right = "";
		if (k >= 0) {
			left = ret.substring(0, k);
			right = ret.substring(k + 1);
		} else {
			left = ret;
		}
		if (right.length() > decimalLen) {
			right = right.substring(0, decimalLen);
		}
		right += getZeroString(decimalLen - right.length());
		left += right;
		if (left.startsWith("-")) {
			left = left.substring(1);
			if (left.length() > len - 1) {
				left = left.substring(left.length() - len + 1);
			}
			left = "-" + getZeroString(len - 1 - left.length()) + left;
		} else {
			if (left.length() > len) {
				return left.substring(left.length() - len);
			}
			left = getZeroString(len - left.length()) + left;
		}

		return left;
	}

	private static String[] SPACE_STRING_ARY = new String[] {
			"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          "
	};

	public static String getSpaceString(int len) {
		if (len <= 10) {
			return SPACE_STRING_ARY[len];
		}
		String ret = SPACE_STRING_ARY[10];
		int i = len - 10;
		while (i > 10) {
			ret += SPACE_STRING_ARY[10];
			i -= 10;
		}
		ret += SPACE_STRING_ARY[i];
		return ret;
	}

	private static String[] ZERO_STRING_ARY = new String[] {
			"", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000", "0000000000"
	};
	private static String[] SHARP_STRING_ARY = new String[] {
			"", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000", "0000000000"
	};

	public static String getZeroString(int len) {
		if (len <= 10) {
			return ZERO_STRING_ARY[len];
		}
		String ret = ZERO_STRING_ARY[10];
		int i = len - 10;
		while (i > 10) {
			ret += ZERO_STRING_ARY[10];
			i -= 10;
		}
		ret += ZERO_STRING_ARY[i];
		return ret;
	}

	public static String getSharpString(int len) {
		if (len <= 10) {
			return SHARP_STRING_ARY[len];
		}
		String ret = SHARP_STRING_ARY[10];
		int i = len - 10;
		while (i > 10) {
			ret += SHARP_STRING_ARY[10];
			i -= 10;
		}
		ret += SHARP_STRING_ARY[i];
		return ret;
	}

	public static String readString(String inputStr, IndexData readIndex, int len) {
		String ret = "";
		if (inputStr == null)
			return ret;
		int slen = inputStr.length();
		if (slen >= readIndex.Index + len) {
			ret = inputStr.substring(readIndex.Index, readIndex.Index + len).trim();
		} else if (slen > readIndex.Index) {
			ret = inputStr.substring(readIndex.Index);
		}
		readIndex.Index += len;
		return ret;
	}

	public static Integer readInteger(String inputStr, IndexData readIndex, int len) {
		String ret = readString(inputStr, readIndex, len);
		return Integer.parseInt(ret);
	}

	public static Double readDouble(String inputStr, IndexData readIndex, int len, int decimalLen) {
		String ret = readString(inputStr, readIndex, len);
		String symbol = "";
		if (ret.indexOf("+") >= 0) {
			ret = ret.replace("+", "");
		}
		if (ret.indexOf("-") >= 0) {
			symbol = "-";
			ret = ret.replace("-", "");
		}
		String left = ret.substring(0, ret.length() - decimalLen);
		String right = ret.substring(ret.length() - decimalLen);
		ret = symbol + left + "." + right;
		return Double.parseDouble(ret);
	}

	public static Boolean readBoolean(byte[] inputBuf, IndexData readIndex, int len) {
		String str = readString(inputBuf, readIndex, len);
		if (StringUtils.isNullOrEmpty(str)) {
			return null;
		}
		str = str.trim();
		return "1".equals(str);
	}

	public static String readString(byte[] inputBuf, IndexData readIndex, int len) {
		String ret = "";
		if (inputBuf == null)
			return ret;
		int blen = inputBuf.length;
		try {
			if (blen >= readIndex.Index + len) {
				ret = new String(inputBuf, readIndex.Index, len, "utf-8").trim();
			} else if (blen > readIndex.Index) {
				ret = new String(inputBuf, readIndex.Index, blen - readIndex.Index, "utf-8").trim();
			}
		} catch (UnsupportedEncodingException ex) {
			log.error(ex.getMessage(), ex);
		}
		readIndex.Index += len;
		return ret;
	}

	public static Integer readInteger(byte[] inputBuf, IndexData readIndex, int len) {
		String ret = readString(inputBuf, readIndex, len);
		String symbol = "";
		if (ret.indexOf("+") >= 0) {
			ret = ret.replace("+", "");
		}
		if (ret.indexOf("-") >= 0) {
			symbol = "-";
			ret = ret.replace("-", "");
		}
		return Integer.parseInt(symbol + ret);
	}

	public static Double readDouble(byte[] inputBuf, IndexData readIndex, int len, int decimalLen) {
		String ret = readString(inputBuf, readIndex, len);
		// 考虑正负数的问题
		String symbol = "";
		if (ret.indexOf("+") >= 0) {
			ret = ret.replace("+", "");
		}
		if (ret.indexOf("-") >= 0) {
			symbol = "-";
			ret = ret.replace("-", "");
		}

		String left = ret.substring(0, ret.length() - decimalLen);
		String right = ret.substring(ret.length() - decimalLen);
		ret = symbol + left + "." + right;
		return Double.parseDouble(ret);
	}

	public static Date readDateTime(byte[] inputBuf, IndexData readIndex, int len) throws Exception {
		String ret = readString(inputBuf, readIndex, len);
		try {
			return StringUtils.stringToDate(ret, "yyyyMMddHHmmss");
		} catch (ParseException e) {
			// throw new Exception(FundExceptionCode.DM_INVALID_DATE_FORMAT, ret+"无法被解析为有效的日期");
			return null;
		}
	}

	public static Date readDate(byte[] inputBuf, IndexData readIndex, int len) throws Exception {
		String ret = readString(inputBuf, readIndex, len);
		try {
			return StringUtils.stringToDate(ret, "yyyyMMdd");
		} catch (ParseException e) {
			// throw new Exception(FundExceptionCode.DM_INVALID_DATE_FORMAT, ret+"无法被解析为有效的日期");
			return null;
		}
	}

	public static String readLongString(byte[] inputBuf, IndexData readIndex, int len) {
		int slen = readInteger(inputBuf, readIndex, len);
		return readString(inputBuf, readIndex, slen);
	}

	public static String readLongString(String inputStr, IndexData readIndex, int len) {
		int slen = readInteger(inputStr, readIndex, len);
		return readString(inputStr, readIndex, slen);
	}

	/**
	 * 验证身份证号码第18位是不是合法
	 * 
	 * @param idNo
	 * @return
	 */
	public static boolean verifyCer(String idNo) {
		try {
			if (idNo == null) {
				return false;
			}

			if (idNo != null && idNo.length() != 18) {
				return false;
			}

			// 验证身份证前几位
			int[] area = {
					11, 12, 13, 14, 15, 21, 22, 23, 31, 32, 33, 34, 35, 36, 37, 41, 42, 43, 44, 45, 46, 50, 51, 52, 53, 54, 61, 62, 63, 64, 65, 71, 81, 82, 91
			};
			int flag = 0;
			for (int i : area) {
				if (idNo.startsWith(i + "")) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				log.error("身份证前两位不正确");
				return false;
			}

			// 验证身份证生日格式
			String birthyear = idNo.substring(6, 10);

			String now = new SimpleDateFormat("yyyy").format(new Date());
			if (Integer.valueOf("1" + birthyear) > Integer.valueOf("1" + now)) {
				log.error("身份证日期年份不合法");
				return false;
			}
			String birthmonth = idNo.substring(10, 12);
			String birthday = idNo.substring(12, 14);
			// 判断是否是闰年
			boolean isrun = false;
			if (Integer.valueOf(birthyear) % 400 == 0) {
				isrun = true;
			}

			if (Integer.valueOf(birthyear) % 4 == 0 && Integer.valueOf(birthyear) % 100 != 0) {
				isrun = true;
			}

			if (!(Integer.valueOf("1" + birthmonth) >= 101 && Integer.valueOf("1" + birthmonth) <= 112)) {
				log.error(birthmonth + "身份证日期月份不合法");
				return false;
			}

			if (birthmonth.equals("01") || birthmonth.equals("03") || birthmonth.equals("05") || birthmonth.equals("07") || birthmonth.equals("08")
					|| birthmonth.equals("10") || birthmonth.equals("12")) {
				if (!(Integer.valueOf("1" + birthday) >= 101 && Integer.valueOf("1" + birthday) <= 131)) {
					log.error(birthday + "身份证日期不合法");
					return false;
				}
			}

			if (birthmonth.equals("04") || birthmonth.equals("06") || birthmonth.equals("09") || birthmonth.equals("11")) {
				if (!(Integer.valueOf("1" + birthday) >= 101 && Integer.valueOf("1" + birthday) <= 130)) {
					log.error(birthday + "身份证日期不合法");
					return false;
				}
			}

			if (birthmonth.equals("02") && isrun) {
				if (!(Integer.valueOf("1" + birthday) >= 101 && Integer.valueOf("1" + birthday) <= 129)) {
					log.error(birthday + "身份证日期不合法");
					return false;
				}
			}

			if (birthmonth.equals("02") && !isrun) {
				if (!(Integer.valueOf("1" + birthday) >= 101 && Integer.valueOf("1" + birthday) <= 128)) {
					log.error(birthday + "身份证日期不合法");
					return false;
				}
			}

			int[] no = {
					7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2
			};

			int total = 0;
			for (int i = 0; i < 17; i++) {
				char c = idNo.charAt(i);
				total += no[i] * Integer.valueOf(c + "");
			}

			int rs = total % 11;
			if (rs == 0) {
				return idNo.substring(17).equals("1");
			} else if (rs == 1) {
				return idNo.substring(17).equals("0");
			} else if (rs == 2) {
				return idNo.substring(17).equals("X");
			} else if (rs == 3) {
				return idNo.substring(17).equals("9");
			} else if (rs == 4) {
				return idNo.substring(17).equals("8");
			} else if (rs == 5) {
				return idNo.substring(17).equals("7");
			} else if (rs == 6) {
				return idNo.substring(17).equals("6");
			} else if (rs == 7) {
				return idNo.substring(17).equals("5");
			} else if (rs == 8) {
				return idNo.substring(17).equals("4");
			} else if (rs == 9) {
				return idNo.substring(17).equals("3");
			} else if (rs == 10) {
				return idNo.substring(17).equals("2");
			} else {
				return false;
			}
		} catch (NumberFormatException e) {
			log.error(e.getMessage());
			return false;
		}
	}

	public static void main(String[] args) {
		// System.out.println(GatewayUtils.readDouble("000000-356", new IndexData(), 10, 2));
		System.out.println(verifyCer("320982198611310037"));
	}
}
