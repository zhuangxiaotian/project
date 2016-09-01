/*==============================================================*/
/* Table: T_HIS_MESSAGE_PUSH_TASK                               */
/*==============================================================*/
create table T_HIS_MESSAGE_PUSH_TASK
(
   ID                   char(24) not null comment '主键ID',
   TITLE                varchar(50) comment '标题',
   CLIENT_APP           varchar(50) not null comment '客户端应用类型',
   START_DATE           date comment '开始日期',
   END_DATE             date comment '结束日期',
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
   CREATE_TIME          date not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          date not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           date comment '审核时间',
   primary key (ID)
);

alter table T_HIS_MESSAGE_PUSH_TASK comment '消息推送任务表LOG表';

/*==============================================================*/
/* Table: T_HIS_MESSAGE_PUSH_TASK_DETAIL                        */
/*==============================================================*/
create table T_HIS_MESSAGE_PUSH_TASK_DETAIL
(
   ID                   char(24) not null comment '主键ID',
   TASK_ID              char(24) not null comment '推送批次ID',
   PUSH_ID              varchar(50) comment '推送目标ID',
   APP_TYPE             char(1) comment '手机类型 1. 安卓 2. ios',
   READ_STATE           char(1) default '0' comment '阅读状态0：未读， 1:已读',
   SEND_STATE           char(1) comment '推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ',
   SEND_NUM             numeric(8,0) comment '已经推送次数',
   FIRST_SEND_TIME      date comment '失败推送时间',
   LAST_SEND_TIME       date comment '本次推送时间',
   FAILURE_REASON       varchar(50) comment '推送失败原因',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          date not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          date not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           date comment '审核时间',
   primary key (ID)
);

alter table T_HIS_MESSAGE_PUSH_TASK_DETAIL comment '消息推送任务内容表LOG表';

/*==============================================================*/
/* Table: T_MESSAGE_PUSH_TASK                                   */
/*==============================================================*/
create table T_MESSAGE_PUSH_TASK
(
   ID                   char(24) not null comment '主键ID',
   TITLE                varchar(50) comment '标题',
   CLIENT_APP           varchar(50) not null comment '客户端应用类型',
   START_DATE           date comment '开始日期',
   END_DATE             date comment '结束日期',
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
   CREATE_TIME          date not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          date not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   AUDIT_TIME           date comment '审核时间',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   primary key (ID)
);

alter table T_MESSAGE_PUSH_TASK comment '消息推送任务表';

/*==============================================================*/
/* Table: T_MESSAGE_PUSH_TASK_DETAIL                            */
/*==============================================================*/
create table T_MESSAGE_PUSH_TASK_DETAIL
(
   ID                   char(24) not null comment '主键ID',
   TASK_ID              char(24) not null comment '推送批次ID',
   PUSH_ID              varchar(100) comment '推送目标ID',
   APP_TYPE             char(1) comment '手机类型 1. 安卓 2. ios',
   READ_STATE           char(1) default '0' comment '阅读状态0：未读， 1:已读',
   SEND_STATE           char(1) comment '推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ',
   SEND_NUM             numeric(8,0) comment '已经推送次数',
   FIRST_SEND_TIME      date comment '失败推送时间',
   LAST_SEND_TIME       date comment '本次推送时间',
   FAILURE_REASON       varchar(50) comment '推送失败原因',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          date not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          date not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           date comment '审核时间',
   primary key (ID)
);

alter table T_MESSAGE_PUSH_TASK_DETAIL comment '消息推送任务内容表';


/*==============================================================*/
/* View: V_MESSAGE_PUSH_TASK                                    */
/*==============================================================*/
create or replace view V_MESSAGE_PUSH_TASK as
select
   T_MESSAGE_PUSH_TASK.ID,
   T_MESSAGE_PUSH_TASK.TITLE,
   T_MESSAGE_PUSH_TASK.CLIENT_APP,
   T_MESSAGE_PUSH_TASK.START_DATE,
   T_MESSAGE_PUSH_TASK.END_DATE,
   T_MESSAGE_PUSH_TASK.START_TIME,
   T_MESSAGE_PUSH_TASK.END_TIME,
   T_MESSAGE_PUSH_TASK.SEND_TYPE,
   T_MESSAGE_PUSH_TASK.RESEND_TYPE,
   T_MESSAGE_PUSH_TASK.RESEND_NUM,
   T_MESSAGE_PUSH_TASK.RESEND_INTERVALS,
   T_MESSAGE_PUSH_TASK.MESSAGE,
   T_MESSAGE_PUSH_TASK.MESSAGE_TYPE,
   T_MESSAGE_PUSH_TASK.CHANNEL_ID,
   T_MESSAGE_PUSH_TASK.DELETED,
   T_MESSAGE_PUSH_TASK.ROW_VERSION,
   T_MESSAGE_PUSH_TASK.CREATE_TIME,
   T_MESSAGE_PUSH_TASK.CREATE_ID,
   T_MESSAGE_PUSH_TASK.CREATE_NAME,
   T_MESSAGE_PUSH_TASK.MODIFY_TIME,
   T_MESSAGE_PUSH_TASK.MODIFY_ID,
   T_MESSAGE_PUSH_TASK.MODIFY_NAME,
   T_MESSAGE_PUSH_TASK.AUDIT_TIME,
   T_MESSAGE_PUSH_TASK.AUDIT_ID,
   T_MESSAGE_PUSH_TASK.AUDIT_NAME,
   T_MESSAGE_PUSH_TASK.AUDIT_STATE
