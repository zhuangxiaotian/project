package topdeep.common.web.action.base;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import topdeep.common.util.ApplicationContextHelper;
import topdeep.common.util.HttpRequestHolder;
import topdeep.common.web.biz.CommonWebSystemBiz;
import topdeep.common.web.biz.CommonWebSystemParamBiz;
import topdeep.common.web.entity.CommonWebSession;
import topdeep.common.web.entity.request.BaseExternalRequest;
import topdeep.common.web.entity.request.BaseRequest;
import topdeep.common.web.entity.response.BaseResponse;

import common.util.StringUtils;

import flexjson.JSONSerializer;

/**
 * @author niexin
 * 
 */
public class BaseAction {

	protected Log log = LogFactory.getLog(getClass());


	@Autowired
	@Qualifier("commonWebSystemBiz")
	protected CommonWebSystemBiz commonWebSystemBiz;

	@Autowired
	@Qualifier("commonWebSystemParamBiz")
	protected CommonWebSystemParamBiz commonWebSystemParamBiz;

	@Autowired
	@Value("#{application['verifyKeys']}")
	protected String verifyKeys;


	protected String checkTipMessage(String tipMessage, String newTipMessage) {
		if (StringUtils.isNullOrEmpty(tipMessage)) {
			return newTipMessage;
		}
		return tipMessage;
	}

	public String getRequestUrlPrefix() {
		HttpServletRequest request = HttpRequestHolder.getRequest();
		// 跳到登录页或者绑定页
		String url = request.getScheme() + "://" + request.getServerName();
		if (request.getServerPort() == 80 || request.getServerPort() == 443) {
			// loginUrl += "/";
		} else {
			url += ":" + request.getServerPort();
		}
		url += request.getContextPath();
		return url;
	}

	public String getRedirectUrl() {
		return "";
	}

	public boolean executeBase(BaseRequest req, BaseResponse res) {
		res.setResult(true, "");
		res.setSkin(commonWebSystemParamBiz.getWebParam().getSkin());
		res.setVersion(commonWebSystemParamBiz.getWebParam().getVersion());
		return res.isSuccess();
	}

	public String getRedirectServerUrl() {
		HttpServletRequest req = HttpRequestHolder.getRequest();

		String url = "";
		if (req.getServerPort() == 80 || req.getServerPort() == 443) {
			url = commonWebSystemParamBiz.getApplicationParam().getRedirectSchema() + "://" + req.getServerName() + req.getContextPath();
		} else {
			url = commonWebSystemParamBiz.getApplicationParam().getRedirectSchema() + "://" + req.getServerName() + ":" + req.getServerPort()
					+ req.getContextPath();
		}

		return url;
	}

	public boolean execute(BaseExternalRequest req, BaseResponse res) {
		executeBase(req, res);
		res.setLogin(getSession().isLogin());
		return res.isSuccess();
	}

	/**
	 * 主要是校验参数
	 */
	public boolean checkExternalRequest(BaseExternalRequest req, BaseResponse res) {
		return res.isSuccess();
	}


	public String getSignmsg(TreeMap<String, String> paramMap) {
		if (paramMap == null) {
			return "";
		}
		StringBuffer sb = new StringBuffer();
		for (Iterator<Entry<String, String>> it = paramMap.entrySet().iterator(); it.hasNext();) {
			Entry<String, String> entry = it.next();
			if (entry.getKey().equals("p99")) {
				continue;
			}
			sb.append(entry.getKey()).append(entry.getValue());
		}
		return sb.toString();
	}

	public String getSignmsg(TreeMap<String, String> paramMap, String key) {
		if (paramMap == null) {
			return "";
		}
		String signmsg = getSignmsg(paramMap);
		try {
			signmsg = new common.util.MD5(signmsg + key, "utf-8").getMd5String();
		} catch (UnsupportedEncodingException e) {
			log.error("无法使用utf-8编码进行MD5计算: " + signmsg);
			signmsg = new common.util.MD5(signmsg + key).getMd5String();
		}
		return signmsg;
	}

	public CommonWebSession getSession() {
		return (CommonWebSession) ApplicationContextHelper.getBean("commonWebSession");
	}


	public void debugObject(Object obj) {
		String out = new JSONSerializer().exclude("*.class").exclude("*.queryPwd1").exclude("*.queryPwd2").exclude("*.tradePwd1").exclude("*.tradePwd2")
				.deepSerialize(obj);
		log.debug("\n" + out);
	}


	public String getTheme() {
		return "";
	}

	protected String dateFormateYMD(Date date) {
		if (date == null) {
			return "";
		}
		return StringUtils.dateTimeToString(date, "yyyyMMdd");
	}

	public String getVerifyKeys() {
		return verifyKeys;
	}

	public void setVerifyKeys(String verifyKeys) {
		this.verifyKeys = verifyKeys;
	}


}
