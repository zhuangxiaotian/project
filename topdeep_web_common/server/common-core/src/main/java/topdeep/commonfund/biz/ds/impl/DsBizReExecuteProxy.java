package topdeep.commonfund.biz.ds.impl;
import topdeep.commonfund.entity.ds.*;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
import common.util.StringUtils;
/**
 * 基金网关方法接口代理
 */
public class DsBizReExecuteProxy extends DsBizBaseProxy {
	
	/**
	 * 登陆 
	 * @return 结果
	 */
	public DsLoginOutput login(DsLoginInput inputParam) {
		DsLoginOutput outputParam = super.login(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.login(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 客户信息查询 
	 * @return 结果
	 */
	public DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam) {
		DsCustInfoQueryOutput outputParam = super.custInfoQuery(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.custInfoQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 开户 
	 * @return 结果
	 */
	public DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam) {
		DsOpenAccountOutput outputParam = super.openAccount(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.openAccount(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 修改密码 
	 * @return 结果
	 */
	public DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam) {
		DsPasswordUpdateOutput outputParam = super.passwordUpdate(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.passwordUpdate(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 发送验证码 
	 * @return 结果
	 */
	public DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam) {
		DsSmsCodeSendOutput outputParam = super.smsCodeSend(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.smsCodeSend(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 验证验证码 
	 * @return 结果
	 */
	public DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam) {
		DsSmsCodeValidOutput outputParam = super.smsCodeValid(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.smsCodeValid(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 鉴权 
	 * @return 结果
	 */
	public DsAuthenticationOutput authentication(DsAuthenticationInput inputParam) {
		DsAuthenticationOutput outputParam = super.authentication(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.authentication(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 查询用户的交易账户列表 
	 * @return 结果
	 */
	public DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam) {
		DsTransactionsAccountQueryOutput outputParam = super.transactionsAccountQuery(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.transactionsAccountQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金列表 
	 * @return 结果
	 */
	public DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam) {
		DsFundListQueryOutput outputParam = super.fundListQuery(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundListQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金购买(银行卡) 
	 * @return 结果
	 */
	public DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam) {
		DsFundPurchaseOutput outputParam = super.fundPurchase(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundPurchase(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金购买(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam) {
		DsFundCurrencyPurchaseOutput outputParam = super.fundCurrencyPurchase(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundCurrencyPurchase(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金赎回(银行卡) 
	 * @return 结果
	 */
	public DsFundRedeemOutput fundRedeem(DsFundRedeemInput inputParam) {
		DsFundRedeemOutput outputParam = super.fundRedeem(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundRedeem(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 基金赎回(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyRedeemOutput fundCurrencyRedeem(DsFundCurrencyRedeemInput inputParam) {
		DsFundCurrencyRedeemOutput outputParam = super.fundCurrencyRedeem(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundCurrencyRedeem(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 资产查询 
	 * @return 结果
	 */
	public DsMyAssetsQueryOutput myAssetsQuery(DsMyAssetsQueryInput inputParam) {
		DsMyAssetsQueryOutput outputParam = super.myAssetsQuery(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.myAssetsQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 快速过户 
	 * @return 结果
	 */
	public DsFundShareTransferOutput fundShareTransfer(DsFundShareTransferInput inputParam) {
		DsFundShareTransferOutput outputParam = super.fundShareTransfer(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.fundShareTransfer(inputParam);
		}
		else {
			return outputParam;
		}
	}
	
	/**
	 * 当日交易申请查询 赎回
	 * @return 结果
	 */
	public DsTodayApplicationQueryOutput todayApplicationQuery(DsTodayApplicationQueryInput inputParam) {
		DsTodayApplicationQueryOutput outputParam = super.todayApplicationQuery(inputParam);
		if ((DsErrorCode.SESSION_TIMEOUT.equals(outputParam.getCode()) 
					&& (outputParam.getZ_calltimes() < 2))) {
			inputParam.setZ_calltimes((inputParam.getZ_calltimes() + 1));
			return this.todayApplicationQuery(inputParam);
		}
		else {
			return outputParam;
		}
	}
}
