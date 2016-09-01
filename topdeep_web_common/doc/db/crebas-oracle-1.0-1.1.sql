-- Add/modify columns 
alter table T_SYSTEM_WHITE_LIST add id CHAR(24);
-- Add comments to the columns 
comment on column T_SYSTEM_WHITE_LIST.id
  is '主键';
-- Create/Recreate primary, unique and foreign key constraints 
alter table T_SYSTEM_WHITE_LIST
  drop constraint PK_T_WHITE_LIST cascade;
alter table T_SYSTEM_WHITE_LIST
  add constraint PK_T_WHITE_LIST primary key (ID);
