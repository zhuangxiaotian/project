/**
 * 
 */
package topdeep.common.web.web.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import topdeep.common.web.biz.CommonWebSystemParamBiz;
import topdeep.common.web.entity.response.BaseResponse;


/**
 * @author niexin
 *
 */
public class SimpleMappingExceptionResolver extends org.springframework.web.servlet.handler.SimpleMappingExceptionResolver {

	@Autowired
	private CommonWebSystemParamBiz webSystemParamBiz;
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.SimpleMappingExceptionResolver#getModelAndView(java.lang.String, java.lang.Exception, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected ModelAndView getModelAndView(String viewName, Exception ex, HttpServletRequest request) {
		logger.error(ex.getMessage(), ex);
		request.setAttribute("visit_exception", ex.getMessage());
		request.setAttribute("result_view", viewName);
		return super.getModelAndView(viewName, ex, request);
	}

	protected ModelAndView getModelAndView(String viewName, Exception ex) {
		ModelAndView mv = super.getModelAndView(viewName, ex);
		BaseResponse res = new BaseResponse();
		res.setTitle("信息提示");
		res.setSkin(webSystemParamBiz.getWebParam().getSkin());
		res.setTheme(webSystemParamBiz.getWebParam().getTheme());
		res.setVersion(webSystemParamBiz.getWebParam().getVersion());
		mv.addObject("res", res);
		return mv;
	}

}
