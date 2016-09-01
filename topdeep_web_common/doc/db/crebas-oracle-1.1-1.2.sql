drop view V_MESSAGE_PUSH_TASK;

drop view V_MESSAGE_PUSH_TASK_DETAIL;

drop table T_HIS_MESSAGE_PUSH_TASK cascade constraints;

drop table T_HIS_MESSAGE_PUSH_TASK_DETAIL cascade constraints;

drop table T_MESSAGE_PUSH_TASK cascade constraints;

drop table T_MESSAGE_PUSH_TASK_DETAIL cascade constraints;

/*==============================================================*/
/* Table: T_HIS_MESSAGE_PUSH_TASK                               */
/*==============================================================*/
create table T_HIS_MESSAGE_PUSH_TASK  (
   ID                   CHAR(24)                        not null,
   TITLE                VARCHAR2(50),
   CLIENT_APP           VARCHAR2(50)                    not null,
   START_DATE           DATE,
   END_DATE             DATE,
   START_TIME           VARCHAR2(50),
   END_TIME             VARCHAR2(50),
   SEND_TYPE            CHAR(1),
   RESEND_TYPE          CHAR(1),
   RESEND_NUM           NUMBER(8,0),
   RESEND_INTERVALS     NUMBER(8,0),
   MESSAGE              VARCHAR2(500),
   MESSAGE_TYPE         CHAR(1),
   CHANNEL_ID           CHAR(1),
   DELETED              CHAR(1)                        default '0' not null,
   ROW_VERSION          NUMBER(8,0)                     not null,
   CREATE_TIME          DATE                            not null,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            not null,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_ID             CHAR(24),
   AUDIT_TIME           DATE,
   constraint PK_T_HIS_MESSAGE_PUSH_TASK primary key (ID)
);

comment on table T_HIS_MESSAGE_PUSH_TASK is
'消息推送任务表LOG表';

comment on column T_HIS_MESSAGE_PUSH_TASK.ID is
'主键ID';

comment on column T_HIS_MESSAGE_PUSH_TASK.TITLE is
'标题';

comment on column T_HIS_MESSAGE_PUSH_TASK.CLIENT_APP is
'客户端应用类型';

comment on column T_HIS_MESSAGE_PUSH_TASK.START_DATE is
'开始日期';

comment on column T_HIS_MESSAGE_PUSH_TASK.END_DATE is
'结束日期';

comment on column T_HIS_MESSAGE_PUSH_TASK.START_TIME is
'开始时间';

comment on column T_HIS_MESSAGE_PUSH_TASK.END_TIME is
'结束时间';

comment on column T_HIS_MESSAGE_PUSH_TASK.SEND_TYPE is
'发送状态0：未发送，1：发送队列中 2：等待下次发送 3：发送成功';

comment on column T_HIS_MESSAGE_PUSH_TASK.RESEND_TYPE is
'是否失败重复发送 0 ：否   ， 1：是';

comment on column T_HIS_MESSAGE_PUSH_TASK.RESEND_NUM is
'重复执行次数';

comment on column T_HIS_MESSAGE_PUSH_TASK.RESEND_INTERVALS is
'重复执行间隔 单位分钟';

comment on column T_HIS_MESSAGE_PUSH_TASK.MESSAGE is
'推送内容';

comment on column T_HIS_MESSAGE_PUSH_TASK.MESSAGE_TYPE is
'推送内容类型1. 新闻 2 . 生日祝福';

comment on column T_HIS_MESSAGE_PUSH_TASK.CHANNEL_ID is
'推送渠道 1: 手机APP  2 : 微信';

comment on column T_HIS_MESSAGE_PUSH_TASK.DELETED is
'0未删除1删除';

comment on column T_HIS_MESSAGE_PUSH_TASK.ROW_VERSION is
'版本';

comment on column T_HIS_MESSAGE_PUSH_TASK.CREATE_TIME is
'创建时间';

comment on column T_HIS_MESSAGE_PUSH_TASK.CREATE_ID is
'创建人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK.CREATE_NAME is
'创建人登录名称';

comment on column T_HIS_MESSAGE_PUSH_TASK.MODIFY_TIME is
'修改时间';

comment on column T_HIS_MESSAGE_PUSH_TASK.MODIFY_ID is
'修改人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK.MODIFY_NAME is
'修改人登录名称';

comment on column T_HIS_MESSAGE_PUSH_TASK.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

