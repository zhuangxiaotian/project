package topdeep.commonfund.dao.hundsun.impl.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import topdeep.commonfund.entity.hundsun.HundsunBaseInput;

import common.util.StringUtils;
import common.util.param.ParamSerializeManage;
import common.util.param.SerializeInfo;
import common.util.param.SerializeParamInfo;

import flexjson.JSONDeserializer;
import flexjson.factories.DateObjectFactory;
import flexjson.factories.DoubleObjectFactory;
import flexjson.factories.IntegerObjectFactory;

public class HttpJsonSerialize {

	private final static org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory.getLog(HttpJsonSerialize.class);

	public final static HttpJsonSerialize Instance = new HttpJsonSerialize();

	private HttpJsonSerialize() {
	}

	public void serialize(String merPassword, HundsunBaseInput inputParam, Writer writer) throws IOException, IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		// logger.info("start send  call param info");
		// TreeMap<String, SerializeParamInfo> map = getInputParamMap(inputParam);
		TreeMap<String, String> map = new TreeMap<String, String>();
		inputParam.serializeToMap(map);
		String signmsg = getSignmsg(inputParam, map, merPassword);
		// map.put("signmsg", signmsg);
		String logMsg = "";
		boolean first = true;
		for (Iterator<Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> entry = it.next();
			String msg = "";
			if (!first) {
				msg += "&";
			} else {
				first = false;
			}
			msg += entry.getKey() + "=";
			if (entry.getKey().equalsIgnoreCase("signmsg")) {
				msg += signmsg;
			} else {
				if (entry.getValue() != null) {
					msg += URLEncoder.encode(entry.getValue(), "UTF-8");
				} else {
					msg += URLEncoder.encode("", "UTF-8");
				}
			}
			writer.write(msg);
			if (logger.isDebugEnabled()) {
				if (entry.getKey().equalsIgnoreCase("password")) {
					// logger.debug("password=******");
					logMsg += "&password=******";
				} else if (entry.getKey().equalsIgnoreCase("oldpwd")) {
					// logger.debug("password=******");
					logMsg += "&oldpwd=******";
				} else if (entry.getKey().equalsIgnoreCase("newpwd")) {
					// logger.debug("password=******");
					logMsg += "&newpwd=******";
				} else if (entry.getKey().equalsIgnoreCase("tradepassword")) {
					// logger.debug("password=******");
					logMsg += "&tradepassword=******";
				} else if (entry.getKey().equalsIgnoreCase("tradeAccount")) {
					// logger.debug("password=******");
					logMsg += "&tradeAccount=******";
				} else if (entry.getKey().equalsIgnoreCase("currencyOpenAccountView.password")) {
					// logger.debug("password=******");
					logMsg += "&password=******";
				} else if (entry.getKey().equalsIgnoreCase("currencyOpenAccountView.password2")) {
					// logger.debug("password=******");
					logMsg += "&password=******";
				} else {
					logMsg += msg;
					// logger.debug(msg);
				}
			}
		}
		writer.flush();
		writer.close();
		if (logger.isDebugEnabled()) {
			logger.debug(logMsg);
		}

	}

	public <T> T deserialize(Reader inReader, Class outputParamType) throws IOException {
		BufferedReader reader = new BufferedReader(inReader);
		StringBuffer sb = new StringBuffer();
		String line = reader.readLine();
		while (line != null) {
			sb.append(line);
			if (logger.isDebugEnabled()) {
				logger.debug(line);
			}
			line = reader.readLine();
		}
		reader.close();
		T out = new JSONDeserializer<T>().use(null, outputParamType).use(Double.class, new DoubleObjectFactory()).use(double.class, new DoubleObjectFactory())
				.use(java.util.Date.class, new DateObjectFactory()).use(Integer.class, new IntegerObjectFactory()).use(int.class, new IntegerObjectFactory())
				.deserialize(sb.toString());
		return out;
	}

	private String getFormatValue(HundsunBaseInput inputParam, SerializeParamInfo paramInfo) throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		Object obj = paramInfo.getReadMethod().invoke(inputParam);
		if (obj == null) {
			return "";
		} else {
			if (obj.getClass().getName().equalsIgnoreCase("java.util.Date")) {
				return StringUtils.dateTimeToString((java.util.Date) obj, "yyyyMMdd");
			}
			return obj.toString();
		}
	}

	private String getSignmsg(HundsunBaseInput inputParam, TreeMap<String, String> map, String merPassword) throws IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		sb.append(merPassword);
		for (Iterator<Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> entry = it.next();
			// if(entry.getValue().getParamAttribute().NotNull() && !entry.getValue().getParamAttribute().Name().equalsIgnoreCase("signmsg")){
			if (!entry.getKey().equalsIgnoreCase("signmsg")) {
				// 临时加入，等待
				// if(!entry.getValue().getParamAttribute().Name().equalsIgnoreCase("applyrecordno")){
				// 计算值
				String s = entry.getValue();
				if (s != null && s.length() > 0) {
					sb.append(entry.getKey()).append(s);
					sb1.append(entry.getKey()).append(s);
		}
		// }
	}
		}
		sb.append(merPassword);
		String signmsg = sb.toString();
		// if(logger.isDebugEnabled()){
		// logger.debug("signmsg: ["+sb1.toString()+"]");
		// }
		try {
			signmsg = new common.util.MD5(sb.toString(), "utf-8").getMd5String();
		} catch (UnsupportedEncodingException e) {
			logger.error("无法使用utf-8编码进行MD5计算: " + sb.toString());
			signmsg = new common.util.MD5(sb.toString()).getMd5String();
		}
		/*
		 * if(logger.isDebugEnabled()){ logger.debug("signmsgMD5: ["+signmsg+"]"); }
		 */
		return signmsg;
	}

	private TreeMap<String, SerializeParamInfo> getInputParamMap(HundsunBaseInput inputParam) throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		SerializeInfo info = ParamSerializeManage.Instance.getSerializeInfo(inputParam);
		TreeMap<String, SerializeParamInfo> map = new TreeMap<String, SerializeParamInfo>();
		for (Iterator<Entry<String, SerializeParamInfo>> it = info.getMethods().entrySet().iterator(); it.hasNext();) {
			Entry<String, SerializeParamInfo> entry = it.next();
			if (entry.getKey().startsWith("get")) {
				SerializeParamInfo paramInfo = entry.getValue();
				String paramName = paramInfo.getParamAttribute().Name();
				// String paramValue = paramInfo.getReadMethod().invoke(inputParam).toString();
				map.put(paramName, paramInfo);
	}
		}
		return map;
	}

	private String toLowerFirstLetter(String word) {
		return word.substring(0, 1).toLowerCase() + word.substring(1);
	}

	class WriterInvocationHandler implements InvocationHandler {
		private Appendable appendable;

		public WriterInvocationHandler(Appendable appendable) {
			this.appendable = appendable;
		}

		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			if ("append".equals(method.getName()) && (args.length == 1)) {
				// System.out.print(args[0].toString());
				// logger.info(args[0]);
			}
			return method.invoke(appendable, args);
		}
	}

	public Appendable createAppendable(Appendable appendable) {
		return (Appendable) (Proxy.newProxyInstance(Appendable.class.getClassLoader(), new Class[] {
			Appendable.class
		}, new WriterInvocationHandler(appendable)));
		// return (Appendable)(Proxy.newProxyInstance(Appendable.class.getClassLoader(), new Class[]{Appendable.class}, new
		// WriterInvocationHandler(appendable)));
	}

}
