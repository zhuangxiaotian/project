/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016-07-14 18:04:36                          */
/*==============================================================*/


drop   VIEW   if   exists   V_SYSTEM_MSG_PUSH_DETAIL;

drop   VIEW   if   exists   V_SYSTEM_MSG_PUSH_TASK;

drop table if exists T_SYSTEM_ADMIN;

drop table if exists T_SYSTEM_ADMIN_LOG;

drop table if exists T_SYSTEM_ADMIN_ROLES;

drop table if exists T_SYSTEM_BASE_INFO;

drop table if exists T_SYSTEM_CLIENT_ACTIVATION;

drop table if exists T_SYSTEM_CLIENT_TRACK;

drop table if exists T_SYSTEM_CLIENT_TRACK_DETAIL;

drop table if exists T_SYSTEM_CLIENT_VERSION;

drop table if exists T_SYSTEM_CONFIG;

drop table if exists T_SYSTEM_CRON_JOB;

drop table if exists T_SYSTEM_CRON_JOB_LOG;

drop table if exists T_SYSTEM_EXCEPTION_LOG;

drop table if exists T_SYSTEM_EXT_USER_RELATION;

drop table if exists T_SYSTEM_HIS_MSG_PUSH_DETAIL;

drop table if exists T_SYSTEM_HIS_MSG_PUSH_TASK;

drop table if exists T_SYSTEM_MSG_PUSH_DETAIL;

drop table if exists T_SYSTEM_MSG_PUSH_TASK;

drop table if exists T_SYSTEM_MSG_SEND;

drop table if exists T_SYSTEM_PARAM;

drop table if exists T_SYSTEM_PRIVILEGE;

drop table if exists T_SYSTEM_ROLES;

drop table if exists T_SYSTEM_VALID_INFO;

drop table if exists T_SYSTEM_VISIT_LOG;

drop table if exists T_SYSTEM_VISIT_MESSAGE;

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
   ADMIN_NAME           varchar(100) comment '操作员名称',
   OPERATE_TIME         datetime not null comment '操作时间',
   OPERATE_TYPE         varchar(100) not null comment '操作类别',
   OPERATE_CONTENT      varchar(2000) not null comment '操作内容',
   UPDATE_COUNT         numeric(8,0) not null default 0 comment '更新记录数量',
   ROW_VERSION          numeric(8,0) not null comment '版本号(DML操作时用)',
   primary key (ADMIN_LOG_ID)
);

