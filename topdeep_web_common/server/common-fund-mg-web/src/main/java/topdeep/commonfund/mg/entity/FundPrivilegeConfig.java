package topdeep.commonfund.mg.entity;

import common.privilege.PrivilegeAttribute;
import common.privilege.PrivilegeFlag;
import common.privilege.PrivilegeOperate;

@PrivilegeFlag
public class FundPrivilegeConfig extends topdeep.common.mg.entity.PrivilegeConfig {

	@PrivilegeAttribute(Name = "交易渠道管理", GroupName = "交易参数", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CHANNEL_MANAGE = 30;

	@PrivilegeAttribute(Name = "参数转换管理", GroupName = "交易参数", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_TRADE_PARAM_MANAGE = 31;

	@PrivilegeAttribute(Name = "基金信息", GroupName = "基金管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_INFO_MANAGE = 60;

	@PrivilegeAttribute(Name = "基金分类", GroupName = "基金管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CATEGORY_MANAGE = 61;

	@PrivilegeAttribute(Name = "业务量统计", GroupName = "交易分析", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CUSTOMER_LOG_STATISTICS_MANAGE = 50;

	@PrivilegeAttribute(Name = "业务日志", GroupName = "交易分析", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CUSTOMER_LOG_MANAGE = 51;

	@PrivilegeAttribute(Name = "公告通知", GroupName = "公告通知", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_NOTICE_MANAGE = 90;

	@PrivilegeAttribute(Name = "绑定用户", GroupName = "基金客户", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_BIND_INFO_MANAGE = 70;

	@PrivilegeAttribute(Name = "银行卡Bin管理", GroupName = "管理工具", Operate = PrivilegeOperate.ReadWriteDeleteReport)
	public static final int FUNC_BANK_CARD_BIN_MANAGE = 30;
}
