package topdeep.commonfund.dao.hundsun;
import topdeep.commonfund.entity.hundsun.*;
import java.util.*;
public interface TradeDao {
	
	/**
	 * 未处理汇款余额查询(S019) 
	 */
	S019Output s019(S019Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 短期理财明细查询(S020) 
	 */
	S020Output s020(S020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 交易费率查询(S021) 
	 */
	S021Output s021(S021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 交易限制查询(S022) 
	 */
	S022Output s022(S022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 颁发令牌(K001) 
	 */
	K001Output k001(K001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * TA信息查询(S023) 
	 */
	S023Output s023(S023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 验证令牌(K002) 
	 */
	K002Output k002(K002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合理财份额查询(S024) 
	 */
	S024Output s024(S024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 现金宝基金列表(M004) 
	 */
	M004Output m004(M004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史交易申请查询(S025) 
	 */
	S025Output s025(S025Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可购买基金列表(T001) 
	 */
	T001Output t001(T001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 净值收益率排行榜查询(S026) 
	 */
	S026Output s026(S026Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可买入支付方式列表(T002) 
	 */
	T002Output t002(T002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 经纪人佣金信息查询(S027) 
	 */
	S027Output s027(S027Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金买入(T003) 
	 */
	T003Output t003(T003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 快速赎回统计信息查询(S028) 
	 */
	S028Output s028(S028Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 支付结果通知(T004) 
	 */
	T004Output t004(T004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 交易时间限制查询(S029) 
	 */
	S029Output s029(S029Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可转换目标基金列表(T005) 
	 */
	T005Output t005(T005Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 账户成交查询(S033) 
	 */
	S033Output s033(S033Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金卖出或转换(T006) 
	 */
	T006Output t006(T006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 费率折扣查询(S034) 
	 */
	S034Output s034(S034Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 分红方式修改(T007) 
	 */
	T007Output t007(T007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 短期理财到期日查询(S035) 
	 */
	S035Output s035(S035Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可撤单交易列表(T008) 
	 */
	T008Output t008(T008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 错误日志事件查询(S036) 
	 */
	S036Output s036(S036Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 撤单(T009) 
	 */
	T009Output t009(T009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金收益率查询(S037) 
	 */
	S037Output s037(S037Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可修改分红方式列表(T010) 
	 */
	T010Output t010(T010Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * T+0划款流水查询(S038) 
	 */
	S038Output s038(S038Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可转托管入基金列表(T011) 
	 */
	T011Output t011(T011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * T+0业务状态查询(S039) 
	 */
	S039Output s039(S039Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 转托管入(T012) 
	 */
	T012Output t012(T012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 相对工作日查询(S040) 
	 */
	S040Output s040(S040Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合投资基金列表(T013) 
	 */
	T013Output t013(T013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * CMS分类查询(S041) 
	 */
	S041Output s041(S041Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可组合投资支付方式列表(T014) 
	 */
	T014Output t014(T014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * CMS内容查询(S042) 
	 */
	S042Output s042(S042Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合投资买入(T015) 
	 */
	T015Output t015(T015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 预计还款日期查询(S043) 
	 */
	S043Output s043(S043Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合投资调仓(T016) 
	 */
	T016Output t016(T016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 还款流水查询(S044) 
	 */
	S044Output s044(S044Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 转托管出(T017) 
	 */
	T017Output t017(T017Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 帐户资料修改详情查询(S045) 
	 */
	S045Output s045(S045Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 代销T+0划款(T018) 
	 */
	T018Output t018(T018Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 公共事业缴费查询(S048) 
	 */
	S048Output s048(S048Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇款交易退款(T019) 
	 */
	T019Output t019(T019Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史收益查询(S049) 
	 */
	S049Output s049(S049Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 快速过户(T020) 
	 */
	T020Output t020(T020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开户申请审批状态查询(S050) 
	 */
	S050Output s050(S050Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 批量交易文件上传通知(T021) 
	 */
	T021Output t021(T021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 第三方预约交易申请查询(S051) 
	 */
	S051Output s051(S051Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 内部转托管(T022) 
	 */
	T022Output t022(T022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 用户超级现金宝信息查询(S052) 
	 */
	S052Output s052(S052Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡还款(T023) 
	 */
	T023Output t023(T023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 交易信息查询(S053) 
	 */
	S053Output s053(S053Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 公共事业缴费(T024) 
	 */
	T024Output t024(T024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝收益查询(S054) 
	 */
	S054Output s054(S054Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 份额冻结(T025) 
	 */
	T025Output t025(T025Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝交易申请查询(S056) 
	 */
	S056Output s056(S056Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 份额解冻(T026) 
	 */
	T026Output t026(T026Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 追加投资查询(S057) 
	 */
	S057Output s057(S057Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可转换来源基金列表(T027) 
	 */
	T027Output t027(T027Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 份额流水查询(S058) 
	 */
	S058Output s058(S058Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 扣款结果通知(后台模式) (T030) 
	 */
	T030Output t030(T030Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝基金行情查询(S059) 
	 */
	S059Output s059(S059Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 批量申购(后台模式)(T031) 
	 */
	T031Output t031(T031Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金详细信息查询(S060) 
	 */
	S060Output s060(S060Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可撤单列表接口(T032) 
	 */
	T032Output t032(T032Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询客户市值(S067) 
	 */
	S067Output s067(S067Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 免sessionkey基金买入(T033) 
	 */
	T033Output t033(T033Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史交易查询(S068) 
	 */
	S068Output s068(S068Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 免sessionkey基金卖出(T034) 
	 */
	T034Output t034(T034Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝份额查询(数据中心版)(S069) 
	 */
	S069Output s069(S069Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 免sessionkey基金撤单(T035) 
	 */
	T035Output t035(T035Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝交易账号查询(数据中心版)(S070) 
	 */
	S070Output s070(S070Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 快速赎回资金冻结(T036) 
	 */
	T036Output t036(T036Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝交易信息查询(数据中心版)(S071) 
	 */
	S071Output s071(S071Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 快速赎回资金解冻(T037) 
	 */
	T037Output t037(T037Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝收益查询(数据中心版)(S072) 
	 */
	S072Output s072(S072Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 申赎额度校验(T038) 
	 */
	T038Output t038(T038Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 投资收益明细查询接口(S073) 
	 */
	S073Output s073(S073Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 支付渠道查询(T039) 
	 */
	T039Output t039(T039Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 被推荐人明细查询接口(S074) 
	 */
	S074Output s074(S074Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 赎回渠道查询(T040) 
	 */
	T040Output t040(T040Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 直销系统时间查询(S075) 
	 */
	S075Output s075(S075Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 购物车信息新增(T041) 
	 */
	T041Output t041(T041Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金份额查询（整合模式）(S076) 
	 */
	S076Output s076(S076Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 购物车信息删除(T042) 
	 */
	T042Output t042(T042Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 时间段内每天的收益(S077) 
	 */
	S077Output s077(S077Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 购物车信息修改(T043) 
	 */
	T043Output t043(T043Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 专户基金信息披露(S078) 
	 */
	S078Output s078(S078Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 购物车信息修改(T044) 
	 */
	T044Output t044(T044Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 推荐人信息查询(S079) 
	 */
	S079Output s079(S079Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 读取字典项内容(P001) 
	 */
	P001Output p001(P001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史份额查询(S080) 
	 */
	S080Output s080(S080Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 登录系统(P003) 
	 */
	P003Output p003(P003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 持仓收益查询(S081) 
	 */
	S081Output s081(S081Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 登出系统(P004) 
	 */
	P004Output p004(P004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 子账户查询(S082) 
	 */
	S082Output s082(S082Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 取会话标示(P005) 
	 */
	P005Output p005(P005Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 待审核交易查询(S083) 
	 */
	S083Output s083(S083Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 风险评估(P006) 
	 */
	P006Output p006(P006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 待审核交易查询(S084) 
	 */
	S084Output s084(S084Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 交易登录(P007) 
	 */
	P007Output p007(P007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金开放日期查询(S085) 
	 */
	S085Output s085(S085Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 读取系统参数(P008) 
	 */
	P008Output p008(P008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户信息查询(S086) 
	 */
	S086Output s086(S086Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 记录操作日志(P009) 
	 */
	P009Output p009(P009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 经纪人信息查询(S087) 
	 */
	S087Output s087(S087Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 投资人预留信息查询(S088) 
	 */
	S088Output s088(S088Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 华宝查询未付收益变化流水明细(S089) 
	 */
	S089Output s089(S089Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 华宝查询投资者累计收益(S090) 
	 */
	S090Output s090(S090Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询基金状态预设置(S091) 
	 */
	S091Output s091(S091Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金费率查询(S092) 
	 */
	S092Output s092(S092Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 超级现金宝收支明细查询(S093) 
	 */
	S093Output s093(S093Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 指数均线查询(S094) 
	 */
	S094Output s094(S094Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 在途资产查询(S095) 
	 */
	S095Output s095(S095Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 业绩报酬查询接口(S096) 
	 */
	S096Output s096(S096Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 用户资产查询(S097) 
	 */
	S097Output s097(S097Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 注册信息查询(S098) 
	 */
	S098Output s098(S098Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史测评查询(S099) 
	 */
	S099Output s099(S099Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历测评详情查询(S100) 
	 */
	S100Output s100(S100Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 现金宝过户查询(S101) 
	 */
	S101Output s101(S101Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 购物车信息查询(S103) 
	 */
	S103Output s103(S103Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金风险等级查询(S104) 
	 */
	S104Output s104(S104Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 过户入申请查询(S105) 
	 */
	S105Output s105(S105Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 过户入确认查询(S106) 
	 */
	S106Output s106(S106Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 未处理预约申请列表(Y001) 
	 */
	Y001Output y001(Y001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 预约买入支付方式列表(Y002) 
	 */
	Y002Output y002(Y002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 预约买入基金下单(Y003) 
	 */
	Y003Output y003(Y003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 预约卖出支付方式列表(Y004) 
	 */
	Y004Output y004(Y004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 预约卖出基金下单(Y005) 
	 */
	Y005Output y005(Y005Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 证件号码修改(B002) 
	 */
	B002Output b002(B002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 分行支行名称修改(B004) 
	 */
	B004Output b004(B004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡变更(B007) 
	 */
	B007Output b007(B007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道当前银行卡验证(B008) 
	 */
	B008Output b008(B008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 异步方式银行返回数据验证(B009) 
	 */
	B009Output b009(B009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 易宝渠道老客户签约(B010) 
	 */
	B010Output b010(B010Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 易宝渠道无密验卡(B011) 
	 */
	B011Output b011(B011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 小额打款(B012) 
	 */
	B012Output b012(B012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 小额打款查询(B013) 
	 */
	B013Output b013(B013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道当前银行卡查询(B014) 
	 */
	B014Output b014(B014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道当前银行卡变更(B015) 
	 */
	B015Output b015(B015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡变更(后台模式)(B016) 
	 */
	B016Output b016(B016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银联渠道无密身份验证(B017) 
	 */
	B017Output b017(B017Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道账户明细查询(B018) 
	 */
	B018Output b018(B018Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道后台充值(B019) 
	 */
	B019Output b019(B019Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道快速取现(B020) 
	 */
	B020Output b020(B020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 汇付渠道单笔余额查询(B021) 
	 */
	B021Output b021(B021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡快捷鉴权(B022) 
	 */
	B022Output b022(B022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可还款信用卡查询(B023) 
	 */
	B023Output b023(B023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 联动优势身份验证(B024) 
	 */
	B024Output b024(B024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 联动优势单笔订单查询(B025) 
	 */
	B025Output b025(B025Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银联通SDK开户签名生成(B026) 
	 */
	B026Output b026(B026Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银联通SDK开户返回信息验证(B027) 
	 */
	B027Output b027(B027Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可还款银行卡管理(B028) 
	 */
	B028Output b028(B028Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 商户更改银行账户信息(B029) 
	 */
	B029Output b029(B029Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 还款(缴费)账户信息验证(富友渠道)(B037) 
	 */
	B037Output b037(B037Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 联行号查询(B039) 
	 */
	B039Output b039(B039Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡快捷鉴权验证码发送(B040) 
	 */
	B040Output b040(B040Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡快捷鉴权验证码验证(B041) 
	 */
	B041Output b041(B041Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可还款银行信息查询(B042) 
	 */
	B042Output b042(B042Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 建行快捷付签约验证(B043) 
	 */
	B043Output b043(B043Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 建行快捷付签约查询(B044) 
	 */
	B044Output b044(B044Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 签约协议表更新(B045) 
	 */
	B045Output b045(B045Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * Chinapay手机支付下单(B046) 
	 */
	B046Output b046(B046Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * Chinapay手机支付下单(B046) 
	 */
	B047Output b047(B047Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可签解约银行卡列表(I001) 
	 */
	I001Output i001(I001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行签约签名数据生成(I002) 
	 */
	I002Output i002(I002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行解约签名数据生成(I003) 
	 */
	I003Output i003(I003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡签解约(I004) 
	 */
	I004Output i004(I004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投协议列表查询(I005) 
	 */
	I005Output i005(I005Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投申购协议新增(I006) 
	 */
	I006Output i006(I006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投申购协议变更(I007) 
	 */
	I007Output i007(I007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投转换协议新增(I008) 
	 */
	I008Output i008(I008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投转换协议变更(I009) 
	 */
	I009Output i009(I009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投赎回协议新增(I010) 
	 */
	I010Output i010(I010Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投赎回协议变更(I011) 
	 */
	I011Output i011(I011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可定投申购的基金列表(I012) 
	 */
	I012Output i012(I012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可定投转换的转入基金列表(I013) 
	 */
	I013Output i013(I013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可定投赎回的基金列表(I014) 
	 */
	I014Output i014(I014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行签约返回数据验证(I015) 
	 */
	I015Output i015(I015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可定投支付方式列表(I016) 
	 */
	I016Output i016(I016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 可定投转换的转出基金列表(I017) 
	 */
	I017Output i017(I017Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史收益模拟计算(I018) 
	 */
	I018Output i018(I018Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 趋势定投避险基金列表(I019) 
	 */
	I019Output i019(I019Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投首次交易日期查询(I020) 
	 */
	I020Output i020(I020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合定投协议新增(I022) 
	 */
	I022Output i022(I022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合定投协议变更(I023) 
	 */
	I023Output i023(I023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 银行卡签解约(后台模式)(I024) 
	 */
	I024Output i024(I024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合定投协议查询(I025) 
	 */
	I025Output i025(I025Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定投策略查询(I026) 
	 */
	I026Output i026(I026Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金份额查询(S001) 
	 */
	S001Output s001(S001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 当日交易申请查询(S002) 
	 */
	S002Output s002(S002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史交易申请查询(S003) 
	 */
	S003Output s003(S003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史交易确认查询(S004) 
	 */
	S004Output s004(S004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史分红查询(S005) 
	 */
	S005Output s005(S005Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 历史基金行情查询(S006) 
	 */
	S006Output s006(S006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金净值查询(S007) 
	 */
	S007Output s007(S007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 当前工作日查询(S008) 
	 */
	S008Output s008(S008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 下个工作日查询(S009) 
	 */
	S009Output s009(S009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金信息查询(S010) 
	 */
	S010Output s010(S010Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 帐户资料修改查询(S011) 
	 */
	S011Output s011(S011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 资金流水查询(S012) 
	 */
	S012Output s012(S012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 浮动盈亏查询(S013) 
	 */
	S013Output s013(S013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 投资收益查询(S014) 
	 */
	S014Output s014(S014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 避险明细查询(S015) 
	 */
	S015Output s015(S015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金排行榜查询(S016) 
	 */
	S016Output s016(S016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 基金收益率查询(S017) 
	 */
	S017Output s017(S017Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 组合定投基金列表(I021) 
	 */
	I021Output i021(I021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 颁发令牌(P011) 
	 */
	P0011Output p0011(P0011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 验证令牌(P012) 
	 */
	P0012Output p0012(P0012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 销毁令牌(P013) 
	 */
	P0013Output p0013(P0013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 刷新查询接口(P014) 
	 */
	P0014Output p0014(P0014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 用户注册(P015) 
	 */
	P0015Output p0015(P0015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 刷新用户信息(P016) 
	 */
	P0016Output p0016(P0016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 服务定制查询(V001) 
	 */
	V001Output v001(V001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 服务定制(V002) 
	 */
	V002Output v002(V002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定制服务查询(V007) 
	 */
	V007Output v007(V007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 定制服务(V008) 
	 */
	V008Output v008(V008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 手机绑定信息查询(V011) 
	 */
	V011Output v011(V011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 发送手机验证码(V012) 
	 */
	V012Output v012(V012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 验证手机验证码(V013) 
	 */
	V013Output v013(V013Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改手机绑定状态(V014) 
	 */
	V014Output v014(V014Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 第三方账号绑定状态查询(V015) 
	 */
	V015Output v015(V015Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改第三方账号绑定状态(V016) 
	 */
	V016Output v016(V016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 邮箱绑定状态查询(V020) 
	 */
	V020Output v020(V020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改邮箱绑定状态(V021) 
	 */
	V021Output v021(V021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 充值码信息查询(V022) 
	 */
	V022Output v022(V022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 充值码兑换记录查询(V023) 
	 */
	V023Output v023(V023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 充值码兑换记录查询(V024) 
	 */
	V024Output v024(V024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户积分兑换(V031) 
	 */
	V031Output v031(V031Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户积分查询(V032) 
	 */
	V032Output v032(V032Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 积分兑换列表(V033) 
	 */
	V033Output v033(V033Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询客户的积分变换情况(V035) 
	 */
	V035Output v035(V035Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询电子合同信息(E001) 
	 */
	E001Output e001(E001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取专户用户授权信息(E002) 
	 */
	E002Output e002(E002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 新增专户用户授权(E003) 
	 */
	E003Output e003(E003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 签署电子合同或风险揭示书(E004) 
	 */
	E004Output e004(E004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询专户剩余额度(E006) 
	 */
	E006Output e006(E006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询专户人数限制(E007) 
	 */
	E007Output e007(E007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 电子合同模版上传通知(E008) 
	 */
	E008Output e008(E008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 电子合同撤销通知(E009) 
	 */
	E009Output e009(E009Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取可用的银行渠道(C001) 
	 */
	C001Output c001(C001Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 生成银行开户签名数据(C002) 
	 */
	C002Output c002(C002Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 验证银行开户签名数据(C003) 
	 */
	C003Output c003(C003Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取风险评测题目及答案(C004) 
	 */
	C004Output c004(C004Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 校验弱密码(C006) 
	 */
	C006Output c006(C006Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开户(C007) 
	 */
	C007Output c007(C007Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开通网上交易(C008) 
	 */
	C008Output c008(C008Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 读取用户信息(C010) 
	 */
	C010Output c010(C010Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改用户信息(C011) 
	 */
	C011Output c011(C011Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改密码(C012) 
	 */
	C012Output c012(C012Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 验证密保问题(C016) 
	 */
	C016Output c016(C016Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询密保问题(C017) 
	 */
	C017Output c017(C017Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改密保问题(C018) 
	 */
	C018Output c018(C018Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开户身份证号码升位(C019) 
	 */
	C019Output c019(C019Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询交易账号(C020) 
	 */
	C020Output c020(C020Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 增开交易账号(C021) 
	 */
	C021Output c021(C021Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开通/取消手机委托(C022) 
	 */
	C022Output c022(C022Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 实名认证(C023) 
	 */
	C023Output c023(C023Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询风险匹配基金(C024) 
	 */
	C024Output c024(C024Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 数据中心客户信息查询(C025) 
	 */
	C025Output c025(C025Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开通/取消委托方式(C026) 
	 */
	C026Output c026(C026Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 销基金账号(C027) 
	 */
	C027Output c027(C027Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 销交易账号(C028) 
	 */
	C028Output c028(C028Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 重置交易密码(C029) 
	 */
	C029Output c029(C029Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 发送手机绑定验证码(C030) 
	 */
	C030Output c030(C030Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 手机绑定(C031) 
	 */
	C031Output c031(C031Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 发送手机解绑验证码(C032) 
	 */
	C032Output c032(C032Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 手机解绑(C033) 
	 */
	C033Output c033(C033Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询交易帐号(后台模式)(C034) 
	 */
	C034Output c034(C034Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 增开基金账号(C035) 
	 */
	C035Output c035(C035Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 增开交易账号(后台模式)(C036) 
	 */
	C036Output c036(C036Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开户(后台模式)(C037) 
	 */
	C037Output c037(C037Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改用户信息(后台模式)(C038) 
	 */
	C038Output c038(C038Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取登录信息(C039) 
	 */
	C039Output c039(C039Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开通汇款交易(C040) 
	 */
	C040Output c040(C040Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 微信绑定(C041) 
	 */
	C041Output c041(C041Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 删除微信绑定(C042) 
	 */
	C042Output c042(C042Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询微信绑定(C043) 
	 */
	C043Output c043(C043Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开户(银商模式)(C044) 
	 */
	C044Output c044(C044Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改登录信息(C045) 
	 */
	C045Output c045(C045Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询预登记信息(C046) 
	 */
	C046Output c046(C046Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 新增预登记(C047) 
	 */
	C047Output c047(C047Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 随机密码生成(C048) 
	 */
	C048Output c048(C048Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取开户留痕(C049) 
	 */
	C049Output c049(C049Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户角色查询(C053) 
	 */
	C053Output c053(C053Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取证件类型(C054) 
	 */
	C054Output c054(C054Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 开通网上委托(C055) 
	 */
	C055Output c055(C055Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 实时银行账户信息同步(C056) 
	 */
	C056Output c056(C056Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 更新开户留痕(C057) 
	 */
	C057Output c057(C057Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 子账户开户(C058) 
	 */
	C058Output c058(C058Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 子账户交易审核(C059) 
	 */
	C059Output c059(C059Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 子账户密码修改(C060) 
	 */
	C060Output c060(C060Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户预留信息更新(C061) 
	 */
	C061Output c061(C061Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 客户银行卡信息查询(C062) 
	 */
	C062Output c062(C062Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 注册信息修改(C063) 
	 */
	C063Output c063(C063Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 读取用户网上交易预留信息(C064) 
	 */
	C064Output c064(C064Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 修改用户网上交易预留信息(C065) 
	 */
	C065Output c065(C065Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 重置注册密码(C066) 
	 */
	C066Output c066(C066Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 查询基金账号(数据中心)(C067) 
	 */
	C067Output c067(C067Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 身份证正反面认证(C068) 
	 */
	C068Output c068(C068Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 身份证认证查询(C069) 
	 */
	C069Output c069(C069Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 用户银行卡认证(C070) 
	 */
	C070Output c070(C070Input inputParam, HundsunCallSession callSession) throws Exception;
	
	/**
	 * 获取风险评测题目及答案(C004) 
	 */
	C005Output c005(C005Input inputParam, HundsunCallSession callSession) throws Exception;
}
