package topdeep.commonfund.biz.gateway.impl;

import topdeep.commonfund.biz.gateway.FundBiz_u00;
import topdeep.commonfund.entity.ClientSession;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryInput;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryOutput;
import topdeep.commonfund.entity.ds.def.DsTransactionsAccountQueryOutputDetail;
import topdeep.commonfund.entity.gateway.def.ISFundBuyInfoQueryInput;
import topdeep.commonfund.entity.gateway.def.ISFundBuyInfoQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISFundShareListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISFundShareListQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISFundTransactionsAccountDetail;
import topdeep.commonfund.entity.gateway.def.ISFundTransactionsFeeQueryInput;
import topdeep.commonfund.entity.gateway.def.ISFundTransactionsFeeQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISIncomeChangeListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISIncomeChangeListQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISPasswordModifyInput;
import topdeep.commonfund.entity.gateway.def.ISPasswordModifyOutput;
import topdeep.commonfund.entity.gateway.def.ISTransactionsAccountListQueryInput;
import topdeep.commonfund.entity.gateway.def.ISTransactionsAccountListQueryOutput;

public class FundBiz_u00_impl extends FundBizImplBase implements FundBiz_u00 {

	public ISPasswordModifyOutput passwordModify(ISPasswordModifyInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISTransactionsAccountListQueryOutput transactionsAccountListQuery(ISTransactionsAccountListQueryInput inputParam) {
		ISTransactionsAccountListQueryOutput output = new ISTransactionsAccountListQueryOutput();
		ClientSession session = getSession(inputParam);
		DsTransactionsAccountQueryInput input = new DsTransactionsAccountQueryInput();
		input.setCustomerId(session.getHundsunSessionKey());
		DsTransactionsAccountQueryOutput out = dsDao.transactionsAccountQuery(input);
		for (DsTransactionsAccountQueryOutputDetail item : out.getDetail()) {
			ISFundTransactionsAccountDetail detail = new ISFundTransactionsAccountDetail();
			detail.setBankAccount(item.getBankAccount());
			detail.setBankName(item.getBankName());
			detail.setBankNo(item.getBankNo());
			detail.setTransactionsAccount(item.getTransactionAccount());
			output.getDetail().add(detail);
		}
		return output;
	}

	public ISFundShareListQueryOutput fundShareListQuery(ISFundShareListQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISIncomeChangeListQueryOutput incomeChangeListQuery(ISIncomeChangeListQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISFundBuyInfoQueryOutput fundBuyInfoQuery(ISFundBuyInfoQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISFundTransactionsFeeQueryOutput fundTransactionsFeeQuery(ISFundTransactionsFeeQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
