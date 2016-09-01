/**
 * 
 */
package topdeep.commonfund.mobile.servlet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.common.biz.common.CommonSystemBiz;
import topdeep.common.entity.db.SystemClientVersion;
import topdeep.common.entity.db.SystemClientVersionExample;
import topdeep.commonfund.biz.gateway.ServiceApi;

import common.cache2.Cache;
import common.cache2.CacheException;
import common.util.MD5;
import common.util.StringUtils;

/**
 * 提供CheckVersion的服务调用
 * 
 * @author niexin
 *
 */
public class FundApiBase {

	protected org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("serviceApi")
	protected ServiceApi serviceApi;

	@Autowired
	@Qualifier("commonSystemBiz")
	private CommonSystemBiz commonSystemBiz;

	@Autowired()
	@Qualifier("sessionCache")
	private Cache sessionCache;

	protected String commerceId = "lionfund";
	protected String tradeType = "1";

	protected Map<String, SystemClientVersion> getClientMap() throws CacheException {
		String group = "FundApiBase";
		String key = "FundApiBase_clientMap";
		Map<String, SystemClientVersion> clientMap = (Map<String, SystemClientVersion>) sessionCache.get(group, key);
		if (clientMap == null) {
			clientMap = new HashMap<String, SystemClientVersion>();
			try {
				List<SystemClientVersion> list = commonSystemBiz.systemClientVersionSelectObjects(new SystemClientVersionExample());
				for (SystemClientVersion item : list) {
					String clientKey = getClientKey(item.getClientType(), item.getClientVersion());
					if (!clientMap.containsKey(clientKey)) {
						clientMap.put(clientKey, item);
					}
				}
			} catch (Exception e) {
				log.error(e.getMessage(), e);
				e.printStackTrace();
			}
			if (clientMap.size() > 0) {
				sessionCache.put(group, key, clientMap);
			}
		}
		return clientMap;
	}

	private String getClientKey(String clientType, String clientVersion) {
		return clientType + "__" + clientVersion;
	}

	protected byte[] getDynamicKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		return null;
	}

	protected String getSignKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		return "";
	}

	protected String executeRequest(HttpServletRequest request, String inputParam) {
		return "";
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response, byte[] paramAesKey) throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.info("=APP==IP===[" + getRemoteIp(request) + "]");
		long time = System.currentTimeMillis();
		// String clientType = request.getHeader("LION_CLIENT_TYPE");
		// String clientVersion = request.getHeader("LION_CLIENT_VERSION");
		// String clientParam = request.getHeader("LION_CLIENT_PARAM");
		// log.debug("clientType=" + clientType + ",clientVersion=" + clientVersion);
		// String clientKey = getClientKey(clientType, clientVersion);
		try {
			// String clientParamPlain = EncryptionUtil.Decrypt(clientParam, paramAesKey);
			// byte[] paramBuf = clientParam.getBytes("utf-8");
			// IndexData readIndex = new IndexData();
			// String sessionKey = GatewayUtils.readLongString(paramBuf, readIndex, 2);
			// String commerceId = GatewayUtils.readLongString(paramBuf, readIndex, 2);
			// String timestamp = GatewayUtils.readLongString(paramBuf, readIndex, 2);
			// byte[] bufEncry = new byte[request.getContentLength()];
			// request.getInputStream().read(bufEncry);
			// byte[] dynamicKey = getDynamicKey(clientType, clientVersion, sessionKey);
			boolean sessionTimeOut = false;
			// if (dynamicKey == null) {
			// sessionTimeOut = true;
			// }
			// String signKey = getSignKey(clientType, clientVersion, sessionKey);
			// if (StringUtils.isNullOrEmpty(signKey)) {
			// sessionTimeOut = true;
			// }
			if (!sessionTimeOut) {
				// byte[] bufPlain = EncryptionUtil.Decrypt(bufEncry, dynamicKey);
				// String inputParam = decompress(bufEncry);
				// readIndex = new IndexData();
				// String receiveSign = GatewayUtils.readLongString(inputParam, readIndex, 2);
				// String data = inputParam.substring(readIndex.Index);
				String data = request.getParameter("data");
				// String calcSign = getSignMsg(data, signKey);
				// log.warn("inputParam=" + inputParam);
				// log.warn("receiveSign=[" + receiveSign + "];calcSign=[" + calcSign + "]");
				// if (receiveSign.equals(calcSign)) {
				// // log.debug("input="+data);
				String ret = executeRequest(request, data);
				// log.warn("ret=" + ret);
				// String sendSign = getSignMsg(ret, signKey);
				// String sendSignData = GatewayUtils.buildLongString(sendSign, 2);
				// byte[] retBuf = compress(ret);
				byte[] retBuf = ret.getBytes("utf-8");
				// bufEncry = EncryptionUtil.Encrypt(retBuf, dynamicKey);
				// log.debug("retDataLength=" + bufEncry.length);
				// response.setContentType("application/octet-stream");
				response.setContentType("application/Json");
				response.setContentLength(retBuf.length);
				response.getOutputStream().write(retBuf);
				response.getOutputStream().flush();
				response.getOutputStream().close();
			} else {
				// sign error
				log.warn("sign error!");
				String ret = "1";
				byte[] retBuf = ret.getBytes("utf-8");
				response.setContentType("application/octet-stream");
				response.setContentLength(retBuf.length);
				response.getOutputStream().write(retBuf);
				response.getOutputStream().flush();
				response.getOutputStream().close();
			}
			// } else {
			// // 直接返回超时信息,如何返回呢？
			// String ret = "2";
			// log.warn("session timeout!");
			// byte[] retBuf = ret.getBytes("utf-8");
			// response.setContentType("application/octet-stream");
			// response.setContentLength(retBuf.length);
			// response.getOutputStream().write(retBuf);
			// response.getOutputStream().flush();
			// response.getOutputStream().close();
			// }

		} catch (Exception e) {
			log.error("", e);
		}
		time = System.currentTimeMillis() - time;
		log.info("execute FundApi use " + time + "ms");
	}

	/**
	 * 获得ip地址
	 */
	private String getRemoteIp(HttpServletRequest request) {
		String ip = "";
		try {
			ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			String[] ips = ip.split(",");
			for (int i = 0; i < ips.length; i++) {
				if (!StringUtils.isNullOrEmpty(ips[i]) && !"unknown".equals(ips[i])) {
					ip = ips[i];
					break;
				}
			}
		} catch (Exception e) {
			ip = "error";
		}
		return ip;
	}

	protected String getSignMsg(String msg, String signKey) {
		// log.debug("msg=["+msg+"]");
		try {
			String sign = new MD5(signKey + msg + signKey, "utf-8").getMd5String();
			// log.debug("sign=["+sign+"]");
			return sign;
		} catch (UnsupportedEncodingException e) {
			log.error("getSignmsg error", e);
		}
		return "";
	}

	/**
	 * 压缩字符串为 byte[] 保存为字符串
	 * 
	 * @param str 压缩前的文本
	 * @return
	 */
	protected final byte[] compress(String str) {
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
	protected final String decompress(byte[] compressed) {
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

	public Cache getSessionCache() {
		return sessionCache;
	}

	public void setSessionCache(Cache sessionCache) {
		this.sessionCache = sessionCache;
	}
}
