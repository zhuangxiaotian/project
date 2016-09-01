/*==============================================================*/
/* Table: T_FUND_CUSTOMER_PASSWORD                              */
/*==============================================================*/
CREATE TABLE T_FUND_CUSTOMER_PASSWORD  (
   ID                   CHAR(24)                        NOT NULL,
   ID_TYPE              VARCHAR2(50)                    NOT NULL,
   ID_NO                VARCHAR2(100)                   NOT NULL,
   CUSTOMER_NO          VARCHAR2(100)                   NOT NULL,
   PASSWD_TYPE          CHAR(1)                         NOT NULL,
   CUSTOMER_NAME        VARCHAR2(100)                   NOT NULL,
   PASSWD_VALUE         VARCHAR2(100)                   NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   MODIFY_TIME          DATE                            NOT NULL,
   CONSTRAINT PK_T_FUND_CUSTOMER_PASSWORD PRIMARY KEY (ID)
);

COMMENT ON TABLE T_FUND_CUSTOMER_PASSWORD IS
'客户密码表';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.ID IS
'PK';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.ID_TYPE IS
'证件类型';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.ID_NO IS
'证件号码';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.CUSTOMER_NO IS
'客户编号';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.PASSWD_TYPE IS
'登录密码类型 0 交易手势密码登录';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.CUSTOMER_NAME IS
'客户姓名 手势密码登录必须验证';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.PASSWD_VALUE IS
'密码值';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_FUND_CUSTOMER_PASSWORD.MODIFY_TIME IS
'修改时间';


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
    sysdate,
    sysdate
  );

commit;