package topdeep.commonfund.mg.entity.request;

import topdeep.common.mg.entity.request.PageRequest;
import topdeep.commonfund.entity.db.FundBankCardBin;
import topdeep.commonfund.mg.entity.response.BankCardBinResponse;

public class BankCardBinRequest extends PageRequest{

	private FundBankCardBin bankCardBin;

	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FundBankCardBin getBankCardBin() {
		return bankCardBin;
	}

	public void setBankCardBin(FundBankCardBin bankCardBin) {
		this.bankCardBin = bankCardBin;
	}
	
	public void check(BankCardBinResponse res){
		res.checkStringEmpty(bankCardBin.getBankNo(), "银行代码不能为空");
		res.checkStringEmpty(bankCardBin.getBankName(), "银行名称不能为空");
		res.checkStringEmpty(bankCardBin.getBankCardLength(), "卡长度不能为空");
		res.checkStringEmpty(bankCardBin.getBankCardBin(), "卡Bin不能为空");
	}
}
