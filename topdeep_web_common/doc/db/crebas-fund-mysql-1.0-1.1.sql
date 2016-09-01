/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/5/20 19:47:44                           */
/*==============================================================*/


drop table if exists T_FUND_CUST_MESSAGE;

drop table if exists T_FUND_MESSAGE_RECORD;



/*==============================================================*/
/* Table: T_FUND_CUST_MESSAGE                                   */
/*==============================================================*/
create table T_FUND_CUST_MESSAGE
(
   ID                   char(24) not null comment '消息ID',
   ID_TYPE              char(1) not null comment '证件类型',
   ID_NO                varchar(200) not null comment '证件号码',
   PUBLISH_TIME         datetime not null comment '显示日期',
   MESSAGE_TITLE        varchar(200) comment '标题',
   MESSAGE_CONTENT      varchar(2000) not null comment '消息内容',
   MESSAGE_TYPE         char(1) not null comment '消息类型（1、交易消息2、系统消息3、活动消息）',
   SHOW_CHANNEL         varchar(50) not null comment '显示渠道(1、WX，2、APP，3、网站，多个以逗号分隔)',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_TIME          datetime not null comment '修改时间',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_TIME          datetime not null comment '创建时间',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_FUND_CUST_MESSAGE comment '客户消息表';


/*==============================================================*/
/* Table: T_FUND_MESSAGE_RECORD                                 */
/*==============================================================*/
create table T_FUND_MESSAGE_RECORD
(
   ID                   char(24) not null comment 'ID',
   ID_TYPE              char(1) not null comment '证件类型',
   ID_NO                varchar(200) not null comment '证件号码',
   DELETED              char(1) not null comment '是否删除（0、未删除，1、已删除）',
   READ_STATE           char(1) not null comment '是否已读（0、未读，1、已读）',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   key AK_Key_1 (ID, ID_TYPE, ID_NO)
);

alter table T_FUND_MESSAGE_RECORD comment '消息记录表';

