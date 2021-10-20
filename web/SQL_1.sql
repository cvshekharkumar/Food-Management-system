create table CourseMaster (id integer auto_increment,Nam varchar(20) not null ,
DURATION varchar(20),fees integer  ,TECHNOLOGY varchar(20),primary key(id));
insert into CourseMaster(Nam,DURATION,TECHNOLOGY,fees) values ('chankya','paneer masala','Veg',100);
insert into CourseMaster(Nam,DURATION,TECHNOLOGY,fees) values ('royal','chokobar','Non veg',200);
insert into CourseMaster(Nam,DURATION,TECHNOLOGY,fees) values ('testy','tanduri','Veg',250);
select * from CourseMaster;