package topdeep.common.mg.entity.response;

import topdeep.common.mg.web.view.PageView;

/**
 * @author niexin
 *
 */
public class PageResponse extends BaseResponse {
	private PageView pageData = new PageView();

	/**
	 * @return the pageData
	 */
	public PageView getPageData() {
		return pageData;
	}

}
