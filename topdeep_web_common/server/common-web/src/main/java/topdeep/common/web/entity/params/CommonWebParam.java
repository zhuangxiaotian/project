package topdeep.common.web.entity.params;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import topdeep.common.entity.params.BaseSystemParam;


/**
 * @author niexin
 *
 */
@Component
public class CommonWebParam extends BaseSystemParam {

	@Value("#{application['skin']?:'default'}")
	private String skin;

	@Value("#{application['theme']?:''}")
	private String theme;

	@Value("#{application['version']?:''}")
	private String version;

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}
