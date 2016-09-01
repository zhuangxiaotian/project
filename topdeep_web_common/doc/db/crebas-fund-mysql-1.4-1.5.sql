drop table if exists T_FUND_BANK_CARD_BIN;

/*==============================================================*/
/* Table: T_FUND_BANK_CARD_BIN                                  */
/*==============================================================*/
create table T_FUND_BANK_CARD_BIN
(
   ID                   char(24) not null comment '银行卡BinID',
   BANK_NO              varchar(50) not null comment '银行代码',
   BANK_NAME            varchar(200) not null comment '银行名称',
   BANK_CARD_LENGTH     varchar(50) comment '银行卡长度',
   BANK_CARD_BIN        varchar(100) not null comment '银行卡Bin',
   ROW_VERSION          numeric(8,0) not null comment '版本号',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建ID',
   CREATE_NAME          varchar(100) comment '创建人',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   MODIFY_NAME          varchar(100) comment '修改人',
   AUDIT_ID             char(24) comment '审核ID',
   AUDIT_TIME           datetime not null comment '审核时间',
   AUDIT_NAME           varchar(100) comment '审核人',
   AUDIT_STATE          char(1) comment '审核状态 0 未审核   1审核通过',
   DELETED              char(1) not null comment '是否删除 0 未删除  1删除',
   primary key (ID)
);

alter table T_FUND_BANK_CARD_BIN comment '银行卡bin表';



update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.5', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.commonfund.entity.params.CommonFundDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';
