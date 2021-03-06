/**
 * 
 */
package topdeep.common.entity.params;

import org.springframework.stereotype.Component;

/**
 * @author niexin
 *
 */
@Component
public class CommonDbParam extends BaseSystemParam {
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
