package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.response.BaseResponse;
import topdeep.common.mg.entity.view.StatDetailView;

public class CustomerLogStatisticeResponse extends BaseResponse {

	/**
	 * 统计值列表
	 */
	private List<StatDetailView> statValueList = new ArrayList<StatDetailView>();

	/**
	 * @return the statValueList
	 */
	public List<StatDetailView> getStatValueList() {
		return statValueList;
	}

	/**
	 * @param statValueList the statValueList to set
	 */
	public void setStatValueList(List<StatDetailView> statValueList) {
		this.statValueList = statValueList;
	}

}
