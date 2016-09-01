/**
 * 
 */
package topdeep.common.dao.manage.client.impl;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.w3c.dom.Document;

import topdeep.common.entity.manage.def.MSBaseInput;
import topdeep.common.entity.manage.def.MSBaseOutput;
import topdeep.common.util.CommonUtils;
import topdeep.common.util.sign.DocumentUtil;
import flexjson.JSONSerializer;

/**
 * @author niexin
 *
 */
public class ManageClientDaoBase {

	protected org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory.getLog(getClass());

	protected void callServer(MSBaseInput inputParam, MSBaseOutput outputParam) {
		try {
			// 1 convertToXml
			Document newdoc = inputParam.getDocument();
			Document doc = CommonUtils.getDocument(newdoc);
			String input = DocumentUtil.docToString(doc);
			byte[] inputData = input.getBytes("utf-8");
			// 5 调用服务器获得结果
			byte[] ret = callHttpServer(inputParam.getServerUrl(), inputData);
			String output = new String(ret, "utf-8");
			Document retDoc = DocumentUtil.getDocFromString(output);
			DocumentUtil.printDoc(retDoc);
			outputParam.parseDocument(retDoc);
		} catch (Exception ex) {
			logger.error("callServer error: " + ex.getMessage(), ex);
			outputParam.setCode("9999");
			outputParam.setMsg(ex.getMessage());
		}
	}

	private byte[] callHttpServer(String serverUrl, byte[] data) throws IOException, NoSuchAlgorithmException, KeyManagementException {
		logger.debug("\nconnect " + serverUrl);
		URL url = new URL(serverUrl);
		HttpURLConnection conn;
		if (!serverUrl.startsWith("https")) {
			conn = (HttpURLConnection) url.openConnection();
		} else {
			TrustManager[] trustAllCerts = new TrustManager[] {
				new X509TrustManager() {
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
					}

					public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
					}
				}
			};
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					return true;
				}
			});

			HttpsURLConnection conn1 = (HttpsURLConnection) url.openConnection();
			conn1.setHostnameVerifier(new HostnameVerifier() {
				public boolean verify(String arg0, SSLSession arg1) {
					return true;
				}
			});
			conn = conn1;
		}
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/octet-stream");
		conn.setRequestProperty("Content-Length", "" + data.length);
		logger.debug("write length: " + data.length);
		DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
		dos.write(data);
		dos.flush();
		dos.close();

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		InputStream in = conn.getInputStream();
		byte[] rbuf = new byte[512];
		int readLen = in.read(rbuf);
		while (readLen > 0) {
			stream.write(rbuf, 0, readLen);
			readLen = in.read(rbuf);
		}
		byte[] ret = stream.toByteArray();
		in.close();
		stream.close();
		return ret;
	}

	protected void debugObject(String name, Object obj) {
		logger.debug(name);
		String ret = new JSONSerializer().exclude("*.class").exclude("loginPassowrd").exclude("z_password").exclude("password").exclude("loginPassowrd")
				.exclude("theOldPassword").exclude("theNewPassword").deepSerialize(obj);
		logger.debug(ret + "\n");
	}

}