comment on column T_HIS_MESSAGE_PUSH_TASK.AUDIT_NAME is
'审核人名称';

comment on column T_HIS_MESSAGE_PUSH_TASK.AUDIT_ID is
'审核人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK.AUDIT_TIME is
'审核时间';

/*==============================================================*/
/* Table: T_HIS_MESSAGE_PUSH_TASK_DETAIL                        */
/*==============================================================*/
create table T_HIS_MESSAGE_PUSH_TASK_DETAIL  (
   ID                   CHAR(24)                        not null,
   TASK_ID              CHAR(24)                        not null,
   PUSH_ID              VARCHAR2(50),
   APP_TYPE             CHAR(1),
   READ_STATE           CHAR(1)                        default '0',
   SEND_STATE           CHAR(1),
   SEND_NUM             NUMBER(8,0),
   FIRST_SEND_TIME      DATE,
   LAST_SEND_TIME       DATE,
   FAILURE_REASON       VARCHAR2(50),
   ROW_VERSION          NUMBER(8,0)                     not null,
   CREATE_TIME          DATE                            not null,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            not null,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   DELETED              CHAR(1)                        default '0' not null,
   AUDIT_STATE          CHAR(1),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_ID             CHAR(24),
   AUDIT_TIME           DATE,
   constraint PK_T_HIS_MESSAGE_PUSH_TASK_DET primary key (ID)
);

comment on table T_HIS_MESSAGE_PUSH_TASK_DETAIL is
'消息推送任务内容表LOG表';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.ID is
'主键ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.TASK_ID is
'推送批次ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.PUSH_ID is
'推送目标ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.APP_TYPE is
'手机类型 1. 安卓 2. ios';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.READ_STATE is
'阅读状态0：未读， 1:已读';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.SEND_STATE is
'推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.SEND_NUM is
'已经推送次数';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.FIRST_SEND_TIME is
'失败推送时间';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.LAST_SEND_TIME is
'本次推送时间';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.FAILURE_REASON is
'推送失败原因';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.ROW_VERSION is
'版本';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_TIME is
'创建时间';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_ID is
'创建人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.CREATE_NAME is
'创建人登录名称';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_TIME is
'修改时间';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_ID is
'修改人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.MODIFY_NAME is
'修改人登录名称';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.DELETED is
'0未删除1删除';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_NAME is
'审核人名称';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_ID is
'审核人ID';

comment on column T_HIS_MESSAGE_PUSH_TASK_DETAIL.AUDIT_TIME is
'审核时间';

/*==============================================================*/
/* Table: T_MESSAGE_PUSH_TASK                                   */
/*==============================================================*/
create table T_MESSAGE_PUSH_TASK  (
   ID                   CHAR(24)                        not null,
   TITLE                VARCHAR2(50),
   CLIENT_APP           VARCHAR2(50)                    not null,
   START_DATE           DATE,
   END_DATE             DATE,
   START_TIME           VARCHAR2(50),
   END_TIME             VARCHAR2(50),
   SEND_TARGET_TYPE     CHAR(1)                         not null,
   SEND_TYPE            CHAR(1),
   RESEND_TYPE          CHAR(1),
   RESEND_NUM           NUMBER(8,0),
   RESEND_INTERVALS     NUMBER(8,0),
   MESSAGE              VARCHAR2(500),
   MESSAGE_TYPE         CHAR(1)                         not null,
   MESSAGE_PARAM        VARCHAR2(255),
   CHANNEL_ID           CHAR(1),
   DELETED              CHAR(1)                        default '0' not null,
   ROW_VERSION          NUMBER(8,0)                     not null,
   CREATE_TIME          DATE                            not null,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            not null,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   constraint PK_T_MESSAGE_PUSH_TASK primary key (ID)
);

comment on table T_MESSAGE_PUSH_TASK is
'消息推送任务表';

comment on column T_MESSAGE_PUSH_TASK.ID is
'主键ID';

comment on column T_MESSAGE_PUSH_TASK.TITLE is
'标题';

comment on column T_MESSAGE_PUSH_TASK.CLIENT_APP is
'客户端应用类型';

comment on column T_MESSAGE_PUSH_TASK.START_DATE is
'开始日期';

comment on column T_MESSAGE_PUSH_TASK.END_DATE is
'结束日期';

comment on column T_MESSAGE_PUSH_TASK.START_TIME is
'开始时间';

comment on column T_MESSAGE_PUSH_TASK.END_TIME is
'结束时间';

