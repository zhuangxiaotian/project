/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016-05-10 22:20:04                          */
/*==============================================================*/


drop table if exists T_SYSTEM_ADMIN;

drop table if exists T_SYSTEM_ADMIN_LOG;

drop table if exists T_SYSTEM_ADMIN_ROLES;

drop table if exists T_SYSTEM_BASE_INFO;

drop table if exists T_SYSTEM_CONFIG;

drop table if exists T_SYSTEM_CRON_JOB;

drop table if exists T_SYSTEM_CRON_JOB_LOG;

drop table if exists T_SYSTEM_EXT_USER_RELATION;

drop table if exists T_SYSTEM_MSG_SEND;

drop table if exists T_SYSTEM_PARAM;

drop table if exists T_SYSTEM_PRIVILEGE;

drop table if exists T_SYSTEM_ROLES;

drop table if exists T_SYSTEM_VALID_INFO;

drop table if exists T_SYSTEM_WHITE_LIST;

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN                                        */
/*==============================================================*/
create table T_SYSTEM_ADMIN
(
   ID                   char(24) not null comment '操作员标识',
   NAME                 varchar(50) not null comment '操作员名称',
   STATE                char(1) not null comment '操作员状态,0 禁止,1 正常',
   LOGIN_EMAIL          varchar(255) comment '操作员邮件',
   LOGIN_NAME           varchar(50) not null comment '登陆名称',
   LOGIN_PASS_SALT      varchar(50) not null comment '密码加密盐值',
   LOGIN_PASS           varchar(50) not null comment '登陆密码',
   MOBILE_TELEPHONE     varchar(50) comment '移动电话',
   OTHER_TELEPHONE      varchar(50) comment '其他电话',
   LAST_LOGINTIME       datetime comment '最后一次登录时间',
   LAST_LOGINADDRESS    varchar(50) comment '最后一次登录地址',
   MEMO                 varchar(1000) comment '操作员备注',
   PARENT_ADMIN_ID      char(24) not null comment '超级管理员ID，特殊值表示超级管理员本身',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   DELETED              char(1) not null default '0' comment '是否删除 0正常1删除',
   primary key (ID)
);

alter table T_SYSTEM_ADMIN comment '系统管理员表，公网用户注册';

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN_LOG                                    */
/*==============================================================*/
create table T_SYSTEM_ADMIN_LOG
(
   ADMIN_LOG_ID         char(24) not null comment '操作员日志标识',
   ADMIN_ID             char(24) not null comment '操作员标识',
   OPERATE_TIME         datetime not null comment '操作时间',
   OPERATE_TYPE         varchar(100) not null comment '操作类别',
   OPERATE_CONTENT      varchar(2000) not null comment '操作内容',
   ROW_VERSION          numeric(8,0) not null comment '版本号(DML操作时用)',
   primary key (ADMIN_LOG_ID)
);

alter table T_SYSTEM_ADMIN_LOG comment 'Cms管理员日志';

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN_ROLES                                  */
/*==============================================================*/
create table T_SYSTEM_ADMIN_ROLES
(
   ID                   char(24) not null comment '主键',
   ADMIN_ID             char(24) not null comment '用户',
   ROLES_ID             char(24) not null comment '角色',
   ROW_VERSION          numeric(8,0) not null comment 'DML版本',
   primary key (ID)
);

alter table T_SYSTEM_ADMIN_ROLES comment '管理员和角色的关联表';

/*==============================================================*/
/* Table: T_SYSTEM_BASE_INFO                                    */
/*==============================================================*/
create table T_SYSTEM_BASE_INFO
(
   CODE_ID              varchar(50) not null comment '字典值',
   CODE_TYPE            varchar(10) not null comment '字典类型',
   CODE_NAME            varchar(100) comment '字典名称',
   CODE_DESC            varchar(500) comment '字典描述',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   ORDER_FIELD          numeric(8,0) not null comment '字典顺序',
   SYSTEM_TYPE          char(1) not null comment '产品类型由系统定义',
   CREATE_TIME          datetime not null comment '创建时间',
   AUDIT_ID             char(24) comment '审核人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   CREATE_ID            char(24) comment '创建人ID',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   AUDIT_TIME           datetime comment '审核时间',
   MODIFY_ID            char(24) comment '修改人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   primary key (CODE_ID, CODE_TYPE, SYSTEM_TYPE)
);

