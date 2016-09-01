/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2016/7/20 16:43:54                           */
/*==============================================================*/


drop table if exists V_FUND_FUND_CATEGORY_FUND;

drop table if exists T_FUND_BANK_CARD_BIN;

drop table if exists T_FUND_BIND_INFO;

drop table if exists T_FUND_CUSTOMER_LOG;

drop table if exists T_FUND_CUSTOMER_PASSWORD;

drop table if exists T_FUND_CUST_MESSAGE;

drop table if exists T_FUND_EC_TRADE_SEAT;

drop table if exists T_FUND_FUND_CATAGORY_FUND_RELA;

drop table if exists T_FUND_FUND_CATEGORY;

drop table if exists T_FUND_FUND_INFO;

drop table if exists T_FUND_FUND_PROPERTY;

drop table if exists T_FUND_MESSAGE_RECORD;

drop table if exists T_FUND_TRADE_PARAM_CONVERT;

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

/*==============================================================*/
/* Table: T_FUND_BIND_INFO                                      */
/*==============================================================*/
create table T_FUND_BIND_INFO
(
   BIND_SRC             char(1) not null comment '来源',
   OPENID               varchar(50) not null comment '用户在来源系统中的标识',
   BIND_FLAG            char(1) not null comment '标识 0 未绑定 1 绑定',
   OPEN_TRADE           char(1) not null comment '是否开通直销账号 0 未开通 1 开通',
   BIND_TIME            datetime comment '绑定时间',
   UNBIND_TIME          datetime comment '解绑时间',
   LAST_VISIT_TIME      datetime not null comment '最后访问时间',
   VISIT_COUNT          numeric(8,0) not null comment '访问次数',
   CUST_NAME            varchar(100) comment '客户姓名',
   CUST_SEX             char(1) comment '客户姓别1男2女',
   CHANNEL              varchar(50) comment '渠道，绑定的渠道',
   ID_TYPE              varchar(50) comment '证件类型',
   ID_NO                varchar(50) comment '证件号码',
   SRC_VERSION          varchar(50) comment '来源系统版本',
   CLIENT_TYPE          varchar(50) comment '手机类型',
   OS                   varchar(50) comment 'iphone,android',
   OS_VERSION           varchar(50) comment '操作系统版本',
   NETWORK              varchar(50) comment 'wifi|2g|3g|4g',
   SERVICE              varchar(50) comment '0中国移动1中国联通2中国电信',
   MOBILE_PHONE         varchar(50) comment '手机号码',
   SCREEN               varchar(50) comment '屏幕大小',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   primary key (BIND_SRC, OPENID)
);

alter table T_FUND_BIND_INFO comment '绑定信息表';

