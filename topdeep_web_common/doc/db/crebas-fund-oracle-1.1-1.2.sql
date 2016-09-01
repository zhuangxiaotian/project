ALTER TABLE T_FUND_EC_TRADE_SEAT
ADD (
FUND_TRADE_SUPPORT VARCHAR2(10 BYTE) DEFAULT '0',
DISCOUNT_INFORMATION VARCHAR2(500),
TRANSACTION_LIMIT    VARCHAR2(500)
);

COMMENT ON COLUMN T_FUND_EC_TRADE_SEAT.FUND_TRADE_SUPPORT IS
'是否支持基金投资 0： 否 ， 1： 是';

COMMENT ON COLUMN T_FUND_EC_TRADE_SEAT.DISCOUNT_INFORMATION IS
'折扣信息';

COMMENT ON COLUMN T_FUND_EC_TRADE_SEAT.TRANSACTION_LIMIT IS
'交易限额';