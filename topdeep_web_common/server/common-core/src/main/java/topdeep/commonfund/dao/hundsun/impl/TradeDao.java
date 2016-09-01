package topdeep.commonfund.dao.hundsun.impl;
import topdeep.commonfund.entity.hundsun.*;
import java.util.*;
import org.springframework.stereotype.Repository;
/**
 * 
 */
public class TradeDao extends TradeDaoBase implements topdeep.commonfund.dao.hundsun.TradeDao {
	
	/**
	 * 未处理汇款余额查询(S019) 
	 */
	public S019Output s019(S019Input inputParam, HundsunCallSession callSession) throws Exception {
		S019OutputAdapta output = this.callService(inputParam, callSession, S019OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 短期理财明细查询(S020) 
	 */
	public S020Output s020(S020Input inputParam, HundsunCallSession callSession) throws Exception {
		S020OutputAdapta output = this.callService(inputParam, callSession, S020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 交易费率查询(S021) 
	 */
	public S021Output s021(S021Input inputParam, HundsunCallSession callSession) throws Exception {
		S021OutputAdapta output = this.callService(inputParam, callSession, S021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 交易限制查询(S022) 
	 */
	public S022Output s022(S022Input inputParam, HundsunCallSession callSession) throws Exception {
		S022OutputAdapta output = this.callService(inputParam, callSession, S022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 颁发令牌(K001) 
	 */
	public K001Output k001(K001Input inputParam, HundsunCallSession callSession) throws Exception {
		K001OutputAdapta output = this.callService(inputParam, callSession, K001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * TA信息查询(S023) 
	 */
	public S023Output s023(S023Input inputParam, HundsunCallSession callSession) throws Exception {
		S023OutputAdapta output = this.callService(inputParam, callSession, S023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 验证令牌(K002) 
	 */
	public K002Output k002(K002Input inputParam, HundsunCallSession callSession) throws Exception {
		K002OutputAdapta output = this.callService(inputParam, callSession, K002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合理财份额查询(S024) 
	 */
	public S024Output s024(S024Input inputParam, HundsunCallSession callSession) throws Exception {
		S024OutputAdapta output = this.callService(inputParam, callSession, S024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 现金宝基金列表(M004) 
	 */
	public M004Output m004(M004Input inputParam, HundsunCallSession callSession) throws Exception {
		M004OutputAdapta output = this.callService(inputParam, callSession, M004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史交易申请查询(S025) 
	 */
	public S025Output s025(S025Input inputParam, HundsunCallSession callSession) throws Exception {
		S025OutputAdapta output = this.callService(inputParam, callSession, S025OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可购买基金列表(T001) 
	 */
	public T001Output t001(T001Input inputParam, HundsunCallSession callSession) throws Exception {
		T001OutputAdapta output = this.callService(inputParam, callSession, T001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 净值收益率排行榜查询(S026) 
	 */
	public S026Output s026(S026Input inputParam, HundsunCallSession callSession) throws Exception {
		S026OutputAdapta output = this.callService(inputParam, callSession, S026OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可买入支付方式列表(T002) 
	 */
	public T002Output t002(T002Input inputParam, HundsunCallSession callSession) throws Exception {
		T002OutputAdapta output = this.callService(inputParam, callSession, T002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 经纪人佣金信息查询(S027) 
	 */
	public S027Output s027(S027Input inputParam, HundsunCallSession callSession) throws Exception {
		S027OutputAdapta output = this.callService(inputParam, callSession, S027OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金买入(T003) 
	 */
	public T003Output t003(T003Input inputParam, HundsunCallSession callSession) throws Exception {
		T003OutputAdapta output = this.callService(inputParam, callSession, T003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 快速赎回统计信息查询(S028) 
	 */
	public S028Output s028(S028Input inputParam, HundsunCallSession callSession) throws Exception {
		S028OutputAdapta output = this.callService(inputParam, callSession, S028OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 支付结果通知(T004) 
	 */
	public T004Output t004(T004Input inputParam, HundsunCallSession callSession) throws Exception {
		T004OutputAdapta output = this.callService(inputParam, callSession, T004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 交易时间限制查询(S029) 
	 */
	public S029Output s029(S029Input inputParam, HundsunCallSession callSession) throws Exception {
		S029OutputAdapta output = this.callService(inputParam, callSession, S029OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可转换目标基金列表(T005) 
	 */
	public T005Output t005(T005Input inputParam, HundsunCallSession callSession) throws Exception {
		T005OutputAdapta output = this.callService(inputParam, callSession, T005OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 账户成交查询(S033) 
	 */
	public S033Output s033(S033Input inputParam, HundsunCallSession callSession) throws Exception {
		S033OutputAdapta output = this.callService(inputParam, callSession, S033OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金卖出或转换(T006) 
	 */
	public T006Output t006(T006Input inputParam, HundsunCallSession callSession) throws Exception {
		T006OutputAdapta output = this.callService(inputParam, callSession, T006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 费率折扣查询(S034) 
	 */
	public S034Output s034(S034Input inputParam, HundsunCallSession callSession) throws Exception {
		S034OutputAdapta output = this.callService(inputParam, callSession, S034OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 分红方式修改(T007) 
	 */
	public T007Output t007(T007Input inputParam, HundsunCallSession callSession) throws Exception {
		T007OutputAdapta output = this.callService(inputParam, callSession, T007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 短期理财到期日查询(S035) 
	 */
	public S035Output s035(S035Input inputParam, HundsunCallSession callSession) throws Exception {
		S035OutputAdapta output = this.callService(inputParam, callSession, S035OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可撤单交易列表(T008) 
	 */
	public T008Output t008(T008Input inputParam, HundsunCallSession callSession) throws Exception {
		T008OutputAdapta output = this.callService(inputParam, callSession, T008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 错误日志事件查询(S036) 
	 */
	public S036Output s036(S036Input inputParam, HundsunCallSession callSession) throws Exception {
		S036OutputAdapta output = this.callService(inputParam, callSession, S036OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 撤单(T009) 
	 */
	public T009Output t009(T009Input inputParam, HundsunCallSession callSession) throws Exception {
		T009OutputAdapta output = this.callService(inputParam, callSession, T009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金收益率查询(S037) 
	 */
	public S037Output s037(S037Input inputParam, HundsunCallSession callSession) throws Exception {
		S037OutputAdapta output = this.callService(inputParam, callSession, S037OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可修改分红方式列表(T010) 
	 */
	public T010Output t010(T010Input inputParam, HundsunCallSession callSession) throws Exception {
		T010OutputAdapta output = this.callService(inputParam, callSession, T010OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * T+0划款流水查询(S038) 
	 */
	public S038Output s038(S038Input inputParam, HundsunCallSession callSession) throws Exception {
		S038OutputAdapta output = this.callService(inputParam, callSession, S038OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可转托管入基金列表(T011) 
	 */
	public T011Output t011(T011Input inputParam, HundsunCallSession callSession) throws Exception {
		T011OutputAdapta output = this.callService(inputParam, callSession, T011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * T+0业务状态查询(S039) 
	 */
	public S039Output s039(S039Input inputParam, HundsunCallSession callSession) throws Exception {
		S039OutputAdapta output = this.callService(inputParam, callSession, S039OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 转托管入(T012) 
	 */
	public T012Output t012(T012Input inputParam, HundsunCallSession callSession) throws Exception {
		T012OutputAdapta output = this.callService(inputParam, callSession, T012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 相对工作日查询(S040) 
	 */
	public S040Output s040(S040Input inputParam, HundsunCallSession callSession) throws Exception {
		S040OutputAdapta output = this.callService(inputParam, callSession, S040OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合投资基金列表(T013) 
	 */
	public T013Output t013(T013Input inputParam, HundsunCallSession callSession) throws Exception {
		T013OutputAdapta output = this.callService(inputParam, callSession, T013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * CMS分类查询(S041) 
	 */
	public S041Output s041(S041Input inputParam, HundsunCallSession callSession) throws Exception {
		S041OutputAdapta output = this.callService(inputParam, callSession, S041OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可组合投资支付方式列表(T014) 
	 */
	public T014Output t014(T014Input inputParam, HundsunCallSession callSession) throws Exception {
		T014OutputAdapta output = this.callService(inputParam, callSession, T014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * CMS内容查询(S042) 
	 */
	public S042Output s042(S042Input inputParam, HundsunCallSession callSession) throws Exception {
		S042OutputAdapta output = this.callService(inputParam, callSession, S042OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合投资买入(T015) 
	 */
	public T015Output t015(T015Input inputParam, HundsunCallSession callSession) throws Exception {
		T015OutputAdapta output = this.callService(inputParam, callSession, T015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 预计还款日期查询(S043) 
	 */
	public S043Output s043(S043Input inputParam, HundsunCallSession callSession) throws Exception {
		S043OutputAdapta output = this.callService(inputParam, callSession, S043OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合投资调仓(T016) 
	 */
	public T016Output t016(T016Input inputParam, HundsunCallSession callSession) throws Exception {
		T016OutputAdapta output = this.callService(inputParam, callSession, T016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 还款流水查询(S044) 
	 */
	public S044Output s044(S044Input inputParam, HundsunCallSession callSession) throws Exception {
		S044OutputAdapta output = this.callService(inputParam, callSession, S044OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 转托管出(T017) 
	 */
	public T017Output t017(T017Input inputParam, HundsunCallSession callSession) throws Exception {
		T017OutputAdapta output = this.callService(inputParam, callSession, T017OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 帐户资料修改详情查询(S045) 
	 */
	public S045Output s045(S045Input inputParam, HundsunCallSession callSession) throws Exception {
		S045OutputAdapta output = this.callService(inputParam, callSession, S045OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 代销T+0划款(T018) 
	 */
	public T018Output t018(T018Input inputParam, HundsunCallSession callSession) throws Exception {
		T018OutputAdapta output = this.callService(inputParam, callSession, T018OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 公共事业缴费查询(S048) 
	 */
	public S048Output s048(S048Input inputParam, HundsunCallSession callSession) throws Exception {
		S048OutputAdapta output = this.callService(inputParam, callSession, S048OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇款交易退款(T019) 
	 */
	public T019Output t019(T019Input inputParam, HundsunCallSession callSession) throws Exception {
		T019OutputAdapta output = this.callService(inputParam, callSession, T019OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史收益查询(S049) 
	 */
	public S049Output s049(S049Input inputParam, HundsunCallSession callSession) throws Exception {
		S049OutputAdapta output = this.callService(inputParam, callSession, S049OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 快速过户(T020) 
	 */
	public T020Output t020(T020Input inputParam, HundsunCallSession callSession) throws Exception {
		T020OutputAdapta output = this.callService(inputParam, callSession, T020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开户申请审批状态查询(S050) 
	 */
	public S050Output s050(S050Input inputParam, HundsunCallSession callSession) throws Exception {
		S050OutputAdapta output = this.callService(inputParam, callSession, S050OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 批量交易文件上传通知(T021) 
	 */
	public T021Output t021(T021Input inputParam, HundsunCallSession callSession) throws Exception {
		T021OutputAdapta output = this.callService(inputParam, callSession, T021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 第三方预约交易申请查询(S051) 
	 */
	public S051Output s051(S051Input inputParam, HundsunCallSession callSession) throws Exception {
		S051OutputAdapta output = this.callService(inputParam, callSession, S051OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 内部转托管(T022) 
	 */
	public T022Output t022(T022Input inputParam, HundsunCallSession callSession) throws Exception {
		T022OutputAdapta output = this.callService(inputParam, callSession, T022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 用户超级现金宝信息查询(S052) 
	 */
	public S052Output s052(S052Input inputParam, HundsunCallSession callSession) throws Exception {
		S052OutputAdapta output = this.callService(inputParam, callSession, S052OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡还款(T023) 
	 */
	public T023Output t023(T023Input inputParam, HundsunCallSession callSession) throws Exception {
		T023OutputAdapta output = this.callService(inputParam, callSession, T023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 交易信息查询(S053) 
	 */
	public S053Output s053(S053Input inputParam, HundsunCallSession callSession) throws Exception {
		S053OutputAdapta output = this.callService(inputParam, callSession, S053OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 公共事业缴费(T024) 
	 */
	public T024Output t024(T024Input inputParam, HundsunCallSession callSession) throws Exception {
		T024OutputAdapta output = this.callService(inputParam, callSession, T024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝收益查询(S054) 
	 */
	public S054Output s054(S054Input inputParam, HundsunCallSession callSession) throws Exception {
		S054OutputAdapta output = this.callService(inputParam, callSession, S054OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 份额冻结(T025) 
	 */
	public T025Output t025(T025Input inputParam, HundsunCallSession callSession) throws Exception {
		T025OutputAdapta output = this.callService(inputParam, callSession, T025OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝交易申请查询(S056) 
	 */
	public S056Output s056(S056Input inputParam, HundsunCallSession callSession) throws Exception {
		S056OutputAdapta output = this.callService(inputParam, callSession, S056OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 份额解冻(T026) 
	 */
	public T026Output t026(T026Input inputParam, HundsunCallSession callSession) throws Exception {
		T026OutputAdapta output = this.callService(inputParam, callSession, T026OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 追加投资查询(S057) 
	 */
	public S057Output s057(S057Input inputParam, HundsunCallSession callSession) throws Exception {
		S057OutputAdapta output = this.callService(inputParam, callSession, S057OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可转换来源基金列表(T027) 
	 */
	public T027Output t027(T027Input inputParam, HundsunCallSession callSession) throws Exception {
		T027OutputAdapta output = this.callService(inputParam, callSession, T027OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 份额流水查询(S058) 
	 */
	public S058Output s058(S058Input inputParam, HundsunCallSession callSession) throws Exception {
		S058OutputAdapta output = this.callService(inputParam, callSession, S058OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 扣款结果通知(后台模式) (T030) 
	 */
	public T030Output t030(T030Input inputParam, HundsunCallSession callSession) throws Exception {
		T030OutputAdapta output = this.callService(inputParam, callSession, T030OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝基金行情查询(S059) 
	 */
	public S059Output s059(S059Input inputParam, HundsunCallSession callSession) throws Exception {
		S059OutputAdapta output = this.callService(inputParam, callSession, S059OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 批量申购(后台模式)(T031) 
	 */
	public T031Output t031(T031Input inputParam, HundsunCallSession callSession) throws Exception {
		T031OutputAdapta output = this.callService(inputParam, callSession, T031OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金详细信息查询(S060) 
	 */
	public S060Output s060(S060Input inputParam, HundsunCallSession callSession) throws Exception {
		S060OutputAdapta output = this.callService(inputParam, callSession, S060OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可撤单列表接口(T032) 
	 */
	public T032Output t032(T032Input inputParam, HundsunCallSession callSession) throws Exception {
		T032OutputAdapta output = this.callService(inputParam, callSession, T032OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询客户市值(S067) 
	 */
	public S067Output s067(S067Input inputParam, HundsunCallSession callSession) throws Exception {
		S067OutputAdapta output = this.callService(inputParam, callSession, S067OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 免sessionkey基金买入(T033) 
	 */
	public T033Output t033(T033Input inputParam, HundsunCallSession callSession) throws Exception {
		T033OutputAdapta output = this.callService(inputParam, callSession, T033OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史交易查询(S068) 
	 */
	public S068Output s068(S068Input inputParam, HundsunCallSession callSession) throws Exception {
		S068OutputAdapta output = this.callService(inputParam, callSession, S068OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 免sessionkey基金卖出(T034) 
	 */
	public T034Output t034(T034Input inputParam, HundsunCallSession callSession) throws Exception {
		T034OutputAdapta output = this.callService(inputParam, callSession, T034OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝份额查询(数据中心版)(S069) 
	 */
	public S069Output s069(S069Input inputParam, HundsunCallSession callSession) throws Exception {
		S069OutputAdapta output = this.callService(inputParam, callSession, S069OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 免sessionkey基金撤单(T035) 
	 */
	public T035Output t035(T035Input inputParam, HundsunCallSession callSession) throws Exception {
		T035OutputAdapta output = this.callService(inputParam, callSession, T035OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝交易账号查询(数据中心版)(S070) 
	 */
	public S070Output s070(S070Input inputParam, HundsunCallSession callSession) throws Exception {
		S070OutputAdapta output = this.callService(inputParam, callSession, S070OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 快速赎回资金冻结(T036) 
	 */
	public T036Output t036(T036Input inputParam, HundsunCallSession callSession) throws Exception {
		T036OutputAdapta output = this.callService(inputParam, callSession, T036OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝交易信息查询(数据中心版)(S071) 
	 */
	public S071Output s071(S071Input inputParam, HundsunCallSession callSession) throws Exception {
		S071OutputAdapta output = this.callService(inputParam, callSession, S071OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 快速赎回资金解冻(T037) 
	 */
	public T037Output t037(T037Input inputParam, HundsunCallSession callSession) throws Exception {
		T037OutputAdapta output = this.callService(inputParam, callSession, T037OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝收益查询(数据中心版)(S072) 
	 */
	public S072Output s072(S072Input inputParam, HundsunCallSession callSession) throws Exception {
		S072OutputAdapta output = this.callService(inputParam, callSession, S072OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 申赎额度校验(T038) 
	 */
	public T038Output t038(T038Input inputParam, HundsunCallSession callSession) throws Exception {
		T038OutputAdapta output = this.callService(inputParam, callSession, T038OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 投资收益明细查询接口(S073) 
	 */
	public S073Output s073(S073Input inputParam, HundsunCallSession callSession) throws Exception {
		S073OutputAdapta output = this.callService(inputParam, callSession, S073OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 支付渠道查询(T039) 
	 */
	public T039Output t039(T039Input inputParam, HundsunCallSession callSession) throws Exception {
		T039OutputAdapta output = this.callService(inputParam, callSession, T039OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 被推荐人明细查询接口(S074) 
	 */
	public S074Output s074(S074Input inputParam, HundsunCallSession callSession) throws Exception {
		S074OutputAdapta output = this.callService(inputParam, callSession, S074OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 赎回渠道查询(T040) 
	 */
	public T040Output t040(T040Input inputParam, HundsunCallSession callSession) throws Exception {
		T040OutputAdapta output = this.callService(inputParam, callSession, T040OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 直销系统时间查询(S075) 
	 */
	public S075Output s075(S075Input inputParam, HundsunCallSession callSession) throws Exception {
		S075OutputAdapta output = this.callService(inputParam, callSession, S075OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 购物车信息新增(T041) 
	 */
	public T041Output t041(T041Input inputParam, HundsunCallSession callSession) throws Exception {
		T041OutputAdapta output = this.callService(inputParam, callSession, T041OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金份额查询（整合模式）(S076) 
	 */
	public S076Output s076(S076Input inputParam, HundsunCallSession callSession) throws Exception {
		S076OutputAdapta output = this.callService(inputParam, callSession, S076OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 购物车信息删除(T042) 
	 */
	public T042Output t042(T042Input inputParam, HundsunCallSession callSession) throws Exception {
		T042OutputAdapta output = this.callService(inputParam, callSession, T042OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 时间段内每天的收益(S077) 
	 */
	public S077Output s077(S077Input inputParam, HundsunCallSession callSession) throws Exception {
		S077OutputAdapta output = this.callService(inputParam, callSession, S077OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 购物车信息修改(T043) 
	 */
	public T043Output t043(T043Input inputParam, HundsunCallSession callSession) throws Exception {
		T043OutputAdapta output = this.callService(inputParam, callSession, T043OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 专户基金信息披露(S078) 
	 */
	public S078Output s078(S078Input inputParam, HundsunCallSession callSession) throws Exception {
		S078OutputAdapta output = this.callService(inputParam, callSession, S078OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 购物车信息修改(T044) 
	 */
	public T044Output t044(T044Input inputParam, HundsunCallSession callSession) throws Exception {
		T044OutputAdapta output = this.callService(inputParam, callSession, T044OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 推荐人信息查询(S079) 
	 */
	public S079Output s079(S079Input inputParam, HundsunCallSession callSession) throws Exception {
		S079OutputAdapta output = this.callService(inputParam, callSession, S079OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 读取字典项内容(P001) 
	 */
	public P001Output p001(P001Input inputParam, HundsunCallSession callSession) throws Exception {
		P001OutputAdapta output = this.callService(inputParam, callSession, P001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史份额查询(S080) 
	 */
	public S080Output s080(S080Input inputParam, HundsunCallSession callSession) throws Exception {
		S080OutputAdapta output = this.callService(inputParam, callSession, S080OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 登录系统(P003) 
	 */
	public P003Output p003(P003Input inputParam, HundsunCallSession callSession) throws Exception {
		P003OutputAdapta output = this.callService(inputParam, callSession, P003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 持仓收益查询(S081) 
	 */
	public S081Output s081(S081Input inputParam, HundsunCallSession callSession) throws Exception {
		S081OutputAdapta output = this.callService(inputParam, callSession, S081OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 登出系统(P004) 
	 */
	public P004Output p004(P004Input inputParam, HundsunCallSession callSession) throws Exception {
		P004OutputAdapta output = this.callService(inputParam, callSession, P004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 子账户查询(S082) 
	 */
	public S082Output s082(S082Input inputParam, HundsunCallSession callSession) throws Exception {
		S082OutputAdapta output = this.callService(inputParam, callSession, S082OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 取会话标示(P005) 
	 */
	public P005Output p005(P005Input inputParam, HundsunCallSession callSession) throws Exception {
		P005OutputAdapta output = this.callService(inputParam, callSession, P005OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 待审核交易查询(S083) 
	 */
	public S083Output s083(S083Input inputParam, HundsunCallSession callSession) throws Exception {
		S083OutputAdapta output = this.callService(inputParam, callSession, S083OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 风险评估(P006) 
	 */
	public P006Output p006(P006Input inputParam, HundsunCallSession callSession) throws Exception {
		P006OutputAdapta output = this.callService(inputParam, callSession, P006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 待审核交易查询(S084) 
	 */
	public S084Output s084(S084Input inputParam, HundsunCallSession callSession) throws Exception {
		S084OutputAdapta output = this.callService(inputParam, callSession, S084OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 交易登录(P007) 
	 */
	public P007Output p007(P007Input inputParam, HundsunCallSession callSession) throws Exception {
		P007OutputAdapta output = this.callService(inputParam, callSession, P007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金开放日期查询(S085) 
	 */
	public S085Output s085(S085Input inputParam, HundsunCallSession callSession) throws Exception {
		S085OutputAdapta output = this.callService(inputParam, callSession, S085OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 读取系统参数(P008) 
	 */
	public P008Output p008(P008Input inputParam, HundsunCallSession callSession) throws Exception {
		P008OutputAdapta output = this.callService(inputParam, callSession, P008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户信息查询(S086) 
	 */
	public S086Output s086(S086Input inputParam, HundsunCallSession callSession) throws Exception {
		S086OutputAdapta output = this.callService(inputParam, callSession, S086OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 记录操作日志(P009) 
	 */
	public P009Output p009(P009Input inputParam, HundsunCallSession callSession) throws Exception {
		P009OutputAdapta output = this.callService(inputParam, callSession, P009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 经纪人信息查询(S087) 
	 */
	public S087Output s087(S087Input inputParam, HundsunCallSession callSession) throws Exception {
		S087OutputAdapta output = this.callService(inputParam, callSession, S087OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 投资人预留信息查询(S088) 
	 */
	public S088Output s088(S088Input inputParam, HundsunCallSession callSession) throws Exception {
		S088OutputAdapta output = this.callService(inputParam, callSession, S088OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 华宝查询未付收益变化流水明细(S089) 
	 */
	public S089Output s089(S089Input inputParam, HundsunCallSession callSession) throws Exception {
		S089OutputAdapta output = this.callService(inputParam, callSession, S089OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 华宝查询投资者累计收益(S090) 
	 */
	public S090Output s090(S090Input inputParam, HundsunCallSession callSession) throws Exception {
		S090OutputAdapta output = this.callService(inputParam, callSession, S090OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询基金状态预设置(S091) 
	 */
	public S091Output s091(S091Input inputParam, HundsunCallSession callSession) throws Exception {
		S091OutputAdapta output = this.callService(inputParam, callSession, S091OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金费率查询(S092) 
	 */
	public S092Output s092(S092Input inputParam, HundsunCallSession callSession) throws Exception {
		S092OutputAdapta output = this.callService(inputParam, callSession, S092OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 超级现金宝收支明细查询(S093) 
	 */
	public S093Output s093(S093Input inputParam, HundsunCallSession callSession) throws Exception {
		S093OutputAdapta output = this.callService(inputParam, callSession, S093OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 指数均线查询(S094) 
	 */
	public S094Output s094(S094Input inputParam, HundsunCallSession callSession) throws Exception {
		S094OutputAdapta output = this.callService(inputParam, callSession, S094OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 在途资产查询(S095) 
	 */
	public S095Output s095(S095Input inputParam, HundsunCallSession callSession) throws Exception {
		S095OutputAdapta output = this.callService(inputParam, callSession, S095OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 业绩报酬查询接口(S096) 
	 */
	public S096Output s096(S096Input inputParam, HundsunCallSession callSession) throws Exception {
		S096OutputAdapta output = this.callService(inputParam, callSession, S096OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 用户资产查询(S097) 
	 */
	public S097Output s097(S097Input inputParam, HundsunCallSession callSession) throws Exception {
		S097OutputAdapta output = this.callService(inputParam, callSession, S097OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 注册信息查询(S098) 
	 */
	public S098Output s098(S098Input inputParam, HundsunCallSession callSession) throws Exception {
		S098OutputAdapta output = this.callService(inputParam, callSession, S098OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史测评查询(S099) 
	 */
	public S099Output s099(S099Input inputParam, HundsunCallSession callSession) throws Exception {
		S099OutputAdapta output = this.callService(inputParam, callSession, S099OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历测评详情查询(S100) 
	 */
	public S100Output s100(S100Input inputParam, HundsunCallSession callSession) throws Exception {
		S100OutputAdapta output = this.callService(inputParam, callSession, S100OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 现金宝过户查询(S101) 
	 */
	public S101Output s101(S101Input inputParam, HundsunCallSession callSession) throws Exception {
		S101OutputAdapta output = this.callService(inputParam, callSession, S101OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 购物车信息查询(S103) 
	 */
	public S103Output s103(S103Input inputParam, HundsunCallSession callSession) throws Exception {
		S103OutputAdapta output = this.callService(inputParam, callSession, S103OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金风险等级查询(S104) 
	 */
	public S104Output s104(S104Input inputParam, HundsunCallSession callSession) throws Exception {
		S104OutputAdapta output = this.callService(inputParam, callSession, S104OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 过户入申请查询(S105) 
	 */
	public S105Output s105(S105Input inputParam, HundsunCallSession callSession) throws Exception {
		S105OutputAdapta output = this.callService(inputParam, callSession, S105OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 过户入确认查询(S106) 
	 */
	public S106Output s106(S106Input inputParam, HundsunCallSession callSession) throws Exception {
		S106OutputAdapta output = this.callService(inputParam, callSession, S106OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 未处理预约申请列表(Y001) 
	 */
	public Y001Output y001(Y001Input inputParam, HundsunCallSession callSession) throws Exception {
		Y001OutputAdapta output = this.callService(inputParam, callSession, Y001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 预约买入支付方式列表(Y002) 
	 */
	public Y002Output y002(Y002Input inputParam, HundsunCallSession callSession) throws Exception {
		Y002OutputAdapta output = this.callService(inputParam, callSession, Y002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 预约买入基金下单(Y003) 
	 */
	public Y003Output y003(Y003Input inputParam, HundsunCallSession callSession) throws Exception {
		Y003OutputAdapta output = this.callService(inputParam, callSession, Y003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 预约卖出支付方式列表(Y004) 
	 */
	public Y004Output y004(Y004Input inputParam, HundsunCallSession callSession) throws Exception {
		Y004OutputAdapta output = this.callService(inputParam, callSession, Y004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 预约卖出基金下单(Y005) 
	 */
	public Y005Output y005(Y005Input inputParam, HundsunCallSession callSession) throws Exception {
		Y005OutputAdapta output = this.callService(inputParam, callSession, Y005OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 证件号码修改(B002) 
	 */
	public B002Output b002(B002Input inputParam, HundsunCallSession callSession) throws Exception {
		B002OutputAdapta output = this.callService(inputParam, callSession, B002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 分行支行名称修改(B004) 
	 */
	public B004Output b004(B004Input inputParam, HundsunCallSession callSession) throws Exception {
		B004OutputAdapta output = this.callService(inputParam, callSession, B004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡变更(B007) 
	 */
	public B007Output b007(B007Input inputParam, HundsunCallSession callSession) throws Exception {
		B007OutputAdapta output = this.callService(inputParam, callSession, B007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道当前银行卡验证(B008) 
	 */
	public B008Output b008(B008Input inputParam, HundsunCallSession callSession) throws Exception {
		B008OutputAdapta output = this.callService(inputParam, callSession, B008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 异步方式银行返回数据验证(B009) 
	 */
	public B009Output b009(B009Input inputParam, HundsunCallSession callSession) throws Exception {
		B009OutputAdapta output = this.callService(inputParam, callSession, B009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 易宝渠道老客户签约(B010) 
	 */
	public B010Output b010(B010Input inputParam, HundsunCallSession callSession) throws Exception {
		B010OutputAdapta output = this.callService(inputParam, callSession, B010OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 易宝渠道无密验卡(B011) 
	 */
	public B011Output b011(B011Input inputParam, HundsunCallSession callSession) throws Exception {
		B011OutputAdapta output = this.callService(inputParam, callSession, B011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 小额打款(B012) 
	 */
	public B012Output b012(B012Input inputParam, HundsunCallSession callSession) throws Exception {
		B012OutputAdapta output = this.callService(inputParam, callSession, B012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 小额打款查询(B013) 
	 */
	public B013Output b013(B013Input inputParam, HundsunCallSession callSession) throws Exception {
		B013OutputAdapta output = this.callService(inputParam, callSession, B013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道当前银行卡查询(B014) 
	 */
	public B014Output b014(B014Input inputParam, HundsunCallSession callSession) throws Exception {
		B014OutputAdapta output = this.callService(inputParam, callSession, B014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道当前银行卡变更(B015) 
	 */
	public B015Output b015(B015Input inputParam, HundsunCallSession callSession) throws Exception {
		B015OutputAdapta output = this.callService(inputParam, callSession, B015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡变更(后台模式)(B016) 
	 */
	public B016Output b016(B016Input inputParam, HundsunCallSession callSession) throws Exception {
		B016OutputAdapta output = this.callService(inputParam, callSession, B016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银联渠道无密身份验证(B017) 
	 */
	public B017Output b017(B017Input inputParam, HundsunCallSession callSession) throws Exception {
		B017OutputAdapta output = this.callService(inputParam, callSession, B017OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道账户明细查询(B018) 
	 */
	public B018Output b018(B018Input inputParam, HundsunCallSession callSession) throws Exception {
		B018OutputAdapta output = this.callService(inputParam, callSession, B018OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道后台充值(B019) 
	 */
	public B019Output b019(B019Input inputParam, HundsunCallSession callSession) throws Exception {
		B019OutputAdapta output = this.callService(inputParam, callSession, B019OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道快速取现(B020) 
	 */
	public B020Output b020(B020Input inputParam, HundsunCallSession callSession) throws Exception {
		B020OutputAdapta output = this.callService(inputParam, callSession, B020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 汇付渠道单笔余额查询(B021) 
	 */
	public B021Output b021(B021Input inputParam, HundsunCallSession callSession) throws Exception {
		B021OutputAdapta output = this.callService(inputParam, callSession, B021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡快捷鉴权(B022) 
	 */
	public B022Output b022(B022Input inputParam, HundsunCallSession callSession) throws Exception {
		B022OutputAdapta output = this.callService(inputParam, callSession, B022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可还款信用卡查询(B023) 
	 */
	public B023Output b023(B023Input inputParam, HundsunCallSession callSession) throws Exception {
		B023OutputAdapta output = this.callService(inputParam, callSession, B023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 联动优势身份验证(B024) 
	 */
	public B024Output b024(B024Input inputParam, HundsunCallSession callSession) throws Exception {
		B024OutputAdapta output = this.callService(inputParam, callSession, B024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 联动优势单笔订单查询(B025) 
	 */
	public B025Output b025(B025Input inputParam, HundsunCallSession callSession) throws Exception {
		B025OutputAdapta output = this.callService(inputParam, callSession, B025OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银联通SDK开户签名生成(B026) 
	 */
	public B026Output b026(B026Input inputParam, HundsunCallSession callSession) throws Exception {
		B026OutputAdapta output = this.callService(inputParam, callSession, B026OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银联通SDK开户返回信息验证(B027) 
	 */
	public B027Output b027(B027Input inputParam, HundsunCallSession callSession) throws Exception {
		B027OutputAdapta output = this.callService(inputParam, callSession, B027OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可还款银行卡管理(B028) 
	 */
	public B028Output b028(B028Input inputParam, HundsunCallSession callSession) throws Exception {
		B028OutputAdapta output = this.callService(inputParam, callSession, B028OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 商户更改银行账户信息(B029) 
	 */
	public B029Output b029(B029Input inputParam, HundsunCallSession callSession) throws Exception {
		B029OutputAdapta output = this.callService(inputParam, callSession, B029OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 还款(缴费)账户信息验证(富友渠道)(B037) 
	 */
	public B037Output b037(B037Input inputParam, HundsunCallSession callSession) throws Exception {
		B037OutputAdapta output = this.callService(inputParam, callSession, B037OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 联行号查询(B039) 
	 */
	public B039Output b039(B039Input inputParam, HundsunCallSession callSession) throws Exception {
		B039OutputAdapta output = this.callService(inputParam, callSession, B039OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡快捷鉴权验证码发送(B040) 
	 */
	public B040Output b040(B040Input inputParam, HundsunCallSession callSession) throws Exception {
		B040OutputAdapta output = this.callService(inputParam, callSession, B040OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡快捷鉴权验证码验证(B041) 
	 */
	public B041Output b041(B041Input inputParam, HundsunCallSession callSession) throws Exception {
		B041OutputAdapta output = this.callService(inputParam, callSession, B041OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可还款银行信息查询(B042) 
	 */
	public B042Output b042(B042Input inputParam, HundsunCallSession callSession) throws Exception {
		B042OutputAdapta output = this.callService(inputParam, callSession, B042OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 建行快捷付签约验证(B043) 
	 */
	public B043Output b043(B043Input inputParam, HundsunCallSession callSession) throws Exception {
		B043OutputAdapta output = this.callService(inputParam, callSession, B043OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 建行快捷付签约查询(B044) 
	 */
	public B044Output b044(B044Input inputParam, HundsunCallSession callSession) throws Exception {
		B044OutputAdapta output = this.callService(inputParam, callSession, B044OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 签约协议表更新(B045) 
	 */
	public B045Output b045(B045Input inputParam, HundsunCallSession callSession) throws Exception {
		B045OutputAdapta output = this.callService(inputParam, callSession, B045OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * Chinapay手机支付下单(B046) 
	 */
	public B046Output b046(B046Input inputParam, HundsunCallSession callSession) throws Exception {
		B046OutputAdapta output = this.callService(inputParam, callSession, B046OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * Chinapay手机支付下单(B046) 
	 */
	public B047Output b047(B047Input inputParam, HundsunCallSession callSession) throws Exception {
		B047OutputAdapta output = this.callService(inputParam, callSession, B047OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可签解约银行卡列表(I001) 
	 */
	public I001Output i001(I001Input inputParam, HundsunCallSession callSession) throws Exception {
		I001OutputAdapta output = this.callService(inputParam, callSession, I001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行签约签名数据生成(I002) 
	 */
	public I002Output i002(I002Input inputParam, HundsunCallSession callSession) throws Exception {
		I002OutputAdapta output = this.callService(inputParam, callSession, I002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行解约签名数据生成(I003) 
	 */
	public I003Output i003(I003Input inputParam, HundsunCallSession callSession) throws Exception {
		I003OutputAdapta output = this.callService(inputParam, callSession, I003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡签解约(I004) 
	 */
	public I004Output i004(I004Input inputParam, HundsunCallSession callSession) throws Exception {
		I004OutputAdapta output = this.callService(inputParam, callSession, I004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投协议列表查询(I005) 
	 */
	public I005Output i005(I005Input inputParam, HundsunCallSession callSession) throws Exception {
		I005OutputAdapta output = this.callService(inputParam, callSession, I005OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投申购协议新增(I006) 
	 */
	public I006Output i006(I006Input inputParam, HundsunCallSession callSession) throws Exception {
		I006OutputAdapta output = this.callService(inputParam, callSession, I006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投申购协议变更(I007) 
	 */
	public I007Output i007(I007Input inputParam, HundsunCallSession callSession) throws Exception {
		I007OutputAdapta output = this.callService(inputParam, callSession, I007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投转换协议新增(I008) 
	 */
	public I008Output i008(I008Input inputParam, HundsunCallSession callSession) throws Exception {
		I008OutputAdapta output = this.callService(inputParam, callSession, I008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投转换协议变更(I009) 
	 */
	public I009Output i009(I009Input inputParam, HundsunCallSession callSession) throws Exception {
		I009OutputAdapta output = this.callService(inputParam, callSession, I009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投赎回协议新增(I010) 
	 */
	public I010Output i010(I010Input inputParam, HundsunCallSession callSession) throws Exception {
		I010OutputAdapta output = this.callService(inputParam, callSession, I010OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投赎回协议变更(I011) 
	 */
	public I011Output i011(I011Input inputParam, HundsunCallSession callSession) throws Exception {
		I011OutputAdapta output = this.callService(inputParam, callSession, I011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可定投申购的基金列表(I012) 
	 */
	public I012Output i012(I012Input inputParam, HundsunCallSession callSession) throws Exception {
		I012OutputAdapta output = this.callService(inputParam, callSession, I012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可定投转换的转入基金列表(I013) 
	 */
	public I013Output i013(I013Input inputParam, HundsunCallSession callSession) throws Exception {
		I013OutputAdapta output = this.callService(inputParam, callSession, I013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可定投赎回的基金列表(I014) 
	 */
	public I014Output i014(I014Input inputParam, HundsunCallSession callSession) throws Exception {
		I014OutputAdapta output = this.callService(inputParam, callSession, I014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行签约返回数据验证(I015) 
	 */
	public I015Output i015(I015Input inputParam, HundsunCallSession callSession) throws Exception {
		I015OutputAdapta output = this.callService(inputParam, callSession, I015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可定投支付方式列表(I016) 
	 */
	public I016Output i016(I016Input inputParam, HundsunCallSession callSession) throws Exception {
		I016OutputAdapta output = this.callService(inputParam, callSession, I016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 可定投转换的转出基金列表(I017) 
	 */
	public I017Output i017(I017Input inputParam, HundsunCallSession callSession) throws Exception {
		I017OutputAdapta output = this.callService(inputParam, callSession, I017OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史收益模拟计算(I018) 
	 */
	public I018Output i018(I018Input inputParam, HundsunCallSession callSession) throws Exception {
		I018OutputAdapta output = this.callService(inputParam, callSession, I018OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 趋势定投避险基金列表(I019) 
	 */
	public I019Output i019(I019Input inputParam, HundsunCallSession callSession) throws Exception {
		I019OutputAdapta output = this.callService(inputParam, callSession, I019OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投首次交易日期查询(I020) 
	 */
	public I020Output i020(I020Input inputParam, HundsunCallSession callSession) throws Exception {
		I020OutputAdapta output = this.callService(inputParam, callSession, I020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合定投协议新增(I022) 
	 */
	public I022Output i022(I022Input inputParam, HundsunCallSession callSession) throws Exception {
		I022OutputAdapta output = this.callService(inputParam, callSession, I022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合定投协议变更(I023) 
	 */
	public I023Output i023(I023Input inputParam, HundsunCallSession callSession) throws Exception {
		I023OutputAdapta output = this.callService(inputParam, callSession, I023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 银行卡签解约(后台模式)(I024) 
	 */
	public I024Output i024(I024Input inputParam, HundsunCallSession callSession) throws Exception {
		I024OutputAdapta output = this.callService(inputParam, callSession, I024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合定投协议查询(I025) 
	 */
	public I025Output i025(I025Input inputParam, HundsunCallSession callSession) throws Exception {
		I025OutputAdapta output = this.callService(inputParam, callSession, I025OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定投策略查询(I026) 
	 */
	public I026Output i026(I026Input inputParam, HundsunCallSession callSession) throws Exception {
		I026OutputAdapta output = this.callService(inputParam, callSession, I026OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金份额查询(S001) 
	 */
	public S001Output s001(S001Input inputParam, HundsunCallSession callSession) throws Exception {
		S001OutputAdapta output = this.callService(inputParam, callSession, S001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 当日交易申请查询(S002) 
	 */
	public S002Output s002(S002Input inputParam, HundsunCallSession callSession) throws Exception {
		S002OutputAdapta output = this.callService(inputParam, callSession, S002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史交易申请查询(S003) 
	 */
	public S003Output s003(S003Input inputParam, HundsunCallSession callSession) throws Exception {
		S003OutputAdapta output = this.callService(inputParam, callSession, S003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史交易确认查询(S004) 
	 */
	public S004Output s004(S004Input inputParam, HundsunCallSession callSession) throws Exception {
		S004OutputAdapta output = this.callService(inputParam, callSession, S004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史分红查询(S005) 
	 */
	public S005Output s005(S005Input inputParam, HundsunCallSession callSession) throws Exception {
		S005OutputAdapta output = this.callService(inputParam, callSession, S005OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 历史基金行情查询(S006) 
	 */
	public S006Output s006(S006Input inputParam, HundsunCallSession callSession) throws Exception {
		S006OutputAdapta output = this.callService(inputParam, callSession, S006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金净值查询(S007) 
	 */
	public S007Output s007(S007Input inputParam, HundsunCallSession callSession) throws Exception {
		S007OutputAdapta output = this.callService(inputParam, callSession, S007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 当前工作日查询(S008) 
	 */
	public S008Output s008(S008Input inputParam, HundsunCallSession callSession) throws Exception {
		S008OutputAdapta output = this.callService(inputParam, callSession, S008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 下个工作日查询(S009) 
	 */
	public S009Output s009(S009Input inputParam, HundsunCallSession callSession) throws Exception {
		S009OutputAdapta output = this.callService(inputParam, callSession, S009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金信息查询(S010) 
	 */
	public S010Output s010(S010Input inputParam, HundsunCallSession callSession) throws Exception {
		S010OutputAdapta output = this.callService(inputParam, callSession, S010OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 帐户资料修改查询(S011) 
	 */
	public S011Output s011(S011Input inputParam, HundsunCallSession callSession) throws Exception {
		S011OutputAdapta output = this.callService(inputParam, callSession, S011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 资金流水查询(S012) 
	 */
	public S012Output s012(S012Input inputParam, HundsunCallSession callSession) throws Exception {
		S012OutputAdapta output = this.callService(inputParam, callSession, S012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 浮动盈亏查询(S013) 
	 */
	public S013Output s013(S013Input inputParam, HundsunCallSession callSession) throws Exception {
		S013OutputAdapta output = this.callService(inputParam, callSession, S013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 投资收益查询(S014) 
	 */
	public S014Output s014(S014Input inputParam, HundsunCallSession callSession) throws Exception {
		S014OutputAdapta output = this.callService(inputParam, callSession, S014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 避险明细查询(S015) 
	 */
	public S015Output s015(S015Input inputParam, HundsunCallSession callSession) throws Exception {
		S015OutputAdapta output = this.callService(inputParam, callSession, S015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金排行榜查询(S016) 
	 */
	public S016Output s016(S016Input inputParam, HundsunCallSession callSession) throws Exception {
		S016OutputAdapta output = this.callService(inputParam, callSession, S016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 基金收益率查询(S017) 
	 */
	public S017Output s017(S017Input inputParam, HundsunCallSession callSession) throws Exception {
		S017OutputAdapta output = this.callService(inputParam, callSession, S017OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 组合定投基金列表(I021) 
	 */
	public I021Output i021(I021Input inputParam, HundsunCallSession callSession) throws Exception {
		I021OutputAdapta output = this.callService(inputParam, callSession, I021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 颁发令牌(P011) 
	 */
	public P0011Output p0011(P0011Input inputParam, HundsunCallSession callSession) throws Exception {
		P0011OutputAdapta output = this.callService(inputParam, callSession, P0011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 验证令牌(P012) 
	 */
	public P0012Output p0012(P0012Input inputParam, HundsunCallSession callSession) throws Exception {
		P0012OutputAdapta output = this.callService(inputParam, callSession, P0012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 销毁令牌(P013) 
	 */
	public P0013Output p0013(P0013Input inputParam, HundsunCallSession callSession) throws Exception {
		P0013OutputAdapta output = this.callService(inputParam, callSession, P0013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 刷新查询接口(P014) 
	 */
	public P0014Output p0014(P0014Input inputParam, HundsunCallSession callSession) throws Exception {
		P0014OutputAdapta output = this.callService(inputParam, callSession, P0014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 用户注册(P015) 
	 */
	public P0015Output p0015(P0015Input inputParam, HundsunCallSession callSession) throws Exception {
		P0015OutputAdapta output = this.callService(inputParam, callSession, P0015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 刷新用户信息(P016) 
	 */
	public P0016Output p0016(P0016Input inputParam, HundsunCallSession callSession) throws Exception {
		P0016OutputAdapta output = this.callService(inputParam, callSession, P0016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 服务定制查询(V001) 
	 */
	public V001Output v001(V001Input inputParam, HundsunCallSession callSession) throws Exception {
		V001OutputAdapta output = this.callService(inputParam, callSession, V001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 服务定制(V002) 
	 */
	public V002Output v002(V002Input inputParam, HundsunCallSession callSession) throws Exception {
		V002OutputAdapta output = this.callService(inputParam, callSession, V002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定制服务查询(V007) 
	 */
	public V007Output v007(V007Input inputParam, HundsunCallSession callSession) throws Exception {
		V007OutputAdapta output = this.callService(inputParam, callSession, V007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 定制服务(V008) 
	 */
	public V008Output v008(V008Input inputParam, HundsunCallSession callSession) throws Exception {
		V008OutputAdapta output = this.callService(inputParam, callSession, V008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 手机绑定信息查询(V011) 
	 */
	public V011Output v011(V011Input inputParam, HundsunCallSession callSession) throws Exception {
		V011OutputAdapta output = this.callService(inputParam, callSession, V011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 发送手机验证码(V012) 
	 */
	public V012Output v012(V012Input inputParam, HundsunCallSession callSession) throws Exception {
		V012OutputAdapta output = this.callService(inputParam, callSession, V012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 验证手机验证码(V013) 
	 */
	public V013Output v013(V013Input inputParam, HundsunCallSession callSession) throws Exception {
		V013OutputAdapta output = this.callService(inputParam, callSession, V013OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改手机绑定状态(V014) 
	 */
	public V014Output v014(V014Input inputParam, HundsunCallSession callSession) throws Exception {
		V014OutputAdapta output = this.callService(inputParam, callSession, V014OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 第三方账号绑定状态查询(V015) 
	 */
	public V015Output v015(V015Input inputParam, HundsunCallSession callSession) throws Exception {
		V015OutputAdapta output = this.callService(inputParam, callSession, V015OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改第三方账号绑定状态(V016) 
	 */
	public V016Output v016(V016Input inputParam, HundsunCallSession callSession) throws Exception {
		V016OutputAdapta output = this.callService(inputParam, callSession, V016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 邮箱绑定状态查询(V020) 
	 */
	public V020Output v020(V020Input inputParam, HundsunCallSession callSession) throws Exception {
		V020OutputAdapta output = this.callService(inputParam, callSession, V020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改邮箱绑定状态(V021) 
	 */
	public V021Output v021(V021Input inputParam, HundsunCallSession callSession) throws Exception {
		V021OutputAdapta output = this.callService(inputParam, callSession, V021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 充值码信息查询(V022) 
	 */
	public V022Output v022(V022Input inputParam, HundsunCallSession callSession) throws Exception {
		V022OutputAdapta output = this.callService(inputParam, callSession, V022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 充值码兑换记录查询(V023) 
	 */
	public V023Output v023(V023Input inputParam, HundsunCallSession callSession) throws Exception {
		V023OutputAdapta output = this.callService(inputParam, callSession, V023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 充值码兑换记录查询(V024) 
	 */
	public V024Output v024(V024Input inputParam, HundsunCallSession callSession) throws Exception {
		V024OutputAdapta output = this.callService(inputParam, callSession, V024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户积分兑换(V031) 
	 */
	public V031Output v031(V031Input inputParam, HundsunCallSession callSession) throws Exception {
		V031OutputAdapta output = this.callService(inputParam, callSession, V031OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户积分查询(V032) 
	 */
	public V032Output v032(V032Input inputParam, HundsunCallSession callSession) throws Exception {
		V032OutputAdapta output = this.callService(inputParam, callSession, V032OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 积分兑换列表(V033) 
	 */
	public V033Output v033(V033Input inputParam, HundsunCallSession callSession) throws Exception {
		V033OutputAdapta output = this.callService(inputParam, callSession, V033OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询客户的积分变换情况(V035) 
	 */
	public V035Output v035(V035Input inputParam, HundsunCallSession callSession) throws Exception {
		V035OutputAdapta output = this.callService(inputParam, callSession, V035OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询电子合同信息(E001) 
	 */
	public E001Output e001(E001Input inputParam, HundsunCallSession callSession) throws Exception {
		E001OutputAdapta output = this.callService(inputParam, callSession, E001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取专户用户授权信息(E002) 
	 */
	public E002Output e002(E002Input inputParam, HundsunCallSession callSession) throws Exception {
		E002OutputAdapta output = this.callService(inputParam, callSession, E002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 新增专户用户授权(E003) 
	 */
	public E003Output e003(E003Input inputParam, HundsunCallSession callSession) throws Exception {
		E003OutputAdapta output = this.callService(inputParam, callSession, E003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 签署电子合同或风险揭示书(E004) 
	 */
	public E004Output e004(E004Input inputParam, HundsunCallSession callSession) throws Exception {
		E004OutputAdapta output = this.callService(inputParam, callSession, E004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询专户剩余额度(E006) 
	 */
	public E006Output e006(E006Input inputParam, HundsunCallSession callSession) throws Exception {
		E006OutputAdapta output = this.callService(inputParam, callSession, E006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询专户人数限制(E007) 
	 */
	public E007Output e007(E007Input inputParam, HundsunCallSession callSession) throws Exception {
		E007OutputAdapta output = this.callService(inputParam, callSession, E007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 电子合同模版上传通知(E008) 
	 */
	public E008Output e008(E008Input inputParam, HundsunCallSession callSession) throws Exception {
		E008OutputAdapta output = this.callService(inputParam, callSession, E008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 电子合同撤销通知(E009) 
	 */
	public E009Output e009(E009Input inputParam, HundsunCallSession callSession) throws Exception {
		E009OutputAdapta output = this.callService(inputParam, callSession, E009OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取可用的银行渠道(C001) 
	 */
	public C001Output c001(C001Input inputParam, HundsunCallSession callSession) throws Exception {
		C001OutputAdapta output = this.callService(inputParam, callSession, C001OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 生成银行开户签名数据(C002) 
	 */
	public C002Output c002(C002Input inputParam, HundsunCallSession callSession) throws Exception {
		C002OutputAdapta output = this.callService(inputParam, callSession, C002OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 验证银行开户签名数据(C003) 
	 */
	public C003Output c003(C003Input inputParam, HundsunCallSession callSession) throws Exception {
		C003OutputAdapta output = this.callService(inputParam, callSession, C003OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取风险评测题目及答案(C004) 
	 */
	public C004Output c004(C004Input inputParam, HundsunCallSession callSession) throws Exception {
		C004OutputAdapta output = this.callService(inputParam, callSession, C004OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 校验弱密码(C006) 
	 */
	public C006Output c006(C006Input inputParam, HundsunCallSession callSession) throws Exception {
		C006OutputAdapta output = this.callService(inputParam, callSession, C006OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开户(C007) 
	 */
	public C007Output c007(C007Input inputParam, HundsunCallSession callSession) throws Exception {
		C007OutputAdapta output = this.callService(inputParam, callSession, C007OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开通网上交易(C008) 
	 */
	public C008Output c008(C008Input inputParam, HundsunCallSession callSession) throws Exception {
		C008OutputAdapta output = this.callService(inputParam, callSession, C008OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 读取用户信息(C010) 
	 */
	public C010Output c010(C010Input inputParam, HundsunCallSession callSession) throws Exception {
		C010OutputAdapta output = this.callService(inputParam, callSession, C010OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改用户信息(C011) 
	 */
	public C011Output c011(C011Input inputParam, HundsunCallSession callSession) throws Exception {
		C011OutputAdapta output = this.callService(inputParam, callSession, C011OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改密码(C012) 
	 */
	public C012Output c012(C012Input inputParam, HundsunCallSession callSession) throws Exception {
		C012OutputAdapta output = this.callService(inputParam, callSession, C012OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 验证密保问题(C016) 
	 */
	public C016Output c016(C016Input inputParam, HundsunCallSession callSession) throws Exception {
		C016OutputAdapta output = this.callService(inputParam, callSession, C016OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询密保问题(C017) 
	 */
	public C017Output c017(C017Input inputParam, HundsunCallSession callSession) throws Exception {
		C017OutputAdapta output = this.callService(inputParam, callSession, C017OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改密保问题(C018) 
	 */
	public C018Output c018(C018Input inputParam, HundsunCallSession callSession) throws Exception {
		C018OutputAdapta output = this.callService(inputParam, callSession, C018OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开户身份证号码升位(C019) 
	 */
	public C019Output c019(C019Input inputParam, HundsunCallSession callSession) throws Exception {
		C019OutputAdapta output = this.callService(inputParam, callSession, C019OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询交易账号(C020) 
	 */
	public C020Output c020(C020Input inputParam, HundsunCallSession callSession) throws Exception {
		C020OutputAdapta output = this.callService(inputParam, callSession, C020OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 增开交易账号(C021) 
	 */
	public C021Output c021(C021Input inputParam, HundsunCallSession callSession) throws Exception {
		C021OutputAdapta output = this.callService(inputParam, callSession, C021OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开通/取消手机委托(C022) 
	 */
	public C022Output c022(C022Input inputParam, HundsunCallSession callSession) throws Exception {
		C022OutputAdapta output = this.callService(inputParam, callSession, C022OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 实名认证(C023) 
	 */
	public C023Output c023(C023Input inputParam, HundsunCallSession callSession) throws Exception {
		C023OutputAdapta output = this.callService(inputParam, callSession, C023OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询风险匹配基金(C024) 
	 */
	public C024Output c024(C024Input inputParam, HundsunCallSession callSession) throws Exception {
		C024OutputAdapta output = this.callService(inputParam, callSession, C024OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 数据中心客户信息查询(C025) 
	 */
	public C025Output c025(C025Input inputParam, HundsunCallSession callSession) throws Exception {
		C025OutputAdapta output = this.callService(inputParam, callSession, C025OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开通/取消委托方式(C026) 
	 */
	public C026Output c026(C026Input inputParam, HundsunCallSession callSession) throws Exception {
		C026OutputAdapta output = this.callService(inputParam, callSession, C026OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 销基金账号(C027) 
	 */
	public C027Output c027(C027Input inputParam, HundsunCallSession callSession) throws Exception {
		C027OutputAdapta output = this.callService(inputParam, callSession, C027OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 销交易账号(C028) 
	 */
	public C028Output c028(C028Input inputParam, HundsunCallSession callSession) throws Exception {
		C028OutputAdapta output = this.callService(inputParam, callSession, C028OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 重置交易密码(C029) 
	 */
	public C029Output c029(C029Input inputParam, HundsunCallSession callSession) throws Exception {
		C029OutputAdapta output = this.callService(inputParam, callSession, C029OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 发送手机绑定验证码(C030) 
	 */
	public C030Output c030(C030Input inputParam, HundsunCallSession callSession) throws Exception {
		C030OutputAdapta output = this.callService(inputParam, callSession, C030OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 手机绑定(C031) 
	 */
	public C031Output c031(C031Input inputParam, HundsunCallSession callSession) throws Exception {
		C031OutputAdapta output = this.callService(inputParam, callSession, C031OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 发送手机解绑验证码(C032) 
	 */
	public C032Output c032(C032Input inputParam, HundsunCallSession callSession) throws Exception {
		C032OutputAdapta output = this.callService(inputParam, callSession, C032OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 手机解绑(C033) 
	 */
	public C033Output c033(C033Input inputParam, HundsunCallSession callSession) throws Exception {
		C033OutputAdapta output = this.callService(inputParam, callSession, C033OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询交易帐号(后台模式)(C034) 
	 */
	public C034Output c034(C034Input inputParam, HundsunCallSession callSession) throws Exception {
		C034OutputAdapta output = this.callService(inputParam, callSession, C034OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 增开基金账号(C035) 
	 */
	public C035Output c035(C035Input inputParam, HundsunCallSession callSession) throws Exception {
		C035OutputAdapta output = this.callService(inputParam, callSession, C035OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 增开交易账号(后台模式)(C036) 
	 */
	public C036Output c036(C036Input inputParam, HundsunCallSession callSession) throws Exception {
		C036OutputAdapta output = this.callService(inputParam, callSession, C036OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开户(后台模式)(C037) 
	 */
	public C037Output c037(C037Input inputParam, HundsunCallSession callSession) throws Exception {
		C037OutputAdapta output = this.callService(inputParam, callSession, C037OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改用户信息(后台模式)(C038) 
	 */
	public C038Output c038(C038Input inputParam, HundsunCallSession callSession) throws Exception {
		C038OutputAdapta output = this.callService(inputParam, callSession, C038OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取登录信息(C039) 
	 */
	public C039Output c039(C039Input inputParam, HundsunCallSession callSession) throws Exception {
		C039OutputAdapta output = this.callService(inputParam, callSession, C039OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开通汇款交易(C040) 
	 */
	public C040Output c040(C040Input inputParam, HundsunCallSession callSession) throws Exception {
		C040OutputAdapta output = this.callService(inputParam, callSession, C040OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 微信绑定(C041) 
	 */
	public C041Output c041(C041Input inputParam, HundsunCallSession callSession) throws Exception {
		C041OutputAdapta output = this.callService(inputParam, callSession, C041OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 删除微信绑定(C042) 
	 */
	public C042Output c042(C042Input inputParam, HundsunCallSession callSession) throws Exception {
		C042OutputAdapta output = this.callService(inputParam, callSession, C042OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询微信绑定(C043) 
	 */
	public C043Output c043(C043Input inputParam, HundsunCallSession callSession) throws Exception {
		C043OutputAdapta output = this.callService(inputParam, callSession, C043OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开户(银商模式)(C044) 
	 */
	public C044Output c044(C044Input inputParam, HundsunCallSession callSession) throws Exception {
		C044OutputAdapta output = this.callService(inputParam, callSession, C044OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改登录信息(C045) 
	 */
	public C045Output c045(C045Input inputParam, HundsunCallSession callSession) throws Exception {
		C045OutputAdapta output = this.callService(inputParam, callSession, C045OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询预登记信息(C046) 
	 */
	public C046Output c046(C046Input inputParam, HundsunCallSession callSession) throws Exception {
		C046OutputAdapta output = this.callService(inputParam, callSession, C046OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 新增预登记(C047) 
	 */
	public C047Output c047(C047Input inputParam, HundsunCallSession callSession) throws Exception {
		C047OutputAdapta output = this.callService(inputParam, callSession, C047OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 随机密码生成(C048) 
	 */
	public C048Output c048(C048Input inputParam, HundsunCallSession callSession) throws Exception {
		C048OutputAdapta output = this.callService(inputParam, callSession, C048OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取开户留痕(C049) 
	 */
	public C049Output c049(C049Input inputParam, HundsunCallSession callSession) throws Exception {
		C049OutputAdapta output = this.callService(inputParam, callSession, C049OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户角色查询(C053) 
	 */
	public C053Output c053(C053Input inputParam, HundsunCallSession callSession) throws Exception {
		C053OutputAdapta output = this.callService(inputParam, callSession, C053OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取证件类型(C054) 
	 */
	public C054Output c054(C054Input inputParam, HundsunCallSession callSession) throws Exception {
		C054OutputAdapta output = this.callService(inputParam, callSession, C054OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 开通网上委托(C055) 
	 */
	public C055Output c055(C055Input inputParam, HundsunCallSession callSession) throws Exception {
		C055OutputAdapta output = this.callService(inputParam, callSession, C055OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 实时银行账户信息同步(C056) 
	 */
	public C056Output c056(C056Input inputParam, HundsunCallSession callSession) throws Exception {
		C056OutputAdapta output = this.callService(inputParam, callSession, C056OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 更新开户留痕(C057) 
	 */
	public C057Output c057(C057Input inputParam, HundsunCallSession callSession) throws Exception {
		C057OutputAdapta output = this.callService(inputParam, callSession, C057OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 子账户开户(C058) 
	 */
	public C058Output c058(C058Input inputParam, HundsunCallSession callSession) throws Exception {
		C058OutputAdapta output = this.callService(inputParam, callSession, C058OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 子账户交易审核(C059) 
	 */
	public C059Output c059(C059Input inputParam, HundsunCallSession callSession) throws Exception {
		C059OutputAdapta output = this.callService(inputParam, callSession, C059OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 子账户密码修改(C060) 
	 */
	public C060Output c060(C060Input inputParam, HundsunCallSession callSession) throws Exception {
		C060OutputAdapta output = this.callService(inputParam, callSession, C060OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户预留信息更新(C061) 
	 */
	public C061Output c061(C061Input inputParam, HundsunCallSession callSession) throws Exception {
		C061OutputAdapta output = this.callService(inputParam, callSession, C061OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 客户银行卡信息查询(C062) 
	 */
	public C062Output c062(C062Input inputParam, HundsunCallSession callSession) throws Exception {
		C062OutputAdapta output = this.callService(inputParam, callSession, C062OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 注册信息修改(C063) 
	 */
	public C063Output c063(C063Input inputParam, HundsunCallSession callSession) throws Exception {
		C063OutputAdapta output = this.callService(inputParam, callSession, C063OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 读取用户网上交易预留信息(C064) 
	 */
	public C064Output c064(C064Input inputParam, HundsunCallSession callSession) throws Exception {
		C064OutputAdapta output = this.callService(inputParam, callSession, C064OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 修改用户网上交易预留信息(C065) 
	 */
	public C065Output c065(C065Input inputParam, HundsunCallSession callSession) throws Exception {
		C065OutputAdapta output = this.callService(inputParam, callSession, C065OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 重置注册密码(C066) 
	 */
	public C066Output c066(C066Input inputParam, HundsunCallSession callSession) throws Exception {
		C066OutputAdapta output = this.callService(inputParam, callSession, C066OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 查询基金账号(数据中心)(C067) 
	 */
	public C067Output c067(C067Input inputParam, HundsunCallSession callSession) throws Exception {
		C067OutputAdapta output = this.callService(inputParam, callSession, C067OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 身份证正反面认证(C068) 
	 */
	public C068Output c068(C068Input inputParam, HundsunCallSession callSession) throws Exception {
		C068OutputAdapta output = this.callService(inputParam, callSession, C068OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 身份证认证查询(C069) 
	 */
	public C069Output c069(C069Input inputParam, HundsunCallSession callSession) throws Exception {
		C069OutputAdapta output = this.callService(inputParam, callSession, C069OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 用户银行卡认证(C070) 
	 */
	public C070Output c070(C070Input inputParam, HundsunCallSession callSession) throws Exception {
		C070OutputAdapta output = this.callService(inputParam, callSession, C070OutputAdapta.class);
		return output.getResults();
	}
	
	/**
	 * 获取风险评测题目及答案(C004) 
	 */
	public C005Output c005(C005Input inputParam, HundsunCallSession callSession) throws Exception {
		C005OutputAdapta output = this.callService(inputParam, callSession, C005OutputAdapta.class);
		return output.getResults();
	}
}
