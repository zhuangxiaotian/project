/**
 * 
 */
package topdeep.common.mg.biz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import topdeep.common.mg.biz.common.CommonMgSystemBiz;

/**
 * @author niexin
 *
 */
@Service("topdeep.common.mg.biz.ApplicationBeanPostProcessor")
public class ApplicationBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {

	private Log logger = LogFactory.getLog(getClass());

	@Autowired
	@Qualifier("commonMgSystemBiz")
	private CommonMgSystemBiz commonMgSystemBiz;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if (event.getApplicationContext().getParent() != null) {
			try {
				commonMgSystemBiz.initDefaultAdminUser();
			} catch (Throwable ex) {
				logger.error("commonMgSystemBiz.initDefaultAdminUser() error: " + ex.getMessage(), ex);
			}
			try {
				commonMgSystemBiz.initDefaultPrivilegeGroup();
			} catch (Throwable ex) {
				logger.error("commonMgSystemBiz.initDefaultPrivilegeGroup() error: " + ex.getMessage(), ex);
			}
		}
	}

}
