package topdeep.commonfund.biz.ds;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
public interface DsBiz_u00 {
	
	/**
	 * 登陆 
	 * @return 结果
	 */
	DsLoginOutput login(DsLoginInput inputParam);
	
	/**
	 * 客户信息查询 
	 * @return 结果
	 */
	DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam);
	
	/**
	 * 开户 
	 * @return 结果
	 */
	DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam);
	
	/**
	 * 修改密码 
	 * @return 结果
	 */
	DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam);
	
	/**
	 * 发送验证码 
	 * @return 结果
	 */
	DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam);
	
	/**
	 * 验证验证码 
	 * @return 结果
	 */
	DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam);
	
	/**
	 * 鉴权 
	 * @return 结果
	 */
	DsAuthenticationOutput authentication(DsAuthenticationInput inputParam);
	
	/**
	 * 查询用户的交易账户列表 
	 * @return 结果
	 */
	DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam);
	
	/**
	 * 基金购买(银行卡) 
	 * @return 结果
	 */
	DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam);
	
	/**
	 * 基金购买(现金宝) 
	 * @return 结果
	 */
	DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam);
}
