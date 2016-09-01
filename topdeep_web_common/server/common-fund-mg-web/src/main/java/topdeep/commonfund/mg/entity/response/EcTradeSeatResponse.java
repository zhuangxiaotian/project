package topdeep.commonfund.mg.entity.response;

import java.util.ArrayList;
import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundEcTradeSeat;

public class EcTradeSeatResponse extends PageResponse {

	private List<FundEcTradeSeat> ecTradeSeatList = new ArrayList<FundEcTradeSeat>();

	private String id;

	private Integer rowVersion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(Integer rowVersion) {
		this.rowVersion = rowVersion;
	}

	public List<FundEcTradeSeat> getEcTradeSeatList() {
		return ecTradeSeatList;
	}

	public void setEcTradeSeatList(List<FundEcTradeSeat> ecTradeSeatList) {
		this.ecTradeSeatList = ecTradeSeatList;
	}

}
