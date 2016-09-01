/**
 * 
 */
package topdeep.common.web.view.freemarker;

import java.net.URL;

import common.util.StringUtils;

import freemarker.cache.ClassTemplateLoader;

/**
 * @author niexin
 *
 */
public class TopdeepTemplateLoader extends ClassTemplateLoader {

	public TopdeepTemplateLoader(Class loaderClass, String path) {
		super(loaderClass, path);
	}

	protected URL getURL(String name) {
		String newName = name;
		if (!StringUtils.isNullOrEmpty(newName)) {
			if (!newName.startsWith("/")) {
				newName = "/" + newName;
			}
		}
		return super.getURL(newName);
	}
}
