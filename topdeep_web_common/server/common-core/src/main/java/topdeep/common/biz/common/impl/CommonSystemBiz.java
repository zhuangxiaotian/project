package topdeep.common.biz.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.util.StringUtils;
import topdeep.common.entity.constant.DbVersion;
import topdeep.common.entity.params.CommonDbParam;

/**
 * 
 * @author shidewen
 * 
 */
@Service("commonSystemBiz")
public class CommonSystemBiz extends BaseBiz implements topdeep.common.biz.common.CommonSystemBiz {

	@Autowired
	private CommonDbParam dbParam;
	
	/**
	 * 
	 */
	public CommonSystemBiz() {
		// TODO Auto-generated constructor stub
	}

	public void checkDbVersion() {
		String verInDb = dbParam.getDbVersion();
		String verInSys = DbVersion.Current;
		if (versionCompare(verInSys, verInDb) > 0) {
			throw new RuntimeException("数据库版本是" + verInDb + ",系统要求版本为:" + verInSys + ",请升级数据库");
		}
	}
	
	private int versionCompare(String ver1, String ver2) {
		if (StringUtils.isNullOrEmpty(ver1)) {
			return -1;
		}
		if (StringUtils.isNullOrEmpty(ver2)) {
			return 1;
		}
		ver1 = ver1.trim();
		ver2 = ver2.trim();
		if (StringUtils.isNullOrEmpty(ver1)) {
			return -1;
		}
		if (StringUtils.isNullOrEmpty(ver2)) {
			return 1;
		}
		if (ver1.equals(ver2)) {
			return 0;
		}
		int mainVer1 = 0;
		int mainVer2 = 0;
		int miniVer1 = 0;
		int miniVer2 = 0;
		String[] vers = ver1.split("\\.");
		if (vers.length > 0) {
			mainVer1 = Integer.parseInt(vers[0]);
		}
		if (vers.length > 1) {
			miniVer1 = Integer.parseInt(vers[1]);
		}
		vers = ver2.split("\\.");
		if (vers.length > 0) {
			mainVer2 = Integer.parseInt(vers[0]);
		}
		if (vers.length > 1) {
			miniVer2 = Integer.parseInt(vers[1]);
		}
		if (mainVer1 < mainVer2) {
			return -1;
		} else if (mainVer1 > mainVer2) {
			return 1;
		} else {
			if (miniVer1 < miniVer1) {
				return -1;
			} else if (miniVer1 > miniVer2) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
