/*==============================================================*/
/* Table: T_SYSTEM_VISIT_MESSAGE                                */
/*==============================================================*/
CREATE TABLE T_SYSTEM_VISIT_MESSAGE  (
   ID                   CHAR(24)                        NOT NULL,
   TITLE                VARCHAR2(100),
   PARENT_ID            CHAR(24)                        NOT NULL,
   CUSTOMER_NO          VARCHAR2(100),
   NICKNAME             VARCHAR2(50),
   MESSAGE_MEMO         VARCHAR2(2000),
   READ_COUNT           NUMBER(8,0),
   MESSAGE              VARCHAR2(2000),
   REPLY_CONTENT        VARCHAR2(2000),
   REPLYER              VARCHAR2(200),
   EMAIL                VARCHAR2(100),
   TELEPHONE            VARCHAR2(100),
   ADDRESS              VARCHAR2(200),
   VISIT_TIME           DATE,
   REPLY_TIME           DATE,
   MESSAGE_TYPE         CHAR(1)                         NOT NULL,
   REPLY_STATUS         CHAR(1)                         NOT NULL,
   REALTION_FUND_MANAGER VARCHAR2(100),
   RELATION_FUND        VARCHAR2(100),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(200),
   AUDIT_ID             CHAR(24),
   AUDIT_TIME           DATE,
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1)                         NOT NULL,
   DELETED              CHAR(1),
   CONSTRAINT PK_T_SYSTEM_VISIT_MESSAGE PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_VISIT_MESSAGE IS
'访问留言表';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.ID IS
'消息ID';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.TITLE IS
'标题';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.PARENT_ID IS
'消息父类ID  默认24颗*';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.CUSTOMER_NO IS
'客户号';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.NICKNAME IS
'昵称';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MESSAGE_MEMO IS
'消息备注';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.READ_COUNT IS
'阅读次数';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MESSAGE IS
'留言内容';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.REPLY_CONTENT IS
'回复内容';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.REPLYER IS
'回复人';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.EMAIL IS
'邮箱';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.TELEPHONE IS
'联系电话';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.ADDRESS IS
'联系地址';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.VISIT_TIME IS
'访问留言时间';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.REPLY_TIME IS
'回复时间';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MESSAGE_TYPE IS
'消息类型, 0 默认提问';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.REPLY_STATUS IS
'回复状态,0 未读 1 已读未回复  2  回复';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.REALTION_FUND_MANAGER IS
'相关基金经理';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.RELATION_FUND IS
'相关基金代码';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.CREATE_ID IS
'创建ID';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.CREATE_NAME IS
'创建人姓名';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.MODIFY_NAME IS
'修改人姓名';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.AUDIT_ID IS
'审核ID';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.AUDIT_NAME IS
'审核人姓名';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.AUDIT_STATE IS
'审核状态 0 未审核   1审核通过';

COMMENT ON COLUMN T_SYSTEM_VISIT_MESSAGE.DELETED IS
'是否删除';

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.6', MODIFY_TIME = sysdate where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';

commit;