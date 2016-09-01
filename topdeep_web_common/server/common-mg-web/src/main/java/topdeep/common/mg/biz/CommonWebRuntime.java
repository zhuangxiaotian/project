/**
 * 
 */
package topdeep.common.mg.biz;

import common.web.WebRuntime;

/**
 * @author niexin
 *
 */
public interface CommonWebRuntime extends WebRuntime {
	/**
	 * 获得当前访问的Url
	 * 
	 * @return
	 */
	String getCurrentVisitUrl();

	/**
	 * 设置当前访问的Url
	 * 
	 * @param value
	 */
	void setCurrentVisitUrl(String value);

}
