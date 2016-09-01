/*==============================================================*/
/* Table: T_SYSTEM_EXCEPTION_LOG                                */
/*==============================================================*/
CREATE TABLE T_SYSTEM_EXCEPTION_LOG  (
   ID                   CHAR(24)                        NOT NULL,
   ID_TYPE              VARCHAR2(10 BYTE),
   ID_NO                VARCHAR2(100),
   EXCEPTION_FUNC_CODE  VARCHAR2(10 BYTE),
   EXCEPTION_RESULT_CODE VARCHAR2(10 BYTE),
   EXCEPTION_RESULT_MSG VARCHAR2(2000),
   FROM_SRC             VARCHAR2(50),
   EXCEPTION_MEMO       VARCHAR2(200),
   CREATE_TIME          DATE                            NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_EXCEPTION_LOG PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_EXCEPTION_LOG IS
'系统异常记录表';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.ID_TYPE IS
'证件类型';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.ID_NO IS
'证件号码';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.EXCEPTION_FUNC_CODE IS
'异常的功能号';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.EXCEPTION_RESULT_CODE IS
'异常返回码';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.EXCEPTION_RESULT_MSG IS
'异常消息';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.FROM_SRC IS
'交易来源';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.EXCEPTION_MEMO IS
'异常备注';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_EXCEPTION_LOG.ROW_VERSION IS
'版本';


update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.7', MODIFY_TIME = sysdate where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';

commit;