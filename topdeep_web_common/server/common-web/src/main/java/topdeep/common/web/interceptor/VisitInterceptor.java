package topdeep.common.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import topdeep.common.util.ApplicationContextHelper;
import topdeep.common.web.action.base.BaseAction;
import topdeep.common.web.biz.CommonWebSystemBiz;
import topdeep.common.web.biz.CommonWebSystemParamBiz;
import topdeep.common.web.entity.CommonWebSession;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
public class VisitInterceptor extends HandlerInterceptorAdapter {

	private static Log logger = LogFactory.getLog(VisitInterceptor.class);

	private Log timeLogger = LogFactory.getLog("topdeep.common.timer");

	@Autowired
	private CommonWebSystemBiz webSystemBiz;

	@Autowired
	private CommonWebSystemParamBiz webSystemParamBiz;

	private String getServerUrl(HttpServletRequest req) {

		String serverPort = "";
		if (req.getServerPort() != 80 && req.getServerPort() != 443) {
			serverPort = ":" + req.getServerPort();
		}
		String contentPath = req.getContextPath();
		if (contentPath.endsWith("/")) {
			contentPath = contentPath.substring(0, contentPath.length() - 1);
		}
		return webSystemParamBiz.getApplicationParam().getRedirectSchema() + "://" + req.getServerName() + serverPort + contentPath;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle (javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		long startTime = System.currentTimeMillis();
		HandlerMethod method = (HandlerMethod) handler;
		String methodName = method.getBeanType().getSimpleName() + "." + method.getMethod().getName();
		request.setAttribute("startTime", startTime);
		request.setAttribute("executeMethod", methodName);
		String url = request.getRequestURI();
		BaseAction action = null;
		// 处理一下Skin的问题
		if (method.getBean() instanceof BaseAction) {
			action = (BaseAction) method.getBean();
		}

		// if (!session.isLogin() && !reqUri.endsWith("ajaxLogin.action")
		// if (reqUri.endsWith("signIn.action")) {
		// response.sendRedirect(context + "h/signIn.action");
		// }
		// else {
		// response.sendRedirect(context + "home/login.action");
		// }
		// return false;
		// }
		logger.debug("execute [" + methodName + "]");
		return super.preHandle(request, response, handler);
	}

	/**
	 * 判断ajax请求
	 * 
	 * @param request
	 * @return
	 */
	private boolean isAjax(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") != null && "XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#postHandle (javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if (modelAndView != null) {
			request.setAttribute("result_view", modelAndView.getViewName());
		}
		super.postHandle(request, response, handler, modelAndView);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter# afterCompletion(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		response.setHeader("Cache-Control", "no-cache"); // HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setDateHeader("Expires", 0); // prevents caching at the proxy server
		long startTime = (Long) request.getAttribute("startTime");
		String methodName = (String) request.getAttribute("executeMethod");
		boolean isHeart = "Heart.execute".equals(methodName);
		if (isHeart) {
			super.afterCompletion(request, response, handler, ex);
			return;
		}
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - startTime;

		String visit_exception = (String) request.getAttribute("visit_exception");
		String result_view = (String) request.getAttribute("result_view");
		CommonWebSession session = (CommonWebSession) ApplicationContextHelper.getBean("commonWebSession");
		String p1 = session.getP1();
		String p3 = session.getP3();
		if (StringUtils.isNullOrEmpty(session.getP1()) || StringUtils.isNullOrEmpty(session.getP3())) {
			timeLogger.debug("execute [" + methodName + "]=" + executeTime + "ms, no p1 and p3");
			p1 = "";
			p3 = "";
		}

		try {
			String serverName = request.getServerName().toLowerCase();
//			VisiterLog log = new VisiterLog();
//			log.setVisitSrc(currSiteType.toString());
//			;
//			log.setChannel(request.getParameter("p2"));
//			log.setClientType(request.getParameter("p6"));
//
//			log.setLogIp(getRemoteIp(request));
//
//			StringBuilder paramsBuilder = new StringBuilder();
//			String para;
//			Enumeration paramNames = request.getParameterNames();
//			while (paramNames.hasMoreElements()) {
//				String paramName = (String) paramNames.nextElement();
//
//				String[] paramValues = request.getParameterValues(paramName);
//				if (paramValues.length == 1) {
//					String paramValue = paramValues[0];
//					if (paramValue.length() != 0) {
//
//						if (paramName.toUpperCase().contains("PASSWORD") || paramName.toUpperCase().contains("PWD")
//								|| paramName.toUpperCase().contains("NEWPWD")) {
//							paramValue = "******";
//						}
//						para = paramName + "=" + paramValue + "&";
//						if ((paramsBuilder.length() + para.length()) > 1000) {
//
//							break;
//						}
//						paramsBuilder.append(para);
//
//					}
//				}
//			}
//			log.setLogParam(paramsBuilder.toString());
//			log.setLogReferUrl(request.getHeader("Referer"));
//			log.setLogSessionId(request.getSession(true).getId());
//			log.setLogTime(new Date());
//			log.setLogUa(getRequestUA(request));
//			log.setLogUrl(request.getRequestURI());
//			log.setMobilePhone(request.getParameter("p11"));
//			log.setNetwork(request.getParameter("p9"));
//			log.setOpenid(p3);
//			log.setOs(request.getParameter("p7"));
//			log.setOsVersion(request.getParameter("p8"));
//			log.setOther("");
//			log.setScreen(request.getParameter("p12"));
//			log.setService(request.getParameter("p10"));
//
//			log.setId(UUIDGenerator.getUUID24());
//			log.setVisitResult("0");
//			if (visit_exception != null) {
//				log.setVisitResult("1");
//				log.setVisitFailReason(visit_exception);
//				logger.error("visit fail: " + visit_exception);
//			}
//			log.setVisitResultView(result_view);
//			log.setProcessTime((int) executeTime);
//			webSystemBiz.visiterLogInsert(log);
		} catch (Exception e1) {
			logger.error("记录访问日志异常: " + e1.getMessage(), e1);
		}

		long totalTime = System.currentTimeMillis();
		long logExecuteTime = totalTime - endTime;
		long totalExecuteTime = totalTime - startTime;
		timeLogger.debug("execute [" + methodName + "]=" + executeTime + "ms,log=" + logExecuteTime + ",total=" + totalExecuteTime);
		super.afterCompletion(request, response, handler, ex);
	}

	private String getRequestUA(HttpServletRequest request) {
		String ua = request.getHeader("user-agent");
		if (ua == null) {
			ua = "";
		}
		return ua;
	}

	private String getRemoteIp(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
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
		return ip;
	}

}
