package topdeep.commonfund.biz.gateway;
import topdeep.commonfund.entity.gateway.def.*;
import java.util.*;
import java.io.*;
public interface FundBiz_u1a {
	
	/**
	 * 查询电子合同信息 E001
	 * @return 结果
	 */
	ISEletricContractQueryOutput eletricContractQuery(ISEletricContractQueryInput inputParam);
	
	/**
	 * 签署电子合同或风险揭示书 
	 * @return 结果
	 */
	ISSpeciElectronicContractSignOutput speciElectronicContractSign(ISSpeciElectronicContractSignInput inputParam);
	
	/**
	 * 历史分红查询 S005
	 * @return 结果
	 */
	ISHisBonusListQueryOutput hisBonusListQuery(ISHisBonusListQueryInput inputParam);
	
	/**
	 * 盈亏查询 S013
	 * @return 结果
	 */
	ISProfitQueryOutput profitQuery(ISProfitQueryInput inputParam);
	
	/**
	 * 销交易账号 C028
	 * @return 结果
	 */
	ISTradeAccCancelOutput tradeAccCancel(ISTradeAccCancelInput inputParam);
	
	/**
	 * 定期定额转换 I008
	 * @return 结果
	 */
	ISFixedInvestmentTransferOutput fixedInvestmentTransfer(ISFixedInvestmentTransferInput inputParam);
	
	/**
	 * 短期理财到期日查询 S035
	 * @return 结果
	 */
	ISShortDateQueryOutput shortDateQuery(ISShortDateQueryInput inputParam);
	
	/**
	 * 短期理财明细查询 S020
	 * @return 结果
	 */
	ISShortMoneyDetailQueryOutput shortMoneyDetailQuery(ISShortMoneyDetailQueryInput inputParam);
	
	/**
	 * 数据中心客户信息查询 C025
	 * @return 结果
	 */
	ISDataCenterCustomerInfoQueryOutput dataCenterCustomerInfoQuery(ISDataCenterCustomerInfoQueryInput inputParam);
	
	/**
	 * 份额流水查询 S058
	 * @return 结果
	 */
	ISShareWaterQueryOutput shareWaterQuery(ISShareWaterQueryInput inputParam);
}
