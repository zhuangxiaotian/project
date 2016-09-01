/**
 * 
 */
package topdeep.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author niexin
 *
 */
public class HttpRequestHolder {

	private static ThreadLocal<HttpServletRequest> reqLocal =new ThreadLocal<HttpServletRequest>();
	
	/**
	 * 
	 */
	public HttpRequestHolder() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setRequest(HttpServletRequest req){
		reqLocal.set(req);
	}
	
	public static HttpServletRequest getRequest(){
		return reqLocal.get();
	}

}
