/**
 * 
 */
package topdeep.commonfund.biz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import topdeep.commonfund.biz.gateway.impl.FundBizImplCommon;

/**
 * @author niexin
 *
 */
@Service
public class ApplicationBeanPostProcessor implements ApplicationListener<ContextRefreshedEvent> {

	private Log logger = LogFactory.getLog(getClass());

	@Autowired(required = false)
	@Qualifier("fundBizImplCommon")
	protected FundBizImplCommon fundBizImplCommon;
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// if (event.getApplicationContext().getParent() != null) {
			try {
			fundBizImplCommon.init();
			} catch (RuntimeException ex) {
				logger.error(ex.getMessage(), ex);
			}
		// }
	}



}
