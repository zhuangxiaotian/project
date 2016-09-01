/*==============================================================*/
/* DBMS name:      ORACLE Version 10g                           */
/* Created on:     2016-05-10 22:16:34                          */
/*==============================================================*/


DROP TABLE T_SYSTEM_ADMIN CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_ADMIN_LOG CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_ADMIN_ROLES CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_BASE_INFO CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_CONFIG CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_CRON_JOB CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_CRON_JOB_LOG CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_EXT_USER_RELATION CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_MSG_SEND CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_PARAM CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_PRIVILEGE CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_ROLES CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_VALID_INFO CASCADE CONSTRAINTS;

DROP TABLE T_SYSTEM_WHITE_LIST CASCADE CONSTRAINTS;

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN                                        */
/*==============================================================*/
CREATE TABLE T_SYSTEM_ADMIN  (
   ID                   CHAR(24)                        NOT NULL,
   NAME                 VARCHAR2(50)                    NOT NULL,
   STATE                CHAR(1)                         NOT NULL,
   LOGIN_EMAIL          VARCHAR2(255),
   LOGIN_NAME           VARCHAR2(50)                    NOT NULL,
   LOGIN_PASS           VARCHAR2(50)                    NOT NULL,
   LOGIN_PASS_SALT      VARCHAR2(50)                    NOT NULL,
   MOBILE_TELEPHONE     VARCHAR2(50),
   OTHER_TELEPHONE      VARCHAR2(50),
   LAST_LOGINTIME       DATE,
   LAST_LOGINADDRESS    VARCHAR2(50),
   MEMO                 VARCHAR2(1000),
   PARENT_ADMIN_ID      CHAR(24)                        NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   DELETED              CHAR(1)                        DEFAULT '0' NOT NULL,
   CONSTRAINT PK_T_SYSTEM_ADMIN PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_ADMIN IS
'系统管理员表，公网用户注册';

COMMENT ON COLUMN T_SYSTEM_ADMIN.ID IS
'操作员标识';

COMMENT ON COLUMN T_SYSTEM_ADMIN.NAME IS
'操作员名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN.STATE IS
'操作员状态,0 禁止,1 正常';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LOGIN_EMAIL IS
'操作员邮件';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LOGIN_NAME IS
'登陆名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LOGIN_PASS IS
'登陆密码';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LOGIN_PASS_SALT IS
'密码加密盐值';

COMMENT ON COLUMN T_SYSTEM_ADMIN.MOBILE_TELEPHONE IS
'移动电话';

COMMENT ON COLUMN T_SYSTEM_ADMIN.OTHER_TELEPHONE IS
'其他电话';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LAST_LOGINTIME IS
'最后一次登录时间';

COMMENT ON COLUMN T_SYSTEM_ADMIN.LAST_LOGINADDRESS IS
'最后一次登录地址';

COMMENT ON COLUMN T_SYSTEM_ADMIN.MEMO IS
'操作员备注';

COMMENT ON COLUMN T_SYSTEM_ADMIN.PARENT_ADMIN_ID IS
'超级管理员ID，特殊值表示超级管理员本身';

COMMENT ON COLUMN T_SYSTEM_ADMIN.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_ADMIN.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_ADMIN.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_ADMIN.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_ADMIN.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_ADMIN.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_ADMIN.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_ADMIN.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_ADMIN.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

COMMENT ON COLUMN T_SYSTEM_ADMIN.DELETED IS
'是否删除 0正常1删除';

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN_LOG                                    */
/*==============================================================*/
CREATE TABLE T_SYSTEM_ADMIN_LOG  (
   ADMIN_LOG_ID         CHAR(24)                        NOT NULL,
   ADMIN_ID             CHAR(24)                        NOT NULL,
   OPERATE_TIME         DATE                            NOT NULL,
   OPERATE_TYPE         VARCHAR2(100)                   NOT NULL,
   OPERATE_CONTENT      VARCHAR2(2000)                  NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_ADMIN_LOG PRIMARY KEY (ADMIN_LOG_ID)
);

COMMENT ON TABLE T_SYSTEM_ADMIN_LOG IS
'Cms管理员日志';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.ADMIN_LOG_ID IS
'操作员日志标识';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.ADMIN_ID IS
'操作员标识';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.OPERATE_TIME IS
'操作时间';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.OPERATE_TYPE IS
'操作类别';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.OPERATE_CONTENT IS
'操作内容';

COMMENT ON COLUMN T_SYSTEM_ADMIN_LOG.ROW_VERSION IS
'版本号(DML操作时用)';

/*==============================================================*/
/* Table: T_SYSTEM_ADMIN_ROLES                                  */
/*==============================================================*/
CREATE TABLE T_SYSTEM_ADMIN_ROLES  (
   ID                   CHAR(24)                        NOT NULL,
   ADMIN_ID             CHAR(24)                        NOT NULL,
   ROLES_ID             CHAR(24)                        NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_ADMIN_ROLES PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_ADMIN_ROLES IS
'管理员和角色的关联表';

COMMENT ON COLUMN T_SYSTEM_ADMIN_ROLES.ID IS
'主键';

COMMENT ON COLUMN T_SYSTEM_ADMIN_ROLES.ADMIN_ID IS
'用户';

COMMENT ON COLUMN T_SYSTEM_ADMIN_ROLES.ROLES_ID IS
'角色';

COMMENT ON COLUMN T_SYSTEM_ADMIN_ROLES.ROW_VERSION IS
'DML版本';

/*==============================================================*/
/* Table: T_SYSTEM_BASE_INFO                                    */
/*==============================================================*/
CREATE TABLE T_SYSTEM_BASE_INFO  (
   CODE_ID              VARCHAR2(50)                    NOT NULL,
   CODE_TYPE            VARCHAR2(10 BYTE)               NOT NULL,
   CODE_NAME            VARCHAR2(100),
   CODE_DESC            VARCHAR2(500),
   AUDIT_STATE          CHAR(1),
   ORDER_FIELD          NUMBER(8,0)                     NOT NULL,
   SYSTEM_TYPE          CHAR(1)                         NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   AUDIT_ID             CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   CREATE_ID            CHAR(24),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   AUDIT_TIME           DATE,
   MODIFY_ID            CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_NAME          VARCHAR2(100),
   CONSTRAINT PK_T_SYSTEM_BASE_INFO PRIMARY KEY (CODE_ID, CODE_TYPE, SYSTEM_TYPE)
);

COMMENT ON TABLE T_SYSTEM_BASE_INFO IS
'系统基本信息表';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CODE_ID IS
'字典值';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CODE_TYPE IS
'字典类型';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CODE_NAME IS
'字典名称';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CODE_DESC IS
'字典描述';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.ORDER_FIELD IS
'字典顺序';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.SYSTEM_TYPE IS
'产品类型由系统定义';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_BASE_INFO.MODIFY_NAME IS
'修改人登录名称';

/*==============================================================*/
/* Table: T_SYSTEM_CONFIG                                       */
/*==============================================================*/
CREATE TABLE T_SYSTEM_CONFIG  (
   SYSTEM_PARAM_CATEGORY VARCHAR2(100)                   NOT NULL,
   SYSTEM_PARAM_CODE    VARCHAR2(100)                   NOT NULL,
   SYSTEM_PARAM_NAME    VARCHAR2(100)                   NOT NULL,
   SYSTEM_PARAM_DESC    VARCHAR2(1000),
   SYSTEM_PARAM_VALUE   VARCHAR2(2000),
   LAST_MODIFY_TIME     DATE,
   LAST_MODIFY_OPER     CHAR(24),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   CONSTRAINT PK_T_SYSTEM_CONFIG PRIMARY KEY (SYSTEM_PARAM_CATEGORY, SYSTEM_PARAM_CODE)
);

COMMENT ON TABLE T_SYSTEM_CONFIG IS
'系统配置表';

COMMENT ON COLUMN T_SYSTEM_CONFIG.SYSTEM_PARAM_CATEGORY IS
'参数分类';

COMMENT ON COLUMN T_SYSTEM_CONFIG.SYSTEM_PARAM_CODE IS
'参数代码';

COMMENT ON COLUMN T_SYSTEM_CONFIG.SYSTEM_PARAM_NAME IS
'参数名称';

COMMENT ON COLUMN T_SYSTEM_CONFIG.SYSTEM_PARAM_DESC IS
'参数说明';

COMMENT ON COLUMN T_SYSTEM_CONFIG.SYSTEM_PARAM_VALUE IS
'参数值';

COMMENT ON COLUMN T_SYSTEM_CONFIG.LAST_MODIFY_TIME IS
'最后修改时间';

COMMENT ON COLUMN T_SYSTEM_CONFIG.LAST_MODIFY_OPER IS
'最后修改人';

COMMENT ON COLUMN T_SYSTEM_CONFIG.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_CONFIG.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_CONFIG.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_CONFIG.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_CONFIG.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_CONFIG.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_CONFIG.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_CONFIG.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_CONFIG.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_CONFIG.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_CONFIG.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

/*==============================================================*/
/* Table: T_SYSTEM_CRON_JOB                                     */
/*==============================================================*/
CREATE TABLE T_SYSTEM_CRON_JOB  (
   ID                   CHAR(24)                        NOT NULL,
   NAME                 VARCHAR2(100)                   NOT NULL,
   OWNER_ID             CHAR(24),
   JOB_TYPE             CHAR(1)                         NOT NULL,
   JOB_FROM             CHAR(1)                         NOT NULL,
   JOB_LOCATE           CHAR(1)                         NOT NULL,
   JOB_BEAN_ID          VARCHAR2(50)                    NOT NULL,
   JOB_VERSION          NUMBER(8,0)                     NOT NULL,
   CYCLE_VALUE          NUMBER(8,0),
   CYCLE_UNIT           CHAR(1),
   LAST_SUCCESS_TIME    DATE,
   FIRST_EXECUTE_TIME   DATE,
   NEXT_EXECUTE_TIME    DATE,
   SUCCESS_COUNT        NUMBER(8,0)                     NOT NULL,
   FAIL_COUNT           NUMBER(8,0)                     NOT NULL,
   TOTAL_COUNT          NUMBER(8,0)                     NOT NULL,
   LAST_EXECUTE_RESULT  CHAR(1),
   LAST_EXECUTE_MESSAGE VARCHAR2(200),
   JOB_STATE            CHAR(1)                         NOT NULL,
   LOG_ENABLED          CHAR(1)                         NOT NULL,
   CURRENT_EXEC_SERVER  VARCHAR2(200),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   CONSTRAINT PK_T_SYSTEM_CRON_JOB PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_CRON_JOB IS
'系统定时任务表,动态参数放在动态参数表中，由各个任务类型定义';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.NAME IS
'任务名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.OWNER_ID IS
'所属系统，允许为空，为空表示该任务从属无关';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_TYPE IS
'0 定时执行 1 一次性';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_FROM IS
'0 系统 1用户';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_LOCATE IS
'系统执行位置';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_BEAN_ID IS
'执行任务的对象在IOC容器中的名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_VERSION IS
'任务版本';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CYCLE_VALUE IS
'周期值';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CYCLE_UNIT IS
'周期单位 s秒m分钟h小时y年M月d日';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.LAST_SUCCESS_TIME IS
'上次成功执行时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.FIRST_EXECUTE_TIME IS
'首次执行时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.NEXT_EXECUTE_TIME IS
'下次执行时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.SUCCESS_COUNT IS
'成功次数';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.FAIL_COUNT IS
'失败次数';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.TOTAL_COUNT IS
'总执行次数';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.LAST_EXECUTE_RESULT IS
'上次执行结果 0 失败 1成功 2执行器返回参数不满足，未执行 3 管理员取消 4用户取消';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.LAST_EXECUTE_MESSAGE IS
'上次执行结果消息';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.JOB_STATE IS
'0 无效 1 激活状态 2 管理员已禁止 3 用户已禁止';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.LOG_ENABLED IS
'激活执行记录，0 不记录 1记录到表中';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CURRENT_EXEC_SERVER IS
'当前执行任务的服务器，只有当该字段为空时，服务器才可以执行该任务';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

/*==============================================================*/
/* Table: T_SYSTEM_CRON_JOB_LOG                                 */
/*==============================================================*/
CREATE TABLE T_SYSTEM_CRON_JOB_LOG  (
   ID                   CHAR(24)                        NOT NULL,
   JOB_ID               CHAR(24)                        NOT NULL,
   NAME                 VARCHAR2(100)                   NOT NULL,
   OWNER_ID             CHAR(24),
   JOB_FROM             CHAR(1)                         NOT NULL,
   JOB_LOCATE           CHAR(1)                         NOT NULL,
   JOB_BEAN_ID          VARCHAR2(50)                    NOT NULL,
   JOB_VERSION          NUMBER(8,0)                     NOT NULL,
   START_EXECUTE_TIME   DATE,
   END_EXECUTE_TIME     DATE,
   USE_TIME             NUMBER(8,0),
   EXECUTE_RESULT       CHAR(1),
   EXECUTE_MESSAGE      VARCHAR2(200),
   EXEC_SERVER          VARCHAR2(200),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_CRON_JOB_LOG PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_CRON_JOB_LOG IS
'系统定时任务执行记录表';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.JOB_ID IS
'任务ID';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.NAME IS
'任务名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.OWNER_ID IS
'所属者';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.JOB_FROM IS
'0 系统 1用户';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.JOB_LOCATE IS
'任务执行位置';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.JOB_BEAN_ID IS
'执行任务的对象在IOC容器中的名称';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.JOB_VERSION IS
'任务版本';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.START_EXECUTE_TIME IS
'开始执行时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.END_EXECUTE_TIME IS
'结束执行时间';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.USE_TIME IS
'执行任务所需要的毫秒数';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.EXECUTE_RESULT IS
'上次执行结果 0 失败 1成功 2执行器返回参数不满足，未执行 3 管理员取消 4用户取消 5 超时未返回';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.EXECUTE_MESSAGE IS
'上次执行结果消息';

COMMENT ON COLUMN T_SYSTEM_CRON_JOB_LOG.EXEC_SERVER IS
'执行任务的服务器';

/*==============================================================*/
/* Table: T_SYSTEM_EXT_USER_RELATION                            */
/*==============================================================*/
CREATE TABLE T_SYSTEM_EXT_USER_RELATION  (
   ID                   CHAR(24)                        NOT NULL,
   ADMIN_ID             CHAR(24)                        NOT NULL,
   VISIT_TOKEN          CHAR(24)                        NOT NULL,
   REALTION_TYPE        CHAR(1)                         NOT NULL,
   EXTERNAL_SYSTEM_TYPE CHAR(1)                         NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   CONSTRAINT PK_T_SYSTEM_EXT_USER_RELATION PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_EXT_USER_RELATION IS
'外部系统用户关联表';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.ID IS
'PK';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.ADMIN_ID IS
'关联的用户标识，对于链接外部系统 ，是指本系统的用户ID，对于链入系统，则链接的用户ID';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.VISIT_TOKEN IS
'访问TOKEN';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.REALTION_TYPE IS
'关系类型 0 链接外部系统 1 外部系统链接进来';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.EXTERNAL_SYSTEM_TYPE IS
'外部系统类型 0 基金交易系统 1 CMS系统 2 PUSH系统 3 微信系统';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_EXT_USER_RELATION.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

/*==============================================================*/
/* Table: T_SYSTEM_MSG_SEND                                     */
/*==============================================================*/
CREATE TABLE T_SYSTEM_MSG_SEND  (
   ID                   CHAR(24)                        NOT NULL,
   TARGET_SYSTEM        CHAR(1)                         NOT NULL,
   CHANNEL_TYPE         CHAR(1)                         NOT NULL,
   INFO_TYPE            CHAR(1)                         NOT NULL,
   TARGET_IDENTITY      VARCHAR2(200)                   NOT NULL,
   SEND_PRIORITY        NUMBER(8,0)                     NOT NULL,
   TARGET               VARCHAR2(255)                   NOT NULL,
   CONTENT              VARCHAR2(2000)                  NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   SEND_TIME            DATE,
   SEND_COUNT           NUMBER(8,0)                     NOT NULL,
   SEND_STATE           CHAR(1)                         NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_MSG_SEND PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_MSG_SEND IS
'消息发送表';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.ID IS
'主键';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.CHANNEL_TYPE IS
'通道类型0 短信 1邮件 2微信';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.INFO_TYPE IS
'短信类型';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.TARGET_IDENTITY IS
'目标标识，例如身份证';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.SEND_PRIORITY IS
'发送优先级，默认填3';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.TARGET IS
'发送目标';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.CONTENT IS
'发送内容';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.SEND_TIME IS
'发送时间';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.SEND_COUNT IS
'发送次数';

COMMENT ON COLUMN T_SYSTEM_MSG_SEND.SEND_STATE IS
'0 初始状态不可发送 1可以发送 2 发送成功 3发送失败 34次发送失败已停止发送';

/*==============================================================*/
/* Table: T_SYSTEM_PARAM                                        */
/*==============================================================*/
CREATE TABLE T_SYSTEM_PARAM  (
   ID                   CHAR(24)                        NOT NULL,
   SUPER_ADMIN_ID       CHAR(24)                        NOT NULL,
   OBJ_TYPE             CHAR(1)                         NOT NULL,
   PARAM_CODE           VARCHAR2(100)                   NOT NULL,
   PARAM_TYPE           VARCHAR2(100)                   NOT NULL,
   PARAM_TYPE_DATA      VARCHAR2(100),
   PARAM_NAME           VARCHAR2(100)                   NOT NULL,
   PARAM_DESC           VARCHAR2(500),
   USER_MODIFY          CHAR(1)                         NOT NULL,
   PARAM_VALUE          VARCHAR2(2000),
   PARAM_VALUE_DESC     VARCHAR2(500),
   PARAM_REQUIRED       CHAR(1)                        DEFAULT '0' NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   CONSTRAINT PK_T_SYSTEM_PARAM PRIMARY KEY (ID, PARAM_CODE)
);

COMMENT ON TABLE T_SYSTEM_PARAM IS
'对象参数表,存放所有系统的参数';

COMMENT ON COLUMN T_SYSTEM_PARAM.ID IS
'对象ID';

COMMENT ON COLUMN T_SYSTEM_PARAM.SUPER_ADMIN_ID IS
'超级用户标识';

COMMENT ON COLUMN T_SYSTEM_PARAM.OBJ_TYPE IS
'对象类型，由程序中枚举定义';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_CODE IS
'参数Code';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_TYPE IS
'参数类型，定义了如何在界面上维护这个参数';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_TYPE_DATA IS
'参数类型数据，如数据源类型，此处存放数据源类型的值 ';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_NAME IS
'参数名称';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_DESC IS
'参数描述';

COMMENT ON COLUMN T_SYSTEM_PARAM.USER_MODIFY IS
'是否允许修改';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_VALUE IS
'参数值';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_VALUE_DESC IS
'参数值描述';

COMMENT ON COLUMN T_SYSTEM_PARAM.PARAM_REQUIRED IS
'参数是否必填0不必填 1必填';

COMMENT ON COLUMN T_SYSTEM_PARAM.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_PARAM.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_PARAM.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_PARAM.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_PARAM.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_PARAM.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_PARAM.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_PARAM.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_PARAM.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_PARAM.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_PARAM.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

/*==============================================================*/
/* Table: T_SYSTEM_PRIVILEGE                                    */
/*==============================================================*/
CREATE TABLE T_SYSTEM_PRIVILEGE  (
   FUNC_PRIVILEGE       NUMBER(8,0)                     NOT NULL,
   FUNC_OPERATE         NUMBER(8,0)                     NOT NULL,
   FUNC_NAME            VARCHAR2(100),
   FUNC_PARENT          NUMBER(8,0),
   FUNC_ORDER           NUMBER(8,0),
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_PRIVILEGE PRIMARY KEY (FUNC_PRIVILEGE)
);

COMMENT ON TABLE T_SYSTEM_PRIVILEGE IS
'可用权限表
表中包含两种数据，权限分组和权限
权限分组的ID必须大于等于65000，同时父权限设为0
普通权限包含两部分，一部分是系统预定义权限，一部分是客户自定义权限
客户自定义权限值从50000开始，50000以下保留给系统预留
程序中注意，系统权限不允许添加和删除，可以调整组别和顺序，自定义权限可以添加和删除
设置权限时，父权限只做分组显示用。';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.FUNC_PRIVILEGE IS
'功能权限值';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.FUNC_OPERATE IS
'二进制位表示，目前共8个权限位，保留了8个位扩展用';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.FUNC_NAME IS
'权限名称';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.FUNC_PARENT IS
'父权限，0表示本身是权限分组';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.FUNC_ORDER IS
'权限组内排序';

COMMENT ON COLUMN T_SYSTEM_PRIVILEGE.ROW_VERSION IS
'版本';

/*==============================================================*/
/* Table: T_SYSTEM_ROLES                                        */
/*==============================================================*/
CREATE TABLE T_SYSTEM_ROLES  (
   ID                   CHAR(24)                        NOT NULL,
   NAME                 VARCHAR2(50)                    NOT NULL,
   ROLE_PRIVILEGES      VARCHAR2(1000),
   STATE                CHAR(1)                         NOT NULL,
   MEMO                 VARCHAR2(1000),
   SUPER_ADMIN_ID       CHAR(24)                        NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   DELETED              CHAR(1)                        DEFAULT '0' NOT NULL,
   CONSTRAINT PK_T_SYSTEM_ROLES PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_ROLES IS
'角色表';

COMMENT ON COLUMN T_SYSTEM_ROLES.ID IS
'角色标识';

COMMENT ON COLUMN T_SYSTEM_ROLES.NAME IS
'角色名称';

COMMENT ON COLUMN T_SYSTEM_ROLES.ROLE_PRIVILEGES IS
'角色权限';

COMMENT ON COLUMN T_SYSTEM_ROLES.STATE IS
'角色状态(1 正常 0 禁止)';

COMMENT ON COLUMN T_SYSTEM_ROLES.MEMO IS
'角色备注';

COMMENT ON COLUMN T_SYSTEM_ROLES.SUPER_ADMIN_ID IS
'相关联的超级用户ID';

COMMENT ON COLUMN T_SYSTEM_ROLES.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_ROLES.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_ROLES.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_ROLES.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_ROLES.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_ROLES.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_ROLES.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_ROLES.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_ROLES.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_ROLES.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_ROLES.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

COMMENT ON COLUMN T_SYSTEM_ROLES.DELETED IS
'是否删除 0正常1删除';

/*==============================================================*/
/* Table: T_SYSTEM_VALID_INFO                                   */
/*==============================================================*/
CREATE TABLE T_SYSTEM_VALID_INFO  (
   ID                   CHAR(24)                        NOT NULL,
   TARGET_SYSTEM        CHAR(1)                         NOT NULL,
   VALID_USER_ID        CHAR(24)                        NOT NULL,
   VALID_TYPE           CHAR(1),
   RANDOM_VALUE         VARCHAR2(50)                    NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   VALID_TIME           DATE                            NOT NULL,
   VALID_STATE          CHAR(1)                         NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CONSTRAINT PK_T_SYSTEM_VALID_INFO PRIMARY KEY (ID)
);

COMMENT ON TABLE T_SYSTEM_VALID_INFO IS
'验证信息表';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.ID IS
'PK';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.VALID_USER_ID IS
'验证的用户标识';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.VALID_TYPE IS
'验证类型 0 用户邮箱验证 1 忘记密码验证';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.RANDOM_VALUE IS
'随机字符串';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.VALID_TIME IS
'有效时间';

COMMENT ON COLUMN T_SYSTEM_VALID_INFO.VALID_STATE IS
'0 未验证 1 已验证';

/*==============================================================*/
/* Table: T_SYSTEM_WHITE_LIST                                   */
/*==============================================================*/
CREATE TABLE T_SYSTEM_WHITE_LIST  (
   SYSTEM_TYPE          CHAR(1)                         NOT NULL,
   ID_TYPE              VARCHAR2(10 BYTE)               NOT NULL,
   ID_NO                VARCHAR2(50)                    NOT NULL,
   FUNC_URL             VARCHAR2(255)                   NOT NULL,
   FUNC_CATA            CHAR(1)                        DEFAULT '0' NOT NULL,
   STATUS               CHAR(1)                         NOT NULL,
   ROW_VERSION          NUMBER(8,0)                     NOT NULL,
   CREATE_TIME          DATE                            NOT NULL,
   CREATE_ID            CHAR(24),
   CREATE_NAME          VARCHAR2(100),
   MODIFY_TIME          DATE                            NOT NULL,
   MODIFY_ID            CHAR(24),
   MODIFY_NAME          VARCHAR2(100),
   AUDIT_TIME           DATE,
   AUDIT_ID             CHAR(24),
   AUDIT_NAME           VARCHAR2(100),
   AUDIT_STATE          CHAR(1),
   CONSTRAINT PK_T_WHITE_LIST PRIMARY KEY (SYSTEM_TYPE, ID_TYPE, ID_NO, FUNC_URL)
);

COMMENT ON TABLE T_SYSTEM_WHITE_LIST IS
'系统白名单表';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.SYSTEM_TYPE IS
'产品类型由系统定义';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.ID_TYPE IS
'openid: OPENID, custno  客户编号,其它表示证件类型';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.ID_NO IS
'白名单号码';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.FUNC_URL IS
'功能URL,代表一个白名单功能';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.FUNC_CATA IS
'功能分类 0 个人 1企业';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.STATUS IS
'白名单状态，0 关闭 1 激活';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.ROW_VERSION IS
'版本';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.CREATE_TIME IS
'创建时间';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.CREATE_ID IS
'创建人ID';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.CREATE_NAME IS
'创建人登录名称';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.MODIFY_TIME IS
'修改时间';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.MODIFY_ID IS
'修改人ID';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.MODIFY_NAME IS
'修改人登录名称';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.AUDIT_TIME IS
'审核时间';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.AUDIT_ID IS
'审核人ID';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.AUDIT_NAME IS
'审核人名称';

COMMENT ON COLUMN T_SYSTEM_WHITE_LIST.AUDIT_STATE IS
'审核状态0未审核 1审核通过2审核不通过';

