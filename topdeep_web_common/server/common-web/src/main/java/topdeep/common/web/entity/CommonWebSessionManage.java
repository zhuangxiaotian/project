/**
 * 
 */
package topdeep.common.web.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import common.util.StringUtils;

/**
 * @author niexin
 *
 */
@Component("commonWebSessionManage")
public class CommonWebSessionManage {
	
	private Log logger = LogFactory.getLog(getClass());
	
	private List<CommonWebSession> sessionList = new ArrayList<CommonWebSession>();
	
	public void sessionCreate(CommonWebSession session) {
		sessionList.add(session);
		logger.debug("receive session created!");
	} 
	
	public void sessionDestory(CommonWebSession session) {
		sessionList.remove(session);
		logger.debug("receive session destory!");
	}

	public CommonWebSession findSessionByP1P3(String p1, String p3) {
		if(StringUtils.isNullOrEmpty(p1) || StringUtils.isNullOrEmpty(p3)){
			return null;
		}
		for (CommonWebSession item : sessionList) {
			if(p1.equals(item.getP1()) && p3.equals(item.getP3())){
				return item;
			}
		}
		return null;
	}
	
	/**
	 * @return the sessionList
	 */
	public List<CommonWebSession> getSessionList() {
		return sessionList;
	}
}
