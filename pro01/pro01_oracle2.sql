select * from notice;



insert into notice values (nseq.nextval, '더미 제목1', '더미 내용1', sysdate, 0);
insert into notice values (nseq.nextval, '더미 제목2', '더미 내용2', sysdate, default);

select * from member;

insert into member values ('admin','1234','관리자','admin@gasan.org','010-1234-5678');
insert into member values ('jdj','ac89','정도준','jdjac@naver.com','010-7979-1004');
commit;
