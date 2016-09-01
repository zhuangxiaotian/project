/**
 * 
 */
package topdeep.commonfund.biz.gateway.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import topdeep.common.biz.common.CommonSystemBiz;
import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.entity.db.SystemBaseInfoExample;

/**
 * @author niexin
 *
 */
@Service
public class FundBizImplCommon {

	/** Logger available to subclasses */
	protected final Log logger = LogFactory.getLog(getClass());


	// /**
	// * 直销的字典
	// */
	// private Map<String, Map<String, String>> tradeDict = new TreeMap<String, Map<String, String>>();

	@Autowired(required = false)
	@Qualifier("commonSystemBiz")
	private CommonSystemBiz systemBiz;

	private Map<String, Map<String, SystemBaseInfo>> baseInfoDict = new TreeMap<String, Map<String, SystemBaseInfo>>();

	public void init() {
		// 初始化内部的字典表
		try {
			baseInfoDict.clear();
			List<SystemBaseInfo> list = systemBiz.systemBaseInfoSelectObjects(new SystemBaseInfoExample());
			for (SystemBaseInfo item : list) {
				if (!isNullOrSpace(item.getCodeDesc()) && "0".equals(item.getCodeDesc())) {
					continue;
				}
				Map<String, SystemBaseInfo> infoMap = baseInfoDict.get(item.getCodeType());
				if (infoMap == null) {
					infoMap = new TreeMap<String, SystemBaseInfo>();
					baseInfoDict.put(item.getCodeType(), infoMap);
				}
				if (!infoMap.containsKey(item.getCodeId())) {
					infoMap.put(item.getCodeId(), item);
				}
			}
			logger.info("初始化内部字典成功");
		} catch (Exception ex) {
			logger.error("初始化内部字典失败", ex);
		}
	}

	public Set<String> getBaseInfoKey() {
		return baseInfoDict.keySet();
	}

	public Map<String, SystemBaseInfo> getBaseInfoMap(String baseInfoType) {
		if (baseInfoDict.containsKey(baseInfoType)) {
			Map<String, SystemBaseInfo> subDict = baseInfoDict.get(baseInfoType);
			return subDict;
		}
		return new TreeMap<String, SystemBaseInfo>();
	}

	public String getBaseInfoName(String baseInfoType, String baseInfoId) {
		if (isNullOrSpace(baseInfoId)) {
			return "";
		}
		if (baseInfoDict.containsKey(baseInfoType)) {
			Map<String, SystemBaseInfo> subDict = baseInfoDict.get(baseInfoType);
			if (subDict.containsKey(baseInfoId)) {
				return subDict.get(baseInfoId).getCodeName();
			}
		} else {
			logger.warn("can't find value for " + baseInfoType + ":" + baseInfoId);
		}
		return baseInfoId;
	}

	public boolean isNullOrSpace(String value) {
		if (value == null) {
			return true;
		}
		if (value.trim().length() == 0) {
			return true;
		}
		return false;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

}