alter table T_SYSTEM_ADMIN_LOG comment '系统管理员日志';

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
/* Table: T_SYSTEM_CLIENT_ACTIVATION                            */
/*==============================================================*/
create table T_SYSTEM_CLIENT_ACTIVATION
(
   ID                   char(24) not null comment 'PK',
   CHANNEL              varchar(50) not null comment '激活渠道',
   CLIENT_TYPE          varchar(50) not null comment '客户端类型',
   CLIENT_VERSION       varchar(50) not null comment '客户端版本',
   DEVICE_ID            varchar(100) not null comment '设备标识',
   PUSH_ID              varchar(100) comment '用于推送的标识',
   ACTIVATION_TIME      datetime not null comment '激活时间',
   CLIENT_MODEL         varchar(200) comment '设备型号',
   CLIENT_OS            varchar(200) comment '客户端操作系统',
   CLIENT_OS_VERSION    varchar(200) comment '客户端操作系统版本',
   CLIENT_NETWORK_TYPE  varchar(200) comment '客户端网络类型',
   CLIENT_NETWORK_EXTRA_INFO varchar(200) comment '客户端网络扩展信息',
   CLIENT_SCREEN_WIDTH  varchar(200) comment '客户端屏幕宽度',
   CLIENT_SCREEN_HEIGHT varchar(200) comment '客户端屏幕高度',
   CLIENT_SCREEN_DENSITY varchar(200) comment '客户端屏幕密度',
   STATE                char(1) not null comment '0 无效 1有效，表示最后激活的相同设备',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_SYSTEM_CLIENT_ACTIVATION comment '客户端激活表';

/*==============================================================*/
/* Table: T_SYSTEM_CLIENT_TRACK                                 */
/*==============================================================*/
create table T_SYSTEM_CLIENT_TRACK
(
   ID                   char(24) not null comment 'PK',
   CLIENT_VERSION       varchar(50) not null comment '客户端版本',
   CLIENT_TYPE          varchar(50) not null comment '客户端类型',
   DEVICE_ID            varchar(50) not null comment '设备标识',
   TRACK_API            varchar(50) not null comment 'TRACK_API_VERSION',
   TRACK_TYPE           varchar(200) not null comment '跟踪类型',
   TRACK_ID             varchar(200) not null comment '跟踪关键字',
   CLIENT_NETWORK_EXTRA_INFO varchar(200) comment '客户端网络扩展信息',
   CLIENT_NETWORK_TYPE  varchar(200) comment '客户端网络类型',
   TIMESTAMP            bigint not null comment 'JAVATIMESTAMP',
   USE_TIME             numeric(8,0) not null comment '跟踪用的时间',
   PUB1                 varchar(200) comment '备用信息',
   PUB2                 varchar(200) comment '备用信息',
   PUB3                 varchar(200) comment '备用信息',
   PUB4                 varchar(200) comment '备用信息',
   PUB5                 varchar(200) comment '备用信息',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_SYSTEM_CLIENT_TRACK comment '客户端行为追踪表';

/*==============================================================*/
/* Table: T_SYSTEM_CLIENT_TRACK_DETAIL                          */
/*==============================================================*/
create table T_SYSTEM_CLIENT_TRACK_DETAIL
(
   ID                   char(24) not null comment 'PK',
   TRACK_ID             char(24) not null comment 'FK',
   DETAIL_KEY           varchar(200) not null comment '明细Key',
   DETAIL_VALUE         varchar(2000) comment '明细Value',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_SYSTEM_CLIENT_TRACK_DETAIL comment '客户端追踪明细';

/*==============================================================*/
/* Table: T_SYSTEM_CLIENT_VERSION                               */
/*==============================================================*/
create table T_SYSTEM_CLIENT_VERSION
(
   CLIENT_TYPE          varchar(50) not null comment '客户端类型',
   CLIENT_VERSION       varchar(50) not null comment '客户端版本',
   CLIENT_STATE         char(1) not null comment '客户端状态,0 版本最新，允许运行 1 版本已旧，但允许继续运行 2 版本过旧，不允许运行，必须升级',
   RELEASE_TIME         datetime not null comment '客户端发布时间',
   CLIENT_SIGNATURE     varchar(200) comment '客户端签名',
   CURRENT_INSTALL_URL  varchar(500) comment '当前版本的下载地址',
   NEXT_UPDATE_URL      varchar(500) comment '升级版本的下载地址',
   CLIENT_ENCRYPT_KEY   varchar(100) not null comment '客户端加密Key',
   CLIENT_SIGN_KEY      varchar(100) not null comment '客户端签名Key',
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
   primary key (CLIENT_TYPE, CLIENT_VERSION)
);

alter table T_SYSTEM_CLIENT_VERSION comment '客户端版本控制';

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
/* Table: T_SYSTEM_EXCEPTION_LOG                                */
/*==============================================================*/
create table T_SYSTEM_EXCEPTION_LOG
(
   ID                   char(24) not null,
   ID_TYPE              varchar(10) comment '证件类型',
   ID_NO                varchar(100) comment '证件号码',
   EXCEPTION_FUNC_CODE  varchar(10) comment '异常的功能号',
   EXCEPTION_RESULT_CODE varchar(10) comment '异常返回码',
   EXCEPTION_RESULT_MSG varchar(2000) comment '异常消息',
   FROM_SRC             varchar(50) comment '交易来源',
   EXCEPTION_MEMO       varchar(200) comment '异常备注',
   CREATE_TIME          datetime not null comment '创建时间',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_SYSTEM_EXCEPTION_LOG comment '系统异常记录表';

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
/* Table: T_SYSTEM_HIS_MSG_PUSH_DETAIL                          */
/*==============================================================*/
create table T_SYSTEM_HIS_MSG_PUSH_DETAIL
(
   ID                   char(24) not null comment '主键ID',
   TASK_ID              char(24) not null comment '推送批次ID',
   PUSH_ID              varchar(50) comment '推送目标ID',
   APP_TYPE             char(1) comment '手机类型 1. 安卓 2. ios',
   READ_STATE           char(1) default '0' comment '阅读状态0：未读， 1:已读',
   SEND_STATE           char(1) comment '推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ',
   SEND_NUM             numeric(8,0) comment '已经推送次数',
   FIRST_SEND_TIME      datetime comment '失败推送时间',
   LAST_SEND_TIME       datetime comment '本次推送时间',
   FAILURE_REASON       varchar(50) comment '推送失败原因',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   primary key (ID)
);

alter table T_SYSTEM_HIS_MSG_PUSH_DETAIL comment '消息推送任务内容表LOG表';

/*==============================================================*/
/* Table: T_SYSTEM_HIS_MSG_PUSH_TASK                            */
/*==============================================================*/
create table T_SYSTEM_HIS_MSG_PUSH_TASK
(
   ID                   char(24) not null comment '主键ID',
   TITLE                varchar(50) comment '标题',
   CLIENT_APP           varchar(50) not null comment '客户端应用类型',
   START_DATE           datetime comment '开始日期',
   END_DATE             datetime comment '结束日期',
   START_TIME           varchar(50) comment '开始时间',
   END_TIME             varchar(50) comment '结束时间',
   SEND_TYPE            char(1) comment '发送状态0：未发送，1：发送队列中 2：等待下次发送 3：发送成功',
   RESEND_TYPE          char(1) comment '是否失败重复发送 0 ：否   ， 1：是',
   RESEND_NUM           numeric(8,0) comment '重复执行次数',
   RESEND_INTERVALS     numeric(8,0) comment '重复执行间隔 单位分钟',
   MESSAGE              varchar(500) comment '推送内容',
   MESSAGE_TYPE         char(1) comment '推送内容类型1. 新闻 2 . 生日祝福',
   CHANNEL_ID           char(1) comment '推送渠道 1: 手机APP  2 : 微信',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   primary key (ID)
);

alter table T_SYSTEM_HIS_MSG_PUSH_TASK comment '消息推送任务表LOG表';

/*==============================================================*/
/* Table: T_SYSTEM_MSG_PUSH_DETAIL                              */
/*==============================================================*/
create table T_SYSTEM_MSG_PUSH_DETAIL
(
   ID                   char(24) not null comment '主键ID',
   TASK_ID              char(24) not null comment '推送批次ID',
   PUSH_ID              varchar(100) comment '推送目标ID',
   APP_TYPE             char(1) comment '手机类型 1. 安卓 2. ios',
   READ_STATE           char(1) default '0' comment '阅读状态0：未读， 1:已读',
   SEND_STATE           char(1) comment '推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ',
   SEND_NUM             numeric(8,0) comment '已经推送次数',
   FIRST_SEND_TIME      datetime comment '失败推送时间',
   LAST_SEND_TIME       datetime comment '本次推送时间',
   FAILURE_REASON       varchar(50) comment '推送失败原因',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   primary key (ID)
);

alter table T_SYSTEM_MSG_PUSH_DETAIL comment '消息推送任务内容表';

/*==============================================================*/
/* Table: T_SYSTEM_MSG_PUSH_TASK                                */
/*==============================================================*/
create table T_SYSTEM_MSG_PUSH_TASK
(
   ID                   char(24) not null comment '主键ID',
   TITLE                varchar(50) comment '标题',
   CLIENT_APP           varchar(50) not null comment '客户端应用类型',
   START_DATE           datetime comment '开始日期',
   END_DATE             datetime comment '结束日期',
   START_TIME           varchar(50) comment '开始时间',
   END_TIME             varchar(50) comment '结束时间',
   SEND_TARGET_TYPE     char(1) not null comment '0 all 1指定用户 2 android 3iphone',
   SEND_TYPE            char(1) comment '发送状态0：未发送，1,：发送中 2：等待下次发送 3：发送成功',
   RESEND_TYPE          char(1) comment '是否失败重复发送 0 ：否   ， 1：是',
   RESEND_NUM           numeric(8,0) comment '重复执行次数',
   RESEND_INTERVALS     numeric(8,0) comment '重复执行间隔 单位分钟',
   MESSAGE              varchar(500) comment '推送内容',
   MESSAGE_TYPE         char(1) not null comment '0 普通消息提示1内链2外链',
   MESSAGE_PARAM        varchar(255) comment '0无，1、2链接地址',
   CHANNEL_ID           char(1) comment '推送渠道 1: 手机APP  2 : 微信',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
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

alter table T_SYSTEM_MSG_PUSH_TASK comment '消息推送任务表';

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
   VALID_USER_ID_TYPE   varchar(100) not null comment '验证的用户标识类型',
   VALID_USER_ID_NO     varchar(100) not null comment '验证的用户标识',
   VALID_TYPE           char(1) not null comment '验证类型 0 用户邮箱验证 1 忘记密码验证',
   RANDOM_VALUE         varchar(50) not null comment '随机字符串',
   CREATE_TIME          datetime not null comment '创建时间',
   VALID_TIME           datetime not null comment '有效时间',
   VALID_STATE          char(1) not null comment '0 未验证 1 已验证',
   ROW_VERSION          numeric(8,0) not null,
   primary key (ID)
);

alter table T_SYSTEM_VALID_INFO comment '验证信息表';

/*==============================================================*/
/* Table: T_SYSTEM_VISIT_LOG                                    */
/*==============================================================*/
create table T_SYSTEM_VISIT_LOG
(
   ID                   char(24) not null comment '标识',
   VISIT_SRC            varchar(50) not null comment '访问来源',
   OPENID               varchar(100) comment '客户端标识,如果是纯网页用户，则用服务器生成的currency_visiter_id代替',
   CHANNEL              varchar(50) comment '渠道',
   SRC_VERSION          varchar(50) comment '版本',
   CLIENT_TYPE          varchar(50) comment '手机类型',
   OS                   varchar(50) comment 'iphone,android',
   OS_VERSION           varchar(50) comment '操作系统版本',
   NETWORK              varchar(50) comment 'wifi|2g|3g|4g',
   SERVICE              varchar(50) comment '0中国移动1中国联通2中国电信',
   MOBILE_PHONE         varchar(50) comment '手机号码',
   SCREEN               varchar(50) comment '屏幕大小',
   OTHER                varchar(500) comment '其它参数',
   LOG_SESSION_ID       varchar(100) comment '访问SessionID',
   LOG_IP               varchar(50) comment '访问IP',
   LOG_UA               varchar(500) comment '访问UA',
   LOG_REFER_URL        varchar(500) comment '引用URL',
   LOG_URL              varchar(500) comment '访问URL',
   LOG_PARAM            varchar(1000) comment '访问全部参数',
   LOG_TIME             datetime not null comment '访问时间',
   VISIT_RESULT         char(1) not null comment '访问是否成功 0 成功 1 失败',
   VISIT_FAIL_REASON    varchar(500) comment '访问失败原因',
   VISIT_RESULT_VIEW    varchar(100) comment '访问结果模板',
   PROCESS_TIME         numeric(8,0) not null comment '处理时间',
   primary key (ID)
);

alter table T_SYSTEM_VISIT_LOG comment '客户端访问用户日志';

/*==============================================================*/
/* Table: T_SYSTEM_VISIT_MESSAGE                                */
/*==============================================================*/
create table T_SYSTEM_VISIT_MESSAGE
(
   ID                   char(24) not null comment '消息ID',
   TITLE                varchar(100) comment '标题',
   PARENT_ID            char(24) not null comment '消息父类ID  默认24颗*',
   CUSTOMER_NO          varchar(100) comment '客户号',
   NICKNAME             varchar(50) comment '客户姓名',
   MESSAGE_MEMO         varchar(2000) comment '消息备注',
   READ_COUNT           numeric(8,0) comment '浏览次数',
   MESSAGE              varchar(2000) comment '留言内容',
   REPLY_CONTENT        varchar(2000) comment '回复内容',
   REPLYER              varchar(200) comment '回复人',
   EMAIL                varchar(100) comment '邮箱',
   TELEPHONE            varchar(100) comment '联系电话',
   ADDRESS              varchar(200) comment '联系地址',
   VISIT_TIME           datetime comment '访问留言时间',
   REPLY_TIME           datetime comment '回复时间',
   MESSAGE_TYPE         char(1) not null comment '消息类型, 0 默认提问',
   REPLY_STATUS         char(1) not null comment '回复状态,0 未读 1 已读未回复  2  回复',
   REALTION_FUND_MANAGER varchar(100) comment '相关基金经理',
   RELATION_FUND        varchar(100) comment '相关基金代码',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建ID',
   CREATE_NAME          varchar(100) comment '创建人姓名',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(200) comment '修改人姓名',
   AUDIT_ID             char(24) comment '审核ID',
   AUDIT_TIME           datetime comment '审核时间',
   AUDIT_NAME           varchar(100) comment '审核人姓名',
   AUDIT_STATE          char(1) not null comment '审核状态,0 未审核  1审核通过',
   DELETED              char(1) comment '是否删除',
   primary key (ID)
);

alter table T_SYSTEM_VISIT_MESSAGE comment '访问留言表';

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
   ID                   char(24) not null comment '主键',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (ID)
);

alter table T_SYSTEM_WHITE_LIST comment '系统白名单表';

/*==============================================================*/
/* View: V_SYSTEM_MSG_PUSH_DETAIL                               */
/*==============================================================*/
create or replace VIEW      V_SYSTEM_MSG_PUSH_DETAIL 
   as 
   select
      T_SYSTEM_MSG_PUSH_DETAIL.ID,
      T_SYSTEM_MSG_PUSH_DETAIL.TASK_ID,
      T_SYSTEM_MSG_PUSH_DETAIL.PUSH_ID,
      T_SYSTEM_MSG_PUSH_DETAIL.APP_TYPE,
      T_SYSTEM_MSG_PUSH_DETAIL.READ_STATE,
      T_SYSTEM_MSG_PUSH_DETAIL.SEND_STATE,
      T_SYSTEM_MSG_PUSH_DETAIL.SEND_NUM,
      T_SYSTEM_MSG_PUSH_DETAIL.FIRST_SEND_TIME,
      T_SYSTEM_MSG_PUSH_DETAIL.LAST_SEND_TIME,
      T_SYSTEM_MSG_PUSH_DETAIL.FAILURE_REASON,
      T_SYSTEM_MSG_PUSH_DETAIL.ROW_VERSION,
      T_SYSTEM_MSG_PUSH_DETAIL.CREATE_TIME,
      T_SYSTEM_MSG_PUSH_DETAIL.CREATE_ID,
      T_SYSTEM_MSG_PUSH_DETAIL.CREATE_NAME,
      T_SYSTEM_MSG_PUSH_DETAIL.MODIFY_TIME,
      T_SYSTEM_MSG_PUSH_DETAIL.MODIFY_ID,
      T_SYSTEM_MSG_PUSH_DETAIL.MODIFY_NAME,
      T_SYSTEM_MSG_PUSH_DETAIL.DELETED,
      T_SYSTEM_MSG_PUSH_DETAIL.AUDIT_STATE,
      T_SYSTEM_MSG_PUSH_DETAIL.AUDIT_NAME,
      T_SYSTEM_MSG_PUSH_DETAIL.AUDIT_ID,
      T_SYSTEM_MSG_PUSH_DETAIL.AUDIT_TIME
   from
      T_SYSTEM_MSG_PUSH_DETAIL
    union  all
   select
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.TASK_ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.PUSH_ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.APP_TYPE,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.READ_STATE,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.SEND_STATE,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.SEND_NUM,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.FIRST_SEND_TIME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.LAST_SEND_TIME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.FAILURE_REASON,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.ROW_VERSION,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.CREATE_TIME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.CREATE_ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.CREATE_NAME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.MODIFY_TIME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.MODIFY_ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.MODIFY_NAME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.DELETED,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.AUDIT_STATE,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.AUDIT_NAME,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.AUDIT_ID,
      T_SYSTEM_HIS_MSG_PUSH_DETAIL.AUDIT_TIME
   from
      T_SYSTEM_HIS_MSG_PUSH_DETAIL;

/*==============================================================*/
/* View: V_SYSTEM_MSG_PUSH_TASK                                 */
/*==============================================================*/
create or replace VIEW      V_SYSTEM_MSG_PUSH_TASK 
   as 
   select
      T_SYSTEM_MSG_PUSH_TASK.ID,
      T_SYSTEM_MSG_PUSH_TASK.TITLE,
      T_SYSTEM_MSG_PUSH_TASK.CLIENT_APP,
      T_SYSTEM_MSG_PUSH_TASK.START_DATE,
      T_SYSTEM_MSG_PUSH_TASK.END_DATE,
      T_SYSTEM_MSG_PUSH_TASK.START_TIME,
      T_SYSTEM_MSG_PUSH_TASK.END_TIME,
      T_SYSTEM_MSG_PUSH_TASK.SEND_TYPE,
      T_SYSTEM_MSG_PUSH_TASK.RESEND_TYPE,
      T_SYSTEM_MSG_PUSH_TASK.RESEND_NUM,
      T_SYSTEM_MSG_PUSH_TASK.RESEND_INTERVALS,
      T_SYSTEM_MSG_PUSH_TASK.MESSAGE,
      T_SYSTEM_MSG_PUSH_TASK.MESSAGE_TYPE,
      T_SYSTEM_MSG_PUSH_TASK.CHANNEL_ID,
      T_SYSTEM_MSG_PUSH_TASK.DELETED,
      T_SYSTEM_MSG_PUSH_TASK.ROW_VERSION,
      T_SYSTEM_MSG_PUSH_TASK.CREATE_TIME,
      T_SYSTEM_MSG_PUSH_TASK.CREATE_ID,
      T_SYSTEM_MSG_PUSH_TASK.CREATE_NAME,
      T_SYSTEM_MSG_PUSH_TASK.MODIFY_TIME,
      T_SYSTEM_MSG_PUSH_TASK.MODIFY_ID,
      T_SYSTEM_MSG_PUSH_TASK.MODIFY_NAME,
      T_SYSTEM_MSG_PUSH_TASK.AUDIT_TIME,
      T_SYSTEM_MSG_PUSH_TASK.AUDIT_ID,
      T_SYSTEM_MSG_PUSH_TASK.AUDIT_NAME,
      T_SYSTEM_MSG_PUSH_TASK.AUDIT_STATE
   from
      T_SYSTEM_MSG_PUSH_TASK
      
   union all
   
   select
      T_SYSTEM_HIS_MSG_PUSH_TASK.ID,
      T_SYSTEM_HIS_MSG_PUSH_TASK.TITLE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.CLIENT_APP,
      T_SYSTEM_HIS_MSG_PUSH_TASK.START_DATE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.END_DATE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.START_TIME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.END_TIME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.SEND_TYPE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.RESEND_TYPE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.RESEND_NUM,
      T_SYSTEM_HIS_MSG_PUSH_TASK.RESEND_INTERVALS,
      T_SYSTEM_HIS_MSG_PUSH_TASK.MESSAGE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.MESSAGE_TYPE,
      T_SYSTEM_HIS_MSG_PUSH_TASK.CHANNEL_ID,
      T_SYSTEM_HIS_MSG_PUSH_TASK.DELETED,
      T_SYSTEM_HIS_MSG_PUSH_TASK.ROW_VERSION,
      T_SYSTEM_HIS_MSG_PUSH_TASK.CREATE_TIME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.CREATE_ID,
      T_SYSTEM_HIS_MSG_PUSH_TASK.CREATE_NAME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.MODIFY_TIME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.MODIFY_ID,
      T_SYSTEM_HIS_MSG_PUSH_TASK.MODIFY_NAME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.AUDIT_TIME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.AUDIT_ID,
      T_SYSTEM_HIS_MSG_PUSH_TASK.AUDIT_NAME,
      T_SYSTEM_HIS_MSG_PUSH_TASK.AUDIT_STATE
   from
      T_SYSTEM_HIS_MSG_PUSH_TASK;

