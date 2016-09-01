ALTER TABLE `T_SYSTEM_VALID_INFO` drop column VALID_USER_ID;
ALTER TABLE `T_SYSTEM_VALID_INFO` drop column VALID_TYPE;

ALTER TABLE `T_SYSTEM_VALID_INFO` 
ADD COLUMN VALID_USER_ID_TYPE   varchar(100) not null comment '验证的用户标识类型' AFTER TARGET_SYSTEM,
ADD COLUMN VALID_USER_ID_NO     varchar(100) not null comment '验证的用户标识' AFTER VALID_USER_ID_TYPE,
ADD COLUMN VALID_TYPE           char(1) not null comment '验证类型 0 用户邮箱验证 1 忘记密码验证' AFTER VALID_USER_ID_NO;

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.5', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';