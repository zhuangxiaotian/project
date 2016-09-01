package topdeep.commonfund.entity.hundsun;

/**
 * 函数调用返回码说明
 */
public class HundsunReturnCode {

	/**
	 * 成功，系统级返回码，所有调用接口成功都以该返回码为标志
	 */
	public final static String ETS_5BP0000 = "ETS-5BP0000";

	/**
	 * 无权限
	 */
	public final static String ETS_5BP0001 = "ETS-5BP0001";

	/**
	 * 未定义异常，系统级返回码，所有未捕获的异常都以该返回码为标志
	 */
	public final static String ETS_5AP9999 = "ETS-5AP9999";

	/**
	 * 暂不支持该格式输出
	 */
	public final static String ETS_5BP9981 = "ETS-5BP9981";

	/**
	 * 格式输出初始化出错
	 */
	public final static String ETS_5AP9982 = "ETS-5AP9982";

	/**
	 * 暂不支持该签名方式
	 */
	public final static String ETS_5BP9971 = "ETS-5BP9971";

	/**
	 * 签名方式初始化出错
	 */
	public final static String ETS_5AP9971 = "ETS-5AP9971";

	/**
	 * 组装参数字符串出错
	 */
	public final static String ETS_5AP9972 = "ETS-5AP9972";

	/**
	 * 签名验证不通过
	 */
	public final static String ETS_5BP9972 = "ETS-5BP9972";

	/**
	 * 暂不支持该加密算法
	 */
	public final static String ETS_5BP9973 = "ETS-5BP9973";

	/**
	 * 加密算法初始化出错
	 */
	public final static String ETS_5AP9973 = "ETS-5AP9973";

	/**
	 * 签名出错
	 */
	public final static String ETS_5AP9974 = "ETS-5AP9974";

	/**
	 * 数据校验不通过
	 */
	public final static String ETS_5BP9961 = "ETS-5BP9961";

	/**
	 * 数据校验出错
	 */
	public final static String ETS_5AP9961 = "ETS-5AP9961";

	/**
	 * Session已过期或未登录
	 */
	public final static String ETS_5BP9951 = "ETS-5BP9951";

	/**
	 * 暂不支持该字典
	 */
	public final static String ETS_5BP0011 = "ETS-5BP0011";

	/**
	 * 字典为空
	 */
	public final static String ETS_5BP0012 = "ETS-5BP0012";

	/**
	 * 银行卡列表为空
	 */
	public final static String ETS_5BC0011 = "ETS-5BC0011";

	/**
	 * 此资金方式已经暂停
	 */
	public final static String ETS_5BC0021 = "ETS-5BC0021";

	/**
	 * 此证件已经开户
	 */
	public final static String ETS_5BC0022 = "ETS-5BC0022";

	/**
	 * 未满18周岁不允许开户
	 */
	public final static String ETS_5BC0023 = "ETS-5BC0023";

	/**
	 * 生成开户签名数据发生错误
	 */
	public final static String ETS_5BC0024 = "ETS-5BC0024";

	/**
	 * 银行返回信息Map为空
	 */
	public final static String ETS_5BC0031 = "ETS-5BC0031";

	/**
	 * 解密开户银行返回数据发生错误
	 */
	public final static String ETS_5BC0032 = "ETS-5BC0032";

	/**
	 * 开户返回数据验证签名不通过
	 */
	public final static String ETS_5BC0033 = "ETS-5BC0033";

	/**
	 * 基金账号或交易账号不能同时为空
	 */
	public final static String ETS_5BC0081 = "ETS-5BC0081";

	/**
	 * 获取该用户账户资料信息发生错误
	 */
	public final static String ETS_5BC0082 = "ETS-5BC0082";

	/**
	 * 开通网上交易直销返回失败
	 */
	public final static String ETS_5BC0083 = "ETS-5BC0083";

	/**
	 * 修改风险问卷发生错误
	 */
	public final static String ETS_5BC0051 = "ETS-5BC0051";

	/**
	 * 调用直销服务发生错误
	 */
	public final static String ETS_5AT9999 = "ETS-5AT9999";

	/**
	 * 错误的业务代码
	 */
	public final static String ETS_5BT9998 = "ETS-5BT9998";

	/**
	 * 系统不支持现金宝业务
	 */
	public final static String ETS_5ST9997 = "ETS-5ST9997";

	/**
	 * 传入基金不支持指定业务
	 */
	public final static String ETS_5ST9996 = "ETS-5ST9996";

	/**
	 * 货币、保本型基金不允许做修改分红方式业务
	 */
	public final static String ETS_5BT0071 = "ETS-5BT0071";

