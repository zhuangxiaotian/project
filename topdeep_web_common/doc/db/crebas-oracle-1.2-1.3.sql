ALTER TABLE T_SYSTEM_ADMIN_LOG ADD (
   ADMIN_NAME           VARCHAR2(100),
   UPDATE_COUNT         NUMBER(8,0)                    DEFAULT 0 NOT NULL
);

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.ADMIN_NAME IS
'操作员名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.UPDATE_COUNT IS
'更新记录数量';



INSERT
INTO T_SYSTEM_CONFIG (  SYSTEM_PARAM_CATEGORY,    SYSTEM_PARAM_CODE,    SYSTEM_PARAM_NAME,    SYSTEM_PARAM_DESC,
    SYSTEM_PARAM_VALUE,  ROW_VERSION, CREATE_TIME,    MODIFY_TIME)
  VALUES
  (
    'topdeep.common.entity.params.CommonDbParam',
    'dbVersion',
    '当前数据库版本',
    '当前数据库版本',
    '1.3',
    0,
    sysdate,
    sysdate
  );