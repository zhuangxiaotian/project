/**
 * 
 */
package topdeep.common.entity.manage;

/**
 * @author niexin
 *
 */
public class ManageErrorCode {

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
	 * 无效的基金代码
	 */
	public static String IDNO_VER_FAIL = "3004";

	/**
	 * 日期无效
	 */
	public static String VALID_DATE = "3005";

	/**
	 * 不在业务受理时间
	 */
	public static String VALID_TIME = "3006";

	/**
	 * 
	 */
	public ManageErrorCode() {
		// TODO Auto-generated constructor stub
	}

}
