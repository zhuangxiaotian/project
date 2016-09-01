/*==============================================================*/
/* Table: T_FUND_CUSTOMER_PASSWORD                              */
/*==============================================================*/
create table T_FUND_CUSTOMER_PASSWORD
(
   ID                   char(24) not null comment 'PK',
   ID_TYPE              varchar(50) not null comment '证件类型',
   ID_NO                varchar(100) not null comment '证件号码',
   CUSTOMER_NO          varchar(100) not null comment '客户编号',
   PASSWD_TYPE          char(1) not null comment '登录密码类型 0 交易手势密码登录',
   CUSTOMER_NAME        varchar(100) not null comment '客户姓名 手势密码登录必须验证',
   PASSWD_VALUE         varchar(100) not null comment '密码值',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   MODIFY_TIME          datetime not null comment '修改时间',
   primary key (ID)
);

alter table T_FUND_CUSTOMER_PASSWORD comment '客户密码表';


INSERT
INTO T_SYSTEM_CONFIG (  SYSTEM_PARAM_CATEGORY,    SYSTEM_PARAM_CODE,    SYSTEM_PARAM_NAME,    SYSTEM_PARAM_DESC,
    SYSTEM_PARAM_VALUE,  ROW_VERSION, CREATE_TIME,    MODIFY_TIME)
  VALUES
  (
    'topdeep.commonfund.entity.params.CommonFundDbParam',
    'dbVersion',
    '当前数据库版本',
    '当前数据库版本',
    '1.3',
    0,
    now(),
    now()
  );
