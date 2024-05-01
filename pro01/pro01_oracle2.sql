select * from notice;

select * from (select * from notice order by no desc) where rownum<=5;

insert into notice values (nseq.nextval, '더미 제목1', '더미 내용1', sysdate, 0);
insert into notice values (nseq.nextval, '더미 제목2', '더미 내용2', sysdate, default);

select * from member;

insert into member values ('admin','1234','관리자','admin@gasan.org','010-1234-5678');
insert into member values ('jdj','ac89','정도준','jdjac@naver.com','010-7979-1004');

update member set addr='가산동 $ 287', postcode='12-345' where id='admin'; -- 12345
update member set addr='구로동 $ 381', postcode='45-678' where id='jdj'; -- ac89
update member set addr='을지로 47 $ 을지IT빌딩 204호', postcode='36-124' where id='kkt'; -- 4321

select * from traffic;

alter table traffic add uri varchar2(150);

commit;

update qna set title='질문2', content='질문2의 내용' where no=3;
select * from qna;

-- plevel -> 1:질문, 2:답변
-- parno -> 질문(부모)글번호, 질문:자기자신번호, 답변:질문에 대한 글번호

-- 최근 질문 및 답변 목록 출력
select * from (select * from qna order by parno desc, plevel asc) where rownum<=5;

-- 질문 및 답변의 목록 출력 : 질문(부모)글번호인 parno의 내림차순으로 하고, 
-- 같은 경우은 질문부터 출력될 수 있도록 plevel의 오름차순으로 정렬하도록 한다.
select * from qna order by parno desc, plevel asc;

-- 질문 등록
insert into qna values(qseq.nextval,1,null,'질문5','질문5의 내용임',default,0,'kkt');
update qna set parno=qseq.currval 
where no = (select * from (select no from qna order by no desc) where rownum<=1);

-- 답변 등록
insert into qna values(qseq.nextval,2,5,'질문4의 답변1','질문4의 답변 내용',default,0,'admin');

-- 질문 및 답변 수정
update qna set title='', content='' where no=1;

-- 질문 및 답변 삭제
delete from qna where no=1;

commit;

select * from traffic;

desc traffic;

alter table traffic modify route varchar2(1000);

-- 교통편 등록
insert into traffic values (tseq.nextval, '버스', '금천03', '가산디지털단지역 - 마리오아울렛 - 제일모직아울렛 - 구립가산도서관.두산위브아파트 - 가산동주민센터.금천글로벌센터 - 독산고개 - 구로디지털단지역', '서울특별시 금천구 마을버스로 대상운수에서 운행하는 마을버스 노선으로 왕복 운행거리는 7.2km이다. 1980년에 배치된 노선으로 현재까지 그 경로가 바뀐 적이 없는 귀한 노선이다.', 'https://map.naver.com/p/bus/bus-route/%EA%B8%88%EC%B2%9C03/bus-route/1528?c=15.00,0,0,0,dh');
insert into traffic values (tseq.nextval, '버스', '21', '광명돔경륜장 - 광명6동삼거리 - 현진월드아파트 - 헵시바LPG충전소 - 광명사거리역.광명전통시장 - 광명시청.광명시민회관 - 광덕초등학교[단독] - 도덕파크타운[단독] - 광명경찰서 - 디지털3단지사거리 - 가산디지털단지역 - 디지털운동장 - 디지털3단지사거리', '경기도 광명시 시내버스로 화영운수에서 운행하는 시내버스 노선으로 왕복 운행거리는 15.4km이다.', 'https://map.naver.com/p/bus/bus-route/-/bus-route/12506?c=14.00,0,0,0,dh');

-- 교통편 검색
select * from traffic order by ttype desc, no asc;

-- 교통편 수정
update traffic set route='', coment='' where tno=1;

-- 교통편 삭제
delete from traffic where tno=1;

commit;

select * from guide;

-- 장소 검색
select * from guide where pcode=1;

-- 장소 등록
insert into guide values (gseq.nextval, '','','','','','');
insert into guide values (gseq.nextval, 'BYC하이시티','01','서울특별시 금천구 가산동 가산디지털1로 131','1544-7871','37.4769693,126.8824741','디지털로의 대로변에 위치한 빌딩입니다.');
insert into guide values (gseq.nextval, 'G밸리산업협회','02','서울특별시 금천구 디지털로9길 32 B동 1406호(가산동, 갑을그레이트밸리)','02-867-2100','37.4794491,126.8875147','남부순환로의 금천경찰서 가산치안센터의 뒷 건물에 위치한 협회입니다.');
insert into guide values (gseq.nextval, '중화요리 연','03','서울특별시 금천구 가산디지털1로 225, 에이스 가산 포휴 1층 116호 (가산동)','전화번호 없음','37.4851258,126.8787374','가산디지털1로의 에이스가산포휴 빌딩에 위치한 중국요리 맛집입니다.');
insert into guide values (gseq.nextval, '더스테이 호텔','04','서울특별시 금천구 가산동 139-25','010-3137-1810','37.4792982,126.8886446','깨끗한 숙박시설');

-- 장소 수정
update guide set pname='', paddr='', ptel='', pgps='', pcoment='' where pcode=1;

-- 장소 삭제
delete from guide where pcode=1;

-- ptype : 01-주요 빌딩, 02-주요 협회 단체, 03-맛집안내, 04-숙박시설, 05-교육시설, 06-공원 및 스포츠 시설, 07-상업시설, 08-기타시설 