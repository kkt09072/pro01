select * from member;

desc member;

alter table member add addr varchar2(300);
alter table member add postcode varchar2(8);

update member set pw='aT6A1AdNwSnK7xth99hDs2U8Y9FkW1tFsBTkw/Pk1V4NiLu4JlS10FsfFSbmoQVS1mamzg==' where id='admin';
update member set pw='iRmU79jjRDPRis+8MEhRrX58cdG96KcOfkLQffdadSSuD+Gg6o5uzM3U4XPrM2eZmxIK7w==' where id='jdj';
update member set pw='iIdjPSLcuxSwuRQRFG5sol6COnvnEIBDh8VhCslFZe22m++a5nuu2Q77oP7SarnnoZW3VA==' where id='kkt';

desc data;

select * from data;



commit;