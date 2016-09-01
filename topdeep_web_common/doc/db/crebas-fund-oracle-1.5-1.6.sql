ALTER TABLE T_FUND_EC_TRADE_SEAT ADD (
   FAST_PAY_SUPPORT           CHAR(1)                         NOT NULL
);

COMMENT ON COLUMN T_FUND_EC_TRADE_SEAT.FAST_PAY_SUPPORT IS
'是否支持快捷（0不支持，1支持）';

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.6', MODIFY_TIME = sysdate where SYSTEM_PARAM_CATEGORY = 'topdeep.commonfund.entity.params.CommonFundDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';

commit;