package topdeep.commonfund.mg.entity.response;

import java.util.List;

import topdeep.common.mg.entity.response.PageResponse;
import topdeep.commonfund.entity.db.FundBankCardBin;

public class BankCardBinResponse extends PageResponse{

	private String id;

	private Integer rowVersion;
	
	private List<FundBankCardBin> fundBankCardBinList;

	private String flag;
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

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

	public List<FundBankCardBin> getFundBankCardBinList() {
		return fundBankCardBinList;
	}

	public void setFundBankCardBinList(List<FundBankCardBin> fundBankCardBinList) {
		this.fundBankCardBinList = fundBankCardBinList;
	}
}
