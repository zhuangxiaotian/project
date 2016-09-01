drop table T_FUND_CLIENT_ACTIVATION;
drop table T_FUND_CLIENT_VERSION;
/*==============================================================*/
/* View: V_FUND_FUND_CATEGORY_FUND                              */
/*==============================================================*/
create or replace VIEW      V_FUND_FUND_CATEGORY_FUND 
   as 
   SELECT T1.CATEGORY_ID,
       T1.FUND_CODE,
       T1.ORDER_FIELD,
       T2.CATEGORY_NAME,
       T3.FUND_NAME
     FROM T_FUND_FUND_CATAGORY_FUND_RELA T1
     INNER JOIN T_FUND_FUND_CATEGORY T2
     ON T2.ID = T1.CATEGORY_ID
     INNER JOIN T_FUND_FUND_INFO T3
     ON T3.FUND_CODE = T1.FUND_CODE;

/*此语句需要在基础库中执行*/
update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.4', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.commonfund.entity.params.CommonFundDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';

