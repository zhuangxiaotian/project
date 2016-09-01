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

drop table T_HIS_MESSAGE_PUSH_TASK;
drop table T_HIS_MESSAGE_PUSH_TASK_DETAIL;
drop table T_MESSAGE_PUSH_TASK;
drop table T_MESSAGE_PUSH_TASK_DETAIL;

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


update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.4', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';