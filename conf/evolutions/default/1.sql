

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table employee (
  emp_id                        bigint auto_increment not null,
  emp_name                      varchar(255),
  address                       varchar(255),
  department                    varchar(255),
  category_id                   bigint,
  constraint pk_employee primary key (emp_id)
);

create table project (
  proj_id                       bigint auto_increment not null,
  category_id                   bigint,
  name                          varchar(255),
  description                   varchar(255),
  supervisor                    varchar(255),
  price                         double not null,
  constraint pk_project primary key (proj_id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table employee add constraint fk_employee_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_employee_category_id on employee (category_id);

alter table project add constraint fk_project_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_project_category_id on project (category_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_category_id;
drop index if exists ix_employee_category_id;

alter table project drop constraint if exists fk_project_category_id;
drop index if exists ix_project_category_id;

drop table if exists category;

drop table if exists employee;

drop table if exists project;

drop table if exists user;