from
   T_MESSAGE_PUSH_TASK
   
union all

select
   T_HIS_MESSAGE_PUSH_TASK.ID,
   T_HIS_MESSAGE_PUSH_TASK.TITLE,
   T_HIS_MESSAGE_PUSH_TASK.CLIENT_APP,
   T_HIS_MESSAGE_PUSH_TASK.START_DATE,
   T_HIS_MESSAGE_PUSH_TASK.END_DATE,
   T_HIS_MESSAGE_PUSH_TASK.START_TIME,
   T_HIS_MESSAGE_PUSH_TASK.END_TIME,
   T_HIS_MESSAGE_PUSH_TASK.SEND_TYPE,
   T_HIS_MESSAGE_PUSH_TASK.RESEND_TYPE,
   T_HIS_MESSAGE_PUSH_TASK.RESEND_NUM,
   T_HIS_MESSAGE_PUSH_TASK.RESEND_INTERVALS,
   T_HIS_MESSAGE_PUSH_TASK.MESSAGE,
   T_HIS_MESSAGE_PUSH_TASK.MESSAGE_TYPE,
   T_HIS_MESSAGE_PUSH_TASK.CHANNEL_ID,
   T_HIS_MESSAGE_PUSH_TASK.DELETED,
   T_HIS_MESSAGE_PUSH_TASK.ROW_VERSION,
   T_HIS_MESSAGE_PUSH_TASK.CREATE_TIME,
   T_HIS_MESSAGE_PUSH_TASK.CREATE_ID,
   T_HIS_MESSAGE_PUSH_TASK.CREATE_NAME,
   T_HIS_MESSAGE_PUSH_TASK.MODIFY_TIME,
   T_HIS_MESSAGE_PUSH_TASK.MODIFY_ID,
   T_HIS_MESSAGE_PUSH_TASK.MODIFY_NAME,
   T_HIS_MESSAGE_PUSH_TASK.AUDIT_TIME,
   T_HIS_MESSAGE_PUSH_TASK.AUDIT_ID,
   T_HIS_MESSAGE_PUSH_TASK.AUDIT_NAME,
   T_HIS_MESSAGE_PUSH_TASK.AUDIT_STATE
from
   T_HIS_MESSAGE_PUSH_TASK;

/*==============================================================*/
/* View: V_MESSAGE_PUSH_TASK_DETAIL                             */
/*==============================================================*/
create or replace view V_MESSAGE_PUSH_TASK_DETAIL as
select
   T_MESSAGE_PUSH_TASK_DETAIL.ID,
   T_MESSAGE_PUSH_TASK_DETAIL.TASK_ID,
   T_MESSAGE_PUSH_TASK_DETAIL.PUSH_ID,
   T_MESSAGE_PUSH_TASK_DETAIL.APP_TYPE,
   T_MESSAGE_PUSH_TASK_DETAIL.READ_STATE,
   T_MESSAGE_PUSH_TASK_DETAIL.SEND_STATE,
   T_MESSAGE_PUSH_TASK_DETAIL.SEND_NUM,
   T_MESSAGE_PUSH_TASK_DETAIL.FIRST_SEND_TIME,
   T_MESSAGE_PUSH_TASK_DETAIL.LAST_SEND_TIME,
   T_MESSAGE_PUSH_TASK_DETAIL.FAILURE_REASON,
   T_MESSAGE_PUSH_TASK_DETAIL.ROW_VERSION,
   T_MESSAGE_PUSH_TASK_DETAIL.CREATE_TIME,
   T_MESSAGE_PUSH_TASK_DETAIL.CREATE_ID,
   T_MESSAGE_PUSH_TASK_DETAIL.CREATE_NAME,
   T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_TIME,
   T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_ID,
   T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_NAME,
   T_MESSAGE_PUSH_TASK_DETAIL.DELETED,
   T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_STATE,
   T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_NAME,
   T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_ID,
   T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_TIME
from
   T_MESSAGE_PUSH_TASK_DETAIL
 union  all
select
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.TASK_ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.PUSH_ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.APP_TYPE,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.READ_STATE,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.SEND_STATE,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.SEND_NUM,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.FIRST_SEND_TIME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.LAST_SEND_TIME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.FAILURE_REASON,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.ROW_VERSION,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_TIME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_NAME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_TIME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_NAME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.DELETED,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_STATE,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_NAME,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_ID,
   T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_TIME
from
   T_HIS_MESSAGE_PUSH_TASK_DETAIL;