/*==============================================================*/
/* Table: T_FUND_CUSTOMER_LOG                                   */
/*==============================================================*/
create table T_FUND_CUSTOMER_LOG
(
   ID                   char(24) not null comment '主键',
   CUST_TYPE            char(1) not null default '1' comment '0机构 1个人',
   CUSTOMER_NO          varchar(100) not null comment '客户编号',
   ID_TYPE              char(1) not null comment '客户证件类型',
   ID_NO                varchar(50) not null comment '客户证件号码',
   CLIENT_SRC           varchar(50) not null comment '来源',
   ACTION_TIME          datetime not null comment '访问时间',
   ACTION_TYPE          varchar(50) not null comment '动作类型 login purchase subscribe redeem cancel',
   ACTION_PARAM1        varchar(100) comment '参数1',
   ACTION_PARAM2        varchar(100) comment '参数2',
   ACTION_PARAM3        varchar(100) comment '参数3',
   ACTION_PARAM4        varchar(100) comment '参数4',
   ACTION_PARAM5        varchar(100) comment '参数5',
   ACTION_PARAM6        varchar(100) comment '参数6',
   ACTION_PARAM7        varchar(100) comment '参数7',
   ACTION_PARAM8        varchar(100) comment '参数8',
   ACTION_PARAM9        varchar(100) comment '参数9',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_FUND_CUSTOMER_LOG comment '客户端用户记录
记录的操作包括：
1 登录操作
2 买入操作
3 卖出操';

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
/* Table: T_FUND_EC_TRADE_SEAT                                  */
/*==============================================================*/
create table T_FUND_EC_TRADE_SEAT
(
   ID                   char(24) not null comment 'PK',
   PAY_SEAT_NO          varchar(50) not null comment '支付渠道代码',
   PAY_SEAT_NAME        varchar(50) not null comment '支付渠道名称',
   BANK_NO              varchar(50) not null comment '银行代码',
   BANK_NAME            varchar(50) not null comment '银行名称',
   SEAT_NO              varchar(50) not null comment '渠道代码',
   SEAT_NAME            varchar(50) not null comment '渠道名称',
   SEAT_STATE           char(1) not null comment '渠道状态',
   ORDER_FIELD          datetime not null comment '排序字段，日期越新越排在前面',
   FINATYPE             char(1) not null comment '资金方式',
   FUND_TRADE_SUPPORT   varchar(10) comment '是否支持定投 0： 否 ， 1： 是',
   TRANSACTION_LIMIT    varchar(500) comment '交易限额',
   DISCOUNT_INFORMATION varchar(500) comment '折扣信息',
   EXT_ID               varchar(100) comment '直销渠道在外部系统的ID',
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
   DELETED              char(1) not null default '0' comment '0未删除1删除',
   FAST_PAY_SUPPORT     char(1) not null comment '是否支持快捷（0不支持，1支持）',
   primary key (ID)
);

alter table T_FUND_EC_TRADE_SEAT comment '直销交易渠道';

/*==============================================================*/
/* Table: T_FUND_FUND_CATAGORY_FUND_RELA                        */
/*==============================================================*/
create table T_FUND_FUND_CATAGORY_FUND_RELA
(
   CATEGORY_ID          char(24) not null comment '分类标识',
   FUND_CODE            CHAR(6) not null comment '基金代码',
   ORDER_FIELD          datetime not null comment '排序',
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
   primary key (CATEGORY_ID, FUND_CODE)
);

alter table T_FUND_FUND_CATAGORY_FUND_RELA comment '分类基金关联表';

/*==============================================================*/
/* Table: T_FUND_FUND_CATEGORY                                  */
/*==============================================================*/
create table T_FUND_FUND_CATEGORY
(
   ID                   char(24) not null comment '分类ID',
   CATEGORY_NAME        varchar(100) not null comment '分类名称',
   ORDER_FIELD          datetime not null comment '排序字段',
   PARENT_ID            char(24) not null comment '父分类，没有父分类为24*',
   CATEGORY_STATE       char(1) not null comment '分类状态0不显示1显示',
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

alter table T_FUND_FUND_CATEGORY comment '基金显示分类';

/*==============================================================*/
/* Table: T_FUND_FUND_INFO                                      */
/*==============================================================*/
create table T_FUND_FUND_INFO
(
   FUND_CODE            CHAR(6) not null comment '基金代码',
   FUND_NAME            varchar(100) not null comment '基金简称',
   FUND_FULL_NAME       varchar(200) comment '基金全称',
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
   primary key (FUND_CODE)
);

alter table T_FUND_FUND_INFO comment '基金信息';

/*==============================================================*/
/* Table: T_FUND_FUND_PROPERTY                                  */
/*==============================================================*/
create table T_FUND_FUND_PROPERTY
(
   FUND_CODE            CHAR(6) not null comment '基金代码',
   PROPERTY_TYPE        varchar(50) not null comment '属性类型,枚举常量',
   PROPERTY_VALUE       varchar(2000) comment '属性值',
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
   primary key (FUND_CODE, PROPERTY_TYPE)
);

alter table T_FUND_FUND_PROPERTY comment '基金属性表';

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

/*==============================================================*/
/* Table: T_FUND_TRADE_PARAM_CONVERT                            */
/*==============================================================*/
create table T_FUND_TRADE_PARAM_CONVERT
(
   ID                   char(24) not null comment 'PK',
   PARAM_TYPE           varchar(50) not null comment '参数类型，程序定义',
   PAY_SEAT_NO          varchar(50) not null comment '支付渠道代码',
   SEAT_NO              varchar(50) comment '席位号，保留',
   BANK_NO              varchar(50) not null comment '银行代码',
   LOCAL_VALUE          varchar(100) not null comment '本地值',
   BANK_VALUE           varchar(100) not null comment '银行值',
   AUDIT_STATE          char(1) comment '审核状态0未审核 1审核通过2审核不通过',
   AUDIT_NAME           varchar(100) comment '审核人名称',
   AUDIT_ID             char(24) comment '审核人ID',
   AUDIT_TIME           datetime comment '审核时间',
   MODIFY_NAME          varchar(100) comment '修改人登录名称',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   CREATE_TIME          datetime not null comment '创建时间',
   CREATE_ID            char(24) comment '创建人ID',
   CREATE_NAME          varchar(100) comment '创建人登录名称',
   MODIFY_TIME          datetime not null comment '修改时间',
   MODIFY_ID            char(24) comment '修改人ID',
   primary key (ID)
);

alter table T_FUND_TRADE_PARAM_CONVERT comment '交易参数转换';

/*==============================================================*/
/* View: V_FUND_FUND_CATEGORY_FUND                              */
/*==============================================================*/
create VIEW  V_FUND_FUND_CATEGORY_FUND
 as
SELECT T1.CATEGORY_ID,
    T1.FUND_CODE,
    T1.ORDER_FIELD,
    T2.CATEGORY_NAME,
    T3.FUND_NAME
  FROM T_FUND_FUND_CATAGORY_FUND_RELA T1
  INNER JOIN T_FUND_FUND_CATEGORY T2
  ON T2.ID = T1.CATEGORY_ID
  INNER JOIN T_FUND_FUND_INFO T3
  ON T3.FUND_CODE = T1.FUND_CODE;

