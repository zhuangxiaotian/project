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
/* Table: T_FUND_CLIENT_ACTIVATION                              */
/*==============================================================*/
create table T_FUND_CLIENT_ACTIVATION
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

alter table T_FUND_CLIENT_ACTIVATION comment '客户端激活表';

/*==============================================================*/
/* Table: T_FUND_CLIENT_VERSION                                 */
/*==============================================================*/
create table T_FUND_CLIENT_VERSION
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

alter table T_FUND_CLIENT_VERSION comment '客户端版本控制';

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

CREATE  OR REPLACE VIEW `V_FUND_FUND_CATEGORY_FUND` AS
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

