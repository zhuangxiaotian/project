package topdeep.common.mg.entity.params;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class CommonBuildParam {
	/**
	 * 站点的生成位置
	 */
	@Value("#{application['cms.siteBuildPath']?:'site'}")
	private String siteBuildPath = "site";

	/**
	 * 预览时站点的生成位置
	 */
	@Value("#{application['cms.sitePreviewBuildPath']?:'preview'}")
	private String sitePreviewBuildPath = "preview";

	/**
	 * 预览时站点的访问位置
	 */
	@Value("#{application['cms.sitePreivewVisitPath']?:'http://localhost:8092/fund-mg-web/preview'}")
	private String sitePreivewVisitPath = "http://localhost:8092/fund-mg-web/preview";

	/**
	 * 站点的sha1的生成位置
	 */
	@Value("#{application['cms.siteBuildPath']?:'site_sha1'}")
	private String siteBuildSha1Path = "site_sha1";

	/**
	 * @return the siteBuildPath
	 */
	public String getSiteBuildPath() {
		return siteBuildPath;
	}

	/**
	 * @return the siteBuildSha1Path
	 */
	public String getSiteBuildSha1Path() {
		return siteBuildSha1Path;
	}

	/**
	 * @return the sitePreviewBuildPath
	 */
	public String getSitePreviewBuildPath() {
		return sitePreviewBuildPath;
	}

	/**
	 * @return the sitePreivewVisitPath
	 */
	public String getSitePreivewVisitPath() {
		return sitePreivewVisitPath;
	}
}
