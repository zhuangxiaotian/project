package topdeep.common.web.entity.response;

import topdeep.common.web.entity.view.PageView;

/**
 * 
 * @author shidewen
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
