package topdeep.commonfund.biz.ds.impl;
import topdeep.commonfund.entity.ds.*;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
import common.util.StringUtils;
/**
 * 基金网关方法接口代理
 */
public class DsBizParamCheckProxy extends DsBizBaseProxy {
	
	/**
	 * 登陆 
	 * @return 结果
	 */
	public DsLoginOutput login(DsLoginInput inputParam) {
		this.dealInput(inputParam);
		DsLoginOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getNeedQueryCustInfo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数是否查询客户信息;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (error) {
				outputParam = new DsLoginOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.login(inputParam);
			}
		}
		else {
			outputParam = new DsLoginOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 客户信息查询 
	 * @return 结果
	 */
	public DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		DsCustInfoQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsCustInfoQueryOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.custInfoQuery(inputParam);
			}
		}
		else {
			outputParam = new DsCustInfoQueryOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 开户 
	 * @return 结果
	 */
	public DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam) {
		this.dealInput(inputParam);
		DsOpenAccountOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsOpenAccountOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.openAccount(inputParam);
			}
		}
		else {
			outputParam = new DsOpenAccountOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 修改密码 
	 * @return 结果
	 */
	public DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam) {
		this.dealInput(inputParam);
		DsPasswordUpdateOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTheOldPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数旧密码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getTheNewPassword())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数新密码;");
			}
			if (error) {
				outputParam = new DsPasswordUpdateOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.passwordUpdate(inputParam);
			}
		}
		else {
			outputParam = new DsPasswordUpdateOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 发送验证码 
	 * @return 结果
	 */
	public DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam) {
		this.dealInput(inputParam);
		DsSmsCodeSendOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsSmsCodeSendOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.smsCodeSend(inputParam);
			}
		}
		else {
			outputParam = new DsSmsCodeSendOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 验证验证码 
	 * @return 结果
	 */
	public DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam) {
		this.dealInput(inputParam);
		DsSmsCodeValidOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsSmsCodeValidOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.smsCodeValid(inputParam);
			}
		}
		else {
			outputParam = new DsSmsCodeValidOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 鉴权 
	 * @return 结果
	 */
	public DsAuthenticationOutput authentication(DsAuthenticationInput inputParam) {
		this.dealInput(inputParam);
		DsAuthenticationOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsAuthenticationOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.authentication(inputParam);
			}
		}
		else {
			outputParam = new DsAuthenticationOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询用户的交易账户列表 
	 * @return 结果
	 */
	public DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam) {
		this.dealInput(inputParam);
		DsTransactionsAccountQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdNo())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件号码;");
			}
			if (StringUtils.isNullOrEmpty(inputParam.getIdType())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数证件类型;");
			}
			if (error) {
				outputParam = new DsTransactionsAccountQueryOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.transactionsAccountQuery(inputParam);
			}
		}
		else {
			outputParam = new DsTransactionsAccountQueryOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金列表 
	 * @return 结果
	 */
	public DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		DsFundListQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsFundListQueryOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.n00_impl.fundListQuery(inputParam);
			}
		}
		else {
			outputParam = new DsFundListQueryOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金购买(银行卡) 
	 * @return 结果
	 */
	public DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam) {
		this.dealInput(inputParam);
		DsFundPurchaseOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (error) {
				outputParam = new DsFundPurchaseOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.fundPurchase(inputParam);
			}
		}
		else {
			outputParam = new DsFundPurchaseOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金购买(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam) {
		this.dealInput(inputParam);
		DsFundCurrencyPurchaseOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (error) {
				outputParam = new DsFundCurrencyPurchaseOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u00_impl.fundCurrencyPurchase(inputParam);
			}
		}
		else {
			outputParam = new DsFundCurrencyPurchaseOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回(银行卡) 
	 * @return 结果
	 */
	public DsFundRedeemOutput fundRedeem(DsFundRedeemInput inputParam) {
		this.dealInput(inputParam);
		DsFundRedeemOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (error) {
				outputParam = new DsFundRedeemOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundRedeem(inputParam);
			}
		}
		else {
			outputParam = new DsFundRedeemOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyRedeemOutput fundCurrencyRedeem(DsFundCurrencyRedeemInput inputParam) {
		this.dealInput(inputParam);
		DsFundCurrencyRedeemOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsFundCurrencyRedeemOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundCurrencyRedeem(inputParam);
			}
		}
		else {
			outputParam = new DsFundCurrencyRedeemOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 资产查询 
	 * @return 结果
	 */
	public DsMyAssetsQueryOutput myAssetsQuery(DsMyAssetsQueryInput inputParam) {
		this.dealInput(inputParam);
		DsMyAssetsQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (error) {
				outputParam = new DsMyAssetsQueryOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.myAssetsQuery(inputParam);
			}
		}
		else {
			outputParam = new DsMyAssetsQueryOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速过户 
	 * @return 结果
	 */
	public DsFundShareTransferOutput fundShareTransfer(DsFundShareTransferInput inputParam) {
		this.dealInput(inputParam);
		DsFundShareTransferOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (error) {
				outputParam = new DsFundShareTransferOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.fundShareTransfer(inputParam);
			}
		}
		else {
			outputParam = new DsFundShareTransferOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 当日交易申请查询 赎回
	 * @return 结果
	 */
	public DsTodayApplicationQueryOutput todayApplicationQuery(DsTodayApplicationQueryInput inputParam) {
		this.dealInput(inputParam);
		DsTodayApplicationQueryOutput outputParam = null;
		if (this.checkSession(inputParam)) {
			String errorMsg = this.checkBaseInput(inputParam);
			Boolean error = false;
			if (StringUtils.isNullOrEmpty(errorMsg)) {
			}
			else {
				error = true;
			}
			if (StringUtils.isNullOrEmpty(inputParam.getCustomerId())) {
				error = true;
				errorMsg = (errorMsg + "缺少参数客户编号或者sessionKey;");
			}
			if (error) {
				outputParam = new DsTodayApplicationQueryOutput();
				outputParam.setCode(DsErrorCode.INPUT_PARAM_NEED);
				outputParam.setMsg(errorMsg);
			}
			else {
				outputParam = this.u0a_impl.todayApplicationQuery(inputParam);
			}
		}
		else {
			outputParam = new DsTodayApplicationQueryOutput();
			outputParam.setCode(DsErrorCode.SESSION_TIMEOUT);
			outputParam.setMsg("无效的SessionKey");
		}
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
}