alter table T_SYSTEM_BASE_INFO comment '系统基本信息表';

/*==============================================================*/
/* Table: T_SYSTEM_CONFIG                                       */
/*==============================================================*/
create table T_SYSTEM_CONFIG
(
   SYSTEM_PARAM_CATEGORY varchar(100) not null comment '参数分类',
   SYSTEM_PARAM_CODE    varchar(100) not null comment '参数代码',
   SYSTEM_PARAM_NAME    varchar(100) not null comment '参数名称',
   SYSTEM_PARAM_DESC    varchar(1000) comment '参数说明',
   SYSTEM_PARAM_VALUE   varchar(2000) comment '参数值',
   LAST_MODIFY_TIME     datetime comment '最后修改时间',
   LAST_MODIFY_OPER     char(24) comment '最后修改人',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (SYSTEM_PARAM_CATEGORY, SYSTEM_PARAM_CODE)
);

alter table T_SYSTEM_CONFIG comment '系统配置表';

/*==============================================================*/
/* Table: T_SYSTEM_CRON_JOB                                     */
/*==============================================================*/
create table T_SYSTEM_CRON_JOB
(
   ID                   char(24) not null,
   NAME                 varchar(100) not null comment '任务名称',
   OWNER_ID             char(24) comment '所属系统，允许为空，为空表示该任务从属无关',
   JOB_TYPE             char(1) not null comment '0 定时执行 1 一次性',
   JOB_FROM             char(1) not null comment '0 系统 1用户',
   JOB_LOCATE           char(1) not null comment '系统执行位置',
   JOB_BEAN_ID          varchar(50) not null comment '执行任务的对象在IOC容器中的名称',
   JOB_VERSION          numeric(8,0) not null comment '任务版本',
   CYCLE_VALUE          numeric(8,0) comment '周期值',
   CYCLE_UNIT           char(1) comment '周期单位 s秒m分钟h小时y年M月d日',
   LAST_SUCCESS_TIME    datetime comment '上次成功执行时间',
   FIRST_EXECUTE_TIME   datetime comment '首次执行时间',
   NEXT_EXECUTE_TIME    datetime comment '下次执行时间',
   SUCCESS_COUNT        numeric(8,0) not null comment '成功次数',
   FAIL_COUNT           numeric(8,0) not null comment '失败次数',
   TOTAL_COUNT          numeric(8,0) not null comment '总执行次数',
   LAST_EXECUTE_RESULT  char(1) comment '上次执行结果 0 失败 1成功 2执行器返回参数不满足，未执行 3 管理员取消 4用户取消',
   LAST_EXECUTE_MESSAGE varchar(200) comment '上次执行结果消息',
   JOB_STATE            char(1) not null comment '0 无效 1 激活状态 2 管理员已禁止 3 用户已禁止',
   LOG_ENABLED          char(1) not null comment '激活执行记录，0 不记录 1记录到表中',
   CURRENT_EXEC_SERVER  varchar(200) comment '当前执行任务的服务器，只有当该字段为空时，服务器才可以执行该任务',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (ID)
);

alter table T_SYSTEM_CRON_JOB comment '系统定时任务表,动态参数放在动态参数表中，由各个任务类型定义';

