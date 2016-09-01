/**
 * 
 */
package topdeep.commonfund.mobile.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;

import topdeep.commonfund.biz.gateway.impl.SessionManage;
import topdeep.commonfund.entity.gateway.GatewayReturn;

import common.cache2.CacheException;

/**
 * 提供CheckVersion的服务调用
 * 
 * @author niexin
 *
 */
@Controller("FundApiServlet")
public class FundApi extends FundApiBase implements HttpRequestHandler {

	private SessionManage sessionManage;

	private String getClientKey(String clientType, String clientVersion) {
		return clientType + "__" + clientVersion;
	}

	protected String executeRequest(HttpServletRequest request, String inputParam) {
		String sessionKey = (String) request.getSession().getAttribute("sessionKey");
		GatewayReturn ret = serviceApi.execute(inputParam, sessionKey, commerceId, tradeType);
		return ret.getData();
	}

	protected byte[] getDynamicKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		// ClientSession clientUser = sessionManage.getClient(sessionKey);
		// if (clientUser == null) {
		// return null;
		// }
		// return clientUser.getClient();
		return new byte[10];
	}

	protected String getSignKey(String clientType, String clientVersion, String sessionKey) throws CacheException {
		// ClientUser clientUser = sessionManage.getClientUser(sessionKey);
		// if (clientUser == null) {
		// return "";
		// }
		// return clientUser.getSignKey();
		return "gateway";
	}

	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// String clientType = request.getHeader("LION_CLIENT_TYPE");
			// String clientVersion = request.getHeader("LION_CLIENT_VERSION");
			// String clientKey = getClientKey(clientType, clientVersion);
			String clientAesKeyStr = "";
			// SystemClientVersion cv = getClientMap().get(clientKey);
			// if (cv != null) {
			// clientAesKeyStr = cv.getClientEncryptKey();
			// }
			// if (!StringUtils.isNullOrEmpty(clientAesKeyStr)) {
			// byte[] aesKey = Base64.decodeBase64(clientAesKeyStr);
			super.handleRequest(request, response, null);
			// } else {
			// return;
			// }
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
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

}
