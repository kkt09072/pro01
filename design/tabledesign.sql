drop table traffic;

create table traffic(tno int primary key,
ttype varchar(20) not null,
no varchar(10) not null,
route varchar(50),
coment varchar(1000));

create sequence tseq start with 1 increment by 1;

create table guide(pcode int primary key,
pname varchar(100) not null,
ptype varchar(3) not null,
paddr varchar(200) not null,
ptel varchar(20),
pgps varchar(50),
pcoment varchar(2000));

create sequence gseq start with 1 increment by 1;

create table notice(no int primary key,
title varchar(200), content varchar(2000),
resdate timestamp default sysdate,
visited int default 0);

create sequence nseq start with 1 increment by 1;

create table data(no int primary key,
title varchar(200), content varchar(2000),
datafile varchar(200),
resdate timestamp default sysdate,
visited int default 0);

create sequence dseq start with 1 increment by 1;

drop table member;

create table member(id varchar(20) primary key,
pw varchar(300) not null,
name varchar(50) not null,
email varchar(200) not null,
tel varchar(20));

create table qna(no int primary key,
plevel int not null, parno int,
title varchar(200), content varchar(2000),
resdate timestamp default sysdate,
visited int default 0,
aid varchar(20),
foreign key (aid) references member(id));

create sequence qseq start with 1 increment by 1;


