package topdeep.commonfund.biz.ds.impl;
import topdeep.commonfund.biz.ds.ServiceApi;
import topdeep.commonfund.biz.ds.impl.ServiceApiImplBase;
import topdeep.commonfund.entity.ds.*;
import topdeep.commonfund.entity.ds.def.*;
import common.util.*;
import flexjson.*;
import topdeep.commonfund.biz.ds.DsBiz_u00;
import topdeep.commonfund.biz.ds.DsBiz_n00;
import topdeep.commonfund.biz.ds.DsBiz_u0a;
/**
 * 基金网关服务接口
 */
public class ServiceApiImpl extends ServiceApiImplBase implements ServiceApi {
	
	public String execute(String inputParam) {
		return super.execute(inputParam);
	}
	
	public DsBaseOutput execute(DsBaseInput input) {
		if ("u00".equals(input.getZ_funcCode())) {
			return this.login(input);
		}
		if ("u01".equals(input.getZ_funcCode())) {
			return this.custInfoQuery(input);
		}
		if ("u02".equals(input.getZ_funcCode())) {
			return this.openAccount(input);
		}
		if ("u03".equals(input.getZ_funcCode())) {
			return this.passwordUpdate(input);
		}
		if ("u04".equals(input.getZ_funcCode())) {
			return this.smsCodeSend(input);
		}
		if ("u05".equals(input.getZ_funcCode())) {
			return this.smsCodeValid(input);
		}
		if ("u06".equals(input.getZ_funcCode())) {
			return this.authentication(input);
		}
		if ("u07".equals(input.getZ_funcCode())) {
			return this.transactionsAccountQuery(input);
		}
		if ("n00".equals(input.getZ_funcCode())) {
			return this.fundListQuery(input);
		}
		if ("u08".equals(input.getZ_funcCode())) {
			return this.fundPurchase(input);
		}
		if ("u09".equals(input.getZ_funcCode())) {
			return this.fundCurrencyPurchase(input);
		}
		if ("u0a".equals(input.getZ_funcCode())) {
			return this.fundRedeem(input);
		}
		if ("u0b".equals(input.getZ_funcCode())) {
			return this.fundCurrencyRedeem(input);
		}
		if ("u0c".equals(input.getZ_funcCode())) {
			return this.myAssetsQuery(input);
		}
		if ("u0d".equals(input.getZ_funcCode())) {
			return this.fundShareTransfer(input);
		}
		if ("u0e".equals(input.getZ_funcCode())) {
			return this.todayApplicationQuery(input);
		}
		return this.getErrorOutput(DsErrorCode.INPUT_PARAM_ERROR, "无效的功能调用");
	}
	
	/**
	 * 登陆 
	 */
	protected DsBaseOutput login(DsBaseInput inputParam) {
		DsLoginInput input = ((DsLoginInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").login(input);
	}
	
	/**
	 * 客户信息查询 
	 */
	protected DsBaseOutput custInfoQuery(DsBaseInput inputParam) {
		DsCustInfoQueryInput input = ((DsCustInfoQueryInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").custInfoQuery(input);
	}
	
	/**
	 * 开户 
	 */
	protected DsBaseOutput openAccount(DsBaseInput inputParam) {
		DsOpenAccountInput input = ((DsOpenAccountInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").openAccount(input);
	}
	
	/**
	 * 修改密码 
	 */
	protected DsBaseOutput passwordUpdate(DsBaseInput inputParam) {
		DsPasswordUpdateInput input = ((DsPasswordUpdateInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").passwordUpdate(input);
	}
	
	/**
	 * 发送验证码 
	 */
	protected DsBaseOutput smsCodeSend(DsBaseInput inputParam) {
		DsSmsCodeSendInput input = ((DsSmsCodeSendInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").smsCodeSend(input);
	}
	
	/**
	 * 验证验证码 
	 */
	protected DsBaseOutput smsCodeValid(DsBaseInput inputParam) {
		DsSmsCodeValidInput input = ((DsSmsCodeValidInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").smsCodeValid(input);
	}
	
	/**
	 * 鉴权 
	 */
	protected DsBaseOutput authentication(DsBaseInput inputParam) {
		DsAuthenticationInput input = ((DsAuthenticationInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").authentication(input);
	}
	
	/**
	 * 查询用户的交易账户列表 
	 */
	protected DsBaseOutput transactionsAccountQuery(DsBaseInput inputParam) {
		DsTransactionsAccountQueryInput input = ((DsTransactionsAccountQueryInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").transactionsAccountQuery(input);
	}
	
	/**
	 * 基金列表 
	 */
	protected DsBaseOutput fundListQuery(DsBaseInput inputParam) {
		DsFundListQueryInput input = ((DsFundListQueryInput)(inputParam));
		return this.getDsBiz(DsBiz_n00.class, inputParam, "n00").fundListQuery(input);
	}
	
	/**
	 * 基金购买(银行卡) 
	 */
	protected DsBaseOutput fundPurchase(DsBaseInput inputParam) {
		DsFundPurchaseInput input = ((DsFundPurchaseInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").fundPurchase(input);
	}
	
	/**
	 * 基金购买(现金宝) 
	 */
	protected DsBaseOutput fundCurrencyPurchase(DsBaseInput inputParam) {
		DsFundCurrencyPurchaseInput input = ((DsFundCurrencyPurchaseInput)(inputParam));
		return this.getDsBiz(DsBiz_u00.class, inputParam, "u00").fundCurrencyPurchase(input);
	}
	
	/**
	 * 基金赎回(银行卡) 
	 */
	protected DsBaseOutput fundRedeem(DsBaseInput inputParam) {
		DsFundRedeemInput input = ((DsFundRedeemInput)(inputParam));
		return this.getDsBiz(DsBiz_u0a.class, inputParam, "u0a").fundRedeem(input);
	}
	
	/**
	 * 基金赎回(现金宝) 
	 */
	protected DsBaseOutput fundCurrencyRedeem(DsBaseInput inputParam) {
		DsFundCurrencyRedeemInput input = ((DsFundCurrencyRedeemInput)(inputParam));
		return this.getDsBiz(DsBiz_u0a.class, inputParam, "u0a").fundCurrencyRedeem(input);
	}
	
	/**
	 * 资产查询 
	 */
	protected DsBaseOutput myAssetsQuery(DsBaseInput inputParam) {
		DsMyAssetsQueryInput input = ((DsMyAssetsQueryInput)(inputParam));
		return this.getDsBiz(DsBiz_u0a.class, inputParam, "u0a").myAssetsQuery(input);
	}
	
	/**
	 * 快速过户 
	 */
	protected DsBaseOutput fundShareTransfer(DsBaseInput inputParam) {
		DsFundShareTransferInput input = ((DsFundShareTransferInput)(inputParam));
		return this.getDsBiz(DsBiz_u0a.class, inputParam, "u0a").fundShareTransfer(input);
	}
	
	/**
	 * 当日交易申请查询 赎回
	 */
	protected DsBaseOutput todayApplicationQuery(DsBaseInput inputParam) {
		DsTodayApplicationQueryInput input = ((DsTodayApplicationQueryInput)(inputParam));
		return this.getDsBiz(DsBiz_u0a.class, inputParam, "u0a").todayApplicationQuery(input);
	}
}
