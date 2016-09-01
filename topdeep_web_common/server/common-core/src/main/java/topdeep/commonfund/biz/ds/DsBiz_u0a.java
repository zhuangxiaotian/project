package topdeep.commonfund.biz.ds;
import topdeep.commonfund.entity.ds.def.*;
import java.util.*;
import java.io.*;
public interface DsBiz_u0a {
	
	/**
	 * 基金赎回(银行卡) 
	 * @return 结果
	 */
	DsFundRedeemOutput fundRedeem(DsFundRedeemInput inputParam);
	
	/**
	 * 基金赎回(现金宝) 
	 * @return 结果
	 */
	DsFundCurrencyRedeemOutput fundCurrencyRedeem(DsFundCurrencyRedeemInput inputParam);
	
	/**
	 * 资产查询 
	 * @return 结果
	 */
	DsMyAssetsQueryOutput myAssetsQuery(DsMyAssetsQueryInput inputParam);
	
	/**
	 * 快速过户 
	 * @return 结果
	 */
	DsFundShareTransferOutput fundShareTransfer(DsFundShareTransferInput inputParam);
	
	/**
	 * 当日交易申请查询 赎回
	 * @return 结果
	 */
	DsTodayApplicationQueryOutput todayApplicationQuery(DsTodayApplicationQueryInput inputParam);
}
