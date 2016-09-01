/*==============================================================*/
/* Table: T_SYSTEM_EXCEPTION_LOG                                */
/*==============================================================*/
create table T_SYSTEM_EXCEPTION_LOG
(
   ID                   char(24) not null,
   ID_TYPE              varchar(10) comment '证件类型',
   ID_NO                varchar(100) comment '证件号码',
   EXCEPTION_FUNC_CODE  varchar(10) comment '异常的功能号',
   EXCEPTION_RESULT_CODE varchar(10) comment '异常返回码',
   EXCEPTION_RESULT_MSG varchar(2000) comment '异常消息',
   FROM_SRC             varchar(50) comment '交易来源',
   EXCEPTION_MEMO       varchar(200) comment '异常备注',
   CREATE_TIME          datetime not null comment '创建时间',
   ROW_VERSION          numeric(8,0) not null comment '版本',
   primary key (ID)
);

alter table T_SYSTEM_EXCEPTION_LOG comment '系统异常记录表';

update T_SYSTEM_CONFIG set SYSTEM_PARAM_VALUE = '1.7', MODIFY_TIME = now() where SYSTEM_PARAM_CATEGORY = 'topdeep.common.entity.params.CommonDbParam' and SYSTEM_PARAM_CODE = 'dbVersion';
