/*==============================================================*/
/* DBMS name:      ORACLE Version 10g                           */
/* Created on:     2016/5/20 19:49:02                           */
/*==============================================================*/


DROP TABLE T_FUND_CUST_MESSAGE CASCADE CONSTRAINTS;

DROP TABLE T_FUND_MESSAGE_RECORD CASCADE CONSTRAINTS;


/*==============================================================*/
/* Table: T_FUND_CUST_MESSAGE                                   */
/*==============================================================*/
CREATE TABLE T_FUND_CUST_MESSAGE  (
   ID                   CHAR(24)                        NOT NULL,
   ID_TYPE              CHAR(1)                         NOT NULL,
   ID_NO                VARCHAR2(200)                   NOT NULL,
   PUBLISH_TIME         DATE                            NOT NULL,
   MESSAGE_TITLE        VARCHAR2(200),
   MESSAGE_CONTENT      VARCHAR2(2000)                  NOT NULL,
   MESSAGE_TYPE         CHAR(1)                         NOT NULL,
   SHOW_CHANNEL         VARCHAR2(50)                    NOT NULL,
   AUDIT_STATE          CHAR(1),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_ID             CHAR(24),
   AUDIT_TIME           DATE,
   MODIFY_NAME          VARCHAR2(100),
   MODIFY_ID            CHAR(24),
   MODIFY_TIME          DATE                            NOT NULL,
   CREATE_NAME          VARCHAR2(100),
   CREATE_ID            CHAR(24),
   CREATE_TIME          DATE                            NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_FUND_CUST_MESSAGE PRIMARY KEY (ID)
);

COMMENT ON TABLE T_FUND_CUST_MESSAGE IS
'客户消息表';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.ID IS
'消息ID';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.ID_TYPE IS
'证件类型';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.ID_NO IS
'证件号码';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.PUBLISH_TIME IS
'显示日期';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MESSAGE_TITLE IS
'标题';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MESSAGE_CONTENT IS
'消息内容';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MESSAGE_TYPE IS
'消息类型（1、交易消息2、系统消息3、活动消息）';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.SHOW_CHANNEL IS
'显示渠道(1、WX，2、APP，3、网站，多个以逗号分隔)';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_FUND_CUST_MESSAGE.ROW_VERSION IS
'版本';


/*==============================================================*/
/* Table: T_FUND_MESSAGE_RECORD                                 */
/*==============================================================*/
CREATE TABLE T_FUND_MESSAGE_RECORD  (
   ID                   CHAR(24)                        NOT NULL,
   ID_TYPE              CHAR(1)                         NOT NULL,
   ID_NO                VARCHAR2(200)                   NOT NULL,
   DELETED              CHAR(1)                         NOT NULL,
   READ_STATE           CHAR(1)                         NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT AK_KEY_1_T_FUND_M UNIQUE (ID, ID_TYPE, ID_NO)
);

COMMENT ON TABLE T_FUND_MESSAGE_RECORD IS
'消息记录表';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.ID IS
'ID';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.ID_TYPE IS
'证件类型';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.ID_NO IS
'证件号码';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.DELETED IS
'是否删除（0、未删除，1、已删除）';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.READ_STATE IS
'是否已读（0、未读，1、已读）';

COMMENT ON COLUMN T_FUND_MESSAGE_RECORD.ROW_VERSION IS
'版本';


ALTER TABLE T_FUND_MESSAGE_RECORD
   ADD CONSTRAINT FK_T_FUND_M_REFERENCE_T_FUND_C FOREIGN KEY (ID)
      REFERENCES T_FUND_CUST_MESSAGE (ID);

