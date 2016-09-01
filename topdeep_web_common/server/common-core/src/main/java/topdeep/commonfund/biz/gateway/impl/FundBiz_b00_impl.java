package topdeep.commonfund.biz.gateway.impl;

import java.util.Map;

import topdeep.common.entity.db.SystemBaseInfo;
import topdeep.common.util.UUIDGenerator;
import topdeep.commonfund.biz.gateway.FundBiz_b00;
import topdeep.commonfund.entity.ClientSession;
import topdeep.commonfund.entity.ds.def.DsCustInfoQueryInput;
import topdeep.commonfund.entity.ds.def.DsCustInfoQueryOutput;
import topdeep.commonfund.entity.ds.def.DsLoginInput;
import topdeep.commonfund.entity.ds.def.DsLoginOutput;
import topdeep.commonfund.entity.gateway.FundGatewayErrorCode;
import topdeep.commonfund.entity.gateway.def.ISBaseInfoQueryInput;
import topdeep.commonfund.entity.gateway.def.ISBaseInfoQueryOutput;
import topdeep.commonfund.entity.gateway.def.ISBaseInfoQueryOutputDetail;
import topdeep.commonfund.entity.gateway.def.ISLoginInput;
import topdeep.commonfund.entity.gateway.def.ISLoginOutput;
import topdeep.commonfund.entity.gateway.def.ISLogoutInput;
import topdeep.commonfund.entity.gateway.def.ISLogoutOutput;
import topdeep.commonfund.entity.gateway.def.ISSessionUserUpdateInput;
import topdeep.commonfund.entity.gateway.def.ISSessionUserUpdateOutput;
import topdeep.commonfund.entity.gateway.def.ISVersionCheckInput;
import topdeep.commonfund.entity.gateway.def.ISVersionCheckOutput;

import common.util.StringUtils;

/**
 * @author niexin
 * 
 */
public class FundBiz_b00_impl extends FundBizImplBase implements FundBiz_b00 {

	/**
	 * 
	 */
	public FundBiz_b00_impl() {
		// TODO Auto-generated constructor stub
	}

	public ISSessionUserUpdateOutput sessionUserUpdate(ISSessionUserUpdateInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	public ISVersionCheckOutput versionCheck(ISVersionCheckInput inputParam) {
		ISVersionCheckOutput output = new ISVersionCheckOutput();
		try {
			ClientSession client = sessionManage.getClient(inputParam.getZ_sessionKey());
			if (client == null) {
				client = new ClientSession();
				String sessionKey = UUIDGenerator.getUUID24();
				sessionManage.setClient(sessionKey, client);
				output.setSessionKey(sessionKey);
			} else {
				output.setSessionKey(inputParam.getZ_sessionKey());
			}
			setSuccess(output);
		} catch (Exception ex) {
			setCodeMsg(output, ex);
		}
		return output;
	}

	public ISLoginOutput login(ISLoginInput inputParam) {
		ISLoginOutput output = new ISLoginOutput();
		try {
			ClientSession session = getSession(inputParam);
			DsLoginInput input = new DsLoginInput();
			input.setIdNo(inputParam.getLoginAccount());
			input.setIdType(inputParam.getLoginAccountType());
			input.setPassword(inputParam.getPassword());
			input.setZ_tradeType(inputParam.getZ_tradeType());

			// 不查询客户信息
			input.setNeedQueryCustInfo("0");
			// 用户登陆
			DsLoginOutput out = dsDao.login(input);
			// 成功
			if (FundGatewayErrorCode.SUCCESS.equals(out.getCode())) {
				session.setHundsunSessionKey(out.getCustomerId());
				// 登陆接口调用成功，调用客户信息查询接口
				DsCustInfoQueryInput input2 = new DsCustInfoQueryInput();
				input2.setZ_sessionKey(out.getCustomerId());
				input2.setZ_tradeType(inputParam.getZ_tradeType());
				DsCustInfoQueryOutput out1 = dsDao.custInfoQuery(input2);
				if (FundGatewayErrorCode.SUCCESS.equals(out1.getCode())) {
					session.setIdNo(out1.getIdNo());
					session.setIdType(out1.getIdType());
					session.setCustomerNo(out1.getCustNo());
					session.setCustName(out1.getCustName());
					session.setMobile(out1.getMobile());
					output.setIdNo(out1.getIdNo());
					output.setIdType(out1.getIdType());
					output.setCustomerName(out1.getCustName());
					output.setRiskLevel(out1.getCustRiskLevel());
					setSuccess(output);
				} else {
					setCodeMsg(output, out.getCode(), out.getMsg());
				}

			}

            // 登陆接口调用失败
			else {
				setCodeMsg(output, out.getCode(), out.getMsg());
			}

		} catch (Exception e) {
			setCodeMsg(output, e);
		}
		return output;
	}

	public ISLogoutOutput logout(ISLogoutInput inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	private void addBaseInfoDict(ISBaseInfoQueryOutput output, Map<String, SystemBaseInfo> dict) {
		for (String key : dict.keySet()) {
			SystemBaseInfo info = dict.get(key);
			ISBaseInfoQueryOutputDetail detail = new ISBaseInfoQueryOutputDetail();
			detail.setBaseInfoId(info.getCodeId());
			detail.setBaseInfoName(info.getCodeName());
			detail.setBaseTypeId(info.getCodeType());
			output.getDetail().add(detail);
		}
	}

	public ISBaseInfoQueryOutput baseInfoQuery(ISBaseInfoQueryInput inputParam) {
		ISBaseInfoQueryOutput output = new ISBaseInfoQueryOutput();
		try {
			if (StringUtils.isNullOrEmpty(inputParam.getBaseTypeId())) {
				for (String key : fundBizImplCommon.getBaseInfoKey()) {
					addBaseInfoDict(output, fundBizImplCommon.getBaseInfoMap(key));
				}
			} else {
				addBaseInfoDict(output, fundBizImplCommon.getBaseInfoMap(inputParam.getBaseTypeId()));
			}
			output.setCode(FundGatewayErrorCode.SUCCESS);
			output.setMsg("");
		} catch (Exception e) {
			logger.error("queryBaseInfo error" + e.getMessage(), e);
			output.setCode(FundGatewayErrorCode.SYSTEM_UNKNOWN_ERROR);
			output.setMsg(e.getMessage());
		}
		return output;
	}

}
