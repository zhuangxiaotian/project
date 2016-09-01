/**
 * 
 */
package topdeep.common.biz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.impl.CommonSystemBiz;
import topdeep.common.biz.cronjob.CronJobBiz;

/**
 * @author niexin
 *
 */
@Service("topdeep.common.biz.ApplicationBeanPostProcessor")
public class ApplicationBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {

	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("cronJobBiz")
	private CronJobBiz cronJobBiz;
	
	@Autowired
	@Qualifier("commonSystemBiz")
	private CommonSystemBiz commonSystemBiz;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() != null) {
			try {
				cronJobBiz.init();
				commonSystemBiz.checkDbVersion();
			} catch (Throwable ex) {
				logger.error("cronJobBiz.init() error: " + ex.getMessage(), ex);
			}
		}
	}

}
