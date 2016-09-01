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

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.6', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';
