package topdeep.commonfund.biz.gateway.impl;

import topdeep.commonfund.biz.gateway.FundBiz_n0u;
import topdeep.commonfund.entity.ds.def.DsSmsCodeSendInput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeSendOutput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeValidInput;
import topdeep.commonfund.entity.ds.def.DsSmsCodeValidOutput;
import topdeep.commonfund.entity.gateway.def.ISSpeciBuyLimitQueryInput;
import topdeep.commonfund.entity.gateway.def.ISSpeciBuyLimitQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISSpeciFundInfoQueryInput;
import topdeep.commonfund.entity.gateway.def.ISSpeciFundInfoQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISValidInfoSendInput;
import topdeep.commonfund.entity.gateway.def.ISValidInfoSendOutput;
import topdeep.commonfund.entity.gateway.def.ISValidInfoValidInput;
import topdeep.commonfund.entity.gateway.def.ISValidInfoValidOutput;

public class FundBiz_n0u_impl extends FundBizImplBase implements FundBiz_n0u {

	public ISValidInfoSendOutput validInfoSend(ISValidInfoSendInput inputParam) {
		ISValidInfoSendOutput output = new ISValidInfoSendOutput();
		try {
			DsSmsCodeSendInput input = new DsSmsCodeSendInput();
			input.setBankAccount(inputParam.getBankAccount());
			input.setCapitalMode(inputParam.getPayseatNo());
			input.setBankNo(inputParam.getBankNo());
			input.setMobile(inputParam.getTarget());
			input.setCustName(inputParam.getCustName());
			input.setIdNo(inputParam.getIdNo());
			input.setIdType(inputParam.getIdType());
			DsSmsCodeSendOutput out = dsDao.smsCodeSend(input);
			setSuccess(output);
		} catch (Exception e) {
			setCodeMsg(output, e);
		}
		return output;
	}

	public ISSpeciBuyLimitQueryOutput speciBuyLimitQuery(ISSpeciBuyLimitQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISSpeciFundInfoQueryOutput speciFundInfoQuery(ISSpeciFundInfoQueryInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 验证验证码
	 */
	public ISValidInfoValidOutput validInfoValid(ISValidInfoValidInput inputParam) {
		ISValidInfoValidOutput output = new ISValidInfoValidOutput();
		try {
			DsSmsCodeValidInput input = new DsSmsCodeValidInput();
			input.setBankAccount(inputParam.getBankAccount());
			input.setCapitalMode(inputParam.getPayseatNo());
			input.setBankNo(inputParam.getBankNo());
			input.setMobile(inputParam.getMobile());
			input.setCustName(inputParam.getUserName());
			input.setIdNo(inputParam.getIdNo());
			input.setIdType(inputParam.getIdType());
			input.setSmsCode(inputParam.getSmsCode());
			DsSmsCodeValidOutput out = dsDao.smsCodeValid(input);
			setSuccess(output);
		} catch (Exception e) {
			setCodeMsg(output, e);
		}
		return output;
	}

}
