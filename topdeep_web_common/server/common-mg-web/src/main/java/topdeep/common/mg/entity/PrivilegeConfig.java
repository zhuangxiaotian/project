package topdeep.common.mg.entity;

import common.privilege.PrivilegeAttribute;
import common.privilege.PrivilegeFlag;
import common.privilege.PrivilegeOperate;

@PrivilegeFlag
public class PrivilegeConfig {

	public static final int CUSTOM_PRIVILEGE_BEGIN_VALUE = 50000;

	public static final int PRIVILEGE_GROUP_BEGIN_VALUE = 60000;

	public static final int CUSTOM_PRIVILEGE_GROUP_BEGIN_VALUE = 65000;

	public static final int FUNC_NOT_NEED = 0;

	@PrivilegeAttribute(Name = "用户管理", GroupName = "系统管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_OPERATOR_MANAGE = 1;

	@PrivilegeAttribute(Name = "角色管理", GroupName = "系统管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_ROLE_MANAGE = 2;

	@PrivilegeAttribute(Name = "权限管理", GroupName = "系统管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_PRIVILEGE_MANAGE = 3;

	
	@PrivilegeAttribute(Name = "个人白名单管理", GroupName = "管理工具", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_WHITELISTS_MANAGE = 20;

	@PrivilegeAttribute(Name = "系统配置", GroupName = "系统管理", Operate = PrivilegeOperate.ReadWriteDelete)
	public static final int FUNC_SYSTEM_PARAM_MANAGE = 4;

	@PrivilegeAttribute(Name = "数据字典", GroupName = "系统管理", Operate = PrivilegeOperate.ReadWriteDelete | PrivilegeOperate.Audit)
	public static final int FUNC_BASE_INFO_MANGE = 5;

	@PrivilegeAttribute(Name = "缓存刷新", GroupName = "系统工具", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_REFRESH_CACHE_MANAGE = 6;

	@PrivilegeAttribute(Name = "操作日志", GroupName = "系统工具", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_OPERATE_LOG_MANAGE = 7;

	@PrivilegeAttribute(Name = "版本管理", GroupName = "客户端管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CLIENT_VERSION_MANAGE = 40;

	@PrivilegeAttribute(Name = "激活分析", GroupName = "客户端管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CLIENT_ACTIVATION_MANAGE = 41;

	@PrivilegeAttribute(Name = "绑定查询", GroupName = "客户端管理", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_BIND_INFO_QUERY = 42;

	@PrivilegeAttribute(Name = "机构白名单管理", GroupName = "管理工具", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_ENTERPRISE_WHITELISTS_MANAGE = 21;
	
	@PrivilegeAttribute(Name = "参数配置", GroupName = "系统参数", Operate = PrivilegeOperate.ReadWriteDelete)
	public static final int FUNC_SYSTEM_CONFIG_MANAGE = 50;

	@PrivilegeAttribute(Name = "客户留言", GroupName = "客户服务", Operate = PrivilegeOperate.ReadWriteDeleteAudit)
	public static final int FUNC_CUSTOMER_MESSAGE_MANAGE = 8;
	
}
