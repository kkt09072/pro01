package org.gasan.dao;

public interface SqlLang {
	String SELECT_ALL_MEMBER = "select * from member order by id";
	String SELECT_MEMBER_BYID = "select * from member where id=?";
	String SELECT_ALL_NOTICE = "select * from notice order by resdate desc";
	String SELECT_NOTICE_BYNO = "select * from notice where no=?";
}