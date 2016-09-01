package fund.dao.gateway.client;
import topdeep.commonfund.entity.ds.def.*;
import java.io.*;
import common.util.*;
/**
 * 网关JAVA客户端实现
 */
public class DsDao extends fund.dao.gateway.client.DsDaoBase {
	
	/**
	 * 登陆 
	 * @return 结果
	 */
	public DsLoginOutput login(DsLoginInput inputParam) throws Exception {
		return ((DsLoginOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 客户信息查询 
	 * @return 结果
	 */
	public DsCustInfoQueryOutput custInfoQuery(DsCustInfoQueryInput inputParam) throws Exception {
		return ((DsCustInfoQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 开户 
	 * @return 结果
	 */
	public DsOpenAccountOutput openAccount(DsOpenAccountInput inputParam) throws Exception {
		return ((DsOpenAccountOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 修改密码 
	 * @return 结果
	 */
	public DsPasswordUpdateOutput passwordUpdate(DsPasswordUpdateInput inputParam) throws Exception {
		return ((DsPasswordUpdateOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 发送验证码 
	 * @return 结果
	 */
	public DsSmsCodeSendOutput smsCodeSend(DsSmsCodeSendInput inputParam) throws Exception {
		return ((DsSmsCodeSendOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 验证验证码 
	 * @return 结果
	 */
	public DsSmsCodeValidOutput smsCodeValid(DsSmsCodeValidInput inputParam) throws Exception {
		return ((DsSmsCodeValidOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 鉴权 
	 * @return 结果
	 */
	public DsAuthenticationOutput authentication(DsAuthenticationInput inputParam) throws Exception {
		return ((DsAuthenticationOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 查询用户的交易账户列表 
	 * @return 结果
	 */
	public DsTransactionsAccountQueryOutput transactionsAccountQuery(DsTransactionsAccountQueryInput inputParam) throws Exception {
		return ((DsTransactionsAccountQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金列表 
	 * @return 结果
	 */
	public DsFundListQueryOutput fundListQuery(DsFundListQueryInput inputParam) throws Exception {
		return ((DsFundListQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金购买(银行卡) 
	 * @return 结果
	 */
	public DsFundPurchaseOutput fundPurchase(DsFundPurchaseInput inputParam) throws Exception {
		return ((DsFundPurchaseOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金购买(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyPurchaseOutput fundCurrencyPurchase(DsFundCurrencyPurchaseInput inputParam) throws Exception {
		return ((DsFundCurrencyPurchaseOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金赎回(银行卡) 
	 * @return 结果
	 */
	public DsFundRedeemOutput fundRedeem(DsFundRedeemInput inputParam) throws Exception {
		return ((DsFundRedeemOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 基金赎回(现金宝) 
	 * @return 结果
	 */
	public DsFundCurrencyRedeemOutput fundCurrencyRedeem(DsFundCurrencyRedeemInput inputParam) throws Exception {
		return ((DsFundCurrencyRedeemOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 资产查询 
	 * @return 结果
	 */
	public DsMyAssetsQueryOutput myAssetsQuery(DsMyAssetsQueryInput inputParam) throws Exception {
		return ((DsMyAssetsQueryOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 快速过户 
	 * @return 结果
	 */
	public DsFundShareTransferOutput fundShareTransfer(DsFundShareTransferInput inputParam) throws Exception {
		return ((DsFundShareTransferOutput)(this.callServer(inputParam)));
	}
	
	/**
	 * 当日交易申请查询 赎回
	 * @return 结果
	 */
	public DsTodayApplicationQueryOutput todayApplicationQuery(DsTodayApplicationQueryInput inputParam) throws Exception {
		return ((DsTodayApplicationQueryOutput)(this.callServer(inputParam)));
	}
}
