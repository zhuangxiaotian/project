/**
 * 
 */
package topdeep.commonfund.entity.params;

import org.springframework.stereotype.Component;

import topdeep.common.entity.params.BaseSystemParam;

/**
 * @author niexin
 *
 */
@Component
public class CommonFundDbParam extends BaseSystemParam {
	private String dbVersion;

	/**
	 * @return the dbVersion
	 */
	public String getDbVersion() {
		return dbVersion;
	}

	/**
	 * @param dbVersion the dbVersion to set
	 */
	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}
}
