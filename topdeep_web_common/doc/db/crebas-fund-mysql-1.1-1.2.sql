
ALTER TABLE `T_FUND_EC_TRADE_SEAT` 
ADD COLUMN   FUND_TRADE_SUPPORT  varchar(10) default '0' comment '是否支持基金投资 0： 否 ， 1： 是',
ADD COLUMN   TRANSACTION_LIMIT    varchar(500) comment '交易限额',
ADD COLUMN   DISCOUNT_INFORMATION varchar(500) comment '折扣信息';