	/**
	 * 解析网银返回数据发生错误
	 */
	public final static String ETS_5BT0041 = "ETS-5BT0041";

	/**
	 * 读取基金信息发生错误
	 */
	public final static String ETS_5BT0011 = "ETS-5BT0011";

	/**
	 * 目标基金不支持现金宝买入
	 */
	public final static String ETS_5BT0031 = "ETS-5BT0031";

	/**
	 * 系统不允许赎回到目标基金
	 */
	public final static String ETS_5BT0061 = "ETS-5BT0061";

	/**
	 * 错误的赎回方式
	 */
	public final static String ETS_5BT0062 = "ETS-5BT0062";

	/**
	 * 没有可转入目标基金
	 */
	public final static String ETS_5BT0051 = "ETS-5BT0051";

	/**
	 * 根据申请编号取原订单信息发生错误
	 */
	public final static String ETS_5BT0091 = "ETS-5BT0091";

	/**
	 * 传入交易账号或原申请编号错误
	 */
	public final static String ETS_5BT0092 = "ETS-5BT0092";

	/**
	 * 查询可撤销交易申请发生错误
	 */
	public final static String ETS_5BT0081 = "ETS-5BT0081";

	/**
	 * 无可撤销交易申请
	 */
	public final static String ETS_5BT0082 = "ETS-5BT0082";

	/**
	 * 6次密码错误，帐户锁定两小时
	 */
	public final static String ETS_9B119 = "ETS-9B119";

	/**
	 * 快速取现每日累计限额50万
	 */
	public final static String ETS_1226 = "1226";

	/**
	 * 快速取现每日累计限额50万
	 */
	public final static String ETS_2912 = "2912";

	/**
	 * 密码错误
	 */
	public final static String ETS_9B118 = "ETS-9B118";

	/**
	 * 开户鉴权失败反返回码
	 */
	public final static String ETS_5BP9999 = "ETS-5BP9999";

	/**
	 * 问卷已过期(存入)
	 */
	public final static String ETS_5BP0010 = "ETS-5BP0010";

	/**
	 * 问卷已过期(取现)
	 */
	public final static String ETS_1036 = "1036";

	/**
	 * 没有填写过风险问卷(取现)
	 */
	public final static String ETS_1035 = "1035";

	/**
	 * 数据库备份中，不可交易
	 */
	public final static String ETS_TA_S001 = "ETS-TA_S001";

	/**
	 * 新开户，不允许增开银行卡
	 */
	public final static String ETS_1B405 = "ETS-1B405";

	/**
	 * 付款账户(建信基金)余额低于下限值,不能发起T+0赎回业务
	 */
	public final static String ETS_1235 = "1235";

	/**
	 * 付款账户(建信基金)垫资账户余额不足,不能发起T+0赎回业务
	 */
	public final static String ETS_1231 = "1231";

	/**
	 * 快速赎回份额超过TA设置的上线
	 */
	public final static String ETS_2B1704 = "ETS-2B1704";

	/**
	 * 证件类型对应的证件号码不存在
	 */
	public final static String EQS_2B1301 = "EQS-2B1301";

	/**
	 * 查询密码错误
	 */
	public final static String ETS_9B204 = "ETS-9B204";

	/**
	 * 查询密码锁定
	 */
	public final static String EQS_2B1602 = "EQS-2B1602";

	/**
	 * 快速赎回业务停止
	 */
	public final static String ETS_1320 = "1320";

	/**
	 * 交易账号已锁定(交易时多次密码错误)
	 */
	public final static String ETS_1353 = "1353";

	/**
	 * 交易时密码错误
	 */
	public final static String ETS_0102 = "0102";

	/**
	 * 短信验证码错误
	 */
	public final static String ETS_1BQ08 = "ETS-1BQ08";

	/**
	 * 已经开户
	 */
	public final static String ETS_2016 = "2016";

	/**
	 * 已经开户
	 */
	public final static String ETS_2014 = "2014";

	/**
	 * 系统清算，无法登录
	 */
	public final static String ETS_9B030 = "ETS-9B030";

	/**
	 * 银行卡未鉴权，无法交易
	 */
	public final static String ETS_5BP1001 = "ETS-5BP1001";

