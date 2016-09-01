/**
 * 
 */
package topdeep.commonfund.mobile.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;

import topdeep.common.entity.db.SystemClientVersion;
import topdeep.commonfund.entity.gateway.GatewayReturn;

import common.cache2.CacheException;

/**
 * 提供CheckVersion的服务调用
 * 
 * @author niexin
 *
 */
@Controller("FundApiServletVersion")
public class FundApiVersion extends FundApiBase implements HttpRequestHandler {

	private String getClientKey(String clientType, String clientVersion) {
		return clientType + "__" + clientVersion;
	}

	protected String executeRequest(HttpServletRequest request, String inputParam) {
		String sessionKey = (String) request.getSession().getAttribute("sessionKey");
		GatewayReturn ret = serviceApi.executeCheckVersion(inputParam, sessionKey, commerceId, tradeType);
		request.getSession().setAttribute("sessionKey", ret.getSessionKey());
		return ret.getData();
	}

	protected byte[] getDynamicKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		String clientKey = getClientKey(clientType, clientVersion);
		SystemClientVersion cv = getClientMap().get(clientKey);
		byte[] aesKey = null;
		if (cv != null) {
			String clientAesKeyStr = cv.getClientEncryptKey();
			aesKey = Base64.decodeBase64(clientAesKeyStr);
		} else {
			aesKey = new byte[0];
		}
		return aesKey;
	}

	protected String getSignKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		return "gateway";
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// String clientType = request.getHeader("LION_CLIENT_TYPE");
			// String clientVersion = request.getHeader("LION_CLIENT_VERSION");
			// String clientKey = getClientKey(clientType, clientVersion);
			// SystemClientVersion cv = getClientMap().get(clientKey);
			// String clientAesKeyStr = "";
			// if (cv != null) {
			// clientAesKeyStr = cv.getClientEncryptKey();
			// }
			// log.debug("clientAesKeyStr=" + clientAesKeyStr);
			// if (!StringUtils.isNullOrEmpty(clientAesKeyStr)) {
			// byte[] aesKey = Base64.decodeBase64(clientAesKeyStr);
			super.handleRequest(request, response, null);
			// } else {
			// return;
			// }
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}
	}

}