comment on column T_MESSAGE_PUSH_TASK.SEND_TARGET_TYPE is
'0 all 1指定用户 2 android 3iphone';

comment on column T_MESSAGE_PUSH_TASK.SEND_TYPE is
'发送状态0：未发送，1,：发送中 2：等待下次发送 3：发送成功';

comment on column T_MESSAGE_PUSH_TASK.RESEND_TYPE is
'是否失败重复发送 0 ：否   ， 1：是';

comment on column T_MESSAGE_PUSH_TASK.RESEND_NUM is
'重复执行次数';

comment on column T_MESSAGE_PUSH_TASK.RESEND_INTERVALS is
'重复执行间隔 单位分钟';

comment on column T_MESSAGE_PUSH_TASK.MESSAGE is
'推送内容';

comment on column T_MESSAGE_PUSH_TASK.MESSAGE_TYPE is
'0 普通消息提示1内链2外链';

comment on column T_MESSAGE_PUSH_TASK.MESSAGE_PARAM is
'0无，1、2链接地址';

comment on column T_MESSAGE_PUSH_TASK.CHANNEL_ID is
'推送渠道 1: 手机APP  2 : 微信';

comment on column T_MESSAGE_PUSH_TASK.DELETED is
'0未删除1删除';

comment on column T_MESSAGE_PUSH_TASK.ROW_VERSION is
'版本';

comment on column T_MESSAGE_PUSH_TASK.CREATE_TIME is
'创建时间';

comment on column T_MESSAGE_PUSH_TASK.CREATE_ID is
'创建人ID';

comment on column T_MESSAGE_PUSH_TASK.CREATE_NAME is
'创建人登录名称';

comment on column T_MESSAGE_PUSH_TASK.MODIFY_TIME is
'修改时间';

comment on column T_MESSAGE_PUSH_TASK.MODIFY_ID is
'修改人ID';

comment on column T_MESSAGE_PUSH_TASK.MODIFY_NAME is
'修改人登录名称';

comment on column T_MESSAGE_PUSH_TASK.AUDIT_TIME is
'审核时间';

comment on column T_MESSAGE_PUSH_TASK.AUDIT_ID is
'审核人ID';

comment on column T_MESSAGE_PUSH_TASK.AUDIT_NAME is
'审核人名称';

comment on column T_MESSAGE_PUSH_TASK.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

/*==============================================================*/
/* Table: T_MESSAGE_PUSH_TASK_DETAIL                            */
/*==============================================================*/
create table T_MESSAGE_PUSH_TASK_DETAIL  (
   ID                   CHAR(24)                        not null,
   TASK_ID              CHAR(24)                        not null,
   PUSH_ID              VARCHAR2(100),
   APP_TYPE             CHAR(1),
   READ_STATE           CHAR(1)                        default '0',
   SEND_STATE           CHAR(1),
   SEND_NUM             NUMBER(8,0),
   FIRST_SEND_TIME      DATE,
   LAST_SEND_TIME       DATE,
   FAILURE_REASON       VARCHAR2(50),
   ROW_VERSION          NUMBER(8,0)                     not null,
   CREATE_TIME          DATE                            not null,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            not null,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   DELETED              CHAR(1)                        default '0' not null,
   AUDIT_STATE          CHAR(1),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_ID             CHAR(24),
   AUDIT_TIME           DATE,
   constraint PK_T_MESSAGE_PUSH_TASK_DETAIL primary key (ID)
);

comment on table T_MESSAGE_PUSH_TASK_DETAIL is
'消息推送任务内容表';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.ID is
'主键ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.TASK_ID is
'推送批次ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.PUSH_ID is
'推送目标ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.APP_TYPE is
'手机类型 1. 安卓 2. ios';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.READ_STATE is
'阅读状态0：未读， 1:已读';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.SEND_STATE is
'推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.SEND_NUM is
'已经推送次数';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.FIRST_SEND_TIME is
'失败推送时间';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.LAST_SEND_TIME is
'本次推送时间';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.FAILURE_REASON is
'推送失败原因';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.ROW_VERSION is
'版本';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.CREATE_TIME is
'创建时间';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.CREATE_ID is
'创建人ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.CREATE_NAME is
'创建人登录名称';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_TIME is
'修改时间';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_ID is
'修改人ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.MODIFY_NAME is
'修改人登录名称';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.DELETED is
'0未删除1删除';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_NAME is
'审核人名称';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_ID is
'审核人ID';