	public static String getErrorCodeMessage(String errorCode) {
		if (errorCode.equals("ETS-9B119")) {
			return "您已输入6次错误密码，您的帐户将被锁定2小时";
		}
		if (errorCode.equals("1226")) {
			return "当日最高累计取现金额为50万元";
		}
		if (errorCode.equals("ETS-5BP0000")) {
			return "成功，系统级返回码，所有调用接口成功都以该返回码为标志";
		}
		if (errorCode.equals("ETS-5BP0001")) {
			return "无权限";
		}
		if (errorCode.equals("ETS-5AP9999")) {
			return "未定义异常，系统级返回码，所有未捕获的异常都以该返回码为标志";
		}
		if (errorCode.equals("ETS-5BP9981")) {
			return "暂不支持该格式输出";
		}
		if (errorCode.equals("ETS-5AP9982")) {
			return "格式输出初始化出错";
		}
		if (errorCode.equals("ETS-5BP9971")) {
			return "暂不支持该签名方式";
		}
		if (errorCode.equals("ETS-5AP9971")) {
			return "签名方式初始化出错";
		}
		if (errorCode.equals("ETS-5AP9972")) {
			return "组装参数字符串出错";
		}
		if (errorCode.equals("ETS-5BP9972")) {
			return "签名验证不通过";
		}
		if (errorCode.equals("ETS-5BP9973")) {
			return "暂不支持该加密算法";
		}
		if (errorCode.equals("ETS-5AP9973")) {
			return "加密算法初始化出错";
		}
		if (errorCode.equals("ETS-5AP9974")) {
			return "签名出错";
		}
		if (errorCode.equals("ETS-5BP9961")) {
			return "数据校验不通过";
		}
		if (errorCode.equals("ETS-5AP9961")) {
			return "数据校验出错";
		}
		if (errorCode.equals("ETS-5BP9951")) {
			return "Session已过期或未登录";
		}
		if (errorCode.equals("ETS-5BP0011")) {
			return "暂不支持该字典";
		}
		if (errorCode.equals("ETS-5BP0012")) {
			return "字典为空";
		}
		if (errorCode.equals("ETS-5BC0011")) {
			return "银行卡列表为空";
		}
		if (errorCode.equals("ETS-5BC0021")) {
			return "此资金方式已经暂停";
		}
		if (errorCode.equals("ETS-5BC0022")) {
			return "此证件已经开户";
		}
		if (errorCode.equals("ETS-5BC0023")) {
			return "未满18周岁不允许开户";
		}
		if (errorCode.equals("ETS-5BC0024")) {
			return "生成开户签名数据发生错误";
		}
		if (errorCode.equals("ETS-5BC0031")) {
			return "银行返回信息Map为空";
		}
		if (errorCode.equals("ETS-5BC0032")) {
			return "解密开户银行返回数据发生错误";
		}
		if (errorCode.equals("ETS-5BC0033")) {
			return "开户返回数据验证签名不通过";
		}
		if (errorCode.equals("ETS-5BC0081")) {
			return "基金账号或交易账号不能同时为空";
		}
		if (errorCode.equals("ETS-5BC0082")) {
			return "获取该用户账户资料信息发生错误";
		}
		if (errorCode.equals("ETS-5BC0083")) {
			return "开通网上交易直销返回失败";
		}
		if (errorCode.equals("ETS-5BC0051")) {
			return "修改风险问卷发生错误";
		}
		if (errorCode.equals("ETS-5AT9999")) {
			return "调用直销服务发生错误";
		}
		if (errorCode.equals("ETS-5BT9998")) {
			return "错误的业务代码";
		}
		if (errorCode.equals("ETS-5ST9997")) {
			return "系统不支持现金宝业务";
		}
		if (errorCode.equals("ETS-5ST9996")) {
			return "传入基金不支持指定业务";
		}
		if (errorCode.equals("ETS-5BT0071")) {
			return "货币、保本型基金不允许做修改分红方式业务";
		}
		if (errorCode.equals("ETS-5BT0041")) {
			return "解析网银返回数据发生错误";
		}
		if (errorCode.equals("ETS-5BT0011")) {
			return "读取基金信息发生错误";
		}
		if (errorCode.equals("ETS-5BT0031")) {
			return "目标基金不支持现金宝买入";
		}
		if (errorCode.equals("ETS-5BT0061")) {
			return "系统不允许赎回到目标基金";
		}
		if (errorCode.equals("ETS-5BT0062")) {
			return "错误的赎回方式";
		}
		if (errorCode.equals("ETS-5BT0051")) {
			return "没有可转入目标基金";
		}
		if (errorCode.equals("ETS-5BT0091")) {
			return "根据申请编号取原订单信息发生错误";
		}
		if (errorCode.equals("ETS-5BT0092")) {
			return "传入交易账号或原申请编号错误";
		}
		if (errorCode.equals("ETS-5BT0081")) {
			return "查询可撤销交易申请发生错误";
		}
		if (errorCode.equals("ETS-5BT0082")) {
			return "无可撤销交易申请";
		}
		return "未知错误";
	}
}
