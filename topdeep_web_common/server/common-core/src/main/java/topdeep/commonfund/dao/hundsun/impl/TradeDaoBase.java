/**
 * $Id$
 */
package topdeep.commonfund.dao.hundsun.impl;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Value;

import topdeep.commonfund.dao.hundsun.impl.util.HttpJsonSerialize;
import topdeep.commonfund.entity.hundsun.HundsunBaseInput;
import topdeep.commonfund.entity.hundsun.HundsunBaseOutput;
import topdeep.commonfund.entity.hundsun.HundsunCallSession;
import topdeep.commonfund.entity.hundsun.HundsunOutputAdapta;
import topdeep.commonfund.entity.hundsun.HundsunReturnCode;
import topdeep.commonfund.entity.hundsun.ServiceException;
import flexjson.JSONSerializer;

/**
 * @author niexin
 * 
 */
public class TradeDaoBase {

	private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(TradeDaoBase.class);

	@Value("#{application['hundsunServiceUrl']}")
	private String serviceUrl;

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	private URLConnection openConnection(String path) throws IOException {
		URL url = new URL(serviceUrl);
		// URL url = new URL(serviceUrl+"fundapi/restful/openapi");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		return conn;
	}

	protected <T extends HundsunOutputAdapta> T callService(HundsunBaseInput inputParam, HundsunCallSession callSession, Class outputParamType)
			throws Exception {
		URLConnection conn;
		try {
			// initCallObj(inputParam, callSession);
			if (log.isDebugEnabled()) {
				log.debug("callService " + inputParam.getFunction() + "; ");
				debugObject(inputParam.getFunction() + "Input", inputParam);
			}
			try {
				long startTime = System.currentTimeMillis();
				conn = openConnection(serviceUrl);
				Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
				HttpJsonSerialize.Instance.serialize(callSession.getMerPassword(), inputParam, writer);
				Reader reader = new InputStreamReader(conn.getInputStream(), "utf-8");
				T out = (T) HttpJsonSerialize.Instance.deserialize(reader, outputParamType);
				long executionTime = System.currentTimeMillis() - startTime;
				log.debug("execute Service " + inputParam.getFunction() + "; " + serviceUrl + "use: " + executionTime + "ms");
				// debugObject(inputParam.getFunction()+":out", out);
				checkOut(out.getOut());
				return out;
			} catch (ServiceException ex) {
				if ("ETS-5BP9951".equalsIgnoreCase(ex.getOrgErrorCode())) {
					// 超时，重新登录一次，再试一次
					log.debug("用户超时，试图重新登录");
					throw ex;
					// callSession.setSessionkey(null);
					// P003Input p003Input = new P003Input();
					// p003Input.setCertificatetype(callSession.getIdType());
					// p003Input.setLogtype("2");
					// p003Input.setPassword(callSession.getPassword());
					// p003Input.setLognumber(callSession.getIdNo());
					// P003OutputAdapta p003Output = callService(p003Input, callSession, P003OutputAdapta.class);
					// checkOut(p003Output.getOut());
					// callSession.setSessionkey(p003Output.getResults().getDetail().get(0).getSessionkey());
					// initCallObj(inputParam, callSession);
					// conn = openConnection(serviceUrl);
					// Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
					//
					// HttpJsonSerialize.Instance.serialize(callSession.getMerPassword(), inputParam, writer);
					// Reader reader = new InputStreamReader(conn.getInputStream(), "utf-8");
					// T out = (T) HttpJsonSerialize.Instance.deserialize(reader, outputParamType);
					// checkOut(out.getOut());
					// return out;
				} else {
					throw ex;
				}
			}

		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		} catch (IllegalArgumentException e) {
			log.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		} catch (IllegalAccessException e) {
			log.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		} catch (InvocationTargetException e) {
			log.error(e.getMessage(), e);
			throw new Exception(e.getMessage());
		}
	}

	// private void initCallObj(HundsunBaseInput inputParam, HundsunCallSession callSession) throws Exception {
	// if (inputParam == null) {
	// throw new Exception("输入参数为空");
	// }
	// inputParam.setMerid(callSession.getMerid());
	// inputParam.setChannel(callSession.getChannel());
	// inputParam.setFormat(callSession.getFormat());
	// inputParam.setSessionkey(callSession.getSessionkey());
	// inputParam.setSignmode(callSession.getSignmode());
	// inputParam.setUsertype(callSession.getUsertype());
	// }

	private void checkOut(HundsunBaseOutput out) throws Exception {
		if (!out.getCode().equals(HundsunReturnCode.ETS_5BP0000)) {
			throw new ServiceException(out.getMessage(), out.getCode());
			// if(StringUtils.isNullOrEmpty(out.getMessage())){
			// out.setMessage("查询服务繁忙");
			// }
			// if(out.getCode().length() < 6){
			// throw new ServiceException(out.getCode(),out.getMessage());
			// }
			// String errorType = out.getCode().substring(5,6);
			// if(errorType.equals("A")){
			// throw new FundApplicationException(out.getCode(),out.getMessage());
			// }else if(errorType.equals("B")){
			// throw new FundBizException(out.getCode(),out.getMessage());
			// }else if(errorType.equals("S")){
			// throw new FundSystemException(out.getCode(),out.getMessage());
			// }
		}
	}

	public void debugObject(String objName, Object obj) {
		String ret = new JSONSerializer().exclude("*.class").exclude("tradepassword").exclude("password").exclude("tradeAccount")
				.exclude("currencyOpenAccountView.password").exclude("currencyOpenAccountView.password2").serialize(obj);
		log.debug(ret);
	}

}
