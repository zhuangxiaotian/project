/**
 * 
 */
package topdeep.common.web.view.freemarker;

import java.util.List;

import freemarker.cache.TemplateLoader;

/**
 * @author niexin
 *
 */
public class FreeMarkerConfigurer extends org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer {

	/**
	 * This implementation registers an additional ClassTemplateLoader for the Spring-provided macros, added to the end of the list.
	 */
	@Override
	protected void postProcessTemplateLoaders(List<TemplateLoader> templateLoaders) {
		super.postProcessTemplateLoaders(templateLoaders);
		templateLoaders.add(new TopdeepTemplateLoader(FreeMarkerConfigurer.class, ""));
		logger.info("TopdeepTemplateLoader for Spring macros added to FreeMarker configuration");
	}

}
