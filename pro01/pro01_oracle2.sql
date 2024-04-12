select * from notice;

select * from (select * from notice order by no desc) where rownum<=5;

insert into notice values (nseq.nextval, '더미 제목1', '더미 내용1', sysdate, 0);
insert into notice values (nseq.nextval, '더미 제목2', '더미 내용2', sysdate, default);

select * from member;

insert into member values ('admin','1234','관리자','admin@gasan.org','010-1234-5678');
insert into member values ('jdj','ac89','정도준','jdjac@naver.com','010-7979-1004');

select * from traffic;

alter table traffic add uri varchar2(150);

commit;

