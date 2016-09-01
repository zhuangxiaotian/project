/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import topdeep.commonfund.entity.ClientSession;

import common.cache2.Cache;
import common.cache2.CacheException;

/**
 * @author niexin 管理客户端登录上来的Session 每个客户连接成功后，分配一个Session，Session主要用来保存客户的相关信息
 */
public class SessionManage {
	private org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(SessionManage.class);
	/**
	 * 用来放Session值的缓存
	 */
	@Autowired
	@Qualifier("sessionCache")
	private Cache sessionCache;

	public ClientSession getClient(String sessionKey) {
		try {
			if (sessionKey == null)
				return null;
			return (ClientSession) sessionCache.get(sessionKey);
		} catch (Exception e) {
			log.error("get client user error, sessionkey is " + sessionKey, e);
		}
		return null;
	}

	public void removeClient(String sessionKey) {
		try {
			if (sessionKey != null)
			sessionCache.remove(sessionKey);
		} catch (Exception e) {
			log.error("get client user error, sessionkey is " + sessionKey, e);
		}
	}

	public void setClient(String sessionKey, ClientSession client) {
		try {
			sessionCache.put(sessionKey, client);
		} catch (CacheException e) {
			log.error("put client user error, sessionkey is " + sessionKey, e);
			// 这里要抛出异常
		}
	}

	/**
	 * @return the sessionCache
	 */
	public Cache getSessionCache() {
		return sessionCache;
	}

	/**
	 * @param sessionCache the sessionCache to set
	 */
	public void setSessionCache(Cache sessionCache) {
		this.sessionCache = sessionCache;
	}
}