comment on column T_MESSAGE_PUSH_TASK_DETAIL.AUDIT_TIME is
'审核时间';

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
   T_HIS_MESSAGE_PUSH_TASK

with read only;

comment on table V_MESSAGE_PUSH_TASK is
'推送任务表与历史表合并显示';

comment on column V_MESSAGE_PUSH_TASK.ID is
'主键ID';

comment on column V_MESSAGE_PUSH_TASK.TITLE is
'标题';

comment on column V_MESSAGE_PUSH_TASK.CLIENT_APP is
'客户端应用类型';

comment on column V_MESSAGE_PUSH_TASK.START_DATE is
'开始日期';

comment on column V_MESSAGE_PUSH_TASK.END_DATE is
'结束日期';

comment on column V_MESSAGE_PUSH_TASK.START_TIME is
'开始时间';

comment on column V_MESSAGE_PUSH_TASK.END_TIME is
'结束时间';

comment on column V_MESSAGE_PUSH_TASK.SEND_TYPE is
'发送状态0：未发送，1,：发送中 2：等待下次发送 3：发送成功';

comment on column V_MESSAGE_PUSH_TASK.RESEND_TYPE is
'是否失败重复发送 0 ：否   ， 1：是';

comment on column V_MESSAGE_PUSH_TASK.RESEND_NUM is
'重复执行次数';

comment on column V_MESSAGE_PUSH_TASK.RESEND_INTERVALS is
'重复执行间隔 单位分钟';

comment on column V_MESSAGE_PUSH_TASK.MESSAGE is
'推送内容';

comment on column V_MESSAGE_PUSH_TASK.MESSAGE_TYPE is
'0 普通消息提示1内链2外链';

comment on column V_MESSAGE_PUSH_TASK.CHANNEL_ID is
'推送渠道 1: 手机APP  2 : 微信';

comment on column V_MESSAGE_PUSH_TASK.DELETED is
'0未删除1删除';

comment on column V_MESSAGE_PUSH_TASK.ROW_VERSION is
'版本';

comment on column V_MESSAGE_PUSH_TASK.CREATE_TIME is
'创建时间';

comment on column V_MESSAGE_PUSH_TASK.CREATE_ID is
'创建人ID';

comment on column V_MESSAGE_PUSH_TASK.CREATE_NAME is
'创建人登录名称';

comment on column V_MESSAGE_PUSH_TASK.MODIFY_TIME is
'修改时间';

comment on column V_MESSAGE_PUSH_TASK.MODIFY_ID is
'修改人ID';

comment on column V_MESSAGE_PUSH_TASK.MODIFY_NAME is
'修改人登录名称';

comment on column V_MESSAGE_PUSH_TASK.AUDIT_TIME is
'审核时间';

comment on column V_MESSAGE_PUSH_TASK.AUDIT_ID is
'审核人ID';

comment on column V_MESSAGE_PUSH_TASK.AUDIT_NAME is
'审核人名称';

comment on column V_MESSAGE_PUSH_TASK.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

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
   T_HIS_MESSAGE_PUSH_TASK_DETAIL
with read only;

comment on table V_MESSAGE_PUSH_TASK_DETAIL is
'推送信息详细表与历史表合并显示';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.ID is
'主键ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.TASK_ID is
'推送批次ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.PUSH_ID is
'推送目标ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.APP_TYPE is
'手机类型 1. 安卓 2. ios';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.READ_STATE is
'阅读状态0：未读， 1:已读';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.SEND_STATE is
'推送状态0:未推送, 1 :推送中, 2:推送成功 ;3:推送响应失败;  ';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.SEND_NUM is
'已经推送次数';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.FIRST_SEND_TIME is
'失败推送时间';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.LAST_SEND_TIME is
'本次推送时间';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.FAILURE_REASON is
'推送失败原因';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.ROW_VERSION is
'版本';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.CREATE_TIME is
'创建时间';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.CREATE_ID is
'创建人ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.CREATE_NAME is
'创建人登录名称';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.MODIFY_TIME is
'修改时间';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.MODIFY_ID is
'修改人ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.MODIFY_NAME is
'修改人登录名称';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.DELETED is
'0未删除1删除';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.AUDIT_STATE is
'审核状态0未审核 1审核通过2审核不通过';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.AUDIT_NAME is
'审核人名称';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.AUDIT_ID is
'审核人ID';

comment on column V_MESSAGE_PUSH_TASK_DETAIL.AUDIT_TIME is
'审核时间';

