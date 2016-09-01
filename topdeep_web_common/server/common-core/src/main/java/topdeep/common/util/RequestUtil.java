package topdeep.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import topdeep.common.entity.constant.NameValue;

import common.util.StringUtils;

import flexjson.JSONDeserializer;

public class RequestUtil {
	private static Log logger = LogFactory.getLog(RequestUtil.class);
	private static final String BOUNDARY = "----WebKitFormBoundaryT1HoybnYeFOGFlBR";
	private static final String NEWLINE = "\r\n";

	protected static String callHttpServer(String requestUrl, String requestMethod, String data) throws IOException, NoSuchAlgorithmException,
			KeyManagementException {
		logger.debug("\nconnect " + requestUrl);
		logger.debug("\ninput=" + data);
		URL url = new URL(requestUrl);
		HttpURLConnection conn;
		if (!requestUrl.startsWith("https")) {
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
		conn.setRequestMethod(requestMethod);
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		if (!StringUtils.isNullOrEmpty(data)) {
			logger.debug(data);
			Writer writer = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream(), "utf-8"));
			writer.write(data);
			writer.flush();
			writer.close();
			// OutputStream outputStream = conn.getOutputStream();
			// // 注意编码格式，防止中文乱码
			// outputStream.write(data.getBytes("UTF-8"));
			// outputStream.close();
		}
		// 将返回的输入流转换成字符串
		InputStream inputStream = conn.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		StringBuffer buffer = new StringBuffer();
		String str = null;
		while ((str = bufferedReader.readLine()) != null) {
			buffer.append(str);
		}
		bufferedReader.close();
		inputStreamReader.close();
		// 释放资源
		inputStream.close();
		inputStream = null;
		conn.disconnect();
		logger.debug("receive=" + buffer.toString());

		// logger.debug("\noutput="+ret);
		return buffer.toString();
	}

	protected static <T> T resultToObj(Class<T> type, String result) {
		T obj = new JSONDeserializer<T>().use(null, type).deserialize(result);
		return obj;
	}

	public static <T> T httpsRequest(Class<T> type, String requestUrl, String requestMethod, String data) throws KeyManagementException,
			NoSuchAlgorithmException, IOException {
		String result = callHttpServer(requestUrl, requestMethod, data);
		return resultToObj(type, result);
	}

	public static <T> T httpsRequestTomact(Class<T> type, String requestUrl, String requestMethod, String data) throws KeyManagementException,
			NoSuchAlgorithmException, IOException {
		String result = callHttpServer(requestUrl, requestMethod, data);
		return resultToObj(type, result);
	}

	// http上传文件
	@Deprecated
	public static <T> T httpRequestUpload(Class<T> type, String requestUrl, String requestMethod, String outputStr) {
		StringBuffer buffer = new StringBuffer();
		String boundary = "----WebKitFormBoundaryl6VN168tSWW57CyO";
		try {
			// URL url = new URL(requestUrl);//适用于tomcat服务器
			URL url = new URL(requestUrl);
			HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();

			httpUrlConn.setDoOutput(true);
			httpUrlConn.setDoInput(true);
			httpUrlConn.setUseCaches(false);
			httpUrlConn.setRequestMethod("POST");
			httpUrlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			// 设置请求方式（GET/POST）
			httpUrlConn.setRequestMethod(requestMethod);
			if ("GET".equalsIgnoreCase(requestMethod))
				httpUrlConn.connect();

			// 当有数据需要提交时
			if (null != outputStr) {
				OutputStream outputStream = httpUrlConn.getOutputStream();
				// 注意编码格式，防止中文乱码
				outputStream.write(outputStr.getBytes("UTF-8"));
				outputStream.close();
			}

			// 将返回的输入流转换成字符串
			InputStream inputStream = httpUrlConn.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			httpUrlConn.disconnect();
			return resultToObj(type, buffer.toString());
		} catch (Exception e) {
			logger.error("http request error:{}", e);
		}
		return null;
	}

	public static <T> T httpRequestUploads(Class<T> type, String requestUrl, String requestMethod, List<NameValue> files, String body) throws Exception {
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(true);
			// 设定HTTP协议头
			connection.setRequestProperty("Content-type", "multipart/form-data;boundary=" + BOUNDARY);
			OutputStream out = connection.getOutputStream();
			if (!StringUtils.isNullOrEmpty(body)) {
				// 注意编码格式，防止中文乱码
				out.write(body.getBytes("UTF-8"));
			}
			writeFileOutputStream(out, files);
			out.write((NEWLINE + "--" + BOUNDARY + "--" + NEWLINE).getBytes("UTF-8"));
			out.flush();
			out.close();

			// 将返回的输入流转换成字符串
			InputStream inputStream = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer();

			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			// 释放资源
			inputStream.close();
			inputStream = null;
			connection.disconnect();
			return resultToObj(type, buffer.toString());
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	private static void writeFileOutputStream(OutputStream out, List<NameValue> files) throws UnsupportedEncodingException, Exception {
		StringBuilder sb = null;
		// int index = 0;
		for (NameValue item : files) {
			String name = item.getName();
			String filePath = item.getValue();
			File f = new File(filePath);
			if (!f.exists()) {
				throw new Exception("文件不存在");
			}
			// index++;
			sb = new StringBuilder();
			sb.append("--" + BOUNDARY + NEWLINE);
			sb.append("Content-Disposition: form-data; name=\"media" + "\"; filename=\"" + name + "\"" + NEWLINE);
			sb.append("Content-Type: application/octet-stream" + NEWLINE);
			sb.append(NEWLINE);
			out.write(sb.toString().getBytes("UTF-8"));

			InputStream in = new FileInputStream(f);
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			in.close();
			out.write(NEWLINE.getBytes("UTF-8"));
		}
	}

	public static <T> T httpRequest(Class<T> type, String requestUrl, String requestMethod, String data) throws KeyManagementException,
			NoSuchAlgorithmException, IOException {
		String result = callHttpServer(requestUrl, requestMethod, data);
		return resultToObj(type, result);
	}

}
