ALTER TABLE `T_FUND_EC_TRADE_SEAT` 
ADD COLUMN FAST_PAY_SUPPORT           char(1) not null comment '是否支持快捷（0不支持，1支持）' AFTER DELETED;

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.6', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.commonfund.entity.params.CommonFundDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';