/*==============================================================*/
/* Table: T_SYSTEM_CRON_JOB_LOG                                 */
/*==============================================================*/
create table T_SYSTEM_CRON_JOB_LOG
(
   ID                   char(24) not null,
   JOB_ID               char(24) not null comment '任务ID',
   NAME                 varchar(100) not null comment '任务名称',
   OWNER_ID             char(24) comment '所属者',
   JOB_FROM             char(1) not null comment '0 系统 1用户',
   JOB_LOCATE           char(1) not null comment '任务执行位置',
   JOB_BEAN_ID          varchar(50) not null comment '执行任务的对象在IOC容器中的名称',
   JOB_VERSION          numeric(8,0) not null comment '任务版本',
   START_EXECUTE_TIME   datetime comment '开始执行时间',
   END_EXECUTE_TIME     datetime comment '结束执行时间',
   USE_TIME             numeric(8,0) comment '执行任务所需要的毫秒数',
   EXECUTE_RESULT       char(1) comment '上次执行结果 0 失败 1成功 2执行器返回参数不满足，未执行 3 管理员取消 4用户取消 5 超时未返回',
   EXECUTE_MESSAGE      varchar(200) comment '上次执行结果消息',
   EXEC_SERVER          varchar(200) comment '执行任务的服务器',
   ROW_VERSION          numeric(8,0) not null,
   primary key (ID)
);

alter table T_SYSTEM_CRON_JOB_LOG comment '系统定时任务执行记录表';

/*==============================================================*/
/* Table: T_SYSTEM_EXT_USER_RELATION                            */
/*==============================================================*/
create table T_SYSTEM_EXT_USER_RELATION
(
   ID                   char(24) not null comment 'PK',
   ADMIN_ID             char(24) not null comment '关联的用户标识，对于链接外部系统 ，是指本系统的用户ID，对于链入系统，则链接的用户ID',
   VISIT_TOKEN          char(24) not null comment '访问TOKEN',
   REALTION_TYPE        char(1) not null comment '关系类型 0 链接外部系统 1 外部系统链接进来',
   EXTERNAL_SYSTEM_TYPE char(1) not null comment '外部系统类型 0 基金交易系统 1 CMS系统 2 PUSH系统 3 微信系统',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (ID)
);

alter table T_SYSTEM_EXT_USER_RELATION comment '外部系统用户关联表';

/*==============================================================*/
/* Table: T_SYSTEM_MSG_SEND                                     */
/*==============================================================*/
create table T_SYSTEM_MSG_SEND
(
   ID                   char(24) not null comment '主键',
   TARGET_SYSTEM        char(1) not null,
   CHANNEL_TYPE         char(1) not null comment '通道类型0 短信 1邮件 2微信',
   INFO_TYPE            char(1) not null comment '短信类型',
   TARGET_IDENTITY      varchar(200) not null comment '目标标识，例如身份证',
   SEND_PRIORITY        numeric(8,0) not null comment '发送优先级，默认填3',
   TARGET               varchar(255) not null comment '发送目标',
   CONTENT              varchar(2000) not null comment '发送内容',
   CREATE_TIME          datetime not null comment '创建时间',
   SEND_TIME            datetime comment '发送时间',
   SEND_COUNT           numeric(8,0) not null comment '发送次数',
   SEND_STATE           char(1) not null comment '0 初始状态不可发送 1可以发送 2 发送成功 3发送失败 34次发送失败已停止发送',
   ROW_VERSION          numeric(8,0) not null,
   primary key (ID)
);

alter table T_SYSTEM_MSG_SEND comment '消息发送表';

/*==============================================================*/
/* Table: T_SYSTEM_PARAM                                        */
/*==============================================================*/
create table T_SYSTEM_PARAM
(
   ID                   char(24) not null comment '对象ID',
   SUPER_ADMIN_ID       char(24) not null comment '超级用户标识',
   OBJ_TYPE             char(1) not null comment '对象类型，由程序中枚举定义',
   PARAM_CODE           varchar(100) not null comment '参数Code',
   PARAM_TYPE           varchar(100) not null comment '参数类型，定义了如何在界面上维护这个参数',
   PARAM_TYPE_DATA      varchar(100) comment '参数类型数据，如数据源类型，此处存放数据源类型的值 ',
   PARAM_NAME           varchar(100) not null comment '参数名称',
   PARAM_DESC           varchar(500) comment '参数描述',
   USER_MODIFY          char(1) not null comment '是否允许修改',
   PARAM_VALUE          varchar(2000) comment '参数值',
   PARAM_VALUE_DESC     varchar(500) comment '参数值描述',
   PARAM_REQUIRED       char(1) not null default '0' comment '参数是否必填0不必填 1必填',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (ID, PARAM_CODE)
);

