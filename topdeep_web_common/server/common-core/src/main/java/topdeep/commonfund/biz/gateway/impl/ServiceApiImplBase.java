/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.codec.binary.Base64;

import topdeep.common.util.ApplicationContextHelper;
import topdeep.commonfund.entity.gateway.FundGatewayErrorCode;
import topdeep.commonfund.entity.gateway.GatewayReturn;
import topdeep.commonfund.entity.gateway.GatewayServiceException;
import topdeep.commonfund.entity.gateway.def.ISBaseInput;
import topdeep.commonfund.entity.gateway.def.ISBaseOutput;
import topdeep.commonfund.entity.gateway.def.ISMultiInput;
import topdeep.commonfund.entity.gateway.def.ISMultiOutput;
import topdeep.commonfund.entity.gateway.def.ISVersionCheckOutput;
import topdeep.commonfund.entity.gateway.util.ExcludeTransformer;
import topdeep.commonfund.entity.gateway.util.ISBaseInputObjectFactory;
import topdeep.commonfund.entity.gateway.util.IndexData;

import common.util.MD5;
import common.util.StringUtils;

import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import flexjson.transformer.DateTransformer;

/**
 * @author niexin
 *
 */
public class ServiceApiImplBase {

	/**
	 * 商业密码，用来签名
	 */
	protected String merPassword = "test";

	protected SessionManage sessionManage;

	private String verifyKeys;

	private Map<String, String> verifyKeyMap = new Hashtable<String, String>();

