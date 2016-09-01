/**
 * 
 */
package topdeep.common.entity.constant;

/**
 * @author niexin
 *
 */
public class EnumType {

	public enum SystemType {
		Common("通用", "c");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private SystemType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum ActionType {
		Login("登录", "login"),
		Purchase("申购", "purchase"),
		Subscribe("认购", "subscribe"),
		Redeem("赎回", "redeem"),
		Cancel("撤单", "cancel"),
		Fast_Redeem("快赎", "fast_redeem"),
		Fixed_Investment("定投", "fixed_investment"),
		Password_Update("密码修改", "password_update"),
		Open_Account("开户", "openAccount"),
		Add_Bank_Card("增卡", "addBankCard"),
		TRANSFER("过户", "transfer"),
		FILEUPLOAD("文件上传", "fileupload"),
		FILEDOWNLOAD("文件下载", "filedownLoad");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private ActionType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum JobState {
		/**
		 * 0 无效
		 */
		Invalid("无效", "0"),
		/**
		 * 1 激活状态
		 */
		Normal("正常", "1"),
		/**
		 * 2 管理员已禁止
		 */
		AdminDisabled("管理员已禁止", "2"),
		/**
		 * 3 用户已禁止
		 */
		UserDisabled("管理员已禁止", "3"),
		/**
		 * 4 一次性任务已完成
		 */
		Finished("已完成", "4");

		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private JobState(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum JobExecuteResult {
		Fail("失败", "0"),
		Success("成功", "1"),
		ParamError("参数不满足", "2"),
		AdminDisabled("管理员禁止", "3"),
		UserDisabled("用户禁止", "4"),
		Timeout("超时", "5");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private JobExecuteResult(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum TargetSystemType {
		Default("默认管理系统", "0"),
		FundTrade("基金交易系统", "1"),
		Wechat("微信网关", "2"),
		Cms("内容管理系统", "3"),
		Push("推送系统", "4");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private TargetSystemType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum ValidType {
		SystemAdminEmail("管理员邮箱", "0"),
		SystemAdminForgetPassword("管理员忘记密码", "1"),
		TradeOpenAccount("交易开户验证", "2"),
		TradeFormatPassword("忘记交易密码", "3");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private ValidType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	/**
	 * 除默认的证件类型外
	 * 
	 * @author niexin
	 *
	 */
	public enum UserIdType {
		SystemId("系统ID", "systemId"),
		OpenId("OpenId", "openId"),
		CustomerNo("客户编号", "customerno");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private UserIdType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum ValidState {
		NotValid("未验证", "0"),
		HasValid("已验证", "1");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private ValidState(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum MsgChannelType {
		Sms("短信", "0"),
		Email("邮件", "1"),
		Wechat("微信", "");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private MsgChannelType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum MsgInfoType {
		ForgetPassword("忘记密码", "1");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private MsgInfoType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum MsgSendState {
		// Name Code Comment Domain Data Type Length Precision Primary Foreign Key Mandatory
		// SEND_STATE SEND_STATE 0 初始状态不可发送 1可以发送 2 发送成功 3发送失败 34次发送失败已停止发送 CHAR1 CHAR(1) 1 FALSE FALSE TRUE
		Prepare("准备", "0"),
		Normal("可以发送", "1"),
		Success("发送成功", "2"),
		FailTry("发送失败，重试中", "3"),
		Fail("发送失败，停止发送", "4");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private MsgSendState(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}
}