alter table T_SYSTEM_PARAM comment '对象参数表,存放所有系统的参数';

/*==============================================================*/
/* Table: T_SYSTEM_PRIVILEGE                                    */
/*==============================================================*/
create table T_SYSTEM_PRIVILEGE
(
   FUNC_PRIVILEGE       numeric(8,0) not null comment '功能权限值',
   FUNC_OPERATE         numeric(8,0) not null comment '二进制位表示，目前共8个权限位，保留了8个位扩展用',
   FUNC_NAME            varchar(100) comment '权限名称',
   FUNC_PARENT          numeric(8,0) comment '父权限，0表示本身是权限分组',
   FUNC_ORDER           numeric(8,0) comment '权限组内排序',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (FUNC_PRIVILEGE)
);

alter table T_SYSTEM_PRIVILEGE comment '可用权限表
表中包含两种数据，权限分组和权限
权限分组的ID必须大于等于65000，同时父权限设';

/*==============================================================*/
/* Table: T_SYSTEM_ROLES                                        */
/*==============================================================*/
create table T_SYSTEM_ROLES
(
   ID                   char(24) not null comment '角色标识',
   NAME                 varchar(50) not null comment '角色名称',
   ROLE_PRIVILEGES      varchar(1000) comment '角色权限',
   STATE                char(1) not null comment '角色状态(1 正常 0 禁止)',
   MEMO                 varchar(1000) comment '角色备注',
   SUPER_ADMIN_ID       char(24) not null comment '相关联的超级用户ID',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   DELETED              char(1) not null default '0' comment '是否删除 0正常1删除',
   primary key (ID)
);

alter table T_SYSTEM_ROLES comment '角色表';

/*==============================================================*/
/* Table: T_SYSTEM_VALID_INFO                                   */
/*==============================================================*/
create table T_SYSTEM_VALID_INFO
(
   ID                   char(24) not null comment 'PK',
   TARGET_SYSTEM        char(1) not null,
   VALID_USER_ID        char(24) not null comment '验证的用户标识',
   VALID_TYPE           char(1) comment '验证类型 0 用户邮箱验证 1 忘记密码验证',
   RANDOM_VALUE         varchar(50) not null comment '随机字符串',
   CREATE_TIME          datetime not null comment '创建时间',
   VALID_TIME           datetime not null comment '有效时间',
   VALID_STATE          char(1) not null comment '0 未验证 1 已验证',
   ROW_VERSION          numeric(8,0) not null,
   primary key (ID)
);

alter table T_SYSTEM_VALID_INFO comment '验证信息表';

/*==============================================================*/
/* Table: T_SYSTEM_WHITE_LIST                                   */
/*==============================================================*/
create table T_SYSTEM_WHITE_LIST
(
   SYSTEM_TYPE          char(1) not null comment '产品类型由系统定义',
   ID_TYPE              varchar(10) not null comment 'openid: OPENID, custno  客户编号,其它表示证件类型',
   ID_NO                varchar(50) not null comment '白名单号码',
   FUNC_URL             varchar(255) not null comment '功能URL,代表一个白名单功能',
   FUNC_CATA            char(1) not null default '0' comment '功能分类 0 个人 1企业',
   STATUS               char(1) not null comment '白名单状态，0 关闭 1 激活',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (SYSTEM_TYPE, ID_TYPE, ID_NO, FUNC_URL)
);

alter table T_SYSTEM_WHITE_LIST comment '系统白名单表';

