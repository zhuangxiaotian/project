package topdeep.commonfund.biz.ds.impl;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
import topdeep.commonfund.biz.ds.*;
/**
 * 基金网关方法接口代理
 */
public class DsBizBaseProxy extends DsBizProxyBase implements DsBiz_u00, DsBiz_n00, DsBiz_u0a {
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.ds.DsBiz_u00 u00_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.ds.DsBiz_n00 n00_impl;
	
	/**
	 * 代理目标对象
	 */
	protected topdeep.commonfund.biz.ds.DsBiz_u0a u0a_impl;
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.ds.DsBiz_u00 getU00_impl() {
		return this.u00_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU00_impl(topdeep.commonfund.biz.ds.DsBiz_u00 value)
	 {
		this.u00_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.ds.DsBiz_n00 getN00_impl() {
		return this.n00_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setN00_impl(topdeep.commonfund.biz.ds.DsBiz_n00 value)
	 {
		this.n00_impl = value;
	}
	
	/**
	 * 代理目标对象
	 */
	public topdeep.commonfund.biz.ds.DsBiz_u0a getU0a_impl() {
		return this.u0a_impl;
	}
	
	/**
	 * 代理目标对象
	 */
	public void setU0a_impl(topdeep.commonfund.biz.ds.DsBiz_u0a value)
	 {
		this.u0a_impl = value;
	}
	
	/**
	 * 登陆 
	 * @return 结果
	 */
	public DsLoginOutput login(DsLoginInput inputParam) {
		this.dealInput(inputParam);
		DsLoginOutput outputParam = this.u00_impl.login(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 客户信息查询 
	 * @return 结果
	 */
	public DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam) {
		this.dealInput(inputParam);
		DsCustInfoQueryOutput outputParam = this.u00_impl.custInfoQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 开户 
	 * @return 结果
	 */
	public DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam) {
		this.dealInput(inputParam);
		DsOpenAccountOutput outputParam = this.u00_impl.openAccount(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 修改密码 
	 * @return 结果
	 */
	public DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam) {
		this.dealInput(inputParam);
		DsPasswordUpdateOutput outputParam = this.u00_impl.passwordUpdate(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 发送验证码 
	 * @return 结果
	 */
	public DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam) {
		this.dealInput(inputParam);
		DsSmsCodeSendOutput outputParam = this.u00_impl.smsCodeSend(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 验证验证码 
	 * @return 结果
	 */
	public DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam) {
		this.dealInput(inputParam);
		DsSmsCodeValidOutput outputParam = this.u00_impl.smsCodeValid(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 鉴权 
	 * @return 结果
	 */
	public DsAuthenticationOutput authentication(DsAuthenticationInput inputParam) {
		this.dealInput(inputParam);
		DsAuthenticationOutput outputParam = this.u00_impl.authentication(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 查询用户的交易账户列表 
	 * @return 结果
	 */
	public DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam) {
		this.dealInput(inputParam);
		DsTransactionsAccountQueryOutput outputParam = this.u00_impl.transactionsAccountQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金列表 
	 * @return 结果
	 */
	public DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam) {
		this.dealInput(inputParam);
		DsFundListQueryOutput outputParam = this.n00_impl.fundListQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金购买(银行卡) 
	 * @return 结果
	 */
	public DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam) {
		this.dealInput(inputParam);
		DsFundPurchaseOutput outputParam = this.u00_impl.fundPurchase(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金购买(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam) {
		this.dealInput(inputParam);
		DsFundCurrencyPurchaseOutput outputParam = this.u00_impl.fundCurrencyPurchase(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回(银行卡) 
	 * @return 结果
	 */
	public DsFundRedeemOutput fundRedeem(DsFundRedeemInput inputParam) {
		this.dealInput(inputParam);
		DsFundRedeemOutput outputParam = this.u0a_impl.fundRedeem(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 基金赎回(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyRedeemOutput fundCurrencyRedeem(DsFundCurrencyRedeemInput inputParam) {
		this.dealInput(inputParam);
		DsFundCurrencyRedeemOutput outputParam = this.u0a_impl.fundCurrencyRedeem(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 资产查询 
	 * @return 结果
	 */
	public DsMyAssetsQueryOutput myAssetsQuery(DsMyAssetsQueryInput inputParam) {
		this.dealInput(inputParam);
		DsMyAssetsQueryOutput outputParam = this.u0a_impl.myAssetsQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 快速过户 
	 * @return 结果
	 */
	public DsFundShareTransferOutput fundShareTransfer(DsFundShareTransferInput inputParam) {
		this.dealInput(inputParam);
		DsFundShareTransferOutput outputParam = this.u0a_impl.fundShareTransfer(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
	
	/**
	 * 当日交易申请查询 赎回
	 * @return 结果
	 */
	public DsTodayApplicationQueryOutput todayApplicationQuery(DsTodayApplicationQueryInput inputParam) {
		this.dealInput(inputParam);
		DsTodayApplicationQueryOutput outputParam = this.u0a_impl.todayApplicationQuery(inputParam);
		this.dealOutput(inputParam, outputParam);
		return outputParam;
	}
}
