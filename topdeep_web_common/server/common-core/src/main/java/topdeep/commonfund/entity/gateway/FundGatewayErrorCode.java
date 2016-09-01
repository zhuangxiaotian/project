package topdeep.commonfund.entity.gateway;
/**
 * 返回码说明常量定义
 */
public class FundGatewayErrorCode {
	
	/**
	 * 成功返回
	 */
	public static String SUCCESS = "0000";
	
	/**
	 * 交易服务调用失败
	 */
	public static String TRADE_SERVICE_CALL_ERROR = "1001";
	
	/**
	 * 查询服务调用失败
	 */
	public static String QUERY_SERVICE_CALL_ERROR = "1002";
	
	/**
	 * 输入数据错误，无法解包
	 */
	public static String INPUT_DATA_ERROR = "1003";
	
	/**
	 * 未知异常
	 */
	public static String SYSTEM_UNKNOWN_ERROR = "1999";
	
	/**
	 * 输入参数格式错误
	 */
	public static String INPUT_PARAM_FORMAT_ERROR = "2001";
	
	/**
	 * 缺少参数
	 */
	public static String INPUT_PARAM_NEED = "2002";
	
	/**
	 * 参数错误
	 */
	public static String INPUT_PARAM_ERROR = "2003";
	
	/**
	 * 签名错误
	 */
	public static String INPUT_SIGN_ERROR = "2004";
	
	/**
	 * 登录失败
	 */
	public static String CUSTOMER_LOGIN_ERROR = "3001";
	
	/**
	 * Session超时
	 */
	public static String SESSION_TIMEOUT = "3002";
	
	/**
	 * 无效的基金代码
	 */
	public static String INVALID_FUND_CODE = "3003";
	
	/**
	 * 无效的交易密码
	 */
	public static String INVALID_TRADE_PASSWORD = "3004";
	
	/**
	 * 无效的查询密码
	 */
	public static String INVALID_QUERY_PASSWORD = "3005";
	
	/**
	 * 无效的登录信息
	 */
	public static String INVALID_LOGIN_INFO = "3006";
	
	/**
	 * 无效的交易方式
	 */
	public static String INVALID_TRADE_METHOD = "3007";
	/**
	 * 世联用户检验提示错误码
	 */
	public static String WORLDUNION_VALIDCODE_ERROR = "WU98";
	/**
	 * 世联购买委托成功返回码;WU99与ta的0999对应
	 */
	public static String WORLDUNION_ENTRUST_SUCCESS_CODE = "WU99";
	
	/**
	 * 新客户（没有基金账号，无法操作）
	 */
	public static String NEW_OPEN_USER = "3008";

	public static String getErrorDesc(String code){
		return getName(code);
	}
	
	public static String getName(String code) {
		if (SUCCESS.equalsIgnoreCase(code)) {
			return "成功返回";
		}
		if (TRADE_SERVICE_CALL_ERROR.equalsIgnoreCase(code)) {
			return "交易服务调用失败";
		}
		if (QUERY_SERVICE_CALL_ERROR.equalsIgnoreCase(code)) {
			return "查询服务调用失败";
		}
		if (SYSTEM_UNKNOWN_ERROR.equalsIgnoreCase(code)) {
			return "未知异常";
		}
		if (INPUT_PARAM_FORMAT_ERROR.equalsIgnoreCase(code)) {
			return "输入参数格式错误";
		}
		if (INPUT_PARAM_NEED.equalsIgnoreCase(code)) {
			return "缺少参数";
		}
		if (INPUT_PARAM_ERROR.equalsIgnoreCase(code)) {
			return "参数错误";
		}
		if (INPUT_SIGN_ERROR.equalsIgnoreCase(code)) {
			return "签名错误";
		}
		if (CUSTOMER_LOGIN_ERROR.equalsIgnoreCase(code)) {
			return "登录失败";
		}
		if (SESSION_TIMEOUT.equalsIgnoreCase(code)) {
			return "Session超时";
		}
		if (INVALID_FUND_CODE.equalsIgnoreCase(code)) {
			return "无效的基金代码";
		}
		if (INVALID_TRADE_PASSWORD.equalsIgnoreCase(code)) {
			return "无效的交易密码";
		}
		if (INVALID_QUERY_PASSWORD.equalsIgnoreCase(code)) {
			return "无效的查询密码";
		}
		if (INVALID_LOGIN_INFO.equalsIgnoreCase(code)) {
			return "无效的登录信息";
		}
		if (INVALID_TRADE_METHOD.equalsIgnoreCase(code)) {
			return "无效的交易方式";
		}
		if (NEW_OPEN_USER.equalsIgnoreCase(code)) {
			return "新开户客户，无法操作";
		}
		return "未知常量";
	}
}
