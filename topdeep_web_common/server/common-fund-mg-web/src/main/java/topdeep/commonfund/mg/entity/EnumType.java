/**
 * 
 */
package topdeep.commonfund.mg.entity;

/**
 * @author niexin
 *
 */
public class EnumType {

	public enum SiteType {
		WWW("门户网站", "0"),
		M("手机网站", "1"),
		App("客户端", "2"),
		ETRADE("交易网站", "3"),
		WG("微信网关", "4"),
		WX("微信网站", "5"),
		MGWEB("后台", "6");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private SiteType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum TargetSystem{
		SystemMgWeb("后台", "1");
		private String name;
		private String value;
		public String getName(){
			return this.name;
		}
		public String getValue(){
			return this.value;
		}
		private TargetSystem(String name, String value){
			this.name = name;
			this.value = value;
		}
	}
	
	
	public enum ValidType{
		SystemAdminEmail("管理员邮箱", "0"),
		SystemAdminForgetPassword("管理员忘记密码", "1");
		private String name;
		private String value;
		public String getName(){
			return this.name;
		}
		public String getValue(){
			return this.value;
		}
		private ValidType(String name, String value){
			this.name = name;
			this.value = value;
		}
	}

	public enum ValidState{
		NotValid("未验证","0"),
		HasValid("已验证","1");
		private String name;
		private String value;
		public String getName(){
			return this.name;
		}
		public String getValue(){
			return this.value;
		}
		private ValidState(String name, String value){
			this.name = name;
			this.value = value;
		}
	}
	
	public enum MsgChannelType{
		Sms("短信","0"),
		Email("邮件","1"),
		Wechat("微信", "");
		private String name;
		private String value;
		public String getName(){
			return this.name;
		}
		public String getValue(){
			return this.value;
		}
		private MsgChannelType(String name, String value){
			this.name = name;
			this.value = value;
		}
	}
	
	public enum MsgInfoType{
		ForgetPassword("忘记密码","1");
		private String name;
		private String value;
		public String getName(){
			return this.name;
		}
		public String getValue(){
			return this.value;
		}
		private MsgInfoType(String name, String value){
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

	public enum FundFundProperty {
		Lable("标签", "lable"),
		LableDesc("标签描述", "labledesc"),
		Corner("角标", "corner"),
		FundFee("申购费率", "fundfee"),
		Discount("折扣描述", "discount"),
		Feature("特色信息", "feature"),
		ShowIncomeRate("收益率显示", "showincomerate"),
		OtherDes("其他描述性文字", "otherDes");
		private String name;
		private String value;


		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private FundFundProperty(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum AuditState {
		NotAudited("未审核", "0"),
		AuditedPass("审核通过", "1"),
		AuditedNotPass("审核不通过", "2");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private AuditState(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}

	public enum FundCustMessageType {
		TransactionMessage("交易消息", "1"),
		SystemMessage("系统消息", "2"),
		ActivityMessage("活动消息", "3");
		private String name;
		private String value;

		public String getName() {
			return this.name;
		}

		public String getValue() {
			return this.value;
		}

		private FundCustMessageType(String name, String value) {
			this.name = name;
			this.value = value;
		}
	}
}
