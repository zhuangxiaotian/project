package topdeep.common.mg.action.base;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Hashtable;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.common.mg.biz.common.CommonMgSystemBiz;
import topdeep.common.mg.biz.common.CommonMgSystemParamBiz;
import topdeep.common.mg.entity.request.BaseRequest;
import topdeep.common.mg.entity.response.BaseResponse;

import common.cache2.Cache;
import common.util.HttpUtils;
import common.util.StringUtils;
import common.web.WebRuntime;

public class BaseAction {
	/** 重定向 **/
	protected static final String REDIRECT = "redirect:";

	protected Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("cache30")
	protected Cache cache30;

	@Autowired
	@Qualifier("commonMgSystemParamBiz")
	protected CommonMgSystemParamBiz commonMgSystemParamBiz;

	@Autowired
	@Qualifier("commonMgSystemBiz")
	protected CommonMgSystemBiz commonMgSystemBiz;

	@Autowired
	@Qualifier("webUserRuntimeBiz")
	protected WebRuntime webUserRuntimeBiz;

	public boolean execute(BaseRequest req, BaseResponse res) {
		return execute(req, res, false);
	}

	public boolean execute(BaseRequest req, BaseResponse res, boolean needLogin, boolean isAjaxRequest) {
		req.setAjaxRequest(isAjaxRequest);
		res.setResult(true, "");
		res.setMainSkin(commonMgSystemParamBiz.getCommonMgApplicationParam().getMainSkin());
		res.setSkin(commonMgSystemParamBiz.getCommonMgApplicationParam().getSkin());
		res.setVersion(commonMgSystemParamBiz.getCommonMgApplicationParam().getVersion());
		res.setLoginName(webUserRuntimeBiz.getLoginUserName());
		res.getTemplate().setMain(commonMgSystemParamBiz.getCommonMgApplicationParam().getMainTemplate());
		res.getTemplate().setNav(commonMgSystemParamBiz.getCommonMgApplicationParam().getNavTemplate());
		res.getTemplate().setHead(commonMgSystemParamBiz.getCommonMgApplicationParam().getHeadTemplate());
		res.getTemplate().setPage(commonMgSystemParamBiz.getCommonMgApplicationParam().getPageTemplate());
		res.setNavQueryUrl(commonMgSystemParamBiz.getCommonMgApplicationParam().getNavQueryUrl());
		res.setAppName(commonMgSystemParamBiz.getCommonMgApplicationParam().getAppName());
		req.checkInput(res);
		if (needLogin && !isLogin()) {
			res.setResult(false, "");
			String url = "/h/login.action";
			String currentVisitUrl = (String) webUserRuntimeBiz.get("currentVisitUrl");
			if (!isAjaxRequest && !StringUtils.isNullOrEmpty(currentVisitUrl)) {
				url += "?returnUrl=" + HttpUtils.urlEncode(currentVisitUrl);
			}
			res.setRedirectUrl(url);
		}

		return res.isSuccess();
	}

	public boolean execute(BaseRequest req, BaseResponse res, boolean isAjaxRequest) {
		return execute(req, res, true, isAjaxRequest);
	}

	/**
	 * 处理用户选中的权限值,用户选中的权限值是模块加单选的值，放到数据库的时候合并一下，省点地方
	 * 
	 * @param userSelectPrivileges
	 * @return
	 */
	public String dealUploadPrivileges(String userSelectPrivileges) {
		if (StringUtils.isNullOrEmpty(userSelectPrivileges)) {
			return "";
		}
		Map<Integer, Integer> funcMap = new Hashtable<Integer, Integer>();
		String[] values = userSelectPrivileges.split(",");
		for (String item : values) {
			if (StringUtils.isNullOrEmpty(item)) {
				continue;
			}
			int value = Integer.parseInt(item);
			int func = value >> 8;
			int operateValue = value & 0xff;
			if (funcMap.containsKey(func)) {
				int oldValue = funcMap.get(func);
				operateValue = operateValue | oldValue;
				funcMap.remove(func);
			}
			funcMap.put(func, operateValue);
		}
		// 此时Map中是整理过的权限值，输出即可
		String ret = "";
		for (Integer func : funcMap.keySet()) {
			int operateValue = funcMap.get(func);
			int value = (func << 8) + operateValue;
			if (!StringUtils.isNullOrEmpty(ret)) {
				ret += ",";
			}
			ret += value;
		}
		return ret;
	}

	protected boolean isLogin() {
		return true;
	}

	protected boolean checkPrivilege(BaseResponse res, int func, int operate) {
		boolean hasPrivilege = webUserRuntimeBiz.hasPrivilege(func, operate);
		if (!hasPrivilege) {
			res.setResult(false, "没有管理权限");
			res.setRedirectUrl(commonMgSystemParamBiz.getCommonMgApplicationParam().getNoPrivilegeTemplate());
		}
		return res.isSuccess();
	}

	public String encodeId(String id) {
		String result = id;
		try {
			result = URLEncoder.encode(id, "utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getStackTrace());
		}
		return result;
	}

	public String decodeId(String id) {
		String result = id;
		try {
			result = URLDecoder.decode(id, "utf-8");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getStackTrace());
		}
		return result;
	}

	/**
	 * 
	 } formatNull:(将null转为空串). <br/>
	 * 
	 * @author develop
	 * @param str
	 * @return
	 *
	 */
	protected String formatNull(String str) {
		if (str == null) {
			return "";
		} else {
			return str;
		}
	}

	protected String getSkin() {
		return commonMgSystemParamBiz.getCommonMgApplicationParam().getSkin();
	}

}
