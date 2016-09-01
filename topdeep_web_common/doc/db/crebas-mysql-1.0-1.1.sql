-- Add/modify columns 
alter table T_SYSTEM_WHITE_LIST add id char(24);
-- Add comments to the columns 
comment on column T_SYSTEM_WHITE_LIST.id
  is '主键';
alter table T_SYSTEM_WHITE_LIST
   drop primary key;
alter table T_SYSTEM_WHITE_LIST
ADD PRIMARY KEY id;