	protected org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(ServiceApiImplBase.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lion.fund.biz.gateway.ServiceApi#executeCheckVersion(java.lang.String)
	 */
	public String executeCheckVersion(String inputParam) {
		ISMultiInput input = null;
		ISMultiOutput output = null;
		boolean inputError = false;
		input = new JSONDeserializer<ISMultiInput>().use(null, ISMultiInput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss"))
				.use(new ISBaseInputObjectFactory(), "inputList.values").deserialize(inputParam);
		// checkSession
		try {
			if (input.getInputList().size() > 1 || !input.getInputList().get(0).getZ_funcCode().equals("b02")) {
				checkSession(input.getZ_sessionKey());
			}
		} catch (GatewayServiceException ex) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SESSION_TIMEOUT, "无效的SessionKey");
		} catch (Exception e) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR, e.getMessage());
		}
		// checkTimeStamp

		if (!inputError) {
			for (ISBaseInput item : input.getInputList()) {
				if (!item.getZ_funcCode().equals("b02")) {
					inputError = true;
					output = getMultiErrorOutput(FundGatewayErrorCode.INPUT_PARAM_ERROR, "本接口只接供版本检查服务");
					break;
				}
			}
		}
		if (output == null) {
			output = executeMulti(input);
		}
		String data = new JSONSerializer().exclude("*.class", "*.hashKey").transform(new ExcludeTransformer(), void.class)
				.transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
		return data;
	}

	public GatewayReturn executeCheckVersion(String inputParam, String sessionKey, String commerceId, String tradeType) {
		ISMultiInput input = null;
		ISMultiOutput output = null;
		boolean inputError = false;
		input = new JSONDeserializer<ISMultiInput>().use(null, ISMultiInput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss"))
				.use(new ISBaseInputObjectFactory(), "inputList.values").deserialize(inputParam);
		input.setZ_commerceId(commerceId);
		input.setZ_tradeType(tradeType);
		input.setZ_sessionKey(sessionKey);
		// checkSession
		try {
			if (input.getInputList().size() > 1 || !input.getInputList().get(0).getZ_funcCode().equals("b02")) {
				checkSession(input.getZ_sessionKey());
			}
		} catch (GatewayServiceException ex) {
			log.error(ex.getMessage(), ex);
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SESSION_TIMEOUT, "无效的SessionKey");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR, e.getMessage());
		}
		// checkTimeStamp

		if (!inputError) {
			for (ISBaseInput item : input.getInputList()) {
				if (!item.getZ_funcCode().equals("b02")) {
					inputError = true;
					output = getMultiErrorOutput(FundGatewayErrorCode.INPUT_PARAM_ERROR, "本接口只接供版本检查服务");
					break;
				}
			}
		}
		ISVersionCheckOutput checkVersionOutput = null;
		if (output == null) {
			output = executeMulti(input);
			checkVersionOutput = (ISVersionCheckOutput) output.getOutputList().get(0);
		}
		String data = new JSONSerializer().exclude("*.class", "*.hashKey").transform(new ExcludeTransformer(), void.class)
				.transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
		GatewayReturn ret = new GatewayReturn();
		ret.setData(data);
		if (checkVersionOutput != null) {
			ret.setSessionKey(checkVersionOutput.getSessionKey());
		}
		return ret;

	}

	protected ISMultiOutput getMultiErrorOutput(String errorCode, String errorMsg) {
		ISMultiOutput output = new ISMultiOutput();
		output.setCode(errorCode);
		output.setMsg(errorMsg);
		return output;
	}

	public String execute(String inputParam) {
		ISMultiInput input = null;
		ISMultiOutput output = null;
		boolean inputError = false;
		input = new JSONDeserializer<ISMultiInput>().use(null, ISMultiInput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss"))
				.use(new ISBaseInputObjectFactory(), "inputList.values").deserialize(inputParam);
		// checkSession
		boolean timeOut = false;
		try {
			if (input.getInputList().size() > 1 || !input.getInputList().get(0).getZ_funcCode().equals("b02")) {
				checkSession(input.getZ_sessionKey());
				// checkTimeStamp
				// timeOut = isTimeStamp(input.getZ_timestamp(), 30, input, inputParam);
			}
		} catch (GatewayServiceException ex) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SESSION_TIMEOUT, "无效的SessionKey");
		} catch (Exception e) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR, e.getMessage());
		}
		// checkTimeStamp
		if (timeOut) {
			output = executeMultiTimeOut(input);
		}
		if (!inputError && !timeOut) {
			output = executeMulti(input);
		}
		String data = new JSONSerializer().exclude("*.class", "*.hashKey").transform(new ExcludeTransformer(), void.class)
				.transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
		return data;
	}

	public GatewayReturn execute(String inputParam, String sessionKey, String commerceId, String tradeType) {
		ISMultiInput input = null;
		ISMultiOutput output = null;
		boolean inputError = false;
		input = new JSONDeserializer<ISMultiInput>().use(null, ISMultiInput.class).use(java.util.Date.class, new DateTransformer("yyyyMMddHHmmss"))
				.use(new ISBaseInputObjectFactory(), "inputList.values").deserialize(inputParam);
		input.setZ_commerceId(commerceId);
		input.setZ_tradeType(tradeType);
		input.setZ_sessionKey(sessionKey);
		// checkSession
		boolean timeOut = false;
		try {
			if (input.getInputList().size() > 1 || !input.getInputList().get(0).getZ_funcCode().equals("b02")) {
				checkSession(input.getZ_sessionKey());
				// checkTimeStamp
				// timeOut = isTimeStamp(input.getZ_timestamp(), 30, input, inputParam);
			}
		} catch (GatewayServiceException ex) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SESSION_TIMEOUT, "无效的SessionKey");
		} catch (Exception e) {
			inputError = true;
			output = getMultiErrorOutput(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR, e.getMessage());
		}
		// checkTimeStamp
		if (timeOut) {
			output = executeMultiTimeOut(input);
		}
		if (!inputError && !timeOut) {
			output = executeMulti(input);
		}
		String data = new JSONSerializer().exclude("*.class", "*.hashKey").transform(new ExcludeTransformer(), void.class)
				.transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(output);
		GatewayReturn ret = new GatewayReturn();
		ret.setData(data);
		ret.setSessionKey(input.getZ_sessionKey());
		return ret;
	}

	private ISMultiOutput executeMultiTimeOut(ISMultiInput input) {
		String tradeType = input.getZ_tradeType();
		// this.getGatewayUser().setTradeType(tradeType);
		ISMultiOutput output = new ISMultiOutput();
		for (ISBaseInput item : input.getInputList()) {
			ISBaseOutput outItem = new ISBaseOutput();
			outItem.setCode(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR);
			// outItem.setMsg("网络不给力，请重新获取");
			outItem.setMsg("");
			outItem.setZ_timestamp(input.getZ_timestamp());
			outItem.setZ_funcCode(item.getZ_funcCode());
			output.getOutputList().add(outItem);
		}
		output.setCode(FundGatewayErrorCode.SUCCESS);
		output.setMsg("");
		return output;
	}

	public ISBaseOutput execute(ISBaseInput input) {
		ISBaseOutput output = new ISBaseOutput();
		output.setCode(FundGatewayErrorCode.SUCCESS);
		output.setMsg("");
		return output;
	}

	public void execute(byte[] buf, IndexData readIndex, StringBuilder ret) {
	}

	public ISMultiOutput executeMulti(ISMultiInput input) {
		ISMultiOutput output = new ISMultiOutput();
		// 判断服务器是否在维护中，以后客户端必须首先显示服务器返回错误提示，如果没有错误提示，再显示自己的提示
		// if(this.maintainServer){
		if (false) {
			boolean isFuncodeNoCheck = false;
			for (ISBaseInput item : input.getInputList()) {
				if (",b02,b11,".indexOf(item.getZ_funcCode()) != -1) {
					isFuncodeNoCheck = true;
					break;
				}
				ISBaseOutput outItem = new ISBaseOutput();
				outItem.setCode(FundGatewayErrorCode.TRADE_SERVICE_CALL_ERROR);
				outItem.setZ_timestamp(input.getZ_timestamp());
				outItem.setZ_funcCode(item.getZ_funcCode());
				outItem.setMsg("服务器正在维护中，谢谢使用！");
				output.getOutputList().add(outItem);
			}
			if (!isFuncodeNoCheck) {
				output.setCode(FundGatewayErrorCode.SUCCESS);
				output.setMsg("");
				return output;
			}
		}

		String tradeType = input.getZ_tradeType();
		// this.getGatewayUser().setTradeType(tradeType);
		boolean sessionTimeout = false;
		Map<String, String> mapFuncCodeMap = new HashMap<String, String>();
		/*
		 * 是否为相同的功能在同一个请求,,只检查以下功能 u0g(撤单）、c25（微钱宝存入）、c1S（微钱宝动态口令发送）、c26（微钱宝取出）、 u0c（申购）u0d（赎回）、u0b（认购）、u0e（转换）
		 */
		boolean repeatReq = false;
		// String needCheckFuncCodeList = ",u0g,c25,c1S,c26,u0c,u0d,u0e,";
		try {
			for (ISBaseInput item : input.getInputList()) {
				// if (needCheckFuncCodeList.indexOf(item.getZ_funcCode()) == -1) {
				if (true) {
					continue;
				}
				String itenInputJson = new JSONSerializer().exclude("*.class", "*.hashKey").transform(new ExcludeTransformer(), void.class)
						.transform(new DateTransformer("yyyyMMddHHmmss"), java.util.Date.class).deepSerialize(item);
				String md5Str = new MD5(itenInputJson, "utf-8").getMd5String();
				if (StringUtils.isNullOrEmpty(md5Str) || mapFuncCodeMap.containsKey(md5Str)) {
					repeatReq = true;
					break;
				} else {
					mapFuncCodeMap.put(md5Str, md5Str);
				}
			}
		} catch (Exception e) {
			log.error("处理一个请求中相同交易有两笔或两笔以上的请求失败", e);
		}
		boolean flag = false;
		// if (!repeatReq) {
		for (ISBaseInput item : input.getInputList()) {
			ISBaseOutput outItem = new ISBaseOutput();
			// item.setZ_commerceId(input.getZ_commerceId());
			// item.setZ_password(input.getZ_password());
			// item.setZ_sessionKey(input.getZ_sessionKey());
			// item.setZ_tradeType(input.getZ_tradeType());
			// item.setZ_timestamp(input.getZ_timestamp());
			if (!flag) {
				outItem = execute(item);
			} else {
				break;
			}

			if (outItem.getCode().equals(FundGatewayErrorCode.SESSION_TIMEOUT)) {
				sessionTimeout = true;
			}

			// 如果多个请求第一个就返回失败剩余的没必要再请求
			if (!outItem.getCode().equals(FundGatewayErrorCode.SUCCESS)) {
				flag = true;
			}
			output.getOutputList().add(outItem);
		}
		if (sessionTimeout) {
			output.setCode(FundGatewayErrorCode.SESSION_TIMEOUT);
			output.setMsg(FundGatewayErrorCode.getErrorDesc(output.getCode()));
		} else {
			output.setCode(FundGatewayErrorCode.SUCCESS);
			output.setMsg("");
		}
		// } else {
		// output.setCode(FundGatewayErrorCode.TRADE_SERVICE_CALL_ERROR);
		// output.setMsg("正在努力加载中...");
		// }
		return output;
	}

	protected void debugObject(String name, Object obj) {
		if (log.isDebugEnabled()) {
			log.debug(name);
			String ret = new JSONSerializer().exclude("*.class").exclude("z_password").exclude("password").exclude("loginPassowrd").exclude("theOldPassword")
					.exclude("theNewPassword").deepSerialize(obj);
			log.debug(ret);
			log.debug("\n");
		}
	}

	@SuppressWarnings("unchecked")
	protected <I> I getFundBiz(Class<I> type, ISBaseInput inputParam, String funcCategoryName) {
		return (I) ApplicationContextHelper.getBean("fundBizLogProxy");
	}

	protected String getVerifyPassword(String merId) {
		if (verifyKeyMap.containsKey(merId)) {
			return verifyKeyMap.get(merId);
		}
		return merPassword;
	}

	protected boolean verifySignmsg(byte[] buf, int index, int len, String signMsg) {
		try {
			String msg = new String(buf, index, len, "utf-8");
			String verifyPassword = merPassword;
			return verifySignmsg(msg, signMsg, verifyPassword);
		} catch (UnsupportedEncodingException e) {
			log.error("verifySignmsg error", e);
		}
		return false;
	}

	protected boolean verifySignmsg(byte[] buf, int index, int len, String signMsg, ISBaseInput input) {
		try {
			String msg = new String(buf, index, len, "utf-8");
			String verifyPassword = getVerifyPassword(input.getZ_commerceId());
			return verifySignmsg(msg, signMsg, verifyPassword);
		} catch (UnsupportedEncodingException e) {
			log.error("verifySignmsg error", e);
		}
		return false;
	}

	protected boolean verifySignmsg(String msg, String signMsg, String verifyPassword) {
		log.debug("msg=[" + msg + "]");
		try {
			String sign = new MD5(verifyPassword + msg + verifyPassword, "utf-8").getMd5String();
			log.debug("sign=[" + sign + "]");
			return sign.equals(signMsg);
		} catch (UnsupportedEncodingException e) {
			log.error("verifySignmsg error", e);
		}
		return false;
	}

	protected String getSignMsg(String msg, String merId) {
		log.debug("msg=[" + msg + "]");
		try {
			String merPswd = merPassword;
			if (verifyKeyMap.containsKey(merId)) {
				merPswd = verifyKeyMap.get(merId);
			}
			String sign = new MD5(merPswd + msg + merPswd, "utf-8").getMd5String();
			log.debug("sign=[" + sign + "]");
			return sign;
		} catch (UnsupportedEncodingException e) {
			log.error("getSignmsg error", e);
		}
		return "";
	}

	protected void checkSession(String sessionKey) throws Exception {
		// if(sessionManage.getClientUser(sessionKey) == null){
		// throw new GatewayServiceException(FundGatewayErrorCode.SESSION_TIMEOUT, "无效的SessionKey");
		// }
	}

	/**
	 * @return the merPassword
	 */
	public String getMerPassword() {
		return merPassword;
	}

	/**
	 * @param merPassword the merPassword to set
	 */
	public void setMerPassword(String merPassword) {
		this.merPassword = merPassword;
	}

	/**
	 * @return the sessionManage
	 */
	public SessionManage getSessionManage() {
		return sessionManage;
	}

	/**
	 * @param sessionManage the sessionManage to set
	 */
	public void setSessionManage(SessionManage sessionManage) {
		this.sessionManage = sessionManage;
	}

	/**
	 * @return the verifyKeys
	 */
	public String getVerifyKeys() {
		return verifyKeys;
	}

	/**
	 * @param verifyKeys the verifyKeys to set
	 */
	public void setVerifyKeys(String verifyKeys) {
		this.verifyKeys = verifyKeys;
		verifyKeyMap.clear();
		if (verifyKeys != null) {
			String[] keyValues = verifyKeys.split(",");
			for (int i = 0; i < keyValues.length; i = i + 2) {
				verifyKeyMap.put(keyValues[i], keyValues[i + 1]);
			}
		}
	}

	public static final String compress(String str) {
		return getenBASE64inCodec(compressStr(str));
	}

	/**
	 * 压缩字符串为 byte[] 储存可以使用new sun.misc.BASE64Encoder().encodeBuffer(byte[] b)方法 保存为字符串
	 * 
	 * @param str 压缩前的文本
	 * @return
	 */
	public static final byte[] compressStr(String str) {
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

	public static final String decompress(String str) {
		byte[] compressed = getdeBASE64inCodec(str);
		return decompress(compressed);
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

	// 使用apche codec对数组进行encode
	public static String getenBASE64inCodec(byte[] b) {
		if (b == null)
			return null;
		return new String((new Base64()).encode(b));
	}

	// base64转码为string

	public static byte[] getdeBASE64inCodec(String s) {
		if (s == null)
			return null;
		return new Base64().decode(s.getBytes());
	}

	/**
	 * @param inputParam
	 * @return
	 */
	public String executeActionData(String inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param iNPUT_PARAM_ERROR
	 * @param string
	 * @return
	 */
	public ISBaseOutput getErrorOutput(String iNPUT_PARAM_ERROR, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
