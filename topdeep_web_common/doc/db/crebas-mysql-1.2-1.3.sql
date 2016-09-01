ALTER TABLE `T_SYSTEM_ADMIN_LOG` 
ADD COLUMN ADMIN_NAME           varchar(100) comment '操作员名称' AFTER ADMIN_ID,
ADD COLUMN UPDATE_COUNT         numeric(8,0) not null default 0 comment '更新记录数量' AFTER OPERATE_CONTENT;

alter table T_SYSTEM_ADMIN_LOG comment '系统管理员日志';

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
    now(),
    now()
  );
