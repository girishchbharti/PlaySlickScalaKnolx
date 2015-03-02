# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table "knol" ("name" VARCHAR(254) NOT NULL,"email" VARCHAR(254) NOT NULL,"m_no" VARCHAR(254) NOT NULL,"id" SERIAL PRIMARY KEY);
create table "knoluser" ("name" VARCHAR(254) NOT NULL,"address" VARCHAR(254) NOT NULL,"company" VARCHAR(254) NOT NULL,"email" VARCHAR(254) NOT NULL,"password" VARCHAR(254) NOT NULL,"phone" VARCHAR(254) NOT NULL,"userType" INTEGER NOT NULL,"created" DATE NOT NULL,"updated" DATE NOT NULL,"id" SERIAL PRIMARY KEY);
create table "session" ("topic" VARCHAR(254) NOT NULL,"sdate" DATE NOT NULL,"knolid" INTEGER NOT NULL,"id" SERIAL PRIMARY KEY);
alter table "session" add constraint "knol_id_fk" foreign key("knolid") references "knol"("id") on update NO ACTION on delete NO ACTION;

# --- !Downs

alter table "session" drop constraint "knol_id_fk";
drop table "session";
drop table "knoluser";
drop table "knol";

